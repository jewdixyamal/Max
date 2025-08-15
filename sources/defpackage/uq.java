package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uq  reason: default package */
public final class uq extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sm2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq(sm2 sm2, Continuation continuation) {
        super(2, continuation);
        this.Y = sm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((uq) n((qm2) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uq uqVar = new uq(this.Y, continuation);
        uqVar.X = obj;
        return uqVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.a((qm2) this.X);
        return e5f.a;
    }
}
