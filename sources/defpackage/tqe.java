package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tqe  reason: default package */
public final class tqe extends ffe implements a66 {
    public /* synthetic */ float X;
    public final /* synthetic */ vqe Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tqe(vqe vqe, Continuation continuation) {
        super(2, continuation);
        this.Y = vqe;
    }

    public final Object invoke(Object obj, Object obj2) {
        Float valueOf = Float.valueOf(((Number) obj).floatValue());
        e5f e5f = e5f.a;
        ((tqe) n(valueOf, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tqe tqe = new tqe(this.Y, continuation);
        tqe.X = ((Number) obj).floatValue();
        return tqe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        float f = this.X;
        vqe vqe = this.Y;
        vqe.b.setTextSize(0, vqe.o + f);
        return e5f.a;
    }
}
