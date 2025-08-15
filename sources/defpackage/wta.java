package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wta  reason: default package */
public final class wta extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aua Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wta(aua aua, Continuation continuation) {
        super(2, continuation);
        this.Y = aua;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wta) n((bua) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wta wta = new wta(this.Y, continuation);
        wta.X = obj;
        return wta;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        aua aua = this.Y;
        aua.a(aua, "gallery", aua.b(aua, (bua) this.X));
        return e5f.a;
    }
}
