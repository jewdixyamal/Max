package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ro1  reason: default package */
public final class ro1 extends hu3 {
    public final /* synthetic */ so1 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ro1(so1 so1, Continuation continuation) {
        super(continuation);
        this.X = so1;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.c(0, this);
    }
}
