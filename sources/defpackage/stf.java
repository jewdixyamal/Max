package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: stf  reason: default package */
public final class stf extends ffe implements a66 {
    public final /* synthetic */ ouf X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public stf(ouf ouf, Continuation continuation) {
        super(2, continuation);
        this.X = ouf;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((stf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new stf(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        w97 w97 = this.X.l;
        if (w97 instanceof hn0) {
            ((hn0) w97).b(new tuf(evf.REQUEST_ACCESS));
        } else if (w97 instanceof ln0) {
            ((ln0) w97).b(new tuf(evf.UPDATE_TOKEN));
        } else if (w97 instanceof in0) {
            ((in0) w97).b(new Throwable());
        }
        this.X.l = null;
        return e5f.a;
    }
}
