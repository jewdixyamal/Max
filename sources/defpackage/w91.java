package defpackage;

import android.animation.ValueAnimator;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: w91  reason: default package */
public final /* synthetic */ class w91 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CallIndicatorWidget a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ w91(CallIndicatorWidget callIndicatorWidget, boolean z) {
        this.a = callIndicatorWidget;
        this.b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        CallIndicatorWidget.n0(this.a, this.b);
    }
}
