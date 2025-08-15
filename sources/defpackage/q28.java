package defpackage;

import java.util.Objects;

/* renamed from: q28  reason: default package */
public final class q28 extends qy9 {
    public final /* synthetic */ int a;
    public final b66 b;
    public final Object c;

    public /* synthetic */ q28(Object obj, b66 b66, int i) {
        this.a = i;
        this.c = obj;
        this.b = b66;
    }

    public final void q(f2a f2a) {
        iqd iqd;
        switch (this.a) {
            case 0:
                p28 p28 = new p28(f2a, this.b, 0);
                f2a.c(p28);
                ((f38) this.c).a(p28);
                return;
            case 1:
                r1a r1a = (r1a) this.c;
                boolean z = r1a instanceof kde;
                b66 b66 = this.b;
                if (z) {
                    try {
                        Object obj = ((kde) r1a).get();
                        if (obj != null) {
                            Object apply = b66.apply(obj);
                            Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                            iqd = (iqd) apply;
                        } else {
                            iqd = null;
                        }
                        if (iqd == null) {
                            iz4.a(f2a);
                            return;
                        } else {
                            iqd.k(new i38(f2a, 1));
                            return;
                        }
                    } catch (Throwable th) {
                        c37.B(th);
                        iz4.b(th, f2a);
                        return;
                    }
                } else {
                    r1a.a(new dz9(f2a, b66));
                    return;
                }
            case 2:
                try {
                    Object apply2 = this.b.apply(this.c);
                    Objects.requireNonNull(apply2, "The mapper returned a null ObservableSource");
                    r1a r1a2 = (r1a) apply2;
                    if (r1a2 instanceof kde) {
                        try {
                            Object obj2 = ((kde) r1a2).get();
                            if (obj2 == null) {
                                iz4.a(f2a);
                                return;
                            }
                            p1a p1a = new p1a(f2a, obj2);
                            f2a.c(p1a);
                            p1a.run();
                            return;
                        } catch (Throwable th2) {
                            c37.B(th2);
                            iz4.b(th2, f2a);
                            return;
                        }
                    } else {
                        r1a2.a(f2a);
                        return;
                    }
                } catch (Throwable th3) {
                    c37.B(th3);
                    iz4.b(th3, f2a);
                    return;
                }
            default:
                p28 p282 = new p28(f2a, this.b, 1);
                f2a.c(p282);
                ((iqd) this.c).k(p282);
                return;
        }
    }
}
