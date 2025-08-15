package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: aif  reason: default package */
public final class aif extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dif Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aif(dif dif, Continuation continuation) {
        super(2, continuation);
        this.Y = dif;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((aif) n((b00) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        aif aif = new aif(this.Y, continuation);
        aif.X = obj;
        return aif;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = dif.L0;
        this.Y.y((b00) this.X);
        return e5f.a;
    }
}
