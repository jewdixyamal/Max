package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p52  reason: default package */
public final class p52 extends hu3 {
    public int X;
    public final /* synthetic */ q52 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p52(q52 q52, Continuation continuation) {
        super(continuation);
        this.Y = q52;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
