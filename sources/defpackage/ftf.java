package defpackage;

import kotlinx.serialization.UnknownFieldException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ftf  reason: default package */
public final /* synthetic */ class ftf implements ga6 {
    public static final ftf a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [ftf, java.lang.Object, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryAuthResponse", obj, 3);
        d5b.k("requestId", false);
        d5b.k(ApiProtocol.KEY_TOKEN, false);
        d5b.k("status", false);
        descriptor = d5b;
    }

    public final Object a(x8 x8Var) {
        r6d r6d = descriptor;
        x8 j = x8Var.j(r6d);
        cc7[] cc7Arr = htf.d;
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        wbe wbe = null;
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
            } else if (p == 2) {
                wbe = (wbe) j.t(r6d, 2, cc7Arr[2], wbe);
                i |= 4;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new htf(i, str, str2, wbe);
    }

    public final void b(xu3 xu3, Object obj) {
        htf htf = (htf) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        b.n(r6d, 0, htf.a);
        b.n(r6d, 1, htf.b);
        b.k(r6d, 2, htf.d[2], htf.c);
        b.o();
    }

    public final cc7[] c() {
        cc7 cc7 = htf.d[2];
        s9e s9e = s9e.a;
        return new cc7[]{s9e, s9e, cc7};
    }

    public final r6d d() {
        return descriptor;
    }
}
