package defpackage;

import android.view.Surface;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* renamed from: fmf  reason: default package */
public final class fmf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoViewerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fmf(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.Y = videoViewerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fmf) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fmf fmf = new fmf(continuation, this.Y);
        fmf.X = obj;
        return fmf;
    }

    public final Object o(Object obj) {
        dkf B0;
        od2.a0(obj);
        q35 q35 = (q35) this.X;
        bc7[] bc7Arr = VideoViewerWidget.u0;
        VideoViewerWidget videoViewerWidget = this.Y;
        videoViewerWidget.getClass();
        if (q35 instanceof l35) {
            l35 l35 = (l35) q35;
            if (l35.a.j() == videoViewerWidget.n0() && tpa.f(l35.a.x(), videoViewerWidget.m0())) {
                hm9.m(videoViewerWidget.a, "Media viewer. Clear prev page", new Object[0]);
                gef gef = videoViewerWidget.s0;
                boolean z = gef != null && gef.c0();
                videoViewerWidget.s0 = null;
                dmf o0 = videoViewerWidget.o0();
                if (!(o0 == null || (B0 = ((ChatMediaViewerScreen) o0).B0()) == null)) {
                    ck2 ck2 = (ck2) videoViewerWidget.o.getValue();
                    long n0 = videoViewerWidget.n0();
                    String m0 = videoViewerWidget.m0();
                    long F0 = B0.F0();
                    long G0 = B0.G0();
                    ck2.getClass();
                    xq9 xq9 = xq9.a;
                    tj2 tj2 = r4;
                    tj2 tj22 = new tj2(ck2, n0, m0, F0, G0, z, (Continuation) null);
                    j47.S(ck2.a, xq9, vx3.c, tj2);
                    B0.pause();
                    B0.M0((Surface) null);
                    B0.N0();
                }
                videoViewerWidget.p0().b();
            }
        }
        return e5f.a;
    }
}
