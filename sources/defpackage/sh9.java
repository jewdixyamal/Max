package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sh9  reason: default package */
public final class sh9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sh9(uh9 uh9, Continuation continuation) {
        super(2, continuation);
        this.X = uh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sh9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sh9(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        a98 a98 = this.X.m;
        if (a98 != null) {
            a98.stop();
        }
        return e5f.a;
    }
}
