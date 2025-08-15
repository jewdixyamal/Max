package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: tbe  reason: default package */
public final /* synthetic */ class tbe implements ga6 {
    public static final tbe a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [tbe, java.lang.Object, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.SuccessResponse", obj, 2);
        d5b.k("status", false);
        d5b.k("requestId", true);
        descriptor = d5b;
    }

    public final Object a(x8 x8Var) {
        r6d r6d = descriptor;
        x8 j = x8Var.j(r6d);
        cc7[] cc7Arr = xbe.c;
        wbe wbe = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int p = j.p(r6d);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                wbe = (wbe) j.t(r6d, 0, cc7Arr[0], wbe);
                i |= 1;
            } else if (p == 1) {
                s9e s9e = s9e.a;
                str = (String) j.s(r6d, 1, str);
                i |= 2;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new xbe(i, wbe, str);
    }

    public final void b(xu3 xu3, Object obj) {
        xbe xbe = (xbe) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        b.k(r6d, 0, xbe.c[0], xbe.a);
        boolean w = b.w();
        String str = xbe.b;
        if (w || str != null) {
            s9e s9e = s9e.a;
            b.i(r6d, 1, str);
        }
        b.o();
    }

    public final cc7[] c() {
        cc7 cc7 = xbe.c[0];
        s9e s9e = s9e.a;
        return new cc7[]{cc7, br7.C()};
    }

    public final r6d d() {
        return descriptor;
    }
}
