package defpackage;

import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: tf1  reason: default package */
public final class tf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallOpponentsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tf1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.Y = callOpponentsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tf1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tf1 tf1 = new tf1(continuation, this.Y);
        tf1.X = obj;
        return tf1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wf1 wf1 = (wf1) this.X;
        bc7[] bc7Arr = CallOpponentsListWidget.H0;
        CallOpponentsListWidget callOpponentsListWidget = this.Y;
        callOpponentsListWidget.getClass();
        bc7[] bc7Arr2 = CallOpponentsListWidget.H0;
        bc7 bc7 = bc7Arr2[4];
        ((TextView) callOpponentsListWidget.w0.getValue()).setText(wf1.e);
        callOpponentsListWidget.q0().setTitle(wf1.e);
        bc7 bc72 = bc7Arr2[2];
        ((o7a) callOpponentsListWidget.u0.getValue()).b(wf1.b, wf1.c, wf1.d);
        if (wf1.f) {
            callOpponentsListWidget.q0().setRightActions((pka) callOpponentsListWidget.s0.getValue());
        } else {
            callOpponentsListWidget.q0().setRightActions(nka.a);
        }
        kl7 l = j1e.l();
        l.addAll(wf1.a);
        kl7 d = j1e.d(l);
        ((cf1) callOpponentsListWidget.D0.getValue()).E(d);
        boolean isEmpty = d.isEmpty();
        boolean z = !isEmpty;
        if (!z || br7.G(callOpponentsListWidget.o0())) {
            ViewStub o0 = callOpponentsListWidget.o0();
            bc7 bc73 = bc7Arr2[10];
            qm0 qm0 = callOpponentsListWidget.C0;
            br7.F(o0, (aba) qm0.getValue(), (k56) null);
            bc7 bc74 = bc7Arr2[10];
            int i = 8;
            ((aba) qm0.getValue()).setVisibility(isEmpty ? 0 : 8);
            bc7 bc75 = bc7Arr2[3];
            RecyclerView recyclerView = (RecyclerView) callOpponentsListWidget.v0.getValue();
            if (z) {
                i = 0;
            }
            recyclerView.setVisibility(i);
        }
        return e5f.a;
    }
}
