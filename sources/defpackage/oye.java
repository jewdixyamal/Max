package defpackage;

import android.content.Context;

/* renamed from: oye  reason: default package */
public final /* synthetic */ class oye implements Runnable {
    public final /* synthetic */ zs7 X;
    public final /* synthetic */ sy4 Y;
    public final /* synthetic */ ik Z;
    public final /* synthetic */ sy3 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ kbd c;
    public final /* synthetic */ pje o;
    public final /* synthetic */ lbd s0;
    public final /* synthetic */ o84 t0;

    public /* synthetic */ oye(sy3 sy3, Context context, kbd kbd, pje pje, zs7 zs7, sy4 sy4, ik ikVar, lbd lbd, o84 o84) {
        this.a = sy3;
        this.b = context;
        this.c = kbd;
        this.o = pje;
        this.X = zs7;
        this.Y = sy4;
        this.Z = ikVar;
        this.s0 = lbd;
        this.t0 = o84;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03bb A[SYNTHETIC, Splitter:B:197:0x03bb] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0269 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0113 A[Catch:{ all -> 0x0176 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r0 = r32
            r3 = 1
            sy3 r4 = r0.a
            android.content.Context r5 = r0.b
            kbd r6 = r0.c
            pje r7 = r0.o
            zs7 r8 = r0.X
            sy4 r15 = r0.Y
            ik r14 = r0.Z
            lbd r13 = r0.s0
            o84 r12 = r0.t0
            nz4 r16 = defpackage.nz4.a
            boolean r0 = r4.b
            java.lang.String r17 = "Cannot get prev tags after clear"
            java.lang.String r18 = "Cannot get prev logs after clear"
            r10 = 0
            if (r0 == 0) goto L_0x0277
            int r0 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r0 >= r9) goto L_0x0028
            goto L_0x0277
        L_0x0028:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getHistoricalProcessExitReasons((java.lang.String) null, 0, 0)     // Catch:{ Exception -> 0x0277 }
            java.lang.String r9 = defpackage.c37.q()
            java.util.Iterator r21 = r0.iterator()
        L_0x003c:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x0277
            java.lang.Object r0 = r21.next()
            android.app.ApplicationExitInfo r22 = defpackage.c4.e(r0)
            int r0 = r22.getReason()
            r2 = 6
            if (r0 == r2) goto L_0x0052
            goto L_0x003c
        L_0x0052:
            java.lang.String r0 = r22.getProcessName()
            boolean r0 = defpackage.tpa.f(r0, r9)
            if (r0 != 0) goto L_0x0060
            r22.getProcessName()
            goto L_0x003c
        L_0x0060:
            r6.b()
            long r1 = r6.g
            long r25 = r22.getTimestamp()
            int r0 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            r22.getTimestamp()
            goto L_0x003c
        L_0x0071:
            java.io.InputStream r0 = r22.getTraceInputStream()     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x0097
            java.nio.charset.Charset r1 = defpackage.a52.a     // Catch:{ Exception -> 0x0097 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0097 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0097 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0097 }
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r0 = defpackage.m6d.H(r1)     // Catch:{ all -> 0x008d }
            defpackage.v3c.i(r1, r10)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0098
        L_0x008d:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            r25 = r0
            defpackage.v3c.i(r1, r2)     // Catch:{ Exception -> 0x0097 }
            throw r25     // Catch:{ Exception -> 0x0097 }
        L_0x0097:
            r0 = r10
        L_0x0098:
            if (r0 == 0) goto L_0x00a0
            int r1 = r0.length()
            if (r1 != 0) goto L_0x00ac
        L_0x00a0:
            r20 = r9
            r19 = r12
            r1 = r13
            r24 = r14
            r2 = 3
            r23 = -1
            goto L_0x0273
        L_0x00ac:
            r22.getTimestamp()
            r6.b()
            yie r1 = r6.h
            if (r1 != 0) goto L_0x00b7
            goto L_0x003c
        L_0x00b7:
            long r25 = r22.getTimestamp()
            java.io.File r2 = r14.a()
            boolean r22 = r2.exists()
            if (r22 == 0) goto L_0x00cb
            boolean r22 = r2.isDirectory()
            if (r22 != 0) goto L_0x00d5
        L_0x00cb:
            r27 = r9
            r30 = r12
            r31 = r13
            r23 = -1
            goto L_0x01a2
        L_0x00d5:
            java.io.File[] r10 = r2.listFiles()     // Catch:{ all -> 0x0182 }
            if (r10 == 0) goto L_0x018b
            r11 = r10
            java.lang.Comparable[] r11 = (java.lang.Comparable[]) r11     // Catch:{ all -> 0x0182 }
            r27 = r9
            int r9 = r11.length     // Catch:{ all -> 0x0184 }
            if (r9 <= r3) goto L_0x00e6
            java.util.Arrays.sort(r11)     // Catch:{ all -> 0x0184 }
        L_0x00e6:
            int r9 = r10.length     // Catch:{ all -> 0x0184 }
            r11 = 2
            int r9 = r9 / r11
            int r9 = r9 - r3
            if (r9 >= 0) goto L_0x00ef
        L_0x00ec:
            r23 = -1
            goto L_0x010b
        L_0x00ef:
            int r11 = r10.length     // Catch:{ all -> 0x0184 }
            int r11 = r11 - r3
            if (r9 < 0) goto L_0x00ec
            r3 = 0
        L_0x00f4:
            r22 = r10[r3]     // Catch:{ all -> 0x0107 }
            r28 = r10[r11]     // Catch:{ all -> 0x0107 }
            r10[r3] = r28     // Catch:{ all -> 0x0107 }
            r10[r11] = r22     // Catch:{ all -> 0x0107 }
            r23 = -1
            int r11 = r11 + -1
            if (r3 == r9) goto L_0x010b
            r22 = 1
            int r3 = r3 + 1
            goto L_0x00f4
        L_0x0107:
            r23 = -1
            goto L_0x0176
        L_0x010b:
            kl7 r3 = defpackage.j1e.l()     // Catch:{ all -> 0x0176 }
            int r9 = r10.length     // Catch:{ all -> 0x0176 }
            r11 = 0
        L_0x0111:
            if (r11 >= r9) goto L_0x0179
            r22 = r10[r11]     // Catch:{ all -> 0x0176 }
            r28 = r9
            java.lang.String r9 = r22.getName()     // Catch:{ all -> 0x0176 }
            r29 = r10
            qec r10 = defpackage.ik.b     // Catch:{ all -> 0x0176 }
            java.util.regex.Pattern r10 = r10.a     // Catch:{ all -> 0x0176 }
            java.util.regex.Matcher r9 = r10.matcher(r9)     // Catch:{ all -> 0x0176 }
            boolean r10 = r9.matches()     // Catch:{ all -> 0x0176 }
            if (r10 != 0) goto L_0x012f
            r30 = r12
            r10 = 0
            goto L_0x0138
        L_0x012f:
            qz7 r10 = new qz7     // Catch:{ all -> 0x0176 }
            r30 = r12
            r12 = 24
            r10.<init>((int) r12, (java.lang.Object) r9)     // Catch:{ all -> 0x0173 }
        L_0x0138:
            if (r10 != 0) goto L_0x013e
            r31 = r13
        L_0x013c:
            r9 = 1
            goto L_0x0169
        L_0x013e:
            java.lang.Object r9 = r10.c     // Catch:{ all -> 0x0173 }
            r08 r9 = (defpackage.r08) r9     // Catch:{ all -> 0x0173 }
            if (r9 != 0) goto L_0x014b
            r08 r9 = new r08     // Catch:{ all -> 0x0173 }
            r9.<init>((defpackage.qz7) r10)     // Catch:{ all -> 0x0173 }
            r10.c = r9     // Catch:{ all -> 0x0173 }
        L_0x014b:
            java.lang.Object r9 = r10.c     // Catch:{ all -> 0x0173 }
            r08 r9 = (defpackage.r08) r9     // Catch:{ all -> 0x0173 }
            r10 = 1
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0173 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0173 }
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ all -> 0x0173 }
            hk r12 = new hk     // Catch:{ all -> 0x0173 }
            r31 = r13
            java.lang.String r13 = defpackage.lk5.I(r22)     // Catch:{ all -> 0x019f }
            r12.<init>(r9, r13)     // Catch:{ all -> 0x019f }
            r3.add(r12)     // Catch:{ all -> 0x019f }
            goto L_0x013c
        L_0x0169:
            int r11 = r11 + r9
            r9 = r28
            r10 = r29
            r12 = r30
            r13 = r31
            goto L_0x0111
        L_0x0173:
            r31 = r13
            goto L_0x019f
        L_0x0176:
            r30 = r12
            goto L_0x0173
        L_0x0179:
            r30 = r12
            r31 = r13
            kl7 r2 = defpackage.j1e.d(r3)     // Catch:{ all -> 0x019f }
            goto L_0x01a4
        L_0x0182:
            r27 = r9
        L_0x0184:
            r30 = r12
            r31 = r13
            r23 = -1
            goto L_0x019f
        L_0x018b:
            r27 = r9
            r30 = r12
            r31 = r13
            r23 = -1
            java.lang.String r3 = "Required value was null."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x019f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x019f }
            r9.<init>(r3)     // Catch:{ all -> 0x019f }
            throw r9     // Catch:{ all -> 0x019f }
        L_0x019f:
            defpackage.lk5.F(r2)
        L_0x01a2:
            r2 = r16
        L_0x01a4:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x01af
            r10 = 10
            r11 = 4
            goto L_0x0228
        L_0x01af:
            java.lang.String r3 = "\nDALVIK THREADS"
            r9 = 6
            r10 = 0
            int r3 = defpackage.w9e.A0(r0, r3, r10, r10, r9)
            if (r3 >= 0) goto L_0x01bd
            r3 = r23
            r11 = 4
            goto L_0x01df
        L_0x01bd:
            java.lang.String r9 = "\n\"main\""
            r11 = 4
            int r9 = defpackage.w9e.A0(r0, r9, r3, r10, r11)
            if (r9 >= 0) goto L_0x01d5
            r12 = 1
            int r3 = r3 + r12
            java.lang.String r9 = "\n"
            int r3 = defpackage.w9e.A0(r0, r9, r3, r10, r11)
            if (r3 >= 0) goto L_0x01d3
            r3 = r23
            goto L_0x01df
        L_0x01d3:
            int r3 = r3 + r12
            goto L_0x01df
        L_0x01d5:
            r12 = 1
            int r9 = r9 + r12
            java.lang.String r3 = "\n\n\""
            int r3 = defpackage.w9e.A0(r0, r3, r9, r10, r11)
            r9 = 2
            int r3 = r3 + r9
        L_0x01df:
            if (r3 >= 0) goto L_0x01e4
            r10 = 10
            goto L_0x0228
        L_0x01e4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0, r10, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x01f0:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0218
            java.lang.Object r10 = r2.next()
            hk r10 = (defpackage.hk) r10
            java.lang.String r12 = "\"SNAPSHOT main\" tid=1 ("
            r9.append(r12)
            long r12 = r10.a
            long r12 = r25 - r12
            r9.append(r12)
            java.lang.String r12 = "ms before)\n"
            r9.append(r12)
            java.lang.String r10 = r10.b
            r9.append(r10)
            r10 = 10
            r9.append(r10)
            goto L_0x01f0
        L_0x0218:
            r10 = 10
            r9.append(r10)
            int r2 = r0.length()
            r9.append(r0, r3, r2)
            java.lang.String r0 = r9.toString()
        L_0x0228:
            java.nio.charset.Charset r2 = defpackage.a52.a
            byte[] r0 = r0.getBytes(r2)
            r2 = 3
            r8.a(r2)
            hs r3 = r8.d
            if (r3 == 0) goto L_0x0269
            r12 = 2
            r7.a(r12)
            java.util.List r13 = r7.d
            if (r13 == 0) goto L_0x025f
            r19 = 10
            r20 = r27
            r9 = r15
            r10 = r19
            r11 = r0
            r19 = r30
            r12 = r1
            r1 = r31
            r24 = r14
            r14 = r3
            r9.O(r10, r11, r12, r13, defpackage.oz4.a, r14)
            r6.g(r2)
        L_0x0254:
            r13 = r1
            r12 = r19
            r9 = r20
            r14 = r24
            r3 = 1
            r10 = 0
            goto L_0x003c
        L_0x025f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0269:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r18.toString()
            r0.<init>(r1)
            throw r0
        L_0x0273:
            r22.getDescription()
            goto L_0x0254
        L_0x0277:
            r19 = r12
            r1 = r13
            r2 = 3
            boolean r0 = r4.a
            r3 = 45
            r4 = 58
            java.lang.String r14 = "tracer-"
            java.lang.String r20 = "tracer"
            if (r0 == 0) goto L_0x0344
            java.lang.String r0 = defpackage.c37.q()
            java.lang.String r9 = r5.getPackageName()
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x0298
            r0 = r20
            goto L_0x02ac
        L_0x0298:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r14)
            java.lang.String r0 = r0.replace(r4, r3)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
        L_0x02ac:
            java.io.File r9 = new java.io.File
            java.io.File r5 = r5.getCacheDir()
            r9.<init>(r5, r0)
            java.lang.String r0 = "minidump"
            java.io.File r0 = defpackage.lk5.J(r9, r0)
            boolean r5 = r0.exists()
            if (r5 != 0) goto L_0x02c3
            goto L_0x0344
        L_0x02c3:
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x0344
            int r5 = r0.length
            if (r5 != 0) goto L_0x02ce
            goto L_0x0344
        L_0x02ce:
            r6.b()
            yie r5 = r6.h
            if (r5 != 0) goto L_0x02d7
            goto L_0x0344
        L_0x02d7:
            int r13 = r0.length
            r12 = 0
        L_0x02d9:
            if (r12 >= r13) goto L_0x0344
            r9 = r0[r12]
            byte[] r11 = defpackage.lk5.G(r9)     // Catch:{ Exception -> 0x0332 }
            defpackage.m6d.k(r9)     // Catch:{ Exception -> 0x0332 }
            int r10 = r11.length
            if (r10 != 0) goto L_0x02f4
            r9.toString()
            r21 = r12
            r24 = r13
            r3 = r14
            r2 = 4
            r9 = 1
            r23 = 2
            goto L_0x033b
        L_0x02f4:
            r10 = 2
            r7.a(r10)
            java.util.List r9 = r7.d
            if (r9 == 0) goto L_0x0328
            r8.a(r2)
            hs r2 = r8.d
            if (r2 == 0) goto L_0x031e
            r21 = 9
            r22 = r9
            r9 = r15
            r23 = r10
            r10 = r21
            r21 = r12
            r12 = r5
            r24 = r13
            r13 = r22
            r3 = r14
            r14 = r2
            r9.O(r10, r11, r12, r13, defpackage.oz4.a, r14)
            r2 = 4
            r6.g(r2)
        L_0x031c:
            r9 = 1
            goto L_0x033b
        L_0x031e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r18.toString()
            r0.<init>(r1)
            throw r0
        L_0x0328:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0332:
            r21 = r12
            r24 = r13
            r3 = r14
            r2 = 4
            r23 = 2
            goto L_0x031c
        L_0x033b:
            int r12 = r21 + 1
            r14 = r3
            r13 = r24
            r2 = 3
            r3 = 45
            goto L_0x02d9
        L_0x0344:
            r3 = r14
            r2 = 4
            kye r0 = defpackage.kye.a
            java.util.Map r0 = defpackage.kye.c()
            o97 r5 = defpackage.f8.b
            java.lang.Object r0 = r0.get(r5)
            boolean r9 = r0 instanceof defpackage.ry3
            if (r9 == 0) goto L_0x035a
            r10 = r0
            ry3 r10 = (defpackage.ry3) r10
            goto L_0x035b
        L_0x035a:
            r10 = 0
        L_0x035b:
            if (r10 != 0) goto L_0x036a
            qqd r0 = new qqd
            r9 = 8
            r10 = 0
            r0.<init>((int) r9, (byte) r10)
            ry3 r10 = new ry3
            r10.<init>(r0)
        L_0x036a:
            boolean r0 = r10.a
            if (r0 == 0) goto L_0x03bf
            r6.b()
            yie r0 = r6.h
            if (r0 == 0) goto L_0x03bf
            boolean r5 = defpackage.dp3.b(r5)
            if (r5 == 0) goto L_0x0380
            r5 = r16
        L_0x037d:
            r10 = 10
            goto L_0x03b3
        L_0x0380:
            r6.b()
            java.util.List r5 = r6.j
            r9 = 1
            java.util.List r5 = defpackage.x53.d0(r9, r5)
            boolean r9 = r5.isEmpty()
            if (r9 == 0) goto L_0x0391
            goto L_0x037d
        L_0x0391:
            int r9 = r5.size()
            r10 = 10
            if (r9 < r10) goto L_0x039a
            goto L_0x03b3
        L_0x039a:
            r6.b()
            long r11 = r6.i
            long r13 = java.lang.System.currentTimeMillis()
            r9 = 14400000(0xdbba00, float:2.0178698E-38)
            r18 = r5
            long r4 = (long) r9
            long r11 = r11 + r4
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x03b1
            r5 = r18
            goto L_0x03b3
        L_0x03b1:
            r5 = r16
        L_0x03b3:
            boolean r4 = r5.isEmpty()
            r9 = 1
            r4 = r4 ^ r9
            if (r4 == 0) goto L_0x03c1
            r1.a(r0, r5, r6)     // Catch:{ Exception -> 0x03c1 }
            goto L_0x03c1
        L_0x03bf:
            r10 = 10
        L_0x03c1:
            boolean r0 = defpackage.kye.b
            java.lang.Object r1 = r15.b
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r4 = "crashes"
            if (r0 == 0) goto L_0x040f
            java.lang.String r0 = defpackage.c37.q()
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x03dc
        L_0x03d9:
            r0 = r20
            goto L_0x03f5
        L_0x03dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r3 = 45
            r5 = 58
            java.lang.String r0 = r0.replace(r5, r3)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r2.append(r0)
            java.lang.String r20 = r2.toString()
            goto L_0x03d9
        L_0x03f5:
            java.io.File r2 = new java.io.File
            java.io.File r1 = r1.getCacheDir()
            r2.<init>(r1, r0)
            java.io.File r0 = defpackage.lk5.J(r2, r4)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x040a
            goto L_0x0502
        L_0x040a:
            defpackage.lk5.F(r0)
            goto L_0x0502
        L_0x040f:
            java.lang.String r0 = defpackage.c37.q()
            java.lang.String r5 = r1.getPackageName()
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0420
        L_0x041d:
            r0 = r20
            goto L_0x0439
        L_0x0420:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r3 = 45
            r6 = 58
            java.lang.String r0 = r0.replace(r6, r3)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r5.append(r0)
            java.lang.String r20 = r5.toString()
            goto L_0x041d
        L_0x0439:
            java.io.File r3 = new java.io.File
            java.io.File r1 = r1.getCacheDir()
            r3.<init>(r1, r0)
            java.io.File r0 = defpackage.lk5.J(r3, r4)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x044e
            goto L_0x04ed
        L_0x044e:
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x04ed
            int r1 = r0.length
            if (r1 != 0) goto L_0x0459
            goto L_0x04ed
        L_0x0459:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x0460:
            if (r4 >= r3) goto L_0x046e
            r5 = r0[r4]
            qy3 r5 = defpackage.sy4.L(r5)     // Catch:{ Exception -> 0x046b }
            r1.add(r5)     // Catch:{ Exception -> 0x046b }
        L_0x046b:
            r5 = 1
            int r4 = r4 + r5
            goto L_0x0460
        L_0x046e:
            r5 = 1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0477
            goto L_0x04ed
        L_0x0477:
            long r3 = java.lang.System.currentTimeMillis()
            r11 = 14400000(0xdbba00, double:7.1145453E-317)
            long r3 = r3 - r11
            int r0 = r1.size()
            if (r0 <= r5) goto L_0x048f
            fs4 r0 = new fs4
            r5 = 21
            r0.<init>(r5)
            defpackage.c63.U(r1, r0)
        L_0x048f:
            int r0 = r1.size()
            java.lang.String r5 = "List is empty."
            if (r0 <= r10) goto L_0x04b8
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04b2
            r6 = 0
            java.lang.Object r0 = r1.remove(r6)
            qy3 r0 = (defpackage.qy3) r0
            r0.getClass()
            java.io.File r5 = new java.io.File
            java.lang.String r0 = r0.c
            r5.<init>(r0)
            defpackage.lk5.F(r5)
            goto L_0x048f
        L_0x04b2:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r5)
            throw r0
        L_0x04b8:
            java.lang.Object r0 = defpackage.x53.g0(r1)
            qy3 r0 = (defpackage.qy3) r0
            long r9 = r0.a
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x04eb
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04e5
            r6 = 0
            java.lang.Object r0 = r1.remove(r6)
            qy3 r0 = (defpackage.qy3) r0
            r0.getClass()
            java.io.File r9 = new java.io.File
            java.lang.String r0 = r0.c
            r9.<init>(r0)
            defpackage.lk5.F(r9)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x04b8
            goto L_0x04eb
        L_0x04e5:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r5)
            throw r0
        L_0x04eb:
            r16 = r1
        L_0x04ed:
            boolean r0 = r16.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x04fb
            r19.getClass()
            defpackage.o84.o(r16)
        L_0x04fb:
            r8.a(r2)
            r1 = 3
            r7.a(r1)
        L_0x0502:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oye.run():void");
    }
}
