package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: ndb  reason: default package */
public final class ndb implements qab {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ndb(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    public final Object a(uj3 uj3, e52 e52, pdb pdb, rdb rdb, Long l, Continuation continuation) {
        uj3 uj32 = uj3;
        pdb pdb2 = pdb;
        kl7 l2 = j1e.l();
        boolean z = true;
        int i = ((u7b) this.a.getValue()).b(uj3.n()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        String p = uj32.p(kk0.c);
        String str = p == null ? "" : p;
        CharSequence b2 = ((w7b) ((y7b) this.b.getValue()).a.getValue()).b(uj32);
        boolean s = e52.s();
        if (pdb2.a || !s) {
            z = false;
        }
        long n = uj3.n();
        String d = uj3.d();
        l2.add(new zm3(n, d == null ? "" : d, new iqe(b2), str, z2, uj3.m(), rdb, 536903680, false, 256));
        int i2 = sea.S;
        l2.add(new x6(i2, new vfd((long) i2, 0, new eqe(vea.l1), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.a, s), (zed) null, (jqe) null, 0, (wed) null, 1944), -2147482624));
        l2.add(new s0d(new eqe(vea.w1), i4f.p, 4096, 2));
        l2.add(new s0d(new eqe(vea.k1), (kqe) null, 2048, 6));
        int i3 = sea.O;
        l2.add(new x6(i3, new vfd((long) i3, 0, new eqe(vea.t1), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.b, z), (zed) null, (jqe) null, 0, (wed) null, 1944), 536871936));
        int i4 = sea.P;
        l2.add(new x6(i4, new vfd((long) i4, 0, new eqe(vea.i1), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.c, z), (zed) null, (jqe) null, 0, (wed) null, 1944), 1073742848));
        int i5 = sea.F;
        l2.add(new x6(i5, new vfd((long) i5, 0, new eqe(vea.p1), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.d, z), (zed) null, (jqe) null, 0, (wed) null, 1944), 1073742848));
        int i6 = sea.N;
        l2.add(new x6(i6, new vfd((long) i6, 0, new eqe(vea.s1), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.e, z), (zed) null, (jqe) null, 0, (wed) null, 1944), -2147482624));
        l2.add(new s0d(jqe.a, (kqe) null, 0, 14));
        if (s && rdb == rdb.CHANGE_ADMIN) {
            int i7 = sea.D;
            l2.add(new x6(i7, new vfd((long) i7, 0, new eqe(vea.e), (jfd) null, (jqe) null, new Integer(woc.R0), cfd.a, (zed) null, (jqe) null, 0, (wed) null, 1944), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
            l2.add(new gh4(new eqe(vea.W0)));
        }
        return j1e.d(l2);
    }

    public final Object b(uj3 uj3, e52 e52, pdb pdb, rdb rdb, Long l, Continuation continuation) {
        uj3 uj32 = uj3;
        pdb pdb2 = pdb;
        kl7 l2 = j1e.l();
        boolean z = true;
        int i = ((u7b) this.a.getValue()).b(uj3.n()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        String p = uj32.p(kk0.c);
        String str = "";
        String str2 = p == null ? str : p;
        CharSequence b2 = ((w7b) ((y7b) this.b.getValue()).a.getValue()).b(uj32);
        boolean s = e52.s();
        boolean z3 = !pdb2.a && s;
        boolean z4 = pdb2.e;
        if (!z3 || !z4) {
            z = false;
        }
        long n = uj3.n();
        String d = uj3.d();
        if (d != null) {
            str = d;
        }
        boolean z5 = z4;
        String str3 = str;
        boolean z6 = z3;
        boolean z7 = z;
        boolean z8 = s;
        l2.add(new zm3(n, str3, new iqe(b2), str2, z2, uj3.m(), rdb, 536903680, false, 256));
        int i2 = sea.S;
        vfd vfd = r8;
        vfd vfd2 = new vfd((long) i2, 0, new eqe(vea.l1), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.a, z8), (zed) null, (jqe) null, 0, (wed) null, 1944);
        l2.add(new x6(i2, vfd, -2147482624));
        l2.add(new s0d(new eqe(vea.m1), i4f.p, 4096, 2));
        l2.add(new s0d(new eqe(vea.k1), (kqe) null, 2048, 6));
        int i3 = sea.O;
        l2.add(new x6(i3, new vfd((long) i3, 0, new eqe(vea.c1), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.b, z6), (zed) null, (jqe) null, 0, (wed) null, 1944), 536871936));
        int i4 = sea.P;
        int i5 = 1073742848;
        l2.add(new x6(i4, new vfd((long) i4, 0, new eqe(vea.i1), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.c, z6), (zed) null, (jqe) null, 0, (wed) null, 1944), 1073742848));
        int i6 = sea.F;
        l2.add(new x6(i6, new vfd((long) i6, 0, new eqe(vea.N0), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.d, z6), (zed) null, (jqe) null, 0, (wed) null, 1944), 1073742848));
        int i7 = sea.N;
        vfd vfd3 = new vfd((long) i7, 0, new eqe(vea.b1), (jfd) null, (jqe) null, (Integer) null, new ffd(z5, z6), (zed) null, (jqe) null, 0, (wed) null, 1944);
        je7 je7 = this.c;
        if (!((se5) ((qe5) je7.getValue())).p()) {
            i5 = -2147482624;
        }
        l2.add(new x6(i7, vfd3, i5));
        if (((se5) ((qe5) je7.getValue())).p()) {
            int i8 = sea.M;
            l2.add(new x6(i8, new vfd((long) i8, 0, new eqe(vea.a1), (jfd) null, (jqe) null, (Integer) null, new ffd(pdb2.f, z7), (zed) null, (jqe) null, 0, (wed) null, 1944), -2147482624));
        }
        l2.add(new s0d(jqe.a, (kqe) null, 0, 14));
        if (z8 && rdb == rdb.CHANGE_ADMIN) {
            int i9 = sea.D;
            l2.add(new x6(i9, new vfd((long) i9, 0, new eqe(vea.e), (jfd) null, (jqe) null, new Integer(woc.R0), cfd.a, (zed) null, (jqe) null, 0, (wed) null, 1944), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
            l2.add(new gh4(new eqe(vea.W0)));
        }
        return j1e.d(l2);
    }
}
