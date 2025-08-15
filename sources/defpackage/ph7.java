package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ph7  reason: default package */
public final class ph7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh7 b;

    public /* synthetic */ ph7(qh7 qh7, int i) {
        this.a = i;
        this.b = qh7;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                qh7 qh7 = this.b;
                qh7.x();
                le leVar = qh7.v0;
                if (leVar != null) {
                    leVar.a((tz6) qh7.b);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                qh7 qh7 = this.b;
                qh7.s0 = (qh7.s0 + 1) % qh7.Z.c.length;
                qh7.t0 = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
