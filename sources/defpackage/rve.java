package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rve  reason: default package */
public final class rve extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ tve Y;
    public int Z;
    public tve o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rve(tve tve, Continuation continuation) {
        super(continuation);
        this.Y = tve;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.o(this);
    }
}
