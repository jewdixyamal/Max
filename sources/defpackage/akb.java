package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: akb  reason: default package */
public final class akb extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bkb Y;
    public int Z;
    public bkb o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akb(bkb bkb, Continuation continuation) {
        super(continuation);
        this.Y = bkb;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.r(this);
    }
}
