package defpackage;

/* renamed from: r5d  reason: default package */
public final class r5d {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public r5d(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r17, long r19, long r21, long r23, defpackage.v5c r25, defpackage.gx8 r26, kotlin.coroutines.Continuation r27) {
        /*
            r16 = this;
            r1 = r16
            r0 = r25
            r2 = r26
            r3 = r27
            boolean r4 = r3 instanceof defpackage.q5d
            if (r4 == 0) goto L_0x001b
            r4 = r3
            q5d r4 = (defpackage.q5d) r4
            int r5 = r4.x0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.x0 = r5
            goto L_0x0020
        L_0x001b:
            q5d r4 = new q5d
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r3 = r4.v0
            tx3 r5 = defpackage.tx3.a
            int r6 = r4.x0
            e5f r7 = defpackage.e5f.a
            java.lang.String r8 = "r5d"
            r9 = 1
            if (r6 == 0) goto L_0x004d
            if (r6 != r9) goto L_0x0045
            long r0 = r4.u0
            long r5 = r4.t0
            long r9 = r4.s0
            long r11 = r4.Z
            gx8 r2 = r4.Y
            v5c r13 = r4.X
            r5d r4 = r4.o
            defpackage.od2.a0(r3)     // Catch:{ all -> 0x0042 }
            goto L_0x00b3
        L_0x0042:
            r0 = move-exception
            goto L_0x00da
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            defpackage.od2.a0(r3)
            je7 r3 = r1.b
            java.lang.Object r3 = r3.getValue()
            y7d r3 = (defpackage.y7d) r3
            r3.getClass()
            java.lang.String r3 = "reactions, sendReaction"
            defpackage.hm9.m(r8, r3, new java.lang.Object[0])
            je7 r3 = r1.c     // Catch:{ all -> 0x00d8 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00d8 }
            r10 = r3
            lx8 r10 = (defpackage.lx8) r10     // Catch:{ all -> 0x00d8 }
            c6c r15 = new c6c     // Catch:{ all -> 0x00d8 }
            je7 r3 = r1.e     // Catch:{ all -> 0x00d8 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00d8 }
            jx8 r3 = (defpackage.jx8) r3     // Catch:{ all -> 0x00d8 }
            r3.getClass()     // Catch:{ all -> 0x00d8 }
            hx9 r3 = defpackage.d6c.b     // Catch:{ all -> 0x00d8 }
            int r6 = r2.a     // Catch:{ all -> 0x00d8 }
            r3.getClass()     // Catch:{ all -> 0x00d8 }
            d6c r3 = defpackage.hx9.q(r6)     // Catch:{ all -> 0x00d8 }
            r15.<init>(r3, r0)     // Catch:{ all -> 0x00d8 }
            r4.o = r1     // Catch:{ all -> 0x00d8 }
            r4.X = r0     // Catch:{ all -> 0x00d8 }
            r4.Y = r2     // Catch:{ all -> 0x00d8 }
            r13 = r17
            r4.Z = r13     // Catch:{ all -> 0x00d8 }
            r11 = r19
            r4.s0 = r11     // Catch:{ all -> 0x00d8 }
            r3 = r10
            r9 = r21
            r4.t0 = r9     // Catch:{ all -> 0x00d8 }
            r0 = r23
            r4.u0 = r0     // Catch:{ all -> 0x00d8 }
            r6 = 1
            r4.x0 = r6     // Catch:{ all -> 0x00d8 }
            r10 = r3
            r11 = r17
            r13 = r19
            r10.e(r11, r13, r15)     // Catch:{ all -> 0x00d8 }
            if (r7 != r5) goto L_0x00a9
            return r5
        L_0x00a9:
            r4 = r16
            r11 = r17
            r9 = r19
            r5 = r21
            r13 = r25
        L_0x00b3:
            je7 r3 = r4.a     // Catch:{ all -> 0x0042 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0042 }
            pk r3 = (defpackage.pk) r3     // Catch:{ all -> 0x0042 }
            java.lang.CharSequence r13 = r13.a     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0042 }
            k4a r3 = (defpackage.k4a) r3     // Catch:{ all -> 0x0042 }
            r16 = r3
            r17 = r11
            r19 = r9
            r21 = r5
            r23 = r0
            r25 = r13
            r26 = r2
            r16.E(r17, r19, r21, r23, r25, r26)     // Catch:{ all -> 0x0042 }
            goto L_0x00f2
        L_0x00d5:
            r4 = r16
            goto L_0x00da
        L_0x00d8:
            r0 = move-exception
            goto L_0x00d5
        L_0x00da:
            java.lang.String r1 = "reactions, sendReaction async query failed"
            defpackage.hm9.p(r8, r1, r0)
            je7 r1 = r4.d
            java.lang.Object r1 = r1.getValue()
            o45 r1 = (defpackage.o45) r1
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException
            r2.<init>(r0)
            r0 = 0
            cba r1 = (defpackage.cba) r1
            r1.c(r2, r0)
        L_0x00f2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5d.a(long, long, long, long, v5c, gx8, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
