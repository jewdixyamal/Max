package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fsd  reason: default package */
public final class fsd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gsd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fsd(gsd gsd, Continuation continuation) {
        super(2, continuation);
        this.Y = gsd;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fsd) n((b00) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fsd fsd = new fsd(this.Y, continuation);
        fsd.X = obj;
        return fsd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        gsd.y(this.Y, (b00) this.X);
        return e5f.a;
    }
}
