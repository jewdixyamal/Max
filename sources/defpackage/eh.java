package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.TransitionValues;
import android.view.View;

/* renamed from: eh  reason: default package */
public final class eh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eh(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationCancel(animator);
                ((TransitionValues) this.b).view.setClipBounds((Rect) null);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ValueAnimator) this.b).removeListener(this);
                ((k56) this.c).invoke();
                return;
            case 1:
                super.onAnimationEnd(animator);
                if (((w33) this.c).b) {
                    ((TransitionValues) this.b).view.setClipBounds((Rect) null);
                    return;
                }
                return;
            case 2:
                ((la6) ((na6) this.b).getHierarchy()).n(wnc.b(((oq4) this.c).b));
                return;
            case 3:
                na6 na6 = (na6) this.b;
                tq4 tq4 = (tq4) this.c;
                ((la6) na6.getHierarchy()).h(tq4.b);
                if (tq4.o != null) {
                    la6 la6 = (la6) na6.getHierarchy();
                    PointF pointF = tq4.o;
                    la6.getClass();
                    pointF.getClass();
                    la6.f(2).r(pointF);
                    return;
                }
                return;
            case 4:
                uv4 uv4 = (uv4) this.c;
                uv4.o.setValues((float[]) this.b);
                uv4.o.invert(uv4.s0);
                uv4.invalidate();
                return;
            case 5:
                ((us) this.b).remove(animator);
                ((w1f) this.c).A0.remove(animator);
                return;
            default:
                k6g k6g = (k6g) this.b;
                k6g.a.d(1.0f);
                g6g.e((View) this.c, k6g);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ((w1f) this.c).A0.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ eh(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
