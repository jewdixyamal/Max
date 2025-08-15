package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: yq5  reason: default package */
public final class yq5 extends p0 {
    public final Object X;
    public final /* synthetic */ int c;
    public final kde o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yq5(wq5 wq5, kde kde, Object obj, int i) {
        super(wq5);
        this.c = i;
        this.o = kde;
        this.X = obj;
    }

    public final void g(vae vae) {
        wq5 wq5 = this.b;
        Object obj = this.X;
        kde kde = this.o;
        switch (this.c) {
            case 0:
                try {
                    Object obj2 = kde.get();
                    Objects.requireNonNull(obj2, "The initial value supplied is null");
                    wq5.c(new xq5(vae, obj2, (ol0) obj));
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    b05.b(th, vae);
                    return;
                }
            case 1:
                try {
                    Object obj3 = kde.get();
                    if (obj3 != null) {
                        p45 p45 = q45.a;
                        wq5.c(new er5(vae, (b66) obj, (Collection) obj3));
                        return;
                    }
                    throw q45.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th2) {
                    c37.B(th2);
                    b05.b(th2, vae);
                    return;
                }
            default:
                try {
                    Object obj4 = kde.get();
                    Objects.requireNonNull(obj4, "The seed supplied is null");
                    wq5.c(new as5(vae, (pl0) obj, obj4, wq5.a));
                    return;
                } catch (Throwable th3) {
                    c37.B(th3);
                    b05.b(th3, vae);
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yq5(nr5 nr5, jj9 jj9) {
        super(nr5);
        this.c = 1;
        s66 s66 = s66.a;
        this.X = jj9;
        this.o = s66;
    }
}
