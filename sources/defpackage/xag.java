package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: xag  reason: default package */
public final class xag extends awc {
    public final int b;
    public final int c;
    public final int d;
    public final ByteBuffer e;

    public xag(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        wrap.get();
        this.b = wrap.getShort() & 65535;
        wrap.getInt();
        byte b2 = wrap.get();
        int[] v = au1.v(2);
        int length = v.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = v[i2];
            byte b3 = 1;
            if (i3 == 1) {
                b3 = 0;
            } else if (i3 != 2) {
                throw null;
            }
            if (b3 == b2) {
                i = i3;
                break;
            }
            i2++;
        }
        this.c = i;
        this.d = wrap.getShort() & 65535;
        this.a = wrap.get();
        this.e = wrap.slice();
    }
}
