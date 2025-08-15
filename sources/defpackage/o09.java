package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: o09  reason: default package */
public final class o09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((o09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o09 o09 = new o09(continuation, this.Y);
        o09.X = obj;
        return o09;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        MessageWriteWidget.o0(this.Y, (dz8) this.X);
        return e5f.a;
    }
}
