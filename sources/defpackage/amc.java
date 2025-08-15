package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: amc  reason: default package */
public final class amc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amc(hmc hmc, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = hmc;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((amc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new amc(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            s1e a = this.Y.a();
            this.X = 1;
            a.getClass();
            if (ote.j(a.a, new q1e(a, this.Z, 0), this) == tx3) {
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
