package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: v49  reason: default package */
public final class v49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v49(n59 n59, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v49(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        n59 n59 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            e52 e52 = (e52) n59.o1.a.getValue();
            if (!(e52 == null || (l = (Long) x53.i0(this.Z)) == null)) {
                long longValue = l.longValue();
                long j = e52.b.a;
                this.X = 1;
                if (((mm2) n59.N0.getValue()).a(e52.a, j, longValue, true, this) == tx3) {
                    return tx3;
                }
            }
            return e5f;
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(n59.u1, ax8.a);
        return e5f;
    }
}
