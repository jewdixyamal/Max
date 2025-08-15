package defpackage;

import java.util.concurrent.Callable;

/* renamed from: t28  reason: default package */
public final class t28 extends f28 implements kde {
    public final Callable a;

    public t28(Callable callable) {
        this.a = callable;
    }

    public final void g(b38 b38) {
        w6 w6Var = new w6(1, ft.c);
        b38.c(w6Var);
        if (!w6Var.h()) {
            try {
                Object call = this.a.call();
                if (w6Var.h()) {
                    return;
                }
                if (call == null) {
                    b38.b();
                } else {
                    b38.a(call);
                }
            } catch (Throwable th) {
                c37.B(th);
                if (!w6Var.h()) {
                    b38.onError(th);
                } else {
                    j47.Z(th);
                }
            }
        }
    }

    public final Object get() {
        return this.a.call();
    }
}
