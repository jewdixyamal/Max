package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: tz7  reason: default package */
public final class tz7 extends LinearLayout implements nse {
    public final AppCompatTextView a;
    public boolean b;
    public ObjectAnimator c;

    public tz7(Context context) {
        super(context, (AttributeSet) null, 0);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(ktb.markdown_dot_size);
        int i = ktb.markdown_button_size;
        setOrientation(0);
        setGravity(17);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null, 0);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setTextAlignment(6);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setLineHeight(tu0.G(((float) 14) * fk4.d().getDisplayMetrics().density));
        appCompatTextView.setGravity(17);
        appCompatTextView.setPaddingRelative(tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingEnd(), appCompatTextView.getPaddingBottom());
        this.a = appCompatTextView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        layoutParams.setMarginEnd(tu0.G(((float) 26) * fk4.d().getDisplayMetrics().density));
        addView(appCompatTextView, layoutParams);
        View view = new View(context, (AttributeSet) null, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        ngg.G(shapeDrawable, -1);
        view.setBackground(shapeDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        layoutParams2.gravity = 17;
        layoutParams2.setMarginEnd((getContext().getResources().getDimensionPixelSize(i) - dimensionPixelSize) / 2);
        addView(view, layoutParams2);
        if (isInEditMode()) {
            appCompatTextView.setText(eae.m0(20, "s"));
            appCompatTextView.setTextColor(-1);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, e3c.MarkdownItemView);
        if (obtainStyledAttributes.hasValue(e3c.MarkdownItemView_miv_title)) {
            setTitle(obtainStyledAttributes.getResourceId(e3c.MarkdownItemView_miv_title, 0));
        }
        a(obtainStyledAttributes.getBoolean(e3c.MarkdownItemView_miv_highlight_title, false), false);
        obtainStyledAttributes.recycle();
        c();
    }

    public final void a(boolean z, boolean z2) {
        this.b = z;
        Float valueOf = Float.valueOf(0.6f);
        Float valueOf2 = Float.valueOf(1.0f);
        of ofVar = new of(valueOf, valueOf2);
        if (!this.b) {
            ofVar = new of(valueOf2, valueOf);
        }
        float alpha = getAlpha();
        Number number = ofVar.b;
        if (alpha != number.floatValue()) {
            if (isInEditMode() || !z2 || (!mr0.w(this).p())) {
                setAlpha(number.floatValue());
                invalidate();
                return;
            }
            tg w = mr0.w(this);
            ObjectAnimator objectAnimator = this.c;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.c;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                this.c = null;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, LinearLayout.ALPHA, new float[]{ofVar.a.floatValue(), number.floatValue()});
            this.c = ofFloat;
            ofFloat.setDuration(w.a.b());
            boolean z3 = this.b;
            lg lgVar = w.a;
            ofFloat.setInterpolator(z3 ? lgVar.d() : lgVar.l());
            ofFloat.addListener(new lf(this, 3, ofVar));
            ofFloat.start();
        }
    }

    public final void c() {
        sme sme;
        if (!isInEditMode()) {
            if (isInEditMode()) {
                sme = ee4.e0;
            } else {
                Context context = getContext();
                khe khe = sme.a0;
                sme = fm9.R(context);
            }
            this.a.setTextColor(sme.l);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void setTitle(int i) {
        this.a.setText(i);
    }
}
