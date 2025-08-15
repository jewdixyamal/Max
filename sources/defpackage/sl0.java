package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sl0  reason: default package */
public final class sl0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ je7 Y;
    public final /* synthetic */ yl0 Z;
    public final /* synthetic */ je7 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sl0(je7 je7, yl0 yl0, je7 je72, Continuation continuation) {
        super(2, continuation);
        this.Y = je7;
        this.Z = yl0;
        this.s0 = je72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sl0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sl0(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            t03 t03 = new t03(((jz2) ((iy2) this.Y.getValue())).m(this.Z.a), 11);
            this.X = 1;
            obj = od2.A(t03, this);
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
        xb9 xb9 = (xb9) this.s0.getValue();
        this.X = 2;
        if (xb9.o((e52) obj, this) == tx3) {
            return tx3;
        }
        return e5f.a;
    }
}
