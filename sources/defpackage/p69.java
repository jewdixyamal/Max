package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: p69  reason: default package */
public final class p69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((p69) n((a39) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p69 p69 = new p69(continuation, this.Y);
        p69.X = obj;
        return p69;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        a39 a39 = (a39) this.X;
        boolean f = tpa.f(a39, z29.a);
        MessagesListWidget messagesListWidget = this.Y;
        if (f) {
            bc7[] bc7Arr = MessagesListWidget.X0;
            messagesListWidget.u0().x0(messagesListWidget.A0.j() - 1);
        } else if (tpa.f(a39, w29.a)) {
            bc7[] bc7Arr2 = MessagesListWidget.X0;
            eg9 A = messagesListWidget.x0().A();
            A.getClass();
            A.f.m((Object) null, new yf9());
        } else if (a39 instanceof y29) {
            bc7[] bc7Arr3 = MessagesListWidget.X0;
            eg9 A2 = messagesListWidget.x0().A();
            int i = ((y29) a39).a;
            List D0 = x53.D0(((yf9) A2.f.getValue()).a);
            boolean isEmpty = D0.isEmpty();
            q0e q0e = A2.f;
            if (isEmpty) {
                q0e.m((Object) null, new yf9());
            } else {
                A2.d.invoke(D0, Integer.valueOf(i));
                q0e.m((Object) null, new yf9());
            }
        } else if (a39 instanceof x29) {
            c05 c05 = messagesListWidget.V0;
            if (c05 != null) {
                c05.q = true;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
