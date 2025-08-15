package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hhf  reason: default package */
public final class hhf extends ffe implements a66 {
    public final /* synthetic */ nif X;
    public final /* synthetic */ wgf Y;
    public final /* synthetic */ gef Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hhf(nif nif, wgf wgf, gef gef, Continuation continuation) {
        super(2, continuation);
        this.X = nif;
        this.Y = wgf;
        this.Z = gef;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hhf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hhf(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wgf wgf = this.Y;
        this.X.a(wgf.a, wgf, this.Z);
        return e5f.a;
    }
}
