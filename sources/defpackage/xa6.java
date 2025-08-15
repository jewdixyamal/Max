package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xa6  reason: default package */
public final class xa6 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ sx3 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ ab6 t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ boolean v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xa6(sx3 sx3, long j, ab6 ab6, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = sx3;
        this.s0 = j;
        this.t0 = ab6;
        this.u0 = j2;
        this.v0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xa6) n((uj3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xa6 xa6 = new xa6(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
        xa6.Y = obj;
        return xa6;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        sx3 sx3 = this.Z;
        ab6 ab6 = this.t0;
        long j = this.s0;
        if (i == 0) {
            od2.a0(obj);
            if (i24.r((uj3) this.Y)) {
                String name = sx3.getClass().getName();
                hm9.m(name, "try to request info for #" + j, new Object[0]);
                long j2 = this.s0;
                long j3 = this.u0;
                this.X = 1;
                if (((xb9) ab6.b.getValue()).s(j2, j3, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                String name2 = sx3.getClass().getName();
                hm9.p(name2, "fail to fetch noncontact #" + j, th);
                return new qn5(3, this.v0 ? ((ds3) ab6.a.getValue()).a(j) : null);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((ds3) ab6.a.getValue()).c(j);
    }
}
