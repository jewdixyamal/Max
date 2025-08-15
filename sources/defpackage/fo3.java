package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: fo3  reason: default package */
public final class fo3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ oo3 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fo3(oo3 oo3, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = oo3;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fo3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fo3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tt3 tt3;
        Object d;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xj3 xj3 = (xj3) this.Y.o.getValue();
            this.X = 1;
            long j = this.Z;
            uj3 i2 = ((el3) xj3.a.getValue()).i(j, false);
            if (i2 == null) {
                d = nz4.a;
            } else {
                e52 q = ((jz2) ((iy2) xj3.b.getValue())).q(j);
                kl7 l = j1e.l();
                boolean v = i2.v();
                boolean t = i2.t();
                if (!v && !t) {
                    l.add(vj3.Z);
                    l.add(vj3.s0);
                }
                l.add(vj3.a);
                if (v) {
                    l.add(vj3.b);
                } else {
                    l.add(vj3.c);
                }
                l.add(vj3.o);
                if (!t || q == null || q.g0()) {
                    l.add(vj3.X);
                } else {
                    l.add(vj3.t0);
                }
                if (t) {
                    l.add(vj3.Y);
                }
                d = j1e.d(l);
            }
            obj = d;
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qk5 a0 = l6d.a0(l6d.a0(new at(2, (Iterable) obj), new pz2(7)), new pz2(8));
        l45 l45 = oo3.H0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        l6d.h0(a0, arrayList2);
        c63.U(arrayList2, l45);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            switch (((vj3) it.next()).ordinal()) {
                case 0:
                    tt3 = new tt3(z8a.d, (jqe) new eqe(yoc.V), Integer.valueOf(woc.G1), Integer.valueOf(wfa.Q), 4);
                    break;
                case 1:
                    tt3 = new tt3(z8a.f, (jqe) new eqe(yoc.X), Integer.valueOf(woc.X1), Integer.valueOf(wfa.Q), 4);
                    break;
                case 2:
                    tt3 = new tt3(z8a.i, (jqe) new eqe(yoc.a0), Integer.valueOf(woc.n1), Integer.valueOf(wfa.Q), 4);
                    break;
                case 3:
                    tt3 = new tt3(z8a.e, (jqe) new eqe(yoc.W), Integer.valueOf(woc.c), Integer.valueOf(wfa.Q), 4);
                    break;
                case 4:
                    tt3 = new tt3(z8a.b, (jqe) new eqe(yoc.T), Integer.valueOf(wfa.U), Integer.valueOf(woc.S), Integer.valueOf(wfa.P));
                    break;
                case 5:
                    tt3 = new tt3(z8a.c, (jqe) new eqe(yoc.U), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
                    break;
                case 6:
                    tt3 = new tt3(z8a.a, (jqe) new eqe(yoc.S), Integer.valueOf(woc.B1), Integer.valueOf(wfa.Q), 4);
                    break;
                case 7:
                    tt3 = new tt3(z8a.h, (jqe) new eqe(yoc.Z), Integer.valueOf(woc.n2), Integer.valueOf(wfa.Q), 4);
                    break;
                case 8:
                    tt3 = new tt3(z8a.g, (jqe) new eqe(yoc.Y), Integer.valueOf(wfa.U), Integer.valueOf(woc.p1), Integer.valueOf(wfa.P));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(tt3);
        }
        return arrayList;
    }
}
