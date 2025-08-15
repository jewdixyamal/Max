package defpackage;

/* renamed from: x8d  reason: default package */
public final class x8d extends g9d {
    public final long A0;
    public final int B0;
    public final String C0;
    public final String D0;
    public final String z0;

    public x8d(w8d w8d) {
        super(w8d);
        this.z0 = w8d.l;
        this.A0 = w8d.m;
        this.B0 = w8d.n;
        this.C0 = w8d.o;
        this.D0 = w8d.p;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m20] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, m10] */
    /* JADX WARNING: type inference failed for: r1v4, types: [j10, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0133, code lost:
        if (defpackage.oag.t(r8) == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0154, code lost:
        if (defpackage.oag.t(r8) == false) goto L_0x0158;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bu8 y() {
        /*
            r17 = this;
            r1 = r17
            m20 r2 = new m20
            r2.<init>()
            m10 r3 = new m10
            r3.<init>()
            long r4 = r1.A0
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0016
            r8 = r4
            goto L_0x0017
        L_0x0016:
            r8 = r6
        L_0x0017:
            r3.b = r8
            java.lang.String r8 = r1.z0
            boolean r9 = defpackage.oag.t(r8)
            r10 = 0
            if (r9 != 0) goto L_0x0024
            goto L_0x0158
        L_0x0024:
            if (r0 <= 0) goto L_0x0136
            e8d r0 = r1.a
            if (r0 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r10
        L_0x002c:
            je7 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            af8 r0 = (defpackage.af8) r0
            e8d r8 = r1.a
            if (r8 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r8 = r10
        L_0x003a:
            je7 r8 = r8.i
            java.lang.Object r8 = r8.getValue()
            el3 r8 = (defpackage.el3) r8
            e8d r9 = r1.a
            if (r9 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r9 = r10
        L_0x0048:
            je7 r9 = r9.C
            java.lang.Object r9 = r9.getValue()
            wlc r9 = (defpackage.wlc) r9
            cj0 r0 = (defpackage.cj0) r0
            adb r0 = r0.e
            r0.getClass()
            java.lang.Object r11 = r0.b
            f6a r11 = (defpackage.f6a) r11
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r13 = "getVcfByContactId: contactId %d"
            java.lang.String r14 = "adb"
            defpackage.hm9.m(r14, r13, r12)
            je7 r12 = r11.a     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ Exception -> 0x0082 }
            eua r12 = (defpackage.eua) r12     // Catch:{ Exception -> 0x0082 }
            java.lang.String[] r13 = defpackage.eua.f     // Catch:{ Exception -> 0x0082 }
            boolean r12 = r12.b(r13)     // Catch:{ Exception -> 0x0082 }
            if (r12 != 0) goto L_0x0085
            java.lang.String r0 = "getVcfByContactId: no permissions for contacts"
            defpackage.hm9.p(r14, r0, r10)     // Catch:{ Exception -> 0x0082 }
        L_0x007f:
            r8 = r10
            goto L_0x012f
        L_0x0082:
            r0 = move-exception
            goto L_0x011a
        L_0x0085:
            if (r8 != 0) goto L_0x008c
            java.lang.String r12 = "Contact controller is null"
            defpackage.hm9.p(r14, r12, r10)     // Catch:{ Exception -> 0x0082 }
        L_0x008c:
            r12 = 0
            uj3 r8 = r8.i(r4, r12)     // Catch:{ Exception -> 0x0082 }
            if (r8 != 0) goto L_0x00a1
            java.lang.String r0 = "getVcfByContactId: no contact found for id %d"
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ Exception -> 0x0082 }
            defpackage.hm9.q(r14, r0, r6)     // Catch:{ Exception -> 0x0082 }
            goto L_0x007f
        L_0x00a1:
            long r15 = r8.o()     // Catch:{ Exception -> 0x0082 }
            int r6 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x00b7
            java.lang.String r0 = "getVcfByContactId: no server phone for contact id %d"
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ Exception -> 0x0082 }
            defpackage.hm9.q(r14, r0, r6)     // Catch:{ Exception -> 0x0082 }
            goto L_0x007f
        L_0x00b7:
            long r6 = r8.o()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r8 = "getVcfByServerPhone: no phoneDb found with server phone "
            je7 r11 = r11.a     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ Exception -> 0x00d2 }
            eua r11 = (defpackage.eua) r11     // Catch:{ Exception -> 0x00d2 }
            boolean r11 = r11.b(r13)     // Catch:{ Exception -> 0x00d2 }
            if (r11 != 0) goto L_0x00d4
            java.lang.String r0 = "getVcfByServerPhone: no permissions for contacts"
            defpackage.hm9.p(r14, r0, r10)     // Catch:{ Exception -> 0x00d2 }
        L_0x00d0:
            r0 = r10
            goto L_0x0118
        L_0x00d2:
            r0 = move-exception
            goto L_0x0104
        L_0x00d4:
            r9.getClass()     // Catch:{ Exception -> 0x00d2 }
            java.lang.Long r11 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x00d2 }
            java.util.List r11 = java.util.Collections.singletonList(r11)     // Catch:{ Exception -> 0x00d2 }
            java.util.ArrayList r9 = r9.f(r11)     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r9 = defpackage.x53.i0(r9)     // Catch:{ Exception -> 0x00d2 }
            wua r9 = (defpackage.wua) r9     // Catch:{ Exception -> 0x00d2 }
            if (r9 != 0) goto L_0x00fd
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x00d2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d2 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00d2 }
            r0.append(r6)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00d2 }
            defpackage.hm9.p(r14, r0, r10)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00d0
        L_0x00fd:
            int r8 = r9.o     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = r0.q(r8)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x0118
        L_0x0104:
            java.util.Locale r8 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0082 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            java.lang.String r9 = "getVcfByServerPhone: exception for server phone "
            r8.<init>(r9)     // Catch:{ Exception -> 0x0082 }
            r8.append(r6)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x0082 }
            defpackage.hm9.p(r14, r6, r0)     // Catch:{ Exception -> 0x0082 }
            goto L_0x00d0
        L_0x0118:
            r8 = r0
            goto L_0x012f
        L_0x011a:
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "getVcfByContactId: exception for contactId "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            defpackage.hm9.p(r14, r4, r0)
            goto L_0x007f
        L_0x012f:
            boolean r0 = defpackage.oag.t(r8)
            if (r0 != 0) goto L_0x0136
            goto L_0x0158
        L_0x0136:
            int r0 = r1.B0
            if (r0 <= 0) goto L_0x0157
            e8d r4 = r1.a
            if (r4 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r4 = r10
        L_0x0140:
            je7 r4 = r4.A
            java.lang.Object r4 = r4.getValue()
            af8 r4 = (defpackage.af8) r4
            cj0 r4 = (defpackage.cj0) r4
            adb r4 = r4.e
            java.lang.String r8 = r4.q(r0)
            boolean r0 = defpackage.oag.t(r8)
            if (r0 != 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r8 = r10
        L_0x0158:
            r3.a = r8
            java.lang.String r0 = r1.D0
            boolean r4 = defpackage.oag.t(r0)
            if (r4 == 0) goto L_0x0163
            r0 = r10
        L_0x0163:
            r3.h = r0
            java.lang.String r0 = r1.C0
            boolean r1 = defpackage.oag.t(r0)
            if (r1 == 0) goto L_0x016f
            r1 = r10
            goto L_0x0170
        L_0x016f:
            r1 = r0
        L_0x0170:
            r3.c = r1
            boolean r1 = defpackage.oag.t(r0)
            if (r1 == 0) goto L_0x0179
            goto L_0x017a
        L_0x0179:
            r10 = r0
        L_0x017a:
            r3.d = r10
            n10 r0 = new n10
            r0.<init>(r3)
            j10 r1 = new j10
            r1.<init>()
            r1.s = r0
            g20 r0 = defpackage.g20.v0
            r1.a = r0
            l20 r0 = r1.a()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2.a = r0
            k8g r0 = r2.c()
            bu8 r1 = new bu8
            r1.<init>()
            r1.n = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x8d.y():bu8");
    }
}
