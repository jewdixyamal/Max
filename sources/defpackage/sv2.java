package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sv2  reason: default package */
public final class sv2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gw2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ fs8 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sv2(gw2 gw2, long j, fs8 fs8, Continuation continuation) {
        super(2, continuation);
        this.Y = gw2;
        this.Z = j;
        this.s0 = fs8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sv2(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            r79 r79 = (r79) this.Y.x0.getValue();
            this.X = 1;
            r79.getClass();
            obj = z04.e0(r79.a.a.m(), new p79(r79, this.Z, this.s0, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj;
        if (cu8 != null) {
            return new Long(cu8.b);
        }
        return null;
    }
}
