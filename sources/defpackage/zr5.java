package defpackage;

import java.util.Objects;

/* renamed from: zr5  reason: default package */
public final class zr5 extends wq5 {
    public final Object b;
    public final b66 c;

    public zr5(Object obj, dme dme) {
        this.b = obj;
        this.c = dme;
    }

    public final void g(vae vae) {
        try {
            Object apply = this.c.apply(this.b);
            Objects.requireNonNull(apply, "The mapper returned a null Publisher");
            ypb ypb = (ypb) apply;
            if (ypb instanceof kde) {
                try {
                    Object obj = ((kde) ypb).get();
                    if (obj == null) {
                        b05.a(vae);
                    } else {
                        vae.f(new lsc(vae, obj));
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
    }
}
