package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: lod  reason: default package */
public final class lod extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ood b;

    public /* synthetic */ lod(ood ood, int i) {
        this.a = i;
        this.b = ood;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ood ood = this.b;
                ood.i1 = false;
                ood.invalidate();
                return;
            default:
                ood ood2 = this.b;
                ood2.o = (((ood2.f1 - ood2.l1) * ood2.d1) / ood2.g1) + ood2.b;
                ood2.i1 = false;
                ood2.p1 = true;
                ood2.invalidate();
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ood ood = this.b;
                ood.i1 = false;
                ood.invalidate();
                ood.getClass();
                return;
            default:
                ood ood2 = this.b;
                ood2.o = (((ood2.f1 - ood2.l1) * ood2.d1) / ood2.g1) + ood2.b;
                ood2.i1 = false;
                ood2.p1 = true;
                ood2.invalidate();
                ood2.getClass();
                return;
        }
    }
}
