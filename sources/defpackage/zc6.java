package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* renamed from: zc6  reason: default package */
public final class zc6 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ GifViewerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zc6(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.Y = gifViewerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zc6) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zc6 zc6 = new zc6(continuation, this.Y);
        zc6.X = obj;
        return zc6;
    }

    public final Object o(Object obj) {
        gef gef;
        od2.a0(obj);
        ej2 ej2 = (ej2) this.X;
        GifViewerWidget gifViewerWidget = this.Y;
        String str = gifViewerWidget.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            boolean z = ej2.b != null;
            sb8 sb8 = ej2.a;
            long n0 = gifViewerWidget.n0();
            String m0 = gifViewerWidget.m0();
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
        if (sb82 != null && sb82.j() == gifViewerWidget.n0() && tpa.f(ej2.a.x(), gifViewerWidget.m0()) && (gef = ej2.b) != null) {
            gifViewerWidget.s0 = gef;
            dkf p0 = gifViewerWidget.p0();
            if (p0 != null) {
                p0.g(0.0f);
            }
            dkf p02 = gifViewerWidget.p0();
            if (p02 != null) {
                p02.L0(true);
            }
            dkf p03 = gifViewerWidget.p0();
            if (p03 != null) {
                p03.I0(ej2.b);
            }
            cjg cjg = gifViewerWidget.Z;
            if (cjg != null) {
                cjg.a();
            }
            gifViewerWidget.q0().a(gifViewerWidget.t0);
        }
        return e5f.a;
    }
}
