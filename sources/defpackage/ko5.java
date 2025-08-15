package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ko5  reason: default package */
public final class ko5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ lec Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ lx3 u0;
    public final /* synthetic */ iab v0;
    public final /* synthetic */ Object w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ko5(lec lec, long j, long j2, long j3, lx3 lx3, iab iab, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = lec;
        this.Z = j;
        this.s0 = j2;
        this.t0 = j3;
        this.u0 = lx3;
        this.v0 = iab;
        this.w0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ko5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ko5(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        lec lec = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (j47.x(lec.a - this.Z, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.s0 == lec.a) {
            int i2 = ft4.o;
            lec.a = ft4.e(z7.S(System.nanoTime(), kt4.NANOSECONDS)) + this.t0;
            jo5 jo5 = new jo5(this.v0, this.w0, (Continuation) null);
            this.X = 2;
            if (j47.t0(this.u0, jo5, this) == tx3) {
                return tx3;
            }
        }
        return e5f.a;
    }
}
