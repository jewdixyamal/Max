package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r3b  reason: default package */
public final class r3b extends ffe implements a66 {
    public final /* synthetic */ o23 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r3b(o23 o23, Continuation continuation) {
        super(2, continuation);
        this.X = o23;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((r3b) n((on5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new r3b(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e60 e60 = (e60) this.X.a;
        ((uh9) e60.c).e(e60.t0);
        sx3 sx3 = e60.o;
        pag.n(sx3.getCoroutineContext()).invokeOnCompletion(new l(13, e60));
        j47.T(sx3, ((w9a) e60.a).a(), (vx3) null, new c60(e60, (Continuation) null), 2);
        return e5f.a;
    }
}
