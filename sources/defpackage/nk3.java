package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nk3  reason: default package */
public final class nk3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zk3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nk3(zk3 zk3, Continuation continuation) {
        super(2, continuation);
        this.Z = zk3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nk3) n((xeb) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nk3 nk3 = new nk3(this.Z, continuation);
        nk3.Y = obj;
        return nk3;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            xeb xeb = (xeb) this.Y;
            if (xeb instanceof ueb) {
                Long l = ((ueb) xeb).a;
                zk3 zk3 = this.Z;
                long j = zk3.p.get();
                if (l == null || l.longValue() != j) {
                    return e5f;
                }
                kld kld = zk3.e;
                g43 g43 = g43.b;
                this.X = 1;
                if (kld.a(g43, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
