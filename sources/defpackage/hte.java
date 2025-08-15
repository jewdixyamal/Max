package defpackage;

import android.util.Pair;

/* renamed from: hte  reason: default package */
public final class hte extends rg4 {
    public final /* synthetic */ ite c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hte(ite ite, fi0 fi0) {
        super(fi0);
        this.c = ite;
    }

    public final void d() {
        this.b.c();
        m();
    }

    public final void f(Throwable th) {
        this.b.e(th);
        m();
    }

    public final void h(int i, Object obj) {
        this.b.g(i, obj);
        if (fi0.a(i)) {
            m();
        }
    }

    public final void m() {
        Pair pair;
        synchronized (this.c) {
            try {
                pair = (Pair) this.c.c.poll();
                if (pair == null) {
                    ite ite = this.c;
                    ite.b--;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (pair != null) {
            this.c.d.execute(new h76((Object) this, (Object) pair, false, 27));
        }
    }
}
