package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ozf  reason: default package */
public final class ozf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;

    public final Object invoke(Object obj, Object obj2) {
        return ((ozf) n((cpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ffe, ozf] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.Y = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        cpa cpa;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            cpa cpa2 = (cpa) this.Y;
            if (cpa2 != cpa.b) {
                return cpa2;
            }
            this.Y = cpa2;
            this.X = 1;
            if (j47.x(600, this) == tx3) {
                return tx3;
            }
            cpa = cpa2;
        } else if (i == 1) {
            cpa = (cpa) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return cpa;
    }
}
