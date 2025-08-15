package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qo1  reason: default package */
public final class qo1 extends hu3 {
    public final /* synthetic */ so1 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qo1(so1 so1, Continuation continuation) {
        super(continuation);
        this.X = so1;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return so1.a(this.X, this);
    }
}
