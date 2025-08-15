package defpackage;

/* renamed from: js9  reason: default package */
public final class js9 {
    public final rm4 a;
    public final rm4 b;
    public final m7b c;
    public final av0 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;
    public final rm4 h;
    public final rm4 i;
    public final rm4 j;
    public final rm4 k;
    public final rm4 l;
    public final rm4 m;
    public final rm4 n;
    public final rm4 o;

    public js9(rm4 rm4, rm4 rm42, m7b m7b, av0 av0, rm4 rm43, rm4 rm44, rm4 rm45, rm4 rm46, rm4 rm47, rm4 rm48, rm4 rm49, rm4 rm410, rm4 rm411, rm4 rm412, rm4 rm413) {
        this.a = rm4;
        this.b = rm42;
        this.c = m7b;
        this.d = av0;
        this.e = rm43;
        this.f = rm44;
        this.g = rm45;
        this.h = rm46;
        this.i = rm47;
        this.j = rm48;
        this.k = rm49;
        this.l = rm410;
        this.m = rm411;
        this.n = rm412;
        this.o = rm413;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x0390 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0636  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.hs9 r59, defpackage.mg4 r60) {
        /*
            r58 = this;
            r0 = r58
            r1 = r59
            r12 = r60
            java.lang.String r2 = r60.name()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r3 = "onNotifMessage: %s, %s"
            java.lang.String r4 = "js9"
            defpackage.hm9.m(r4, r3, r2)
            rm4 r2 = r0.m     // Catch:{ TamErrorException -> 0x0020 }
            java.lang.Object r2 = r2.get()     // Catch:{ TamErrorException -> 0x0020 }
            xb9 r2 = (defpackage.xb9) r2     // Catch:{ TamErrorException -> 0x0020 }
            r2.q(r1)     // Catch:{ TamErrorException -> 0x0020 }
        L_0x0020:
            long r2 = r1.c
            rm4 r5 = r0.e
            java.lang.Object r6 = r5.get()
            p82 r6 = (defpackage.p82) r6
            e52 r2 = r6.z(r2)
            r3 = 0
            f52 r7 = r1.o
            if (r2 != 0) goto L_0x0065
            if (r7 == 0) goto L_0x0065
            r8 = 2
            int r9 = r7.X0
            if (r9 != r8) goto L_0x0065
            java.util.concurrent.ConcurrentHashMap r2 = r6.c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0044:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0064
            java.lang.Object r8 = r2.next()
            e52 r8 = (defpackage.e52) r8
            k92 r9 = r8.b
            boolean r9 = r9.e()
            if (r9 == 0) goto L_0x0044
            k92 r9 = r8.b
            long r9 = r9.l
            long r13 = r7.u0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0044
            r2 = r8
            goto L_0x0065
        L_0x0064:
            r2 = r3
        L_0x0065:
            r14 = 1
            if (r7 == 0) goto L_0x007e
            java.lang.String r8 = r7.b
            java.lang.String r9 = "ACTIVE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x007e
            if (r2 == 0) goto L_0x007e
            k92 r8 = r2.b
            i92 r8 = r8.c
            i92 r9 = defpackage.i92.Z
            if (r8 != r9) goto L_0x007e
            r8 = r14
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            if (r2 != 0) goto L_0x00a4
            if (r7 == 0) goto L_0x00a4
            java.util.List r2 = java.util.Collections.singletonList(r7)
            gi9 r2 = r6.c0(r2)
            long r9 = r2.g()
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r14)
            java.lang.String r11 = "onNotifMessage: chat null, but is in notif; stored it with id = %d"
            defpackage.hm9.k0(r4, r3, r11, r2)
            e52 r2 = r6.C(r9)
        L_0x00a4:
            rm4 r9 = r0.b
            long r10 = r1.c
            if (r2 != 0) goto L_0x00c3
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "onNotifMessage: %d chat not found, requesting chatInfo"
            defpackage.hm9.m(r4, r1, r0)
            java.lang.Object r0 = r9.get()
            pk r0 = (defpackage.pk) r0
            k4a r0 = (defpackage.k4a) r0
            r0.j(r10)
            return
        L_0x00c3:
            rm4 r15 = r0.f
            java.lang.Object r16 = r15.get()
            r14 = r16
            au8 r14 = (defpackage.au8) r14
            fs8 r3 = r1.X
            r18 = r10
            long r10 = r3.a
            r20 = r8
            r21 = r9
            long r8 = r2.a
            boolean r8 = r14.e(r8, r10)
            m7b r9 = r0.c
            r14 = r9
            p7b r14 = (defpackage.p7b) r14
            t33 r9 = r14.a
            long r9 = r9.t()
            r23 = r14
            long r13 = r3.o
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L_0x0100
            int r9 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x00fd
            boolean r9 = r2.F()
            if (r9 == 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r24 = 0
            goto L_0x0102
        L_0x0100:
            r24 = 1
        L_0x0102:
            if (r7 == 0) goto L_0x012e
            java.util.List r2 = java.util.Collections.singletonList(r7)
            gi9 r2 = r6.c0(r2)
            if (r2 == 0) goto L_0x0114
            boolean r9 = r2.i()
            if (r9 == 0) goto L_0x0116
        L_0x0114:
            r0 = 0
            goto L_0x0121
        L_0x0116:
            long r10 = r2.g()
            e52 r2 = r6.C(r10)
            if (r2 != 0) goto L_0x012e
            return
        L_0x0121:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r1 = "fail to store chat"
            r2 = 0
            defpackage.hm9.k0(r4, r2, r1, r0)
            return
        L_0x012e:
            wx8 r9 = defpackage.wx8.c
            wx8 r10 = r3.X
            r27 = r13
            long r13 = r3.a
            rm4 r11 = r0.j
            r29 = r7
            rm4 r7 = r0.g
            r30 = r8
            av0 r8 = r0.d
            r31 = r3
            k92 r3 = r2.b
            if (r10 != r9) goto L_0x02e4
            long r1 = r3.a
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            java.lang.Object r6 = r5.get()
            p82 r6 = (defpackage.p82) r6
            e52 r1 = r6.z(r1)
            if (r1 != 0) goto L_0x0173
            rm4 r0 = r0.o
            java.lang.Object r0 = r0.get()
            o45 r0 = (defpackage.o45) r0
            ru.ok.tamtam.util.HandledException r1 = new ru.ok.tamtam.util.HandledException
            java.lang.String r2 = "chat is null"
            r1.<init>(r2)
            cba r0 = (defpackage.cba) r0
            r2 = 1
            r0.c(r1, r2)
            goto L_0x02e3
        L_0x0173:
            long r9 = r1.a
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.String r2 = r1.q()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "onDelete: chat.id = %d, title = %s"
            defpackage.hm9.m(r4, r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x018f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01af
            java.lang.Object r3 = r2.next()
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r6 = r15.get()
            au8 r6 = (defpackage.au8) r6
            long r13 = r3.longValue()
            cu8 r3 = r6.j(r9, r13)
            if (r3 == 0) goto L_0x018f
            r0.add(r3)
            goto L_0x018f
        L_0x01af:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x01bc:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01d9
            java.lang.Object r6 = r3.next()
            cu8 r6 = (defpackage.cu8) r6     // Catch:{ all -> 0x01d2 }
            long r13 = r6.b     // Catch:{ all -> 0x01d2 }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x01d2 }
            r2.add(r6)     // Catch:{ all -> 0x01d2 }
            goto L_0x01bc
        L_0x01d2:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x01d9:
            java.lang.Object r3 = r15.get()
            au8 r3 = (defpackage.au8) r3
            vx8 r6 = defpackage.vx8.DELETED
            c34 r3 = r3.a
            k24 r3 = (defpackage.k24) r3
            vlc r3 = r3.c
            t19 r3 = r3.d()
            r3.o(r9, r2, r6)
            boolean r3 = r60.a()
            if (r3 == 0) goto L_0x01f8
            r59 = r2
            goto L_0x02d7
        L_0x01f8:
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            int r6 = r0.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r6}
            java.lang.String r6 = "onDelete: chatId = %d, messageDbs.size() = %d"
            defpackage.hm9.m(r4, r6, r3)
            k92 r3 = r1.b
            int r6 = r3.m
            long r13 = r3.a
            if (r6 <= 0) goto L_0x0288
            long r26 = r1.n()
            java.util.Iterator r1 = r0.iterator()
            r15 = r6
        L_0x021e:
            boolean r16 = r1.hasNext()
            if (r16 == 0) goto L_0x023d
            java.lang.Object r16 = r1.next()
            r58 = r1
            r1 = r16
            cu8 r1 = (defpackage.cu8) r1
            r59 = r2
            long r1 = r1.o
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 <= 0) goto L_0x0238
            int r15 = r15 + -1
        L_0x0238:
            r1 = r58
            r2 = r59
            goto L_0x021e
        L_0x023d:
            r59 = r2
            if (r6 == r15) goto L_0x027c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "onDelete: check new messages count, newCount = %d, afterDeleteCount = %d"
            defpackage.hm9.m(r4, r2, r1)
            java.lang.Object r1 = r5.get()
            p82 r1 = (defpackage.p82) r1
            r2 = 0
            int r2 = java.lang.Math.max(r2, r15)
            r1.n0(r2, r9)
            java.lang.Object r1 = r11.get()
            r23 = r1
            p7c r23 = (defpackage.p7c) r23
            r23.getClass()
            r30 = 0
            r33 = 120(0x78, float:1.68E-43)
            long r1 = r3.a
            r28 = -1
            r31 = 0
            r32 = 0
            r24 = r1
            defpackage.p7c.e(r23, r24, r26, r28, r30, r31, r32, r33)
        L_0x027c:
            if (r15 != 0) goto L_0x028a
            java.lang.Object r1 = r7.get()
            cea r1 = (defpackage.cea) r1
            r1.a(r13)
            goto L_0x028a
        L_0x0288:
            r59 = r2
        L_0x028a:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0291
            goto L_0x02bd
        L_0x0291:
            java.util.Iterator r0 = r0.iterator()
        L_0x0295:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02bd
            java.lang.Object r1 = r0.next()
            cu8 r1 = (defpackage.cu8) r1     // Catch:{ all -> 0x02b6 }
            long r1 = r1.b     // Catch:{ all -> 0x02b6 }
            long r11 = r3.j
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x02b3
            java.lang.Object r0 = r5.get()
            p82 r0 = (defpackage.p82) r0
            r0.w(r9)
            goto L_0x02bd
        L_0x02b3:
            r12 = r60
            goto L_0x0295
        L_0x02b6:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x02bd:
            vz2 r0 = new vz2
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 1
            r0.<init>(r1, r2)
            r8.c(r0)
            java.lang.Object r0 = r7.get()
            cea r0 = (defpackage.cea) r0
            r0.f(r13)
        L_0x02d7:
            re9 r0 = new re9
            r1 = r59
            r12 = r60
            r0.<init>(r9, r1, r12)
            r8.c(r0)
        L_0x02e3:
            return
        L_0x02e4:
            java.lang.Object r5 = r15.get()
            au8 r5 = (defpackage.au8) r5
            r32 = r10
            r9 = r11
            long r10 = r2.a
            cu8 r5 = r5.j(r10, r13)
            if (r5 != 0) goto L_0x0327
            java.lang.String r5 = "onNotifMessage: insert new message"
            defpackage.hm9.m(r4, r5, new java.lang.Object[0])
            java.lang.Object r5 = r15.get()
            r33 = r5
            au8 r33 = (defpackage.au8) r33
            r5 = r23
            r23 = r7
            t33 r7 = r5.a
            long r36 = r7.t()
            r39 = r13
            long r12 = r2.a
            fs8 r7 = r1.X
            r34 = r12
            r38 = r7
            long r12 = r33.f(r34, r36, r38)
            java.lang.Object r7 = r15.get()
            au8 r7 = (defpackage.au8) r7
            cu8 r7 = r7.q(r12)
            r14 = r5
            r5 = r7
            goto L_0x032d
        L_0x0327:
            r39 = r13
            r14 = r23
            r23 = r7
        L_0x032d:
            boolean r7 = r2.M()
            if (r7 == 0) goto L_0x0339
            boolean r7 = r2.C()
            if (r7 == 0) goto L_0x033b
        L_0x0339:
            if (r20 == 0) goto L_0x034d
        L_0x033b:
            i92 r7 = defpackage.i92.a
            r6.i(r10, r7)
            java.lang.Object r7 = r21.get()
            pk r7 = (defpackage.pk) r7
            k4a r7 = (defpackage.k4a) r7
            r12 = r18
            r7.j(r12)
        L_0x034d:
            if (r24 == 0) goto L_0x0389
            r7 = r31
            long r12 = r7.Y
            r18 = 0
            int r20 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r20 == 0) goto L_0x0386
            java.lang.Object r5 = r15.get()
            au8 r5 = (defpackage.au8) r5
            c34 r5 = r5.a
            k24 r5 = (defpackage.k24) r5
            vlc r5 = r5.c
            r18 = r9
            t19 r9 = r5.d()
            ru8 r9 = r9.h(r10, r12)
            if (r9 == 0) goto L_0x0376
            cu8 r5 = r5.b(r9)
            goto L_0x0377
        L_0x0376:
            r5 = 0
        L_0x0377:
            if (r5 == 0) goto L_0x0382
            long r12 = r5.c
            r19 = 0
            int r9 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x0384
            return
        L_0x0382:
            r19 = 0
        L_0x0384:
            r12 = r5
            goto L_0x038e
        L_0x0386:
            r18 = r9
            goto L_0x0382
        L_0x0389:
            r18 = r9
            r7 = r31
            goto L_0x0382
        L_0x038e:
            if (r12 != 0) goto L_0x0391
            return
        L_0x0391:
            rm4 r5 = r0.h
            es8 r9 = r2.c
            if (r30 == 0) goto L_0x0569
            java.lang.String r13 = "onNotifMessage: messageExistedBefore == true"
            defpackage.hm9.m(r4, r13, new java.lang.Object[0])
            wz r13 = r7.s0
            if (r13 == 0) goto L_0x03e2
            int r18 = r13.size()
            if (r18 <= 0) goto L_0x03e2
            r21 = r3
            r3 = 0
            java.lang.Object r18 = r13.get(r3)
            r3 = r18
            bz r3 = (defpackage.bz) r3
            r18 = r13
            b10 r13 = r3.a
            r25 = r14
            b10 r14 = defpackage.b10.CONTROL
            if (r13 != r14) goto L_0x03de
            ju3 r3 = (defpackage.ju3) r3
            fs8 r3 = r3.A0
            if (r3 == 0) goto L_0x03de
            java.lang.Object r13 = r15.get()
            au8 r13 = (defpackage.au8) r13
            r14 = r8
            r26 = r9
            long r8 = r3.a
            cu8 r3 = r13.j(r10, r8)
            r27 = r8
            if (r3 == 0) goto L_0x03db
            long r8 = r3.b
            r43 = r8
        L_0x03d8:
            r45 = r27
            goto L_0x03ef
        L_0x03db:
            r43 = r19
            goto L_0x03d8
        L_0x03de:
            r14 = r8
            r26 = r9
            goto L_0x03eb
        L_0x03e2:
            r21 = r3
            r26 = r9
            r18 = r13
            r25 = r14
            r14 = r8
        L_0x03eb:
            r43 = r19
            r45 = r43
        L_0x03ef:
            rm4 r3 = r0.a
            java.lang.Object r3 = r3.get()
            c34 r3 = (defpackage.c34) r3
            k24 r3 = (defpackage.k24) r3
            vlc r3 = r3.c
            long r8 = r2.a
            r50 = 0
            fs8 r13 = r1.X
            r53 = 0
            r47 = r3
            r48 = r8
            r52 = r13
            r47.p(r48, r50, r52, r53)
            java.lang.Object r3 = r15.get()
            au8 r3 = (defpackage.au8) r3
            rm4 r0 = r0.i
            java.lang.Object r0 = r0.get()
            r42 = r0
            vxc r42 = (defpackage.vxc) r42
            r47 = 0
            wz r0 = r7.s0
            r41 = r0
            k8g r0 = defpackage.iz7.h(r41, r42, r43, r45, r47)
            r3.w(r12, r0)
            java.lang.Object r0 = r15.get()
            au8 r0 = (defpackage.au8) r0
            long r7 = r12.b
            cu8 r0 = r0.q(r7)
            if (r0 != 0) goto L_0x0445
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r1 = "message after update is null"
            r2 = 0
            defpackage.hm9.k0(r4, r2, r1, r0)
            return
        L_0x0445:
            java.lang.Object r3 = r5.get()
            t6b r3 = (defpackage.t6b) r3
            long r4 = r0.t0
            e52 r4 = r6.C(r4)
            r3.b(r4, r0)
            int r3 = r60.ordinal()
            long r4 = r0.b
            if (r3 == 0) goto L_0x0474
            r7 = 1
            if (r3 == r7) goto L_0x0461
            goto L_0x0568
        L_0x0461:
            l6f r0 = new l6f
            r37 = 0
            r32 = r0
            r33 = r10
            r35 = r4
            r32.<init>(r33, r35, r37)
            r3 = r14
            r3.c(r0)
            goto L_0x0568
        L_0x0474:
            r3 = r14
            if (r26 == 0) goto L_0x0495
            r7 = r26
            cu8 r7 = r7.a
            long r7 = r7.b
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0495
            r7 = 0
            r6.k0(r10, r0, r7)
            vz2 r8 = new vz2
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r8.<init>(r9, r7)
            r3.c(r8)
        L_0x0495:
            if (r24 != 0) goto L_0x04d0
            r14 = r25
            t33 r7 = r14.a
            long r7 = r7.t()
            boolean r7 = r0.q(r7)
            if (r7 == 0) goto L_0x04cc
            x72 r13 = new x72
            r12 = 1
            r7 = r13
            r8 = r6
            r9 = r0
            r19 = r10
            r15 = r32
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (long) r10, (int) r12)
            r11 = r19
            r8 = 1
            r6.h(r11, r8, r13)
            vz2 r7 = new vz2
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r9 = 0
            r7.<init>(r8, r9)
            av0 r8 = r6.m
            r8.c(r7)
            goto L_0x04d4
        L_0x04cc:
            r11 = r10
        L_0x04cd:
            r15 = r32
            goto L_0x04d4
        L_0x04d0:
            r11 = r10
            r14 = r25
            goto L_0x04cd
        L_0x04d4:
            if (r24 == 0) goto L_0x04e7
            long r16 = r0.h()
            long r8 = r2.a
            k92 r10 = r2.b
            r7 = r6
            r19 = r11
            r11 = r16
            r7.j0(r8, r10, r11)
            goto L_0x04e9
        L_0x04e7:
            r19 = r11
        L_0x04e9:
            l6f r7 = new l6f
            r37 = 0
            r32 = r7
            r33 = r19
            r35 = r4
            r32.<init>(r33, r35, r37)
            r3.c(r7)
            wx8 r4 = defpackage.wx8.b
            if (r15 == r4) goto L_0x0516
            boolean r4 = r18.isEmpty()
            if (r4 == 0) goto L_0x0504
            goto L_0x0536
        L_0x0504:
            r4 = r18
            r9 = 0
            java.lang.Object r4 = r4.get(r9)
            bz r4 = (defpackage.bz) r4
            if (r4 != 0) goto L_0x0510
            goto L_0x0536
        L_0x0510:
            b10 r5 = defpackage.b10.CONTROL
            b10 r4 = r4.a
            if (r4 != r5) goto L_0x0536
        L_0x0516:
            kz6 r4 = new kz6
            mg4 r31 = defpackage.mg4.REGULAR
            boolean r32 = r0.x()
            long r7 = r0.b
            boolean r1 = r1.Y
            long r9 = r2.a
            long r11 = r0.Y
            r25 = r4
            r26 = r9
            r28 = r7
            r30 = r1
            r33 = r11
            r25.<init>(r26, r28, r30, r31, r32, r33)
            r3.c(r4)
        L_0x0536:
            if (r24 != 0) goto L_0x0559
            boolean r1 = r2.F()
            if (r1 != 0) goto L_0x0559
            t33 r1 = r14.a
            boolean r1 = r2.V(r1)
            if (r1 == 0) goto L_0x054c
            boolean r1 = r2.A()
            if (r1 == 0) goto L_0x0559
        L_0x054c:
            java.lang.Object r1 = r23.get()
            cea r1 = (defpackage.cea) r1
            r10 = r21
            long r3 = r10.a
            r1.f(r3)
        L_0x0559:
            es8 r1 = r2.X
            if (r1 == 0) goto L_0x0568
            long r0 = r0.c
            int r0 = (r39 > r0 ? 1 : (r39 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0568
            r0 = r19
            r6.o0(r0)
        L_0x0568:
            return
        L_0x0569:
            r10 = r3
            r3 = r8
            r7 = r9
            r8 = 1
            r9 = 0
            java.lang.String r11 = "onNotifMessage: messageExistedBefore == false"
            defpackage.hm9.m(r4, r11, new java.lang.Object[0])
            java.lang.Object r5 = r5.get()
            t6b r5 = (defpackage.t6b) r5
            long r8 = r12.t0
            e52 r8 = r6.C(r8)
            r5.b(r8, r12)
            e92 r5 = r10.n
            r11 = r60
            java.util.ArrayList r5 = r5.d(r11)
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r8 = "onNotifMessage: chunks count = %d"
            defpackage.hm9.m(r4, r8, r5)
            t33 r5 = r14.a
            r25 = r14
            long r13 = r5.t()
            boolean r5 = r12.G(r13)
            if (r29 != 0) goto L_0x05ae
            if (r5 != 0) goto L_0x05ae
            r22 = 1
            goto L_0x05b0
        L_0x05ae:
            r22 = 0
        L_0x05b0:
            if (r7 == 0) goto L_0x05ec
            long r13 = r2.n()
            cu8 r9 = r7.a
            r26 = r3
            r21 = r4
            long r3 = r9.o
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x05e9
            if (r5 == 0) goto L_0x05e9
            java.lang.Object r3 = r18.get()
            r29 = r3
            p7c r29 = (defpackage.p7c) r29
            r29.getClass()
            r36 = 0
            r39 = 120(0x78, float:1.68E-43)
            long r3 = r10.a
            long r13 = r12.o
            r40 = r8
            long r8 = r12.c
            r37 = 0
            r38 = 0
            r30 = r3
            r32 = r13
            r34 = r8
            defpackage.p7c.e(r29, r30, r32, r34, r36, r37, r38, r39)
            goto L_0x05f1
        L_0x05e9:
            r40 = r8
            goto L_0x05f1
        L_0x05ec:
            r26 = r3
            r21 = r4
            goto L_0x05e9
        L_0x05f1:
            boolean r3 = r60.b()
            if (r3 == 0) goto L_0x0629
            if (r7 == 0) goto L_0x0629
            long r3 = r2.n()
            cu8 r7 = r7.a
            long r7 = r7.o
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0629
            if (r5 == 0) goto L_0x0629
            java.lang.Object r3 = r18.get()
            r29 = r3
            p7c r29 = (defpackage.p7c) r29
            r29.getClass()
            r36 = 0
            r39 = 120(0x78, float:1.68E-43)
            long r3 = r10.a
            long r7 = r12.o
            long r9 = r12.c
            r37 = 0
            r38 = 0
            r30 = r3
            r32 = r7
            r34 = r9
            defpackage.p7c.e(r29, r30, r32, r34, r36, r37, r38, r39)
        L_0x0629:
            int r3 = r60.ordinal()
            if (r3 == 0) goto L_0x0636
            r13 = r2
            r8 = r25
            r9 = r27
            r4 = 1
            goto L_0x064d
        L_0x0636:
            long r14 = r2.a
            long r2 = r1.Z
            r9 = r27
            r13 = r6
            r8 = r25
            r4 = 1
            r16 = r24
            r17 = r12
            r18 = r22
            r19 = r2
            e52 r2 = r13.T(r14, r16, r17, r18, r19)
            r13 = r2
        L_0x064d:
            if (r13 == 0) goto L_0x0740
            k92 r14 = r13.b
            e92 r2 = r14.n
            java.util.ArrayList r2 = r2.d(r11)
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r5 = r21
            r3 = r40
            defpackage.hm9.m(r5, r3, r2)
            vz2 r2 = new vz2
            long r4 = r13.a
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r7 = 1
            r2.<init>(r3, r7)
            r3 = r26
            r3.c(r2)
            kz6 r15 = new kz6
            boolean r16 = r12.x()
            r17 = r4
            r7 = r6
            long r5 = r12.b
            boolean r4 = r1.Y
            r26 = r3
            r19 = r4
            long r3 = r13.a
            r27 = r9
            long r10 = r12.Y
            r2 = r15
            r9 = r26
            r56 = r17
            r17 = r13
            r18 = r14
            r13 = r56
            r1 = r7
            r7 = r19
            r19 = r1
            r1 = r8
            r8 = r60
            r25 = r1
            r1 = r9
            r54 = r27
            r9 = r16
            r2.<init>(r3, r5, r7, r8, r9, r10)
            r1.c(r15)
            boolean r1 = r60.b()
            if (r1 == 0) goto L_0x06e6
            rm4 r1 = r0.k
            java.lang.Object r1 = r1.get()
            mz6 r1 = (defpackage.mz6) r1
            boolean r2 = r12.x()
            r1.getClass()
            if (r2 == 0) goto L_0x06ce
            goto L_0x06e6
        L_0x06ce:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onIncomingMessage: chatId = "
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "mz6"
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])
            r2 = r54
            r1.c(r13, r2)
        L_0x06e6:
            boolean r1 = r60.b()
            if (r1 == 0) goto L_0x072f
            r9 = r25
            t33 r1 = r9.a
            r2 = r17
            boolean r1 = r2.V(r1)
            if (r1 != 0) goto L_0x072f
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r6 = r19
            java.util.Set r3 = r6.k
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L_0x072f
            if (r24 != 0) goto L_0x072f
            r1 = r59
            boolean r1 = r1.Y
            if (r1 == 0) goto L_0x0722
            boolean r1 = r2.I()
            if (r1 != 0) goto L_0x072f
            rm4 r1 = r0.l
            java.lang.Object r1 = r1.get()
            ri4 r1 = (defpackage.ri4) r1
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x072f
        L_0x0722:
            java.lang.Object r1 = r23.get()
            cea r1 = (defpackage.cea) r1
            r2 = r18
            long r2 = r2.a
            r1.f(r2)
        L_0x072f:
            boolean r1 = r12.n()
            if (r1 == 0) goto L_0x0740
            rm4 r0 = r0.n
            java.lang.Object r0 = r0.get()
            cz r0 = (defpackage.cz) r0
            r0.a(r12)
        L_0x0740:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js9.a(hs9, mg4):void");
    }
}
