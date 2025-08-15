package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vjb  reason: default package */
public final class vjb extends hu3 {
    public int X;
    public final /* synthetic */ tjb Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vjb(tjb tjb, Continuation continuation) {
        super(continuation);
        this.Y = tjb;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
