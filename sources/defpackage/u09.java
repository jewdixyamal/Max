package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u09  reason: default package */
public final class u09 extends hu3 {
    public int X;
    public final /* synthetic */ s09 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u09(s09 s09, Continuation continuation) {
        super(continuation);
        this.Y = s09;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
