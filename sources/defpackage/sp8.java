package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sp8  reason: default package */
public final class sp8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ tya Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sp8(Object obj, Continuation continuation, tya tya) {
        super(2, continuation);
        this.X = obj;
        this.Y = tya;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sp8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sp8(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return this.Y.a((uj3) this.X, false);
    }
}
