package defpackage;

import android.animation.Animator;

/* renamed from: nhf  reason: default package */
public final class nhf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ohf b;

    public /* synthetic */ nhf(ohf ohf, int i) {
        this.a = i;
        this.b = ohf;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ohf ohf = this.b;
                ohf.H0 = null;
                ohf.I0 = false;
                return;
            default:
                this.b.E0 = null;
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
