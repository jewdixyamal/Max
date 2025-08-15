package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;

/* renamed from: w63  reason: default package */
public final class w63 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mn5[] Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ AtomicInteger s0;
    public final /* synthetic */ e32 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w63(mn5[] mn5Arr, int i, AtomicInteger atomicInteger, zt0 zt0, Continuation continuation) {
        super(2, continuation);
        this.Y = mn5Arr;
        this.Z = i;
        this.s0 = atomicInteger;
        this.t0 = zt0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w63) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w63(this.Y, this.Z, this.s0, (zt0) this.t0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        AtomicInteger atomicInteger = this.s0;
        e32 e32 = this.t0;
        if (i == 0) {
            od2.a0(obj);
            mn5[] mn5Arr = this.Y;
            int i2 = this.Z;
            mn5 mn5 = mn5Arr[i2];
            v63 v63 = new v63(i2, 0, e32);
            this.X = 1;
            if (mn5.d(v63, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                if (atomicInteger.decrementAndGet() == 0) {
                    e32.i((Throwable) null);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (atomicInteger.decrementAndGet() == 0) {
            e32.i((Throwable) null);
        }
        return e5f.a;
    }
}
