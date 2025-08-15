package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o3d  reason: default package */
public final class o3d extends hu3 {
    public int X;
    public final /* synthetic */ zq Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o3d(zq zqVar, Continuation continuation) {
        super(continuation);
        this.Y = zqVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
