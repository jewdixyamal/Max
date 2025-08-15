package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: d69  reason: default package */
public final class d69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((d69) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d69 d69 = new d69(continuation, this.Y);
        d69.X = obj;
        return d69;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        twc twc = (twc) this.X;
        MessagesListWidget messagesListWidget = this.Y;
        String str = messagesListWidget.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Got new scrollEvent=" + twc, (Throwable) null);
        }
        if (twc.b) {
            messagesListWidget.r0().u1("ScrollEvent");
            messagesListWidget.s0().b();
        } else {
            messagesListWidget.r0().t1(new a69(messagesListWidget, 0));
        }
        return e5f.a;
    }
}
