package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xn4  reason: default package */
public final class xn4 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ao4 Y;
    public int Z;
    public ao4 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xn4(ao4 ao4, Continuation continuation) {
        super(continuation);
        this.Y = ao4;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
