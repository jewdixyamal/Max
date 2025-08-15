package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: n21  reason: default package */
public final class n21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n21(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((n21) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n21 n21 = new n21(continuation, this.Y);
        n21.X = obj;
        return n21;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int intValue = ((Number) this.X).intValue();
        bc7[] bc7Arr = CallBottomPanelWidget.s0;
        this.Y.m0().setChatUnreadMessageCount(intValue);
        return e5f.a;
    }
}
