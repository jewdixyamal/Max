package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ks5  reason: default package */
public final class ks5 implements gs5, zl4 {
    public final erd a;
    public xae b;
    public Collection c;

    public ks5(erd erd, ArrayList arrayList) {
        this.a = erd;
        this.c = arrayList;
    }

    public final void b() {
        this.b = zae.a;
        this.a.a(this.c);
    }

    public final void e(Object obj) {
        this.c.add(obj);
    }

    public final void f(xae xae) {
        if (zae.e(this.b, xae)) {
            this.b = xae;
            this.a.c(this);
            xae.j(Long.MAX_VALUE);
        }
    }

    public final void g() {
        this.b.cancel();
        this.b = zae.a;
    }

    public final boolean h() {
        return this.b == zae.a;
    }

    public final void onError(Throwable th) {
        this.c = null;
        this.b = zae.a;
        this.a.onError(th);
    }
}
