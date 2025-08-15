package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: m8d  reason: default package */
public final class m8d extends e9d {
    public final long D0;

    public m8d(l8d l8d) {
        super(l8d);
        this.D0 = l8d.p;
    }

    public final void x() {
        long j;
        cu8 q;
        vx8 vx8;
        e52 C = b().C(this.c);
        if (C != null && (q = n().q(j)) != null && (vx8 = q.v0) != vx8.DELETED) {
            n().x(q, iu8.SENDING);
            k8g k8g = y().n;
            List list = k8g != null ? (List) k8g.a : null;
            if (list == null) {
                list = nz4.a;
            }
            List list2 = list;
            e8d e8d = this.a;
            if (e8d == null) {
                e8d = null;
            }
            ((bv4) e8d.q.getValue()).a(this.D0, this.c, this.z0, this.A0, vx8.EDITED, list2, true);
            ((k4a) a()).C(this.c, this.D0, C.b.a, q.c, this.z0, q.s0, vx8, q.n() ? (List) q.z0.a : null, true, q.R0);
            cu8 q2 = n().q((j = this.D0));
            if (q2 != null) {
                int size = this.B0.size();
                for (int i = 0; i < size; i++) {
                    if (!(this.B0.get(i) instanceof k00)) {
                        o2 o2Var = (o2) this.B0.get(i);
                        String str = q2.z0.h(i).r;
                        e8d e8d2 = this.a;
                        if (e8d2 == null) {
                            e8d2 = null;
                        }
                        ((dg5) e8d2.b.getValue()).c(o2Var, this.D0, C.a, str);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, m20] */
    public final bu8 y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.B0.size());
        for (o2 o2Var : this.B0) {
            e8d e8d = this.a;
            if (e8d == null) {
                e8d = null;
            }
            lpa b = ((s9b) e8d.B.getValue()).b(o2Var, this.C0);
            if (b != null) {
                o2 o2Var2 = (o2) b.a;
                l20 l20 = (l20) b.b;
                if (!(o2Var2 == null || l20 == null)) {
                    arrayList2.add(o2Var2);
                    arrayList.add(l20);
                }
            }
        }
        this.B0 = arrayList2;
        ? obj = new Object();
        obj.a = arrayList;
        k8g c = obj.c();
        bu8 bu8 = new bu8();
        bu8.n = c;
        String str = this.z0;
        if (!oag.t(str)) {
            bu8.g = str;
        }
        List list = this.A0;
        if (list != null && !list.isEmpty()) {
            bu8.F = list;
        }
        bu8.H = this.y0;
        return bu8;
    }
}
