package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: up5  reason: default package */
public final class up5 extends hu3 {
    public final /* synthetic */ ix2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public up5(ix2 ix2, Continuation continuation) {
        super(continuation);
        this.X = ix2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b((mn5) null, this);
    }
}
