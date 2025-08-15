package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: uzd  reason: default package */
public final class uzd extends LinearLayout implements kre {
    public static final /* synthetic */ bc7[] u0;
    public final StateListDrawable a;
    public final je7 b = tu0.r(3, new rzd(0, this));
    public final khe c;
    public final yj o;
    public ValueAnimator s0;
    public int t0;

    static {
        oi9 oi9 = new oi9(uzd.class, "expandableState", "getExpandableState()Lone/me/sdk/uikit/common/chat/StartMiniAppActionView$ExpandableState;");
        nec.a.getClass();
        u0 = new bc7[]{oi9};
    }

    public uzd(Context context) {
        super(context, (AttributeSet) null);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 20.0f);
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(fk4.d().getDisplayMetrics().density * 20.0f);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
        this.a = stateListDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(xoc.T);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        appCompatImageView.setImageDrawable(getLeftOuterDrawable());
        this.c = new khe(new yqd(context, 6));
        this.o = new yj(this);
        setMinimumWidth(tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density));
        setOrientation(0);
        addView(appCompatImageView);
        onThemeChanged(qp4.u0.j(this));
        setBackground(stateListDrawable);
        float f = (float) 10;
        float f2 = (float) 6;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
    }

    public static final void a(uzd uzd) {
        khe khe = uzd.c;
        if (khe.a()) {
            TextView textView = (TextView) khe.getValue();
            uzd.t0 = textView.getMeasuredWidth();
            ValueAnimator valueAnimator = uzd.s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator b2 = b(uzd, textView, true);
            uzd.s0 = b2;
            b2.start();
        }
    }

    public static final ValueAnimator b(uzd uzd, TextView textView, boolean z) {
        int i = 0;
        int i2 = z ? uzd.t0 : 0;
        if (z) {
            uzd.getClass();
        } else {
            i = uzd.t0;
        }
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i2, i}).setDuration(150);
        duration.addUpdateListener(new z00(19, (Object) textView));
        duration.addListener(new tzd(z, textView, 1));
        duration.addListener(new tzd(z, textView, 0));
        return duration;
    }

    private final Drawable getLeftOuterDrawable() {
        return (Drawable) this.b.getValue();
    }

    public final szd getExpandableState() {
        bc7 bc7 = u0[0];
        return (szd) this.o.b;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density), 1073741824));
    }

    public final void onThemeChanged(fka fka) {
        Drawable leftOuterDrawable = getLeftOuterDrawable();
        fka.getIcon();
        ngg.G(leftOuterDrawable, -1);
        StateListDrawable stateListDrawable = this.a;
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{16842910}))).setColor(fka.b().a.m);
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{-16842910}))).setColor(fka.d().a.b.l);
    }

    public final void setExpandableState(szd szd) {
        this.o.o1(this, u0[0], szd);
    }

    public final void setText(CharSequence charSequence) {
        khe khe = this.c;
        if (charSequence != null && charSequence.length() != 0) {
            br7.b(this, (View) khe.getValue(), -1);
            ((TextView) khe.getValue()).setText(charSequence);
            ((View) khe.getValue()).setVisibility(0);
        } else if (khe.a()) {
            TextView textView = (TextView) khe.getValue();
            a(this);
        }
    }
}
