package defpackage;

import android.animation.ValueAnimator;

/* renamed from: lcc  reason: default package */
public final /* synthetic */ class lcc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mcc b;

    public /* synthetic */ lcc(mcc mcc, int i) {
        this.a = i;
        this.b = mcc;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                return;
            default:
                this.b.invalidateSelf();
                return;
        }
    }
}
