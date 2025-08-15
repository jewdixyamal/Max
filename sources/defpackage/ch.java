package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ch  reason: default package */
public abstract class ch extends zu3 {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public long o;
    public Animator s0;
    public ah t0;
    public boolean u0;

    public ch() {
        this(0, 3);
    }

    public final void a() {
        this.Y = true;
        Animator animator = this.s0;
        if (animator != null) {
            animator.end();
            return;
        }
        ah ahVar = this.t0;
        if (ahVar != null) {
            ahVar.a();
        }
    }

    public final boolean d() {
        return this.u0;
    }

    public final void f(zu3 zu3, uu3 uu3) {
        this.X = true;
        Animator animator = this.s0;
        if (animator != null) {
            animator.cancel();
            return;
        }
        ah ahVar = this.t0;
        if (ahVar != null) {
            ahVar.a();
        }
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3) {
        boolean z2 = view2 != null && view2.getParent() == null;
        if (z2) {
            if (z || view == null) {
                viewGroup.addView(view2);
            } else if (view2.getParent() == null) {
                viewGroup.addView(view2, viewGroup.indexOfChild(view));
            }
            if (view2.getWidth() <= 0 && view2.getHeight() <= 0) {
                this.t0 = new ah(this, xu3, view, view2, viewGroup, z);
                view2.getViewTreeObserver().addOnPreDrawListener(this.t0);
                return;
            }
        }
        m(viewGroup, view, view2, z, z2, xu3);
    }

    public final void h(Bundle bundle) {
        this.o = bundle.getLong("AnimatorChangeHandler.duration");
        this.u0 = bundle.getBoolean("AnimatorChangeHandler.removesFromViewOnPush");
    }

    public final void i(Bundle bundle) {
        bundle.putLong("AnimatorChangeHandler.duration", this.o);
        bundle.putBoolean("AnimatorChangeHandler.removesFromViewOnPush", this.u0);
    }

    public final void k(xu3 xu3, Animator.AnimatorListener animatorListener) {
        if (!this.Z) {
            this.Z = true;
            xu3.q();
        }
        Animator animator = this.s0;
        if (animator != null) {
            if (animatorListener != null) {
                animator.removeListener(animatorListener);
            }
            this.s0.cancel();
            this.s0 = null;
        }
        this.t0 = null;
    }

    public abstract AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2);

    public final void m(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2, xu3 xu3) {
        if (this.X) {
            k(xu3, (Animator.AnimatorListener) null);
        } else if (this.Y) {
            if (view != null && (!z || this.u0)) {
                viewGroup.removeView(view);
            }
            k(xu3, (Animator.AnimatorListener) null);
            if (z && view != null) {
                n(view);
            }
        } else {
            AnimatorSet l = l(viewGroup, view, view2, z, z2);
            this.s0 = l;
            long j = this.o;
            if (j > 0) {
                l.setDuration(j);
            }
            this.s0.addListener(new bh(this, xu3, view, view2, viewGroup, z));
            this.s0.start();
        }
    }

    public abstract void n(View view);

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(long j, int i) {
        this((i & 1) != 0 ? -1 : j, true);
    }

    public ch(long j, boolean z) {
        this.o = j;
        this.u0 = z;
    }

    public ch(int i) {
        this(-1, true);
    }
}
