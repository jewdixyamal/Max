package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gr  reason: default package */
public final class gr extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kr Y;
    public int Z;
    public kr o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gr(kr krVar, Continuation continuation) {
        super(continuation);
        this.Y = krVar;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.r(this);
    }
}
