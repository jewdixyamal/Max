package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n69  reason: default package */
public final class n69 extends hu3 {
    public int X;
    public final /* synthetic */ o69 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n69(o69 o69, Continuation continuation) {
        super(continuation);
        this.Y = o69;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
