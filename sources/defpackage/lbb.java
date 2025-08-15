package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lbb  reason: default package */
public final class lbb extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ obb Y;
    public int Z;
    public obb o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lbb(obb obb, Continuation continuation) {
        super(continuation);
        this.Y = obb;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}
