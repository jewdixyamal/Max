package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: h09  reason: default package */
public final class h09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h09 h09 = new h09(continuation, this.Y);
        h09.X = obj;
        return h09;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7Arr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        if (messageWriteWidget.getView() != null) {
            messageWriteWidget.q0().setInputEnabled(!booleanValue);
        }
        return e5f.a;
    }
}
