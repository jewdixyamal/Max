package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: un1  reason: default package */
public final class un1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallTopPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public un1(Continuation continuation, CallTopPanelWidget callTopPanelWidget) {
        super(2, continuation);
        this.Y = callTopPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((un1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        un1 un1 = new un1(continuation, this.Y);
        un1.X = obj;
        return un1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        dxe dxe = (dxe) this.X;
        bc7[] bc7Arr = CallTopPanelWidget.o;
        on1 m0 = this.Y.m0();
        m0.setVisibility(dxe.d ? 0 : 8);
        if (m0.getVisibility() == 0) {
            m0.setMode(dxe.c);
            m0.c(dxe.e);
            m0.d(dxe.f, dxe.i);
            m0.setMoreState(dxe.g);
            m0.setAddUserState(dxe.h);
            m0.e(dxe.b);
        }
        return e5f.a;
    }
}
