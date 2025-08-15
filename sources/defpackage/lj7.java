package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lj7  reason: default package */
public final class lj7 extends hu3 {
    public int X;
    public final /* synthetic */ mj7 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lj7(mj7 mj7, Continuation continuation) {
        super(continuation);
        this.Y = mj7;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
