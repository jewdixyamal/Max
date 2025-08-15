package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yta  reason: default package */
public final class yta extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aua Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yta(aua aua, Continuation continuation) {
        super(2, continuation);
        this.Y = aua;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yta) n((bua) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yta yta = new yta(this.Y, continuation);
        yta.X = obj;
        return yta;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        aua aua = this.Y;
        aua.a(aua, "microphone", aua.b(aua, (bua) this.X));
        return e5f.a;
    }
}
