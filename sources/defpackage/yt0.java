package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yt0  reason: default package */
public final class yt0 extends hu3 {
    public final /* synthetic */ zt0 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt0(zt0 zt0, Continuation continuation) {
        super(continuation);
        this.X = zt0;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        Object D = this.X.D((j42) null, 0, 0, this);
        return D == tx3.a ? D : new i42(D);
    }
}
