package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vw2  reason: default package */
public final class vw2 extends hu3 {
    public int X;
    public final /* synthetic */ rw2 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vw2(rw2 rw2, Continuation continuation) {
        super(continuation);
        this.Y = rw2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
