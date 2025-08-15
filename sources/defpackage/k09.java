package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: k09  reason: default package */
public final class k09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((k09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k09 k09 = new k09(continuation, this.Y);
        k09.X = obj;
        return k09;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        CharSequence charSequence = (CharSequence) this.X;
        bc7[] bc7Arr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.q0().setText(charSequence);
        messageWriteWidget.q0().h(charSequence.length());
        return e5f.a;
    }
}
