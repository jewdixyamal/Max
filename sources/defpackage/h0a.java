package defpackage;

import java.util.concurrent.Callable;

/* renamed from: h0a  reason: default package */
public final class h0a extends qy9 implements kde {
    public final Callable a;

    public h0a(l5 l5Var) {
        this.a = l5Var;
    }

    public final Object get() {
        Object call = this.a.call();
        if (call != null) {
            p45 p45 = q45.a;
            return call;
        }
        throw q45.b("The Callable returned a null value.");
    }

    public final void q(f2a f2a) {
        cg4 cg4 = new cg4(f2a);
        f2a.c(cg4);
        if (!cg4.h()) {
            try {
                Object call = this.a.call();
                if (call != null) {
                    p45 p45 = q45.a;
                    cg4.f(call);
                    return;
                }
                throw q45.b("Callable returned a null value.");
            } catch (Throwable th) {
                c37.B(th);
                if (!cg4.h()) {
                    f2a.onError(th);
                } else {
                    j47.Z(th);
                }
            }
        }
    }
}
