package defpackage;

import android.animation.ValueAnimator;

/* renamed from: ba9  reason: default package */
public final /* synthetic */ class ba9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca9 b;

    public /* synthetic */ ba9(ca9 ca9, int i) {
        this.a = i;
        this.b = ca9;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                return;
            default:
                ca9 ca9 = this.b;
                ca9.a(ca9.s0);
                ca9.invalidateSelf();
                return;
        }
    }
}
