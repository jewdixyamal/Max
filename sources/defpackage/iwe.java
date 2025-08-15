package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: iwe  reason: default package */
public final class iwe implements or8 {
    public wq8 a;
    public br8 b;
    public final /* synthetic */ Toolbar c;

    public iwe(Toolbar toolbar) {
        this.c = toolbar;
    }

    public final boolean b(qae qae) {
        return false;
    }

    public final void c(wq8 wq8, boolean z) {
    }

    public final boolean d() {
        return false;
    }

    public final boolean e(br8 br8) {
        Toolbar toolbar = this.c;
        View view = toolbar.w0;
        if (view instanceof r53) {
            ((r53) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.w0);
        toolbar.removeView(toolbar.v0);
        toolbar.w0 = null;
        ArrayList arrayList = toolbar.S0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        br8.N0 = false;
        br8.y0.p(false);
        toolbar.x();
        return true;
    }

    public final boolean h(br8 br8) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.v0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.v0);
            }
            toolbar.addView(toolbar.v0);
        }
        View actionView = br8.getActionView();
        toolbar.w0 = actionView;
        this.b = br8;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.w0);
            }
            jwe h = Toolbar.h();
            h.a = (toolbar.B0 & 112) | 8388611;
            h.b = 2;
            toolbar.w0.setLayoutParams(h);
            toolbar.addView(toolbar.w0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (!(((jwe) childAt.getLayoutParams()).b == 2 || childAt == toolbar.a)) {
                toolbar.removeViewAt(childCount);
                toolbar.S0.add(childAt);
            }
        }
        toolbar.requestLayout();
        br8.N0 = true;
        br8.y0.p(false);
        View view = toolbar.w0;
        if (view instanceof r53) {
            ((r53) view).onActionViewExpanded();
        }
        toolbar.x();
        return true;
    }

    public final void i() {
        if (this.b != null) {
            wq8 wq8 = this.a;
            if (wq8 != null) {
                int size = wq8.Y.size();
                int i = 0;
                while (i < size) {
                    if (this.a.getItem(i) != this.b) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            e(this.b);
        }
    }

    public final void k(Context context, wq8 wq8) {
        br8 br8;
        wq8 wq82 = this.a;
        if (!(wq82 == null || (br8 = this.b) == null)) {
            wq82.d(br8);
        }
        this.a = wq8;
    }
}
