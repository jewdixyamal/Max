package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ts0  reason: default package */
public final class ts0 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ix Y;
    public int Z;
    public ua3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ts0(ix ixVar, Continuation continuation) {
        super(continuation);
        this.Y = ixVar;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c(this);
    }
}
