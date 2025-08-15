package defpackage;

import android.animation.Animator;

/* renamed from: rv8  reason: default package */
public final class rv8 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv8 b;

    public /* synthetic */ rv8(sv8 sv8, int i) {
        this.a = i;
        this.b = sv8;
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

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.v0.setAlpha(1.0f);
                return;
            case 1:
                return;
            case 2:
                this.b.v0.setAlpha(1.0f);
                return;
            case 3:
                return;
            case 4:
                this.b.v0.setAlpha(1.0f);
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                sv8 sv8 = this.b;
                sv8.v0.setAlpha(0.0f);
                sv8.v0.setVisibility(0);
                return;
            case 2:
                return;
            case 3:
                sv8 sv82 = this.b;
                sv82.v0.setAlpha(0.0f);
                sv82.v0.setVisibility(0);
                sv82.b.setTranslationX(0.0f);
                return;
            case 4:
                return;
            case 5:
                sv8 sv83 = this.b;
                sv83.c.setTranslationX(0.0f);
                sv83.b.setTranslationX(0.0f);
                sv83.v0.setVisibility(0);
                return;
            default:
                this.b.v0.setVisibility(4);
                return;
        }
    }
}
