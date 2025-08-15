package defpackage;

import java.util.Map;

/* renamed from: b47  reason: default package */
public final class b47 implements thc, hab {
    public final uhc a;
    public final hab b;
    public final uhc c;
    public final thc d;

    public b47(p06 p06, thc thc) {
        this.a = p06;
        this.b = thc;
        this.c = p06;
        this.d = thc;
    }

    public final void a(eab eab, String str, Map map) {
        uhc uhc = this.a;
        if (uhc != null) {
            uhc.i(((oj0) eab).b, str, map);
        }
        hab hab = this.b;
        if (hab != null) {
            hab.a(eab, str, map);
        }
    }

    public final void b(eab eab) {
        uhc uhc = this.a;
        if (uhc != null) {
            uhc.g(((oj0) eab).b);
        }
        hab hab = this.b;
        if (hab != null) {
            hab.b(eab);
        }
    }

    public final void c(eab eab) {
        uhc uhc = this.c;
        if (uhc != null) {
            oj0 oj0 = (oj0) eab;
            boolean g = oj0.g();
            uhc.b(oj0.a, oj0.o, oj0.b, g);
        }
        thc thc = this.d;
        if (thc != null) {
            thc.c(eab);
        }
    }

    public final void d(eab eab, String str, Throwable th, Map map) {
        uhc uhc = this.a;
        if (uhc != null) {
            uhc.j(((oj0) eab).b, str, th, map);
        }
        hab hab = this.b;
        if (hab != null) {
            hab.d(eab, str, th, map);
        }
    }

    public final void e(eab eab, String str, boolean z) {
        uhc uhc = this.a;
        if (uhc != null) {
            uhc.f(((oj0) eab).b, str, z);
        }
        hab hab = this.b;
        if (hab != null) {
            hab.e(eab, str, z);
        }
    }

    public final void f(eab eab, Throwable th) {
        uhc uhc = this.c;
        if (uhc != null) {
            oj0 oj0 = (oj0) eab;
            uhc.c(oj0.a, oj0.b, th, oj0.g());
        }
        thc thc = this.d;
        if (thc != null) {
            thc.f(eab, th);
        }
    }

    public final void g(eab eab) {
        uhc uhc = this.c;
        if (uhc != null) {
            oj0 oj0 = (oj0) eab;
            uhc.a(oj0.a, oj0.b, oj0.g());
        }
        thc thc = this.d;
        if (thc != null) {
            thc.g(eab);
        }
    }

    public final void h(eab eab) {
        uhc uhc = this.c;
        if (uhc != null) {
            uhc.k(((oj0) eab).b);
        }
        thc thc = this.d;
        if (thc != null) {
            thc.h(eab);
        }
    }

    public final boolean i(eab eab, String str) {
        Boolean bool = null;
        uhc uhc = this.a;
        Boolean valueOf = uhc != null ? Boolean.valueOf(uhc.h(((oj0) eab).b)) : null;
        if (!tpa.f(valueOf, Boolean.TRUE)) {
            hab hab = this.b;
            if (hab != null) {
                bool = Boolean.valueOf(hab.i(eab, str));
            }
            valueOf = bool;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public final void j(eab eab, String str) {
        uhc uhc = this.a;
        if (uhc != null) {
            uhc.d(((oj0) eab).b, str);
        }
        hab hab = this.b;
        if (hab != null) {
            hab.j(eab, str);
        }
    }

    public final void k(eab eab, String str) {
        uhc uhc = this.a;
        if (uhc != null) {
            uhc.e(((oj0) eab).b, str);
        }
        hab hab = this.b;
        if (hab != null) {
            hab.k(eab, str);
        }
    }
}
