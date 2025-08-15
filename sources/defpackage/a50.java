package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a50  reason: default package */
public final class a50 extends ffe implements a66 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ c50 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a50(je7 je7, c50 c50, Continuation continuation) {
        super(2, continuation);
        this.X = je7;
        this.Y = c50;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((a50) n((on5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a50(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        je7 je7 = this.X;
        c50 c50 = this.Y;
        ((uh9) ((ch9) je7.getValue())).e(c50.d);
        j47.T(c50.b, (lx3) null, (vx3) null, new z40(je7, c50, (Continuation) null), 3);
        return e5f.a;
    }
}
