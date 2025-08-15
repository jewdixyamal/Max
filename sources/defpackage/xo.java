package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: xo  reason: default package */
public final class xo extends nd7 {
    public final /* synthetic */ int k;

    public /* synthetic */ xo(int i) {
        this.k = i;
    }

    public static d45 X(wpa wpa) {
        String p = wpa.p();
        p.getClass();
        String p2 = wpa.p();
        p2.getClass();
        return new d45(p, p2, wpa.o(), wpa.o(), Arrays.copyOfRange(wpa.a, wpa.b, wpa.c));
    }

    public final f99 n(k99 k99, ByteBuffer byteBuffer) {
        int i = 2;
        switch (this.k) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                s02 s02 = new s02(byteBuffer.array(), byteBuffer.limit(), 2, (byte) 0);
                int i2 = 12;
                s02.t(12);
                int f = (s02.f() + s02.i(12)) - 4;
                s02.t(44);
                s02.u(s02.i(12));
                s02.t(16);
                ArrayList arrayList = new ArrayList();
                while (s02.f() < f) {
                    s02.t(48);
                    int i3 = s02.i(8);
                    s02.t(4);
                    int f2 = s02.f() + s02.i(i2);
                    String str = null;
                    String str2 = null;
                    while (s02.f() < f2) {
                        int i4 = s02.i(8);
                        int i5 = s02.i(8);
                        int f3 = s02.f() + i5;
                        if (i4 == i) {
                            int i6 = s02.i(16);
                            s02.t(8);
                            if (i6 == 3) {
                                while (s02.f() < f3) {
                                    int i7 = s02.i(8);
                                    Charset charset = b52.a;
                                    byte[] bArr = new byte[i7];
                                    s02.l(i7, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i8 = s02.i(8);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        s02.u(s02.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i4 == 21) {
                            Charset charset2 = b52.a;
                            byte[] bArr2 = new byte[i5];
                            s02.l(i5, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        s02.q(f3 * 8);
                        i = 2;
                    }
                    s02.q(f2 * 8);
                    if (!(str == null || str2 == null)) {
                        arrayList.add(new vo(i3, str.concat(str2)));
                    }
                    i = 2;
                    i2 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new f99((List) arrayList);
            default:
                return new f99(X(new wpa(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
