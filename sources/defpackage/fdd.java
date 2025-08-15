package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fdd  reason: default package */
public final class fdd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ndd Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fdd(ndd ndd, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = ndd;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fdd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fdd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = ndd.A0;
            ndd ndd = this.Y;
            rj rjVar = (rj) ndd.o.getValue();
            ((jp) ((hp) rjVar.c.getValue())).j("app.media.animoji.enabled", this.Z);
            vxd T = j47.T(rjVar.h, (lx3) null, vx3.b, new pj(rjVar, (Continuation) null), 1);
            rjVar.i.o1(rjVar, rj.k[0], T);
            this.X = 1;
            if (ndd.q(ndd, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
