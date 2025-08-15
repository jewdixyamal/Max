package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y62  reason: default package */
public final class y62 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ k72 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y62(int i, k72 k72, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = k72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y62) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y62(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            if (this.Y == sea.A0) {
                kld kld = this.Z.f;
                bc7[] bc7Arr = k72.x;
                scb scb = new scb(new eqe(vea.y2), new eqe(vea.x2), y53.M(new mg3(sea.E0, new eqe(vea.u2), 3, false), new mg3(sea.e, new eqe(vea.v2), 2, false)));
                this.X = 1;
                if (kld.a(scb, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
