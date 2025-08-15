package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cya  reason: default package */
public final class cya extends hu3 {
    public int X;
    public final /* synthetic */ zxa Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cya(zxa zxa, Continuation continuation) {
        super(continuation);
        this.Y = zxa;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
