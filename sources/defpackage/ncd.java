package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ncd  reason: default package */
public final class ncd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ wxc Y;
    public final /* synthetic */ blb Z;
    public final /* synthetic */ je7 s0;
    public final /* synthetic */ add t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ncd(wxc wxc, blb blb, je7 je7, add add, Continuation continuation) {
        super(2, continuation);
        this.Y = wxc;
        this.Z = blb;
        this.s0 = je7;
        this.t0 = add;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ncd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ncd(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ovc ovc = new ovc(new zn5(((hyc) ((q33) this.Y.a.getValue())).u(), new mcd(this.s0, (Continuation) null)), 2);
            this.X = 1;
            obj = od2.A(ovc, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        blb blb = this.Z;
        xw xwVar = new xw(12, (Object) this.t0);
        this.X = 2;
        Object d = ((ti9) blb.f.computeIfAbsent(Long.valueOf(longValue), new di(18, new nq2(blb, longValue, 2)))).d(new ix2(xwVar, 14), this);
        if (d != tx3) {
            d = e5f;
        }
        return d == tx3 ? tx3 : e5f;
    }
}
