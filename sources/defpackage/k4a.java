package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: k4a  reason: default package */
public final class k4a implements pk {
    public static final long[] g = new long[0];
    public final String a = k4a.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public k4a(je7 je7, je7 je72, je7 je73, je7 je74, khe khe) {
        this.b = je7;
        this.c = je72;
        this.d = je73;
        this.e = je74;
        this.f = khe;
    }

    public static long v(k4a k4a, ol olVar) {
        ome z = k4a.z();
        z.getClass();
        return ome.a(z.a, new mme(olVar, false, false, 0, 0));
    }

    public static long w(k4a k4a, ol olVar) {
        return ome.d(k4a.z(), olVar, false, 0, 12);
    }

    public final long A(String str, boolean z) {
        if (true ^ (str == null || w9e.C0(str))) {
            return ome.b(z(), new ei7(((p7b) y()).a.o(), str, z));
        }
        throw new IllegalArgumentException("link is empty".toString());
    }

    public final long[] B(long j, long j2, List list, List list2, da3 da3, boolean z, mg4 mg4) {
        int ordinal;
        boolean o = o(j);
        long[] jArr = c32.b;
        if (!o) {
            return jArr;
        }
        if (list.size() == list2.size() || (ordinal = x().ordinal()) == 0) {
            if (list2.isEmpty()) {
                return jArr;
            }
            ArrayList I0 = x53.I0(list2, 100, 100);
            ArrayList I02 = x53.I0(list, 100, 100);
            ArrayList arrayList = new ArrayList(z53.S(I02, 10));
            Iterator it = I02.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(Long.valueOf(ome.d(z(), new pe9(((p7b) y()).a.o(), j, j2, (List) next, (List) I0.get(i), da3, z, mg4, false), false, 0, 12)));
                    i = i2;
                } else {
                    y53.R();
                    throw null;
                }
            }
            return x53.E0(arrayList);
        } else if (ordinal == 1) {
            hm9.p(this.a, "messageIds.size() != messageServerIds.size()", new IllegalArgumentException("messageIds.size() != messageServerIds.size()"));
            return jArr;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("messageIds.size() != messageServerIds.size()");
        }
    }

    public final long C(long j, long j2, long j3, long j4, String str, String str2, vx8 vx8, List list, boolean z, List list2) {
        if (!o(j) || !p(j2) || !q(j4)) {
            return 0;
        }
        return ome.d(z(), new ve9(((p7b) y()).a.o(), j, j2, j3, j4, str, str2, vx8, list, list2, z), false, 0, 12);
    }

    public final long D(long j, List list) {
        return v(this, new wp3(1, ((p7b) y()).a.o(), j, list));
    }

    public final long E(long j, long j2, long j3, long j4, String str, gx8 gx8) {
        int ordinal;
        if (!o(j) || !p(j2) || !q(j4)) {
            return 0;
        }
        if (str.length() > 0 || (ordinal = x().ordinal()) == 0) {
            long j5 = j;
            long j6 = j2;
            long j7 = j3;
            long j8 = j4;
            return ome.d(z(), new ff9(((p7b) y()).a.o(), j5, j6, j7, j8, new bx8(gx8, str)), false, 0, 12);
        } else if (ordinal == 1) {
            hm9.p(this.a, "reaction can't be empty", new IllegalArgumentException("reaction can't be empty"));
            return 0;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("reaction can't be empty");
        }
    }

    public final long F(String str, a20 a20) {
        return ((s8g) this.e.getValue()).b(new b32(((p7b) y()).a.o(), str, 0, a20));
    }

    public final long G(boolean z) {
        String G = nu0.G(Long.valueOf(System.currentTimeMillis()));
        hm9.m(this.a, "ping, active = " + z + ", current time = " + G, new Object[0]);
        return v(this, new t0b(((p7b) y()).a.o(), z));
    }

    public final long H(int i, long j, a20 a20, String str, String str2, String str3, String str4, String str5) {
        return ome.d(z(), new sab(((p7b) y()).a.o(), str, str2, str3, j, a20, str4, str5, i), false, 0, 12);
    }

    public final long I(long j, long j2, List list, boolean z, int i) {
        rk2 rk2 = new rk2(((p7b) y()).a.o(), j, j2, 2, list, ek2.ADMIN, true, 0, i);
        if (z) {
            return ome.d(z(), rk2, false, 0, 12);
        }
        return v(this, rk2);
    }

    public final Object J(dle dle, Continuation continuation) {
        return z().e(dle, continuation);
    }

    public final drd K(dle dle, ztc ztc) {
        tle tle = (tle) z().a;
        tle.getClass();
        return new q1a(1, new ypc(tle, 9, dle)).i(ztc);
    }

    public final long L(boolean z, long j, long j2, long j3, long j4, String str, boolean z2, boolean z3, String str2) {
        yjf yjf = r0;
        yjf yjf2 = new yjf(((p7b) y()).a.o(), j, j2, j3, j4, str, z2, z3, str2, false);
        return z ? ome.d(z(), yjf, false, 0, 12) : v(this, yjf);
    }

    public final long d(long j, long j2, List list, boolean z) {
        if (!o(j)) {
            return 0;
        }
        return ome.d(z(), new rk2(((p7b) y()).a.o(), j, j2, 1, list, ek2.MEMBER, z, 0, 0), false, 0, 12);
    }

    public final long e(int i, long j) {
        return ome.d(z(), new zt(i, ((p7b) y()).a.o(), j), false, 0, 12);
    }

    public final long f(int i, long[] jArr) {
        return ome.d(z(), new nu(i, ((p7b) y()).a.o(), jArr), false, 0, 12);
    }

    public final long g(int i, long j) {
        return v(this, new qu(i, ((p7b) y()).a.o(), j));
    }

    public final long h(long j, long j2, long j3) {
        if (!o(j)) {
            return 0;
        }
        return v(this, new rs2(((p7b) y()).a.o(), j, j2, 0, (String) null, false, (String) null, (HashMap) null, (String) null, (String) null, (a20) null, (Long) null, false, j3));
    }

    public final long i(long j, long j2, boolean z, long j3) {
        if (!o(j)) {
            return 0;
        }
        return ome.d(z(), new q92(((p7b) y()).a.o(), j, j2, j3, z), false, 0, 12);
    }

    public final long j(long j) {
        return v(this, new kc2(0, ((p7b) y()).a.o(), Collections.singletonList(Long.valueOf(j))));
    }

    public final long k(long j, boolean z) {
        br2 br2 = new br2(((p7b) y()).a.o(), j, false);
        return z ? ome.d(z(), br2, false, 0, 12) : v(this, br2);
    }

    public final long l(long j, long j2, int i, String str, boolean z, HashMap hashMap) {
        if (!o(j)) {
            return 0;
        }
        return v(this, new rs2(((p7b) y()).a.o(), j, j2, i, str, z, (String) null, hashMap, (String) null, (String) null, (a20) null, (Long) null, false, 0));
    }

    public final long m(long j, long j2, String str, String str2, a20 a20) {
        if (!o(j)) {
            return 0;
        }
        return ome.d(z(), new rs2(((p7b) y()).a.o(), j, j2, 0, (String) null, false, (String) null, (HashMap) null, str, str2, a20, (Long) null, false, 0), false, 0, 12);
    }

    public final long n(long j, String str, long j2) {
        if (!o(j)) {
            return 0;
        }
        return ome.d(z(), new rs2(((p7b) y()).a.o(), j, j2, 0, (String) null, false, str, (HashMap) null, (String) null, (String) null, (a20) null, (Long) null, false, 0), false, 0, 12);
    }

    public final boolean o(long j) {
        int ordinal;
        if ((j != 0) || (ordinal = x().ordinal()) == 0) {
            return true;
        }
        if (ordinal == 1) {
            hm9.p(this.a, "invalid chat local id", new IllegalArgumentException("invalid chat local id"));
            return false;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("invalid chat local id");
        }
    }

    public final boolean p(long j) {
        int ordinal;
        if ((j != 0) || (ordinal = x().ordinal()) == 0) {
            return true;
        }
        if (ordinal == 1) {
            hm9.p(this.a, "invalid message local id", new IllegalArgumentException("invalid message local id"));
            return false;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("invalid message local id");
        }
    }

    public final boolean q(long j) {
        int ordinal;
        if ((j != 0) || (ordinal = x().ordinal()) == 0) {
            return true;
        }
        if (ordinal == 1) {
            hm9.p(this.a, "invalid message server id", new IllegalArgumentException("invalid message server id"));
            return false;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("invalid message server id");
        }
    }

    public final long r(long j) {
        if (!o(j)) {
            return 0;
        }
        return ome.d(z(), new de3(((p7b) y()).a.o(), j, false, (gaf) null, false, g, false, (ArrayList) null, (ArrayList) null), false, 0, 12);
    }

    public final long s() {
        return ome.d(z(), new de3(((p7b) y()).a.o(), 0, true, (gaf) null, false, g, false, (ArrayList) null, (ArrayList) null), false, 0, 12);
    }

    public final long t(gaf gaf, boolean z) {
        return ome.d(z(), new de3(((p7b) y()).a.o(), 0, false, gaf, z, g, false, (ArrayList) null, (ArrayList) null), false, 0, 12);
    }

    public final long[] u(List list) {
        if (list.isEmpty()) {
            return c32.b;
        }
        ArrayList I0 = x53.I0(list, 100, 100);
        int size = I0.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = Long.valueOf(v(this, new wp3(((p7b) y()).a.o(), x53.E0((List) I0.get(i)), -1))).longValue();
        }
        return jArr;
    }

    public final j4a x() {
        return (j4a) this.f.getValue();
    }

    public final m7b y() {
        return (m7b) this.c.getValue();
    }

    public final ome z() {
        return (ome) this.b.getValue();
    }
}
