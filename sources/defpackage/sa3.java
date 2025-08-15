package defpackage;

import java.util.concurrent.Callable;

/* renamed from: sa3  reason: default package */
public final class sa3 extends pa3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sa3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void j(ab3 ab3) {
        switch (this.a) {
            case 0:
                ra3 ra3 = new ra3(0, ab3);
                ab3.c(ra3);
                try {
                    ((bb3) this.b).b(ra3);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    if (!ra3.a(th)) {
                        j47.Z(th);
                        return;
                    }
                    return;
                }
            case 1:
                w6 w6Var = new w6(1, ft.c);
                ab3.c(w6Var);
                if (!w6Var.h()) {
                    try {
                        ((f6) this.b).run();
                        if (!w6Var.h()) {
                            ab3.b();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        c37.B(th2);
                        if (!w6Var.h()) {
                            ab3.onError(th2);
                            return;
                        } else {
                            j47.Z(th2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 2:
                w6 w6Var2 = new w6(1, ft.c);
                ab3.c(w6Var2);
                try {
                    ((Callable) this.b).call();
                    if (!w6Var2.h()) {
                        ab3.b();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    c37.B(th3);
                    if (!w6Var2.h()) {
                        ab3.onError(th3);
                        return;
                    } else {
                        j47.Z(th3);
                        return;
                    }
                }
            default:
                ((iqd) this.b).k(new gd1(4, ab3));
                return;
        }
    }
}
