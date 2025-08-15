package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: ctf  reason: default package */
public final /* synthetic */ class ctf implements ga6 {
    public static final ctf a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [ctf, java.lang.Object, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryAuthRequest", obj, 3);
        d5b.k("queryId", false);
        d5b.k("requestId", false);
        d5b.k("reason", false);
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
                str2 = j.w(r6d, 1);
                i |= 2;
            } else if (p == 2) {
                s9e s9e2 = s9e.a;
                str3 = (String) j.s(r6d, 2, str3);
                i |= 4;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new etf(str, i, str2, str3);
    }

    public final void b(xu3 xu3, Object obj) {
        etf etf = (etf) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        s9e s9e = s9e.a;
        b.i(r6d, 0, etf.a);
        b.n(r6d, 1, etf.b);
        b.i(r6d, 2, etf.c);
        b.o();
    }

    public final cc7[] c() {
        return new cc7[]{br7.C(), s9e.a, br7.C()};
    }

    public final r6d d() {
        return descriptor;
    }
}
