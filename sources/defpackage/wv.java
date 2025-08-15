package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wv  reason: default package */
public final class wv extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bx Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ta3 s0;
    public final /* synthetic */ ta3 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wv(bx bxVar, long j, ua3 ua3, ua3 ua32, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
        this.Z = j;
        this.s0 = ua3;
        this.t0 = ua32;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wv) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wv wvVar = new wv(this.Y, this.Z, (ua3) this.s0, (ua3) this.t0, continuation);
        wvVar.X = obj;
        return wvVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        bx bxVar = this.Y;
        lx3 lx3 = bxVar.t;
        kke kke = bxVar.b;
        j47.T(sx3, lx3.plus(((w9a) kke).b()), (vx3) null, new uv(this.Y, this.Z, this.s0, (Continuation) null), 2);
        return j47.T(sx3, bxVar.t.plus(((w9a) kke).b()), (vx3) null, new vv(this.Y, this.Z, this.t0, (Continuation) null), 2);
    }
}
