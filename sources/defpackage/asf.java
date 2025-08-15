package defpackage;

/* renamed from: asf  reason: default package */
public final class asf implements la5 {
    public xrf X;
    public int Y = -1;
    public long Z = -1;
    public pa5 a;
    public yze b;
    public int c = 0;
    public long o = -1;

    public final void S(pa5 pa5) {
        this.a = pa5;
        this.b = pa5.B(0, 1);
        pa5.w();
    }

    public final void d(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        xrf xrf = this.X;
        if (xrf != null) {
            xrf.a(j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.na5 r25, defpackage.lh4 r26) {
        /*
            r24 = this;
            r0 = r24
            yze r1 = r0.b
            defpackage.fm9.l(r1)
            int r1 = defpackage.oaf.a
            int r1 = r0.c
            r2 = 0
            r3 = -1
            r4 = 4
            r5 = 1
            if (r1 == 0) goto L_0x0200
            r6 = 8
            r7 = 2
            r8 = -1
            if (r1 == r5) goto L_0x01ca
            r10 = 3
            if (r1 == r7) goto L_0x00d1
            if (r1 == r10) goto L_0x004a
            if (r1 != r4) goto L_0x0044
            long r6 = r0.Z
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r5 = r2
        L_0x0027:
            defpackage.fm9.k(r5)
            long r4 = r0.Z
            r1 = r25
            sa4 r1 = (defpackage.sa4) r1
            long r6 = r1.o
            long r4 = r4 - r6
            xrf r0 = r0.X
            r0.getClass()
            r1 = r25
            sa4 r1 = (defpackage.sa4) r1
            boolean r0 = r0.c(r1, r4)
            if (r0 == 0) goto L_0x0043
            r2 = r3
        L_0x0043:
            return r2
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x004a:
            r1 = r25
            sa4 r1 = (defpackage.sa4) r1
            r1.Y = r2
            wpa r1 = new wpa
            r1.<init>((int) r6)
            r3 = r25
            sa4 r3 = (defpackage.sa4) r3
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            b11 r1 = defpackage.pag.J(r5, r3, r1)
            r3.z(r6)
            long r5 = r3.o
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r6 = r1.c
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            java.lang.Object r5 = r1.first
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r0.Y = r5
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            long r10 = r0.o
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0095
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0095
            r5 = r10
        L_0x0095:
            int r1 = r0.Y
            long r10 = (long) r1
            long r10 = r10 + r5
            r0.Z = r10
            long r5 = r3.c
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x00c2
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Data exceeds input length: "
            r1.<init>(r3)
            long r7 = r0.Z
            r1.append(r7)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            defpackage.z04.c0(r1)
            r0.Z = r5
        L_0x00c2:
            xrf r1 = r0.X
            r1.getClass()
            int r3 = r0.Y
            long r5 = r0.Z
            r1.b(r3, r5)
            r0.c = r4
            return r2
        L_0x00d1:
            wpa r1 = new wpa
            r3 = 16
            r1.<init>((int) r3)
            r6 = r25
            sa4 r6 = (defpackage.sa4) r6
            r7 = 1718449184(0x666d7420, float:2.8033575E23)
            b11 r7 = defpackage.pag.J(r7, r6, r1)
            long r7 = r7.c
            r11 = 16
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x00ed
            r9 = r5
            goto L_0x00ee
        L_0x00ed:
            r9 = r2
        L_0x00ee:
            defpackage.fm9.k(r9)
            byte[] r9 = r1.a
            r6.q(r9, r2, r3, r2)
            r1.G(r2)
            int r6 = r1.n()
            int r13 = r1.n()
            int r14 = r1.m()
            r1.m()
            int r15 = r1.n()
            int r1 = r1.n()
            int r7 = (int) r7
            int r7 = r7 - r3
            if (r7 <= 0) goto L_0x0120
            byte[] r3 = new byte[r7]
            r8 = r25
            sa4 r8 = (defpackage.sa4) r8
            r8.q(r3, r2, r7, r2)
        L_0x011d:
            r17 = r3
            goto L_0x0123
        L_0x0120:
            byte[] r3 = defpackage.oaf.f
            goto L_0x011d
        L_0x0123:
            r3 = r25
            sa4 r3 = (defpackage.sa4) r3
            long r7 = r3.r()
            long r11 = r3.o
            long r7 = r7 - r11
            int r7 = (int) r7
            r3.z(r7)
            bsf r3 = new bsf
            r11 = r3
            r12 = r6
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7 = 17
            if (r6 != r7) goto L_0x014c
            vrf r1 = new vrf
            pa5 r4 = r0.a
            yze r5 = r0.b
            r1.<init>((defpackage.pa5) r4, (defpackage.yze) r5, (defpackage.bsf) r3)
            r0.X = r1
            goto L_0x01b4
        L_0x014c:
            r7 = 6
            if (r6 != r7) goto L_0x0167
            yrf r1 = new yrf
            pa5 r4 = r0.a
            yze r5 = r0.b
            java.lang.String r22 = "audio/g711-alaw"
            r23 = -1
            r18 = r1
            r19 = r4
            r20 = r5
            r21 = r3
            r18.<init>((defpackage.pa5) r19, (defpackage.yze) r20, (defpackage.bsf) r21, (java.lang.String) r22, (int) r23)
            r0.X = r1
            goto L_0x01b4
        L_0x0167:
            r7 = 7
            if (r6 != r7) goto L_0x0182
            yrf r1 = new yrf
            pa5 r4 = r0.a
            yze r5 = r0.b
            java.lang.String r22 = "audio/g711-mlaw"
            r23 = -1
            r18 = r1
            r19 = r4
            r20 = r5
            r21 = r3
            r18.<init>((defpackage.pa5) r19, (defpackage.yze) r20, (defpackage.bsf) r21, (java.lang.String) r22, (int) r23)
            r0.X = r1
            goto L_0x01b4
        L_0x0182:
            if (r6 == r5) goto L_0x0197
            if (r6 == r10) goto L_0x018e
            r4 = 65534(0xfffe, float:9.1833E-41)
            if (r6 == r4) goto L_0x0197
            r23 = r2
            goto L_0x019d
        L_0x018e:
            r5 = 32
            if (r1 != r5) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r4 = r2
        L_0x0194:
            r23 = r4
            goto L_0x019d
        L_0x0197:
            int r1 = defpackage.oaf.C(r1)
            r23 = r1
        L_0x019d:
            if (r23 == 0) goto L_0x01b7
            yrf r1 = new yrf
            pa5 r4 = r0.a
            yze r5 = r0.b
            java.lang.String r22 = "audio/raw"
            r18 = r1
            r19 = r4
            r20 = r5
            r21 = r3
            r18.<init>((defpackage.pa5) r19, (defpackage.yze) r20, (defpackage.bsf) r21, (java.lang.String) r22, (int) r23)
            r0.X = r1
        L_0x01b4:
            r0.c = r10
            return r2
        L_0x01b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported WAV format type: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x01ca:
            wpa r1 = new wpa
            r1.<init>((int) r6)
            r3 = r25
            sa4 r3 = (defpackage.sa4) r3
            b11 r4 = defpackage.b11.c(r3, r1)
            int r5 = r4.b
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L_0x01e1
            r3.Y = r2
            goto L_0x01fb
        L_0x01e1:
            r3.b(r6, r2)
            r1.G(r2)
            byte[] r3 = r1.a
            r5 = r25
            sa4 r5 = (defpackage.sa4) r5
            r5.q(r3, r2, r6, r2)
            long r8 = r1.j()
            long r3 = r4.c
            int r1 = (int) r3
            int r1 = r1 + r6
            r5.z(r1)
        L_0x01fb:
            r0.o = r8
            r0.c = r7
            return r2
        L_0x0200:
            r1 = r25
            sa4 r1 = (defpackage.sa4) r1
            long r6 = r1.o
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x020e
            r1 = r5
            goto L_0x020f
        L_0x020e:
            r1 = r2
        L_0x020f:
            defpackage.fm9.k(r1)
            int r1 = r0.Y
            if (r1 == r3) goto L_0x0220
            r3 = r25
            sa4 r3 = (defpackage.sa4) r3
            r3.z(r1)
            r0.c = r4
            goto L_0x0237
        L_0x0220:
            r1 = r25
            sa4 r1 = (defpackage.sa4) r1
            boolean r3 = defpackage.pag.f(r1)
            if (r3 == 0) goto L_0x0238
            long r3 = r1.r()
            long r6 = r1.o
            long r3 = r3 - r6
            int r3 = (int) r3
            r1.z(r3)
            r0.c = r5
        L_0x0237:
            return r2
        L_0x0238:
            java.lang.String r0 = "Unsupported or unrecognized wav file type."
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asf.g(na5, lh4):int");
    }

    public final boolean n(na5 na5) {
        return pag.f((sa4) na5);
    }

    public final void release() {
    }
}
