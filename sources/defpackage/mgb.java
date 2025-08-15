package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mgb  reason: default package */
public final class mgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mgb(vgb vgb, Continuation continuation) {
        super(2, continuation);
        this.Y = vgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mgb) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mgb mgb = new mgb(this.Y, continuation);
        mgb.X = obj;
        return mgb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.Y.w0, (wm9) this.X);
        return e5f.a;
    }
}
