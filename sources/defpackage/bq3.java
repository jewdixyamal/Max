package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bq3  reason: default package */
public final class bq3 extends hu3 {
    public final /* synthetic */ cq3 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bq3(cq3 cq3, Continuation continuation) {
        super(continuation);
        this.X = cq3;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.t(this);
    }
}
