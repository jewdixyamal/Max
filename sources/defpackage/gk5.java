package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gk5  reason: default package */
public final class gk5 extends hu3 {
    public final /* synthetic */ ik5 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gk5(ik5 ik5, Continuation continuation) {
        super(continuation);
        this.X = ik5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.e(this);
    }
}
