package defpackage;

/* renamed from: ch3  reason: default package */
public final class ch3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public ch3(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    public final gh3 a() {
        return (gh3) this.c.getValue();
    }

    public final ri4 b() {
        return (ri4) this.b.getValue();
    }

    public final boolean c() {
        boolean z = !a().a() && (!e() || !b().d() || !b().c()) && d();
        hm9.m("ch3", "isBackgroundDataDisabledAndOnMobileNetwork: %b, isOnline=%b, appIsVisible=%b, hasForegroundServicesAlive=%b, isOnMobileNetwork=%b", Boolean.valueOf(z), Boolean.valueOf(e()), Boolean.valueOf(b().d()), Boolean.valueOf(b().c()), Boolean.valueOf(d()));
        return z;
    }

    public final boolean d() {
        return (a().b() == zh3.c || a().b() == zh3.b) ? false : true;
    }

    public final boolean e() {
        return ((jbd) ((hbd) this.d.getValue())).h == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0072, code lost:
        if (r8 == false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r13 = this;
            ri4 r0 = r13.b()
            boolean r0 = r0.d()
            ri4 r1 = r13.b()
            boolean r1 = r1.c()
            ri4 r2 = r13.b()
            ti4 r2 = (defpackage.ti4) r2
            u8e r2 = r2.g
            xe6 r2 = (defpackage.xe6) r2
            boolean r2 = r2.a()
            r3 = 1
            r2 = r2 ^ r3
            gh3 r4 = r13.a()
            zh3 r4 = r4.b()
            je7 r5 = r13.a
            java.lang.Object r5 = r5.getValue()
            m7b r5 = (defpackage.m7b) r5
            p7b r5 = (defpackage.p7b) r5
            t33 r5 = r5.a
            r5.getClass()
            ne7 r5 = r5.g
            java.lang.String r6 = "app.forceConnection"
            r7 = 0
            boolean r5 = r5.getBoolean(r6, r7)
            r6 = 2
            if (r0 != 0) goto L_0x0074
            if (r1 != 0) goto L_0x0074
            if (r2 != 0) goto L_0x0074
            if (r5 == 0) goto L_0x004a
            goto L_0x0074
        L_0x004a:
            gh3 r8 = r13.a()
            boolean r8 = r8.f()
            je7 r9 = r13.a
            java.lang.Object r9 = r9.getValue()
            m7b r9 = (defpackage.m7b) r9
            p7b r9 = (defpackage.p7b) r9
            z7d r9 = r9.b
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r10 = ru.ok.tamtam.android.prefs.PmsKey.f57keepconnection
            long r11 = (long) r6
            long r9 = r9.q(r10, r11)
            int r9 = (int) r9
            if (r9 == 0) goto L_0x0076
            if (r9 == r3) goto L_0x006e
            goto L_0x0077
        L_0x006e:
            zh3 r9 = defpackage.zh3.c
            if (r4 != r9) goto L_0x0077
            if (r8 == 0) goto L_0x0077
        L_0x0074:
            r7 = r3
            goto L_0x0077
        L_0x0076:
            r7 = r8
        L_0x0077:
            ir6 r8 = defpackage.hm9.m
            if (r8 != 0) goto L_0x007d
            goto L_0x00f5
        L_0x007d:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x00f5
            us7 r9 = defpackage.us7.X
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "shouldConnect: "
            r10.<init>(r11)
            r10.append(r7)
            java.lang.String r11 = "\nappVisible: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = "\nhasForegroundServicesAlive: "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = "\nnoServices: "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = "\nforceConnection: "
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = "\nconnectionType: "
            r10.append(r0)
            java.lang.String r0 = r4.a()
            r10.append(r0)
            java.lang.String r0 = "\nkeepAlive: "
            r10.append(r0)
            je7 r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            m7b r13 = (defpackage.m7b) r13
            p7b r13 = (defpackage.p7b) r13
            z7d r13 = r13.b
            r13.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f57keepconnection
            long r1 = (long) r6
            long r0 = r13.q(r0, r1)
            int r13 = (int) r0
            if (r13 == 0) goto L_0x00e6
            if (r13 == r3) goto L_0x00e3
            if (r13 == r6) goto L_0x00e0
            java.lang.String r13 = "unknown"
            goto L_0x00e8
        L_0x00e0:
            java.lang.String r13 = "never"
            goto L_0x00e8
        L_0x00e3:
            java.lang.String r13 = "wifi"
            goto L_0x00e8
        L_0x00e6:
            java.lang.String r13 = "always"
        L_0x00e8:
            r10.append(r13)
            java.lang.String r13 = r10.toString()
            r0 = 0
            java.lang.String r1 = "ch3"
            r8.d(r9, r1, r13, r0)
        L_0x00f5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch3.f():boolean");
    }
}
