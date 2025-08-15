package defpackage;

import java.util.Collections;

/* renamed from: v8d  reason: default package */
public final class v8d extends g9d {
    public final long A0;
    public final /* synthetic */ int z0 = 0;

    public v8d(long j, long j2) {
        super(new u8d(j, j2, 0));
        this.A0 = j2;
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [aqd] */
    /* JADX WARNING: type inference failed for: r13v5, types: [vgf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x() {
        /*
            r28 = this;
            r0 = r28
            r1 = 1
            int r2 = r0.z0
            switch(r2) {
                case 0: goto L_0x000c;
                default: goto L_0x0008;
            }
        L_0x0008:
            super.x()
            return
        L_0x000c:
            au8 r2 = r28.n()
            long r3 = r0.A0
            cu8 r2 = r2.q(r3)
            if (r2 == 0) goto L_0x01f7
            vx8 r5 = defpackage.vx8.DELETED
            vx8 r6 = r2.v0
            if (r6 != r5) goto L_0x0020
            goto L_0x01f7
        L_0x0020:
            p82 r5 = r28.b()
            long r6 = r0.c
            e52 r5 = r5.C(r6)
            if (r5 != 0) goto L_0x003e
            o45 r0 = r28.j()
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException
            java.lang.String r3 = "chat is null"
            r2.<init>(r3)
            cba r0 = (defpackage.cba) r0
            r0.c(r2, r1)
            goto L_0x01fe
        L_0x003e:
            boolean r6 = r2.n()
            if (r6 == 0) goto L_0x01cd
            boolean r6 = r2.p()
            if (r6 != 0) goto L_0x01cd
            k8g r6 = r2.z0
            if (r6 == 0) goto L_0x01cd
            java.lang.Object r6 = r6.a
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x01cd
            java.util.Iterator r6 = r6.iterator()
        L_0x0058:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01cd
            java.lang.Object r8 = r6.next()
            l20 r8 = (defpackage.l20) r8
            x10 r9 = r8.b
            if (r9 == 0) goto L_0x0077
            java.lang.String r9 = r9.Z
            if (r9 == 0) goto L_0x0077
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            r27 = r6
            goto L_0x01c8
        L_0x0077:
            e8d r9 = r0.a
            if (r9 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r9 = 0
        L_0x007d:
            je7 r9 = r9.r
            java.lang.Object r9 = r9.getValue()
            cyd r9 = (defpackage.cyd) r9
            r9.getClass()
            g20 r10 = r8.a
            r11 = -1
            if (r10 != 0) goto L_0x008f
            r12 = r11
            goto L_0x0097
        L_0x008f:
            int[] r12 = defpackage.byd.$EnumSwitchMapping$1
            int r13 = r10.ordinal()
            r12 = r12[r13]
        L_0x0097:
            r13 = 2
            r14 = 3
            r15 = 11
            k20 r7 = r8.d
            if (r12 == r1) goto L_0x00c8
            if (r12 == r13) goto L_0x00ad
            if (r12 == r14) goto L_0x00ab
            r11 = 4
            if (r12 == r11) goto L_0x00a9
            r13 = 0
            goto L_0x0126
        L_0x00a9:
            r11 = 7
            goto L_0x00c9
        L_0x00ab:
            r11 = r13
            goto L_0x00c9
        L_0x00ad:
            int r12 = r7.b
            if (r12 != 0) goto L_0x00b2
            goto L_0x00ba
        L_0x00b2:
            int[] r11 = defpackage.byd.$EnumSwitchMapping$0
            int r12 = defpackage.au1.s(r12)
            r11 = r11[r12]
        L_0x00ba:
            if (r11 == r1) goto L_0x00c6
            if (r11 != r13) goto L_0x00c0
            r11 = r15
            goto L_0x00c9
        L_0x00c0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00c6:
            r11 = r14
            goto L_0x00c9
        L_0x00c8:
            r11 = r1
        L_0x00c9:
            java.lang.String r12 = r8.s
            if (r11 == r14) goto L_0x00cf
            if (r11 != r15) goto L_0x00f5
        L_0x00cf:
            j20 r15 = r7.l
            if (r15 == 0) goto L_0x00f5
            vgf r13 = new vgf
            i20 r14 = new i20
            r14.<init>(r1)
            mqb r1 = r15.c
            r14.a = r1
            float r1 = r15.a
            r14.b = r1
            float r1 = r15.b
            r14.c = r1
            boolean r1 = r15.d
            r14.d = r1
            ref r1 = new ref
            r1.<init>(r14)
            java.lang.String r7 = r7.d
            r13.<init>(r11, r12, r1, r7)
            goto L_0x0126
        L_0x00f5:
            if (r11 != r1) goto L_0x0121
            x10 r1 = r8.b
            java.lang.String r7 = r1.u0
            boolean r7 = defpackage.oag.t(r7)
            if (r7 != 0) goto L_0x0121
            y95 r13 = new y95
            java.lang.String r23 = r1.a()
            java.lang.String r7 = r8.s
            int r11 = r1.c
            java.lang.String r12 = r1.t0
            int r14 = r1.o
            java.lang.String r1 = r1.u0
            r17 = r13
            r18 = r12
            r19 = r11
            r20 = r14
            r21 = r7
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x0126
        L_0x0121:
            aqd r13 = new aqd
            r13.<init>(r11, r12)
        L_0x0126:
            if (r13 != 0) goto L_0x013d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "skipped for type "
            r1.<init>(r7)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = defpackage.cyd.f
            defpackage.hm9.m0(r7, r1, new java.lang.Object[0])
            goto L_0x0073
        L_0x013d:
            boolean r1 = r13 instanceof defpackage.y95
            bc7[] r7 = defpackage.cyd.e
            rm4 r11 = r9.a
            long r14 = r0.c
            r17 = r11
            long r10 = r0.A0
            java.lang.String r8 = r8.r
            if (r1 == 0) goto L_0x019a
            r1 = 0
            r1 = r7[r1]
            java.lang.Object r1 = r17.get()
            au8 r1 = (defpackage.au8) r1
            p4c r12 = new p4c
            r27 = r6
            r6 = 24
            r12.<init>(r6)
            r1.v(r10, r8, r12)
            r1 = 1
            r6 = r7[r1]
            rm4 r6 = r9.b
            java.lang.Object r6 = r6.get()
            s8g r6 = (defpackage.s8g) r6
            aa5 r12 = new aa5
            r16 = 3
            r7 = r7[r16]
            rm4 r7 = r9.d
            java.lang.Object r7 = r7.get()
            q33 r7 = (defpackage.q33) r7
            hyc r7 = (defpackage.hyc) r7
            long r18 = r7.o()
            y95 r13 = (defpackage.y95) r13
            java.lang.String r7 = r13.Y
            java.lang.String r9 = r13.b
            r17 = r12
            r20 = r10
            r22 = r9
            r23 = r14
            r25 = r8
            r26 = r7
            r17.<init>(r18, r20, r22, r23, r25, r26)
            r6.b(r12)
            goto L_0x01c8
        L_0x019a:
            r27 = r6
            r1 = 1
            r6 = 0
            r6 = r7[r6]
            java.lang.Object r6 = r17.get()
            au8 r6 = (defpackage.au8) r6
            p4c r12 = new p4c
            r1 = 25
            r12.<init>(r1)
            r6.v(r10, r8, r12)
            r1 = 2
            r1 = r7[r1]
            rm4 r1 = r9.c
            java.lang.Object r1 = r1.get()
            r17 = r1
            dg5 r17 = (defpackage.dg5) r17
            r18 = r13
            r19 = r10
            r21 = r14
            r23 = r8
            r17.c(r18, r19, r21, r23)
        L_0x01c8:
            r6 = r27
            r1 = 1
            goto L_0x0058
        L_0x01cd:
            au8 r1 = r28.n()
            iu8 r6 = defpackage.iu8.SENDING
            r1.x(r2, r6)
            r0.z(r3, r5)
            e8d r1 = r0.a
            if (r1 == 0) goto L_0x01df
            r7 = r1
            goto L_0x01e0
        L_0x01df:
            r7 = 0
        L_0x01e0:
            je7 r1 = r7.c
            java.lang.Object r1 = r1.getValue()
            av0 r1 = (defpackage.av0) r1
            l6f r8 = new l6f
            long r5 = r0.A0
            r7 = 0
            long r3 = r0.c
            r2 = r8
            r2.<init>(r3, r5, r7)
            r1.c(r8)
            goto L_0x01fe
        L_0x01f7:
            java.lang.String r0 = "v8d"
            java.lang.String r1 = "process: skip deleted message"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8d.x():void");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, m20] */
    public final bu8 y() {
        switch (this.z0) {
            case 0:
                return null;
            default:
                e8d e8d = this.a;
                if (e8d == null) {
                    e8d = null;
                }
                f20 s = iz7.s((d2e) ((o2e) e8d.j.getValue()).a.get(Long.valueOf(this.A0)));
                ? obj = new Object();
                obj.f = s;
                obj.a = g20.Y;
                l20 a = obj.a();
                ? obj2 = new Object();
                obj2.a = Collections.singletonList(a);
                k8g c = obj2.c();
                bu8 bu8 = new bu8();
                bu8.n = c;
                return bu8;
        }
    }

    public v8d(u8d u8d) {
        super(u8d);
        this.A0 = u8d.m;
    }
}
