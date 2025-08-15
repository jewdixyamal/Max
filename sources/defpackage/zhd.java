package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zhd  reason: default package */
public final class zhd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cid Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zhd(cid cid, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = cid;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zhd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zhd(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, eaf] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = cid.O0;
            cid cid = this.Y;
            int d = h4f.d(((jp) cid.s()).g.getString("app.privacy.chats.invite", "ALL"));
            int i2 = this.Z;
            if (d == i2) {
                return e5f;
            }
            ((jp) cid.s()).m("app.privacy.chats.invite", h4f.k(i2));
            pk r = cid.r();
            ? obj3 = new Object();
            obj3.o = i2;
            r.a(new gaf(obj3));
            this.X = 1;
            if (cid.q(cid, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
