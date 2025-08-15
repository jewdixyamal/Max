package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: vn1  reason: default package */
public final class vn1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallTopPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vn1(Continuation continuation, CallTopPanelWidget callTopPanelWidget) {
        super(2, continuation);
        this.Y = callTopPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vn1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vn1 vn1 = new vn1(continuation, this.Y);
        vn1.X = obj;
        return vn1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int intValue = ((Number) this.X).intValue();
        bc7[] bc7Arr = CallTopPanelWidget.o;
        this.Y.m0().setAddUserCount(intValue);
        return e5f.a;
    }
}
