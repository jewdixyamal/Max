package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: x09  reason: default package */
public final class x09 extends ffe implements a66 {
    public /* synthetic */ int X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        e5f e5f = e5f.a;
        ((x09) n(valueOf, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x09 x09 = new x09(continuation, this.Y);
        x09.X = ((Number) obj).intValue();
        return x09;
    }

    public final Object o(Object obj) {
        Object value;
        od2.a0(obj);
        int i = this.X;
        bc7[] bc7Arr = MessageWriteWidget.F0;
        q0e q0e = this.Y.w0().H0;
        do {
            value = q0e.getValue();
            ((Number) value).intValue();
        } while (!q0e.c(value, Integer.valueOf(i)));
        return e5f.a;
    }
}
