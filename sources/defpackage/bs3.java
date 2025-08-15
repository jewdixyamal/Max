package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bs3  reason: default package */
public final class bs3 extends hu3 {
    public final /* synthetic */ ds3 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bs3(ds3 ds3, Continuation continuation) {
        super(continuation);
        this.X = ds3;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b(0, this);
    }
}
