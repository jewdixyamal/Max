package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: m21  reason: default package */
public final class m21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m21(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((m21) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m21 m21 = new m21(continuation, this.Y);
        m21.X = obj;
        return m21;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (((Boolean) this.X).booleanValue()) {
            bc7[] bc7Arr = CallBottomPanelWidget.s0;
            CallBottomPanelWidget callBottomPanelWidget = this.Y;
            callBottomPanelWidget.m0().a();
            rt3 rt3 = callBottomPanelWidget.Y;
            if (rt3 != null) {
                rt3.dismiss();
            }
            callBottomPanelWidget.Y = null;
        }
        return e5f.a;
    }
}
