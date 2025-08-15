package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qta  reason: default package */
public final class qta extends ffe implements a66 {
    public final /* synthetic */ rta X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qta(rta rta, Continuation continuation) {
        super(2, continuation);
        this.X = rta;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qta) n((on5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qta(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        rta rta = this.X;
        rta.a.registerActivityLifecycleCallbacks(rta.c);
        return e5f.a;
    }
}
