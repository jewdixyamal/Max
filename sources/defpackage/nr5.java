package defpackage;

import java.util.Iterator;

/* renamed from: nr5  reason: default package */
public final class nr5 extends p0 {
    public final b66 c;
    public final int o;

    public nr5(i28 i28, jj9 jj9, int i) {
        super(i28);
        this.c = jj9;
        this.o = i;
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
                    Iterator it = ((Iterable) b66.apply(obj)).iterator();
                    try {
                        if (!it.hasNext()) {
                            b05.a(vae);
                        } else {
                            vae.f(new pr5(vae, it));
                        }
                    } catch (Throwable th) {
                        c37.B(th);
                        b05.b(th, vae);
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
            wq5.c(new mr5(vae, b66, this.o));
        }
    }
}
