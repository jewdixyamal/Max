package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b21  reason: default package */
public final class b21 extends hu3 {
    public int X;
    public final /* synthetic */ pw Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b21(pw pwVar, Continuation continuation) {
        super(continuation);
        this.Y = pwVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
