package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bif  reason: default package */
public final class bif extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dif Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bif(dif dif, Continuation continuation) {
        super(2, continuation);
        this.Y = dif;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bif) n((ijf) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bif bif = new bif(this.Y, continuation);
        bif.X = obj;
        return bif;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        dif.i(this.Y, (ijf) this.X);
        return e5f.a;
    }
}
