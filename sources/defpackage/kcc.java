package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: kcc  reason: default package */
public final class kcc extends pnf {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final ccc b;
    public final Boolean c;
    public final ir1 o;
    public final w7c s0;
    public final j31 t0;
    public final s35 u0 = new s35(0);

    public kcc(ccc ccc, Boolean bool, ir1 ir1, je7 je7, je7 je72, je7 je73) {
        Object value;
        icc icc;
        this.b = ccc;
        this.c = bool;
        this.o = ir1;
        this.X = je7;
        this.Y = je72;
        this.Z = je73;
        q0e a = r0e.a((Object) null);
        this.s0 = new w7c(a);
        this.t0 = new j31(od2.X(od2.x(new j31(ir1.e(), ir1.f(), new c3(this, (Continuation) null, 28), 4)), this.a, wld.a, yj1.g), ((vvc) ((lvc) je72.getValue())).z0, new c3(this, (Continuation) null, 27), 4);
        do {
            value = a.getValue();
            icc icc2 = (icc) value;
            int ordinal = this.b.ordinal();
            if (ordinal != 0) {
                b7a b7a = b7a.b;
                if (ordinal == 1) {
                    icc = new icc(new eqe(b8a.D1), new eqe(b8a.C1), new hcc((long) y7a.s1, new eqe(b8a.A1), b7a.a), new hcc((long) y7a.t1, new eqe(b8a.B1), b7a), jqe.a, false);
                } else if (ordinal == 2) {
                    eqe eqe = new eqe(b8a.z1);
                    hcc hcc = new hcc((long) y7a.l1, new eqe(b8a.x1), b7a);
                    hcc hcc2 = new hcc((long) y7a.k1, new eqe(b8a.y1), b7a);
                    String str = ((y21) ((l31) this.o.f).k.getValue()).c;
                    icc = new icc(eqe, (eqe) null, hcc, hcc2, new iqe(str == null ? "" : str), true);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                icc = null;
            }
        } while (!a.c(value, icc));
        if (this.b == ccc.b) {
            od2.L(new zn5(new m58(((vvc) ((lvc) this.Y.getValue())).t0, 28), new gcc(this, (Continuation) null), 5), this.a);
        }
    }
}
