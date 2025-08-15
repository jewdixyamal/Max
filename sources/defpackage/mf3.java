package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mf3  reason: default package */
public final class mf3 extends hu3 {
    public int X;
    public final /* synthetic */ ix2 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mf3(ix2 ix2, Continuation continuation) {
        super(continuation);
        this.Y = ix2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
