package defpackage;

import android.text.TextUtils;

/* renamed from: ale  reason: default package */
public final class ale {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public ale(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
    }

    public final eqb a() {
        return (eqb) this.c.getValue();
    }

    public final void b(String str, String str2, String str3, String str4) {
        eqb a2 = a();
        a2.f(false, !((ch3) a2.a.getValue()).c());
        ((ad) this.b.getValue()).f("ACTION_DEEP_LINK_PUSH_RECEIVE");
        ((k4a) ((pk) this.d.getValue())).A(str, false);
        d64 d64 = (d64) this.a.getValue();
        ((p84) d64.c.getValue()).getClass();
        bu9 h = ((bea) d64.b.getValue()).h("ru.oneme.app.misc", true, false);
        if (!TextUtils.isEmpty(str3)) {
            h.f(str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            h.e(str2);
            zt9 zt9 = new zt9(0);
            zt9.f = bu9.c(str2);
            h.q(zt9);
        }
        if (!TextUtils.isEmpty(str4)) {
            h.k(ld0.a(d64.a, (ida) d64.d.getValue(), (p82) d64.e.getValue(), (pd0) d64.f.getValue(), (uj3) null, str4, ((hyc) ((q33) d64.g.getValue())).q(), (ztc) d64.h.getValue()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(long r17, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            r16 = this;
            eqb r0 = r16.a()
            r1 = 1
            r0.f(r1, r1)
            je7 r0 = r0.w0
            java.lang.Object r0 = r0.getValue()
            fqb r0 = (defpackage.fqb) r0
            r0.getClass()
            bc7[] r2 = defpackage.fqb.e
            r3 = 0
            r4 = r2[r3]
            rm4 r4 = r0.c
            java.lang.Object r4 = r4.get()
            ch3 r4 = (defpackage.ch3) r4
            boolean r4 = r4.c()
            r5 = 0
            if (r4 == 0) goto L_0x0032
            java.lang.String r0 = defpackage.fqb.f
            java.lang.String r1 = "onPush: skip wakelock, backgroundDataDisabledAndOnMobileNetwork"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
        L_0x002e:
            r0 = r16
            goto L_0x0158
        L_0x0032:
            y7d r4 = r0.a
            qyc r4 = (defpackage.qyc) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f131wakelockonpush
            boolean r4 = r4.n(r6, r3)
            if (r4 == 0) goto L_0x0067
            r6 = r2[r3]
            rm4 r6 = r0.c
            java.lang.Object r6 = r6.get()
            ch3 r6 = (defpackage.ch3) r6
            boolean r6 = r6.e()
            if (r6 != 0) goto L_0x0067
            ri4 r6 = r0.a()
            boolean r6 = r6.d()
            if (r6 != 0) goto L_0x0067
            ri4 r6 = r0.a()
            boolean r6 = r6.c()
            if (r6 != 0) goto L_0x0067
            r6 = r1
            goto L_0x0068
        L_0x0067:
            r6 = r3
        L_0x0068:
            java.lang.String r7 = defpackage.fqb.f
            ir6 r8 = defpackage.hm9.m
            if (r8 != 0) goto L_0x006f
            goto L_0x00c6
        L_0x006f:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x00c6
            us7 r9 = defpackage.us7.X
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "needWakelockForLogin="
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r11 = ", wakelockOnPushEnabled="
            r10.append(r11)
            r10.append(r4)
            java.lang.String r4 = ", online="
            r10.append(r4)
            r2 = r2[r3]
            rm4 r2 = r0.c
            java.lang.Object r2 = r2.get()
            ch3 r2 = (defpackage.ch3) r2
            boolean r2 = r2.e()
            r10.append(r2)
            java.lang.String r2 = ", appVisible="
            r10.append(r2)
            ri4 r2 = r0.a()
            boolean r2 = r2.d()
            r10.append(r2)
            java.lang.String r2 = ", hasForegroundServicesAlive="
            r10.append(r2)
            ri4 r2 = r0.a()
            boolean r2 = r2.c()
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            r8.d(r9, r7, r2, r5)
        L_0x00c6:
            ri4 r2 = r0.a()
            android.content.Context r3 = r2.a
            android.os.PowerManager r4 = r2.d
            java.lang.String r8 = "power"
            if (r4 != 0) goto L_0x00da
            java.lang.Object r3 = r3.getSystemService(r8)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            r2.d = r3
        L_0x00da:
            android.os.PowerManager r2 = r2.d
            boolean r2 = r2.isDeviceIdleMode()
            if (r6 != 0) goto L_0x00eb
            if (r2 != 0) goto L_0x00eb
            java.lang.String r0 = "onPush: skip wakelock"
            defpackage.hm9.m(r7, r0, new java.lang.Object[0])
            goto L_0x002e
        L_0x00eb:
            java.util.concurrent.atomic.AtomicLong r3 = r0.b
            long r3 = r3.get()
            ri4 r9 = r0.a()
            r9.getClass()
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r3 = r9 - r3
            r11 = 10000(0x2710, float:1.4013E-41)
            long r12 = (long) r11
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x010c
            java.lang.String r0 = "onPush: already acquired wakelock"
            defpackage.hm9.m(r7, r0, new java.lang.Object[0])
            goto L_0x002e
        L_0x010c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "onPush: wakelock, wakelockForLogin=%b, isInDoze=%b"
            defpackage.hm9.m(r7, r3, r2)
            java.util.concurrent.atomic.AtomicLong r2 = r0.b
            r2.set(r9)
            if (r6 == 0) goto L_0x0127
            java.lang.String r2 = "ru.ok.tamtam:push"
            goto L_0x0129
        L_0x0127:
            java.lang.String r2 = "ru.ok.tamtam:doze-wakelock"
        L_0x0129:
            ri4 r0 = r0.a()
            r0.getClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.String r4 = "ri4"
            java.lang.String r6 = "wakeLock: period=%d, tag=%s"
            defpackage.hm9.m(r4, r6, r3)
            android.content.Context r3 = r0.a
            android.os.PowerManager r4 = r0.d
            if (r4 != 0) goto L_0x014d
            java.lang.Object r3 = r3.getSystemService(r8)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            r0.d = r3
        L_0x014d:
            android.os.PowerManager r0 = r0.d
            android.os.PowerManager$WakeLock r0 = r0.newWakeLock(r1, r2)
            r0.acquire(r12)
            goto L_0x002e
        L_0x0158:
            je7 r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            kr1 r0 = (defpackage.kr1) r0
            yg1 r1 = new yg1
            r13 = 0
            r6 = r1
            r7 = r17
            r9 = r19
            r11 = r22
            r12 = r21
            r14 = r24
            r15 = r23
            r6.<init>(r7, r9, r11, r12, r13, r14, r15)
            wr1 r0 = (defpackage.wr1) r0
            je7 r2 = r0.r
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            cx7 r2 = r2.c()
            cx7 r2 = r2.getImmediate()
            sr1 r3 = new sr1
            r3.<init>(r1, r0, r5)
            r1 = 2
            jr1 r0 = r0.a
            defpackage.j47.T(r0, r2, r5, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ale.c(long, long, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void d(l7 l7Var) {
        eqb a2 = a();
        oq0 c2 = ((f5a) a2.v0.getValue()).c();
        boolean z = c2.b;
        boolean z2 = c2.a;
        if (!z2 || z) {
            hm9.m0("eqb", "onReadOnOtherDevice: skipped, authorized=" + z2 + ", external=" + z, new Object[0]);
            return;
        }
        ((rw9) a2.u0.getValue()).f(l7Var.b, l7Var.c);
        a2.f(false, a2.c());
    }

    public final void e() {
        eqb a2 = a();
        a2.f(false, !((ch3) a2.a.getValue()).c());
    }
}
