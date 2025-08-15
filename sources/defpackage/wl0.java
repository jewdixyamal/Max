package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wl0  reason: default package */
public final class wl0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ yl0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wl0(yl0 yl0, Continuation continuation) {
        super(2, continuation);
        this.Y = yl0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wl0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wl0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        tx3 tx3 = tx3.a;
        int i = this.X;
        yl0 yl0 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long j = yl0.l.get();
            this.X = 1;
            obj = yl0.f(yl0, (String) null, j, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kpa kpa = (kpa) obj;
        e5f e5f = e5f.a;
        if (kpa == null) {
            return e5f;
        }
        long longValue = ((Number) kpa.a).longValue();
        List list = (List) kpa.b;
        yl0.l.set(longValue);
        do {
            q0e = yl0.h;
            value = q0e.getValue();
        } while (!q0e.c(value, x53.t0((List) value, list)));
        return e5f;
    }
}
