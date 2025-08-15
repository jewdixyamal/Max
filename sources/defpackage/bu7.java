package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bu7  reason: default package */
public final class bu7 extends ffe implements a66 {
    public final /* synthetic */ cu7 X;
    public final /* synthetic */ mec Y;
    public final /* synthetic */ fs8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bu7(cu7 cu7, mec mec, fs8 fs8, Continuation continuation) {
        super(2, continuation);
        this.X = cu7;
        this.Y = mec;
        this.Z = fs8;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bu7) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bu7(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        cu7 cu7 = this.X;
        ((au8) cu7.j.getValue()).w((cu8) this.Y.a, iz7.g(this.Z.s0, (vxc) cu7.r.getValue()));
        return e5f.a;
    }
}
