package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ib2  reason: default package */
public final class ib2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zb2 Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ Set s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ib2(zb2 zb2, List list, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = zb2;
        this.Z = list;
        this.s0 = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ib2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ib2(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = zb2.K0;
            alc e = this.Y.e();
            this.X = 1;
            e.getClass();
            if (z04.e0(e.a, new lr1(e, this.Z, this.s0, 11), this) == tx3) {
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
