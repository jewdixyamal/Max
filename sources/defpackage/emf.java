package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* renamed from: emf  reason: default package */
public final class emf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoViewerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public emf(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.Y = videoViewerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((emf) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        emf emf = new emf(continuation, this.Y);
        emf.X = obj;
        return emf;
    }

    public final Object o(Object obj) {
        gef gef;
        dkf B0;
        od2.a0(obj);
        ej2 ej2 = (ej2) this.X;
        VideoViewerWidget videoViewerWidget = this.Y;
        String str = videoViewerWidget.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            boolean z = ej2.b != null;
            sb8 sb8 = ej2.a;
            long n0 = videoViewerWidget.n0();
            String m0 = videoViewerWidget.m0();
            StringBuilder sb = new StringBuilder("Media viewer. Video page state changed, \n                        |hasContent:");
            sb.append(z);
            sb.append(", \n                        |item:");
            sb.append(sb8);
            sb.append(", curMsgId:");
            ms2.j(n0, ", \n                        |curAttachId:", m0, sb);
            sb.append("\n                        |");
            ir6.d(us7, str, x9e.c0(sb.toString()), (Throwable) null);
        }
        sb8 sb82 = ej2.a;
        if (sb82 != null && sb82.j() == videoViewerWidget.n0() && tpa.f(ej2.a.x(), videoViewerWidget.m0()) && (gef = ej2.b) != null) {
            videoViewerWidget.s0 = gef;
            dmf o0 = videoViewerWidget.o0();
            if (!(o0 == null || (B0 = ((ChatMediaViewerScreen) o0).B0()) == null)) {
                B0.I0(ej2.b);
            }
            cjg cjg = videoViewerWidget.Z;
            if (cjg != null) {
                cjg.a();
            }
            videoViewerWidget.p0().a(videoViewerWidget.t0);
        }
        return e5f.a;
    }
}
