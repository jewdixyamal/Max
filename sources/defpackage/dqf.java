package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: dqf  reason: default package */
public final class dqf extends AnimatorListenerAdapter implements v1f {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f = false;

    public dqf(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        this.d = true;
        h(true);
    }

    public final void a(w1f w1f) {
    }

    public final void b() {
        h(false);
        if (!this.f) {
            l12 l12 = ppf.a;
            this.a.setTransitionVisibility(this.b);
        }
    }

    public final void c(w1f w1f) {
        w1f.D(this);
    }

    public final void f() {
        h(true);
        if (!this.f) {
            l12 l12 = ppf.a;
            this.a.setTransitionVisibility(0);
        }
    }

    public final void g(w1f w1f) {
    }

    public final void h(boolean z) {
        ViewGroup viewGroup;
        if (this.d && this.e != z && (viewGroup = this.c) != null) {
            this.e = z;
            gnf.b(viewGroup, z);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            l12 l12 = ppf.a;
            this.a.setTransitionVisibility(this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            l12 l12 = ppf.a;
            this.a.setTransitionVisibility(0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.f) {
                l12 l12 = ppf.a;
                this.a.setTransitionVisibility(this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }
    }
}
