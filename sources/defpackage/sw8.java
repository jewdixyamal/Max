package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: sw8  reason: default package */
public final class sw8 {
    public final rm4 a;

    public sw8(rm4 rm4) {
        this.a = rm4;
    }

    public static boolean a(e52 e52, qe5 qe5, boolean z) {
        if (e52 == null || !e52.e0()) {
            return false;
        }
        return !e52.I() || e52.x() || (((se5) qe5).t() && ((e52.y() && z) || e52.d0() || oag.s(e52.e(e52.Y), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) || z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r0 = r7.z0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(defpackage.e52 r6, defpackage.cu8 r7) {
        /*
            boolean r0 = r7.v()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r7.n()
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r7.s0
            boolean r0 = defpackage.oag.t(r0)
            if (r0 == 0) goto L_0x002a
            k8g r0 = r7.z0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r2 = r0.b
            z07 r2 = (defpackage.z07) r2
            if (r2 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r0.c
            wgc r0 = (defpackage.wgc) r0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            if (r6 == 0) goto L_0x0041
            k92 r6 = r6.b
            boolean r6 = r6.g()
            if (r6 == 0) goto L_0x0041
            long r2 = r7.c
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0041
            int r6 = r7.M0
            if (r6 != 0) goto L_0x0041
            r1 = 1
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.c(e52, cu8):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.e52 r12, defpackage.es8 r13) {
        /*
            r11 = this;
            cu8 r0 = r13.a
            boolean r1 = r0.v()
            r2 = 0
            if (r1 != 0) goto L_0x0159
            boolean r1 = r0.w()
            if (r1 != 0) goto L_0x0159
            boolean r1 = r0.D()
            if (r1 != 0) goto L_0x0159
            boolean r1 = r0.y()
            if (r1 != 0) goto L_0x0159
            boolean r1 = r0.u()
            if (r1 != 0) goto L_0x0159
            boolean r1 = r0.n()
            k8g r3 = r0.z0
            if (r1 == 0) goto L_0x0033
            g20 r1 = defpackage.g20.t0
            l20 r1 = r3.k(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0159
        L_0x0033:
            boolean r1 = r0.p()
            if (r1 != 0) goto L_0x0159
            boolean r1 = r0.B()
            if (r1 != 0) goto L_0x0159
            boolean r1 = r0.t()
            if (r1 == 0) goto L_0x0047
            goto L_0x0159
        L_0x0047:
            rm4 r11 = r11.a
            java.lang.Object r1 = r11.get()
            m7b r1 = (defpackage.m7b) r1
            p7b r1 = (defpackage.p7b) r1
            se5 r1 = r1.e
            boolean r1 = r12.U(r1)
            if (r1 != 0) goto L_0x005a
            return r2
        L_0x005a:
            boolean r1 = r0.n()
            r4 = 1
            if (r1 == 0) goto L_0x009e
            java.lang.Object r1 = r3.a
            java.util.List r1 = (java.util.List) r1
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0071
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x0071
            r5 = r2
            goto L_0x0096
        L_0x0071:
            java.util.Iterator r1 = r1.iterator()
            r5 = r2
        L_0x0076:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0096
            java.lang.Object r6 = r1.next()
            l20 r6 = (defpackage.l20) r6     // Catch:{ all -> 0x008f }
            g20 r6 = r6.a     // Catch:{ all -> 0x008f }
            g20 r7 = defpackage.g20.c     // Catch:{ all -> 0x008f }
            if (r6 == r7) goto L_0x008c
            g20 r7 = defpackage.g20.o     // Catch:{ all -> 0x008f }
            if (r6 != r7) goto L_0x0076
        L_0x008c:
            int r5 = r5 + 1
            goto L_0x0076
        L_0x008f:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r11)
            throw r12
        L_0x0096:
            int r1 = r3.i()
            if (r5 != r1) goto L_0x009e
            r1 = r4
            goto L_0x009f
        L_0x009e:
            r1 = r2
        L_0x009f:
            java.lang.String r3 = r0.s0
            boolean r3 = defpackage.oag.t(r3)
            if (r3 == 0) goto L_0x00aa
            if (r1 != 0) goto L_0x00aa
            return r2
        L_0x00aa:
            boolean r1 = r12.I()
            if (r1 == 0) goto L_0x0102
            java.lang.Object r0 = r11.get()
            m7b r0 = (defpackage.m7b) r0
            p7b r0 = (defpackage.p7b) r0
            se5 r0 = r0.e
            boolean r0 = r0.t()
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r12.y()
            if (r0 == 0) goto L_0x00ce
            uj3 r13 = r13.b
            boolean r13 = r13.Y
            if (r13 == 0) goto L_0x00ce
            r13 = r4
            goto L_0x00cf
        L_0x00ce:
            r13 = r2
        L_0x00cf:
            java.lang.Object r11 = r11.get()
            m7b r11 = (defpackage.m7b) r11
            p7b r11 = (defpackage.p7b) r11
            se5 r11 = r11.e
            boolean r11 = r11.t()
            if (r11 == 0) goto L_0x00f5
            boolean r11 = r12.d0()
            if (r11 != 0) goto L_0x00f3
            long r0 = r12.Y
            int r11 = r12.e(r0)
            r0 = 512(0x200, float:7.175E-43)
            boolean r11 = defpackage.oag.s(r11, r0)
            if (r11 == 0) goto L_0x00f5
        L_0x00f3:
            r11 = r4
            goto L_0x00f6
        L_0x00f5:
            r11 = r2
        L_0x00f6:
            boolean r12 = r12.x()
            if (r12 != 0) goto L_0x0100
            if (r13 != 0) goto L_0x0100
            if (r11 == 0) goto L_0x0101
        L_0x0100:
            r2 = r4
        L_0x0101:
            return r2
        L_0x0102:
            boolean r13 = r0.o()
            if (r13 == 0) goto L_0x0109
            return r4
        L_0x0109:
            long r5 = r0.c
            r7 = 0
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 == 0) goto L_0x013a
            java.lang.Object r13 = r11.get()
            m7b r13 = (defpackage.m7b) r13
            p7b r13 = (defpackage.p7b) r13
            t33 r1 = r13.a
            long r5 = r1.n()
            long r9 = r0.o
            long r5 = r5 - r9
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r9
            z7d r13 = r13.b
            r13.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f36edittimeout
            r3 = 86400(0x15180, float:1.21072E-40)
            long r9 = (long) r3
            long r9 = r13.q(r1, r9)
            int r13 = (int) r9
            long r9 = (long) r13
            int r13 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0159
        L_0x013a:
            java.lang.Object r11 = r11.get()
            m7b r11 = (defpackage.m7b) r11
            p7b r11 = (defpackage.p7b) r11
            t33 r11 = r11.a
            long r5 = r11.t()
            long r0 = r0.Y
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x0158
            boolean r11 = r12.F()
            if (r11 == 0) goto L_0x0159
            int r11 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0159
        L_0x0158:
            r2 = r4
        L_0x0159:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.b(e52, es8):boolean");
    }

    public final boolean d(e52 e52, es8 es8) {
        if (e52.U(((p7b) ((m7b) this.a.get())).e) && e52.b.g()) {
            cu8 cu8 = es8.a;
            return cu8.c != 0 && cu8.M0 == 0;
        }
    }
}
