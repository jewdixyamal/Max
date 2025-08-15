package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cjc  reason: default package */
public final class cjc extends ffe implements a66 {
    public final /* synthetic */ djc X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cjc(djc djc, Continuation continuation) {
        super(2, continuation);
        this.X = djc;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        e5f e5f = e5f.a;
        ((cjc) n(valueOf, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cjc(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        djc djc = this.X;
        hm9.m(djc.X, "executeTasks", new Object[0]);
        r9d.y((s8g) djc.a.getValue());
        ((jy8) djc.b.getValue()).a();
        return e5f.a;
    }
}
