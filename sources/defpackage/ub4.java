package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: ub4  reason: default package */
public final class ub4 extends AnimatorListenerAdapter {
    public final /* synthetic */ dec a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ yb4 f;

    public ub4(yb4 yb4, dec dec, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = yb4;
        this.a = dec;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.e.setListener((Animator.AnimatorListener) null);
        yb4 yb4 = this.f;
        dec dec = this.a;
        yb4.c(dec);
        yb4.p.remove(dec);
        yb4.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
