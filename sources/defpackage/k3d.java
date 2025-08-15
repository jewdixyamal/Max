package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k3d  reason: default package */
public final class k3d extends hu3 {
    public int X;
    public final /* synthetic */ l3d Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k3d(l3d l3d, Continuation continuation) {
        super(continuation);
        this.Y = l3d;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
