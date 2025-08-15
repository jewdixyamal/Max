package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xhd  reason: default package */
public final class xhd extends ffe implements a66 {
    public cid X;
    public kl7 Y;
    public kl7 Z;
    public int s0;
    public final /* synthetic */ cid t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xhd(cid cid, Continuation continuation) {
        super(2, continuation);
        this.t0 = cid;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xhd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xhd(this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x04c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r48) {
        /*
            r47 = this;
            r0 = r47
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            cfd r15 = defpackage.cfd.a
            r14 = 1
            r13 = 0
            r28 = 3
            r29 = 2
            r30 = 1
            cid r12 = r0.t0
            r31 = 4
            if (r2 == 0) goto L_0x0034
            if (r2 != r14) goto L_0x002c
            kl7 r1 = r0.Z
            kl7 r2 = r0.Y
            cid r0 = r0.X
            defpackage.od2.a0(r48)
            r17 = r0
            r16 = r15
            r0 = r48
            r15 = r14
            r14 = r13
            r13 = r12
            goto L_0x02e0
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            defpackage.od2.a0(r48)
            kl7 r2 = defpackage.j1e.l()
            bc7[] r3 = defpackage.cid.O0
            y7d r3 = r12.v()
            qyc r3 = (defpackage.qyc) r3
            boolean r3 = r3.v()
            if (r3 == 0) goto L_0x00bf
            long r20 = defpackage.jha.h
            int r3 = defpackage.gpc.X
            int r4 = defpackage.kha.F
            eqe r5 = new eqe
            r5.<init>(r4)
            int r4 = defpackage.kha.E
            eqe r6 = new eqe
            r6.<init>(r4)
            ffd r4 = new ffd
            kxc r7 = r12.s()
            boolean r7 = r7.r()
            kxc r8 = r12.s()
            boolean r8 = r8.r()
            if (r8 == 0) goto L_0x0086
            kxc r8 = r12.s()
            boolean r8 = r8.r()
            if (r8 == 0) goto L_0x0084
            q33 r8 = r12.t()
            boolean r8 = r8.b()
            if (r8 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r8 = r13
            goto L_0x0087
        L_0x0086:
            r8 = r14
        L_0x0087:
            r4.<init>(r7, r8)
            kxc r7 = r12.s()
            boolean r7 = r7.r()
            if (r7 == 0) goto L_0x00a1
            q33 r7 = r12.t()
            boolean r7 = r7.b()
            if (r7 != 0) goto L_0x00a1
            r26 = r14
            goto L_0x00a3
        L_0x00a1:
            r26 = r13
        L_0x00a3:
            v0d r7 = new v0d
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r19 = 0
            r22 = 0
            r27 = 16
            r16 = r7
            r17 = r30
            r18 = r5
            r23 = r6
            r24 = r4
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r7)
        L_0x00bf:
            y7d r3 = r12.v()
            qyc r3 = (defpackage.qyc) r3
            boolean r3 = r3.v()
            r11 = 0
            if (r3 == 0) goto L_0x00dd
            kxc r3 = r12.s()
            boolean r3 = r3.r()
            if (r3 == 0) goto L_0x00dd
            int r3 = defpackage.gpc.Y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00de
        L_0x00dd:
            r3 = r11
        L_0x00de:
            long r20 = defpackage.jha.i
            int r4 = defpackage.kha.G
            eqe r5 = new eqe
            r5.<init>(r4)
            dfd r4 = new dfd
            kxc r6 = r12.s()
            jp r6 = (defpackage.jp) r6
            ne7 r6 = r6.g
            java.lang.String r7 = "app.privacy.search_by_phone"
            java.lang.String r8 = "ALL"
            java.lang.String r6 = r6.getString(r7, r8)
            eqe r6 = defpackage.cid.u(r6)
            r4.<init>(r6, r3)
            y7d r6 = r12.v()
            qyc r6 = (defpackage.qyc) r6
            boolean r6 = r6.v()
            if (r6 == 0) goto L_0x010f
            r17 = r29
            goto L_0x0111
        L_0x010f:
            r17 = r30
        L_0x0111:
            v0d r6 = new v0d
            r25 = 0
            r26 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r27 = 432(0x1b0, float:6.05E-43)
            r16 = r6
            r18 = r5
            r24 = r4
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r6)
            long r20 = defpackage.jha.e
            int r4 = defpackage.kha.l
            eqe r5 = new eqe
            r5.<init>(r4)
            dfd r4 = new dfd
            kxc r6 = r12.s()
            jp r6 = (defpackage.jp) r6
            ne7 r6 = r6.g
            java.lang.String r7 = "app.privacy.incoming.call"
            java.lang.String r6 = r6.getString(r7, r8)
            eqe r6 = defpackage.cid.u(r6)
            r4.<init>(r6, r3)
            v0d r6 = new v0d
            r25 = 0
            r26 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r27 = 432(0x1b0, float:6.05E-43)
            r16 = r6
            r17 = r29
            r18 = r5
            r24 = r4
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r6)
            long r36 = defpackage.jha.c
            int r4 = defpackage.kha.i
            eqe r5 = new eqe
            r5.<init>(r4)
            dfd r4 = new dfd
            kxc r6 = r12.s()
            jp r6 = (defpackage.jp) r6
            ne7 r6 = r6.g
            java.lang.String r7 = "app.privacy.chats.invite"
            java.lang.String r6 = r6.getString(r7, r8)
            eqe r6 = defpackage.cid.u(r6)
            r4.<init>(r6, r3)
            je7 r10 = r12.u0
            java.lang.Object r6 = r10.getValue()
            qe5 r6 = (defpackage.qe5) r6
            se5 r6 = (defpackage.se5) r6
            r6.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f126unsafefilesalert
            boolean r6 = r6.n(r7, r13)
            if (r6 == 0) goto L_0x019f
            r33 = r29
            goto L_0x01a1
        L_0x019f:
            r33 = r28
        L_0x01a1:
            v0d r6 = new v0d
            r41 = 0
            r42 = 0
            r35 = 0
            r38 = 0
            r39 = 0
            r43 = 432(0x1b0, float:6.05E-43)
            r32 = r6
            r34 = r5
            r40 = r4
            r32.<init>(r33, r34, r35, r36, r38, r39, r40, r41, r42, r43)
            r2.add(r6)
            java.lang.Object r4 = r10.getValue()
            qe5 r4 = (defpackage.qe5) r4
            se5 r4 = (defpackage.se5) r4
            r4.getClass()
            boolean r4 = r4.n(r7, r13)
            if (r4 == 0) goto L_0x0210
            long r20 = defpackage.jha.b
            int r4 = defpackage.kha.h
            eqe r5 = new eqe
            r5.<init>(r4)
            dfd r4 = new dfd
            kxc r6 = r12.s()
            jp r6 = (defpackage.jp) r6
            ne7 r6 = r6.g
            java.lang.String r7 = "app.privacy.unsafe.files"
            boolean r6 = r6.getBoolean(r7, r13)
            if (r6 == 0) goto L_0x01ea
            int r6 = defpackage.jpc.L
            goto L_0x01ec
        L_0x01ea:
            int r6 = defpackage.jpc.H
        L_0x01ec:
            eqe r7 = new eqe
            r7.<init>(r6)
            r4.<init>(r7, r3)
            v0d r3 = new v0d
            r25 = 0
            r26 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r27 = 432(0x1b0, float:6.05E-43)
            r16 = r3
            r17 = r28
            r18 = r5
            r24 = r4
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r3)
        L_0x0210:
            u0d r3 = new u0d
            int r4 = defpackage.kha.g
            eqe r5 = new eqe
            r5.<init>(r4)
            long r6 = defpackage.jha.a
            r4 = 2
            r3.<init>(r5, r4, r6)
            r2.add(r3)
            long r20 = defpackage.jha.j
            int r3 = defpackage.kha.H
            eqe r4 = new eqe
            r4.<init>(r3)
            dfd r3 = new dfd
            kxc r5 = r12.s()
            jp r5 = (defpackage.jp) r5
            ne7 r5 = r5.g
            java.lang.String r6 = "app.privacy.online.show"
            boolean r5 = r5.getBoolean(r6, r14)
            if (r5 == 0) goto L_0x0245
            int r5 = defpackage.jpc.Q
            eqe r6 = new eqe
            r6.<init>(r5)
            goto L_0x024c
        L_0x0245:
            int r5 = defpackage.jpc.G1
            eqe r6 = new eqe
            r6.<init>(r5)
        L_0x024c:
            r3.<init>(r6, r11)
            v0d r5 = new v0d
            r25 = 0
            r26 = 0
            r19 = 2
            r22 = 0
            r23 = 0
            r27 = 432(0x1b0, float:6.05E-43)
            r16 = r5
            r17 = r31
            r18 = r4
            r24 = r3
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r5)
            long r7 = defpackage.jha.d
            int r3 = defpackage.kha.j
            eqe r5 = new eqe
            r5.<init>(r3)
            int r3 = defpackage.kha.k
            eqe r9 = new eqe
            r9.<init>(r3)
            v0d r6 = new v0d
            r16 = 0
            r17 = 0
            r18 = 3
            r19 = 0
            r20 = 400(0x190, float:5.6E-43)
            r3 = r6
            r4 = r31
            r44 = r6
            r6 = r18
            r18 = r9
            r9 = r19
            r19 = r10
            r10 = r18
            r11 = r15
            r45 = r12
            r12 = r16
            r13 = r17
            r16 = r15
            r15 = r14
            r14 = r20
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            r3 = r44
            r2.add(r3)
            java.lang.Object r3 = r19.getValue()
            qe5 r3 = (defpackage.qe5) r3
            se5 r3 = (defpackage.se5) r3
            r3.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f132webappbiometryenabled
            r14 = 0
            boolean r3 = r3.n(r4, r14)
            if (r3 == 0) goto L_0x0319
            r13 = r45
            kke r3 = r13.o
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.b()
            whd r4 = new whd
            r5 = 0
            r4.<init>(r13, r5)
            r0.X = r13
            r0.Y = r2
            r0.Z = r2
            r0.s0 = r15
            java.lang.Object r0 = defpackage.j47.t0(r3, r4, r0)
            if (r0 != r1) goto L_0x02dd
            return r1
        L_0x02dd:
            r1 = r2
            r17 = r13
        L_0x02e0:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0312
            bc7[] r0 = defpackage.cid.O0
            r17.getClass()
            long r7 = defpackage.jha.k
            int r0 = defpackage.kha.J
            eqe r5 = new eqe
            r5.<init>(r0)
            v0d r0 = new v0d
            r12 = 0
            r18 = 0
            r6 = 1
            r9 = 0
            r10 = 0
            r19 = 432(0x1b0, float:6.05E-43)
            r3 = r0
            r4 = r31
            r11 = r16
            r46 = r13
            r13 = r18
            r14 = r19
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            r1.add(r0)
            goto L_0x0314
        L_0x0312:
            r46 = r13
        L_0x0314:
            r0 = r2
            r12 = r17
            r2 = r1
            goto L_0x031e
        L_0x0319:
            r46 = r45
            r0 = r2
            r12 = r46
        L_0x031e:
            java.util.ArrayList r1 = r12.J0
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r15
            w9d r4 = r12.I0
            l7b r5 = r12.c
            java.lang.String r6 = "\n"
            if (r4 == 0) goto L_0x042f
            u0d r7 = new u0d
            int r8 = defpackage.kha.D
            eqe r9 = new eqe
            r9.<init>(r8)
            long r10 = defpackage.jha.g
            r8 = 4
            r7.<init>(r9, r8, r10)
            r2.add(r7)
            int r7 = defpackage.kha.n
            java.lang.String r9 = r4.b
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            gqe r10 = new gqe
            java.util.List r9 = defpackage.ys.m0(r9)
            r10.<init>(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = r4.c
            r7.append(r9)
            r7.append(r6)
            java.lang.String r9 = r4.o
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            iqe r9 = new iqe
            r9.<init>(r7)
            if (r3 == 0) goto L_0x0370
            r17 = r30
            goto L_0x0372
        L_0x0370:
            r17 = r31
        L_0x0372:
            gfd r7 = new gfd
            java.lang.Object r11 = r5.b
            k56 r11 = (defpackage.k56) r11
            java.lang.Object r11 = r11.invoke()
            android.content.Context r11 = (android.content.Context) r11
            int r12 = defpackage.kha.m
            java.lang.String r12 = r11.getString(r12)
            android.graphics.drawable.ShapeDrawable r13 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r14 = new android.graphics.drawable.shapes.OvalShape
            r14.<init>()
            r13.<init>(r14)
            pq9 r14 = defpackage.qp4.u0
            bs6 r15 = defpackage.k7d.h(r14, r11)
            r8 = 8
            float r8 = (float) r8
            android.content.res.Resources r18 = defpackage.fk4.d()
            r48 = r0
            android.util.DisplayMetrics r0 = r18.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r8
            int r0 = defpackage.tu0.G(r0)
            r13.setIntrinsicHeight(r0)
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r8 = r8 * r0
            int r0 = defpackage.tu0.G(r8)
            r13.setIntrinsicWidth(r0)
            int r0 = r13.getIntrinsicWidth()
            int r8 = r13.getIntrinsicHeight()
            r30 = r3
            r3 = 0
            r13.setBounds(r3, r3, r0, r8)
            android.graphics.Paint r0 = r13.getPaint()
            int r8 = r15.e
            r0.setColor(r8)
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.String r8 = " "
            java.lang.String r8 = r8.concat(r12)
            r0.<init>(r8)
            yl5 r8 = new yl5
            sl5 r12 = defpackage.sl5.c
            r15 = 4
            r8.<init>((android.graphics.drawable.Drawable) r13, (defpackage.sl5) r12, (int) r15)
            r12 = 17
            r13 = 1
            r0.setSpan(r8, r3, r13, r12)
            mse r8 = new mse
            qp4 r11 = r14.b(r11)
            fka r11 = r11.i()
            w8c r13 = new w8c
            r14 = 19
            r13.<init>(r14)
            r8.<init>(r11, r13)
            int r11 = r0.length()
            r0.setSpan(r8, r3, r11, r12)
            iqe r3 = new iqe
            r3.<init>(r0)
            r7.<init>(r3)
            v0d r0 = new v0d
            r25 = 0
            r26 = 0
            r19 = 4
            long r3 = r4.a
            r22 = 0
            r27 = 400(0x190, float:5.6E-43)
            r16 = r0
            r18 = r10
            r20 = r3
            r23 = r9
            r24 = r7
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r0)
            goto L_0x0433
        L_0x042f:
            r48 = r0
            r30 = r3
        L_0x0433:
            java.util.Iterator r0 = r1.iterator()
        L_0x0437:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04c4
            java.lang.Object r1 = r0.next()
            w9d r1 = (defpackage.w9d) r1
            long r3 = r1.a
            iqe r7 = new iqe
            java.lang.String r8 = r1.b
            r7.<init>(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r1.c
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = r1.o
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            iqe r9 = new iqe
            r9.<init>(r8)
            gfd r8 = new gfd
            java.lang.Object r10 = r5.b
            k56 r10 = (defpackage.k56) r10
            java.lang.Object r10 = r10.invoke()
            r11 = r10
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r10 = r5.c
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r12 = r10.getValue()
            q33 r12 = (defpackage.q33) r12
            hyc r12 = (defpackage.hyc) r12
            java.util.Locale r12 = r12.v()
            java.lang.Object r10 = r10.getValue()
            q33 r10 = (defpackage.q33) r10
            hyc r10 = (defpackage.hyc) r10
            long r15 = r10.n()
            r17 = 0
            long r13 = r1.a
            java.lang.String r1 = defpackage.ay7.j(r11, r12, r13, r15, r17)
            if (r1 != 0) goto L_0x049c
            java.lang.String r1 = ""
        L_0x049c:
            iqe r10 = new iqe
            r10.<init>(r1)
            r8.<init>(r10)
            v0d r1 = new v0d
            r25 = 0
            r26 = 0
            r19 = 4
            r22 = 0
            r27 = 400(0x190, float:5.6E-43)
            r16 = r1
            r17 = r29
            r18 = r7
            r20 = r3
            r23 = r9
            r24 = r8
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r1)
            goto L_0x0437
        L_0x04c4:
            if (r30 == 0) goto L_0x04eb
            long r20 = defpackage.jha.f
            int r0 = defpackage.kha.C
            eqe r1 = new eqe
            r1.<init>(r0)
            jfd r22 = defpackage.jfd.c
            v0d r0 = new v0d
            r25 = 0
            r26 = 0
            r19 = 4
            r23 = 0
            r24 = 0
            r27 = 480(0x1e0, float:6.73E-43)
            r16 = r0
            r17 = r28
            r18 = r1
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r0)
        L_0x04eb:
            kl7 r0 = defpackage.j1e.d(r48)
            r1 = r46
            q0e r1 = r1.z0
        L_0x04f3:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r1.c(r2, r0)
            if (r2 == 0) goto L_0x04f3
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xhd.o(java.lang.Object):java.lang.Object");
    }
}
