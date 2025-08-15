package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xmb  reason: default package */
public final class xmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xmb(cnb cnb, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
        this.Z = j;
        this.s0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xmb(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pab pab = this.Y.O0;
            this.X = 1;
            if (pab.v(this.Z, this.s0, this) == tx3) {
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
