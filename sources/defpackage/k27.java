package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k27  reason: default package */
public final class k27 extends ffe implements a66 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ eaa Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k27(je7 je7, eaa eaa, Continuation continuation) {
        super(2, continuation);
        this.X = je7;
        this.Y = eaa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k27) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k27(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        String o = kp.o((zua) this.X.getValue(), this.Y.a);
        if (o == null) {
            o = "";
        }
        return new iqe(o);
    }
}
