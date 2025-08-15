package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: xy9  reason: default package */
public final class xy9 extends w2 {
    public final /* synthetic */ int b;
    public final Object c;
    public final Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy9(r1a r1a, Object obj, Object obj2, int i) {
        super(r1a);
        this.b = i;
        this.c = obj;
        this.o = obj2;
    }

    public final void q(f2a f2a) {
        r1a r1a = this.a;
        Object obj = this.o;
        Object obj2 = this.c;
        switch (this.b) {
            case 0:
                try {
                    Object obj3 = ((kde) obj2).get();
                    Objects.requireNonNull(obj3, "The initialSupplier returned a null value");
                    r1a.a(new wy9(f2a, obj3, (ol0) obj, 0));
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.b(th, f2a);
                    return;
                }
            case 1:
                try {
                    Object obj4 = ((kde) obj2).get();
                    if (obj4 != null) {
                        p45 p45 = q45.a;
                        r1a.a(new kz9(f2a, (b66) obj, (Collection) obj4));
                        return;
                    }
                    throw q45.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th2) {
                    c37.B(th2);
                    iz4.b(th2, f2a);
                    return;
                }
            default:
                r1a.a(new em4(f2a, (qj3) obj2, (f6) obj));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xy9(r1a r1a, b66 b66) {
        super(r1a);
        this.b = 1;
        s66 s66 = s66.a;
        this.o = b66;
        this.c = s66;
    }
}
