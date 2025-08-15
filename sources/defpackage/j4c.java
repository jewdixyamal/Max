package defpackage;

import android.animation.ValueAnimator;

/* renamed from: j4c  reason: default package */
public final /* synthetic */ class j4c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4c b;

    public /* synthetic */ j4c(k4c k4c, int i) {
        this.a = i;
        this.b = k4c;
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
