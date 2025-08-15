package defpackage;

import android.animation.Animator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: vof  reason: default package */
public final class vof {
    public final WeakReference a;

    public vof(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(xof xof) {
        View view = (View) this.a.get();
        if (view == null) {
            return;
        }
        if (xof != null) {
            view.animate().setListener(new h6(xof, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
