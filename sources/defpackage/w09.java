package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: w09  reason: default package */
public final class w09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((w09) n((cz8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w09 w09 = new w09(continuation, this.Y);
        w09.X = obj;
        return w09;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        cz8 cz8 = (cz8) this.X;
        boolean z = false;
        if (cz8 != null && cz8.a) {
            z = true;
        }
        bc7[] bc7Arr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.q0().setLeftOuterIconVisible(z);
        if (z) {
            messageWriteWidget.q0().setLeftOuterIconOnClickListener(new e09(0, messageWriteWidget.v0(), xz8.class, "onMiniAppClick", "onMiniAppClick$message_write_widget_release()V", 0, 2));
            messageWriteWidget.q0().setLeftOuterIconText(cz8 != null ? cz8.b : null);
        }
        return e5f.a;
    }
}
