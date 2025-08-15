package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: e89  reason: default package */
public final class e89 extends ffe implements a66 {
    public final /* synthetic */ l89 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e89(l89 l89, Continuation continuation) {
        super(2, continuation);
        this.X = l89;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e89(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        String str = this.X.i;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "Scrolling to last message", (Throwable) null);
        }
        MessageModel messageModel = (MessageModel) x53.q0(((l29) this.X.e.getValue()).a);
        e5f e5f = e5f.a;
        if (messageModel == null) {
            return e5f;
        }
        this.X.l.updateAndGet(new oe2(8));
        wwc.j(this.X.o, messageModel.c, true, 4);
        return e5f;
    }
}
