package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o52  reason: default package */
public final class o52 extends hu3 {
    public int X;
    public final /* synthetic */ tk1 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o52(tk1 tk1, Continuation continuation) {
        super(continuation);
        this.Y = tk1;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
