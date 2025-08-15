package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rr1  reason: default package */
public final class rr1 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ wr1 Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rr1(wr1 wr1, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = wr1;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rr1 rr1 = new rr1(this.Z, this.s0, continuation);
        rr1.Y = obj;
        return rr1;
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            wr1 wr1 = this.Z;
            long j = this.s0;
            int i2 = ft4.o;
            long R = z7.R(10, kt4.SECONDS);
            this.X = 1;
            if (((xb9) wr1.z.getValue()).s(j, R, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = e5f;
        Throwable a = pjc.a(obj2);
        if (a != null) {
            hm9.p("CallEngineTag", "fail to fetch missed user", a);
        }
        return e5f;
    }
}
