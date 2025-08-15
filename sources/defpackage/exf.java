package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: exf  reason: default package */
public final /* synthetic */ class exf implements ga6 {
    public static final exf a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [exf, java.lang.Object, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.download.WebAppDownloadFileRequest", obj, 3);
        d5b.k("requestId", false);
        d5b.k("url", false);
        d5b.k("file_name", false);
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
        return new gxf(str, i, str2, str3);
    }

    public final void b(xu3 xu3, Object obj) {
        gxf gxf = (gxf) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        b.n(r6d, 0, gxf.a);
        b.n(r6d, 1, gxf.b);
        b.n(r6d, 2, gxf.c);
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
