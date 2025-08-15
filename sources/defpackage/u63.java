package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u63  reason: default package */
public final class u63 extends hu3 {
    public final /* synthetic */ v63 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u63(v63 v63, Continuation continuation) {
        super(continuation);
        this.X = v63;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a((Object) null, this);
    }
}
