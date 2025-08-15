package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: p7c  reason: default package */
public final class p7c {
    public static final /* synthetic */ int j = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final khe g;
    public final je7 h;
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public p7c(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78) {
        this.a = je73;
        this.b = je77;
        this.c = je78;
        this.d = je72;
        this.e = je76;
        this.f = je7;
        this.g = new khe(new z30(22, je74));
        this.h = je75;
    }

    public static /* synthetic */ long e(p7c p7c, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, int i2) {
        return p7c.d(j2, j3, j4, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, false);
    }

    public final p82 a() {
        return (p82) this.a.getValue();
    }

    public final void b(e52 e52) {
        es8 es8 = e52.c;
        if (es8 != null) {
            long j2 = e52.b.a;
            cu8 cu8 = es8.a;
            e(this, j2, cu8.o, cu8.c, false, false, false, 88);
            ((cea) this.b.getValue()).a(j2);
        }
    }

    public final void c(e52 e52) {
        cu8 cu8;
        es8 es8 = e52.c;
        if (es8 != null && (cu8 = es8.a) != null) {
            long j2 = cu8.o;
            if (j2 > 0) {
                e(this, e52.b.a, j2, cu8.c, true, false, false, 112);
            }
        }
    }

    public final long d(long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        Integer num;
        long j5;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        boolean z5 = z;
        long j9 = z5 ? j7 - 1 : j7;
        StringBuilder k = au1.k(j6, "sendReadMark: chatServerId = ", ", mark = ");
        k.append(j7);
        k.append(", messageServerId = ");
        k.append(j8);
        hm9.m("p7c", k.toString(), new Object[0]);
        e52 z6 = a().z(j6);
        if (z6 == null) {
            rw9 rw9 = (rw9) this.c.getValue();
            if (rw9 != null) {
                rw9.f(j6, j9);
            }
        } else {
            p82 a2 = a();
            long t = ((p7b) ((m7b) this.d.getValue())).a.t();
            a2.getClass();
            long j10 = z6.a;
            g82 g82 = new g82(a2, t, j9, j10);
            Object obj = new Object();
            if (z5 || z2) {
                int a3 = z5 ? (int) ((au8) this.e.getValue()).a(j10, j9) : 0;
                Integer valueOf = Integer.valueOf(a3);
                a().getClass();
                obj = new e82(a3);
                num = valueOf;
            } else {
                num = null;
            }
            a().getClass();
            d82 d82 = new d82(z5, 0);
            hm9.m("p7c", "update chat %d, setAsUnread = %b, count = %s", Long.valueOf(j10), Boolean.valueOf(z), num);
            p82 a4 = a();
            Object[] objArr = {g82, obj, d82};
            a4.getClass();
            if (!a4.h(j10, false, new v02(4, objArr)).e0()) {
                return 0;
            }
        }
        k4a k4a = (k4a) ((pk) this.f.getValue());
        if (!k4a.q(j8)) {
            j5 = 0;
        } else {
            pd2 pd2 = r1;
            pd2 pd22 = new pd2(((p7b) k4a.y()).a.o(), j2, j3, j4, z, z3, z4);
            j5 = ome.d(k4a.z(), pd2, false, 0, 12);
        }
        ConcurrentHashMap concurrentHashMap = this.i;
        zl4 zl4 = (zl4) concurrentHashMap.get(Long.valueOf(j2));
        if (zl4 != null) {
            zl4.g();
        }
        concurrentHashMap.remove(Long.valueOf(j2));
        concurrentHashMap.put(Long.valueOf(j2), ((ztc) this.g.getValue()).b(new u05(2, j5, j2, this)));
        return j5;
    }
}
