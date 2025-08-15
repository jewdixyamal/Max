package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zd5  reason: default package */
public final class zd5 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ he5 Y;
    public int Z;
    public long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zd5(he5 he5, Continuation continuation) {
        super(continuation);
        this.Y = he5;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.q(0, this);
    }
}
