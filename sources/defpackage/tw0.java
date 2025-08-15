package defpackage;

/* renamed from: tw0  reason: default package */
public final class tw0 implements p37 {
    public static final tw0 b = new tw0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ tw0(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [od, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0180, code lost:
        if (defpackage.eae.o0(r4, "1", false) != false) goto L_0x0182;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yic a(defpackage.h8c r17) {
        /*
            r16 = this;
            r0 = r17
            r1 = 5
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = r16
            int r5 = r5.a
            switch(r5) {
                case 0: goto L_0x00c1;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r1 = r0.f
            b8c r1 = (defpackage.b8c) r1
            monitor-enter(r1)
            boolean r5 = r1.w0     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x00b3
            boolean r5 = r1.v0     // Catch:{ all -> 0x00a5 }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00a7
            boolean r5 = r1.u0     // Catch:{ all -> 0x00a5 }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0099
            monitor-exit(r1)
            v45 r5 = r1.Y
            u2a r13 = r1.A0
            r5.getClass()
            int r7 = r0.c     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            int r8 = r0.d     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            int r9 = r0.e     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            int r10 = r13.L0     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            boolean r11 = r13.Y     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            java.lang.Object r6 = r0.i     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            mhc r6 = (defpackage.mhc) r6     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            java.lang.String r6 = r6.c     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            java.lang.String r12 = "GET"
            boolean r6 = defpackage.tpa.f(r6, r12)     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            r12 = r6 ^ 1
            r6 = r5
            f8c r6 = r6.a(r7, r8, r9, r10, r11, r12)     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            u45 r6 = r6.j(r13, r0)     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            od r7 = new od
            dp3 r8 = defpackage.dp3.c
            r7.<init>()
            r7.c = r1
            r7.o = r8
            r7.X = r5
            r7.Y = r6
            f8c r5 = r6.f()
            r7.b = r5
            r1.t0 = r7
            r1.y0 = r7
            monitor-enter(r1)
            r1.u0 = r4     // Catch:{ all -> 0x0083 }
            r1.v0 = r4     // Catch:{ all -> 0x0083 }
            monitor-exit(r1)
            boolean r1 = r1.x0
            if (r1 != 0) goto L_0x007b
            r1 = 61
            h8c r1 = defpackage.h8c.c(r0, r3, r7, r2, r1)
            java.lang.Object r0 = r0.i
            mhc r0 = (defpackage.mhc) r0
            yic r0 = r1.d(r0)
            return r0
        L_0x007b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        L_0x0083:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0086:
            r0 = move-exception
            goto L_0x008a
        L_0x0088:
            r0 = move-exception
            goto L_0x0093
        L_0x008a:
            r5.b(r0)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x0093:
            java.io.IOException r1 = r0.a
            r5.b(r1)
            throw r0
        L_0x0099:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a5 }
            throw r2     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            goto L_0x00bf
        L_0x00a7:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a5 }
            throw r2     // Catch:{ all -> 0x00a5 }
        L_0x00b3:
            java.lang.String r0 = "released"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a5 }
            throw r2     // Catch:{ all -> 0x00a5 }
        L_0x00bf:
            monitor-exit(r1)
            throw r0
        L_0x00c1:
            java.lang.System.currentTimeMillis()
            y7g r5 = new y7g
            java.lang.Object r6 = r0.i
            mhc r6 = (defpackage.mhc) r6
            r5.<init>((java.lang.Object) r6, (int) r1, (java.lang.Object) r2)
            if (r6 == 0) goto L_0x00e6
            jw0 r7 = r6.a
            if (r7 != 0) goto L_0x00dd
            int r7 = defpackage.jw0.n
            cj6 r7 = r6.d
            jw0 r7 = defpackage.tpa.A(r7)
            r6.a = r7
        L_0x00dd:
            boolean r7 = r7.j
            if (r7 == 0) goto L_0x00e6
            y7g r5 = new y7g
            r5.<init>((java.lang.Object) r2, (int) r1, (java.lang.Object) r2)
        L_0x00e6:
            java.lang.Object r1 = r0.f
            b8c r1 = (defpackage.b8c) r1
            boolean r7 = r1 instanceof defpackage.b8c
            if (r7 != 0) goto L_0x00ef
            r1 = r2
        L_0x00ef:
            if (r1 == 0) goto L_0x00f3
            dp3 r1 = r1.b
        L_0x00f3:
            java.lang.Object r1 = r5.b
            mhc r1 = (defpackage.mhc) r1
            java.lang.Object r5 = r5.c
            yic r5 = (defpackage.yic) r5
            if (r1 != 0) goto L_0x0126
            if (r5 != 0) goto L_0x0126
            xic r0 = new xic
            r0.<init>()
            r0.a = r6
            sob r1 = defpackage.sob.HTTP_1_1
            r0.b = r1
            r1 = 504(0x1f8, float:7.06E-43)
            r0.c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.d = r1
            i8c r1 = defpackage.naf.c
            r0.g = r1
            r1 = -1
            r0.k = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.l = r1
            yic r0 = r0.a()
            goto L_0x0258
        L_0x0126:
            java.lang.String r6 = "cacheResponse"
            if (r1 != 0) goto L_0x013d
            xic r0 = r5.n()
            yic r1 = defpackage.pq9.a(r5)
            defpackage.xic.b(r1, r6)
            r0.i = r1
            yic r0 = r0.a()
            goto L_0x0258
        L_0x013d:
            yic r0 = r0.d(r1)
            java.lang.String r1 = "networkResponse"
            if (r5 == 0) goto L_0x023e
            r7 = 304(0x130, float:4.26E-43)
            int r8 = r0.o
            if (r8 != r7) goto L_0x0237
            xic r7 = r5.n()
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 20
            r8.<init>(r9)
            cj6 r9 = r5.Y
            int r10 = r9.size()
            r11 = r3
        L_0x015d:
            java.lang.String r12 = "Content-Type"
            java.lang.String r13 = "Content-Encoding"
            java.lang.String r14 = "Content-Length"
            cj6 r15 = r0.Y
            if (r11 >= r10) goto L_0x01bb
            java.lang.String r2 = r9.b(r11)
            java.lang.String r4 = r9.d(r11)
            java.lang.String r3 = "Warning"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0184
            java.lang.String r3 = "1"
            r16 = r9
            r9 = 0
            boolean r3 = defpackage.eae.o0(r4, r3, r9)
            if (r3 == 0) goto L_0x0186
        L_0x0182:
            r2 = 1
            goto L_0x01b4
        L_0x0184:
            r16 = r9
        L_0x0186:
            boolean r3 = r14.equalsIgnoreCase(r2)
            if (r3 != 0) goto L_0x01a5
            boolean r3 = r13.equalsIgnoreCase(r2)
            if (r3 != 0) goto L_0x01a5
            boolean r3 = r12.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0199
            goto L_0x01a5
        L_0x0199:
            boolean r3 = defpackage.pq9.t(r2)
            if (r3 == 0) goto L_0x01a5
            java.lang.String r3 = r15.a(r2)
            if (r3 != 0) goto L_0x0182
        L_0x01a5:
            r8.add(r2)
            java.lang.CharSequence r2 = defpackage.w9e.b1(r4)
            java.lang.String r2 = r2.toString()
            r8.add(r2)
            goto L_0x0182
        L_0x01b4:
            int r11 = r11 + r2
            r9 = r16
            r4 = r2
            r2 = 0
            r3 = 0
            goto L_0x015d
        L_0x01bb:
            int r2 = r15.size()
            r9 = 0
        L_0x01c0:
            if (r9 >= r2) goto L_0x01f4
            java.lang.String r3 = r15.b(r9)
            boolean r4 = r14.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x01f1
            boolean r4 = r13.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x01f1
            boolean r4 = r12.equalsIgnoreCase(r3)
            if (r4 == 0) goto L_0x01d9
            goto L_0x01f1
        L_0x01d9:
            boolean r4 = defpackage.pq9.t(r3)
            if (r4 == 0) goto L_0x01f1
            java.lang.String r4 = r15.d(r9)
            r8.add(r3)
            java.lang.CharSequence r3 = defpackage.w9e.b1(r4)
            java.lang.String r3 = r3.toString()
            r8.add(r3)
        L_0x01f1:
            r3 = 1
            int r9 = r9 + r3
            goto L_0x01c0
        L_0x01f4:
            r4 = 0
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.Object[] r2 = r8.toArray(r2)
            if (r2 == 0) goto L_0x022f
            java.lang.String[] r2 = (java.lang.String[]) r2
            bj6 r3 = new bj6
            r3.<init>()
            java.util.ArrayList r4 = r3.a
            defpackage.d63.X(r4, r2)
            r7.f = r3
            long r2 = r0.v0
            r7.k = r2
            long r2 = r0.w0
            r7.l = r2
            yic r2 = defpackage.pq9.a(r5)
            defpackage.xic.b(r2, r6)
            r7.i = r2
            yic r2 = defpackage.pq9.a(r0)
            defpackage.xic.b(r2, r1)
            r7.h = r2
            r7.a()
            i8c r0 = r0.Z
            r0.close()
            r0 = 0
            throw r0
        L_0x022f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x0237:
            i8c r2 = r5.Z
            if (r2 == 0) goto L_0x023e
            defpackage.naf.c(r2)
        L_0x023e:
            xic r2 = r0.n()
            yic r3 = defpackage.pq9.a(r5)
            defpackage.xic.b(r3, r6)
            r2.i = r3
            yic r0 = defpackage.pq9.a(r0)
            defpackage.xic.b(r0, r1)
            r2.h = r0
            yic r0 = r2.a()
        L_0x0258:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw0.a(h8c):yic");
    }
}
