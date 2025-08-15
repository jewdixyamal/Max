package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ir2  reason: default package */
public final class ir2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jr2 Y;
    public int Z;
    public jr2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ir2(jr2 jr2, Continuation continuation) {
        super(continuation);
        this.Y = jr2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
