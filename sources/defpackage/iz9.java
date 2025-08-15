package defpackage;

import java.util.Objects;

/* renamed from: iz9  reason: default package */
public final class iz9 extends qy9 {
    public final /* synthetic */ int a;
    public final kde b;

    public /* synthetic */ iz9(kde kde, int i) {
        this.a = i;
        this.b = kde;
    }

    public final void q(f2a f2a) {
        kde kde = this.b;
        switch (this.a) {
            case 0:
                try {
                    Object obj = kde.get();
                    Objects.requireNonNull(obj, "The supplier returned a null ObservableSource");
                    ((r1a) obj).a(f2a);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.b(th, f2a);
                    return;
                }
            default:
                try {
                    Object obj2 = kde.get();
                    if (obj2 != null) {
                        p45 p45 = q45.a;
                        th = (Throwable) obj2;
                        iz4.b(th, f2a);
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
