package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: y91  reason: default package */
public final class y91 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallIndicatorWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y91(CallIndicatorWidget callIndicatorWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = callIndicatorWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((y91) n((m91) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y91 y91 = new y91(this.Y, continuation);
        y91.X = obj;
        return y91;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        m91 m91 = (m91) this.X;
        o91 m0 = CallIndicatorWidget.m0(this.Y);
        m0.setTitle(m91.a);
        m0.setIndicatorState(m91.b);
        return e5f.a;
    }
}
