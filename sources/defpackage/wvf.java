package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: wvf  reason: default package */
public final /* synthetic */ class wvf implements ga6 {
    public static final wvf a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [wvf, java.lang.Object, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryOpenSettingsRequest", obj, 2);
        d5b.k("queryId", false);
        d5b.k("requestId", false);
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
                s9e s9e = s9e.a;
                str = (String) j.s(r6d, 0, str);
                i |= 1;
            } else if (p == 1) {
                str2 = j.w(r6d, 1);
                i |= 2;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new yvf(i, str, str2);
    }

    public final void b(xu3 xu3, Object obj) {
        yvf yvf = (yvf) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        s9e s9e = s9e.a;
        b.i(r6d, 0, yvf.a);
        b.n(r6d, 1, yvf.b);
        b.o();
    }

    public final cc7[] c() {
        return new cc7[]{br7.C(), s9e.a};
    }

    public final r6d d() {
        return descriptor;
    }
}
