package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x3d  reason: default package */
public final class x3d extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y3d Y;
    public int Z;
    public y3d o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x3d(y3d y3d, Continuation continuation) {
        super(continuation);
        this.Y = y3d;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
