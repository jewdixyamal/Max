package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: yr5  reason: default package */
public final class yr5 extends p0 {
    public final /* synthetic */ int c;
    public final Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr5(wq5 wq5, Object obj, int i) {
        super(wq5);
        this.c = i;
        this.o = obj;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [dg4, gs5] */
    public final void g(vae vae) {
        wq5 wq5 = this.b;
        Object obj = this.o;
        switch (this.c) {
            case 0:
                c7d c7d = new c7d(vae);
                hm9.j0(8, "capacityHint");
                z6d z6d = new z6d(new c5f());
                try {
                    Object apply = ((b66) obj).apply(z6d);
                    Objects.requireNonNull(apply, "handler returned a null Publisher");
                    ypb ypb = (ypb) apply;
                    wr5 wr5 = new wr5(wq5);
                    xr5 xr5 = new xr5(c7d, z6d, wr5);
                    wr5.o = xr5;
                    vae.f(xr5);
                    ((wq5) ypb).d(wr5);
                    wr5.e(0);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    b05.b(th, vae);
                    return;
                }
            default:
                try {
                    Object obj2 = ((kde) obj).get();
                    if (obj2 != null) {
                        p45 p45 = q45.a;
                        Collection collection = (Collection) obj2;
                        ? dg4 = new dg4(vae);
                        dg4.b = collection;
                        wq5.c(dg4);
                        return;
                    }
                    throw q45.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th2) {
                    c37.B(th2);
                    b05.b(th2, vae);
                    return;
                }
        }
    }
}
