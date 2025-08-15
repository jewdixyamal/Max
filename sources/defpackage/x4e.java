package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x4e  reason: default package */
public final class x4e extends hu3 {
    public final /* synthetic */ y4e X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x4e(y4e y4e, Continuation continuation) {
        super(continuation);
        this.X = y4e;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.c((String) null, 0, 0, this);
    }
}
