package defpackage;

/* renamed from: ule  reason: default package */
public final /* synthetic */ class ule implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ule(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0260, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        defpackage.v3c.i(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0264, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r0 = 1021(0x3fd, float:1.431E-42)
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = r12.a
            switch(r4) {
                case 0: goto L_0x042c;
                case 1: goto L_0x0424;
                case 2: goto L_0x041a;
                case 3: goto L_0x0410;
                case 4: goto L_0x03e3;
                case 5: goto L_0x0221;
                case 6: goto L_0x01ff;
                case 7: goto L_0x01f7;
                case 8: goto L_0x01ef;
                case 9: goto L_0x01e7;
                case 10: goto L_0x01df;
                case 11: goto L_0x01d3;
                case 12: goto L_0x01cb;
                case 13: goto L_0x01c3;
                case 14: goto L_0x019e;
                case 15: goto L_0x0178;
                case 16: goto L_0x011a;
                case 17: goto L_0x00de;
                case 18: goto L_0x00cf;
                case 19: goto L_0x00b9;
                case 20: goto L_0x00a1;
                case 21: goto L_0x008d;
                case 22: goto L_0x0085;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.String r0 = "x"
            java.lang.String r1 = "OKRTCLmsAdapter"
            java.lang.String r2 = "Screen size did change"
            java.lang.Object r12 = r12.b
            gwe r12 = (defpackage.gwe) r12
            java.lang.Object r12 = r12.b
            m5d r12 = (defpackage.m5d) r12
            java.lang.Object r3 = r12.b
            nq7 r3 = (defpackage.nq7) r3
            java.lang.Object r4 = r12.X
            kq7 r4 = (defpackage.kq7) r4
            if (r3 != 0) goto L_0x0023
            goto L_0x0084
        L_0x0023:
            r4.e()     // Catch:{ all -> 0x0037 }
            org.webrtc.Size r3 = r4.B
            android.util.DisplayMetrics r5 = r4.A
            int r6 = r5.widthPixels     // Catch:{ all -> 0x0037 }
            int r7 = r3.width     // Catch:{ all -> 0x0037 }
            if (r6 != r7) goto L_0x0039
            int r6 = r5.heightPixels     // Catch:{ all -> 0x0037 }
            int r7 = r3.height     // Catch:{ all -> 0x0037 }
            if (r6 == r7) goto L_0x007d
            goto L_0x0039
        L_0x0037:
            r0 = move-exception
            goto L_0x0076
        L_0x0039:
            a4c r6 = r4.n     // Catch:{ all -> 0x0037 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r7.<init>(r2)     // Catch:{ all -> 0x0037 }
            int r2 = r3.width     // Catch:{ all -> 0x0037 }
            r7.append(r2)     // Catch:{ all -> 0x0037 }
            r7.append(r0)     // Catch:{ all -> 0x0037 }
            int r2 = r3.height     // Catch:{ all -> 0x0037 }
            r7.append(r2)     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "->"
            r7.append(r2)     // Catch:{ all -> 0x0037 }
            int r2 = r5.widthPixels     // Catch:{ all -> 0x0037 }
            r7.append(r2)     // Catch:{ all -> 0x0037 }
            r7.append(r0)     // Catch:{ all -> 0x0037 }
            int r0 = r5.heightPixels     // Catch:{ all -> 0x0037 }
            r7.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0037 }
            r6.log(r1, r0)     // Catch:{ all -> 0x0037 }
            int r0 = r5.widthPixels     // Catch:{ all -> 0x0037 }
            r3.width = r0     // Catch:{ all -> 0x0037 }
            int r2 = r5.heightPixels     // Catch:{ all -> 0x0037 }
            r3.height = r2     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = r12.b     // Catch:{ all -> 0x0037 }
            nq7 r3 = (defpackage.nq7) r3     // Catch:{ all -> 0x0037 }
            r3.a(r0, r2)     // Catch:{ all -> 0x0037 }
            goto L_0x007d
        L_0x0076:
            a4c r2 = r4.n
            java.lang.String r3 = "Error on screen share size update"
            r2.reportException(r1, r3, r0)
        L_0x007d:
            java.lang.Object r12 = r12.b
            nq7 r12 = (defpackage.nq7) r12
            r4.b(r12)
        L_0x0084:
            return
        L_0x0085:
            java.lang.Object r12 = r12.b
            com.my.tracker.obfuscated.f0 r12 = (com.my.tracker.obfuscated.f0) r12
            r12.a()
            return
        L_0x008d:
            java.lang.Object r12 = r12.b
            vbg r12 = (defpackage.vbg) r12
            t54 r0 = r12.g
            if (r0 != 0) goto L_0x0096
            goto L_0x009d
        L_0x0096:
            r0.a()
            r12.g = r3
            r12.D = r1
        L_0x009d:
            r12.b()
            return
        L_0x00a1:
            java.lang.Object r12 = r12.b
            uag r12 = (defpackage.uag) r12
            r12.getClass()
            ioc r0 = r12.d     // Catch:{ all -> 0x00ae }
            r0.getClass()     // Catch:{ all -> 0x00ae }
            goto L_0x00b8
        L_0x00ae:
            r0 = move-exception
            java.lang.String r1 = "rtc.command.handle.command.onsent"
            a4c r12 = r12.a
            java.lang.String r2 = "ProtocolInfo"
            r12.reportException(r2, r1, r0)
        L_0x00b8:
            return
        L_0x00b9:
            java.lang.Object r12 = r12.b
            o7g r12 = (defpackage.o7g) r12
            r12.getClass()
            gte r0 = new gte
            r1 = 22
            r0.<init>((int) r1, (java.lang.Object) r12)
            fhe r12 = r12.d
            gqc r12 = (defpackage.gqc) r12
            r12.e0(r0)
            return
        L_0x00cf:
            java.lang.Object r12 = r12.b
            c7g r12 = (defpackage.c7g) r12
            android.content.Intent r0 = r12.a
            r0.getAction()
            qne r12 = r12.b
            r12.d(r3)
            return
        L_0x00de:
            java.lang.Object r12 = r12.b
            hrf r12 = (defpackage.hrf) r12
            java.lang.String r0 = r12.h
            boolean r2 = r12.k
            if (r2 == 0) goto L_0x00fb
            long r2 = r12.l
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00f1
            goto L_0x00fb
        L_0x00f1:
            java.lang.String r4 = "recoverTs"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = defpackage.hrf.e(r0, r4, r2)
        L_0x00fb:
            b9b r2 = r12.q
            java.lang.String r3 = "transport.reconnect"
            r2.o(r3)
            java.lang.Object r3 = r12.b
            monitor-enter(r3)
            r12.h = r0     // Catch:{ all -> 0x0117 }
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            java.lang.Object r0 = r12.e
            monitor-enter(r0)
            r12.f = r1     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = "reconnect"
            r12.a(r1)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x0114:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            throw r12
        L_0x0117:
            r12 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            throw r12
        L_0x011a:
            java.lang.Object r12 = r12.b
            ync r12 = (defpackage.ync) r12
            java.lang.Object r12 = r12.b
            od r12 = (defpackage.od) r12
            java.lang.Object r0 = r12.c
            k56 r0 = (defpackage.k56) r0
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0133
            goto L_0x0177
        L_0x0133:
            boolean r0 = r12.a
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "OwnTalkingReporter"
            java.lang.String r1 = "on voice start detected and reported"
            java.lang.Object r3 = r12.b
            a4c r3 = (defpackage.a4c) r3
            r3.log(r0, r1)
            java.lang.Object r0 = r12.Y
            ync r0 = (defpackage.ync) r0
            if (r0 == 0) goto L_0x016c
            java.lang.Object r0 = r0.b
            kg1 r0 = (defpackage.kg1) r0
            fg1 r1 = r0.a
            boolean r3 = r1.d()
            r1.n = r2
            boolean r1 = r1.d()
            if (r3 == r1) goto L_0x016c
            fg1 r1 = r0.a
            bg1 r3 = r1.a
            if (r3 != 0) goto L_0x0161
            goto L_0x016c
        L_0x0161:
            zad r3 = r0.c(r3)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.e(r3, r1)
        L_0x016c:
            r12.a = r2
        L_0x016e:
            e5f r0 = defpackage.e5f.a
            java.lang.Object r12 = r12.o
            xpb r12 = (defpackage.xpb) r12
            r12.e(r0)
        L_0x0177:
            return
        L_0x0178:
            java.lang.Object r12 = r12.b
            wva r12 = (defpackage.wva) r12
            r12.getClass()
            int r1 = defpackage.maf.a
            java.lang.Object r12 = r12.c
            n75 r12 = (defpackage.n75) r12
            t75 r12 = r12.a
            h74 r12 = r12.C0
            z23 r1 = r12.o
            java.lang.Object r1 = r1.e
            xj8 r1 = (defpackage.xj8) r1
            ed r1 = r12.J(r1)
            v64 r2 = new v64
            r3 = 24
            r2.<init>((int) r3)
            r12.Q(r1, r0, r2)
            return
        L_0x019e:
            java.lang.Object r12 = r12.b
            aab r12 = (defpackage.aab) r12
            r12.getClass()
            int r1 = defpackage.oaf.a
            java.lang.Object r12 = r12.b
            o75 r12 = (defpackage.o75) r12
            u75 r12 = r12.a
            i74 r12 = r12.D0
            ai3 r1 = r12.o
            java.lang.Object r1 = r1.X
            yj8 r1 = (defpackage.yj8) r1
            fd r1 = r12.g(r1)
            v64 r2 = new v64
            r3 = 4
            r2.<init>((int) r3)
            r12.I(r1, r0, r2)
            return
        L_0x01c3:
            java.lang.Object r12 = r12.b
            uif r12 = (defpackage.uif) r12
            r12.c()
            return
        L_0x01cb:
            java.lang.Object r12 = r12.b
            org.webrtc.VideoFileRenderer r12 = (org.webrtc.VideoFileRenderer) r12
            r12.lambda$release$3()
            return
        L_0x01d3:
            java.lang.Object r12 = r12.b
            zm4 r12 = (defpackage.zm4) r12
            java.lang.Object r12 = r12.l
            lq1 r12 = (defpackage.lq1) r12
            r12.b(r3)
            return
        L_0x01df:
            java.lang.Object r12 = r12.b
            rdf r12 = (defpackage.rdf) r12
            r12.q()
            return
        L_0x01e7:
            java.lang.Object r12 = r12.b
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl r12 = (ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl) r12
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl.saveUrlSharing$lambda$1(r12)
            return
        L_0x01ef:
            java.lang.Object r12 = r12.b
            java.lang.String r12 = (java.lang.String) r12
            ru.ok.android.externcalls.analytics.internal.upload.UploadStarter.startUpload$lambda$0(r12)
            return
        L_0x01f7:
            java.lang.Object r12 = r12.b
            android.os.HandlerThread r12 = (android.os.HandlerThread) r12
            r12.quitSafely()
            return
        L_0x01ff:
            java.lang.Object r12 = r12.b
            ata r12 = (defpackage.ata) r12
            dze r0 = defpackage.eze.b
            boolean r1 = r0 instanceof defpackage.bze
            if (r1 == 0) goto L_0x0211
            bze r0 = (defpackage.bze) r0
            java.util.LinkedList r0 = r0.a
            r0.add(r12)
            goto L_0x0220
        L_0x0211:
            boolean r1 = r0 instanceof defpackage.cze
            if (r1 == 0) goto L_0x021d
            cze r0 = (defpackage.cze) r0
            l2a r0 = r0.a
            r0.d(r12)
            goto L_0x0220
        L_0x021d:
            java.util.Objects.toString(r0)
        L_0x0220:
            return
        L_0x0221:
            java.lang.Object r12 = r12.b
            java.io.File r12 = (java.io.File) r12
            kbd r0 = defpackage.kye.e
            if (r0 == 0) goto L_0x022a
            goto L_0x022b
        L_0x022a:
            r0 = r3
        L_0x022b:
            r0.b()
            yie r0 = r0.h
            if (r0 == 0) goto L_0x03e2
            kye r1 = defpackage.kye.a
            java.util.Map r1 = defpackage.kye.c()
            o97 r4 = defpackage.tfg.b
            java.lang.Object r1 = r1.get(r4)
            boolean r5 = r1 instanceof defpackage.hta
            if (r5 == 0) goto L_0x0244
            hta r1 = (defpackage.hta) r1
        L_0x0244:
            nz4 r1 = defpackage.nz4.a
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0265 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0265 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0265 }
            r7.<init>(r12)     // Catch:{ IOException -> 0x0265 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0265 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0265 }
            kl7 r6 = defpackage.rq9.j(r5)     // Catch:{ all -> 0x025e }
            defpackage.v3c.i(r5, r3)     // Catch:{ IOException -> 0x0265 }
            r1 = r6
            goto L_0x0268
        L_0x025e:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0260 }
        L_0x0260:
            r7 = move-exception
            defpackage.v3c.i(r5, r6)     // Catch:{ IOException -> 0x0265 }
            throw r7     // Catch:{ IOException -> 0x0265 }
        L_0x0265:
            java.util.Objects.toString(r12)
        L_0x0268:
            r12.delete()
            boolean r12 = defpackage.dp3.b(r4)
            if (r12 == 0) goto L_0x0273
            goto L_0x03e2
        L_0x0273:
            boolean r12 = r1.isEmpty()
            if (r12 == 0) goto L_0x027b
            goto L_0x03e2
        L_0x027b:
            r1.size()
            kye r12 = defpackage.kye.a
            java.lang.String r12 = defpackage.kye.a()
            if (r12 != 0) goto L_0x0288
            goto L_0x03e2
        L_0x0288:
            org.json.JSONObject r0 = defpackage.j47.q0(r0)
            long r4 = defpackage.x6b.a
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()
            long r6 = r6 + r4
            long r4 = defpackage.x6b.b
            long r6 = r6 - r4
            java.lang.String r4 = "clientTimeUnixNano"
            r0.put((java.lang.String) r4, (long) r6)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x02a4:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0367
            java.lang.Object r5 = r1.next()
            ata r5 = (defpackage.ata) r5
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            long r7 = r5.a
            java.lang.String r9 = "timeUnixNano"
            r6.put((java.lang.String) r9, (long) r7)
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.b
            r6.put((java.lang.String) r7, (java.lang.Object) r8)
            java.lang.String r7 = "value"
            long r8 = r5.c
            r6.put((java.lang.String) r7, (long) r8)
            java.lang.String r7 = "unit"
            java.lang.String r8 = r5.d
            r6.put((java.lang.String) r7, (java.lang.Object) r8)
            java.util.Map r5 = r5.e
            boolean r7 = r5.isEmpty()
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x0362
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x02e7:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x035d
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getValue()
            boolean r10 = r8 instanceof java.lang.String
            if (r10 == 0) goto L_0x0305
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x02e7
        L_0x0305:
            boolean r10 = r8 instanceof java.lang.Boolean
            if (r10 == 0) goto L_0x0313
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r7.put((java.lang.String) r9, (boolean) r8)
            goto L_0x02e7
        L_0x0313:
            boolean r10 = r8 instanceof java.lang.Long
            if (r10 == 0) goto L_0x0321
            java.lang.Number r8 = (java.lang.Number) r8
            long r10 = r8.longValue()
            r7.put((java.lang.String) r9, (long) r10)
            goto L_0x02e7
        L_0x0321:
            boolean r10 = r8 instanceof java.lang.Double
            if (r10 == 0) goto L_0x032f
            java.lang.Number r8 = (java.lang.Number) r8
            double r10 = r8.doubleValue()
            r7.put((java.lang.String) r9, (double) r10)
            goto L_0x02e7
        L_0x032f:
            boolean r10 = r8 instanceof java.lang.Byte
            if (r10 == 0) goto L_0x0337
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x02e7
        L_0x0337:
            boolean r10 = r8 instanceof java.lang.Short
            if (r10 == 0) goto L_0x033f
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x02e7
        L_0x033f:
            boolean r10 = r8 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x034d
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.put((java.lang.String) r9, (int) r8)
            goto L_0x02e7
        L_0x034d:
            boolean r10 = r8 instanceof java.lang.Float
            if (r10 == 0) goto L_0x0355
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x02e7
        L_0x0355:
            java.lang.String r8 = r8.toString()
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x02e7
        L_0x035d:
            java.lang.String r5 = "attributes"
            r6.put((java.lang.String) r5, (java.lang.Object) r7)
        L_0x0362:
            r4.put((java.lang.Object) r6)
            goto L_0x02a4
        L_0x0367:
            java.lang.String r1 = "samples"
            r0.put((java.lang.String) r1, (java.lang.Object) r4)
            kye r1 = defpackage.kye.a
            java.util.Map r1 = defpackage.kye.c()
            o97 r2 = defpackage.ote.b
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof defpackage.gx3
            if (r2 == 0) goto L_0x037f
            gx3 r1 = (defpackage.gx3) r1
            goto L_0x0380
        L_0x037f:
            r1 = r3
        L_0x0380:
            if (r1 != 0) goto L_0x038a
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            defpackage.mz7.d0(r1)
        L_0x038a:
            java.lang.String r1 = "https://sdk-api.apptracer.ru"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r2 = "api/perf/upload"
            android.net.Uri$Builder r1 = r1.appendEncodedPath(r2)
            java.lang.String r2 = "crashToken"
            android.net.Uri$Builder r12 = r1.appendQueryParameter(r2, r12)
            java.lang.String r12 = r12.toString()
            bkb r1 = new bkb
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "application/json; charset=utf-8"
            rh5 r0 = defpackage.b46.o(r2, r0)
            r1.<init>((java.lang.String) r12, (defpackage.qq6) r0)
            khe r12 = defpackage.kye.h     // Catch:{ Exception -> 0x03e2 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ Exception -> 0x03e2 }
            wq6 r12 = (defpackage.wq6) r12     // Catch:{ Exception -> 0x03e2 }
            rq6 r12 = r12.b(r1)     // Catch:{ Exception -> 0x03e2 }
            java.io.Closeable r0 = r12.o     // Catch:{ all -> 0x03d0 }
            rh5 r0 = (defpackage.rh5) r0     // Catch:{ all -> 0x03d0 }
            if (r0 == 0) goto L_0x03d2
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x03d0 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x03d0 }
            if (r0 == 0) goto L_0x03d2
            java.lang.String r0 = defpackage.eae.j0(r0)     // Catch:{ all -> 0x03d0 }
            goto L_0x03d3
        L_0x03d0:
            r0 = move-exception
            goto L_0x03dc
        L_0x03d2:
            r0 = r3
        L_0x03d3:
            java.lang.String r1 = "PERFORMANCE_METRICS"
            defpackage.oz7.l(r0, r1, r3)     // Catch:{ all -> 0x03d0 }
            defpackage.v3c.i(r12, r3)     // Catch:{ Exception -> 0x03e2 }
            goto L_0x03e2
        L_0x03dc:
            throw r0     // Catch:{ all -> 0x03dd }
        L_0x03dd:
            r1 = move-exception
            defpackage.v3c.i(r12, r0)     // Catch:{ Exception -> 0x03e2 }
            throw r1     // Catch:{ Exception -> 0x03e2 }
        L_0x03e2:
            return
        L_0x03e3:
            java.lang.Object r12 = r12.b
            qye r12 = (defpackage.qye) r12
            java.util.concurrent.atomic.AtomicInteger r0 = r12.h
            r1 = 8
            int r0 = r0.getAndSet(r1)
            int r0 = r0 - r1
            wye r12 = r12.a
            x67 r12 = r12.h
            khe r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            js4 r12 = (defpackage.js4) r12
            r12.getClass()
            ls4 r1 = new ls4
            java.lang.String r2 = "non_fatal"
            java.lang.String r3 = "max_non_fatals_per_session_reached"
            r1.<init>(r2, r3, r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r12.a(r0)
            return
        L_0x0410:
            java.lang.Object r12 = r12.b
            ywe r12 = (defpackage.ywe) r12
            r12.w0 = r3
            r12.a()
            return
        L_0x041a:
            java.lang.Object r12 = r12.b
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            android.widget.EditText r12 = r12.o
            r12.requestLayout()
            return
        L_0x0424:
            java.lang.Object r12 = r12.b
            tme r12 = (defpackage.tme) r12
            r12.b(r2)
            return
        L_0x042c:
            java.lang.Object r12 = r12.b
            wle r12 = (defpackage.wle) r12
            je7 r12 = r12.l
            java.lang.Object r12 = r12.getValue()
            f5a r12 = (defpackage.f5a) r12
            r12.g(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ule.run():void");
    }

    public /* synthetic */ ule(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
