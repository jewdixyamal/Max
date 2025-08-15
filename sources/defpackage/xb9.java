package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: xb9  reason: default package */
public final class xb9 implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final ox3 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final aj9 s0 = bj9.a();
    public final xs t0 = new xs(0);
    public final es7 u0;

    public xb9(je7 je7, je7 je72, ox3 ox3, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        this.a = ox3;
        this.b = je72;
        this.c = je73;
        this.o = je74;
        this.X = je75;
        this.Y = je76;
        this.Z = je77;
        this.u0 = new es7(je7);
        ((dr9) je77.getValue()).c.d = new kb9(this, (Continuation) null);
    }

    public static void e(fs8 fs8, gi9 gi9, gi9 gi92, int i, boolean z) {
        fs8 fs82;
        gi9.a(fs8.o);
        wz wzVar = fs8.s0;
        if (!wzVar.isEmpty()) {
            Iterator it = wzVar.iterator();
            while (it.hasNext()) {
                bz bzVar = (bz) it.next();
                b10 b10 = bzVar.a;
                int i2 = b10 == null ? -1 : lb9.$EnumSwitchMapping$0[b10.ordinal()];
                if (i2 == 1) {
                    ju3 ju3 = (ju3) bzVar;
                    Long l = ju3.X;
                    if (l != null) {
                        gi9.a(l.longValue());
                    }
                    List<Long> list = ju3.Y;
                    if (list != null) {
                        for (Long l2 : list) {
                            if (l2 != null) {
                                gi9.a(l2.longValue());
                            }
                        }
                    }
                } else if (i2 == 2) {
                    List<Long> list2 = ((x01) bzVar).t0;
                    if (list2 != null) {
                        for (Long longValue : list2) {
                            gi9.a(longValue.longValue());
                        }
                    }
                } else if (i2 == 3) {
                    gi9.a(((zj3) bzVar).X);
                }
            }
        }
        aw8 aw8 = fs8.t0;
        if (aw8 != null && (fs82 = aw8.c) != null && i > 0) {
            if (z) {
                e(fs82, gi92, gi92, i - 1, true);
            } else {
                e(fs82, gi9, gi92, i - 1, true);
            }
        }
    }

    public static void f(cu8 cu8, gi9 gi9, gi9 gi92, int i, boolean z) {
        List<Number> list;
        n10 n10;
        gi9.a(cu8.Y);
        k8g k8g = cu8.z0;
        if (k8g != null) {
            int i2 = k8g.i();
            for (int i3 = 0; i3 < i2; i3++) {
                l20 h = k8g.h(i3);
                if (h != null) {
                    g20 g20 = h.a;
                    int i4 = g20 == null ? -1 : lb9.$EnumSwitchMapping$1[g20.ordinal()];
                    if (i4 == 1) {
                        q10 q10 = h.c;
                        if (q10 != null) {
                            gi9.a(q10.b);
                            Iterator it = q10.c.iterator();
                            while (it.hasNext()) {
                                gi9.a(((Number) it.next()).longValue());
                            }
                        }
                    } else if (i4 == 2) {
                        l10 l10 = h.i;
                        if (!(l10 == null || (list = l10.f) == null)) {
                            for (Number longValue : list) {
                                gi9.a(longValue.longValue());
                            }
                        }
                    } else if (i4 == 3 && (n10 = h.k) != null) {
                        gi9.a(n10.b);
                    }
                }
            }
        }
        cu8 cu82 = cu8.C0;
        if (cu82 == null || i <= 0) {
            return;
        }
        if (z) {
            f(cu82, gi92, gi92, i - 1, true);
        } else {
            f(cu82, gi9, gi92, i - 1, true);
        }
    }

    public final void a() {
    }

    public final List b(gi9 gi9) {
        gi9 gi92 = gi9;
        boolean i = i();
        nz4 nz4 = nz4.a;
        if (i && !gi9.i()) {
            gi9 gi93 = new gi9((Object) null);
            long[] jArr = gi92.b;
            long[] jArr2 = gi92.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr2[i2];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                long j2 = jArr[(i2 << 3) + i5];
                                if (!((Boolean) this.u0.invoke(Long.valueOf(j2))).booleanValue()) {
                                    gi93.a(j2);
                                }
                                i3 = 8;
                            }
                            j >>= i3;
                        }
                        if (i4 != i3) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            gi92.m(gi93);
            if (i() && !gi9.i()) {
                return oag.F(gi9);
            }
        }
        return nz4;
    }

    public final void c(gi9 gi9, f52 f52, gi9 gi92) {
        boolean z = f52.X0 == 2;
        for (Long longValue : f52.o.keySet()) {
            long longValue2 = longValue.longValue();
            if (z) {
                gi9.a(longValue2);
            } else {
                gi92.a(longValue2);
            }
        }
        Map map = f52.M0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                gi92.a(((Long) entry.getKey()).longValue());
                gi92.a(((ca) entry.getValue()).c);
            }
        }
        fs8 fs8 = f52.t0;
        if (fs8 != null) {
            e(fs8, gi9, gi92, 5, false);
        }
        fs8 fs82 = f52.H0;
        if (fs82 != null) {
            e(fs82, gi9, gi92, 5, false);
        }
        gi92.a(f52.c);
    }

    public final gi9 d(List list, gi9 gi9) {
        gi9 gi92 = new gi9(list.size());
        if (list.isEmpty()) {
            return gi92;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(gi92, (f52) it.next(), gi9);
        }
        return gi92;
    }

    public final void g(List list, gi9 gi9, gi9 gi92) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e((fs8) it.next(), gi9, gi92, 5, false);
            }
        }
    }

    public final dr9 h() {
        return (dr9) this.Z.getValue();
    }

    public final boolean i() {
        return !(((jbd) ((hbd) ((ch3) this.Y.getValue()).d.getValue())).h == 1);
    }

    public final Object j(long j, List list, Continuation continuation) {
        return j1e.k(new pb9(list, this, j, (Continuation) null), continuation);
    }

    public final void k(f52 f52) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "MissedContactsController", "requestForChat: chat=" + f52, (Throwable) null);
        }
        gi9 gi9 = new gi9((Object) null);
        gi9 d = d(Collections.singletonList(f52), gi9);
        h().c(gi9);
        if (!d.i()) {
            List b2 = b(d);
            if (!b2.isEmpty()) {
                Object unused = j47.f0(hz4.a, new qb9(this, b2, (Continuation) null));
            }
        }
    }

    public final Object l(dc2 dc2, long j, Continuation continuation) {
        Object j2;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            f52 f52 = dc2.o;
            Long l = f52 != null ? new Long(f52.a) : null;
            ir6.d(us7, "MissedContactsController", "requestForChatHistory: response=" + l, (Throwable) null);
        }
        gi9 gi9 = new gi9((Object) null);
        gi9 gi92 = new gi9((Object) null);
        g(dc2.c, gi9, gi92);
        f52 f522 = dc2.o;
        if (f522 != null) {
            c(gi9, f522, gi92);
        }
        h().c(gi92);
        List b2 = b(gi9);
        boolean isEmpty = b2.isEmpty();
        e5f e5f = e5f.a;
        return (!isEmpty && (j2 = j(j, b2, continuation)) == tx3.a) ? j2 : e5f;
    }

    public final void m(lc2 lc2) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "MissedContactsController", "requestForChatInfo: response=" + lc2, (Throwable) null);
        }
        gi9 gi9 = new gi9((Object) null);
        gi9 d = d(lc2.c, gi9);
        f52 f52 = lc2.o;
        if (f52 != null) {
            c(d, f52, gi9);
        }
        h().c(gi9);
        if (!d.i()) {
            List b2 = b(d);
            if (!b2.isEmpty()) {
                Object unused = j47.f0(hz4.a, new rb9(this, b2, (Continuation) null));
            }
        }
    }

    public final void n(List list) {
        if (list != null && !list.isEmpty()) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, "MissedContactsController", "requestForChats: chats=".concat(x53.n0(list, (String) null, (String) null, (String) null, (m56) null, 63)), (Throwable) null);
            }
            gi9 gi9 = new gi9((Object) null);
            gi9 d = d(list, gi9);
            h().c(gi9);
            if (!d.i()) {
                List b2 = b(d);
                if (!b2.isEmpty()) {
                    Object unused = j47.f0(hz4.a, new sb9(this, b2, (Continuation) null));
                }
            }
        }
    }

    public final Object o(e52 e52, Continuation continuation) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "MissedContactsController", "requestForChat: chat=" + e52, (Throwable) null);
        }
        gi9 gi9 = new gi9((Object) null);
        gi9 gi92 = new gi9((Object) null);
        boolean M = e52.M();
        for (Long longValue : e52.b.e.keySet()) {
            long longValue2 = longValue.longValue();
            if (M) {
                gi92.a(longValue2);
            } else {
                gi9.a(longValue2);
            }
        }
        Map map = e52.b.R;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                gi9.a(((Long) entry.getKey()).longValue());
                gi9.a(((t82) entry.getValue()).c);
            }
        }
        es8 es8 = e52.c;
        if (es8 != null) {
            f(es8.a, gi92, gi9, 5, false);
        }
        es8 es82 = e52.X;
        if (es82 != null) {
            f(es82.a, gi92, gi9, 5, false);
        }
        gi9.a(e52.b.d);
        h().c(gi9);
        boolean i = gi92.i();
        e5f e5f = e5f.a;
        if (i) {
            return e5f;
        }
        List b2 = b(gi92);
        if (b2.isEmpty()) {
            return e5f;
        }
        int i2 = ft4.o;
        Object j = j(z7.R(10, kt4.SECONDS), b2, continuation);
        return j == tx3.a ? j : e5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(defpackage.kt7 r8, long r9, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.tb9
            if (r0 == 0) goto L_0x0013
            r0 = r11
            tb9 r0 = (defpackage.tb9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            tb9 r0 = new tb9
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            gi9 r7 = r0.X
            xb9 r8 = r0.o
            defpackage.od2.a0(r11)
            r2 = r7
            r7 = r8
            goto L_0x00b8
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            defpackage.od2.a0(r11)
            java.lang.String r11 = "requestForLogin"
            java.lang.String r2 = "MissedContactsController"
            defpackage.hm9.m(r2, r11, new java.lang.Object[0])
            java.util.ArrayList r11 = r8.c()
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r11, r4)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L_0x0053:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r11.next()
            wm3 r4 = (defpackage.wm3) r4
            long r4 = r4.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r2.add(r6)
            goto L_0x0053
        L_0x006a:
            gi9 r11 = defpackage.oag.G(r2)
            gi9 r2 = new gi9
            r4 = 0
            r2.<init>((java.lang.Object) r4)
            java.util.List r4 = r8.o
            gi9 r4 = r7.d(r4, r2)
            java.util.Map r5 = r8.u0
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x0084:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0094
            java.lang.Object r6 = r5.next()
            java.util.List r6 = (java.util.List) r6
            r7.g(r6, r4, r2)
            goto L_0x0084
        L_0x0094:
            r4.m(r11)
            nab r8 = r8.c
            if (r8 == 0) goto L_0x00a4
            wm3 r8 = r8.a
            if (r8 == 0) goto L_0x00a4
            long r5 = r8.a
            r4.l(r5)
        L_0x00a4:
            r2.m(r11)
            java.util.List r8 = r7.b(r4)
            r0.o = r7
            r0.X = r2
            r0.s0 = r3
            java.lang.Object r8 = r7.j(r9, r8, r0)
            if (r8 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            dr9 r7 = r7.h()
            r7.c(r2)
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb9.p(kt7, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void q(hs9 hs9) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "MissedContactsController", "requestForNotifMessage: response=" + hs9, (Throwable) null);
        }
        gi9 gi9 = new gi9((Object) null);
        gi9 gi92 = new gi9((Object) null);
        e(hs9.X, gi9, gi92, 5, false);
        f52 f52 = hs9.o;
        if (f52 != null) {
            c(gi9, f52, gi92);
        }
        h().c(gi92);
        if (!gi9.i()) {
            List b2 = b(gi9);
            if (!b2.isEmpty()) {
                Object unused = j47.f0(hz4.a, new ub9(this, b2, (Continuation) null));
            }
        }
    }

    public final void r(at9 at9) {
        long j = at9.o;
        gi9 gi9 = vv7.a;
        gi9 gi92 = new gi9(1);
        gi92.b[gi92.e(j)] = j;
        List b2 = b(gi92);
        if (!b2.isEmpty()) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                Object g0 = x53.g0(b2);
                ir6.d(us7, "MissedContactsController", "requestForTyping: id=#" + g0, (Throwable) null);
            }
            h().d(b2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        r5 = j(r8, r6, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(long r6, long r8, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0005
            goto L_0x0019
        L_0x0005:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0019
            us7 r1 = defpackage.us7.X
            java.lang.String r2 = "requestForUser: id=#"
            java.lang.String r2 = defpackage.ey8.h(r6, r2)
            r3 = 0
            java.lang.String r4 = "MissedContactsController"
            r0.d(r1, r4, r2, r3)
        L_0x0019:
            gi9 r0 = defpackage.vv7.a
            gi9 r0 = new gi9
            r1 = 1
            r0.<init>((int) r1)
            int r1 = r0.e(r6)
            long[] r2 = r0.b
            r2[r1] = r6
            java.util.List r6 = r5.b(r0)
            boolean r7 = r6.isEmpty()
            e5f r0 = defpackage.e5f.a
            if (r7 == 0) goto L_0x0036
            return r0
        L_0x0036:
            java.lang.Object r5 = r5.j(r8, r6, r10)
            tx3 r6 = defpackage.tx3.a
            if (r5 != r6) goto L_0x003f
            return r5
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb9.s(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object t(gi9 gi9, long j, Continuation continuation) {
        List b2 = b(gi9);
        boolean isEmpty = b2.isEmpty();
        e5f e5f = e5f.a;
        if (isEmpty) {
            return e5f;
        }
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "MissedContactsController", zr6.i("requestForUsers: ids=[", x53.n0(b2, (String) null, (String) null, (String) null, (m56) null, 63), "]"), (Throwable) null);
        }
        Object j2 = j(j, b2, continuation);
        return j2 == tx3.a ? j2 : e5f;
    }

    public final void u(def def) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "MissedContactsController", "requestForVideoConference: videoConference=" + def, (Throwable) null);
        }
        wm3 wm3 = def.a;
        if (wm3 != null) {
            h().b(wm3.a);
        }
    }
}
