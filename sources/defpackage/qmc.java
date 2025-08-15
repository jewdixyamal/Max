package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import one.me.android.root.RootController;

/* renamed from: qmc  reason: default package */
public final class qmc extends AnimatorListenerAdapter {
    public final /* synthetic */ bk1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ RootController c;

    public qmc(bk1 bk1, boolean z, RootController rootController) {
        this.a = bk1;
        this.b = z;
        this.c = rootController;
    }

    public final void onAnimationCancel(Animator animator) {
        bc7[] bc7Arr = RootController.u0;
        this.c.r0(this.b);
    }

    public final void onAnimationEnd(Animator animator) {
        bc7[] bc7Arr = RootController.u0;
        this.c.r0(this.b);
    }

    public final void onAnimationStart(Animator animator) {
        boolean z = this.b;
        bk1 bk1 = this.a;
        if (bk1 != null) {
            bk1.b(z);
        }
        bc7[] bc7Arr = RootController.u0;
        RootController rootController = this.c;
        rootController.u0().setTranslationY(0.0f);
        rootController.w0(z);
    }
}
