package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nfe  reason: default package */
public final class nfe extends hu3 {
    public final /* synthetic */ cge X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nfe(cge cge, Continuation continuation) {
        super(continuation);
        this.X = cge;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return cge.c(this.X, (Throwable) null, this);
    }
}
