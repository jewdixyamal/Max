package defpackage;

/* renamed from: nd8  reason: default package */
public final /* synthetic */ class nd8 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ nd8(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.X = obj3;
        this.Y = obj4;
        this.b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d A[SYNTHETIC, Splitter:B:56:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 0: goto L_0x0131;
                case 1: goto L_0x00cc;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.o
            ol r0 = (defpackage.ol) r0
            java.lang.Object r1 = r13.Y
            lme r1 = (defpackage.lme) r1
            java.lang.Object r2 = r13.c
            tle r2 = (defpackage.tle) r2
            r2.getClass()
            java.lang.String r3 = "app.exception"
            java.lang.String r4 = "getRequest is null "
            r5 = 0
            je7 r6 = r2.A0     // Catch:{ Exception -> 0x005c }
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x005c }
            pl r6 = (defpackage.pl) r6     // Catch:{ Exception -> 0x005c }
            r0.c = r6     // Catch:{ Exception -> 0x005c }
            dle r8 = r0.s()     // Catch:{ Exception -> 0x005c }
            if (r8 == 0) goto L_0x007c
            dle r4 = r0.s()     // Catch:{ Exception -> 0x005c }
            long r10 = r2.d(r4)     // Catch:{ Exception -> 0x005c }
            boolean r4 = r13.b
            java.lang.Object r13 = r13.X
            r12 = r13
            dke r12 = (defpackage.dke) r12
            je7 r13 = r2.x0
            if (r4 == 0) goto L_0x005e
            java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x005c }
            yle r13 = (defpackage.yle) r13     // Catch:{ Exception -> 0x005c }
            java.util.concurrent.atomic.AtomicReference r4 = r13.Y     // Catch:{ Exception -> 0x005c }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x005c }
            r7 = r4
            x9d r7 = (defpackage.x9d) r7     // Catch:{ Exception -> 0x005c }
            if (r7 != 0) goto L_0x004f
            goto L_0x00cb
        L_0x004f:
            boolean r13 = r13.e(r8, r12)     // Catch:{ Exception -> 0x005c }
            if (r13 == 0) goto L_0x0057
            goto L_0x00cb
        L_0x0057:
            r9 = 1
            r7.i(r8, r9, r10, r12)     // Catch:{ Exception -> 0x005c }
            goto L_0x00cb
        L_0x005c:
            r13 = move-exception
            goto L_0x00aa
        L_0x005e:
            java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x005c }
            yle r13 = (defpackage.yle) r13     // Catch:{ Exception -> 0x005c }
            java.util.concurrent.atomic.AtomicReference r4 = r13.Y     // Catch:{ Exception -> 0x005c }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x005c }
            r7 = r4
            x9d r7 = (defpackage.x9d) r7     // Catch:{ Exception -> 0x005c }
            if (r7 != 0) goto L_0x0070
            goto L_0x00cb
        L_0x0070:
            boolean r13 = r13.e(r8, r12)     // Catch:{ Exception -> 0x005c }
            if (r13 == 0) goto L_0x0077
            goto L_0x00cb
        L_0x0077:
            r9 = 0
            r7.i(r8, r9, r10, r12)     // Catch:{ Exception -> 0x005c }
            goto L_0x00cb
        L_0x007c:
            java.lang.Class r13 = r0.getClass()     // Catch:{ Exception -> 0x005c }
            java.lang.String r13 = r13.getName()     // Catch:{ Exception -> 0x005c }
            java.lang.String r13 = r4.concat(r13)     // Catch:{ Exception -> 0x005c }
            pke r4 = new pke     // Catch:{ Exception -> 0x005c }
            r4.<init>(r3, r13, r5)     // Catch:{ Exception -> 0x005c }
            r2.f(r0, r4)     // Catch:{ Exception -> 0x005c }
            kme r6 = r1.b()     // Catch:{ Exception -> 0x005c }
            nle r7 = new nle     // Catch:{ Exception -> 0x005c }
            r8 = 0
            r7.<init>(r1, r4, r8)     // Catch:{ Exception -> 0x005c }
            r6.a(r7)     // Catch:{ Exception -> 0x005c }
            java.lang.String r4 = defpackage.tle.B0     // Catch:{ Exception -> 0x005c }
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x005c }
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r7, r6)     // Catch:{ Exception -> 0x005c }
            defpackage.hm9.k0(r4, r5, r13, r6)     // Catch:{ Exception -> 0x005c }
            goto L_0x00cb
        L_0x00aa:
            pke r4 = new pke
            java.lang.String r6 = r13.getMessage()
            r4.<init>(r3, r6, r5)
            r2.f(r0, r4)
            kme r0 = r1.b()
            nle r3 = new nle
            r5 = 1
            r3.<init>(r1, r4, r5)
            r0.a(r3)
            o45 r0 = r2.t0
            cba r0 = (defpackage.cba) r0
            r1 = 1
            r0.c(r13, r1)
        L_0x00cb:
            return
        L_0x00cc:
            java.lang.Object r0 = r13.X
            r2 = r0
            vi8 r2 = (defpackage.vi8) r2
            java.lang.Object r0 = r13.Y
            oh3 r0 = (defpackage.oh3) r0
            boolean r5 = r13.b
            java.lang.Object r1 = r13.c
            aj8 r1 = (defpackage.aj8) r1
            java.util.Set r3 = r1.f
            java.lang.Object r13 = r13.o
            kr6 r13 = (defpackage.kr6) r13
            r3.remove(r13)
            r8 = 0
            r9 = 1
            java.lang.ref.WeakReference r1 = r1.c     // Catch:{ all -> 0x011f }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x011f }
            r10 = r1
            bj8 r10 = (defpackage.bj8) r10     // Catch:{ all -> 0x011f }
            if (r10 != 0) goto L_0x00f5
        L_0x00f1:
            r13.c(r8)     // Catch:{ RemoteException -> 0x012a }
            goto L_0x012a
        L_0x00f5:
            oh8 r11 = new oh8     // Catch:{ all -> 0x011f }
            int r3 = r0.a     // Catch:{ all -> 0x011f }
            int r4 = r0.b     // Catch:{ all -> 0x011f }
            oj8 r6 = new oj8     // Catch:{ all -> 0x011f }
            r6.<init>(r13)     // Catch:{ all -> 0x011f }
            android.os.Bundle r7 = r0.e     // Catch:{ all -> 0x011f }
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x011f }
            qh8 r0 = r10.e(r11)     // Catch:{ Exception -> 0x0121 }
            if (r0 != 0) goto L_0x010d
            goto L_0x00f1
        L_0x010d:
            r10.a(r0)     // Catch:{ Exception -> 0x0121 }
            ii8 r0 = r0.a     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            sj8 r0 = r0.g     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r0.k(r13, r11)     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r9 = r8
            goto L_0x0127
        L_0x0119:
            r0 = move-exception
            r9 = r8
            goto L_0x012b
        L_0x011c:
            r0 = move-exception
            r9 = r8
            goto L_0x0122
        L_0x011f:
            r0 = move-exception
            goto L_0x012b
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            java.lang.String r1 = "Failed to add a session to session service"
            defpackage.z04.d0(r1, r0)     // Catch:{ all -> 0x011f }
        L_0x0127:
            if (r9 == 0) goto L_0x012a
            goto L_0x00f1
        L_0x012a:
            return
        L_0x012b:
            if (r9 == 0) goto L_0x0130
            r13.c(r8)     // Catch:{ RemoteException -> 0x0130 }
        L_0x0130:
            throw r0
        L_0x0131:
            java.lang.Object r0 = r13.c
            ue r0 = (defpackage.ue) r0
            java.lang.Object r1 = r0.e
            sh0 r1 = (defpackage.sh0) r1
            java.lang.Object r2 = r0.d
            ld8 r2 = (defpackage.ld8) r2
            jc4 r2 = (defpackage.jc4) r2
            java.lang.Object r3 = r13.X
            zw6 r3 = (defpackage.zw6) r3
            java.lang.Object r4 = r13.Y
            ui0 r4 = (defpackage.ui0) r4
            java.lang.Object r5 = r13.o
            qh8 r5 = (defpackage.qh8) r5
            sh0 r1 = r2.a(r5, r3, r1, r4)
            ii5 r2 = new ii5
            boolean r13 = r13.b
            r2.<init>(r0, r5, r1, r13)
            java.lang.Object r13 = r0.g
            a84 r13 = (defpackage.a84) r13
            r13.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd8.run():void");
    }

    public /* synthetic */ nd8(tle tle, ol olVar, boolean z, bkb bkb, lme lme) {
        this.a = 2;
        this.c = tle;
        this.o = olVar;
        this.b = z;
        this.X = bkb;
        this.Y = lme;
    }
}
