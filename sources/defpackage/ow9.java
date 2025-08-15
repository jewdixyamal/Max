package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ow9  reason: default package */
public final class ow9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rw9 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ow9(rw9 rw9, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = rw9;
        this.Z = j;
        this.s0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ow9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ow9(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = this.Y.c(this.Z, this.s0, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            this.X = 2;
            if (((qx9) this.Y.X.getValue()).g(this.Z, this.s0, this) == tx3) {
                return tx3;
            }
        }
        return e5f.a;
    }
}
