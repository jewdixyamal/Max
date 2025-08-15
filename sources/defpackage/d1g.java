package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: d1g  reason: default package */
public final /* synthetic */ class d1g implements ga6 {
    public static final d1g a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, d1g, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.WebAppShareRequest", obj, 3);
        d5b.k("url", true);
        d5b.k("title", true);
        d5b.k("text", true);
        descriptor = d5b;
    }

    public final Object a(x8 x8Var) {
        r6d r6d = descriptor;
        x8 j = x8Var.j(r6d);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int p = j.p(r6d);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                s9e s9e = s9e.a;
                str = (String) j.s(r6d, 0, str);
                i |= 1;
            } else if (p == 1) {
                s9e s9e2 = s9e.a;
                str2 = (String) j.s(r6d, 1, str2);
                i |= 2;
            } else if (p == 2) {
                s9e s9e3 = s9e.a;
                str3 = (String) j.s(r6d, 2, str3);
                i |= 4;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new f1g(str, i, str2, str3);
    }

    public final void b(xu3 xu3, Object obj) {
        f1g f1g = (f1g) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        boolean w = b.w();
        String str = f1g.a;
        if (w || str != null) {
            s9e s9e = s9e.a;
            b.i(r6d, 0, str);
        }
        boolean w2 = b.w();
        String str2 = f1g.b;
        if (w2 || str2 != null) {
            s9e s9e2 = s9e.a;
            b.i(r6d, 1, str2);
        }
        boolean w3 = b.w();
        String str3 = f1g.c;
        if (w3 || str3 != null) {
            s9e s9e3 = s9e.a;
            b.i(r6d, 2, str3);
        }
        b.o();
    }

    public final cc7[] c() {
        s9e s9e = s9e.a;
        return new cc7[]{br7.C(), br7.C(), br7.C()};
    }

    public final r6d d() {
        return descriptor;
    }
}
