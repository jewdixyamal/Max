package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;

/* renamed from: wja  reason: default package */
public final class wja extends TabLayout implements kre {
    public final xja m1 = ((xja) yja.a.getValue());
    public final je7 n1 = tu0.r(3, new zj7(20, this));

    public wja(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setSelectedTabIndicator((Drawable) getIndicatorDrawable());
        super.setSelectedTabIndicatorColor(qp4.u0.j(this).i().h);
        super.setTabIndicatorFullWidth(false);
        setBackgroundColor(0);
        setTabRippleColor((ColorStateList) null);
        setClipToPadding(false);
        float f = (float) 4;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        ft.t(nec.a(TabLayout.class), this, "requestedTabMinWidth", 0);
    }

    private final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.n1.getValue();
    }

    public final void onThemeChanged(fka fka) {
        super.setSelectedTabIndicatorColor(fka.i().h);
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.height = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
        }
        super.setLayoutParams(layoutParams);
    }
}
