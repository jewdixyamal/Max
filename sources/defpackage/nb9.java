package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: nb9  reason: default package */
public final class nb9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ sx3 Z;
    public final /* synthetic */ xb9 s0;
    public long[] t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nb9(Object obj, Continuation continuation, sx3 sx3, xb9 xb9) {
        super(2, continuation);
        this.Y = obj;
        this.Z = sx3;
        this.s0 = xb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nb9(this.Y, continuation, this.Z, this.s0);
    }

    public final Object o(Object obj) {
        long[] jArr;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            j1e.o(this.Z);
            long[] E0 = x53.E0((List) this.Y);
            this.t0 = E0;
            this.X = 1;
            xb9 xb9 = this.s0;
            xb9.getClass();
            Object k = j1e.k(new wb9(xb9, (Continuation) null, E0), this);
            if (k == tx3) {
                return tx3;
            }
            long[] jArr2 = E0;
            obj = k;
            jArr = jArr2;
        } else if (i == 1) {
            jArr = this.t0;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return new kpa(jArr, obj);
    }
}
