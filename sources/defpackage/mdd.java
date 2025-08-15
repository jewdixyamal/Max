package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mdd  reason: default package */
public final class mdd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ndd Y;
    public final /* synthetic */ xdf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mdd(ndd ndd, xdf xdf, Continuation continuation) {
        super(2, continuation);
        this.Y = ndd;
        this.Z = xdf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mdd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mdd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = ndd.A0;
            ndd ndd = this.Y;
            kxc r = ndd.r();
            r.getClass();
            r.m("app.media.video.compress", this.Z.name());
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
