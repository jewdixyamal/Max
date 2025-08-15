package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xn5  reason: default package */
public final class xn5 extends hu3 {
    public int X;
    public final /* synthetic */ yn5 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xn5(yn5 yn5, Continuation continuation) {
        super(continuation);
        this.Y = yn5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
