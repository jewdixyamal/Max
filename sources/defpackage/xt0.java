package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xt0  reason: default package */
public final class xt0 extends hu3 {
    public final /* synthetic */ zt0 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xt0(zt0 zt0, Continuation continuation) {
        super(continuation);
        this.X = zt0;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        Object C = zt0.C(this.X, this);
        return C == tx3.a ? C : new i42(C);
    }
}
