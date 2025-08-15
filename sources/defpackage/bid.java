package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bid  reason: default package */
public final class bid extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cid Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bid(cid cid, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = cid;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bid) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bid(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        cid cid = this.Y;
        if (i == 0) {
            od2.a0(obj);
            i6f i6f = (i6f) cid.w0.getValue();
            this.X = 1;
            Object t0 = j47.t0(((w9a) ((kke) i6f.c.getValue())).b(), new h6f(i6f, this.Z, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.X = 2;
        return cid.q(cid, this) == tx3 ? tx3 : e5f;
    }
}
