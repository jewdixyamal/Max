package defpackage;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: gf  reason: default package */
public abstract class gf extends g1e {
    public final int j;
    public int k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gf(View view, x27 x27, int i, m56 m56, int i2) {
        super(view, x27, (i2 & 16) != 0 ? null : m56, 7);
        this.j = 8;
        this.k = -1;
        zmf.l(view, new ff(i, this));
    }

    public static final x6g f(gf gfVar, x6g x6g) {
        if (gfVar.f == 0) {
            return x6g;
        }
        v27 f = x6g.a.f(7);
        if (f.d > gfVar.f) {
            return x6g;
        }
        m6g n6g = Build.VERSION.SDK_INT >= 30 ? new n6g(x6g) : new m6g(x6g);
        n6g.c(7, v27.b(f.a, f.b, f.c, gfVar.f));
        return n6g.b();
    }

    public final void b(x6g x6g, yq0 yq0) {
        v6g v6g = x6g.a;
        v27 f = v6g.f(this.d);
        int i = this.j;
        v27 f2 = v6g.f(i);
        if (v6g.o(i)) {
            f = f2;
        }
        a(f, yq0);
    }

    public final void c(x6g x6g) {
        if (this.k != -1) {
            m6g n6g = Build.VERSION.SDK_INT >= 30 ? new n6g(x6g) : new m6g(x6g);
            n6g.c(8, v27.e);
            n6g.h(8, false);
            x6g = n6g.b();
        }
        super.c(x6g);
    }

    public final x6g d(x6g x6g) {
        return x6g;
    }

    public final void e() {
        this.g = false;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = zmf.a;
            mmf.c(view);
            return;
        }
        view.addOnAttachStateChangeListener(new ef(view, 0));
    }

    public void g(x6g x6g, l7b l7b) {
    }

    public abstract x6g h(x6g x6g);

    public abstract void i();

    public void j() {
    }
}
