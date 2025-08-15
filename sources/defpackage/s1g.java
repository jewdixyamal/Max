package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: s1g  reason: default package */
public final /* synthetic */ class s1g implements ga6 {
    public static final s1g a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [s1g, java.lang.Object, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageGetKeyResponse", obj, 3);
        d5b.k("requestId", false);
        d5b.k("key", false);
        d5b.k("value", false);
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
                str = j.w(r6d, 0);
                i |= 1;
            } else if (p == 1) {
                str2 = j.w(r6d, 1);
                i |= 2;
            } else if (p == 2) {
                str3 = j.w(r6d, 2);
                i |= 4;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new u1g(str, i, str2, str3);
    }

    public final void b(xu3 xu3, Object obj) {
        u1g u1g = (u1g) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        b.n(r6d, 0, u1g.a);
        b.n(r6d, 1, u1g.b);
        b.n(r6d, 2, u1g.c);
        b.o();
    }

    public final cc7[] c() {
        s9e s9e = s9e.a;
        return new cc7[]{s9e, s9e, s9e};
    }

    public final r6d d() {
        return descriptor;
    }
}
