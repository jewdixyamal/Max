package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: y1f  reason: default package */
public abstract class y1f extends zu3 {
    public boolean X;
    public xu3 Y;
    public boolean o;

    public final void a() {
        this.X = true;
    }

    public final boolean d() {
        return true;
    }

    public void f(zu3 zu3, uu3 uu3) {
        this.o = true;
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3) {
        xu3 xu32 = xu3;
        this.Y = xu32;
        if (this.o) {
            xu3.q();
        } else if (this.X) {
            k(viewGroup, view, view2, (w1f) null, z);
            xu3.q();
        } else {
            gwe gwe = new gwe(2, (Object) xu32);
            e2f l = l(viewGroup, view, view2, z);
            ViewGroup viewGroup2 = viewGroup;
            l.a(new x1f(this, viewGroup, gwe));
            m(viewGroup, view, view2, l, z, new i50(this, viewGroup, l, view, view2, z, gwe, 6));
        }
    }

    public void k(ViewGroup viewGroup, View view, View view2, w1f w1f, boolean z) {
        if (view != null && view.getParent() == viewGroup) {
            viewGroup.removeView(view);
        }
        if (view2 != null && view2.getParent() == null) {
            viewGroup.addView(view2);
        }
    }

    public abstract e2f l(ViewGroup viewGroup, View view, View view2, boolean z);

    public void m(ViewGroup viewGroup, View view, View view2, w1f w1f, boolean z, i50 i50) {
        i50.g();
    }
}
