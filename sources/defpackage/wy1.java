package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wy1  reason: default package */
public final class wy1 extends hu3 {
    public final /* synthetic */ tk1 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wy1(tk1 tk1, Continuation continuation) {
        super(continuation);
        this.X = tk1;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a((Object) null, this);
    }
}
