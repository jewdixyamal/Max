package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;

/* renamed from: ed7  reason: default package */
public final class ed7 extends TabLayout implements kre {
    public final je7 m1 = tu0.r(3, new m57(9));

    public ed7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSelectedTabIndicator((Drawable) getIndicatorDrawable());
        pq9 pq9 = qp4.u0;
        setSelectedTabIndicatorColor(pq9.j(this).b().a.g);
        setTabIndicatorFullWidth(false);
        pla.a(this, new q57(2, this, this));
        setTabIndicatorAnimationMode(1);
        setTabTextColors(TabLayout.f(pq9.j(this).getText().e, pq9.j(this).getText().g));
        setBackgroundColor(0);
        setTabRippleColor((ColorStateList) null);
        setClipToPadding(false);
        int G = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        Class<TabLayout> cls = TabLayout.class;
        ft.t(nec.a(cls), this, "tabPaddingStart", Integer.valueOf(G));
        ft.t(nec.a(cls), this, "tabPaddingEnd", Integer.valueOf(G));
    }

    /* access modifiers changed from: private */
    public final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.m1.getValue();
    }

    public final void onThemeChanged(fka fka) {
        setSelectedTabIndicatorColor(fka.b().a.g);
        pq9 pq9 = qp4.u0;
        setTabTextColors(TabLayout.f(pq9.j(this).getText().e, pq9.j(this).getText().g));
        qp4.d(pq9.b(getContext()), this);
    }
}
