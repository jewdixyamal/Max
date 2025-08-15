package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: pm6  reason: default package */
public final class pm6 extends zm6 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final cr4 q;
    public final zw6 r;
    public final zw6 s;
    public final cx6 t;
    public final long u;
    public final om6 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pm6(int i2, String str, List list, long j2, boolean z, long j3, boolean z2, int i3, long j4, int i4, long j5, long j6, boolean z3, boolean z4, boolean z5, cr4 cr4, List list2, List list3, om6 om6, Map map) {
        super(str, z3, list);
        long j7 = j2;
        String str2 = str;
        List list4 = list;
        this.d = i2;
        this.h = j3;
        this.g = z;
        this.i = z2;
        this.j = i3;
        this.k = j4;
        this.l = i4;
        this.m = j5;
        this.n = j6;
        this.o = z4;
        this.p = z5;
        this.q = cr4;
        this.r = zw6.j(list2);
        this.s = zw6.j(list3);
        this.t = cx6.b(map);
        if (!list3.isEmpty()) {
            gm6 gm6 = (gm6) mqd.m(list3);
            this.u = gm6.X + gm6.c;
        } else if (!list2.isEmpty()) {
            km6 km6 = (km6) mqd.m(list2);
            this.u = km6.X + km6.c;
        } else {
            this.u = 0;
        }
        this.e = j7 != -9223372036854775807L ? j7 >= 0 ? Math.min(this.u, j2) : Math.max(0, this.u + j7) : -9223372036854775807L;
        this.f = j7 >= 0;
        this.v = om6;
    }

    public final Object a(List list) {
        return this;
    }
}
