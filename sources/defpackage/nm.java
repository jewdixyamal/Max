package defpackage;

import android.content.Context;

/* renamed from: nm  reason: default package */
public final /* synthetic */ class nm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ nm(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: qi8} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r2v27, types: [java.lang.Object, y8] */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x037c, code lost:
        if (r2 != null) goto L_0x0381;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x038b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 5
            r3 = 0
            r4 = 1
            r5 = 0
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x0324;
                case 1: goto L_0x02ea;
                case 2: goto L_0x022b;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00ac;
                case 6: goto L_0x0012;
                default: goto L_0x000c;
            }
        L_0x000c:
            android.content.Context r0 = r0.b
            com.my.tracker.obfuscated.h0.d(r0)
            return
        L_0x0012:
            android.content.Context r0 = r0.b
            java.lang.String r1 = defpackage.c37.q()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r3 = r0.getPackageName()     // Catch:{ Exception -> 0x00a7 }
            boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = "tracer"
            goto L_0x003f
        L_0x0025:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r4 = "tracer-"
            r3.<init>(r4)     // Catch:{ Exception -> 0x00a7 }
            r4 = 58
            r5 = 45
            java.lang.String r1 = r1.replace(r4, r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r1 = android.net.Uri.encode(r1)     // Catch:{ Exception -> 0x00a7 }
            r3.append(r1)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00a7 }
        L_0x003f:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00a7 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ Exception -> 0x00a7 }
            r3.<init>(r0, r1)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "perf-old.bin"
            java.io.File r0 = defpackage.lk5.J(r3, r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r1 = "perf-current.bin"
            java.io.File r1 = defpackage.lk5.J(r3, r1)     // Catch:{ Exception -> 0x00a7 }
            boolean r3 = r0.exists()     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x005d
            defpackage.m6d.k(r0)     // Catch:{ Exception -> 0x00a7 }
        L_0x005d:
            boolean r3 = r1.exists()     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x0077
            java.io.File r3 = r0.getParentFile()     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x006c
            defpackage.m6d.y(r3)     // Catch:{ Exception -> 0x00a7 }
        L_0x006c:
            defpackage.m6d.K(r1, r0)     // Catch:{ Exception -> 0x00a7 }
            ule r3 = new ule     // Catch:{ Exception -> 0x00a7 }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x00a7 }
            defpackage.hze.b(r3)     // Catch:{ Exception -> 0x00a7 }
        L_0x0077:
            l2a r0 = new l2a     // Catch:{ Exception -> 0x00a7 }
            r0.<init>((java.io.File) r1)     // Catch:{ Exception -> 0x00a7 }
            dze r1 = defpackage.eze.b     // Catch:{ Exception -> 0x00a7 }
            boolean r2 = r1 instanceof defpackage.bze     // Catch:{ Exception -> 0x00a7 }
            if (r2 == 0) goto L_0x009a
            bze r1 = (defpackage.bze) r1     // Catch:{ Exception -> 0x00a7 }
            java.util.LinkedList r1 = r1.a     // Catch:{ Exception -> 0x00a7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00a7 }
        L_0x008a:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00a7 }
            if (r2 == 0) goto L_0x009f
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00a7 }
            ata r2 = (defpackage.ata) r2     // Catch:{ Exception -> 0x00a7 }
            r0.d(r2)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x008a
        L_0x009a:
            dze r1 = defpackage.eze.b     // Catch:{ Exception -> 0x00a7 }
            java.util.Objects.toString(r1)     // Catch:{ Exception -> 0x00a7 }
        L_0x009f:
            cze r1 = new cze     // Catch:{ Exception -> 0x00a7 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00a7 }
            defpackage.eze.b = r1     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00ab
        L_0x00a7:
            oq9 r0 = defpackage.oq9.Z
            defpackage.eze.b = r0
        L_0x00ab:
            return
        L_0x00ac:
            cs r2 = new cs
            r2.<init>(r1)
            ob6 r1 = defpackage.f8.c
            android.content.Context r0 = r0.b
            defpackage.f8.I(r0, r2, r1, r5)
            return
        L_0x00b9:
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r12 = new java.util.concurrent.LinkedBlockingQueue
            r12.<init>()
            r7 = 0
            r8 = 1
            r9 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r11, r12)
            nm r3 = new nm
            android.content.Context r0 = r0.b
            r3.<init>(r0, r2)
            r1.execute(r3)
            return
        L_0x00d5:
            jj6 r1 = defpackage.jj6.a
            java.lang.String r1 = "HEAP_DUMP_"
            android.content.Context r0 = r0.b
            defpackage.jj6.c = r0
            java.io.File r0 = defpackage.mq9.i(r0)
            kye r2 = defpackage.kye.a
            java.util.Map r2 = defpackage.kye.c()
            o97 r6 = defpackage.pag.b
            java.lang.Object r2 = r2.get(r6)
            boolean r6 = r2 instanceof defpackage.fj6
            if (r6 == 0) goto L_0x00f4
            fj6 r2 = (defpackage.fj6) r2
            goto L_0x00f5
        L_0x00f4:
            r2 = r3
        L_0x00f5:
            if (r2 != 0) goto L_0x0102
            y8 r2 = new y8
            r2.<init>()
            fj6 r6 = new fj6
            r6.<init>(r2)
            r2 = r6
        L_0x0102:
            java.lang.String r6 = "dump-tmp.hprof"
            java.io.File r6 = defpackage.lk5.J(r0, r6)
            defpackage.jj6.a(r6)
            java.lang.String r6 = "dump-tmp-meta.json"
            java.io.File r6 = defpackage.lk5.J(r0, r6)
            defpackage.jj6.a(r6)
            boolean r2 = r2.a
            java.lang.String r6 = "dump-meta.json"
            java.lang.String r7 = "dump.hprof"
            if (r2 != 0) goto L_0x0131
            java.io.File r1 = defpackage.lk5.J(r0, r7)
            defpackage.jj6.a(r1)
            java.io.File r0 = defpackage.lk5.J(r0, r6)
            defpackage.jj6.a(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.jj6.b
            r0.set(r5)
            goto L_0x022a
        L_0x0131:
            rd3 r0 = new rd3
            r0.<init>(r4)
            defpackage.s36.y(r0)
            java.lang.String r0 = "Dump from different buildUuid. Current "
            android.content.Context r2 = defpackage.jj6.c
            if (r2 != 0) goto L_0x0141
            goto L_0x022a
        L_0x0141:
            java.io.File r5 = defpackage.mq9.i(r2)
            java.io.File r7 = defpackage.lk5.J(r5, r7)
            java.io.File r5 = defpackage.lk5.J(r5, r6)
            boolean r6 = r7.exists()
            if (r6 != 0) goto L_0x015b
            boolean r6 = r5.exists()
            if (r6 != 0) goto L_0x015b
            goto L_0x022a
        L_0x015b:
            java.lang.String r6 = defpackage.lk5.I(r5)     // Catch:{ Exception -> 0x0224 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x021d }
            r8.<init>((java.lang.String) r6)     // Catch:{ Exception -> 0x021d }
            java.lang.String r6 = "buildUuid"
            java.lang.String r6 = r8.optString(r6)     // Catch:{ Exception -> 0x021d }
            boolean r9 = defpackage.w9e.C0(r6)     // Catch:{ Exception -> 0x021d }
            r9 = r9 ^ r4
            if (r9 == 0) goto L_0x0172
            goto L_0x0173
        L_0x0172:
            r6 = r3
        L_0x0173:
            java.lang.String r9 = "tag"
            java.lang.String r8 = r8.optString(r9)     // Catch:{ Exception -> 0x021d }
            boolean r9 = defpackage.w9e.C0(r8)     // Catch:{ Exception -> 0x021d }
            r9 = r9 ^ r4
            if (r9 == 0) goto L_0x0181
            goto L_0x0182
        L_0x0181:
            r8 = r3
        L_0x0182:
            defpackage.m6d.k(r5)     // Catch:{ Exception -> 0x0224 }
            qi8 r9 = defpackage.kye.c     // Catch:{ Exception -> 0x0224 }
            if (r9 == 0) goto L_0x018a
            r3 = r9
        L_0x018a:
            java.lang.Object r3 = r3.c     // Catch:{ Exception -> 0x0224 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0224 }
            boolean r9 = defpackage.tpa.f(r6, r3)     // Catch:{ Exception -> 0x0224 }
            if (r9 == 0) goto L_0x01ff
            java.lang.String r0 = ".bin"
            java.io.File r3 = defpackage.mq9.i(r2)     // Catch:{ Exception -> 0x0224 }
            defpackage.m6d.y(r3)     // Catch:{ Exception -> 0x0224 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0224 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x0224 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0224 }
            r6.append(r9)     // Catch:{ Exception -> 0x0224 }
            r6.append(r0)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0224 }
            java.io.File r0 = defpackage.lk5.J(r3, r0)     // Catch:{ Exception -> 0x0224 }
            defpackage.m6d.K(r7, r0)     // Catch:{ Exception -> 0x0224 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x0224 }
            r1.<init>()     // Catch:{ Exception -> 0x0224 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0224 }
            java.lang.String r3 = "param_dump_path"
            r1.put(r3, r0)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r0 = "param_tag"
            r1.put(r0, r8)     // Catch:{ Exception -> 0x0224 }
            d24 r0 = new d24     // Catch:{ Exception -> 0x0224 }
            r0.<init>((java.util.Map) r1)     // Catch:{ Exception -> 0x0224 }
            defpackage.d24.f(r0)     // Catch:{ Exception -> 0x0224 }
            qla r1 = new qla     // Catch:{ Exception -> 0x0224 }
            java.lang.Class<ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker> r3 = ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker.class
            r1.<init>(r3)     // Catch:{ Exception -> 0x0224 }
            androidx.work.WorkRequest$Builder r0 = r1.setInputData(r0)     // Catch:{ Exception -> 0x0224 }
            qla r0 = (defpackage.qla) r0     // Catch:{ Exception -> 0x0224 }
            androidx.work.WorkRequest r0 = r0.build()     // Catch:{ Exception -> 0x0224 }
            rla r0 = (defpackage.rla) r0     // Catch:{ Exception -> 0x0224 }
            khe r1 = defpackage.hze.a     // Catch:{ Exception -> 0x0224 }
            vs5 r1 = new vs5     // Catch:{ Exception -> 0x0224 }
            r1.<init>(r2, r4, r0)     // Catch:{ Exception -> 0x0224 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x0224 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0224 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0224 }
            i40 r2 = new i40     // Catch:{ Exception -> 0x0224 }
            r3 = 6
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x0224 }
            r0.post(r2)     // Catch:{ Exception -> 0x0224 }
            goto L_0x022a
        L_0x01ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0224 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0224 }
            r1.append(r3)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r0 = " != "
            r1.append(r0)     // Catch:{ Exception -> 0x0224 }
            r1.append(r6)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0224 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0224 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0224 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0224 }
            throw r1     // Catch:{ Exception -> 0x0224 }
        L_0x021d:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0224 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0224 }
            throw r1     // Catch:{ Exception -> 0x0224 }
        L_0x0224:
            defpackage.jj6.a(r7)
            defpackage.jj6.a(r5)
        L_0x022a:
            return
        L_0x022b:
            android.content.Context r0 = r0.b
            defpackage.pq9.t0 = r0
            kye r0 = defpackage.kye.a
            java.util.Map r0 = defpackage.kye.c()
            o97 r2 = defpackage.oag.a
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof defpackage.fl4
            if (r2 == 0) goto L_0x0242
            fl4 r0 = (defpackage.fl4) r0
            goto L_0x0243
        L_0x0242:
            r0 = r3
        L_0x0243:
            if (r0 != 0) goto L_0x0252
            sy4 r0 = new sy4
            r2 = 13
            r0.<init>((int) r2, (boolean) r5)
            fl4 r2 = new fl4
            r2.<init>(r0)
            r0 = r2
        L_0x0252:
            boolean r0 = r0.a
            java.lang.String r2 = "tracer.disk.usage.worker"
            if (r0 != 0) goto L_0x0271
            android.content.Context r0 = defpackage.pq9.t0
            if (r0 != 0) goto L_0x025d
            goto L_0x025e
        L_0x025d:
            r3 = r0
        L_0x025e:
            s7g r0 = defpackage.s7g.d(r3)
            r0.getClass()
            my1 r1 = new my1
            r1.<init>(r0, r2, r4)
            wne r0 = r0.d
            r0.l(r1)
            goto L_0x02e9
        L_0x0271:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Map r4 = defpackage.kye.c()
            o97 r5 = defpackage.ote.b
            java.lang.Object r4 = r4.get(r5)
            boolean r5 = r4 instanceof defpackage.gx3
            if (r5 == 0) goto L_0x0287
            gx3 r4 = (defpackage.gx3) r4
            goto L_0x0288
        L_0x0287:
            r4 = r3
        L_0x0288:
            if (r4 != 0) goto L_0x0294
            ph4 r4 = new ph4
            r5 = 14
            r4.<init>((int) r5)
            r4.f()
        L_0x0294:
            java.util.Set r16 = defpackage.x53.H0(r0)
            kj3 r0 = new kj3
            r12 = -1
            r14 = -1
            r7 = 3
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r5 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "probability"
            r4.put(r6, r5)
            d24 r5 = new d24
            r5.<init>((java.util.Map) r4)
            defpackage.d24.f(r5)
            lta r4 = new lta
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            java.lang.Class<ru.ok.tracer.disk.usage.DiskUsageWorker> r7 = ru.ok.tracer.disk.usage.DiskUsageWorker.class
            r8 = 1
            r4.<init>(r7, r8, r6)
            androidx.work.WorkRequest$Builder r4 = r4.setInputData(r5)
            lta r4 = (defpackage.lta) r4
            androidx.work.WorkRequest$Builder r0 = r4.setConstraints(r0)
            lta r0 = (defpackage.lta) r0
            androidx.work.WorkRequest r0 = r0.build()
            mta r0 = (defpackage.mta) r0
            android.content.Context r4 = defpackage.pq9.t0
            if (r4 != 0) goto L_0x02e1
            goto L_0x02e2
        L_0x02e1:
            r3 = r4
        L_0x02e2:
            s7g r3 = defpackage.s7g.d(r3)
            r3.b(r2, r1, r0)
        L_0x02e9:
            return
        L_0x02ea:
            s08 r1 = new s08
            android.content.Context r0 = r0.b
            r1.<init>(r0)
            int r2 = defpackage.jpc.f3
            oc r3 = r1.a
            android.content.Context r4 = r3.a
            java.lang.CharSequence r2 = r4.getText(r2)
            r3.d = r2
            int r2 = defpackage.jpc.c
            r1.b(r2)
            int r2 = defpackage.jpc.Y1
            d10 r3 = new d10
            r3.<init>(r5, r0)
            s08 r0 = r1.d(r2, r3)
            int r1 = defpackage.jpc.r
            e10 r2 = new e10
            r2.<init>(r5)
            oc r3 = r0.a
            android.content.Context r4 = r3.a
            java.lang.CharSequence r1 = r4.getText(r1)
            r3.k = r1
            r3.l = r2
            r0.a()
            return
        L_0x0324:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x03a3
            android.content.ComponentName r5 = new android.content.ComponentName
            android.content.Context r0 = r0.b
            java.lang.String r6 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r5.<init>(r0, r6)
            android.content.pm.PackageManager r6 = r0.getPackageManager()
            int r6 = r6.getComponentEnabledSetting(r5)
            if (r6 == r4) goto L_0x03a3
            java.lang.String r6 = "locale"
            if (r1 < r2) goto L_0x037a
            xs r1 = defpackage.rm.Z
            r1.getClass()
            qs r2 = new qs
            r2.<init>((defpackage.xs) r1)
        L_0x034b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0369
            java.lang.Object r1 = r2.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            rm r1 = (defpackage.rm) r1
            if (r1 == 0) goto L_0x034b
            dn r1 = (defpackage.dn) r1
            android.content.Context r1 = r1.v0
            if (r1 == 0) goto L_0x034b
            java.lang.Object r3 = r1.getSystemService(r6)
        L_0x0369:
            if (r3 == 0) goto L_0x037f
            android.os.LocaleList r1 = defpackage.pm.a(r3)
            yq7 r2 = new yq7
            zq7 r3 = new zq7
            r3.<init>(r1)
            r2.<init>(r3)
            goto L_0x0381
        L_0x037a:
            yq7 r2 = defpackage.rm.c
            if (r2 == 0) goto L_0x037f
            goto L_0x0381
        L_0x037f:
            yq7 r2 = defpackage.yq7.b
        L_0x0381:
            zq7 r1 = r2.a
            android.os.LocaleList r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x039c
            java.lang.String r1 = defpackage.od2.Q(r0)
            java.lang.Object r2 = r0.getSystemService(r6)
            if (r2 == 0) goto L_0x039c
            android.os.LocaleList r1 = defpackage.om.a(r1)
            defpackage.pm.b(r2, r1)
        L_0x039c:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r0.setComponentEnabledSetting(r5, r4, r4)
        L_0x03a3:
            defpackage.rm.Y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm.run():void");
    }
}
