package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* renamed from: fh  reason: default package */
public final class fh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Animator b;
    public final /* synthetic */ k56 c;

    public /* synthetic */ fh(AnimatorSet animatorSet, k56 k56, int i) {
        this.a = i;
        this.b = animatorSet;
        this.c = k56;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.removeListener(this);
                this.c.invoke();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.removeListener(this);
                this.c.invoke();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
