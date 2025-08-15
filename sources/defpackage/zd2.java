package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: zd2  reason: default package */
public final class zd2 implements sk6 {
    public final /* synthetic */ x82 b;
    public final /* synthetic */ c8d c;

    public zd2(c8d c8d, x82 x82) {
        this.c = c8d;
        this.b = x82;
    }

    public final long g() {
        return this.b.c;
    }

    public final long h() {
        long j = this.b.d;
        if (j == 0) {
            c8d c8d = this.c;
            long j2 = ((e52) c8d.a).b.j;
            long j3 = ((cu8) c8d.b).b;
            if (j2 == j3) {
                return j3;
            }
        }
        return j;
    }

    public final List i() {
        ArrayList arrayList = new ArrayList(this.b.e);
        c8d c8d = this.c;
        arrayList.addAll(((e52) c8d.a).b.n.d(mg4.REGULAR));
        hm9.O(arrayList);
        cu8 cu8 = (cu8) c8d.b;
        if (((d92) hm9.u(cu8.o, arrayList).b) == null) {
            long j = cu8.o;
            arrayList.add(new d92(j, j));
        }
        return new ArrayList(arrayList);
    }
}
