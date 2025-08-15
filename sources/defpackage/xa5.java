package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: xa5  reason: default package */
public final class xa5 extends ch {
    public xa5() {
        super(0);
    }

    public final zu3 b() {
        return new ch(this.o, this.u0);
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (view2 != null) {
            animatorSet.play(ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{z2 ? 0.0f : view2.getAlpha(), 1.0f}));
        }
        if (view != null && (!z || this.u0)) {
            animatorSet.play(ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f}));
        }
        return animatorSet;
    }

    public final void n(View view) {
        view.setAlpha(1.0f);
    }

    public xa5(long j) {
        super(j, 2);
    }
}
