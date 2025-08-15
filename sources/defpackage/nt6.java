package defpackage;

import android.util.Size;

/* renamed from: nt6  reason: default package */
public final class nt6 {
    public static final st6 a;

    /* JADX WARNING: type inference failed for: r3v0, types: [lic, java.lang.Object] */
    static {
        Size size = new Size(640, 480);
        eu4 eu4 = eu4.d;
        fm5 fm5 = fm5.c;
        Size size2 = msd.c;
        ? obj = new Object();
        obj.a = size2;
        obj.b = 1;
        kic kic = new kic(fm5, obj, 0);
        mt6 mt6 = new mt6(0);
        aa0 aa0 = ev6.G;
        mi9 mi9 = mt6.b;
        mi9.j(aa0, size);
        mi9.j(o9f.k0, 1);
        mi9.j(ev6.B, 0);
        mi9.j(ev6.J, kic);
        if (eu4.equals(eu4)) {
            mi9.j(tu6.A, eu4);
            a = new st6(wma.a(mi9));
            return;
        }
        throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
    }
}
