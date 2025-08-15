package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* renamed from: w33  reason: default package */
public final class w33 extends Transition {
    public final Rect a;
    public final boolean b;

    public w33(Rect rect, boolean z) {
        this.a = rect;
        this.b = z;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
    }

    public final void captureStartValues(TransitionValues transitionValues) {
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof na6)) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new yl(this, 2, transitionValues));
        ofFloat.addListener(new eh(this, transitionValues, false, 1));
        return ofFloat;
    }
}
