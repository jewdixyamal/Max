package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: az2  reason: default package */
public final class az2 extends hu3 {
    public final /* synthetic */ jz2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az2(jz2 jz2, Continuation continuation) {
        super(continuation);
        this.X = jz2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.g(this);
    }
}
