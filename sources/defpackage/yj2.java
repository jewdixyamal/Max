package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yj2  reason: default package */
public final class yj2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ck2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yj2(ck2 ck2, Continuation continuation) {
        super(2, continuation);
        this.Y = ck2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yj2) n((zc8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yj2 yj2 = new yj2(this.Y, continuation);
        yj2.X = obj;
        return yj2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.I0.updateAndGet(new iz0(5, (zc8) this.X));
        return e5f.a;
    }
}
