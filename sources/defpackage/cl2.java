package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cl2  reason: default package */
public final class cl2 extends hu3 {
    public final /* synthetic */ fl2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cl2(fl2 fl2, Continuation continuation) {
        super(continuation);
        this.X = fl2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return fl2.b(this.X, (fs8) null, this);
    }
}
