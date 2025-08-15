package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: wo  reason: default package */
public final class wo extends j47 {
    public final /* synthetic */ int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo(int i) {
        super(17);
        this.w0 = i;
    }

    public static c45 u0(yaf yaf) {
        String q = yaf.q();
        q.getClass();
        String q2 = yaf.q();
        q2.getClass();
        return new c45(q, q2, yaf.p(), yaf.p(), Arrays.copyOfRange(yaf.a, yaf.b, yaf.c));
    }

    public final e99 w(j99 j99, ByteBuffer byteBuffer) {
        switch (this.w0) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                s02 s02 = new s02(byteBuffer.array(), byteBuffer.limit(), 1, (byte) 0);
                int i = 12;
                s02.t(12);
                int f = (s02.f() + s02.i(12)) - 4;
                s02.t(44);
                s02.u(s02.i(12));
                s02.t(16);
                ArrayList arrayList = new ArrayList();
                while (s02.f() < f) {
                    s02.t(48);
                    int i2 = s02.i(8);
                    s02.t(4);
                    int f2 = s02.f() + s02.i(i);
                    String str = null;
                    String str2 = null;
                    while (s02.f() < f2) {
                        int i3 = s02.i(8);
                        int i4 = s02.i(8);
                        int f3 = s02.f() + i4;
                        if (i3 == 2) {
                            int i5 = s02.i(16);
                            s02.t(8);
                            if (i5 == 3) {
                                while (s02.f() < f3) {
                                    int i6 = s02.i(8);
                                    Charset charset = b52.a;
                                    byte[] bArr = new byte[i6];
                                    s02.l(i6, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i7 = s02.i(8);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        s02.u(s02.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i3 == 21) {
                            Charset charset2 = b52.a;
                            byte[] bArr2 = new byte[i4];
                            s02.l(i4, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        s02.q(f3 * 8);
                    }
                    s02.q(f2 * 8);
                    if (!(str == null || str2 == null)) {
                        arrayList.add(new uo(i2, str2.length() != 0 ? str.concat(str2) : new String(str)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new e99((List) arrayList);
            default:
                return new e99(u0(new yaf(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
