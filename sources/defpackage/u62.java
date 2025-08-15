package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u62  reason: default package */
public final class u62 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k72 Y;
    public int Z;
    public k72 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u62(k72 k72, Continuation continuation) {
        super(continuation);
        this.Y = k72;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.n(this);
    }
}
