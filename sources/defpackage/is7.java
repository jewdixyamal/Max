package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: is7  reason: default package */
public final class is7 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ js7 Y;
    public int Z;
    public js7 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public is7(js7 js7, Continuation continuation) {
        super(continuation);
        this.Y = js7;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.f(false, this);
    }
}
