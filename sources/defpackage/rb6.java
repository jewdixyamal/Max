package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rb6  reason: default package */
public final class rb6 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rb6(Object obj, Continuation continuation, Long l) {
        super(2, continuation);
        this.X = obj;
        this.Y = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rb6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rb6(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        cu8 cu8 = ((es8) this.X).a;
        return new q8d(new p8d(cu8.t0, cu8.b, this.Y.longValue()));
    }
}
