package defpackage;

import android.animation.ValueAnimator;

/* renamed from: gmd  reason: default package */
public final /* synthetic */ class gmd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kmd b;

    public /* synthetic */ gmd(kmd kmd, int i) {
        this.a = i;
        this.b = kmd;
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
