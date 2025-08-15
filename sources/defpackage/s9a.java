package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: s9a  reason: default package */
public final class s9a extends ffe implements a66 {
    public final /* synthetic */ bz7 A0;
    public final /* synthetic */ u9a B0;
    public Object X;
    public Object Y;
    public ow8 Z;
    public iu8 s0;
    public CharSequence t0;
    public String u0;
    public String v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s9a(zy7 zy7, u9a u9a, Continuation continuation) {
        super(2, continuation);
        this.A0 = zy7;
        this.B0 = u9a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s9a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new s9a((zy7) this.A0, this.B0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x043b, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0501  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r74) {
        /*
            r73 = this;
            r0 = r73
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.z0
            r3 = 0
            r4 = 0
            r24 = 2
            r44 = 1
            java.lang.String r5 = "Required value was null."
            r6 = 2
            u9a r7 = r0.B0
            r8 = 1
            bz7 r9 = r0.A0
            if (r2 == 0) goto L_0x0062
            if (r2 == r8) goto L_0x0051
            if (r2 != r6) goto L_0x0049
            int r1 = r0.y0
            int r2 = r0.x0
            int r4 = r0.w0
            java.lang.String r10 = r0.v0
            java.lang.String r11 = r0.u0
            java.lang.CharSequence r12 = r0.t0
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            iu8 r13 = r0.s0
            ow8 r14 = r0.Z
            java.lang.Object r15 = r0.Y
            by8 r15 = (defpackage.by8) r15
            java.lang.Object r0 = r0.X
            tz r0 = (defpackage.tz) r0
            defpackage.od2.a0(r74)
            r58 = r0
            r54 = r10
            r53 = r11
            r52 = r12
            r69 = r13
            r70 = r14
            r60 = r15
            r0 = r74
            goto L_0x03a3
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0051:
            java.lang.Object r2 = r0.Y
            bz7 r2 = (defpackage.bz7) r2
            java.lang.Object r10 = r0.X
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            defpackage.od2.a0(r74)
            r12 = r10
            r10 = r2
            r2 = r74
            goto L_0x02b3
        L_0x0062:
            defpackage.od2.a0(r74)
            r2 = r9
            zy7 r2 = (defpackage.zy7) r2
            cu8 r10 = r2.a()
            boolean r10 = r10.F()
            tz r38 = defpackage.tz.f
            if (r10 == 0) goto L_0x01ef
            r7.getClass()
            cu8 r0 = r2.a()
            boolean r1 = r0.F()
            if (r1 == 0) goto L_0x008c
            g20 r1 = defpackage.g20.y0
            k8g r0 = r0.z0
            l20 r0 = r0.k(r1)
            j5g r0 = r0.n
            goto L_0x008d
        L_0x008c:
            r0 = r4
        L_0x008d:
            if (r0 == 0) goto L_0x01e5
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r0 = r0.a
            int r6 = r0.size()
            r1.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x009e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0164
            java.lang.Object r6 = r0.next()
            f5g r6 = (defpackage.f5g) r6
            e r9 = r6.d
            e5g r10 = r6.a
            if (r9 == 0) goto L_0x00d6
            int r11 = r9.a
            if (r11 <= 0) goto L_0x00be
            int r12 = r9.b
            if (r12 <= 0) goto L_0x00be
            android.util.Size r13 = new android.util.Size
            r13.<init>(r11, r12)
            goto L_0x00c0
        L_0x00be:
            android.util.Size r13 = defpackage.u5g.e
        L_0x00c0:
            u5g r11 = new u5g
            e r6 = r6.d
            if (r6 == 0) goto L_0x00cc
            e5g r6 = defpackage.e5g.a
            if (r10 != r6) goto L_0x00cc
            r6 = r8
            goto L_0x00cd
        L_0x00cc:
            r6 = r3
        L_0x00cd:
            java.lang.String r9 = r9.c
            r11.<init>(r13, r9, r6)
            r1.add(r11)
            goto L_0x009e
        L_0x00d6:
            boolean r9 = r6.c()
            if (r9 != 0) goto L_0x014b
            e5g r9 = defpackage.e5g.o
            d5g r11 = r6.b
            if (r10 != r9) goto L_0x00ed
            if (r11 == 0) goto L_0x00ed
            java.lang.String r9 = r11.a
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x00ed
            goto L_0x014b
        L_0x00ed:
            e5g r9 = defpackage.e5g.X
            if (r10 != r9) goto L_0x012d
            if (r11 == 0) goto L_0x012d
            java.lang.String r9 = r11.a
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x012d
            je7 r9 = r7.n
            java.lang.Object r9 = r9.getValue()
            pb6 r9 = (defpackage.pb6) r9
            java.lang.String r6 = r6.a()
            if (r11 == 0) goto L_0x010c
            java.util.List r10 = r11.b
            goto L_0x010d
        L_0x010c:
            r10 = r4
        L_0x010d:
            if (r10 != 0) goto L_0x0111
            nz4 r10 = defpackage.nz4.a
        L_0x0111:
            java.lang.CharSequence r6 = r9.a(r6, r10)
            int r9 = r6.length()
            if (r9 != 0) goto L_0x011d
            r9 = r8
            goto L_0x011e
        L_0x011d:
            r9 = r3
        L_0x011e:
            r9 = r9 ^ r8
            if (r9 == 0) goto L_0x009e
            v5g r9 = new v5g
            kqe r10 = defpackage.i4f.f
            r9.<init>(r6, r10, r8)
            r1.add(r9)
            goto L_0x009e
        L_0x012d:
            boolean r9 = r6.b()
            if (r9 == 0) goto L_0x009e
            t5g r9 = new t5g
            z07 r6 = r6.c
            if (r6 == 0) goto L_0x0141
            r9.<init>(r6)
            r1.add(r9)
            goto L_0x009e
        L_0x0141:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x014b:
            v5g r9 = new v5g
            java.lang.String r10 = r6.a()
            boolean r6 = r6.c()
            if (r6 == 0) goto L_0x015a
            kqe r6 = defpackage.i4f.z
            goto L_0x015c
        L_0x015a:
            kqe r6 = defpackage.i4f.A
        L_0x015c:
            r9.<init>(r10, r6, r3)
            r1.add(r9)
            goto L_0x009e
        L_0x0164:
            tc9 r0 = new tc9
            cu8 r4 = r2.a()
            long r4 = r4.b
            r0.<init>(r4, r1)
            cu8 r1 = r2.a()
            u6b r4 = r2.b
            r4.e()
            java.lang.String r4 = r4.l
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x019e
            char r3 = r4.charAt(r3)
            char r3 = java.lang.Character.toUpperCase(r3)
            java.lang.String r4 = r4.substring(r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r34 = r3
            goto L_0x01a0
        L_0x019e:
            r34 = r4
        L_0x01a0:
            cu8 r3 = r2.a()
            cu8 r4 = r2.a()
            cu8 r2 = r2.a()
            zof r35 = defpackage.zof.None
            one.me.messages.list.loader.MessageModel r5 = new one.me.messages.list.loader.MessageModel
            r25 = r5
            r50 = 0
            r51 = 131072(0x20000, float:1.83671E-40)
            long r6 = r3.b
            r26 = r6
            long r3 = r4.c
            r28 = r3
            long r2 = r2.o
            r30 = r2
            java.lang.String r32 = ""
            java.lang.String r33 = ""
            r36 = 1
            r37 = 1
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r45 = 0
            r46 = 0
            r48 = 1
            iu8 r1 = r1.u0
            r49 = r1
            r52 = 6306816(0x603c00, float:8.837732E-39)
            r43 = r0
            r25.<init>(r26, r28, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50, r51, r52)
            return r5
        L_0x01e5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x01ef:
            u6b r10 = r2.b
            e52 r11 = r2.a
            r10.f = r11
            ida r12 = r10.a
            int r13 = r12.f()
            int r12 = r12.e()
            r10.i(r11, r13, r12)
            r10.g(r11)
            java.lang.CharSequence r12 = r10.g
            cu8 r10 = r2.a()
            boolean r10 = r10.x()
            if (r10 == 0) goto L_0x029b
            r7.getClass()
            cu8 r0 = r2.a()
            u6b r1 = r2.b
            r1.e()
            java.lang.String r1 = r1.l
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x0240
            char r3 = r1.charAt(r3)
            char r3 = java.lang.Character.toUpperCase(r3)
            java.lang.String r1 = r1.substring(r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
        L_0x0240:
            r14 = r1
            cu8 r1 = r2.a()
            q10 r1 = r1.f()
            if (r1 == 0) goto L_0x025d
            pw8 r4 = new pw8
            cu8 r1 = r2.a()
            cu8 r1 = r1.L0
            if (r1 == 0) goto L_0x0258
            long r5 = r1.c
            goto L_0x025a
        L_0x0258:
            r5 = 0
        L_0x025a:
            r4.<init>(r5)
        L_0x025d:
            r22 = r4
            cu8 r1 = r2.a()
            cu8 r3 = r2.a()
            cu8 r2 = r2.a()
            zof r15 = defpackage.zof.None
            one.me.messages.list.loader.MessageModel r4 = new one.me.messages.list.loader.MessageModel
            r5 = r4
            r30 = 0
            r31 = 0
            long r6 = r1.b
            long r8 = r3.c
            long r10 = r2.o
            java.lang.String r13 = ""
            r16 = 1
            r17 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 1
            iu8 r0 = r0.u0
            r29 = r0
            r32 = 6315008(0x605c00, float:8.849211E-39)
            r18 = r38
            r5.<init>(r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32)
            return r4
        L_0x029b:
            ds3 r10 = r7.f()
            cu8 r2 = r2.a()
            r0.X = r12
            r0.Y = r9
            r0.z0 = r8
            long r13 = r2.Y
            java.lang.Comparable r2 = r10.b(r13, r0)
            if (r2 != r1) goto L_0x02b2
            return r1
        L_0x02b2:
            r10 = r9
        L_0x02b3:
            uj3 r2 = (defpackage.uj3) r2
            if (r2 != 0) goto L_0x02c8
            ds3 r2 = r7.f()
            r11 = r9
            zy7 r11 = (defpackage.zy7) r11
            cu8 r11 = r11.a()
            long r13 = r11.Y
            uj3 r2 = r2.a(r13)
        L_0x02c8:
            zy7 r10 = (defpackage.zy7) r10
            hz1 r10 = r10.f
            bc7[] r11 = defpackage.zy7.h
            r11 = r11[r6]
            r10.b = r2
            vz r2 = r7.b
            r10 = r9
            zy7 r10 = (defpackage.zy7) r10
            tz r2 = r2.a(r10)
            o00 r11 = r2.d
            if (r11 == 0) goto L_0x02ee
            cu8 r11 = r10.a()
            java.lang.String r11 = r11.s0
            if (r11 == 0) goto L_0x030c
            int r11 = r11.length()
            if (r11 != 0) goto L_0x02ee
            goto L_0x030c
        L_0x02ee:
            cu8 r4 = r10.a()
            je7 r11 = r7.g
            java.lang.Object r11 = r11.getValue()
            k29 r11 = (defpackage.k29) r11
            e52 r13 = r10.a
            je7 r14 = r7.f
            java.lang.Object r14 = r14.getValue()
            zu8 r14 = (defpackage.zu8) r14
            es8 r4 = defpackage.zu8.a(r14, r4)
            by8 r4 = defpackage.k29.c(r11, r13, r4, r3)
        L_0x030c:
            cu8 r11 = r10.a()
            vx8 r13 = defpackage.vx8.EDITED
            vx8 r11 = r11.v0
            if (r11 != r13) goto L_0x0322
            cu8 r11 = r10.a()
            int r11 = r11.P0
            r11 = r11 & r8
            if (r11 != r8) goto L_0x0320
            goto L_0x0322
        L_0x0320:
            r11 = r8
            goto L_0x0323
        L_0x0322:
            r11 = r3
        L_0x0323:
            uj3 r13 = r10.d()
            long r14 = r13.n()
            java.lang.CharSequence r3 = r13.m()
            kk0 r6 = defpackage.kk0.b
            java.lang.String r6 = r13.p(r6)
            ow8 r13 = new ow8
            r13.<init>(r14, r3, r6)
            cu8 r3 = r10.a()
            u6b r6 = r10.b
            r6.f()
            java.lang.String r6 = r6.k
            u6b r14 = r10.b
            r14.e()
            java.lang.String r14 = r14.l
            java.lang.String r14 = defpackage.are.e(r14)
            if (r14 != 0) goto L_0x0354
            java.lang.String r14 = ""
        L_0x0354:
            boolean r15 = defpackage.u9a.h(r10)
            r15 = r15 ^ r8
            e52 r8 = r10.a
            boolean r8 = r8.I()
            if (r8 != 0) goto L_0x036c
            uj3 r8 = r10.d()
            boolean r8 = r8.Y
            if (r8 != 0) goto L_0x036a
            goto L_0x036c
        L_0x036a:
            r8 = 0
            goto L_0x036d
        L_0x036c:
            r8 = 1
        L_0x036d:
            r0.X = r2
            r0.Y = r4
            r0.Z = r13
            iu8 r3 = r3.u0
            r0.s0 = r3
            r19 = r3
            r3 = r12
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.t0 = r3
            r0.u0 = r6
            r0.v0 = r14
            r0.w0 = r11
            r0.x0 = r15
            r0.y0 = r8
            r3 = 2
            r0.z0 = r3
            java.lang.Object r0 = defpackage.u9a.a(r7, r10, r2, r0)
            if (r0 != r1) goto L_0x0392
            return r1
        L_0x0392:
            r58 = r2
            r60 = r4
            r53 = r6
            r1 = r8
            r4 = r11
            r52 = r12
            r70 = r13
            r54 = r14
            r2 = r15
            r69 = r19
        L_0x03a3:
            r61 = r0
            cw8 r61 = (defpackage.cw8) r61
            zy7 r9 = (defpackage.zy7) r9
            cu8 r0 = r9.a()
            cu8 r3 = r9.a()
            f20 r3 = r3.j()
            if (r3 == 0) goto L_0x03c1
            cu8 r3 = r9.a()
            boolean r3 = r3.r()
            if (r3 != 0) goto L_0x03ce
        L_0x03c1:
            cu8 r3 = r9.a()
            boolean r3 = r3.p()
            if (r3 != 0) goto L_0x03ce
            r57 = 1
            goto L_0x03d0
        L_0x03ce:
            r57 = 0
        L_0x03d0:
            cu8 r3 = r9.a()
            cu8 r6 = r9.a()
            cu8 r8 = r9.a()
            r7.getClass()
            uj3 r7 = r9.d()
            e52 r10 = r9.a
            k92 r11 = r10.b
            java.util.Map r11 = r11.e
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x03f1
        L_0x03ef:
            r11 = 0
            goto L_0x0440
        L_0x03f1:
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x03f9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x03ef
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            java.lang.Long r13 = (java.lang.Long) r13
            java.lang.Object r12 = r12.getValue()
            java.lang.Long r12 = (java.lang.Long) r12
            long r14 = r12.longValue()
            cu8 r12 = r9.a()
            r73 = r11
            ng4 r11 = r12.T0
            if (r11 == 0) goto L_0x0422
            long r11 = r11.a
            goto L_0x0424
        L_0x0422:
            long r11 = r12.o
        L_0x0424:
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x043d
            uj3 r11 = r9.d()
            long r11 = r11.n()
            if (r13 != 0) goto L_0x0433
            goto L_0x043b
        L_0x0433:
            long r13 = r13.longValue()
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x043d
        L_0x043b:
            r11 = 1
            goto L_0x0440
        L_0x043d:
            r11 = r73
            goto L_0x03f9
        L_0x0440:
            cu8 r12 = r9.a()
            iu8 r13 = defpackage.iu8.SENT
            iu8 r12 = r12.u0
            if (r12 == r13) goto L_0x0457
            cu8 r12 = r9.a()
            iu8 r13 = defpackage.iu8.READ
            iu8 r12 = r12.u0
            if (r12 != r13) goto L_0x0455
            goto L_0x0457
        L_0x0455:
            r12 = 0
            goto L_0x0458
        L_0x0457:
            r12 = 1
        L_0x0458:
            cu8 r13 = r9.a()
            iu8 r14 = defpackage.iu8.SENDING
            iu8 r13 = r13.u0
            if (r13 != r14) goto L_0x0467
            zof r7 = defpackage.zof.Timer
        L_0x0464:
            r55 = r7
            goto L_0x049f
        L_0x0467:
            boolean r7 = r7.Y
            if (r7 != 0) goto L_0x046e
            zof r7 = defpackage.zof.None
            goto L_0x0464
        L_0x046e:
            if (r11 == 0) goto L_0x047b
            if (r12 == 0) goto L_0x047b
            boolean r7 = r10.I()
            if (r7 != 0) goto L_0x047b
            zof r7 = defpackage.zof.Seen
            goto L_0x0464
        L_0x047b:
            if (r11 != 0) goto L_0x0488
            if (r12 == 0) goto L_0x0488
            boolean r7 = r10.I()
            if (r7 != 0) goto L_0x0488
            zof r7 = defpackage.zof.Send
            goto L_0x0464
        L_0x0488:
            cu8 r7 = r9.a()
            iu8 r10 = defpackage.iu8.ERROR
            iu8 r11 = r7.u0
            if (r11 == r10) goto L_0x049c
            vx8 r10 = defpackage.vx8.DELAYED_FIRE_ERROR
            vx8 r7 = r7.v0
            if (r7 != r10) goto L_0x0499
            goto L_0x049c
        L_0x0499:
            zof r7 = defpackage.zof.None
            goto L_0x0464
        L_0x049c:
            zof r7 = defpackage.zof.Error
            goto L_0x0464
        L_0x049f:
            e52 r7 = r9.a
            k92 r7 = r7.b
            j92 r7 = r7.b
            if (r7 == 0) goto L_0x0501
            int r5 = r7.ordinal()
            if (r5 == 0) goto L_0x04c0
            r7 = 1
            if (r5 == r7) goto L_0x04bd
            r10 = 2
            if (r5 == r10) goto L_0x04bd
            r10 = 3
            if (r5 != r10) goto L_0x04b7
            goto L_0x04bd
        L_0x04b7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04bd:
            r64 = r24
            goto L_0x04c3
        L_0x04c0:
            r7 = 1
            r64 = r44
        L_0x04c3:
            cu8 r5 = r9.a()
            one.me.messages.list.loader.MessageModel r9 = new one.me.messages.list.loader.MessageModel
            if (r2 == 0) goto L_0x04ce
            r56 = r7
            goto L_0x04d0
        L_0x04ce:
            r56 = 0
        L_0x04d0:
            if (r4 == 0) goto L_0x04d5
            r59 = r7
            goto L_0x04d7
        L_0x04d5:
            r59 = 0
        L_0x04d7:
            if (r1 == 0) goto L_0x04dc
            r68 = r7
            goto L_0x04de
        L_0x04dc:
            r68 = 0
        L_0x04de:
            r63 = 0
            r71 = 0
            long r0 = r0.b
            r46 = r0
            long r0 = r3.c
            r48 = r0
            long r0 = r8.o
            r50 = r0
            r62 = 0
            ix8 r0 = r5.S0
            r65 = r0
            long r0 = r6.Y
            r66 = r0
            r72 = 11558912(0xb06000, float:1.6197486E-38)
            r45 = r9
            r45.<init>(r46, r48, r50, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r68, r69, r70, r71, r72)
            return r9
        L_0x0501:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9a.o(java.lang.Object):java.lang.Object");
    }
}
