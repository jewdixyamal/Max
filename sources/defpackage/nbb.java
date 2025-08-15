package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nbb  reason: default package */
public final class nbb extends hu3 {
    public final /* synthetic */ obb X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nbb(obb obb, Continuation continuation) {
        super(continuation);
        this.X = obb;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.f(this);
    }
}
