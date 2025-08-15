package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pp4  reason: default package */
public final class pp4 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ qp4 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ CharSequence s0;
    public final /* synthetic */ Long t0;
    public final /* synthetic */ Long u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pp4(qp4 qp4, long j, CharSequence charSequence, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.Y = qp4;
        this.Z = j;
        this.s0 = charSequence;
        this.t0 = l;
        this.u0 = l2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pp4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pp4(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r36) {
        /*
            r35 = this;
            r0 = r35
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            e5f r3 = defpackage.e5f.a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 4
            if (r2 == 0) goto L_0x0032
            if (r2 == r6) goto L_0x002d
            if (r2 == r5) goto L_0x0028
            if (r2 == r4) goto L_0x0023
            if (r2 != r7) goto L_0x001b
            defpackage.od2.a0(r36)
            goto L_0x0238
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            defpackage.od2.a0(r36)
            goto L_0x021a
        L_0x0028:
            defpackage.od2.a0(r36)
            goto L_0x01f8
        L_0x002d:
            defpackage.od2.a0(r36)
            goto L_0x0248
        L_0x0032:
            defpackage.od2.a0(r36)
            qp4 r2 = r0.Y
            java.lang.Object r8 = r2.Y
            je7 r8 = (defpackage.je7) r8
            java.lang.Object r8 = r8.getValue()
            y7d r8 = (defpackage.y7d) r8
            qyc r8 = (defpackage.qyc) r8
            boolean r8 = r8.u()
            java.lang.CharSequence r9 = r0.s0
            java.lang.String r10 = defpackage.oag.x(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "start save and upload chatId:"
            r11.<init>(r12)
            long r12 = r0.Z
            java.lang.String r14 = ", text:"
            defpackage.ms2.j(r12, r14, r10, r11)
            java.lang.String r10 = ", editId:"
            r11.append(r10)
            java.lang.Long r10 = r0.t0
            r11.append(r10)
            java.lang.String r14 = ", replyId:"
            r11.append(r14)
            java.lang.Long r14 = r0.u0
            r11.append(r14)
            java.lang.String r15 = ", syncEn:"
            r11.append(r15)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            java.lang.Object r15 = r2.a
            java.lang.String r15 = (java.lang.String) r15
            defpackage.hm9.m(r15, r11, new java.lang.Object[0])
            java.lang.Object r11 = r2.o
            je7 r11 = (defpackage.je7) r11
            java.lang.Object r16 = r11.getValue()
            iy2 r16 = (defpackage.iy2) r16
            r7 = r16
            jz2 r7 = (defpackage.jz2) r7
            w7c r7 = r7.m(r12)
            j0e r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            e52 r7 = (defpackage.e52) r7
            if (r7 != 0) goto L_0x009f
            return r3
        L_0x009f:
            r16 = 0
            if (r9 == 0) goto L_0x00a8
            java.lang.CharSequence r9 = defpackage.w9e.b1(r9)
            goto L_0x00aa
        L_0x00a8:
            r9 = r16
        L_0x00aa:
            if (r9 == 0) goto L_0x00d9
            int r17 = r9.length()
            if (r17 != 0) goto L_0x00b3
            goto L_0x00d9
        L_0x00b3:
            boolean r4 = r9 instanceof android.text.Spannable
            if (r4 != 0) goto L_0x00cd
            xd7 r4 = new xd7
            java.lang.String r9 = r9.toString()
            java.lang.CharSequence r9 = defpackage.w9e.b1(r9)
            java.lang.String r9 = r9.toString()
            nz4 r5 = defpackage.nz4.a
            r4.<init>(r9, r5)
            r21 = r4
            goto L_0x00fd
        L_0x00cd:
            android.text.Spannable r9 = (android.text.Spannable) r9
            android.text.Spannable r4 = defpackage.ee.a(r9)
            int r5 = r4.length()
            if (r5 != 0) goto L_0x00dc
        L_0x00d9:
            r21 = r16
            goto L_0x00fd
        L_0x00dc:
            java.lang.Object r5 = r2.s0
            je7 r5 = (defpackage.je7) r5
            java.lang.Object r5 = r5.getValue()
            dc6 r5 = (defpackage.dc6) r5
            java.util.List r5 = r5.a(r7, r4)
            java.lang.String r4 = r4.toString()
            boolean r9 = r5.isEmpty()
            if (r9 == 0) goto L_0x00f6
            r5 = r16
        L_0x00f6:
            xd7 r9 = new xd7
            r9.<init>(r4, r5)
            r21 = r9
        L_0x00fd:
            k92 r4 = r7.b
            uaa r5 = r4.f0
            boolean r9 = r5 instanceof defpackage.uaa
            if (r9 == 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r5 = r16
        L_0x0108:
            java.lang.Long r9 = new java.lang.Long
            r36 = r7
            long r6 = r4.a
            r9.<init>(r6)
            long r6 = r9.longValue()
            r27 = 0
            int r6 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r6 == 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r9 = r16
        L_0x011e:
            if (r9 == 0) goto L_0x0127
            long r6 = r9.longValue()
        L_0x0124:
            r19 = r6
            goto L_0x012a
        L_0x0127:
            long r6 = r4.l
            goto L_0x0124
        L_0x012a:
            if (r14 != 0) goto L_0x012d
            goto L_0x0138
        L_0x012d:
            long r6 = r14.longValue()
            int r6 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r6 != 0) goto L_0x0138
            r22 = r16
            goto L_0x013a
        L_0x0138:
            r22 = r14
        L_0x013a:
            if (r10 != 0) goto L_0x013d
            goto L_0x0148
        L_0x013d:
            long r6 = r10.longValue()
            int r6 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r6 != 0) goto L_0x0148
            r23 = r16
            goto L_0x014a
        L_0x0148:
            r23 = r10
        L_0x014a:
            uaa r6 = new uaa
            r24 = 0
            r26 = 112(0x70, float:1.57E-43)
            r25 = 0
            r18 = r6
            r18.<init>((long) r19, (defpackage.xd7) r21, (java.lang.Long) r22, (java.lang.Long) r23, (java.lang.Long) r24, (boolean) r25, (int) r26)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0163
            java.lang.String r0 = "Old draft equals new draft"
            defpackage.hm9.m(r15, r0, new java.lang.Object[0])
            return r3
        L_0x0163:
            boolean r5 = r6.d()
            java.lang.Object r7 = r2.b
            z23 r7 = (defpackage.z23) r7
            if (r5 != 0) goto L_0x0239
            java.lang.Long r5 = r6.c
            xd7 r9 = r6.b
            if (r5 == 0) goto L_0x0179
            boolean r5 = defpackage.fm9.G(r9)
            if (r5 != 0) goto L_0x0239
        L_0x0179:
            java.lang.Long r5 = r6.d
            if (r5 == 0) goto L_0x0185
            boolean r5 = defpackage.fm9.G(r9)
            if (r5 == 0) goto L_0x0185
            goto L_0x0239
        L_0x0185:
            java.lang.String r5 = "Old draft NOT equals new draft and new draft is not empty. Start saving"
            defpackage.hm9.m(r15, r5, new java.lang.Object[0])
            java.lang.Object r5 = r2.X
            je7 r5 = (defpackage.je7) r5
            java.lang.Object r16 = r5.getValue()
            q33 r16 = (defpackage.q33) r16
            r18 = r2
            r2 = r16
            t33 r2 = (defpackage.t33) r2
            r16 = r14
            java.lang.String r14 = "app.draftsChanged"
            r19 = r1
            r1 = 1
            r2.j(r14, r1)
            if (r8 != 0) goto L_0x01b5
            java.lang.Object r1 = r5.getValue()
            q33 r1 = (defpackage.q33) r1
            hyc r1 = (defpackage.hyc) r1
            long r1 = r1.n()
        L_0x01b2:
            r32 = r1
            goto L_0x01b8
        L_0x01b5:
            long r1 = r4.g0
            goto L_0x01b2
        L_0x01b8:
            java.lang.Object r1 = r11.getValue()
            iy2 r1 = (defpackage.iy2) r1
            jz2 r1 = (defpackage.jz2) r1
            p82 r29 = r1.l()
            r1 = r36
            long r1 = r1.a
            r30 = r1
            r34 = r6
            r29.k(r30, r32, r34)
            if (r8 != 0) goto L_0x01d7
            java.lang.String r0 = "Drafts sync NOT enabled"
            defpackage.hm9.m(r15, r0, new java.lang.Object[0])
            return r3
        L_0x01d7:
            if (r10 == 0) goto L_0x01f9
            long r1 = r10.longValue()
            int r1 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r1 == 0) goto L_0x01f9
            java.lang.String r1 = "we don't sync edit"
            defpackage.hm9.m(r15, r1, new java.lang.Object[0])
            boolean r1 = defpackage.fm9.G(r9)
            if (r1 == 0) goto L_0x01f8
            r1 = 2
            r0.X = r1
            java.lang.Object r0 = r7.f(r12, r0)
            r1 = r19
            if (r0 != r1) goto L_0x01f8
            return r1
        L_0x01f8:
            return r3
        L_0x01f9:
            r1 = r19
            boolean r2 = defpackage.fm9.G(r9)
            if (r2 == 0) goto L_0x021b
            if (r16 == 0) goto L_0x021b
            long r4 = r16.longValue()
            int r2 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x021b
            java.lang.String r2 = "we don't sync empty text for replied message"
            defpackage.hm9.m(r15, r2, new java.lang.Object[0])
            r2 = 3
            r0.X = r2
            java.lang.Object r0 = r7.f(r12, r0)
            if (r0 != r1) goto L_0x021a
            return r1
        L_0x021a:
            return r3
        L_0x021b:
            boolean r2 = defpackage.fm9.G(r9)
            if (r2 == 0) goto L_0x0227
            java.lang.String r0 = "Drafts sync enabled. Draft has no text and no attaches. Do NOT send to server"
            defpackage.hm9.m(r15, r0, new java.lang.Object[0])
            return r3
        L_0x0227:
            java.lang.String r2 = "Drafts sync enabled. Send to server"
            defpackage.hm9.m(r15, r2, new java.lang.Object[0])
            r2 = 4
            r0.X = r2
            r2 = r18
            java.lang.Object r0 = defpackage.qp4.a(r2, r12, r6, r0)
            if (r0 != r1) goto L_0x0238
            return r1
        L_0x0238:
            return r3
        L_0x0239:
            java.lang.String r2 = "new draft is empty"
            defpackage.hm9.m(r15, r2, new java.lang.Object[0])
            r2 = 1
            r0.X = r2
            java.lang.Object r0 = r7.f(r12, r0)
            if (r0 != r1) goto L_0x0248
            return r1
        L_0x0248:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp4.o(java.lang.Object):java.lang.Object");
    }
}
