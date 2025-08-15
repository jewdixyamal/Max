package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yhd  reason: default package */
public final class yhd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cid Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yhd(cid cid, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = cid;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yhd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yhd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        cid cid = this.Y;
        if (i == 0) {
            od2.a0(obj);
            t6f t6f = (t6f) cid.x0.getValue();
            this.X = 1;
            Object t0 = j47.t0(((w9a) ((kke) t6f.c.getValue())).b(), new s6f(t6f, this.Z, (Continuation) null), this);
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
