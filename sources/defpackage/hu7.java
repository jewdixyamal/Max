package defpackage;

/* renamed from: hu7  reason: default package */
public final class hu7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;

    public hu7(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je77;
        this.f = je75;
        this.g = je76;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9 A[Catch:{ TamErrorException -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[Catch:{ TamErrorException -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf A[Catch:{ TamErrorException -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0170 A[Catch:{ TamErrorException -> 0x019a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0175 A[Catch:{ TamErrorException -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0176 A[Catch:{ TamErrorException -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            java.lang.String r3 = "login: onEnded by "
            boolean r4 = r2 instanceof defpackage.gu7
            if (r4 == 0) goto L_0x001c
            r4 = r2
            gu7 r4 = (defpackage.gu7) r4
            int r5 = r4.u0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.u0 = r5
        L_0x001a:
            r11 = r4
            goto L_0x0022
        L_0x001c:
            gu7 r4 = new gu7
            r4.<init>(r1, r2)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r2 = r11.s0
            tx3 r4 = defpackage.tx3.a
            int r5 = r11.u0
            r12 = 0
            java.lang.String r13 = "hu7"
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0079
            if (r5 == r8) goto L_0x0061
            if (r5 == r7) goto L_0x004d
            if (r5 != r6) goto L_0x0045
            long r0 = r11.Z
            hu7 r4 = r11.o
            defpackage.od2.a0(r2)     // Catch:{ TamErrorException -> 0x0041 }
            r14 = r0
            r1 = r4
            goto L_0x0171
        L_0x0041:
            r0 = move-exception
            r1 = r4
            goto L_0x01ab
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            long r0 = r11.Z
            java.lang.Object r5 = r11.X
            kt7 r5 = (defpackage.kt7) r5
            hu7 r7 = r11.o
            defpackage.od2.a0(r2)     // Catch:{ TamErrorException -> 0x005d }
            r14 = r0
            r8 = r5
            r1 = r7
            goto L_0x013c
        L_0x005d:
            r0 = move-exception
            r1 = r7
            goto L_0x01ab
        L_0x0061:
            long r0 = r11.Z
            java.lang.String r5 = r11.Y
            java.lang.Object r8 = r11.X
            java.lang.String r8 = (java.lang.String) r8
            hu7 r9 = r11.o
            defpackage.od2.a0(r2)     // Catch:{ TamErrorException -> 0x0075 }
            r16 = r0
            r0 = r8
            r1 = r9
            r9 = r16
            goto L_0x00b3
        L_0x0075:
            r0 = move-exception
            r1 = r9
            goto L_0x01ab
        L_0x0079:
            defpackage.od2.a0(r2)
            je7 r2 = r1.d
            java.lang.Object r2 = r2.getValue()
            u0b r2 = (defpackage.u0b) r2
            r2.b()
            int r2 = defpackage.ft4.o     // Catch:{ TamErrorException -> 0x019a }
            long r9 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x019a }
            kt4 r2 = defpackage.kt4.NANOSECONDS     // Catch:{ TamErrorException -> 0x019a }
            long r9 = defpackage.z7.S(r9, r2)     // Catch:{ TamErrorException -> 0x019a }
            java.lang.String r2 = "login: onStarted"
            defpackage.hm9.m(r13, r2, new java.lang.Object[0])     // Catch:{ TamErrorException -> 0x019a }
            je7 r2 = r1.a     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r2 = r2.getValue()     // Catch:{ TamErrorException -> 0x019a }
            e5a r2 = (defpackage.e5a) r2     // Catch:{ TamErrorException -> 0x019a }
            r11.o = r1     // Catch:{ TamErrorException -> 0x019a }
            r11.X = r0     // Catch:{ TamErrorException -> 0x019a }
            r5 = r20
            r11.Y = r5     // Catch:{ TamErrorException -> 0x019a }
            r11.Z = r9     // Catch:{ TamErrorException -> 0x019a }
            r11.u0 = r8     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r2 = r2.b(r0, r11)     // Catch:{ TamErrorException -> 0x019a }
            if (r2 != r4) goto L_0x00b3
            return r4
        L_0x00b3:
            kt7 r2 = (defpackage.kt7) r2     // Catch:{ TamErrorException -> 0x019a }
            nab r8 = r2.c     // Catch:{ TamErrorException -> 0x019a }
            if (r8 == 0) goto L_0x00bc
            wm3 r8 = r8.a     // Catch:{ TamErrorException -> 0x019a }
            goto L_0x00bd
        L_0x00bc:
            r8 = r12
        L_0x00bd:
            if (r8 == 0) goto L_0x019f
            je7 r14 = r1.c     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r14 = r14.getValue()     // Catch:{ TamErrorException -> 0x019a }
            f5a r14 = (defpackage.f5a) r14     // Catch:{ TamErrorException -> 0x019a }
            java.lang.String r15 = r8.a()     // Catch:{ TamErrorException -> 0x019a }
            r14.getClass()     // Catch:{ TamErrorException -> 0x019a }
            android.accounts.Account r6 = new android.accounts.Account     // Catch:{ TamErrorException -> 0x019a }
            z4 r7 = r14.a     // Catch:{ TamErrorException -> 0x019a }
            java.lang.String r7 = r7.a     // Catch:{ TamErrorException -> 0x019a }
            r6.<init>(r15, r7)     // Catch:{ TamErrorException -> 0x019a }
            m7b r6 = r14.b()     // Catch:{ TamErrorException -> 0x019a }
            p7b r6 = (defpackage.p7b) r6     // Catch:{ TamErrorException -> 0x019a }
            g80 r6 = r6.d     // Catch:{ TamErrorException -> 0x019a }
            b5 r7 = r14.a()     // Catch:{ TamErrorException -> 0x019a }
            android.accounts.Account r7 = r7.a()     // Catch:{ TamErrorException -> 0x019a }
            r15 = 0
            r6.o(r7, r0, r15)     // Catch:{ TamErrorException -> 0x019a }
            b5 r0 = r14.a()     // Catch:{ TamErrorException -> 0x019a }
            r0.getClass()     // Catch:{ TamErrorException -> 0x019a }
            je7 r0 = r1.b     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x019a }
            q33 r0 = (defpackage.q33) r0     // Catch:{ TamErrorException -> 0x019a }
            long r6 = r8.a     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Long r14 = new java.lang.Long     // Catch:{ TamErrorException -> 0x019a }
            r14.<init>(r6)     // Catch:{ TamErrorException -> 0x019a }
            hyc r0 = (defpackage.hyc) r0     // Catch:{ TamErrorException -> 0x019a }
            r0.C(r14)     // Catch:{ TamErrorException -> 0x019a }
            je7 r0 = r1.b     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x019a }
            q33 r0 = (defpackage.q33) r0     // Catch:{ TamErrorException -> 0x019a }
            t33 r0 = (defpackage.t33) r0     // Catch:{ TamErrorException -> 0x019a }
            java.lang.String r6 = "user.Phone"
            r0.m(r6, r5)     // Catch:{ TamErrorException -> 0x019a }
            java.lang.String r0 = "login: auth and token are saved"
            defpackage.hm9.m(r13, r0, new java.lang.Object[0])     // Catch:{ TamErrorException -> 0x019a }
            je7 r0 = r1.e     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x019a }
            ds3 r0 = (defpackage.ds3) r0     // Catch:{ TamErrorException -> 0x019a }
            java.util.List r5 = java.util.Collections.singletonList(r8)     // Catch:{ TamErrorException -> 0x019a }
            ol3 r6 = defpackage.ol3.a     // Catch:{ TamErrorException -> 0x019a }
            r11.o = r1     // Catch:{ TamErrorException -> 0x019a }
            r11.X = r2     // Catch:{ TamErrorException -> 0x019a }
            r11.Y = r12     // Catch:{ TamErrorException -> 0x019a }
            r11.Z = r9     // Catch:{ TamErrorException -> 0x019a }
            r7 = 2
            r11.u0 = r7     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r0 = r0.e(r5, r6, r11)     // Catch:{ TamErrorException -> 0x019a }
            if (r0 != r4) goto L_0x013a
            return r4
        L_0x013a:
            r8 = r2
            r14 = r9
        L_0x013c:
            je7 r0 = r1.f     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x019a }
            r5 = r0
            cu7 r5 = (defpackage.cu7) r5     // Catch:{ TamErrorException -> 0x019a }
            je7 r0 = r1.b     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x019a }
            q33 r0 = (defpackage.q33) r0     // Catch:{ TamErrorException -> 0x019a }
            hyc r0 = (defpackage.hyc) r0     // Catch:{ TamErrorException -> 0x019a }
            long r6 = r0.o()     // Catch:{ TamErrorException -> 0x019a }
            je7 r0 = r1.b     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x019a }
            q33 r0 = (defpackage.q33) r0     // Catch:{ TamErrorException -> 0x019a }
            hyc r0 = (defpackage.hyc) r0     // Catch:{ TamErrorException -> 0x019a }
            long r9 = r0.p()     // Catch:{ TamErrorException -> 0x019a }
            r11.o = r1     // Catch:{ TamErrorException -> 0x019a }
            r11.X = r12     // Catch:{ TamErrorException -> 0x019a }
            r11.Z = r14     // Catch:{ TamErrorException -> 0x019a }
            r0 = 3
            r11.u0 = r0     // Catch:{ TamErrorException -> 0x019a }
            java.lang.Object r0 = r5.r(r6, r8, r9, r11)     // Catch:{ TamErrorException -> 0x019a }
            if (r0 != r4) goto L_0x0171
            return r4
        L_0x0171:
            ir6 r0 = defpackage.hm9.m     // Catch:{ TamErrorException -> 0x019a }
            if (r0 != 0) goto L_0x0176
            goto L_0x019c
        L_0x0176:
            boolean r2 = r0.c()     // Catch:{ TamErrorException -> 0x019a }
            if (r2 == 0) goto L_0x019c
            us7 r2 = defpackage.us7.X     // Catch:{ TamErrorException -> 0x019a }
            int r4 = defpackage.ft4.o     // Catch:{ TamErrorException -> 0x019a }
            long r4 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x019a }
            kt4 r6 = defpackage.kt4.NANOSECONDS     // Catch:{ TamErrorException -> 0x019a }
            long r4 = defpackage.z7.S(r4, r6)     // Catch:{ TamErrorException -> 0x019a }
            long r4 = defpackage.ft4.g(r4, r14)     // Catch:{ TamErrorException -> 0x019a }
            java.lang.String r4 = defpackage.ft4.j(r4)     // Catch:{ TamErrorException -> 0x019a }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ TamErrorException -> 0x019a }
            r0.d(r2, r13, r3, r12)     // Catch:{ TamErrorException -> 0x019a }
            goto L_0x019c
        L_0x019a:
            r0 = move-exception
            goto L_0x01ab
        L_0x019c:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x019f:
            java.lang.String r0 = "To login account should have profile and user id"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ TamErrorException -> 0x019a }
            java.lang.String r0 = r0.toString()     // Catch:{ TamErrorException -> 0x019a }
            r2.<init>(r0)     // Catch:{ TamErrorException -> 0x019a }
            throw r2     // Catch:{ TamErrorException -> 0x019a }
        L_0x01ab:
            pke r2 = r0.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "login: OnFailed - "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.hm9.m(r13, r2, new java.lang.Object[0])
            je7 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            xt7 r1 = (defpackage.xt7) r1
            pke r2 = r0.a
            r1.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu7.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
