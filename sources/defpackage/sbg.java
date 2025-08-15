package defpackage;

/* renamed from: sbg  reason: default package */
public final class sbg implements poc {
    public final /* synthetic */ py0 a;

    public sbg(py0 py0) {
        this.a = py0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.ooc r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            py0 r0 = r0.a
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.sxd
            if (r2 == 0) goto L_0x0015
            sxd r1 = (defpackage.sxd) r1
            java.util.List r1 = r1.a
            r0.J1 = r1
            goto L_0x016b
        L_0x0015:
            boolean r2 = r1 instanceof defpackage.u20
            kg1 r3 = r0.p1
            if (r2 == 0) goto L_0x0027
            r0 = r1
            u20 r0 = (defpackage.u20) r0
            java.util.List r0 = r0.a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r3.q(r0)
            goto L_0x016b
        L_0x0027:
            boolean r2 = r1 instanceof defpackage.lvd
            if (r2 == 0) goto L_0x0035
            r0 = r1
            lvd r0 = (defpackage.lvd) r0
            bg1 r0 = r0.a
            r3.o(r0)
            goto L_0x016b
        L_0x0035:
            boolean r2 = r1 instanceof defpackage.gt6
            if (r2 == 0) goto L_0x004a
            gt6 r1 = (defpackage.gt6) r1
            java.util.Map r1 = r1.a
            java.util.HashMap r1 = (java.util.HashMap) r1
            o9g r0 = r0.D1
            java.lang.Object r0 = r0.b
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.putAll(r1)
            goto L_0x016b
        L_0x004a:
            boolean r2 = r1 instanceof defpackage.qkf
            if (r2 == 0) goto L_0x0069
            fd7 r0 = r0.V1
            java.lang.Object r0 = r0.a
            mfe r0 = (defpackage.mfe) r0
            r0.getClass()
            y8 r2 = new y8
            qkf r1 = (defpackage.qkf) r1
            pkf r1 = r1.a
            r2.<init>((java.lang.Object) r1)
            java.lang.Object r0 = r0.a
            lkf r0 = (defpackage.lkf) r0
            r0.r(r2)
            goto L_0x016b
        L_0x0069:
            boolean r2 = r1 instanceof defpackage.co9
            if (r2 == 0) goto L_0x015e
            co9 r1 = (defpackage.co9) r1
            ag1 r0 = r0.u0
            uf0 r0 = r0.A
            r3.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r1 = r1.a
            java.util.Set r4 = r1.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0085:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0155
            java.lang.Object r5 = r4.next()
            bg1 r5 = (defpackage.bg1) r5
            fg1 r6 = r3.j(r5)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Float r5 = (java.lang.Float) r5
            if (r6 == 0) goto L_0x0085
            if (r5 != 0) goto L_0x00a0
            goto L_0x0085
        L_0x00a0:
            float r5 = r5.floatValue()
            ao9 r7 = defpackage.ao9.a
            ao9 r8 = defpackage.ao9.c
            rx0 r9 = r0.a
            if (r9 == 0) goto L_0x0127
            ao9 r12 = r6.i
            double r13 = r9.b
            double r10 = r9.a
            r15 = r1
            r9 = r2
            double r1 = r13 + r10
            float r1 = (float) r1
            double r10 = r10 - r13
            float r2 = (float) r10
            if (r12 != r7) goto L_0x00c3
            int r10 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c3
            r6.i = r8
        L_0x00c1:
            r10 = 1
            goto L_0x00cd
        L_0x00c3:
            if (r12 != r8) goto L_0x00cc
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 < 0) goto L_0x00cc
            r6.i = r7
            goto L_0x00c1
        L_0x00cc:
            r10 = 0
        L_0x00cd:
            sf0 r11 = r0.d
            boolean r13 = r11.a
            if (r13 == 0) goto L_0x0124
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "last status: "
            r13.<init>(r14)
            java.lang.String r14 = r12.name()
            r13.append(r14)
            java.lang.String r14 = "; current check: "
            r13.append(r14)
            r13.append(r5)
            java.lang.String r14 = " "
            r13.append(r14)
            if (r12 != r7) goto L_0x00f9
            java.lang.String r1 = "< "
            r13.append(r1)
            r13.append(r2)
            goto L_0x0109
        L_0x00f9:
            if (r12 != r8) goto L_0x0104
            java.lang.String r2 = ">= "
            r13.append(r2)
            r13.append(r1)
            goto L_0x0109
        L_0x0104:
            java.lang.String r1 = "ERROR: INVALID STATE"
            r13.append(r1)
        L_0x0109:
            if (r10 == 0) goto L_0x0119
            java.lang.String r1 = "; PASSES, now "
            r13.append(r1)
            ao9 r1 = r6.i
            java.lang.String r1 = r1.name()
            r13.append(r1)
        L_0x0119:
            java.lang.String r1 = r13.toString()
            java.lang.String r2 = "CallParticipant"
            a4c r7 = r3.d
            r11.b(r7, r2, r1)
        L_0x0124:
            r6.h = r5
            goto L_0x014c
        L_0x0127:
            r15 = r1
            r9 = r2
            r1 = 1058642330(0x3f19999a, float:0.6)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0133
            r6.i = r7
            goto L_0x0141
        L_0x0133:
            r1 = 1050253722(0x3e99999a, float:0.3)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x013f
            ao9 r1 = defpackage.ao9.b
            r6.i = r1
            goto L_0x0141
        L_0x013f:
            r6.i = r8
        L_0x0141:
            float r1 = r6.h
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0149
            r10 = 1
            goto L_0x014a
        L_0x0149:
            r10 = 0
        L_0x014a:
            r6.h = r5
        L_0x014c:
            if (r10 == 0) goto L_0x0151
            r9.add(r6)
        L_0x0151:
            r2 = r9
            r1 = r15
            goto L_0x0085
        L_0x0155:
            r9 = r2
            id1 r0 = r3.b
            bo9 r0 = r0.e
            r0.onCallParticipantNetworkStatusChanged(r9)
            goto L_0x016b
        L_0x015e:
            boolean r2 = r1 instanceof defpackage.trf
            if (r2 == 0) goto L_0x016b
            trf r1 = (defpackage.trf) r1
            w51 r2 = defpackage.w51.U0
            md9 r1 = r1.a
            r0.k(r2, r1)
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbg.b(ooc):void");
    }
}
