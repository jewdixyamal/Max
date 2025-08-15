package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bw  reason: default package */
public final class bw extends hu3 {
    public final /* synthetic */ bx X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bw(bx bxVar, Continuation continuation) {
        super(continuation);
        this.X = bxVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return bx.b(this.X, (pfc) null, 0, this);
    }
}
