package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: eqf  reason: default package */
public final class eqf extends AnimatorListenerAdapter implements v1f {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ gqf e;

    public eqf(gqf gqf, ViewGroup viewGroup, View view, View view2) {
        this.e = gqf;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    public final void a(w1f w1f) {
    }

    public final void b() {
    }

    public final void c(w1f w1f) {
        w1f.D(this);
    }

    public final void f() {
    }

    public final void g(w1f w1f) {
        if (this.d) {
            h();
        }
    }

    public final void h() {
        this.c.setTag(gvb.save_overlay_view, (Object) null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    public final void onAnimationEnd(Animator animator) {
        h();
    }

    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.d();
        }
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            int i = gvb.save_overlay_view;
            View view2 = this.b;
            view.setTag(i, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            h();
        }
    }
}
