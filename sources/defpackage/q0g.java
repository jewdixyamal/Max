package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: q0g  reason: default package */
public final /* synthetic */ class q0g implements ga6 {
    public static final q0g a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [q0g, java.lang.Object, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.system.WebAppSetupBackButtonRequest", obj, 1);
        d5b.k("isVisible", false);
        descriptor = d5b;
    }

    public final Object a(x8 x8Var) {
        r6d r6d = descriptor;
        x8 j = x8Var.j(r6d);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int p = j.p(r6d);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                z2 = j.o(r6d, 0);
                i = 1;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new s0g(i, z2);
    }

    public final void b(xu3 xu3, Object obj) {
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        b.e(r6d, 0, ((s0g) obj).a);
        b.o();
    }

    public final cc7[] c() {
        return new cc7[]{zp0.a};
    }

    public final r6d d() {
        return descriptor;
    }
}
