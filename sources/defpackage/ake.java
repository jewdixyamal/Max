package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ake  reason: default package */
public final class ake extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;

    public final Object invoke(Object obj, Object obj2) {
        return ((ake) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ffe, ake] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.Y = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Object value = sme.d0.a.getValue();
            this.X = 1;
            if (((on5) this.Y).a(value, this) == tx3) {
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
