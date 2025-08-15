package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sve  reason: default package */
public final class sve extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ tve Y;
    public int Z;
    public tve o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sve(tve tve, Continuation continuation) {
        super(continuation);
        this.Y = tve;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.p(this);
    }
}
