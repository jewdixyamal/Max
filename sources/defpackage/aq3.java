package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: aq3  reason: default package */
public final class aq3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cq3 Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq3(cq3 cq3, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = cq3;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aq3) n((uj3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        aq3 aq3 = new aq3(this.Z, this.s0, continuation);
        aq3.Y = obj;
        return aq3;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        long j = this.s0;
        cq3 cq3 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            if (i24.r((uj3) this.Y)) {
                String name = cq3.getClass().getName();
                hm9.m(name, "try to request info for #" + j, new Object[0]);
                long j2 = this.s0;
                int i2 = ft4.o;
                long R = z7.R(3, kt4.SECONDS);
                this.X = 1;
                if (((xb9) cq3.r.getValue()).s(j2, R, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                String name2 = cq3.getClass().getName();
                hm9.p(name2, "fail to fetch noncontact #" + j, th);
                return new qn5(3, ((ds3) cq3.g.getValue()).a(j));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((ds3) cq3.g.getValue()).c(j);
    }
}
