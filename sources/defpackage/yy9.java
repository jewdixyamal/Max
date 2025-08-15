package defpackage;

import java.util.Objects;

/* renamed from: yy9  reason: default package */
public final class yy9 extends iqd implements x66 {
    public final r1a a;
    public final kde b;
    public final ol0 c;

    public yy9(q28 q28, t66 t66, m2e m2e) {
        this.a = q28;
        this.b = t66;
        this.c = m2e;
    }

    public final qy9 d() {
        return new xy9(this.a, this.b, this.c, 0);
    }

    public final void l(erd erd) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.a(new wy9(erd, obj, this.c, 1));
        } catch (Throwable th) {
            c37.B(th);
            iz4.c(th, erd);
        }
    }
}
