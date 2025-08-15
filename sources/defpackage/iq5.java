package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iq5  reason: default package */
public final class iq5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xld Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ si9 s0;
    public final /* synthetic */ Object t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iq5(xld xld, mn5 mn5, si9 si9, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = xld;
        this.Z = mn5;
        this.s0 = si9;
        this.t0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iq5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iq5(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [a66, ffe] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        mn5 mn5 = this.Z;
        si9 si9 = this.s0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                } else if (!(i == 3 || i == 4)) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            od2.a0(obj);
            return e5f.a;
        }
        od2.a0(obj);
        xld xld = wld.a;
        xld xld2 = this.Y;
        if (xld2 == xld) {
            this.X = 1;
            if (mn5.d(si9, this) == obj2) {
                return obj2;
            }
        } else if (xld2 == wld.b) {
            j0e i2 = si9.i();
            ? ffe = new ffe(2, (Continuation) null);
            this.X = 2;
            if (od2.z(i2, ffe, this) == obj2) {
                return obj2;
            }
        } else {
            mn5 x = od2.x(xld2.b(si9.i()));
            hq5 hq5 = new hq5(mn5, si9, this.t0, (Continuation) null);
            this.X = 4;
            if (od2.r(x, hq5, this) == obj2) {
                return obj2;
            }
        }
        return e5f.a;
        this.X = 3;
        if (mn5.d(si9, this) == obj2) {
            return obj2;
        }
        return e5f.a;
    }
}
