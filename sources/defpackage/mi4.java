package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mi4  reason: default package */
public final class mi4 extends hu3 {
    public int X;
    public final /* synthetic */ zq Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mi4(zq zqVar, Continuation continuation) {
        super(continuation);
        this.Y = zqVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
