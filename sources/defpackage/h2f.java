package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: h2f  reason: default package */
public final class h2f extends AnimatorListenerAdapter implements v1f {
    public final View a;
    public final View b;
    public int[] c;
    public float d;
    public float e;
    public final float f;
    public final float g;
    public boolean h;

    public h2f(View view, View view2, float f2, float f3) {
        this.b = view;
        this.a = view2;
        this.f = f2;
        this.g = f3;
        int[] iArr = (int[]) view2.getTag(gvb.transition_position);
        this.c = iArr;
        if (iArr != null) {
            view2.setTag(gvb.transition_position, (Object) null);
        }
    }

    public final void a(w1f w1f) {
    }

    public final void b() {
        if (this.c == null) {
            this.c = new int[2];
        }
        int[] iArr = this.c;
        View view = this.b;
        view.getLocationOnScreen(iArr);
        this.a.setTag(gvb.transition_position, this.c);
        this.d = view.getTranslationX();
        this.e = view.getTranslationY();
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    public final void c(w1f w1f) {
        e(w1f);
    }

    public final void e(w1f w1f) {
        if (!this.h) {
            this.a.setTag(gvb.transition_position, (Object) null);
        }
    }

    public final void f() {
        float f2 = this.d;
        View view = this.b;
        view.setTranslationX(f2);
        view.setTranslationY(this.e);
    }

    public final void g(w1f w1f) {
        this.h = true;
        float f2 = this.f;
        View view = this.b;
        view.setTranslationX(f2);
        view.setTranslationY(this.g);
    }

    public final void onAnimationCancel(Animator animator) {
        this.h = true;
        float f2 = this.f;
        View view = this.b;
        view.setTranslationX(f2);
        view.setTranslationY(this.g);
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            float f2 = this.f;
            View view = this.b;
            view.setTranslationX(f2);
            view.setTranslationY(this.g);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
