package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hr1  reason: default package */
public final class hr1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ir1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hr1(ir1 ir1, Continuation continuation) {
        super(2, continuation);
        this.Y = ir1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hr1) n((u9f) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hr1 hr1 = new hr1(this.Y, continuation);
        hr1.X = obj;
        return hr1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        u9f u9f = (u9f) this.X;
        u9f u9f2 = u9f.a;
        ir1 ir1 = this.Y;
        if (u9f == u9f2) {
            d04 d04 = (d04) ir1.b().getValue();
            bt1 bt1 = (bt1) ir1.m.getValue();
            String str = d04.c;
            bt1.getClass();
            bt1.c(bt1, "BAD_CONNECTION_ALERT", str, "VPN", (Long) null, (String) null, (String) null, d04.h, 56);
        }
        ir1.o(u9f);
        return e5f.a;
    }
}
