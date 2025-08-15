package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u03  reason: default package */
public final class u03 extends hu3 {
    public int X;
    public final /* synthetic */ v03 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u03(v03 v03, Continuation continuation) {
        super(continuation);
        this.Y = v03;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
