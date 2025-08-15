package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ff1  reason: default package */
public final class ff1 extends ffe implements a66 {
    public final /* synthetic */ of1 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ff1(of1 of1, Continuation continuation) {
        super(2, continuation);
        this.X = of1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ff1) n((pqa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ff1(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        of1 of1 = this.X;
        String str = of1.y0;
        j47.T(of1.a, ((w9a) of1.X).e(), (vx3) null, new mf1(of1, str, (Continuation) null), 2);
        return e5f.a;
    }
}
