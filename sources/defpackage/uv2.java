package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uv2  reason: default package */
public final class uv2 extends hu3 {
    public int X;
    public final /* synthetic */ vv2 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uv2(vv2 vv2, Continuation continuation) {
        super(continuation);
        this.Y = vv2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
