package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hz2  reason: default package */
public final class hz2 extends hu3 {
    public final /* synthetic */ jz2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hz2(jz2 jz2, Continuation continuation) {
        super(continuation);
        this.X = jz2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.u(0, this);
    }
}
