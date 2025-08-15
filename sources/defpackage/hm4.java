package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hm4  reason: default package */
public final class hm4 extends hu3 {
    public final /* synthetic */ y40 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hm4(y40 y40, Continuation continuation) {
        super(continuation);
        this.X = y40;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a((Object) null, this);
    }
}
