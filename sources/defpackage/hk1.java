package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hk1  reason: default package */
public final class hk1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ el1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hk1(el1 el1, Continuation continuation) {
        super(2, continuation);
        this.Y = el1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hk1) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hk1 hk1 = new hk1(this.Y, continuation);
        hk1.X = obj;
        return hk1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.Y.M0, (wm9) this.X);
        return e5f.a;
    }
}
