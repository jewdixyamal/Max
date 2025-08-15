package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dq2  reason: default package */
public final class dq2 extends ffe implements a66 {
    public rq2 X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ rq2 s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ fif u0;
    public final /* synthetic */ Long v0;
    public final /* synthetic */ cz5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dq2(rq2 rq2, long j, fif fif, Long l, cz5 cz5, Continuation continuation) {
        super(2, continuation);
        this.s0 = rq2;
        this.t0 = j;
        this.u0 = fif;
        this.v0 = l;
        this.w0 = cz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dq2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dq2(this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    public final Object o(Object obj) {
        s35 s35;
        tx3 tx3 = tx3.a;
        int i = this.Z;
        e5f e5f = e5f.a;
        rq2 rq2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            hjf hjf = (hjf) rq2.K0.getValue();
            this.Z = 1;
            Object t02 = j47.t0(((w9a) ((kke) hjf.a.getValue())).b(), new gjf(hjf, this.t0, this.v0, this.u0, this.w0, (Continuation) null), this);
            if (t02 != tx3) {
                t02 = e5f;
            }
            if (t02 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            s35 = this.Y;
            rq2 = this.X;
            od2.a0(obj);
            bc7[] bc7Arr = rq2.f1;
            rq2.getClass();
            pnf.o(s35, obj);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s35 s352 = rq2.b1;
        this.X = rq2;
        this.Y = s352;
        this.Z = 2;
        cz5 cz5 = this.w0;
        Object g = zo2.d.c(this.t0, 1, (lu0) rq2.E0.getValue(), cz5, false, this);
        if (g == tx3) {
            return tx3;
        }
        s35 = s352;
        obj = g;
        bc7[] bc7Arr2 = rq2.f1;
        rq2.getClass();
        pnf.o(s35, obj);
        return e5f;
    }
}
