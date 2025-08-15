package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z62  reason: default package */
public final class z62 extends hu3 {
    public int X;
    public final /* synthetic */ a72 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z62(a72 a72, Continuation continuation) {
        super(continuation);
        this.Y = a72;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
