package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: oq4  reason: default package */
public final class oq4 extends Transition {
    public static final float[] o = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public final float[] a;
    public final float[] b;
    public final float[] c = new float[8];

    public oq4(float[] fArr, float[] fArr2) {
        this.a = fArr;
        this.b = fArr2;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
    }

    public final void captureStartValues(TransitionValues transitionValues) {
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        View view = transitionValues.view;
        if (!(view instanceof na6)) {
            return null;
        }
        na6 na6 = (na6) view;
        ((la6) na6.getHierarchy()).n(wnc.b(this.a));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new nq4(this, na6));
        ofFloat.addListener(new eh(this, na6, false, 2));
        return ofFloat;
    }
}
