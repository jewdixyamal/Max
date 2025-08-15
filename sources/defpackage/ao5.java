package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ao5  reason: default package */
public final class ao5 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bo5 Y;
    public int Z;
    public bo5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ao5(bo5 bo5, Continuation continuation) {
        super(continuation);
        this.Y = bo5;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
