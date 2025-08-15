package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* renamed from: tq4  reason: default package */
public final class tq4 extends Transition {
    public final rsc a;
    public final rsc b;
    public final PointF c = null;
    public final PointF o = null;

    public tq4(fm9 fm9, fm9 fm92) {
        this.a = fm9;
        this.b = fm92;
    }

    public static void a(TransitionValues transitionValues) {
        if (transitionValues.view instanceof na6) {
            transitionValues.values.put("draweeTransition:bounds", new Rect(0, 0, transitionValues.view.getWidth(), transitionValues.view.getHeight()));
        }
    }

    public static TransitionSet b(fm9 fm9, fm9 fm92) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new tq4(fm9, fm92));
        return transitionSet;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (!(transitionValues == null || transitionValues2 == null)) {
            Rect rect = (Rect) transitionValues.values.get("draweeTransition:bounds");
            Rect rect2 = (Rect) transitionValues2.values.get("draweeTransition:bounds");
            if (!(rect == null || rect2 == null)) {
                rsc rsc = this.a;
                rsc rsc2 = this.b;
                if (rsc == rsc2 && this.c == this.o) {
                    return null;
                }
                na6 na6 = (na6) transitionValues.view;
                qsc qsc = new qsc((fm9) rsc, (fm9) rsc2, rect, rect2);
                ((la6) na6.getHierarchy()).h(qsc);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new yj0(3, qsc));
                ofFloat.addListener(new eh(this, na6, false, 3));
                return ofFloat;
            }
        }
        return null;
    }
}
