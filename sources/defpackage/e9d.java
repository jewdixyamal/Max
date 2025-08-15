package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: e9d  reason: default package */
public class e9d extends g9d {
    public final List A0;
    public List B0;
    public final boolean C0;
    public final String z0;

    public e9d(d9d d9d) {
        super(d9d);
        this.z0 = d9d.m;
        this.A0 = d9d.n;
        this.B0 = d9d.l;
        this.C0 = d9d.o;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, m20] */
    public bu8 y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.B0.size());
        Iterator it = this.B0.iterator();
        while (true) {
            e8d e8d = null;
            if (!it.hasNext()) {
                break;
            }
            o2 o2Var = (o2) it.next();
            if (o2Var instanceof k00) {
                arrayList2.add(o2Var);
                arrayList.add(((k00) o2Var).c);
            } else {
                e8d e8d2 = this.a;
                if (e8d2 != null) {
                    e8d = e8d2;
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
        }
        String str = this.z0;
        if ((str == null || str.length() == 0) && arrayList2.isEmpty()) {
            return null;
        }
        this.B0 = arrayList2;
        ? obj = new Object();
        obj.a = arrayList;
        k8g c = obj.c();
        bu8 bu8 = new bu8();
        bu8.n = c;
        if (!oag.t(str)) {
            bu8.g = str;
        }
        List list = this.A0;
        if (list != null && !list.isEmpty()) {
            bu8.F = list;
        }
        return bu8;
    }

    public long z(long j, e52 e52) {
        int i;
        int i2;
        cu8 cu8;
        e52 e522 = e52;
        long z = super.z(j, e52);
        cu8 q = o().q(j);
        if (q == null) {
            return 0;
        }
        int size = this.B0.size();
        int i3 = 0;
        while (i3 < size) {
            o2 o2Var = (o2) this.B0.get(i3);
            String str = q.z0.h(i3).r;
            if (o2Var instanceof y95) {
                s8g u = u();
                long o = ((p7b) p()).a.o();
                y95 y95 = (y95) o2Var;
                String str2 = y95.b;
                String str3 = y95.Y;
                long j2 = o;
                cu8 = q;
                aa5 aa5 = r5;
                i2 = i3;
                i = size;
                aa5 aa52 = new aa5(j2, j, str2, e522.a, str, str3);
                u.b(aa5);
            } else {
                cu8 = q;
                i2 = i3;
                String str4 = str;
                i = size;
                if (!(o2Var instanceof k00)) {
                    e8d e8d = this.a;
                    if (e8d == null) {
                        e8d = null;
                    }
                    ((dg5) e8d.b.getValue()).c(o2Var, j, e522.a, str4);
                }
            }
            i3 = i2 + 1;
            long j3 = j;
            q = cu8;
            size = i;
        }
        return z;
    }
}
