package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jmb  reason: default package */
public final class jmb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cnb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jmb(cnb cnb, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jmb) n((mab) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jmb jmb = new jmb(this.Y, continuation);
        jmb.X = obj;
        return jmb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        mab mab = (mab) this.X;
        cnb cnb = this.Y;
        cnb.M0.setValue(mab.a);
        cnb.I0.setValue(mab.b);
        cnb.K0.setValue(mab.c);
        return e5f.a;
    }
}
