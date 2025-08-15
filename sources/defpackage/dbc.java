package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: dbc  reason: default package */
public final /* synthetic */ class dbc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ dbc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = RecordControlsWidget.b1;
                ngg.G(recordControlsWidget.q0().getDrawable(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                bc7[] bc7Arr2 = RecordControlsWidget.b1;
                View F0 = recordControlsWidget.F0();
                ViewGroup.LayoutParams layoutParams = F0.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    F0.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            case 2:
                bc7[] bc7Arr3 = RecordControlsWidget.b1;
                ngg.G(recordControlsWidget.B0(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                bc7[] bc7Arr4 = RecordControlsWidget.b1;
                View F02 = recordControlsWidget.F0();
                ViewGroup.LayoutParams layoutParams3 = F02.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    F02.setLayoutParams(layoutParams4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }
}
