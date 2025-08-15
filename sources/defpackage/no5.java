package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: no5  reason: default package */
public final class no5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ mn5 s0;
    public final /* synthetic */ iab t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public no5(long j, mn5 mn5, iab iab, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = mn5;
        this.t0 = iab;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((no5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        no5 no5 = new no5(this.Z, this.s0, this.t0, continuation);
        no5.Y = obj;
        return no5;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, lec] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, mec] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            long e = ft4.e(this.Z);
            lx3 coroutineContext = sx3.getCoroutineContext();
            mo5 mo5 = new mo5(new Object(), e, this.t0, new Object(), sx3, coroutineContext);
            this.X = 1;
            if (this.s0.d(mo5, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
