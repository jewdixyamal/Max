package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: z13  reason: default package */
public final class z13 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a23 b;

    public /* synthetic */ z13(a23 a23, int i) {
        this.a = i;
        this.b = a23;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                a23 a23 = this.b;
                a23.x();
                le leVar = a23.v0;
                if (leVar != null) {
                    leVar.a((tz6) a23.b);
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
                a23 a23 = this.b;
                a23.s0 = (a23.s0 + 4) % a23.Z.c.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
