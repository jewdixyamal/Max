package defpackage;

import java.util.Collection;

/* renamed from: js5  reason: default package */
public final class js5 extends dg4 implements gs5 {
    public xae c;

    public final void b() {
        g(this.b);
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.c.cancel();
    }

    public final void e(Object obj) {
        Collection collection = (Collection) this.b;
        if (collection != null) {
            collection.add(obj);
        }
    }

    public final void f(xae xae) {
        if (zae.e(this.c, xae)) {
            this.c = xae;
            this.a.f(this);
            xae.j(Long.MAX_VALUE);
        }
    }

    public final void onError(Throwable th) {
        this.b = null;
        this.a.onError(th);
    }
}
