package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lb  reason: default package */
public final class lb extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ pb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lb(Object obj, Continuation continuation, pb pbVar) {
        super(2, continuation);
        this.X = obj;
        this.Y = pbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lb(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return this.Y.b((uj3) this.X);
    }
}
