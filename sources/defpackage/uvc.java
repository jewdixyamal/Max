package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uvc  reason: default package */
public final class uvc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vvc Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uvc(long j, vvc vvc, Continuation continuation) {
        super(2, continuation);
        this.Y = vvc;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((uvc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uvc(this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        long longValue;
        tx3 tx3 = tx3.a;
        int i = this.X;
        vvc vvc = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long longValue2 = ((Number) vvc.v0.getValue()).longValue();
            this.X = 1;
            if (j47.x(longValue2, this) == tx3) {
                return tx3;
            }
        } else if (i == 1 || i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            q0e q0e = vvc.y0;
            do {
                value = q0e.getValue();
                Long l = (Long) value;
            } while (!q0e.c(value, new Long((System.currentTimeMillis() - this.Z) / ((long) 1000))));
            longValue = ((Number) vvc.v0.getValue()).longValue();
            this.X = 2;
        } while (j47.x(longValue, this) != tx3);
        return tx3;
    }
}
