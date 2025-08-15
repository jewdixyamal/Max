package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h22  reason: default package */
public final class h22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l22 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h22(l22 l22, Continuation continuation) {
        super(2, continuation);
        this.Y = l22;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h22) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h22 h22 = new h22(this.Y, continuation);
        h22.X = obj;
        return h22;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.Y.Z, (wm9) this.X);
        return e5f.a;
    }
}
