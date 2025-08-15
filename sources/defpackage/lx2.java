package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lx2  reason: default package */
public final class lx2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nx2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lx2(nx2 nx2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lx2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lx2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((afe) this.Y.D0.getValue()).a(this.Z, this) == tx3) {
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
