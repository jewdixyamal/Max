package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;

/* renamed from: vi1  reason: default package */
public final class vi1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vi1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vi1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vi1 vi1 = new vi1(continuation, this.Y);
        vi1.X = obj;
        return vi1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        CallScreen callScreen = this.Y;
        if (booleanValue) {
            if (CallScreen.n0(callScreen).b() == null) {
                j03 n0 = CallScreen.n0(callScreen);
                if (!tpa.f(n0.c(), "call_vpn_panel_widget_tag")) {
                    VpnPanelWidget vpnPanelWidget = new VpnPanelWidget(callScreen.s0, (z84) null);
                    vpnPanelWidget.a = new qqd(6, (Object) callScreen);
                    coc coc = new coc(vpnPanelWidget, (String) null, (zu3) null, (zu3) null, false, -1);
                    coc.d("call_vpn_panel_widget_tag");
                    n0.a.R(coc);
                }
            }
        } else if (!booleanValue) {
            uu3 b = CallScreen.n0(callScreen).b();
            VpnPanelWidget vpnPanelWidget2 = b instanceof VpnPanelWidget ? (VpnPanelWidget) b : null;
            if (vpnPanelWidget2 != null) {
                vpnPanelWidget2.getRouter().B(vpnPanelWidget2);
                qqd qqd = vpnPanelWidget2.a;
                if (qqd != null) {
                    CallScreen.n0((CallScreen) qqd.b).a();
                }
                vpnPanelWidget2.a = null;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
