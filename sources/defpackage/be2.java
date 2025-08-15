package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: be2  reason: default package */
public final class be2 implements sk6 {
    public final /* synthetic */ x82 b;
    public final /* synthetic */ e52 c;
    public final /* synthetic */ k70 d;

    public be2(x82 x82, e52 e52, k70 k70) {
        this.b = x82;
        this.c = e52;
        this.d = k70;
    }

    public final long g() {
        return this.b.c;
    }

    public final long h() {
        long j = this.b.d;
        if (j != 0) {
            return j;
        }
        long j2 = this.c.b.j;
        long j3 = this.d.b;
        return j2 == j3 ? j3 : j;
    }

    public final List i() {
        ArrayList arrayList = new ArrayList(this.b.e);
        arrayList.addAll(this.c.b.n.d(mg4.REGULAR));
        hm9.O(arrayList);
        k70 k70 = this.d;
        if (((d92) hm9.u(k70.c, arrayList).b) == null) {
            long j = k70.c;
            arrayList.add(new d92(j, j));
        }
        return arrayList;
    }
}
