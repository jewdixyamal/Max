package defpackage;

/* renamed from: ku8  reason: default package */
public final class ku8 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        r22.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c5, code lost:
        r4 = r0;
        defpackage.hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", r4);
        r0 = defpackage.u7d.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02d3, code lost:
        if (r0.hasNext() != false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02d5, code lost:
        ((defpackage.r4a) r0.next()).getClass();
        defpackage.r4a.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02e2, code lost:
        r0 = defpackage.au1.s(defpackage.k7d.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02e8, code lost:
        if (r0 != 0) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02eb, code lost:
        if (r0 != 1) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02f2, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02f3, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.lu8 a(defpackage.gy8 r22) {
        /*
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            r4 = 1
            int r0 = defpackage.lz7.N(r22)     // Catch:{ all -> 0x000b }
            r5 = r0
            goto L_0x003b
        L_0x000b:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r2, r1, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0029
            java.lang.Object r6 = r0.next()
            r4a r6 = (defpackage.r4a) r6
            r6.getClass()
            defpackage.r4a.a(r5)
            goto L_0x0016
        L_0x0029:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x003a
            if (r0 == r4) goto L_0x0039
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0039:
            throw r5
        L_0x003a:
            r5 = 0
        L_0x003b:
            r6 = 0
            if (r5 != 0) goto L_0x003f
            return r6
        L_0x003f:
            pu8 r7 = defpackage.pu8.a
            r14 = r6
            r18 = r14
            r15 = r7
            r10 = 0
            r12 = 0
            r16 = 0
            r17 = 0
        L_0x004c:
            if (r10 >= r5) goto L_0x0341
            java.lang.String r0 = defpackage.lz7.P(r22)     // Catch:{ all -> 0x0053 }
            goto L_0x0083
        L_0x0053:
            r0 = move-exception
            r11 = r0
            defpackage.hm9.l0(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x005e:
            boolean r19 = r0.hasNext()
            if (r19 == 0) goto L_0x0071
            java.lang.Object r19 = r0.next()
            r4a r19 = (defpackage.r4a) r19
            r19.getClass()
            defpackage.r4a.a(r11)
            goto L_0x005e
        L_0x0071:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0082
            if (r0 == r4) goto L_0x0081
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0081:
            throw r11
        L_0x0082:
            r0 = r6
        L_0x0083:
            if (r0 != 0) goto L_0x008f
            r6 = r22
            r20 = r12
            r3 = 0
            r8 = 0
            r12 = r4
            goto L_0x0339
        L_0x008f:
            int r11 = r0.hashCode()
            switch(r11) {
                case -2102099874: goto L_0x02b6;
                case -1483200242: goto L_0x0272;
                case -1106363674: goto L_0x0225;
                case 3151786: goto L_0x01d8;
                case 3575610: goto L_0x0142;
                case 405645655: goto L_0x0099;
                default: goto L_0x0096;
            }
        L_0x0096:
            r3 = 0
            goto L_0x02bf
        L_0x0099:
            java.lang.String r11 = "attributes"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00a2
            goto L_0x0096
        L_0x00a2:
            av8 r0 = r22.n()     // Catch:{ all -> 0x0107 }
            int r0 = r0.a()     // Catch:{ all -> 0x0107 }
            r11 = 8
            if (r0 != r11) goto L_0x0100
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0107 }
            r0.<init>()     // Catch:{ all -> 0x0107 }
            int r11 = r22.x0()     // Catch:{ all -> 0x0107 }
            r6 = 0
        L_0x00b8:
            if (r6 >= r11) goto L_0x0104
            java.lang.String r8 = r22.z0()     // Catch:{ all -> 0x0107 }
            n1 r9 = r22.A0()     // Catch:{ all -> 0x0107 }
            int r3 = r9.e()     // Catch:{ all -> 0x0107 }
            r4 = 5
            if (r3 != r4) goto L_0x00cb
            r3 = 1
            goto L_0x00cc
        L_0x00cb:
            r3 = 0
        L_0x00cc:
            if (r3 == 0) goto L_0x00df
            px6 r3 = r9.p()     // Catch:{ all -> 0x0107 }
            m1 r3 = (defpackage.m1) r3     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r3.y()     // Catch:{ all -> 0x0107 }
            r0.put(r8, r3)     // Catch:{ all -> 0x0107 }
            int r6 = r6 + 1
            r4 = 1
            goto L_0x00b8
        L_0x00df:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0107 }
            int r3 = r9.e()     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = defpackage.h4f.s(r3)     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "type = "
            r4.<init>(r6)     // Catch:{ all -> 0x0107 }
            r4.append(r3)     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = " not supported"
            r4.append(r3)     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0107 }
            r0.<init>(r3)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0100:
            r22.z()     // Catch:{ all -> 0x0107 }
            r0 = 0
        L_0x0104:
            r18 = r0
            goto L_0x0138
        L_0x0107:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r3 = defpackage.u7d.a
            java.util.Iterator r3 = r3.iterator()
        L_0x0111:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0124
            java.lang.Object r4 = r3.next()
            r4a r4 = (defpackage.r4a) r4
            r4.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0111
        L_0x0124:
            int r3 = defpackage.k7d.a
            int r3 = defpackage.au1.s(r3)
            if (r3 == 0) goto L_0x0136
            r4 = 1
            if (r3 == r4) goto L_0x0135
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0135:
            throw r0
        L_0x0136:
            r18 = 0
        L_0x0138:
            r3 = 0
        L_0x0139:
            r8 = 0
            r6 = r22
            r20 = r12
            r12 = 1
            goto L_0x0339
        L_0x0142:
            java.lang.String r3 = "type"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x014c
            goto L_0x0096
        L_0x014c:
            java.lang.String r0 = defpackage.lz7.P(r22)     // Catch:{ all -> 0x0151 }
            goto L_0x0184
        L_0x0151:
            r0 = move-exception
            r3 = r0
            defpackage.hm9.l0(r2, r1, r3)     // Catch:{ all -> 0x016f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x016f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x016f }
        L_0x015c:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x016f }
            if (r4 == 0) goto L_0x0171
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x016f }
            r4a r4 = (defpackage.r4a) r4     // Catch:{ all -> 0x016f }
            r4.getClass()     // Catch:{ all -> 0x016f }
            defpackage.r4a.a(r3)     // Catch:{ all -> 0x016f }
            goto L_0x015c
        L_0x016f:
            r0 = move-exception
            goto L_0x0197
        L_0x0171:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x016f }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0183
            r4 = 1
            if (r0 == r4) goto L_0x0182
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x016f }
            r0.<init>()     // Catch:{ all -> 0x016f }
            throw r0     // Catch:{ all -> 0x016f }
        L_0x0182:
            throw r3     // Catch:{ all -> 0x016f }
        L_0x0183:
            r0 = 0
        L_0x0184:
            if (r0 == 0) goto L_0x018b
            pu8 r0 = defpackage.pu8.valueOf(r0)     // Catch:{ all -> 0x016f }
            goto L_0x019d
        L_0x018b:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x016f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x016f }
            r3.<init>(r0)     // Catch:{ all -> 0x016f }
            throw r3     // Catch:{ all -> 0x016f }
        L_0x0197:
            njc r3 = new njc     // Catch:{ all -> 0x01a6 }
            r3.<init>(r0)     // Catch:{ all -> 0x01a6 }
            r0 = r3
        L_0x019d:
            boolean r3 = r0 instanceof defpackage.njc     // Catch:{ all -> 0x01a6 }
            if (r3 == 0) goto L_0x01a2
            r0 = r7
        L_0x01a2:
            pu8 r0 = (defpackage.pu8) r0     // Catch:{ all -> 0x01a6 }
            r15 = r0
            goto L_0x0138
        L_0x01a6:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r3 = defpackage.u7d.a
            java.util.Iterator r3 = r3.iterator()
        L_0x01b0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01c3
            java.lang.Object r4 = r3.next()
            r4a r4 = (defpackage.r4a) r4
            r4.getClass()
            defpackage.r4a.a(r0)
            goto L_0x01b0
        L_0x01c3:
            int r3 = defpackage.k7d.a
            int r3 = defpackage.au1.s(r3)
            if (r3 == 0) goto L_0x01d5
            r4 = 1
            if (r3 == r4) goto L_0x01d4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d4:
            throw r0
        L_0x01d5:
            r15 = r7
            goto L_0x0138
        L_0x01d8:
            java.lang.String r3 = "from"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01e2
            goto L_0x0096
        L_0x01e2:
            r3 = 0
            java.lang.Short r4 = java.lang.Short.valueOf(r3)
            short r0 = defpackage.lz7.O(r22)     // Catch:{ all -> 0x01f0 }
            java.lang.Short r4 = java.lang.Short.valueOf(r0)     // Catch:{ all -> 0x01f0 }
            goto L_0x021f
        L_0x01f0:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r3 = defpackage.u7d.a
            java.util.Iterator r3 = r3.iterator()
        L_0x01fa:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x020d
            java.lang.Object r6 = r3.next()
            r4a r6 = (defpackage.r4a) r6
            r6.getClass()
            defpackage.r4a.a(r0)
            goto L_0x01fa
        L_0x020d:
            int r3 = defpackage.k7d.a
            int r3 = defpackage.au1.s(r3)
            if (r3 == 0) goto L_0x021f
            r6 = 1
            if (r3 == r6) goto L_0x021e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x021e:
            throw r0
        L_0x021f:
            short r16 = r4.shortValue()
            goto L_0x0138
        L_0x0225:
            java.lang.String r3 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x022f
            goto L_0x0096
        L_0x022f:
            r3 = 0
            java.lang.Short r4 = java.lang.Short.valueOf(r3)
            short r0 = defpackage.lz7.O(r22)     // Catch:{ all -> 0x023d }
            java.lang.Short r4 = java.lang.Short.valueOf(r0)     // Catch:{ all -> 0x023d }
            goto L_0x026c
        L_0x023d:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.u7d.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0247:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x025a
            java.lang.Object r8 = r6.next()
            r4a r8 = (defpackage.r4a) r8
            r8.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0247
        L_0x025a:
            int r6 = defpackage.k7d.a
            int r6 = defpackage.au1.s(r6)
            if (r6 == 0) goto L_0x026c
            r8 = 1
            if (r6 == r8) goto L_0x026b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x026b:
            throw r0
        L_0x026c:
            short r17 = r4.shortValue()
            goto L_0x0139
        L_0x0272:
            r3 = 0
            java.lang.String r4 = "entityName"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x027c
            goto L_0x02bf
        L_0x027c:
            java.lang.String r0 = defpackage.lz7.P(r22)     // Catch:{ all -> 0x0283 }
            r14 = r0
            goto L_0x0139
        L_0x0283:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r2, r1, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x028e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x02a1
            java.lang.Object r6 = r0.next()
            r4a r6 = (defpackage.r4a) r6
            r6.getClass()
            defpackage.r4a.a(r4)
            goto L_0x028e
        L_0x02a1:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x02b3
            r6 = 1
            if (r0 == r6) goto L_0x02b2
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02b2:
            throw r4
        L_0x02b3:
            r14 = 0
            goto L_0x0139
        L_0x02b6:
            r3 = 0
            java.lang.String r4 = "entityId"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02f4
        L_0x02bf:
            r22.z()     // Catch:{ all -> 0x02c4 }
            goto L_0x0139
        L_0x02c4:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r2, r1, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02cf:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x02e2
            java.lang.Object r6 = r0.next()
            r4a r6 = (defpackage.r4a) r6
            r6.getClass()
            defpackage.r4a.a(r4)
            goto L_0x02cf
        L_0x02e2:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0139
            r6 = 1
            if (r0 == r6) goto L_0x02f3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02f3:
            throw r4
        L_0x02f4:
            r8 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r6 = r22
            long r11 = defpackage.lz7.M(r6, r8)     // Catch:{ all -> 0x0306 }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0306 }
        L_0x0304:
            r12 = 1
            goto L_0x0335
        L_0x0306:
            r0 = move-exception
            defpackage.hm9.l0(r2, r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.u7d.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0310:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0323
            java.lang.Object r12 = r11.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0310
        L_0x0323:
            int r11 = defpackage.k7d.a
            int r11 = defpackage.au1.s(r11)
            if (r11 == 0) goto L_0x0304
            r12 = 1
            if (r11 == r12) goto L_0x0334
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0334:
            throw r0
        L_0x0335:
            long r20 = r4.longValue()
        L_0x0339:
            int r10 = r10 + 1
            r4 = r12
            r12 = r20
            r6 = 0
            goto L_0x004c
        L_0x0341:
            lu8 r0 = new lu8
            r11 = r0
            r11.<init>(r12, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku8.a(gy8):lu8");
    }
}
