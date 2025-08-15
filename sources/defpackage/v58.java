package defpackage;

import android.animation.ValueAnimator;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: v58  reason: default package */
public final class v58 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MediaBarWidget Y;
    public final /* synthetic */ f6b Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v58(MediaBarWidget mediaBarWidget, f6b f6b, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaBarWidget;
        this.Z = f6b;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((v58) n(bool, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v58 v58 = new v58(this.Y, this.Z, continuation);
        v58.X = ((Boolean) obj).booleanValue();
        return v58;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean z = this.X;
        bc7[] bc7Arr = MediaBarWidget.d1;
        MediaBarWidget mediaBarWidget = this.Y;
        Object value = mediaBarWidget.B0().A0.a.getValue();
        v8b v8b = v8b.b;
        e5f e5f = e5f.a;
        if (value == v8b) {
            return e5f;
        }
        if (this.Z.getScrollState() == d6b.b && mediaBarWidget.x0().s0 == null) {
            mediaBarWidget.x0().k();
        }
        ValueAnimator valueAnimator = mediaBarWidget.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int alpha = mediaBarWidget.M0.getAlpha();
        int i = z ? (qp4.u0.j(mediaBarWidget.t0()).b().e >> 24) & 255 : 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new r58(mediaBarWidget, alpha, i));
        ofFloat.setDuration(100);
        ofFloat.start();
        mediaBarWidget.N0 = ofFloat;
        return e5f;
    }
}
