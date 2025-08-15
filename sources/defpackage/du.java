package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: du  reason: default package */
public final class du extends ol implements lme {
    public final long[] X;
    public final int o;

    public du(int i, long j, long[] jArr) {
        super(j);
        this.o = i;
        this.X = jArr;
    }

    public final void e(gle gle) {
        eu euVar = (eu) gle;
        int i = this.o;
        int s = au1.s(i);
        pl plVar = null;
        if (s == 1) {
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            o2e o2e = (o2e) plVar2.n.getValue();
            List<e2e> list = euVar.c;
            ArrayList arrayList = new ArrayList();
            for (e2e r : list) {
                arrayList.add(iz7.r(r));
            }
            o2e.e(arrayList);
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            sc5 sc5 = (sc5) plVar3.q.getValue();
            List<e2e> list2 = euVar.c;
            ArrayList arrayList2 = new ArrayList(z53.S(list2, 10));
            for (e2e e2e : list2) {
                arrayList2.add(Long.valueOf(e2e.k));
            }
            sc5.e(arrayList2);
        } else if (s == 2) {
            pl plVar4 = this.c;
            if (plVar4 == null) {
                plVar4 = null;
            }
            a4e a4e = (a4e) plVar4.o.getValue();
            List<n3e> list3 = euVar.o;
            a4e.getClass();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (n3e n3e : list3) {
                arrayList3.addAll(((o2e) a4e.b).c(n3e.h));
                arrayList4.add(a4e.e(n3e));
            }
            if (!arrayList3.isEmpty()) {
                nd7.O(arrayList3);
                Iterator it = nd7.T(arrayList3).iterator();
                while (it.hasNext()) {
                    a4e.c.c(2, (List) it.next());
                }
            }
            if (!arrayList4.isEmpty()) {
                c4e c4e = a4e.a;
                c4e.getClass();
                nd7.U(new qa3(new e0a(qy9.j(arrayList4), new m2e(22), 3).v(), 2, new z3e(c4e, 1)).l(), ft.e, new z72(26, arrayList4), new ic5(6, arrayList4));
            }
            pl plVar5 = this.c;
            if (plVar5 == null) {
                plVar5 = null;
            }
            sc5 sc52 = (sc5) plVar5.q.getValue();
            List<n3e> list4 = euVar.o;
            ArrayList arrayList5 = new ArrayList(z53.S(list4, 10));
            for (n3e n3e2 : list4) {
                arrayList5.add(Long.valueOf(n3e2.a));
            }
            sc52.e(arrayList5);
        }
        pl plVar6 = this.c;
        if (plVar6 != null) {
            plVar = plVar6;
        }
        plVar.b().c(new fu(i, this.a, ys.l0(this.X)));
    }

    public final void g(pke pke) {
        hm9.p("du", pke.toString(), (Throwable) null);
    }

    public final dle i() {
        return new au(this.o, this.X);
    }
}
