package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: ayf  reason: default package */
public final /* synthetic */ class ayf implements ga6 {
    public static final ayf a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ga6, ayf] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.link.WebAppOpenLinkRequest", obj, 1);
        d5b.k("url", false);
        descriptor = d5b;
    }

    public final Object a(x8 x8Var) {
        r6d r6d = descriptor;
        x8 j = x8Var.j(r6d);
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int p = j.p(r6d);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                str = j.w(r6d, 0);
                i = 1;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(r6d);
        return new cyf(i, str);
    }

    public final void b(xu3 xu3, Object obj) {
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        b.n(r6d, 0, ((cyf) obj).a);
        b.o();
    }

    public final cc7[] c() {
        return new cc7[]{s9e.a};
    }

    public final r6d d() {
        return descriptor;
    }
}
