package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: l21  reason: default package */
public final class l21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l21(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((l21) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l21 l21 = new l21(continuation, this.Y);
        l21.X = obj;
        return l21;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        zq0 zq0 = (zq0) this.X;
        bc7[] bc7Arr = CallBottomPanelWidget.s0;
        CallBottomPanelWidget callBottomPanelWidget = this.Y;
        r11 m0 = callBottomPanelWidget.m0();
        r11 m02 = callBottomPanelWidget.m0();
        vxd vxd = null;
        if (!(m02 instanceof View)) {
            m02 = null;
        }
        if (m02 != null && m02.getVisibility() == 0) {
            m0.setVideoEnabled(zq0.b);
            m38 m38 = zq0.a;
            m0.setMicrophoneEnabled(m38);
            m0.setRaiseHand(zq0.c);
            m0.setOpenChat(zq0.d);
            callBottomPanelWidget.m0().setAudioInfo(zq0.e);
            r11 m03 = callBottomPanelWidget.m0();
            boolean z = m38 == m38.b;
            if (((el1) callBottomPanelWidget.c.getValue()).u()) {
                if (z) {
                    vxd = j47.T(callBottomPanelWidget.getViewLifecycleScope(), (lx3) null, (vx3) null, new i21(callBottomPanelWidget, m03, (Continuation) null), 3);
                }
                callBottomPanelWidget.X.o1(callBottomPanelWidget, CallBottomPanelWidget.s0[1], vxd);
            }
        }
        return e5f.a;
    }
}
