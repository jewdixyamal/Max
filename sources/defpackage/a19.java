package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: a19  reason: default package */
public final class a19 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a19(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((a19) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a19 a19 = new a19(continuation, this.Y);
        a19.X = obj;
        return a19;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7Arr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.q0().setKeyboardVisible(booleanValue);
        ywe ywe = messageWriteWidget.D0;
        if (ywe != null) {
            ywe.dismiss();
        }
        messageWriteWidget.D0 = null;
        return e5f.a;
    }
}
