package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ul2  reason: default package */
public final class ul2 extends hu3 {
    public final /* synthetic */ cm2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ul2(cm2 cm2, Continuation continuation) {
        super(continuation);
        this.X = cm2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b(this);
    }
}
