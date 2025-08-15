package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: g72  reason: default package */
public final class g72 extends ffe implements a66 {
    public final /* synthetic */ k72 X;
    public final /* synthetic */ o22 Y;
    public final /* synthetic */ e52 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g72(k72 k72, o22 o22, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.X = k72;
        this.Y = o22;
        this.Z = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((g72) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g72(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        long j;
        od2.a0(obj);
        k72 k72 = this.X;
        AtomicLong atomicLong = k72.t;
        o22 o22 = this.Y;
        int ordinal = o22.b.ordinal();
        je7 je7 = k72.o;
        e52 e52 = this.Z;
        if (ordinal == 0) {
            j = ((k4a) ((pk) je7.getValue())).l(e52.a, e52.b.a, 1, o22.c, false, (HashMap) null);
        } else if (ordinal == 1) {
            j = ((k4a) ((pk) je7.getValue())).l(e52.a, e52.b.a, 2, (String) null, false, (HashMap) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        atomicLong.set(j);
        k72.w.set(true);
        return e5f.a;
    }
}
