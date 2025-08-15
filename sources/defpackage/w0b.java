package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w0b  reason: default package */
public final class w0b extends ffe implements a66 {
    public final /* synthetic */ y0b X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ e52 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w0b(y0b y0b, int i, e52 e52, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = y0b;
        this.Y = i;
        this.Z = e52;
        this.s0 = j;
        this.t0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((w0b) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w0b(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wha wha = (wha) this.X.e.getValue();
        wha.c(new eia(0, 0, this.Y, 3));
        wha.g(new eqe(oea.d));
        wha.e(nia.a);
        wha.f(new sia(new eqe(oea.e)));
        wha.d(new u72(this.X, this.Z, this.s0, this.t0));
        wha.i();
        return e5f.a;
    }
}
