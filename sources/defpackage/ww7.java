package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ww7  reason: default package */
public final class ww7 extends ffe implements a66 {
    public final /* synthetic */ ax7 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ww7(ax7 ax7, Continuation continuation) {
        super(2, continuation);
        this.X = ax7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ww7) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ww7(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ((ita) this.X.c.getValue()).d(2, 1);
        return e5f.a;
    }
}
