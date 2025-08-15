package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: q1a  reason: default package */
public final class q1a extends iqd {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q1a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void l(erd erd) {
        switch (this.a) {
            case 0:
                ((r1a) this.b).a(new uy9(erd));
                return;
            case 1:
                nqd nqd = new nqd(erd);
                erd.c(nqd);
                try {
                    ((grd) this.b).j(nqd);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    nqd.onError(th);
                    return;
                }
            case 2:
                w6 w6Var = new w6(1, ft.c);
                erd.c(w6Var);
                if (!w6Var.h()) {
                    try {
                        Object call = ((Callable) this.b).call();
                        Objects.requireNonNull(call, "The callable returned a null value");
                        if (!w6Var.h()) {
                            erd.a(call);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        c37.B(th2);
                        if (!w6Var.h()) {
                            erd.onError(th2);
                            return;
                        } else {
                            j47.Z(th2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                erd.c(iz4.a);
                erd.a(this.b);
                return;
        }
    }
}
