package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* renamed from: bi1  reason: default package */
public final class bi1 extends ch {
    public final je7 v0;

    public bi1() {
        this(-1);
    }

    public static final void o(bi1 bi1, View view, boolean z) {
        bi1.getClass();
        zj1 zj1 = view instanceof zj1 ? (zj1) view : null;
        if (zj1 != null) {
            zj1.o(z);
        }
        if (z) {
            dy7.h(view, new Rect(0, 0, view.getWidth(), view.getHeight()), 0.0f);
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
        AnimatorSet animatorSet2 = animatorSet;
        View view2 = view;
        boolean z2 = z;
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        ai1 ai1 = r0;
        ai1 ai12 = new ai1(this, view, z, view, z, view, z, 0);
        animatorSet2.addListener(ai1);
        kl7 l = j1e.l();
        ba1 ba1 = (ba1) ((aa1) this.v0.getValue());
        ba1.getClass();
        PointF pointF = ba1.b;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f = z2 ? 0.0f : 1.0f;
        float f2 = z2 ? 1.0f : 0.0f;
        bg bgVar = new bg("bounds", f);
        boolean z3 = view2 instanceof zj1;
        zj1 zj1 = z3 ? (zj1) view2 : null;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, bgVar, new float[]{f, f2});
        zh1 zh1 = r0;
        ObjectAnimator objectAnimator = ofFloat;
        boolean z4 = z3;
        zh1 zh12 = new zh1(ofFloat, this, z, view, pointF2, zj1);
        objectAnimator.addUpdateListener(zh1);
        if (z2) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{f, f2});
            ofFloat2.setDuration(50);
            l.add(ofFloat2);
        }
        l.add(objectAnimator);
        zj1 zj12 = z4 ? (zj1) view2 : null;
        if (zj12 != null) {
            zj12.f(l, z2, this.o);
        }
        animatorSet2.playTogether(j1e.d(l));
    }

    public bi1(long j) {
        super(j, 2);
        this.v0 = zi1.a.c();
    }
}
