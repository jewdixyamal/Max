package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kh2  reason: default package */
public final class kh2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gi2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kh2(gi2 gi2, Continuation continuation) {
        super(2, continuation);
        this.Y = gi2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kh2) n((zc8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kh2 kh2 = new kh2(this.Y, continuation);
        kh2.X = obj;
        return kh2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.B0.updateAndGet(new iz0(5, (zc8) this.X));
        return e5f.a;
    }
}
