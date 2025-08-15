package defpackage;

/* renamed from: uva  reason: default package */
public final class uva {
    public final fwa a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public uva(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, fwa fwa) {
        this.a = fwa;
        this.b = je7;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je72;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yt6 a(defpackage.x10 r29, defpackage.l20 r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            long r3 = r1.s0
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            d20 r4 = r2.o
            if (r3 <= 0) goto L_0x0025
            boolean r3 = r4.a()
            if (r3 != 0) goto L_0x0022
            boolean r3 = r4.b()
            if (r3 == 0) goto L_0x0025
            boolean r3 = r28.b(r29, r30)
            if (r3 != 0) goto L_0x0025
        L_0x0022:
            yt6 r0 = defpackage.yt6.m
            return r0
        L_0x0025:
            java.lang.String r3 = r29.a()
            je7 r5 = r0.e
            r6 = 0
            r7 = 0
            boolean r8 = r1.X
            java.lang.String r9 = r2.s
            if (r8 == 0) goto L_0x00ce
            je7 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            zi5 r3 = (defpackage.zi5) r3
            x10 r10 = r2.b
            if (r10 == 0) goto L_0x0042
            java.lang.String r11 = r10.u0
            goto L_0x0043
        L_0x0042:
            r11 = r7
        L_0x0043:
            if (r11 == 0) goto L_0x0055
            int r11 = r11.length()
            if (r11 != 0) goto L_0x004c
            goto L_0x0055
        L_0x004c:
            java.lang.String r10 = r10.u0
            kk5 r3 = (defpackage.kk5) r3
            java.io.File r3 = r3.l(r10)
            goto L_0x007f
        L_0x0055:
            if (r10 == 0) goto L_0x005a
            java.lang.String r11 = r10.t0
            goto L_0x005b
        L_0x005a:
            r11 = r7
        L_0x005b:
            if (r11 == 0) goto L_0x0077
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0064
            goto L_0x0077
        L_0x0064:
            int r11 = r9.length()
            if (r11 != 0) goto L_0x0077
            long r10 = r10.s0
            java.lang.String r10 = java.lang.String.valueOf(r10)
            kk5 r3 = (defpackage.kk5) r3
            java.io.File r3 = r3.l(r10)
            goto L_0x007f
        L_0x0077:
            kk5 r3 = (defpackage.kk5) r3
            java.lang.String r10 = r2.r
            java.io.File r3 = r3.l(r10)
        L_0x007f:
            boolean r10 = r3.exists()
            if (r10 == 0) goto L_0x008a
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            goto L_0x008b
        L_0x008a:
            r3 = r7
        L_0x008b:
            if (r9 == 0) goto L_0x00b2
            int r10 = r9.length()
            if (r10 != 0) goto L_0x0094
            goto L_0x00b2
        L_0x0094:
            java.io.File r10 = new java.io.File
            r10.<init>(r9)
            boolean r10 = r10.exists()
            if (r10 == 0) goto L_0x00b2
            int r10 = defpackage.pag.d
            java.lang.String r10 = ".mp4"
            boolean r10 = r9.endsWith(r10)
            if (r10 != 0) goto L_0x00b2
            java.lang.String r9 = defpackage.j47.O(r9)
            android.net.Uri r9 = defpackage.kk5.r(r9)
            goto L_0x00c8
        L_0x00b2:
            java.lang.String r9 = r29.a()
            if (r9 == 0) goto L_0x00be
            android.net.Uri r9 = android.net.Uri.parse(r9)
            if (r9 != 0) goto L_0x00c8
        L_0x00be:
            java.lang.String r9 = r1.v0
            if (r9 == 0) goto L_0x00c7
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L_0x00c8
        L_0x00c7:
            r9 = r7
        L_0x00c8:
            if (r3 != 0) goto L_0x0102
            if (r9 == 0) goto L_0x0102
            r3 = r9
            goto L_0x0102
        L_0x00ce:
            if (r9 == 0) goto L_0x00e7
            int r10 = r9.length()
            if (r10 != 0) goto L_0x00d7
            goto L_0x00e7
        L_0x00d7:
            java.io.File r10 = new java.io.File
            r10.<init>(r9)
            boolean r9 = r10.exists()
            if (r9 == 0) goto L_0x00e7
            android.net.Uri r9 = android.net.Uri.fromFile(r10)
            goto L_0x00e8
        L_0x00e7:
            r9 = r7
        L_0x00e8:
            if (r9 != 0) goto L_0x00ef
            android.net.Uri r3 = defpackage.kk5.r(r3)
            r9 = r3
        L_0x00ef:
            java.lang.Object r3 = r5.getValue()
            t00 r3 = (defpackage.t00) r3
            o20 r3 = (defpackage.o20) r3
            android.net.Uri r3 = r3.c(r2, r6)
            if (r9 != 0) goto L_0x0102
            if (r3 != 0) goto L_0x0102
            yt6 r0 = defpackage.yt6.m
            return r0
        L_0x0102:
            g20 r10 = defpackage.g20.c
            d20 r11 = defpackage.d20.c
            je7 r12 = r0.f
            r13 = 1
            g20 r14 = r2.a
            if (r14 != r10) goto L_0x0123
            if (r8 == 0) goto L_0x0123
            java.lang.Object r8 = r12.getValue()
            ge2 r8 = (defpackage.ge2) r8
            boolean r8 = r8.b(r13)
            if (r8 != 0) goto L_0x0120
            if (r4 == r11) goto L_0x0120
        L_0x011d:
            r22 = r13
            goto L_0x0134
        L_0x0120:
            r22 = r6
            goto L_0x0134
        L_0x0123:
            if (r14 != r10) goto L_0x0120
            java.lang.Object r8 = r12.getValue()
            ge2 r8 = (defpackage.ge2) r8
            boolean r8 = r8.d()
            if (r8 != 0) goto L_0x0120
            if (r4 == r11) goto L_0x0120
            goto L_0x011d
        L_0x0134:
            if (r9 != 0) goto L_0x013e
            if (r3 != 0) goto L_0x013b
            yt6 r0 = defpackage.yt6.m
            return r0
        L_0x013b:
            r17 = r3
            goto L_0x0140
        L_0x013e:
            r17 = r9
        L_0x0140:
            fwa r0 = r0.a
            khe r4 = r0.c
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r21 = r4.intValue()
            if (r3 != 0) goto L_0x015c
            java.lang.Object r3 = r5.getValue()
            t00 r3 = (defpackage.t00) r3
            o20 r3 = (defpackage.o20) r3
            android.net.Uri r3 = r3.c(r2, r6)
        L_0x015c:
            r23 = r3
            int r3 = r1.c
            int r4 = r1.o
            jic r24 = r0.a(r3, r4, r13)
            java.lang.String r0 = r1.t0
            if (r0 == 0) goto L_0x016e
            android.net.Uri r7 = android.net.Uri.parse(r0)
        L_0x016e:
            r26 = r7
            yt6 r0 = new yt6
            boolean r3 = r1.X
            java.lang.String r2 = r2.r
            long r4 = r1.s0
            int r6 = r1.c
            int r1 = r1.o
            r27 = 512(0x200, float:7.175E-43)
            r14 = r0
            r15 = r4
            r18 = r6
            r19 = r1
            r20 = r3
            r25 = r2
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uva.a(x10, l20):yt6");
    }

    public final boolean b(x10 x10, l20 l20) {
        if (!x10.X && l20.o.b()) {
            int i = ft4.o;
            long n = ((hyc) ((q33) this.b.getValue())).n();
            kt4 kt4 = kt4.MILLISECONDS;
            if (ft4.c(ft4.g(z7.S(n, kt4), z7.S(l20.p, kt4)), vva.a) > 0) {
                return true;
            }
        }
        return false;
    }
}
