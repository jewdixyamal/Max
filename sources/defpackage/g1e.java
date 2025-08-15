package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: g1e  reason: default package */
public class g1e {
    public final View a;
    public final x27 b;
    public final m56 c;
    public final int d;
    public x6g e;
    public int f;
    public boolean g;
    public final Rect h;
    public final Rect i;

    public /* synthetic */ g1e(View view, x27 x27, m56 m56) {
        this(view, x27, m56, 7);
    }

    public final void a(v27 v27, yq0 yq0) {
        int max = Math.max(v27.d, this.f);
        int s = au1.s(yq0.a);
        if (s != 0) {
            View view = this.a;
            if (s == 1) {
                view.setTranslationY(-((float) max));
            } else if (s == 2) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.h.bottom + max);
            } else if (s == 3) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), max);
            } else if (s == 4) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = this.i.bottom + max;
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public void b(x6g x6g, yq0 yq0) {
        a(x6g.a.f(this.d), yq0);
    }

    public void c(x6g x6g) {
        x27 x27 = this.b;
        int i2 = x27.a;
        if (i2 != 0) {
            v27 f2 = x6g.a.f(this.d);
            int s = au1.s(i2);
            if (s != 0) {
                int i3 = f2.b;
                View view = this.a;
                if (s == 1) {
                    view.setTranslationY((float) i3);
                } else if (s == 2) {
                    view.setPadding(view.getPaddingLeft(), this.h.top + i3, view.getPaddingRight(), view.getPaddingBottom());
                } else if (s == 3) {
                    view.setPadding(view.getPaddingLeft(), i3, view.getPaddingRight(), view.getPaddingBottom());
                } else if (s == 4) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = this.i.top + i3;
                        view.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        yq0 yq0 = x27.b;
        if (yq0 != null) {
            b(x6g, yq0);
        }
        m56 m56 = this.c;
        if (m56 != null) {
            m56.invoke(x6g);
        }
    }

    public x6g d(x6g x6g) {
        return x6g;
    }

    public void e() {
        this.g = false;
    }

    public g1e(View view, x27 x27, m56 m56, int i2) {
        Rect rect;
        this.a = view;
        this.b = x27;
        this.c = m56;
        this.d = i2;
        bqc bqc = new bqc(13, this);
        this.h = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            rect = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            rect = new Rect(0, 0, 0, 0);
        }
        this.i = rect;
        WeakHashMap weakHashMap = zmf.a;
        omf.u(view, bqc);
        if (view.isAttachedToWindow()) {
            mmf.c(view);
            y27.a.a(this);
        }
        view.addOnAttachStateChangeListener(new ck(10, this));
    }
}
