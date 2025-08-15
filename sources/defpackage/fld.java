package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fld  reason: default package */
public abstract class fld extends y1f {
    public final us Z = new qpd(0);
    public final ArrayList s0 = new ArrayList();
    public final ArrayList t0 = new ArrayList();
    public w1f u0;
    public w1f v0;
    public w1f w0;

    public static void n(ArrayList arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (fnf.b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                n(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    public final void f(zu3 zu3, uu3 uu3) {
        this.o = true;
        this.t0.clear();
    }

    public final void k(ViewGroup viewGroup, View view, View view2, w1f w1f, boolean z) {
        if (view2 != null) {
            ArrayList arrayList = this.t0;
            if (arrayList.size() > 0) {
                view2.setVisibility(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    eld eld = (eld) it.next();
                    eld.b.addView(eld.a);
                }
                arrayList.clear();
            }
        }
        super.k(viewGroup, view, view2, w1f, z);
    }

    public final e2f l(ViewGroup viewGroup, View view, View view2, boolean z) {
        w1f w1f;
        this.u0 = null;
        this.v0 = null;
        e2f p = p(view2, z);
        this.w0 = p;
        w1f w1f2 = this.v0;
        if (w1f2 == null || (w1f = this.u0) == null || (!(this instanceof mv2))) {
            return hm9.P(0, this.u0, w1f2, p);
        }
        return hm9.P(0, hm9.P(1, w1f, w1f2), this.w0);
    }

    public void m(ViewGroup viewGroup, View view, View view2, w1f w1f, boolean z, i50 i50) {
        View view3 = view2;
        i50 i502 = new i50(this, viewGroup, view, view2, w1f, z, i50, 4);
        o();
        if (view3 == null || view2.getParent() != null || this.s0.size() <= 0) {
            i502.g();
            return;
        }
        view2.getViewTreeObserver().addOnPreDrawListener(new zkd(this, view2, i502));
        ViewGroup viewGroup2 = viewGroup;
        viewGroup.addView(view2);
    }

    public abstract void o();

    public abstract e2f p(View view, boolean z);
}
