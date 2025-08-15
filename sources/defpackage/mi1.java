package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: mi1  reason: default package */
public final class mi1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mi1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mi1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mi1 mi1 = new mi1(continuation, this.Y);
        mi1.X = obj;
        return mi1;
    }

    /* JADX WARNING: type inference failed for: r11v9, types: [uu3] */
    /* JADX WARNING: type inference failed for: r10v5, types: [uu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            defpackage.od2.a0(r11)
            java.lang.Object r11 = r10.X
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            yxc r0 = one.me.calls.ui.ui.call.CallScreen.R0
            one.me.calls.ui.ui.call.CallScreen r10 = r10.Y
            r0 = 0
            if (r11 != 0) goto L_0x0027
            j03 r10 = r10.x0()
            uu3 r10 = r10.b()
            boolean r11 = r10 instanceof one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget
            if (r11 == 0) goto L_0x0021
            r0 = r10
            one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget r0 = (one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget) r0
        L_0x0021:
            if (r0 == 0) goto L_0x0073
            one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget.p0(r0)
            goto L_0x0073
        L_0x0027:
            j03 r11 = r10.x0()
            uu3 r11 = r11.b()
            if (r11 == 0) goto L_0x0046
            j03 r11 = r10.x0()
            uu3 r11 = r11.b()
            boolean r1 = r11 instanceof one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget
            if (r1 == 0) goto L_0x0040
            r0 = r11
            one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget r0 = (one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget) r0
        L_0x0040:
            if (r0 == 0) goto L_0x0073
            r10.r0(r0)
            goto L_0x0073
        L_0x0046:
            j03 r11 = r10.x0()
            java.lang.String r1 = r11.c()
            java.lang.String r2 = "call_waiting_room_widget_tag"
            boolean r1 = defpackage.tpa.f(r1, r2)
            if (r1 != 0) goto L_0x0073
            one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget r4 = new one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget
            java.lang.String r1 = r10.s0
            r4.<init>(r1, r0)
            r10.r0(r4)
            coc r10 = new coc
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            r9 = -1
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.d(r2)
            znc r11 = r11.a
            r11.R(r10)
        L_0x0073:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi1.o(java.lang.Object):java.lang.Object");
    }
}
