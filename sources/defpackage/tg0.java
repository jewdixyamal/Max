package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tg0  reason: default package */
public final class tg0 extends ffe implements a66 {
    public final /* synthetic */ ug0 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tg0(ug0 ug0, Continuation continuation) {
        super(2, continuation);
        this.X = ug0;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tg0) n((on5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tg0(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ug0 ug0 = this.X;
        ug0.a.registerActivityLifecycleCallbacks(ug0.f);
        return e5f.a;
    }
}
