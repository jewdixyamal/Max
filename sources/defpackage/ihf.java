package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ihf  reason: default package */
public final class ihf extends ffe implements a66 {
    public final /* synthetic */ nif X;
    public final /* synthetic */ cu8 Y;
    public final /* synthetic */ wgf Z;
    public final /* synthetic */ gef s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ihf(nif nif, cu8 cu8, wgf wgf, gef gef, Continuation continuation) {
        super(2, continuation);
        this.X = nif;
        this.Y = cu8;
        this.Z = wgf;
        this.s0 = gef;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ihf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ihf(this.X, this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.a(this.Y.b, this.Z, this.s0);
        return e5f.a;
    }
}
