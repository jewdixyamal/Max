package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: it4  reason: default package */
public final class it4 extends ffe implements a66 {
    public long X;
    public int Y;
    public final /* synthetic */ jt4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public it4(jt4 jt4, Continuation continuation) {
        super(2, continuation);
        this.Z = jt4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((it4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new it4(this.Z, continuation);
    }

    public final Object o(Object obj) {
        long j;
        Object value;
        long longValue;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        jt4 jt4 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            j = System.currentTimeMillis();
            long longValue2 = ((Number) jt4.c.getValue()).longValue();
            this.X = j;
            this.Y = 1;
            if (j47.x(longValue2, this) == tx3) {
                return tx3;
            }
        } else if (i == 1 || i == 2) {
            j = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            q0e q0e = jt4.d;
            do {
                value = q0e.getValue();
                Long l = (Long) value;
            } while (!q0e.c(value, new Long((System.currentTimeMillis() - j) / ((long) 1000))));
            longValue = ((Number) jt4.c.getValue()).longValue();
            this.X = j;
            this.Y = 2;
        } while (j47.x(longValue, this) != tx3);
        return tx3;
    }
}
