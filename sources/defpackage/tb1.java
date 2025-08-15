package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: tb1  reason: default package */
public final class tb1 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ vb1 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tb1(List list, int i, vb1 vb1, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.s0 = i;
        this.t0 = vb1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tb1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tb1 tb1 = new tb1(this.Z, this.s0, this.t0, continuation);
        tb1.Y = obj;
        return tb1;
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [a66, ffe] */
    public final Object o(Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object obj3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        int i2 = 2;
        ArrayList arrayList = null;
        vb1 vb1 = this.t0;
        int i3 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            List<Number> list = this.Z;
            if (list.isEmpty() || i3 == 0) {
                q0e q0e = vb1.w0;
                do {
                    value2 = q0e.getValue();
                } while (!q0e.c(value2, nb1.a((nb1) value2, (md0) null, (m38) null, (m38) null, false, (jqe) null, (ArrayList) null, vb1.q(vb1, nz4.a, i3), 63)));
                return e5f;
            }
            ArrayList arrayList2 = new ArrayList(z53.S(list, 10));
            for (Number longValue : list) {
                arrayList2.add(((ds3) vb1.s0.getValue()).c(longValue.longValue()));
            }
            sb1 sb1 = new sb1((mn5[]) x53.D0(arrayList2).toArray(new mn5[0]), sx3, list, vb1, 0);
            int i4 = ft4.o;
            ac h = nu0.h(sb1, ft4.e(z7.R(5, kt4.SECONDS)), new ffe(2, (Continuation) null));
            this.X = 1;
            obj2 = od2.A(h, this);
            if (obj2 == obj3) {
                return obj3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj4 = ((pjc) obj2).a;
        if (obj4 instanceof njc) {
            obj4 = null;
        }
        uj3[] uj3Arr = (uj3[]) obj4;
        if (uj3Arr != null) {
            arrayList = ys.d0(uj3Arr);
        }
        if (arrayList == null) {
            return e5f;
        }
        if (i3 <= 3) {
            i2 = i3;
        }
        List<uj3> y0 = x53.y0(arrayList, i2);
        ArrayList arrayList3 = new ArrayList();
        for (uj3 uj3 : y0) {
            arrayList3.add(new kpa(oag.a(uj3.m(), new Long(uj3.n())), uj3.p(kk0.a)));
        }
        if (i3 > 3) {
            arrayList3.add(vb1.C0);
        }
        q0e q0e2 = vb1.w0;
        do {
            value = q0e2.getValue();
        } while (!q0e2.c(value, nb1.a((nb1) value, (md0) null, (m38) null, (m38) null, false, (jqe) null, arrayList3, vb1.q(vb1, arrayList, i3), 31)));
        return e5f;
    }
}
