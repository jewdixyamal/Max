package defpackage;

import java.util.Objects;

/* renamed from: ar5  reason: default package */
public final class ar5 extends iqd implements w66 {
    public final wq5 a;
    public final kde b;
    public final ol0 c;

    public ar5(wq5 wq5, t66 t66, ol0 ol0) {
        this.a = wq5;
        this.b = t66;
        this.c = ol0;
    }

    public final wq5 b() {
        return new yq5(this.a, this.b, this.c, 0);
    }

    public final void l(erd erd) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.c(new zq5(erd, obj, this.c));
        } catch (Throwable th) {
            c37.B(th);
            iz4.c(th, erd);
        }
    }
}
