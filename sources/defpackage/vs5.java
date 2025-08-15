package defpackage;

/* renamed from: vs5  reason: default package */
public final /* synthetic */ class vs5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vs5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: qm9} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x030f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        defpackage.v3c.i(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0313, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0462, code lost:
        if (r2.equals("errors.process.attachment.video.not.processed") == false) goto L_0x0486;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x046b, code lost:
        if (r2.equals("attachment.not.ready") == false) goto L_0x0486;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = -1
            r4 = 0
            r5 = 1
            r6 = 0
            int r7 = r14.a
            switch(r7) {
                case 0: goto L_0x0540;
                case 1: goto L_0x0530;
                case 2: goto L_0x0512;
                case 3: goto L_0x04e4;
                case 4: goto L_0x04d3;
                case 5: goto L_0x04bb;
                case 6: goto L_0x04af;
                case 7: goto L_0x0443;
                case 8: goto L_0x03ad;
                case 9: goto L_0x039f;
                case 10: goto L_0x0387;
                case 11: goto L_0x0377;
                case 12: goto L_0x0352;
                case 13: goto L_0x0336;
                case 14: goto L_0x0315;
                case 15: goto L_0x023d;
                case 16: goto L_0x01cc;
                case 17: goto L_0x01bb;
                case 18: goto L_0x01a7;
                case 19: goto L_0x0198;
                case 20: goto L_0x014b;
                case 21: goto L_0x0116;
                case 22: goto L_0x00db;
                case 23: goto L_0x00ab;
                case 24: goto L_0x0090;
                case 25: goto L_0x0082;
                case 26: goto L_0x0073;
                case 27: goto L_0x005e;
                case 28: goto L_0x0042;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.Object r0 = r14.b
            mm9 r0 = (defpackage.mm9) r0
            java.lang.Object r14 = r14.c
            nm9 r14 = (defpackage.nm9) r14
            java.util.concurrent.Future r1 = r0.g     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0020 }
            r6 = r1
            qm9 r6 = (defpackage.qm9) r6     // Catch:{ all -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            r1 = move-exception
            goto L_0x0026
        L_0x0022:
            r0.b(r6, r14)     // Catch:{ all -> 0x0020 }
            goto L_0x0041
        L_0x0026:
            boolean r2 = r1 instanceof java.util.concurrent.ExecutionException
            if (r2 == 0) goto L_0x0034
            java.lang.Throwable r1 = r1.getCause()
            if (r1 == 0) goto L_0x0037
            r14.onFailed(r1)
            goto L_0x0037
        L_0x0034:
            r14.onFailed(r1)
        L_0x0037:
            boolean r1 = r0.e
            if (r1 == 0) goto L_0x0041
            r0.a(r14)
            r0.d()
        L_0x0041:
            return
        L_0x0042:
            java.lang.Object r0 = r14.b
            m1f r0 = (defpackage.m1f) r0
            r0.getClass()
            java.lang.Object r14 = r14.c
            java.lang.Exception r14 = (java.lang.Exception) r14
            boolean r1 = r14 instanceof androidx.media3.common.VideoFrameProcessingException
            if (r1 == 0) goto L_0x0054
            androidx.media3.common.VideoFrameProcessingException r14 = (androidx.media3.common.VideoFrameProcessingException) r14
            goto L_0x0058
        L_0x0054:
            androidx.media3.common.VideoFrameProcessingException r14 = androidx.media3.common.VideoFrameProcessingException.a(r14)
        L_0x0058:
            pgf r0 = r0.X
            r0.c(r14)
            return
        L_0x005e:
            java.lang.Object r0 = r14.b
            m1f r0 = (defpackage.m1f) r0
            r0.getClass()
            java.lang.Object r14 = r14.c
            java.lang.InterruptedException r14 = (java.lang.InterruptedException) r14
            androidx.media3.common.VideoFrameProcessingException r14 = androidx.media3.common.VideoFrameProcessingException.a(r14)
            pgf r0 = r0.X
            r0.c(r14)
            return
        L_0x0073:
            java.lang.Object r0 = r14.b
            i99 r0 = (defpackage.i99) r0
            r0.getClass()
            java.lang.Object r14 = r14.c
            pv6 r14 = (defpackage.pv6) r14
            r14.f(r0)
            return
        L_0x0082:
            java.lang.Object r0 = r14.b
            sj8 r0 = (defpackage.sj8) r0
            m5d r0 = r0.e
            java.lang.Object r14 = r14.c
            oh8 r14 = (defpackage.oh8) r14
            r0.w(r14)
            return
        L_0x0090:
            java.lang.Object r0 = r14.b
            sj8 r0 = (defpackage.sj8) r0
            r0.getClass()
            java.lang.Object r14 = r14.c
            kr6 r14 = (defpackage.kr6) r14
            android.os.IBinder r14 = r14.asBinder()
            m5d r0 = r0.e
            oh8 r14 = r0.z(r14)
            if (r14 == 0) goto L_0x00aa
            r0.L(r14)
        L_0x00aa:
            return
        L_0x00ab:
            java.lang.Object r0 = r14.b
            ue r0 = (defpackage.ue) r0
            java.lang.Object r0 = r0.i
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r14 = r14.c
            qh8 r14 = (defpackage.qh8) r14
            java.lang.Object r0 = r0.remove(r14)
            bm7 r0 = (defpackage.bm7) r0
            if (r0 == 0) goto L_0x00d6
            boolean r1 = r0.cancel(r4)
            if (r1 == 0) goto L_0x00c6
            goto L_0x00d6
        L_0x00c6:
            java.lang.Object r0 = defpackage.fm9.C(r0)     // Catch:{ CancellationException | ExecutionException -> 0x00d0 }
            a98 r0 = (defpackage.a98) r0     // Catch:{ CancellationException | ExecutionException -> 0x00d0 }
            r0.release()
            goto L_0x00d6
        L_0x00d0:
            r0 = move-exception
            java.lang.String r1 = "MediaController future failed (so we couldn't release it)"
            defpackage.z04.d0(r1, r0)
        L_0x00d6:
            ii8 r14 = r14.a
            r14.v = r6
            return
        L_0x00db:
            java.lang.Object r0 = r14.b
            ii8 r0 = (defpackage.ii8) r0
            oh8 r1 = r0.e()
            java.lang.Object r14 = r14.c
            android.content.Intent r14 = (android.content.Intent) r14
            if (r1 != 0) goto L_0x010a
            android.content.ComponentName r1 = r14.getComponent()
            if (r1 == 0) goto L_0x00f4
            java.lang.String r1 = r1.getPackageName()
            goto L_0x00f6
        L_0x00f4:
            java.lang.String r1 = "androidx.media3.session.MediaSessionService"
        L_0x00f6:
            oh8 r2 = new oh8
            vi8 r5 = new vi8
            r5.<init>(r1, r3, r3)
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            r6 = 1004001300(0x3bd7d814, float:0.006587038)
            r9 = 0
            r7 = 6
            r8 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1 = r2
        L_0x010a:
            boolean r14 = r0.n(r1, r14)
            if (r14 != 0) goto L_0x0115
            java.lang.String r14 = "Ignored unrecognized media button intent."
            defpackage.z04.t(r14)
        L_0x0115:
            return
        L_0x0116:
            java.lang.Object r0 = r14.b
            bm7 r0 = (defpackage.bm7) r0
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x0128, InterruptedException | ExecutionException -> 0x0126 }
            sad r0 = (defpackage.sad) r0     // Catch:{ CancellationException -> 0x0128, InterruptedException | ExecutionException -> 0x0126 }
            java.lang.String r1 = "SessionResult must not be null"
            defpackage.fm9.i(r0, r1)     // Catch:{ CancellationException -> 0x0128, InterruptedException | ExecutionException -> 0x0126 }
            goto L_0x013f
        L_0x0126:
            r0 = move-exception
            goto L_0x012a
        L_0x0128:
            r0 = move-exception
            goto L_0x0135
        L_0x012a:
            java.lang.String r1 = "Custom command failed"
            defpackage.z04.d0(r1, r0)
            sad r0 = new sad
            r0.<init>(r3)
            goto L_0x013f
        L_0x0135:
            java.lang.String r1 = "Custom command cancelled"
            defpackage.z04.d0(r1, r0)
            sad r0 = new sad
            r0.<init>(r5)
        L_0x013f:
            android.os.Bundle r1 = r0.b
            java.lang.Object r14 = r14.c
            android.os.ResultReceiver r14 = (android.os.ResultReceiver) r14
            int r0 = r0.a
            r14.send(r0, r1)
            return
        L_0x014b:
            java.lang.Object r0 = r14.b
            ii8 r0 = (defpackage.ii8) r0
            si8 r1 = r0.h
            java.lang.Object r14 = r14.c
            x4b r14 = (defpackage.x4b) r14
            r0.s = r14
            gi8 r2 = new gi8
            r2.<init>(r0, r14)
            r14.z(r2)
            r0.u = r2
            qi8 r2 = r1.h     // Catch:{ RemoteException -> 0x0167 }
            r2.x(r4, r14)     // Catch:{ RemoteException -> 0x0167 }
            goto L_0x016d
        L_0x0167:
            r2 = move-exception
            java.lang.String r3 = "Exception in using media1 API"
            defpackage.z04.v(r3, r2)
        L_0x016d:
            bi8 r1 = r1.j
            wh8 r2 = r1.a
            android.media.session.MediaSession r2 = r2.a
            r2.setActive(r5)
            java.util.ArrayList r1 = r1.c
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L_0x0190
            m4b r1 = r14.o()
            r0.r = r1
            k3b r14 = r14.s()
            r0.f(r14)
            return
        L_0x0190:
            java.lang.Object r14 = r1.next()
            defpackage.au1.r(r14)
            throw r6
        L_0x0198:
            java.lang.Object r0 = r14.b
            ii8 r0 = (defpackage.ii8) r0
            r0.getClass()
            java.lang.Object r14 = r14.c
            java.lang.Runnable r14 = (java.lang.Runnable) r14
            r14.run()
            return
        L_0x01a7:
            java.lang.Object r0 = r14.b
            ii8 r0 = (defpackage.ii8) r0
            boolean r0 = r0.o()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r14 = r14.c
            ccd r14 = (defpackage.ccd) r14
            r14.l(r0)
            return
        L_0x01bb:
            java.lang.Object r0 = r14.b
            w98 r0 = (defpackage.w98) r0
            boolean r1 = r0.m
            if (r1 == 0) goto L_0x01c4
            goto L_0x01cb
        L_0x01c4:
            java.lang.Object r14 = r14.c
            fa8 r14 = (defpackage.fa8) r14
            r14.c(r0)
        L_0x01cb:
            return
        L_0x01cc:
            java.lang.Object r0 = r14.b
            da8 r0 = (defpackage.da8) r0
            java.lang.Object r14 = r14.c
            ai8 r14 = (defpackage.ai8) r14
            qz7 r1 = new qz7
            android.content.Context r2 = r0.a
            r1.<init>((android.content.Context) r2, (defpackage.ai8) r14)
            r0.g = r1
            ba8 r14 = r0.e
            a98 r0 = r0.b
            android.os.Handler r0 = r0.X
            if (r14 == 0) goto L_0x0235
            java.lang.Object r2 = r1.c
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.add(r14)
            if (r2 != 0) goto L_0x01f0
            goto L_0x0232
        L_0x01f0:
            if (r0 != 0) goto L_0x01f7
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
        L_0x01f7:
            r14.j(r0)
            java.lang.Object r1 = r1.b
            e98 r1 = (defpackage.e98) r1
            android.media.session.MediaController r2 = r1.a
            b98 r3 = r14.a
            r3.getClass()
            r2.registerCallback(r3, r0)
            java.lang.Object r0 = r1.b
            monitor-enter(r0)
            ai8 r2 = r1.e     // Catch:{ all -> 0x0228 }
            pr6 r2 = r2.a()     // Catch:{ all -> 0x0228 }
            if (r2 == 0) goto L_0x022a
            d98 r3 = new d98     // Catch:{ all -> 0x0228 }
            r3.<init>(r14)     // Catch:{ all -> 0x0228 }
            java.util.HashMap r1 = r1.d     // Catch:{ all -> 0x0228 }
            r1.put(r14, r3)     // Catch:{ all -> 0x0228 }
            r14.c = r3     // Catch:{ all -> 0x0228 }
            r2.g0(r3)     // Catch:{ RemoteException -> 0x0231 }
            r1 = 13
            r14.i(r1, r6, r6)     // Catch:{ RemoteException -> 0x0231 }
            goto L_0x0231
        L_0x0228:
            r14 = move-exception
            goto L_0x0233
        L_0x022a:
            r14.c = r6     // Catch:{ all -> 0x0228 }
            java.util.ArrayList r1 = r1.c     // Catch:{ all -> 0x0228 }
            r1.add(r14)     // Catch:{ all -> 0x0228 }
        L_0x0231:
            monitor-exit(r0)     // Catch:{ all -> 0x0228 }
        L_0x0232:
            return
        L_0x0233:
            monitor-exit(r0)     // Catch:{ all -> 0x0228 }
            throw r14
        L_0x0235:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "callback must not be null"
            r14.<init>(r0)
            throw r14
        L_0x023d:
            java.lang.Object r0 = r14.c
            ns7 r0 = (defpackage.ns7) r0
            java.lang.Object r14 = r14.b
            zs7 r14 = (defpackage.zs7) r14
            r14.a(r2)
            java.lang.String r3 = defpackage.c37.q()
            android.content.Context r4 = r14.a
            java.lang.String r7 = r4.getPackageName()
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x025b
            java.lang.String r3 = "tracer"
            goto L_0x0275
        L_0x025b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "tracer-"
            r7.<init>(r8)
            r8 = 58
            r9 = 45
            java.lang.String r3 = r3.replace(r8, r9)
            java.lang.String r3 = android.net.Uri.encode(r3)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
        L_0x0275:
            java.io.File r7 = new java.io.File
            java.io.File r4 = r4.getCacheDir()
            r7.<init>(r4, r3)
            java.lang.String r3 = "logs"
            java.io.File r3 = defpackage.lk5.J(r7, r3)
            defpackage.m6d.y(r3)     // Catch:{ IOException -> 0x0288 }
            goto L_0x028b
        L_0x0288:
            r3.toString()
        L_0x028b:
            int r4 = r14.e
            int r4 = defpackage.au1.s(r4)
            java.lang.String r7 = "b.log"
            java.lang.String r8 = "a.log"
            if (r4 == 0) goto L_0x02d9
            r9 = 65536(0x10000, double:3.2379E-319)
            if (r4 == r5) goto L_0x02bc
            if (r4 == r2) goto L_0x029f
            goto L_0x02ec
        L_0x029f:
            java.io.File r1 = r14.f
            if (r1 != 0) goto L_0x02a4
            r1 = r6
        L_0x02a4:
            long r11 = r1.length()
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ec
            java.io.File r1 = defpackage.lk5.J(r3, r8)
            java.io.File[] r3 = new java.io.File[]{r1}
            defpackage.rq9.e(r3)
            r14.f = r1
            r14.e = r2
            goto L_0x02ec
        L_0x02bc:
            java.io.File r2 = r14.f
            if (r2 != 0) goto L_0x02c1
            r2 = r6
        L_0x02c1:
            long r11 = r2.length()
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x02ec
            java.io.File r2 = defpackage.lk5.J(r3, r7)
            java.io.File[] r3 = new java.io.File[]{r2}
            defpackage.rq9.e(r3)
            r14.f = r2
            r14.e = r1
            goto L_0x02ec
        L_0x02d9:
            java.io.File r1 = defpackage.lk5.J(r3, r8)
            java.io.File r3 = defpackage.lk5.J(r3, r7)
            java.io.File[] r3 = new java.io.File[]{r1, r3}
            defpackage.rq9.e(r3)
            r14.f = r1
            r14.e = r2
        L_0x02ec:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0314 }
            java.io.File r14 = r14.f     // Catch:{ IOException -> 0x0314 }
            if (r14 != 0) goto L_0x02f3
            r14 = r6
        L_0x02f3:
            r1.<init>(r14, r5)     // Catch:{ IOException -> 0x0314 }
            java.io.DataOutputStream r14 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0314 }
            r14.<init>(r1)     // Catch:{ IOException -> 0x0314 }
            long r1 = r0.a     // Catch:{ all -> 0x030d }
            r14.writeLong(r1)     // Catch:{ all -> 0x030d }
            byte[] r0 = r0.b     // Catch:{ all -> 0x030d }
            int r1 = r0.length     // Catch:{ all -> 0x030d }
            r14.writeInt(r1)     // Catch:{ all -> 0x030d }
            r14.write(r0)     // Catch:{ all -> 0x030d }
            defpackage.v3c.i(r14, r6)     // Catch:{ IOException -> 0x0314 }
            goto L_0x0314
        L_0x030d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x030f }
        L_0x030f:
            r1 = move-exception
            defpackage.v3c.i(r14, r0)     // Catch:{ IOException -> 0x0314 }
            throw r1     // Catch:{ IOException -> 0x0314 }
        L_0x0314:
            return
        L_0x0315:
            java.lang.Object r0 = r14.b
            kq7 r0 = (defpackage.kq7) r0
            java.lang.Object r14 = r14.c
            tv1 r14 = (defpackage.tv1) r14
            tv1 r1 = r0.r
            if (r14 == r1) goto L_0x0332
            a4c r14 = r0.n
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Wrong camera capturer"
            r0.<init>(r1)
            java.lang.String r1 = "OKRTCLmsAdapter"
            java.lang.String r2 = "camera.switch.check"
            r14.reportException(r1, r2, r0)
            goto L_0x0335
        L_0x0332:
            r14.a()
        L_0x0335:
            return
        L_0x0336:
            java.lang.Object r0 = r14.b
            zm7 r0 = (defpackage.zm7) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.a
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x0343
            goto L_0x0351
        L_0x0343:
            java.lang.Object r14 = r14.c
            an7 r14 = (defpackage.an7) r14
            r14.getClass()
            py9 r0 = r0.b
            java.lang.Object r14 = r14.a
            r0.a(r14)
        L_0x0351:
            return
        L_0x0352:
            java.lang.Object r0 = r14.b
            va8 r0 = (defpackage.va8) r0
            java.lang.Object r0 = r0.b
            ci9 r0 = (defpackage.ci9) r0
            java.lang.Object r0 = r0.d()
            an7 r0 = (defpackage.an7) r0
            java.lang.Object r14 = r14.c
            lq1 r14 = (defpackage.lq1) r14
            if (r0 != 0) goto L_0x0371
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Observable has not yet been initialized with a value."
            r0.<init>(r1)
            r14.d(r0)
            goto L_0x0376
        L_0x0371:
            java.lang.Object r0 = r0.a
            r14.b(r0)
        L_0x0376:
            return
        L_0x0377:
            java.lang.Object r0 = r14.b
            va8 r0 = (defpackage.va8) r0
            java.lang.Object r0 = r0.b
            ci9 r0 = (defpackage.ci9) r0
            java.lang.Object r14 = r14.c
            zm7 r14 = (defpackage.zm7) r14
            r0.j(r14)
            return
        L_0x0387:
            java.lang.Object r0 = r14.b
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            java.lang.Object r14 = r14.c
            android.view.View r14 = (android.view.View) r14
            r0.showSoftInput(r14, r5)
            return
        L_0x039f:
            int r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.a
            java.lang.Object r0 = r14.b
            com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService) r0
            java.lang.Object r14 = r14.c
            android.app.job.JobParameters r14 = (android.app.job.JobParameters) r14
            r0.jobFinished(r14, r4)
            return
        L_0x03ad:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r4 = r14.b
            akf r4 = (defpackage.akf) r4
            java.util.Map r4 = r4.b
            java.lang.String r5 = "DASH"
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = ""
            if (r5 != 0) goto L_0x03c6
            r13 = r7
            goto L_0x03c7
        L_0x03c6:
            r13 = r5
        L_0x03c7:
            int r5 = r13.length()
            if (r5 <= 0) goto L_0x03da
            df5 r5 = new df5
            r11 = 0
            r12 = 0
            r9 = 2
            r10 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r3.add(r5)
        L_0x03da:
            java.lang.String r5 = "HLS"
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x03e6
            r13 = r7
            goto L_0x03e7
        L_0x03e6:
            r13 = r5
        L_0x03e7:
            int r5 = r13.length()
            if (r5 <= 0) goto L_0x03fa
            df5 r5 = new df5
            r11 = 0
            r12 = 0
            r9 = 1
            r10 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r3.add(r5)
        L_0x03fa:
            java.util.Set r4 = r4.entrySet()
            at r5 = new at
            r5.<init>(r2, r4)
            g27 r2 = new g27
            r2.<init>(r1)
            qk5 r1 = defpackage.l6d.Z(r5, r2)
            g27 r2 = new g27
            r2.<init>(r0)
            r1f r4 = new r1f
            r4.<init>(r1, r2)
            java.util.List r1 = defpackage.l6d.i0(r4)
            r3.addAll(r1)
            boolean r1 = r3.isEmpty()
            java.lang.Object r14 = r14.c
            d47 r14 = (defpackage.d47) r14
            rx r14 = r14.k
            if (r1 == 0) goto L_0x0437
            ru.ok.messages.video.fetcher.FetcherException r1 = new ru.ok.messages.video.fetcher.FetcherException
            java.lang.String r2 = "failed to get internal link from video play cmd"
            r1.<init>(r0, r2)
            r14.onError(r1)
            r14.b()
            goto L_0x0442
        L_0x0437:
            ff5 r0 = new ff5
            r0.<init>(r6, r3)
            r14.e(r0)
            r14.b()
        L_0x0442:
            return
        L_0x0443:
            java.lang.Object r0 = r14.b
            oi0 r0 = (defpackage.oi0) r0
            pke r1 = r0.b
            java.lang.String r2 = r1.b
            boolean r1 = r1 instanceof defpackage.gke
            if (r1 == 0) goto L_0x0450
            goto L_0x0488
        L_0x0450:
            if (r2 == 0) goto L_0x0486
            int r1 = r2.hashCode()
            r5 = 9
            switch(r1) {
                case 212698279: goto L_0x047a;
                case 979732336: goto L_0x046e;
                case 1378132925: goto L_0x0465;
                case 1739785143: goto L_0x045c;
                default: goto L_0x045b;
            }
        L_0x045b:
            goto L_0x0486
        L_0x045c:
            java.lang.String r1 = "errors.process.attachment.video.not.processed"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0488
            goto L_0x0486
        L_0x0465:
            java.lang.String r1 = "attachment.not.ready"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0488
            goto L_0x0486
        L_0x046e:
            java.lang.String r1 = "video.offline"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0477
            goto L_0x0486
        L_0x0477:
            r5 = 8
            goto L_0x0488
        L_0x047a:
            java.lang.String r1 = "not.found"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0483
            goto L_0x0486
        L_0x0483:
            r5 = 10
            goto L_0x0488
        L_0x0486:
            r5 = 11
        L_0x0488:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "videoplay cmd failed "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "d47"
            defpackage.hm9.p(r1, r0, r6)
            ru.ok.messages.video.fetcher.FetcherException r0 = new ru.ok.messages.video.fetcher.FetcherException
            java.lang.String r1 = "videoplay cmd failed"
            r0.<init>(r5, r1)
            java.lang.Object r14 = r14.c
            d47 r14 = (defpackage.d47) r14
            rx r14 = r14.k
            r14.onError(r0)
            r14.b()
            return
        L_0x04af:
            java.lang.Object r0 = r14.b
            zu6 r0 = (defpackage.zu6) r0
            java.lang.Object r14 = r14.c
            java.lang.String r14 = (java.lang.String) r14
            r0.A(r14)
            return
        L_0x04bb:
            java.lang.Object r0 = r14.c
            qne r0 = (defpackage.qne) r0
            java.lang.Object r14 = r14.b
            mu6 r14 = (defpackage.mu6) r14
            r14.getClass()
            android.graphics.Bitmap r14 = r14.m()     // Catch:{ Exception -> 0x04ce }
            r0.b(r14)     // Catch:{ Exception -> 0x04ce }
            goto L_0x04d2
        L_0x04ce:
            r14 = move-exception
            r0.a(r14)
        L_0x04d2:
            return
        L_0x04d3:
            java.lang.Object r0 = r14.b
            hqc r0 = (defpackage.hqc) r0
            r0.a()
            java.lang.Object r14 = r14.c
            hqc r14 = (defpackage.hqc) r14
            if (r14 == 0) goto L_0x04e3
            r14.a()
        L_0x04e3:
            return
        L_0x04e4:
            java.lang.Object r0 = r14.b
            cq6 r0 = (defpackage.cq6) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.Y
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x04f1
            goto L_0x0511
        L_0x04f1:
            java.lang.String r1 = "dq6"
            java.lang.String r2 = "onFileUploadCompleted: completed download"
            defpackage.hm9.m(r1, r2, new java.lang.Object[0])
            java.lang.Object r14 = r14.c
            java.io.File r14 = (java.io.File) r14
            r14.length()
            zp6 r14 = new zp6
            r1 = 1120403456(0x42c80000, float:100.0)
            r14.<init>(r1, r5)
            f2a r1 = r0.X
            r1.e(r14)
            r1.b()
            r0.c(r4)
        L_0x0511:
            return
        L_0x0512:
            java.lang.Object r0 = r14.b
            tn6 r0 = (defpackage.tn6) r0
            wmc r0 = r0.c
            java.lang.Object r14 = r14.c
            dm6 r14 = (defpackage.dm6) r14
            android.net.Uri r14 = r14.x0
            java.lang.Object r0 = r0.a
            fm6 r0 = (defpackage.fm6) r0
            hb4 r0 = r0.b
            java.util.HashMap r0 = r0.b
            java.lang.Object r14 = r0.get(r14)
            gb4 r14 = (defpackage.gb4) r14
            r14.c(r5)
            return
        L_0x0530:
            java.lang.Object r0 = r14.b
            android.content.Context r0 = (android.content.Context) r0
            s7g r0 = defpackage.s7g.d(r0)
            java.lang.Object r14 = r14.c
            rla r14 = (defpackage.rla) r14
            r0.a(r14)
            return
        L_0x0540:
            java.lang.Object r0 = r14.b
            xs5 r0 = (defpackage.xs5) r0
            java.lang.Object r14 = r14.c
            lq1 r14 = (defpackage.lq1) r14
            r0.d(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs5.run():void");
    }

    public /* synthetic */ vs5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj3;
    }
}
