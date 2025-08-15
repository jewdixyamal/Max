package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: um2  reason: default package */
public final class um2 extends ffe implements a66 {
    public final /* synthetic */ cn2 X;
    public final /* synthetic */ e52 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public um2(cn2 cn2, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.X = cn2;
        this.Y = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((um2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new um2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        cn2 cn2 = this.X;
        cn2.getClass();
        e52 e52 = this.Y;
        if (e52.I()) {
            k92 k92 = e52.b;
            if (k92.g()) {
                ((k4a) ((pk) cn2.p.getValue())).j(k92.a);
            }
        }
        return e5f.a;
    }
}
