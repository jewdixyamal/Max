package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b59  reason: default package */
public final class b59 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ cu8 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ l20 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b59(n59 n59, cu8 cu8, boolean z, l20 l20, Continuation continuation) {
        super(2, continuation);
        this.X = n59;
        this.Y = cu8;
        this.Z = z;
        this.s0 = l20;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((b59) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b59(this.X, this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.K(this.Y.b, this.Z, false, this.s0.d());
        return e5f.a;
    }
}
