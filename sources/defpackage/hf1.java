package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hf1  reason: default package */
public final class hf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hf1(of1 of1, Continuation continuation) {
        super(2, continuation);
        this.Y = of1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hf1) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hf1 hf1 = new hf1(this.Y, continuation);
        hf1.X = obj;
        return hf1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.Y.E0, (wm9) this.X);
        return e5f.a;
    }
}
