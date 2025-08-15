package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* renamed from: am1  reason: default package */
public final class am1 extends ch {
    public final je7 v0;

    public am1() {
        this(-1);
    }

    public static final void o(am1 am1, View view, boolean z) {
        am1.getClass();
        bk1 bk1 = view instanceof bk1 ? (bk1) view : null;
        if (bk1 != null) {
            bk1.a(z);
        }
        if (z) {
            view.setClipToOutline(true);
            dy7.h(view, new Rect(0, 0, view.getWidth(), view.getHeight()), fk4.d().getDisplayMetrics().density * 0.0f);
        }
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z && view2 != null) {
            p(animatorSet, view2, true);
        } else if (!z && view != null) {
            p(animatorSet, view, false);
        }
        return animatorSet;
    }

    public final void n(View view) {
    }

    public final void p(AnimatorSet animatorSet, View view, boolean z) {
        int i;
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new ai1(this, view, z, view, z, view, z, 1));
        kl7 l = j1e.l();
        if (z) {
            ((ba1) ((aa1) this.v0.getValue())).getClass();
            i = tu0.G(((float) 174) * fk4.d().getDisplayMetrics().density);
        } else {
            i = view.getHeight();
        }
        int height = z ? view.getHeight() : 0;
        hg hgVar = new hg("bounds", i);
        int[] iArr = {i, height};
        bk1 bk1 = null;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, iArr);
        ofInt.addUpdateListener(new pg(view, hgVar, 2));
        l.add(ofInt);
        if (view instanceof bk1) {
            bk1 = (bk1) view;
        }
        if (bk1 != null) {
            bk1.h(l, z, this.o);
        }
        animatorSet.playTogether(j1e.d(l));
    }

    public am1(long j) {
        super(j, 2);
        this.v0 = zi1.a.c();
    }
}
