package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u58  reason: default package */
public final class u58 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ew1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u58(Continuation continuation, ew1 ew1) {
        super(2, continuation);
        this.Y = ew1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((u58) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u58 u58 = new u58(continuation, this.Y);
        u58.X = obj;
        return u58;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.setVisibility(((Boolean) this.X).booleanValue() ? 0 : 8);
        return e5f.a;
    }
}
