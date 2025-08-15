package defpackage;

import java.util.Objects;

/* renamed from: oqd  reason: default package */
public final class oqd extends iqd {
    public final /* synthetic */ int a;
    public final kde b;

    public /* synthetic */ oqd(kde kde, int i) {
        this.a = i;
        this.b = kde;
    }

    public final void l(erd erd) {
        kde kde = this.b;
        switch (this.a) {
            case 0:
                try {
                    Object obj = kde.get();
                    Objects.requireNonNull(obj, "The singleSupplier returned a null SingleSource");
                    ((iqd) obj).k(erd);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.c(th, erd);
                    return;
                }
            default:
                try {
                    Object obj2 = kde.get();
                    if (obj2 != null) {
                        p45 p45 = q45.a;
                        th = (Throwable) obj2;
                        iz4.c(th, erd);
                        return;
                    }
                    throw q45.b("Supplier returned a null Throwable.");
                } catch (Throwable th2) {
                    th = th2;
                    c37.B(th);
                }
        }
    }
}
