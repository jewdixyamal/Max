package defpackage;

/* renamed from: ss5  reason: default package */
public final /* synthetic */ class ss5 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ss5(Object obj, Object obj2, Object obj3, long j, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.X = obj3;
        this.b = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.a
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.X
            java.lang.String r0 = (java.lang.String) r0
            long r1 = r15.b
            java.lang.Object r3 = r15.c
            com.my.tracker.obfuscated.t r3 = (com.my.tracker.obfuscated.t) r3
            java.lang.Object r15 = r15.o
            java.lang.String r15 = (java.lang.String) r15
            r3.a((java.lang.String) r15, (java.lang.String) r0, (long) r1)
            return
        L_0x0017:
            java.lang.Object r0 = r15.c
            die r0 = (defpackage.die) r0
            java.lang.Object r1 = r15.o
            r7 = r1
            bg1 r7 = (defpackage.bg1) r7
            java.lang.Object r1 = r15.X
            android.util.Size r1 = (android.util.Size) r1
            long r2 = r15.b
            monitor-enter(r0)
            java.lang.Object r15 = r0.o     // Catch:{ all -> 0x0089 }
            java.util.LinkedHashSet r15 = (java.util.LinkedHashSet) r15     // Catch:{ all -> 0x0089 }
            boolean r15 = r15.contains(r7)     // Catch:{ all -> 0x0089 }
            if (r15 == 0) goto L_0x0033
            monitor-exit(r0)
            goto L_0x008c
        L_0x0033:
            java.lang.Object r15 = r0.c     // Catch:{ all -> 0x0089 }
            java.util.LinkedHashMap r15 = (java.util.LinkedHashMap) r15     // Catch:{ all -> 0x0089 }
            java.lang.Object r15 = r15.get(r7)     // Catch:{ all -> 0x0089 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0089 }
            if (r15 == 0) goto L_0x008b
            long r4 = r15.longValue()     // Catch:{ all -> 0x0089 }
            long r3 = r2 - r4
            java.lang.String r15 = "width"
            int r2 = r1.getWidth()     // Catch:{ all -> 0x0089 }
            ru.ok.android.externcalls.analytics.events.EventItemValue r2 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((int) r2)     // Catch:{ all -> 0x0089 }
            kpa r5 = new kpa     // Catch:{ all -> 0x0089 }
            r5.<init>(r15, r2)     // Catch:{ all -> 0x0089 }
            java.lang.String r15 = "height"
            int r1 = r1.getHeight()     // Catch:{ all -> 0x0089 }
            ru.ok.android.externcalls.analytics.events.EventItemValue r1 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((int) r1)     // Catch:{ all -> 0x0089 }
            kpa r2 = new kpa     // Catch:{ all -> 0x0089 }
            r2.<init>(r15, r1)     // Catch:{ all -> 0x0089 }
            kpa[] r15 = new defpackage.kpa[]{r5, r2}     // Catch:{ all -> 0x0089 }
            java.util.Map r5 = defpackage.mz7.a0(r15)     // Catch:{ all -> 0x0089 }
            ztc r15 = defpackage.ce.a()     // Catch:{ all -> 0x0089 }
            tb2 r8 = new tb2     // Catch:{ all -> 0x0089 }
            r6 = 5
            r1 = r8
            r2 = r0
            r1.<init>((java.lang.Object) r2, (long) r3, (java.lang.Object) r5, (int) r6)     // Catch:{ all -> 0x0089 }
            r15.b(r8)     // Catch:{ all -> 0x0089 }
            java.lang.Object r15 = r0.c     // Catch:{ all -> 0x0089 }
            java.util.LinkedHashMap r15 = (java.util.LinkedHashMap) r15     // Catch:{ all -> 0x0089 }
            r15.remove(r7)     // Catch:{ all -> 0x0089 }
            java.lang.Object r15 = r0.o     // Catch:{ all -> 0x0089 }
            java.util.LinkedHashSet r15 = (java.util.LinkedHashSet) r15     // Catch:{ all -> 0x0089 }
            r15.add(r7)     // Catch:{ all -> 0x0089 }
            goto L_0x008b
        L_0x0089:
            r15 = move-exception
            goto L_0x008d
        L_0x008b:
            monitor-exit(r0)
        L_0x008c:
            return
        L_0x008d:
            monitor-exit(r0)
            throw r15
        L_0x008f:
            java.lang.Object r0 = r15.c
            xs5 r0 = (defpackage.xs5) r0
            java.lang.Object r1 = r15.o
            r7 = r1
            lq1 r7 = (defpackage.lq1) r7
            java.lang.Object r1 = r15.X
            r8 = r1
            bw4 r8 = (defpackage.bw4) r8
            long r9 = r15.b
            boolean r15 = r0.d
            if (r15 != 0) goto L_0x00af
            androidx.camera.core.CameraControl$OperationCanceledException r15 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r0 = "Camera is not active."
            r15.<init>(r0)
            r7.d(r15)
            goto L_0x0242
        L_0x00af:
            st1 r15 = r0.a
            od r15 = r15.i
            java.lang.Object r15 = r15.Y
            cag r15 = (defpackage.cag) r15
            android.graphics.Rect r15 = r15.e()
            android.util.Rational r1 = r0.e
            if (r1 == 0) goto L_0x00c3
            android.util.Rational r1 = r0.e
            r11 = r1
            goto L_0x00dd
        L_0x00c3:
            st1 r1 = r0.a
            od r1 = r1.i
            java.lang.Object r1 = r1.Y
            cag r1 = (defpackage.cag) r1
            android.graphics.Rect r1 = r1.e()
            android.util.Rational r2 = new android.util.Rational
            int r3 = r1.width()
            int r1 = r1.height()
            r2.<init>(r3, r1)
            r11 = r2
        L_0x00dd:
            java.lang.Object r1 = r8.b
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            st1 r1 = r0.a
            xv1 r1 = r1.e
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF
            java.lang.Object r1 = r1.a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r12 = 0
            if (r1 != 0) goto L_0x00f3
            r3 = r12
            goto L_0x00f8
        L_0x00f3:
            int r1 = r1.intValue()
            r3 = r1
        L_0x00f8:
            r6 = 1
            r1 = r0
            r4 = r11
            r5 = r15
            java.util.List r13 = r1.c(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r8.c
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            st1 r1 = r0.a
            xv1 r1 = r1.e
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE
            java.lang.Object r1 = r1.a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0115
            r3 = r12
            goto L_0x011a
        L_0x0115:
            int r1 = r1.intValue()
            r3 = r1
        L_0x011a:
            r6 = 2
            r1 = r0
            r4 = r11
            r5 = r15
            java.util.List r14 = r1.c(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r8.o
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            st1 r1 = r0.a
            xv1 r1 = r1.e
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AWB
            java.lang.Object r1 = r1.a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0137
            r3 = r12
            goto L_0x013c
        L_0x0137:
            int r1 = r1.intValue()
            r3 = r1
        L_0x013c:
            r6 = 4
            r1 = r0
            r4 = r11
            r5 = r15
            java.util.List r15 = r1.c(r2, r3, r4, r5, r6)
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x0162
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L_0x0162
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x0162
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "None of the specified AF/AE/AWB MeteringPoints is supported on this camera."
            r15.<init>(r0)
            r7.d(r15)
            goto L_0x0242
        L_0x0162:
            rs5 r1 = r0.o
            st1 r2 = r0.a
            qt1 r2 = r2.b
            java.lang.Object r2 = r2.b
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.remove(r1)
            lq1 r1 = r0.t
            r2 = 0
            java.lang.String r3 = "Cancelled by another startFocusAndMetering()"
            if (r1 == 0) goto L_0x0180
            androidx.camera.core.CameraControl$OperationCanceledException r4 = new androidx.camera.core.CameraControl$OperationCanceledException
            r4.<init>(r3)
            r1.d(r4)
            r0.t = r2
        L_0x0180:
            ts5 r1 = r0.p
            st1 r4 = r0.a
            qt1 r4 = r4.b
            java.lang.Object r4 = r4.b
            java.util.HashSet r4 = (java.util.HashSet) r4
            r4.remove(r1)
            lq1 r1 = r0.u
            if (r1 == 0) goto L_0x019b
            androidx.camera.core.CameraControl$OperationCanceledException r4 = new androidx.camera.core.CameraControl$OperationCanceledException
            r4.<init>(r3)
            r1.d(r4)
            r0.u = r2
        L_0x019b:
            java.util.concurrent.ScheduledFuture r1 = r0.i
            r3 = 1
            if (r1 == 0) goto L_0x01a5
            r1.cancel(r3)
            r0.i = r2
        L_0x01a5:
            r0.t = r7
            android.hardware.camera2.params.MeteringRectangle[] r1 = defpackage.xs5.x
            java.lang.Object[] r4 = r13.toArray(r1)
            android.hardware.camera2.params.MeteringRectangle[] r4 = (android.hardware.camera2.params.MeteringRectangle[]) r4
            java.lang.Object[] r5 = r14.toArray(r1)
            android.hardware.camera2.params.MeteringRectangle[] r5 = (android.hardware.camera2.params.MeteringRectangle[]) r5
            java.lang.Object[] r15 = r15.toArray(r1)
            android.hardware.camera2.params.MeteringRectangle[] r15 = (android.hardware.camera2.params.MeteringRectangle[]) r15
            rs5 r1 = r0.o
            st1 r6 = r0.a
            qt1 r7 = r6.b
            java.lang.Object r7 = r7.b
            java.util.HashSet r7 = (java.util.HashSet) r7
            r7.remove(r1)
            java.util.concurrent.ScheduledFuture r1 = r0.i
            if (r1 == 0) goto L_0x01d1
            r1.cancel(r3)
            r0.i = r2
        L_0x01d1:
            java.util.concurrent.ScheduledFuture r1 = r0.j
            if (r1 == 0) goto L_0x01da
            r1.cancel(r3)
            r0.j = r2
        L_0x01da:
            r0.q = r4
            r0.r = r5
            r0.s = r15
            int r15 = r4.length
            if (r15 <= 0) goto L_0x01e5
            r15 = r3
            goto L_0x01e6
        L_0x01e5:
            r15 = r12
        L_0x01e6:
            if (r15 == 0) goto L_0x01f6
            r0.g = r3
            r0.l = r12
            r0.m = r12
            long r1 = r6.A()
            r0.e(r3)
            goto L_0x0200
        L_0x01f6:
            r0.g = r12
            r0.l = r3
            r0.m = r12
            long r1 = r6.A()
        L_0x0200:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r0.h = r15
            int r15 = r6.u(r3)
            if (r15 != r3) goto L_0x020d
            r12 = r3
        L_0x020d:
            rs5 r15 = new rs5
            r15.<init>(r0, r12, r1)
            r0.o = r15
            r6.p(r15)
            long r1 = r0.k
            r3 = 1
            long r1 = r1 + r3
            r0.k = r1
            us5 r15 = new us5
            r3 = 0
            r15.<init>(r3, r1, r0)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r4 = r0.c
            java.util.concurrent.ScheduledFuture r15 = r4.schedule(r15, r9, r3)
            r0.j = r15
            long r5 = r8.a
            r7 = 0
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x0242
            us5 r15 = new us5
            r7 = 1
            r15.<init>(r7, r1, r0)
            java.util.concurrent.ScheduledFuture r15 = r4.schedule(r15, r5, r3)
            r0.i = r15
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss5.run():void");
    }
}
