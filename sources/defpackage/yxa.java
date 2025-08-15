package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yxa  reason: default package */
public final class yxa extends hu3 {
    public int X;
    public final /* synthetic */ zxa Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yxa(zxa zxa, Continuation continuation) {
        super(continuation);
        this.Y = zxa;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
