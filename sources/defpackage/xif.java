package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xif  reason: default package */
public final class xif extends hu3 {
    public final /* synthetic */ ejf X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xif(ejf ejf, Continuation continuation) {
        super(continuation);
        this.X = ejf;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.f(0, this);
    }
}
