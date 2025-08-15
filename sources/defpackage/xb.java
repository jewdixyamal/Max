package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xb  reason: default package */
public final class xb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bc Z;
    public final /* synthetic */ je7 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xb(bc bcVar, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Z = bcVar;
        this.s0 = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xb) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xb xbVar = new xb(this.Z, this.s0, continuation);
        xbVar.Y = obj;
        return xbVar;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = (String) this.Y;
            bc bcVar = this.Z;
            if (str == null || str.length() == 0) {
                kld kld = bcVar.Y;
                nz4 nz4 = nz4.a;
                this.X = 1;
                if (kld.a(nz4, this) == tx3) {
                    return tx3;
                }
            } else {
                nx3 a = ((w9a) ((kke) this.s0.getValue())).a();
                vx3 vx3 = vx3.b;
                wb wbVar = new wb(bcVar, str, (Continuation) null);
                bc7[] bc7Arr = bc.t0;
                vxd S = j47.S(bcVar.a, a, vx3, wbVar);
                bcVar.X.o1(bcVar, bc.t0[0], S);
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
