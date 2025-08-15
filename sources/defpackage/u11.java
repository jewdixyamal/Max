package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u11  reason: default package */
public final class u11 extends ffe implements a66 {
    public /* synthetic */ long X;
    public final /* synthetic */ je7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u11(je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u11) n(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u11 u11 = new u11(this.Y, continuation);
        u11.X = ((Number) obj).longValue();
        return u11;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return ((jz2) ((iy2) this.Y.getValue())).m(this.X);
    }
}
