package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ara  reason: default package */
public final class ara extends hu3 {
    public int X;
    public final /* synthetic */ tqa Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ara(tqa tqa, Continuation continuation) {
        super(continuation);
        this.Y = tqa;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
