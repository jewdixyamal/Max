package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: oi1  reason: default package */
public final class oi1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oi1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((oi1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oi1 oi1 = new oi1(continuation, this.Y);
        oi1.X = obj;
        return oi1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        cn1 cn1 = (cn1) this.X;
        yxc yxc = CallScreen.R0;
        CallScreen callScreen = this.Y;
        callScreen.getClass();
        int i = cn1 != null ? cn1.a : 0;
        int i2 = i == 0 ? -1 : hi1.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 == 1) {
            pn1 w0 = callScreen.w0();
            if (w0 != null) {
                CharSequence charSequence = cn1.b;
                CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) w0;
                if (callTopPanelWidget.getView() != null) {
                    callTopPanelWidget.m0().setTitle(charSequence);
                }
            }
            pn1 w02 = callScreen.w0();
            if (w02 != null) {
                CharSequence charSequence2 = cn1.c;
                CallTopPanelWidget callTopPanelWidget2 = (CallTopPanelWidget) w02;
                if (callTopPanelWidget2.getView() != null) {
                    callTopPanelWidget2.m0().setStatus(charSequence2);
                }
            }
        } else if (i2 == 2) {
            pn1 w03 = callScreen.w0();
            if (w03 != null) {
                CallTopPanelWidget callTopPanelWidget3 = (CallTopPanelWidget) w03;
                if (callTopPanelWidget3.getView() != null) {
                    callTopPanelWidget3.m0().setTitle((CharSequence) null);
                }
            }
            pn1 w04 = callScreen.w0();
            if (w04 != null) {
                CallTopPanelWidget callTopPanelWidget4 = (CallTopPanelWidget) w04;
                if (callTopPanelWidget4.getView() != null) {
                    callTopPanelWidget4.m0().setStatus((CharSequence) null);
                }
            }
        }
        return e5f.a;
    }
}
