package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ob1  reason: default package */
public final class ob1 extends ffe implements a66 {
    public final /* synthetic */ vb1 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ob1(vb1 vb1, Continuation continuation) {
        super(2, continuation);
        this.X = vb1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ob1) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ob1(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        vb1 vb1 = this.X;
        vb1.z0 = new Long(((k4a) ((pk) vb1.Y.getValue())).A(c37.D(this.X.b), true));
        return e5f.a;
    }
}
