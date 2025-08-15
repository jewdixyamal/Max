package defpackage;

/* renamed from: zxa  reason: default package */
public final class zxa implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ eya c;

    public /* synthetic */ zxa(on5 on5, eya eya, int i) {
        this.a = i;
        this.b = on5;
        this.c = eya;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r0.a
            switch(r3) {
                case 0: goto L_0x0127;
                case 1: goto L_0x0058;
                default: goto L_0x000b;
            }
        L_0x000b:
            boolean r3 = r2 instanceof defpackage.cya
            if (r3 == 0) goto L_0x001e
            r3 = r2
            cya r3 = (defpackage.cya) r3
            int r4 = r3.X
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001e
            int r4 = r4 - r5
            r3.X = r4
            goto L_0x0023
        L_0x001e:
            cya r3 = new cya
            r3.<init>(r0, r2)
        L_0x0023:
            java.lang.Object r2 = r3.o
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.X
            e5f r6 = defpackage.e5f.a
            r7 = 1
            if (r5 == 0) goto L_0x003c
            if (r5 != r7) goto L_0x0034
            defpackage.od2.a0(r2)
            goto L_0x0056
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            defpackage.od2.a0(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            r1.longValue()
            eya r1 = r0.c
            qn3 r1 = r1.o
            r1.b()
            r3.X = r7
            on5 r0 = r0.b
            java.lang.Object r0 = r0.a(r6, r3)
            if (r0 != r4) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r4 = r6
        L_0x0057:
            return r4
        L_0x0058:
            boolean r3 = r2 instanceof defpackage.bya
            if (r3 == 0) goto L_0x006b
            r3 = r2
            bya r3 = (defpackage.bya) r3
            int r4 = r3.X
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x006b
            int r4 = r4 - r5
            r3.X = r4
            goto L_0x0070
        L_0x006b:
            bya r3 = new bya
            r3.<init>(r0, r2)
        L_0x0070:
            java.lang.Object r2 = r3.o
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.X
            r6 = 1
            if (r5 == 0) goto L_0x0088
            if (r5 != r6) goto L_0x0080
            defpackage.od2.a0(r2)
            goto L_0x0124
        L_0x0080:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0088:
            defpackage.od2.a0(r2)
            on5 r2 = r0.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            eya r0 = r0.c
            java.lang.String r5 = r0.b
            java.lang.String r7 = "all.chat.folder"
            boolean r5 = defpackage.tpa.f(r5, r7)
            if (r5 != 0) goto L_0x009d
            goto L_0x011b
        L_0x009d:
            je7 r0 = r0.v0
            java.lang.Object r0 = r0.getValue()
            zrc r0 = (defpackage.zrc) r0
            j0e r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            e52 r0 = (defpackage.e52) r0
            if (r0 != 0) goto L_0x00b1
            goto L_0x011b
        L_0x00b1:
            boolean r5 = r1.isEmpty()
            r5 = r5 ^ r6
            r7 = 0
            if (r5 == 0) goto L_0x00dd
            java.util.Iterator r5 = r1.iterator()
            r8 = r7
        L_0x00be:
            boolean r9 = r5.hasNext()
            r10 = -1
            if (r9 == 0) goto L_0x00d7
            java.lang.Object r9 = r5.next()
            pxa r9 = (defpackage.pxa) r9
            long r11 = r9.a
            long r13 = r0.a
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            int r8 = r8 + 1
            goto L_0x00be
        L_0x00d7:
            r8 = r10
        L_0x00d8:
            if (r8 == r10) goto L_0x00dd
            r1.remove(r8)
        L_0x00dd:
            pxa r5 = new pxa
            long r12 = r0.a
            long r14 = r0.f()
            r0.k0()
            java.lang.CharSequence r8 = r0.u0
            kk0 r9 = defpackage.kk0.c
            jk0 r10 = defpackage.jk0.a
            java.lang.String r9 = r0.g(r9, r10)
            if (r9 == 0) goto L_0x00fb
            android.net.Uri r9 = android.net.Uri.parse(r9)
        L_0x00f8:
            r18 = r9
            goto L_0x00fd
        L_0x00fb:
            r9 = 0
            goto L_0x00f8
        L_0x00fd:
            gza r9 = new gza
            long r10 = r0.a
            fza r0 = defpackage.fza.a
            r9.<init>(r10, r0)
            r23 = 1
            r17 = 0
            r19 = 0
            r20 = 0
            java.lang.String r22 = ""
            r11 = r5
            r16 = r8
            r21 = r9
            r11.<init>(r12, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.add(r7, r5)
        L_0x011b:
            r3.X = r6
            java.lang.Object r0 = r2.a(r1, r3)
            if (r0 != r4) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            e5f r4 = defpackage.e5f.a
        L_0x0126:
            return r4
        L_0x0127:
            boolean r3 = r2 instanceof defpackage.yxa
            if (r3 == 0) goto L_0x013a
            r3 = r2
            yxa r3 = (defpackage.yxa) r3
            int r4 = r3.X
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x013a
            int r4 = r4 - r5
            r3.X = r4
            goto L_0x013f
        L_0x013a:
            yxa r3 = new yxa
            r3.<init>(r0, r2)
        L_0x013f:
            java.lang.Object r2 = r3.o
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.X
            r6 = 1
            if (r5 == 0) goto L_0x0156
            if (r5 != r6) goto L_0x014e
            defpackage.od2.a0(r2)
            goto L_0x018a
        L_0x014e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0156:
            defpackage.od2.a0(r2)
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            eya r2 = r0.c
            k56 r5 = r2.Y
            java.lang.Object r5 = r5.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x018a
            w7c r2 = r2.z0
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x018a
            r3.X = r6
            on5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x018a
            goto L_0x018c
        L_0x018a:
            e5f r4 = defpackage.e5f.a
        L_0x018c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxa.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
