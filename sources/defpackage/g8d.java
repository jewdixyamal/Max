package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: g8d  reason: default package */
public final class g8d extends d8d {
    public final long b;
    public final boolean c;
    public final String o = g8d.class.getName();

    public g8d(long j, boolean z) {
        this.b = j;
        this.c = z;
    }

    public final void x() {
        k92 k92;
        ArrayList arrayList;
        ArrayList arrayList2;
        StringBuilder sb = new StringBuilder("process, chatsIds = ");
        long j = this.b;
        sb.append(j);
        sb.append(" , forAll = ");
        boolean z = this.c;
        sb.append(z);
        hm9.m(this.o, sb.toString(), new Object[0]);
        if (j != 0) {
            ArrayList arrayList3 = new ArrayList();
            e52 C = g().C(j);
            if (C != null) {
                k92 k922 = C.b;
                long j2 = k922.k;
                o().y(this.b, j2, vx8.DELETED);
                g().w(j);
                p82 g = g();
                g.getClass();
                v82 v82 = v82.o;
                long j3 = C.a;
                g.c(j3, v82);
                g.h(j3, false, new un0(17));
                pk a = a();
                boolean z2 = C.F() || z;
                k4a k4a = (k4a) a;
                long j4 = C.a;
                if (!k4a.o(j4)) {
                    arrayList = arrayList3;
                    k92 = k922;
                } else {
                    long o2 = ((p7b) k4a.y()).a.o();
                    arrayList = arrayList3;
                    long j5 = k922.a;
                    k92 = k922;
                    l72 l72 = r7;
                    l72 l722 = new l72(o2, j4, j5, j2, z2);
                    k4a.w(k4a, l72);
                }
                t().c(new m72(j));
                uj3 l = C.l();
                if (l != null) {
                    arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(l.n()));
                } else {
                    arrayList2 = arrayList;
                }
                vr7 m = m();
                o().i(j);
                m.getClass();
                e8d e8d = this.a;
                if (e8d == null) {
                    e8d = null;
                }
                ((cea) e8d.x.getValue()).a(k92.a);
                if (!arrayList2.isEmpty()) {
                    t().c(new ps3((Collection) arrayList2));
                }
                t().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, (mg4) null, (h9b) null, 124));
            }
        }
    }
}
