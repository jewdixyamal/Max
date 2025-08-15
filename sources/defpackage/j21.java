package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: j21  reason: default package */
public final class j21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j21(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((j21) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j21 j21 = new j21(continuation, this.Y);
        j21.X = obj;
        return j21;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        CallBottomPanelWidget callBottomPanelWidget = this.Y;
        if (booleanValue) {
            bc7[] bc7Arr = CallBottomPanelWidget.s0;
            callBottomPanelWidget.m0().f();
        } else {
            bc7[] bc7Arr2 = CallBottomPanelWidget.s0;
            callBottomPanelWidget.m0().b();
        }
        return e5f.a;
    }
}
