package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: s52  reason: default package */
public final class s52 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ u52 Z;
    public final /* synthetic */ e52 s0;
    public final /* synthetic */ List t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s52(Object obj, Continuation continuation, u52 u52, e52 e52, List list) {
        super(2, continuation);
        this.Y = obj;
        this.Z = u52;
        this.s0 = e52;
        this.t0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s52) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new s52(this.Y, continuation, this.Z, this.s0, this.t0);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            long longValue = ((Number) this.Y).longValue();
            u52 u52 = this.Z;
            long j = u52.b;
            e52 e52 = this.s0;
            long j2 = e52.b.a;
            int e = e52.e(longValue);
            this.X = 1;
            ((k4a) ((pk) ((dh4) u52.Y.getValue()).a.getValue())).I(j, j2, this.t0, true, e);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
