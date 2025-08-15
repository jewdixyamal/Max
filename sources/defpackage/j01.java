package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j01  reason: default package */
public final class j01 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k01 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j01(k01 k01, Continuation continuation) {
        super(2, continuation);
        this.Y = k01;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((j01) n((aa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j01 j01 = new j01(this.Y, continuation);
        j01.X = obj;
        return j01;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.r((aa) this.X);
        return e5f.a;
    }
}
