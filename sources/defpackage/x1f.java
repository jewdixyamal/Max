package defpackage;

import android.view.ViewGroup;

/* renamed from: x1f  reason: default package */
public final class x1f implements v1f {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ y1f c;

    public x1f(y1f y1f, ViewGroup viewGroup, gwe gwe) {
        this.c = y1f;
        this.a = viewGroup;
        this.b = gwe;
    }

    public final void a(w1f w1f) {
        this.a.removeCallbacks(this.b);
    }

    public final void b() {
    }

    public final void c(w1f w1f) {
        y1f y1f = this.c;
        y1f.Y.q();
        y1f.Y = null;
    }

    public final void f() {
    }

    public final void g(w1f w1f) {
        y1f y1f = this.c;
        y1f.Y.q();
        y1f.Y = null;
    }
}
