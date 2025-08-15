package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: vb4  reason: default package */
public final class vb4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb4 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ yb4 e;

    public /* synthetic */ vb4(yb4 yb4, wb4 wb4, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = yb4;
        this.b = wb4;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener((Animator.AnimatorListener) null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                wb4 wb4 = this.b;
                dec dec = wb4.a;
                yb4 yb4 = this.e;
                yb4.c(dec);
                yb4.r.remove(wb4.a);
                yb4.i();
                return;
            default:
                this.c.setListener((Animator.AnimatorListener) null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                wb4 wb42 = this.b;
                dec dec2 = wb42.b;
                yb4 yb42 = this.e;
                yb42.c(dec2);
                yb42.r.remove(wb42.b);
                yb42.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                dec dec = this.b.a;
                this.e.getClass();
                return;
            default:
                dec dec2 = this.b.b;
                this.e.getClass();
                return;
        }
    }
}
