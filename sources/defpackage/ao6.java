package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ao6  reason: default package */
public final class ao6 extends ch {
    public ao6() {
        super(0);
    }

    public final zu3 b() {
        return new ch(this.o, this.u0);
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{-((float) view.getWidth())}));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{(float) view2.getWidth(), 0.0f}));
            }
        } else {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{(float) view.getWidth()}));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{(view != null ? view.getTranslationX() : 0.0f) - ((float) view2.getWidth()), 0.0f}));
            }
        }
        return animatorSet;
    }

    public final void n(View view) {
        view.setTranslationX(0.0f);
    }

    public ao6(int i) {
        super(200, 2);
    }
}
