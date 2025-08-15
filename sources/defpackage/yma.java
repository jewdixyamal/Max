package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: yma  reason: default package */
public final class yma extends a9e {
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean o;

    public static boolean g(wpa wpa, byte[] bArr) {
        if (wpa.a() < bArr.length) {
            return false;
        }
        int i = wpa.b;
        byte[] bArr2 = new byte[bArr.length];
        wpa.e(0, bArr2, bArr.length);
        wpa.G(i);
        return Arrays.equals(bArr2, bArr);
    }

    public final long b(wpa wpa) {
        byte[] bArr = wpa.a;
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return (((long) this.f) * wmd.q(b2, b)) / 1000000;
    }

    public final boolean d(wpa wpa, long j, djb djb) {
        if (g(wpa, p)) {
            byte[] copyOf = Arrays.copyOf(wpa.a, wpa.c);
            byte b = copyOf[9] & 255;
            ArrayList d = wmd.d(copyOf);
            if (((qy5) djb.b) != null) {
                return true;
            }
            ny5 ny5 = new ny5();
            ny5.m = ia9.l("audio/opus");
            ny5.A = b;
            ny5.B = 48000;
            ny5.p = d;
            djb.b = new qy5(ny5);
            return true;
        } else if (g(wpa, q)) {
            fm9.l((qy5) djb.b);
            if (this.o) {
                return true;
            }
            this.o = true;
            wpa.H(8);
            f99 B = m6d.B(zw6.k((String[]) m6d.J(wpa, false, false).a));
            if (B == null) {
                return true;
            }
            ny5 a = ((qy5) djb.b).a();
            a.j = B.b(((qy5) djb.b).k);
            djb.b = new qy5(a);
            return true;
        } else {
            fm9.l((qy5) djb.b);
            return false;
        }
    }

    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = false;
        }
    }
}
