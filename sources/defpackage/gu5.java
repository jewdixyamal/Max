package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: gu5  reason: default package */
public final class gu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Set Y;
    public final /* synthetic */ nu5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gu5(nu5 nu5, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = set;
        this.Z = nu5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gu5(this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Set<Number> set;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            if (this.Y.isEmpty() && (!((Collection) this.Z.y0.get()).isEmpty())) {
                nu5 nu5 = this.Z;
                at5 at5 = nu5.A0;
                if (!(at5 == null || (set = at5.v0) == null)) {
                    for (Number longValue : set) {
                        nu5.s(longValue.longValue());
                    }
                }
                nu5.y0.updateAndGet(new oe2(2));
            } else if (!this.Y.isEmpty()) {
                nu5 nu52 = this.Z;
                Set set2 = this.Y;
                this.X = 1;
                if (nu5.q(nu52, set2, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nu5 nu53 = this.Z;
        this.X = 2;
        if (nu5.r(nu53, this) == tx3) {
            return tx3;
        }
        return e5f.a;
    }
}
