package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: bx2  reason: default package */
public final class bx2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ nx2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bx2(nx2 nx2, Continuation continuation) {
        super(2, continuation);
        this.Z = nx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bx2) n((ArrayList) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bx2 bx2 = new bx2(this.Z, continuation);
        bx2.Y = obj;
        return bx2;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        nx2 nx2 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            ArrayList arrayList = (ArrayList) this.Y;
            nx2.I0.setValue(arrayList);
            if (nx2.q(nx2, (mt2) nx2.H0.a.getValue())) {
                nx2.J0.setValue(arrayList);
            }
            int i2 = ft4.o;
            long R = z7.R(1, kt4.MINUTES);
            this.X = 1;
            if (j47.y(R, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nx2.u();
        return e5f.a;
    }
}
