package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gx5  reason: default package */
public final class gx5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ lec Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gx5(lec lec, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = lec;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gx5) n((aj6) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gx5 gx5 = new gx5(this.Z, this.s0, continuation);
        gx5.Y = obj;
        return gx5;
    }

    public final Object o(Object obj) {
        aj6 aj6;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            aj6 aj62 = (aj6) this.Y;
            long currentTimeMillis = System.currentTimeMillis() - this.Z.a;
            long j = this.s0;
            if (currentTimeMillis > j) {
                return aj62;
            }
            this.Y = aj62;
            this.X = 1;
            if (j47.x(j - currentTimeMillis, this) == tx3) {
                return tx3;
            }
            aj6 = aj62;
        } else if (i == 1) {
            aj6 = (aj6) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return aj6;
    }
}
