package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* renamed from: ff  reason: default package */
public final class ff extends q42 {
    public final /* synthetic */ int c = 0;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ff(int i, gf gfVar) {
        super(i);
        this.e = gfVar;
    }

    public void b(k6g k6g) {
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (!gfVar.g && gfVar.k == k6g.a.c()) {
                    gfVar.k = -1;
                    gfVar.i();
                    x6g x6g = gfVar.e;
                    if (x6g != null) {
                        gfVar.c(x6g);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(k6g k6g) {
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (!gfVar.g && gfVar.k == -1) {
                    j6g j6g = k6g.a;
                    if ((j6g.c() & gfVar.j) != 0) {
                        gfVar.k = j6g.c();
                        this.d = gfVar.e;
                        gfVar.j();
                        return;
                    }
                    return;
                }
                return;
            default:
                if ((k6g.a.c() & 8) != 0) {
                    hc8 hc8 = (hc8) this.e;
                    View view = hc8.c;
                    int c2 = hc8.c();
                    View view2 = hc8.b;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
                    view2.setTranslationY(0.0f);
                    zmf.l((View) this.d, (q42) null);
                    return;
                }
                return;
        }
    }

    public final x6g d(x6g x6g, List list) {
        Object obj;
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (gfVar.g) {
                    return x6g;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((k6g) obj).a.c() == gfVar.k) {
                        }
                    } else {
                        obj = null;
                    }
                }
                return ((k6g) obj) != null ? gfVar.h(gf.f(gfVar, x6g)) : x6g;
            default:
                return x6g;
        }
    }

    public l7b e(k6g k6g, l7b l7b) {
        x6g x6g;
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (!gfVar.g && (x6g = (x6g) this.d) != null && gfVar.k == k6g.a.c()) {
                    x6g f = gf.f(gfVar, x6g);
                    gfVar.g(f, l7b);
                    gfVar.h(f);
                }
                return l7b;
            default:
                return l7b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ff(View view, hc8 hc8) {
        super(1);
        this.d = view;
        this.e = hc8;
    }
}
