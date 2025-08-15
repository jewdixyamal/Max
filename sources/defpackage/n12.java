package defpackage;

import android.view.ViewGroup;

/* renamed from: n12  reason: default package */
public final class n12 extends z1f {
    public boolean a = false;
    public final ViewGroup b;

    public n12(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void b() {
        gnf.b(this.b, false);
    }

    public final void c(w1f w1f) {
        if (!this.a) {
            gnf.b(this.b, false);
        }
        w1f.D(this);
    }

    public final void f() {
        gnf.b(this.b, true);
    }

    public final void g(w1f w1f) {
        gnf.b(this.b, false);
        this.a = true;
    }
}
