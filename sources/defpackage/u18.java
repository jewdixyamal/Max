package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: u18  reason: default package */
public final class u18 extends ch {
    public final int v0;
    public final int w0;

    public u18() {
        this(0);
    }

    public static ObjectAnimator p(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new t18(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    public static ObjectAnimator q(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new s18(view, f3, 2));
        return ofPropertyValuesHolder;
    }

    public final zu3 b() {
        return new u18(this.v0, (au1) null);
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new wb5());
        if (view2 != null) {
            float alpha = view2.getAlpha() == 0.0f ? 1.0f : view2.getAlpha();
            animatorSet.play(o(view2, 0.0f, alpha, ote.d(-0.15f, 0.0f, 1.0f), 1.0f, alpha));
        }
        if (view != null && (!z || this.u0)) {
            float alpha2 = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
            animatorSet.play(o(view, alpha2, 0.0f, 0.0f, ote.d(0.85f, 0.0f, 1.0f), alpha2));
        }
        int s = au1.s(this.v0);
        if (s == 0) {
            int i = this.w0;
            if (z) {
                if (view2 != null) {
                    animatorSet.play(q(view2, view2.getTranslationX() + ((float) i), view2.getTranslationX(), view2.getTranslationX()));
                }
                if (view != null) {
                    animatorSet.play(q(view, view.getTranslationX(), view.getTranslationX() - ((float) i), view.getTranslationX()));
                }
            } else {
                if (view2 != null) {
                    animatorSet.play(q(view2, view2.getTranslationX() - ((float) i), view2.getTranslationX(), view2.getTranslationX()));
                }
                if (view != null) {
                    animatorSet.play(q(view, view.getTranslationX(), view.getTranslationX() + ((float) i), view.getTranslationX()));
                }
            }
        } else if (s != 1) {
            throw new NoWhenBranchMatchedException();
        } else if (z) {
            if (view2 != null) {
                animatorSet.play(p(view2, 0.8f, 1.0f));
            }
            if (view != null) {
                animatorSet.play(p(view, 1.0f, 1.1f));
            }
        } else {
            if (view2 != null) {
                animatorSet.play(p(view2, 1.1f, 1.0f));
            }
            if (view != null) {
                animatorSet.play(p(view, 1.0f, 0.8f));
            }
        }
        return animatorSet;
    }

    public final void n(View view) {
        view.setAlpha(1.0f);
    }

    public final ValueAnimator o(View view, float f, float f2, float f3, float f4, float f5) {
        View view2 = view;
        float f6 = f5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new r18(ofFloat, view, this, f, f2, f3, f4));
        ofFloat.addListener(new s18(view, f6, 1));
        ofFloat.addListener(new s18(view, f6, 0));
        return ofFloat;
    }

    public /* synthetic */ u18(int i) {
        this(1, (au1) null);
    }

    public u18(int i, au1 au1) {
        super(300, 2);
        this.v0 = i;
        this.w0 = tu0.G(((float) 30) * fk4.d().getDisplayMetrics().density);
    }
}
