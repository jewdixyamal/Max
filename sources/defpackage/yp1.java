package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;

/* renamed from: yp1  reason: default package */
public final class yp1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallWaitingRoomEventsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yp1(Continuation continuation, CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        super(2, continuation);
        this.Y = callWaitingRoomEventsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yp1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yp1 yp1 = new yp1(continuation, this.Y);
        yp1.X = obj;
        return yp1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        up1 up1 = (up1) this.X;
        bc7[] bc7Arr = CallWaitingRoomEventsWidget.v0;
        CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = this.Y;
        callWaitingRoomEventsWidget.getClass();
        boolean z = up1 instanceof tp1;
        q7c q7c = callWaitingRoomEventsWidget.s0;
        if (z) {
            if (callWaitingRoomEventsWidget.m0().findViewById(y7a.R1) != null) {
                ft.g(callWaitingRoomEventsWidget.n0(), false, 0, (m56) null, 6);
            }
            FrameLayout m0 = callWaitingRoomEventsWidget.m0();
            int i = y7a.X1;
            if (m0.findViewById(i) != null) {
                ft.g((lk3) q7c.T0(callWaitingRoomEventsWidget, CallWaitingRoomEventsWidget.v0[0]), true, 0, (m56) null, 6);
            } else {
                FrameLayout m02 = callWaitingRoomEventsWidget.m0();
                lk3 lk3 = new lk3(callWaitingRoomEventsWidget.getContext(), (AttributeSet) null);
                lk3.setId(i);
                lk3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                lk3.setCustomTheme(qp4.u0.p(lk3).c);
                lk3.setCallButtonMode(jk3.b);
                lk3.setMessage(lk3.getContext().getString(b8a.S1));
                lk3.setVisibility(0);
                m02.addView(lk3);
            }
        } else if (up1 instanceof rp1) {
            if (callWaitingRoomEventsWidget.m0().findViewById(y7a.X1) != null) {
                ft.g((lk3) q7c.T0(callWaitingRoomEventsWidget, CallWaitingRoomEventsWidget.v0[0]), false, 0, (m56) null, 6);
            }
            FrameLayout m03 = callWaitingRoomEventsWidget.m0();
            int i2 = y7a.R1;
            if (m03.findViewById(i2) != null) {
                ft.g(callWaitingRoomEventsWidget.n0(), true, 0, (m56) null, 6);
            } else {
                FrameLayout m04 = callWaitingRoomEventsWidget.m0();
                sf9 sf9 = new sf9(callWaitingRoomEventsWidget.getContext(), (AttributeSet) null);
                sf9.setId(i2);
                sf9.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                sf9.setVisibility(0);
                m04.addView(sf9);
                callWaitingRoomEventsWidget.n0().setVisibility(0);
            }
        }
        if (!(up1 instanceof qp1)) {
            if (up1 instanceof sp1) {
                callWaitingRoomEventsWidget.o0(((sp1) up1).a);
            } else if (z) {
                lk3 lk32 = (lk3) q7c.T0(callWaitingRoomEventsWidget, CallWaitingRoomEventsWidget.v0[0]);
                tp1 tp1 = (tp1) up1;
                uc0 uc0 = tp1.d;
                lk32.O(uc0.a, uc0.b, tp1.e);
                lk32.setName(tp1.b.b(lk32.getContext()));
                lk32.setMessage(tp1.c.b(lk32.getContext()));
                lk32.N();
                je7 je7 = callWaitingRoomEventsWidget.Y;
                lk32.Q((LayerDrawable) ((lrf) je7.getValue()).b.getValue(), (LayerDrawable) ((lrf) je7.getValue()).c.getValue(), new zp1(callWaitingRoomEventsWidget, 0, up1));
                lk32.setOnClickListener((View.OnClickListener) null);
            } else if (up1 instanceof rp1) {
                sf9 n0 = callWaitingRoomEventsWidget.n0();
                rp1 rp1 = (rp1) up1;
                n0.setAvatars(rp1.c);
                n0.setName(rp1.a);
                n0.setMessage(rp1.b);
                tu0.K(n0, 300, new hq(callWaitingRoomEventsWidget, 1, up1));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
