package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: gu2  reason: default package */
public final class gu2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pu2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gu2(pu2 pu2, Continuation continuation) {
        super(2, continuation);
        this.Y = pu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gu2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gu2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pu2 pu2 = this.Y;
            hm9.m(pu2.z0, "loadNext", new Object[0]);
            mt2 mt2 = (mt2) pu2.x0.getValue();
            boolean isEmpty = mt2.a.isEmpty();
            boolean z = mt2.b;
            if (!isEmpty || !z) {
                List list = mt2.a;
                if ((!list.isEmpty()) && z) {
                    pk5 pk5 = new pk5(l6d.Z(new at(2, list), new we1(24)));
                    if (!pk5.hasNext()) {
                        l = null;
                    } else {
                        l = Long.valueOf(((nl2) pk5.next()).v0);
                        while (pk5.hasNext()) {
                            Long valueOf = Long.valueOf(((nl2) pk5.next()).v0);
                            if (l.compareTo(valueOf) > 0) {
                                l = valueOf;
                            }
                        }
                    }
                    pu2.f(l != null ? l.longValue() : Long.MAX_VALUE);
                }
            } else {
                this.X = 1;
                if (pu2.d(this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
