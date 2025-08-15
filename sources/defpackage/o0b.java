package defpackage;

import android.animation.ValueAnimator;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;

/* renamed from: o0b  reason: default package */
public final /* synthetic */ class o0b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinchToZoomVideoViewWrapper b;

    public /* synthetic */ o0b(PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper, int i) {
        this.a = i;
        this.b = pinchToZoomVideoViewWrapper;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
        switch (this.a) {
            case 0:
                int i = PinchToZoomVideoViewWrapper.K0;
                pinchToZoomVideoViewWrapper.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.w0.setAlpha((int) (255.0f * floatValue));
                if (((double) floatValue) == 0.0d) {
                    pinchToZoomVideoViewWrapper.v0 = false;
                }
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 1:
                int i2 = PinchToZoomVideoViewWrapper.K0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 2:
                int i3 = PinchToZoomVideoViewWrapper.K0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 3:
                int i4 = PinchToZoomVideoViewWrapper.K0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 4:
                int i5 = PinchToZoomVideoViewWrapper.K0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            default:
                int i6 = PinchToZoomVideoViewWrapper.K0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
        }
    }
}
