package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: z25  reason: default package */
public final /* synthetic */ class z25 implements ga6 {
    public static final z25 a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, z25, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.ErrorResponse", obj, 2);
        d5b.k("requestId", false);
        d5b.k("error", false);
        descriptor = d5b;
    }

    public final Object a(x8 x8Var) {
        r6d r6d = descriptor;
        x8 j = x8Var.j(r6d);
        String str = null;
        boolean z = true;
        int i = 0;
        d35 d35 = null;
        while (z) {
            int p = j.p(r6d);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                str = j.w(r6d, 0);
                i |= 1;
            } else if (p == 1) {
                d35 = (d35) j.t(r6d, 1, b35.a, d35);
                i |= 2;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new e35(i, str, d35);
    }

    public final void b(xu3 xu3, Object obj) {
        e35 e35 = (e35) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        b.n(r6d, 0, e35.a);
        b.k(r6d, 1, b35.a, e35.b);
        b.o();
    }

    public final cc7[] c() {
        return new cc7[]{s9e.a, b35.a};
    }

    public final r6d d() {
        return descriptor;
    }
}
