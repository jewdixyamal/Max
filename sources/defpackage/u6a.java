package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: u6a  reason: default package */
public final class u6a extends LinearLayout implements kre {
    public static final qx7 b = new qx7(14);
    public static final /* synthetic */ bc7[] c;
    public final yj a = new yj(17, this);

    static {
        oi9 oi9 = new oi9(u6a.class, "isBlurEnabled", "isBlurEnabled()Ljava/lang/Boolean;");
        nec.a.getClass();
        c = new bc7[]{oi9};
    }

    public u6a(Context context) {
        super(context, (AttributeSet) null);
        setOrientation(0);
        setElevation(16.0f * fk4.d().getDisplayMetrics().density);
    }

    public final void a(fka fka, Boolean bool) {
        Context context = getContext();
        ne0 b2 = fka.b();
        Boolean bool2 = Boolean.TRUE;
        Drawable a2 = s36.a(context, b2.i, 2.0f, tpa.f(bool, bool2));
        if (!tpa.f(bool, bool2)) {
            a2.setAlpha(255);
        }
        setBackground(a2);
    }

    public final int getSelectedItemId() {
        u1 u1Var = new u1(4, this);
        while (u1Var.hasNext()) {
            View view = (View) u1Var.next();
            if (view.isSelected()) {
                Object v = tpa.v(view, vxb.tag_tab_item);
                t6a t6a = v instanceof t6a ? (t6a) v : null;
                if (t6a != null) {
                    return t6a.c;
                }
                return -1;
            }
        }
        return -1;
    }

    public final void onMeasure(int i, int i2) {
        v27 f = x6g.f(this, getRootWindowInsets()).a.f(2);
        int i3 = 0;
        while (true) {
            if (i3 < getChildCount()) {
                int i4 = i3 + 1;
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.bottomMargin = tu0.G(((float) (f.d > 0 ? 4 : 12)) * fk4.d().getDisplayMetrics().density);
                        childAt.setLayoutParams(layoutParams2);
                        i3 = i4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                float f2 = (float) 8;
                setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), getPaddingTop(), tu0.G(f2 * fk4.d().getDisplayMetrics().density), getPaddingBottom());
                b.getClass();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + qx7.a(this), 1073741824));
                return;
            }
        }
    }

    public final void onThemeChanged(fka fka) {
        bc7 bc7 = c[0];
        a(fka, (Boolean) this.a.b);
        int i = 0;
        while (true) {
            if (i < getChildCount()) {
                int i2 = i + 1;
                View childAt = getChildAt(i);
                if (childAt != null) {
                    ((wq0) childAt).w();
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void setBlurEnabled(Boolean bool) {
        this.a.o1(this, c[0], bool);
    }
}
