package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;

/* renamed from: q81  reason: default package */
public final class q81 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallHistoryScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q81(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.Y = callHistoryScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((q81) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q81 q81 = new q81(continuation, this.Y);
        q81.X = obj;
        return q81;
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        od2.a0(obj);
        s81 s81 = (s81) this.X;
        bc7[] bc7Arr = CallHistoryScreen.C0;
        CallHistoryScreen callHistoryScreen = this.Y;
        boolean z = ((s81) callHistoryScreen.n0().Z.getValue()).a;
        q7c q7c = callHistoryScreen.Y;
        if (!z) {
            u81 n0 = callHistoryScreen.n0();
            do {
                q0e = n0.Z;
                value = q0e.getValue();
                s81 s812 = (s81) value;
            } while (!q0e.c(value, new s81()));
            ((cla) q7c.T0(callHistoryScreen, CallHistoryScreen.C0[1])).a();
        } else {
            ((cla) q7c.T0(callHistoryScreen, CallHistoryScreen.C0[1])).c(String.valueOf(((s81) callHistoryScreen.n0().Z.getValue()).b.size()), Collections.singletonList(new zka(0, c0c.call_history_item_call_toolbar_action_remove, ytb.ic_delete_22)), new o81(callHistoryScreen, 0), new l(18, callHistoryScreen));
        }
        ((ela) ((cla) q7c.T0(callHistoryScreen, CallHistoryScreen.C0[1])).z0.getValue()).setSelectionTitle(String.valueOf(((s81) callHistoryScreen.n0().Z.getValue()).b.size()));
        return e5f.a;
    }
}
