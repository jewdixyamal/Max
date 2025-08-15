package defpackage;

import java.util.Collection;

/* renamed from: s1a  reason: default package */
public final class s1a extends w2 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1a(r1a r1a, Object obj, int i) {
        super(r1a);
        this.b = i;
        this.c = obj;
    }

    public final void q(f2a f2a) {
        r1a r1a = this.a;
        Object obj = this.c;
        switch (this.b) {
            case 0:
                iq1 iq1 = new iq1(f2a);
                f2a.c(iq1);
                dm4.e(iq1, ((ztc) obj).b(new i76((Object) this, (Object) iq1, false, 12)));
                return;
            case 1:
                r1a.a(new e2a(f2a, (f55) ((ztc) obj)));
                return;
            default:
                try {
                    Object obj2 = ((kde) obj).get();
                    if (obj2 != null) {
                        p45 p45 = q45.a;
                        r1a.a(new cb3(f2a, 4, (Collection) obj2));
                        return;
                    }
                    throw q45.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.b(th, f2a);
                    return;
                }
        }
    }
}
