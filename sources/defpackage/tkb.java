package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tkb  reason: default package */
public final class tkb extends hu3 {
    public final /* synthetic */ vkb X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tkb(vkb vkb, Continuation continuation) {
        super(continuation);
        this.X = vkb;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.i((Long) null, this);
    }
}
