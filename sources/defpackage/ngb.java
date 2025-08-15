package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ngb  reason: default package */
public final class ngb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ngb(vgb vgb, Continuation continuation) {
        super(2, continuation);
        this.Y = vgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ngb) n((jgb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ngb ngb = new ngb(this.Y, continuation);
        ngb.X = obj;
        return ngb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.Y.x0, (jgb) this.X);
        return e5f.a;
    }
}
