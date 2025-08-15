package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a80  reason: default package */
public final class a80 extends hu3 {
    public final /* synthetic */ b80 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a80(b80 b80, Continuation continuation) {
        super(continuation);
        this.X = b80;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a((afc) null, this);
    }
}
