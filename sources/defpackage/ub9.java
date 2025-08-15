package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ub9  reason: default package */
public final class ub9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xb9 Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ long s0 = 1000;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ub9(xb9 xb9, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = xb9;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ub9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ub9(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            int i2 = ft4.o;
            long S = z7.S(this.s0, kt4.SECONDS);
            this.X = 1;
            obj = this.Y.j(S, this.Z, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
