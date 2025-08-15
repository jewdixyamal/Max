package defpackage;

import java.util.Objects;

/* renamed from: jr5  reason: default package */
public final class jr5 extends p0 {
    public final int X;
    public final int Y;
    public final b66 c;
    public final boolean o = false;

    public jr5(wq5 wq5, dme dme, int i, int i2) {
        super(wq5);
        this.c = dme;
        this.X = i;
        this.Y = i2;
    }

    public final void g(vae vae) {
        wq5 wq5 = this.b;
        boolean z = wq5 instanceof kde;
        b66 b66 = this.c;
        if (z) {
            try {
                Object obj = ((kde) wq5).get();
                if (obj == null) {
                    b05.a(vae);
                    return;
                }
                try {
                    Object apply = b66.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                    ypb ypb = (ypb) apply;
                    if (ypb instanceof kde) {
                        try {
                            Object obj2 = ((kde) ypb).get();
                            if (obj2 == null) {
                                b05.a(vae);
                            } else {
                                vae.f(new lsc(vae, obj2));
                            }
                        } catch (Throwable th) {
                            c37.B(th);
                            b05.b(th, vae);
                        }
                    } else {
                        ((wq5) ypb).d(vae);
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    b05.b(th2, vae);
                }
            } catch (Throwable th3) {
                c37.B(th3);
                b05.b(th3, vae);
            }
        } else {
            wq5.c(new ir5(vae, b66, this.o, this.X, this.Y));
        }
    }
}
