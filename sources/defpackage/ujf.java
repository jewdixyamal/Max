package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: ujf  reason: default package */
public final class ujf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoMessageWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ujf(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.Y = videoMessageWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ujf) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ujf ujf = new ujf(continuation, this.Y);
        ujf.X = obj;
        return ujf;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        xgf xgf = (xgf) this.X;
        boolean z = xgf.b;
        VideoMessageWidget videoMessageWidget = this.Y;
        Drawable drawable = z ? (Drawable) videoMessageWidget.t0.getValue() : (Drawable) videoMessageWidget.u0.getValue();
        bc7[] bc7Arr = VideoMessageWidget.y0;
        videoMessageWidget.getClass();
        bc7[] bc7Arr2 = VideoMessageWidget.y0;
        bc7 bc7 = bc7Arr2[1];
        q7c q7c = videoMessageWidget.X;
        ((ImageView) q7c.T0(videoMessageWidget, bc7)).setImageDrawable(drawable);
        ViewPropertyAnimator viewPropertyAnimator = videoMessageWidget.v0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = ((ImageView) q7c.T0(videoMessageWidget, bc7Arr2[1])).animate().alpha(xgf.a ? 1.0f : 0.0f).setDuration(200).withEndAction(new h76(videoMessageWidget, 28, xgf));
        videoMessageWidget.v0 = withEndAction;
        if (withEndAction != null) {
            withEndAction.start();
        }
        return e5f.a;
    }
}
