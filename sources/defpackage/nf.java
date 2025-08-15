package defpackage;

import android.animation.ValueAnimator;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: nf  reason: default package */
public final class nf extends FrameLayout {
    public OneMeButton a;
    public OneMeButton b;
    public boolean c;
    public ValueAnimator o;
    public kwd s0;

    public static final void a(nf nfVar, OneMeButton oneMeButton) {
        nfVar.getClass();
        kwd kwd = new kwd((Object) (TextView) oneMeButton.findViewById(xoc.k), (ju0) kwd.q, 0.0f);
        lwd lwd = new lwd(0.0f);
        lwd.b(200.0f);
        lwd.a(0.5f);
        kwd.m = lwd;
        kwd.a = 500.0f;
        kf kfVar = new kf(nfVar, oneMeButton);
        ArrayList arrayList = kwd.k;
        if (!arrayList.contains(kfVar)) {
            arrayList.add(kfVar);
        }
        kwd.g();
        nfVar.s0 = kwd;
    }

    private final void setupViewsPosition(boolean z) {
        if (z) {
            OneMeButton oneMeButton = this.a;
            if (oneMeButton != null) {
                oneMeButton.setTranslationY(0.0f);
            }
            OneMeButton oneMeButton2 = this.b;
            if (oneMeButton2 != null) {
                oneMeButton2.setTranslationY((float) getMeasuredHeight());
                return;
            }
            return;
        }
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setTranslationY(-((float) getMeasuredHeight()));
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setTranslationY(0.0f);
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.o = null;
        kwd kwd = this.s0;
        if (kwd != null) {
            kwd.b();
        }
        this.s0 = null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        OneMeButton oneMeButton = this.b;
        int measuredHeight = oneMeButton != null ? oneMeButton.getMeasuredHeight() : 0;
        OneMeButton oneMeButton2 = this.a;
        super.onMeasure(i, Math.max(measuredHeight, oneMeButton2 != null ? oneMeButton2.getMeasuredHeight() : 0));
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setVisibility(0);
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setVisibility(0);
        }
        setupViewsPosition(isEnabled());
    }

    public final void setActiveButtonClickListener(k56 k56) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            tu0.K(oneMeButton, 300, new m6(1, k56));
        }
    }

    public final void setActiveButtonLoaderState(boolean z) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            oneMeButton.setProgressEnabled(z);
            oneMeButton.setClickable(!z);
        }
    }

    public void setEnabled(boolean z) {
        OneMeButton oneMeButton;
        kwd kwd;
        if (isEnabled() != z) {
            if (!z || !this.c) {
                b();
                setupViewsPosition(z);
            } else {
                OneMeButton oneMeButton2 = this.a;
                if (!(oneMeButton2 == null || (oneMeButton = this.b) == null)) {
                    ValueAnimator valueAnimator = this.o;
                    if ((valueAnimator != null && valueAnimator.isRunning()) || ((kwd = this.s0) != null && kwd.f)) {
                        b();
                    }
                    float height = (float) getHeight();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, height});
                    ofFloat.setDuration(200);
                    ofFloat.addUpdateListener(new jf(oneMeButton, oneMeButton2, height, 0));
                    ofFloat.addListener(new mf(0, (Object) oneMeButton2));
                    ofFloat.addListener(new lf(this, 0, oneMeButton2));
                    ofFloat.start();
                    this.o = ofFloat;
                }
            }
            super.setEnabled(z);
        }
    }

    public final void setupActiveButton(m56 m56) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        m56.invoke(oneMeButton);
        oneMeButton.setOutlineProvider((ViewOutlineProvider) null);
        oneMeButton.setVisibility(oneMeButton.isEnabled() ? 0 : 8);
        this.a = oneMeButton;
        addView(oneMeButton);
    }

    public final void setupDisabledButton(m56 m56) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        m56.invoke(oneMeButton);
        setOutlineProvider(oneMeButton.getOutlineProvider());
        oneMeButton.setOutlineProvider((ViewOutlineProvider) null);
        oneMeButton.setVisibility(oneMeButton.isEnabled() ^ true ? 0 : 8);
        this.b = oneMeButton;
        addView(oneMeButton);
    }
}
