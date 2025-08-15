package defpackage;

import java.util.Collection;

/* renamed from: vy9  reason: default package */
public final class vy9 extends iqd implements x66 {
    public final /* synthetic */ int a = 1;
    public final r1a b;
    public final Object c;

    public vy9(r1a r1a) {
        this.b = r1a;
        this.c = new q66();
    }

    public final qy9 d() {
        switch (this.a) {
            case 0:
                return new ty9(this.b, (b7b) this.c, 0);
            default:
                return new s1a(this.b, (q66) this.c, 2);
        }
    }

    public final void l(erd erd) {
        r1a r1a = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                r1a.a(new uy9(erd, (b7b) obj));
                return;
            default:
                try {
                    Object obj2 = ((q66) obj).get();
                    p45 p45 = q45.a;
                    r1a.a(new cb3(erd, 5, (Collection) obj2));
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.c(th, erd);
                    return;
                }
        }
    }

    public vy9(r1a r1a, b7b b7b) {
        this.b = r1a;
        this.c = b7b;
    }
}
