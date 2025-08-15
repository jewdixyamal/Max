package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.sdk.arch.Widget;

/* renamed from: u95  reason: default package */
public final class u95 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ExternalCallbackWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u95(Continuation continuation, ExternalCallbackWidget externalCallbackWidget) {
        super(2, continuation);
        this.Y = externalCallbackWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((u95) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u95 u95 = new u95(continuation, this.Y);
        u95.X = obj;
        return u95;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof c64;
        ExternalCallbackWidget externalCallbackWidget = this.Y;
        if (z) {
            vw7.c.R1((c64) wm9);
        } else if (wm9 instanceof p95) {
            wha wha = new wha((Widget) externalCallbackWidget);
            wha.g(((p95) wm9).b);
            wha.i();
        } else {
            boolean z2 = wm9 instanceof o95;
        }
        externalCallbackWidget.s0(false);
        return e5f.a;
    }
}
