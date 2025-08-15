package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: caf  reason: default package */
public final class caf extends hu3 {
    public final /* synthetic */ wva X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public caf(wva wva, Continuation continuation) {
        super(continuation);
        this.X = wva;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.h(this);
    }
}
