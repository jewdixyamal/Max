package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wtd  reason: default package */
public final class wtd extends ffe implements a66 {
    public k56 X;
    public int Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ k56 s0;
    public final /* synthetic */ m56 t0;
    public final /* synthetic */ long u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wtd(ArrayList arrayList, k56 k56, m56 m56, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = arrayList;
        this.s0 = k56;
        this.t0 = m56;
        this.u0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wtd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wtd((ArrayList) this.Z, this.s0, this.t0, this.u0, continuation);
    }

    public final Object o(Object obj) {
        k56 k56;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            for (l17 invoke : this.Z) {
                this.t0.invoke(invoke);
            }
            k56 k562 = this.s0;
            if (k562 != null) {
                this.X = k562;
                this.Y = 1;
                if (j47.x(this.u0, this) == tx3) {
                    return tx3;
                }
                k56 = k562;
            }
            return e5f.a;
        } else if (i == 1) {
            k56 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k56.invoke();
        return e5f.a;
    }
}
