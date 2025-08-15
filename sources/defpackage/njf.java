package defpackage;

import android.animation.ValueAnimator;
import android.view.ScaleGestureDetector;
import android.view.animation.AccelerateDecelerateInterpolator;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: njf  reason: default package */
public final class njf implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ VideoMessageWidget a;

    public njf(VideoMessageWidget videoMessageWidget) {
        this.a = videoMessageWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r4 = (defpackage.gag) (r4 = ((defpackage.fjc) r4).b.r()).d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScale(android.view.ScaleGestureDetector r4) {
        /*
            r3 = this;
            bc7[] r0 = one.me.chatscreen.videomsg.VideoMessageWidget.y0
            one.me.chatscreen.videomsg.VideoMessageWidget r3 = r3.a
            ygf r3 = r3.o0()
            float r4 = r4.getScaleFactor()
            ejf r3 = (defpackage.ejf) r3
            android.animation.ValueAnimator r0 = r3.J0
            r1 = 1
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isRunning()
            if (r0 != r1) goto L_0x0020
            android.animation.ValueAnimator r0 = r3.J0
            if (r0 == 0) goto L_0x0020
            r0.cancel()
        L_0x0020:
            float r0 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = defpackage.z7b.f(r4, r0, r2, r0)
            float r0 = r3.I0
            float r0 = r0 * r4
            r3.I0 = r0
            yw1 r4 = r3.m()
            if (r4 == 0) goto L_0x0049
            fjc r4 = (defpackage.fjc) r4
            yw1 r4 = r4.b
            xm7 r4 = r4.r()
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r4.d()
            gag r4 = (defpackage.gag) r4
            if (r4 == 0) goto L_0x0049
            float r4 = r4.b()
            goto L_0x004b
        L_0x0049:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x004b:
            yw1 r2 = r3.m()
            if (r2 == 0) goto L_0x0068
            fjc r2 = (defpackage.fjc) r2
            yw1 r2 = r2.b
            xm7 r2 = r2.r()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r2.d()
            gag r2 = (defpackage.gag) r2
            if (r2 == 0) goto L_0x0068
            float r2 = r2.a()
            goto L_0x006a
        L_0x0068:
            r2 = 1092616192(0x41200000, float:10.0)
        L_0x006a:
            float r4 = defpackage.ote.d(r0, r4, r2)
            hg7 r3 = r3.z0
            if (r3 == 0) goto L_0x0077
            xx1 r3 = r3.c
            ejc r3 = r3.B0
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            if (r3 == 0) goto L_0x007d
            r3.d(r4)
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njf.onScale(android.view.ScaleGestureDetector):boolean");
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        bc7[] bc7Arr = VideoMessageWidget.y0;
        ejf ejf = (ejf) this.a.o0();
        ValueAnimator valueAnimator = ejf.J0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{ejf.I0, 1.0f});
            ofFloat.setDuration(150);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new z00(21, (Object) ejf));
            ofFloat.addListener(new mf(10, (Object) ejf));
            ejf.J0 = ofFloat;
            ofFloat.start();
        }
    }
}
