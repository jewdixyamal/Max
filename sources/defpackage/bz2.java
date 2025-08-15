package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bz2  reason: default package */
public final class bz2 extends ffe implements a66 {
    public final /* synthetic */ jz2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bz2(jz2 jz2, Continuation continuation) {
        super(2, continuation);
        this.X = jz2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bz2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bz2(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int i = jz2.Y;
        p82 l = this.X.l();
        l.getClass();
        return (e52) l.e0("create-saved-messages", new b82(l, 0));
    }
}
