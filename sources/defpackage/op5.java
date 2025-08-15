package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: op5  reason: default package */
public final class op5 extends hu3 {
    public int X;
    public final /* synthetic */ zn5 Y;
    public yn5 Z;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public op5(zn5 zn5, Continuation continuation) {
        super(continuation);
        this.Y = zn5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d((on5) null, this);
    }
}
