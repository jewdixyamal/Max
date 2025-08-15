package defpackage;

/* renamed from: ja7  reason: default package */
public final class ja7 {
    public static final ja7 d = new ja7();
    public final la7 a;
    public final oz7 b;
    public final xh3 c = new xh3(1);

    public ja7() {
        la7 la7 = new la7();
        oz7 oz7 = ft.h;
        this.a = la7;
        this.b = oz7;
    }

    public final Object a(cc7 cc7, String str) {
        l0f l0f = !this.a.o ? new l0f(str) : new l0f(str);
        Object u = new x8(this, g9g.OBJ, l0f, cc7.d(), (sw0) null).u(cc7);
        if (l0f.l() == 10) {
            return u;
        }
        l0f.u(l0f, "Expected EOF after parsing, but had " + ((String) l0f.c).charAt(l0f.b - 1) + " instead", 0, (String) null, 6);
        throw null;
    }

    public final String b(cc7 cc7, Object obj) {
        char[] cArr;
        sh0 sh0 = new sh0(0, 9);
        p42 p42 = p42.c;
        synchronized (p42) {
            hs hsVar = (hs) p42.b;
            cArr = null;
            char[] cArr2 = (char[]) (hsVar.isEmpty() ? null : hsVar.k());
            if (cArr2 != null) {
                p42.a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        sh0.c = cArr;
        try {
            new xu3(this.a.e ? new gc3(sh0, this) : new ar0(sh0), this, g9g.OBJ, new xu3[g9g.s0.getSize()]).l(cc7, obj);
            return sh0.toString();
        } finally {
            sh0.A();
        }
    }
}
