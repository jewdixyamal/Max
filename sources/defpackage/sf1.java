package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: sf1  reason: default package */
public final class sf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallOpponentsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sf1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.Y = callOpponentsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sf1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sf1 sf1 = new sf1(continuation, this.Y);
        sf1.X = obj;
        return sf1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        na naVar = (na) this.X;
        bc7[] bc7Arr = CallOpponentsListWidget.H0;
        CallOpponentsListWidget callOpponentsListWidget = this.Y;
        callOpponentsListWidget.getClass();
        ft.g((TextView) callOpponentsListWidget.z0.T0(callOpponentsListWidget, CallOpponentsListWidget.H0[7]), !naVar.b.isEmpty(), 0, (m56) null, 6);
        ((ja) callOpponentsListWidget.E0.getValue()).E(naVar.b);
        return e5f.a;
    }
}
