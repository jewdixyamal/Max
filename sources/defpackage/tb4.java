package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: tb4  reason: default package */
public final class tb4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ dec b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ yb4 e;

    public tb4(yb4 yb4, dec dec, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = yb4;
        this.b = dec;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener((Animator.AnimatorListener) null);
                this.c.setAlpha(1.0f);
                yb4 yb4 = this.e;
                yb4.l();
                dec dec = this.b;
                yb4.c(dec);
                yb4.q.remove(dec);
                yb4.i();
                return;
            default:
                this.d.setListener((Animator.AnimatorListener) null);
                yb4 yb42 = this.e;
                dec dec2 = this.b;
                yb42.c(dec2);
                yb42.o.remove(dec2);
                yb42.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public tb4(yb4 yb4, dec dec, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = yb4;
        this.b = dec;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
