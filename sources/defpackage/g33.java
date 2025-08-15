package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: g33  reason: default package */
public final class g33 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h33 b;

    public /* synthetic */ g33(h33 h33, int i) {
        this.a = i;
        this.b = h33;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
