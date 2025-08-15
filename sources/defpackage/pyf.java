package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: pyf  reason: default package */
public final /* synthetic */ class pyf implements ga6 {
    public static final pyf a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, pyf, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.phone.WebAppRequestPhoneResponse", obj, 2);
        d5b.k("requestId", false);
        d5b.k("phone", false);
        descriptor = d5b;
    }

    public final Object a(x8 x8Var) {
        r6d r6d = descriptor;
        x8 j = x8Var.j(r6d);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int p = j.p(r6d);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                str = j.w(r6d, 0);
                i |= 1;
            } else if (p == 1) {
                str2 = j.w(r6d, 1);
                i |= 2;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new ryf(i, str, str2);
    }

    public final void b(xu3 xu3, Object obj) {
        ryf ryf = (ryf) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        b.n(r6d, 0, ryf.a);
        b.n(r6d, 1, ryf.b);
        b.o();
    }

    public final cc7[] c() {
        s9e s9e = s9e.a;
        return new cc7[]{s9e, s9e};
    }

    public final r6d d() {
        return descriptor;
    }
}
