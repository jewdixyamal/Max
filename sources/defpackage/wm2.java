package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wm2  reason: default package */
public final class wm2 extends hu3 {
    public final /* synthetic */ cn2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wm2(cn2 cn2, Continuation continuation) {
        super(continuation);
        this.X = cn2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.t(this);
    }
}
