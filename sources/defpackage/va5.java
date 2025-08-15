package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: va5  reason: default package */
public final class va5 extends AnimatorListenerAdapter implements v1f {
    public final View a;
    public boolean b = false;

    public va5(View view) {
        this.a = view;
    }

    public final void a(w1f w1f) {
    }

    public final void b() {
        float f;
        View view = this.a;
        if (view.getVisibility() == 0) {
            l12 l12 = ppf.a;
            f = view.getTransitionAlpha();
        } else {
            f = 0.0f;
        }
        view.setTag(gvb.transition_pause_alpha, Float.valueOf(f));
    }

    public final void c(w1f w1f) {
    }

    public final void d(w1f w1f) {
    }

    public final void f() {
        this.a.setTag(gvb.transition_pause_alpha, (Object) null);
    }

    public final void g(w1f w1f) {
    }

    public final void onAnimationCancel(Animator animator) {
        l12 l12 = ppf.a;
        this.a.setTransitionAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, (Paint) null);
        }
        if (!z) {
            l12 l12 = ppf.a;
            view.setTransitionAlpha(1.0f);
        }
    }
}
