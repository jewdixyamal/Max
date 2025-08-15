package defpackage;

/* renamed from: b  reason: default package */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r0 = r32
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x04b9;
                case 1: goto L_0x04af;
                case 2: goto L_0x0444;
                case 3: goto L_0x0436;
                case 4: goto L_0x0427;
                case 5: goto L_0x0416;
                case 6: goto L_0x03fc;
                case 7: goto L_0x03ea;
                case 8: goto L_0x0235;
                case 9: goto L_0x0205;
                case 10: goto L_0x01d0;
                case 11: goto L_0x01c8;
                case 12: goto L_0x01b5;
                case 13: goto L_0x01ad;
                case 14: goto L_0x01a1;
                case 15: goto L_0x0199;
                case 16: goto L_0x018b;
                case 17: goto L_0x0183;
                case 18: goto L_0x012e;
                case 19: goto L_0x00ed;
                case 20: goto L_0x00e5;
                case 21: goto L_0x00d7;
                case 22: goto L_0x00c9;
                case 23: goto L_0x00bf;
                case 24: goto L_0x00ad;
                case 25: goto L_0x00a1;
                case 26: goto L_0x0068;
                case 27: goto L_0x0058;
                case 28: goto L_0x0014;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.Object r0 = r0.b
            android.hardware.camera2.CameraDevice r0 = (android.hardware.camera2.CameraDevice) r0
            r0.close()
            return
        L_0x0014:
            java.lang.Object r0 = r0.b
            fu1 r0 = (defpackage.fu1) r0
            r0.F0 = r4
            r0.E0 = r4
            r0.toString()
            int r1 = r0.S0
            int r1 = defpackage.au1.s(r1)
            if (r1 == r5) goto L_0x004b
            r2 = 4
            if (r1 == r2) goto L_0x004b
            r2 = 6
            if (r1 == r2) goto L_0x0031
            r0.toString()
            goto L_0x0057
        L_0x0031:
            int r1 = r0.v0
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = defpackage.fu1.v(r1)
            java.lang.String r2 = "OpenCameraConfigAndClose in error: "
            r2.concat(r1)
            r0.toString()
            eu1 r0 = r0.s0
            r0.b()
            goto L_0x0057
        L_0x0047:
            r0.J(r4)
            goto L_0x0057
        L_0x004b:
            java.util.LinkedHashMap r1 = r0.x0
            boolean r1 = r1.isEmpty()
            defpackage.c54.p(r3, r1)
            r0.u()
        L_0x0057:
            return
        L_0x0058:
            java.lang.Object r0 = r0.b
            nx0 r0 = (defpackage.nx0) r0
            java.lang.Object r1 = r0.s0
            lq1 r1 = (defpackage.lq1) r1
            if (r1 == 0) goto L_0x0067
            r1.b(r3)
            r0.s0 = r3
        L_0x0067:
            return
        L_0x0068:
            java.lang.Object r0 = r0.b
            ir1 r0 = (defpackage.ir1) r0
            z01 r1 = r0.b
            a11 r1 = (defpackage.a11) r1
            boolean r1 = r1.d()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0093
            r44 r0 = r0.s
            r0.getClass()
            sd7 r1 = r0.f
            if (r1 == 0) goto L_0x0086
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x0089
        L_0x0086:
            r0.a()
        L_0x0089:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            xpb r0 = r0.e
            r0.e(r1)
            goto L_0x00a0
        L_0x0093:
            khe r0 = r0.r
            java.lang.Object r0 = r0.getValue()
            si9 r0 = (defpackage.si9) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.g(r1)
        L_0x00a0:
            return
        L_0x00a1:
            java.lang.Object r0 = r0.b
            one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget r0 = (one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget) r0
            android.animation.ObjectAnimator r0 = r0.c
            if (r0 == 0) goto L_0x00ac
            r0.start()
        L_0x00ac:
            return
        L_0x00ad:
            java.lang.Object r0 = r0.b
            ip1 r0 = (defpackage.ip1) r0
            boolean r1 = r0.y0
            if (r1 != 0) goto L_0x00be
            gp1 r1 = r0.o
            if (r1 == 0) goto L_0x00bc
            r1.a(r5)
        L_0x00bc:
            r0.y0 = r5
        L_0x00be:
            return
        L_0x00bf:
            java.lang.Object r0 = r0.b
            mn1 r0 = (defpackage.mn1) r0
            vwe r1 = r0.N0
            r0.A(r1)
            return
        L_0x00c9:
            yxc r1 = one.me.calls.ui.ui.call.CallScreen.R0
            java.lang.Object r0 = r0.b
            one.me.calls.ui.ui.call.CallScreen r0 = (one.me.calls.ui.ui.call.CallScreen) r0
            znc r1 = r0.getRouter()
            r1.B(r0)
            return
        L_0x00d7:
            crd r1 = one.me.calls.ui.ui.incoming.CallIncomingScreen.Z
            java.lang.Object r0 = r0.b
            one.me.calls.ui.ui.incoming.CallIncomingScreen r0 = (one.me.calls.ui.ui.incoming.CallIncomingScreen) r0
            znc r1 = r0.getRouter()
            r1.B(r0)
            return
        L_0x00e5:
            java.lang.Object r0 = r0.b
            qv0 r0 = (defpackage.qv0) r0
            r0.invalidate()
            return
        L_0x00ed:
            java.lang.Object r0 = r0.b
            ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl r0 = (ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl) r0
            float r1 = r0.w0
            float r2 = r0.y0
            float r3 = r0.x0
            float r4 = r0.A0
            float r5 = r0.B0
            float r1 = r2 - r1
            float r2 = r2 - r3
            float r1 = r1 / r2
            float r5 = r5 - r4
            float r5 = r5 * r1
            float r5 = r5 + r4
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            java.util.HashSet r0 = r0.D0
            java.util.Iterator r0 = r0.iterator()
        L_0x010b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x012d
            java.lang.Object r2 = r0.next()
            ewa r2 = (defpackage.ewa) r2
            float r3 = r5 * r1
            r2.getClass()
            dwa r4 = new dwa
            r4.<init>(r3)
            r2.b(r4)
            int r3 = (int) r3
            java.lang.String r4 = "app.editor.width"
            jp r2 = r2.c
            r2.k(r3, r4)
            goto L_0x010b
        L_0x012d:
            return
        L_0x012e:
            int r1 = ru.ok.tamtam.android.services.BootCompletedReceiver.a
            java.lang.Object r0 = r0.b
            fke r0 = (defpackage.fke) r0
            jyc r0 = (defpackage.jyc) r0
            v4 r1 = r0.getAccessor()
            java.lang.Class<mle> r2 = defpackage.mle.class
            java.lang.Object r1 = r1.c(r2)
            mle r1 = (defpackage.mle) r1
            tle r1 = (defpackage.tle) r1
            r1.getClass()
            java.lang.String r2 = defpackage.tle.B0
            java.lang.String r3 = "onBootCompleted"
            defpackage.hm9.k(r2, r3)
            je7 r2 = r1.Y
            java.lang.Object r2 = r2.getValue()
            m7b r2 = (defpackage.m7b) r2
            p7b r2 = (defpackage.p7b) r2
            t33 r2 = r2.a
            r2.y(r5)
            je7 r2 = r1.x0
            java.lang.Object r2 = r2.getValue()
            yle r2 = (defpackage.yle) r2
            r2.f(r4)
            je7 r1 = r1.w0
            java.lang.Object r1 = r1.getValue()
            boe r1 = (defpackage.boe) r1
            r1.a()
            v4 r0 = r0.getAccessor()
            java.lang.Class<cea> r1 = defpackage.cea.class
            java.lang.Object r0 = r0.c(r1)
            cea r0 = (defpackage.cea) r0
            r0.c()
            return
        L_0x0183:
            java.lang.Object r0 = r0.b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r0.recycle()     // Catch:{ Exception -> 0x018a }
        L_0x018a:
            return
        L_0x018b:
            java.lang.Object r0 = r0.b
            am0 r0 = (defpackage.am0) r0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
            return
        L_0x0199:
            java.lang.Object r0 = r0.b
            gdf r0 = (defpackage.gdf) r0
            r0.c()
            return
        L_0x01a1:
            java.lang.Object r0 = r0.b
            mh0 r0 = (defpackage.mh0) r0
            android.view.View r0 = r0.a
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            r0.c()
            return
        L_0x01ad:
            java.lang.Object r0 = r0.b
            l7b r0 = (defpackage.l7b) r0
            r0.getClass()
            return
        L_0x01b5:
            java.lang.Object r0 = r0.b
            e70 r0 = (defpackage.e70) r0
            int r1 = r0.g
            int r1 = defpackage.au1.s(r1)
            if (r1 == r5) goto L_0x01c2
            goto L_0x01c7
        L_0x01c2:
            r0.g = r5
            r0.d()
        L_0x01c7:
            return
        L_0x01c8:
            java.lang.Object r0 = r0.b
            r20 r0 = (defpackage.r20) r0
            defpackage.b.super.invalidateSelf()
            return
        L_0x01d0:
            java.lang.Object r0 = r0.b
            iy r0 = (defpackage.iy) r0
            java.lang.Object r4 = r0.a
            monitor-enter(r4)
            boolean r3 = r0.m     // Catch:{ all -> 0x01dd }
            if (r3 == 0) goto L_0x01df
            monitor-exit(r4)     // Catch:{ all -> 0x01dd }
            goto L_0x0202
        L_0x01dd:
            r0 = move-exception
            goto L_0x0203
        L_0x01df:
            long r5 = r0.l     // Catch:{ all -> 0x01dd }
            r7 = 1
            long r5 = r5 - r7
            r0.l = r5     // Catch:{ all -> 0x01dd }
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x01ec
            monitor-exit(r4)     // Catch:{ all -> 0x01dd }
            goto L_0x0202
        L_0x01ec:
            if (r1 >= 0) goto L_0x01fe
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01dd }
            r1.<init>()     // Catch:{ all -> 0x01dd }
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x01dd }
            monitor-enter(r2)     // Catch:{ all -> 0x01dd }
            r0.n = r1     // Catch:{ all -> 0x01fb }
            monitor-exit(r2)     // Catch:{ all -> 0x01fb }
            monitor-exit(r4)     // Catch:{ all -> 0x01dd }
            goto L_0x0202
        L_0x01fb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01fb }
            throw r0     // Catch:{ all -> 0x01dd }
        L_0x01fe:
            r0.a()     // Catch:{ all -> 0x01dd }
            monitor-exit(r4)     // Catch:{ all -> 0x01dd }
        L_0x0202:
            return
        L_0x0203:
            monitor-exit(r4)     // Catch:{ all -> 0x01dd }
            throw r0
        L_0x0205:
            java.lang.Object r0 = r0.b
            pi r0 = (defpackage.pi) r0
            java.util.LinkedHashSet r1 = r0.g
            r1.clear()
            java.util.HashMap r1 = r0.e
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0227
            r1.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r0.f
            r0.clear()
            return
        L_0x0227:
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            defpackage.au1.r(r0)
            throw r3
        L_0x0235:
            java.lang.Object r0 = r0.b
            fg r0 = (defpackage.fg) r0
            qqd r0 = r0.c
            r0.getClass()
            long r6 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r0 = r0.b
            fg r0 = (defpackage.fg) r0
            r0.getClass()
            long r8 = android.os.SystemClock.uptimeMillis()
            r10 = r4
        L_0x024e:
            java.util.ArrayList r11 = r0.b
            int r12 = r11.size()
            if (r10 >= r12) goto L_0x039b
            java.lang.Object r11 = r11.get(r10)
            kwd r11 = (defpackage.kwd) r11
            if (r11 != 0) goto L_0x0265
            r1 = r5
            r30 = r6
            r16 = r8
            goto L_0x038f
        L_0x0265:
            qpd r12 = r0.a
            java.lang.Object r13 = r12.get(r11)
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 != 0) goto L_0x0270
            goto L_0x027b
        L_0x0270:
            long r13 = r13.longValue()
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x038a
            r12.remove(r11)
        L_0x027b:
            long r12 = r11.i
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 != 0) goto L_0x028e
            r11.i = r6
            float r12 = r11.b
            r11.e(r12)
            r30 = r6
            r16 = r8
            goto L_0x0388
        L_0x028e:
            long r12 = r6 - r12
            r11.i = r6
            fg r14 = defpackage.kwd.d()
            float r14 = r14.g
            r15 = 0
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 != 0) goto L_0x02a3
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x02a0:
            r21 = r12
            goto L_0x02a7
        L_0x02a3:
            float r12 = (float) r12
            float r12 = r12 / r14
            long r12 = (long) r12
            goto L_0x02a0
        L_0x02a7:
            boolean r12 = r11.o
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r12 == 0) goto L_0x02cc
            float r12 = r11.n
            int r14 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x02bb
            lwd r14 = r11.m
            double r1 = (double) r12
            r14.i = r1
            r11.n = r13
        L_0x02bb:
            lwd r1 = r11.m
            double r1 = r1.i
            float r1 = (float) r1
            r11.b = r1
            r11.a = r15
            r11.o = r4
            r30 = r6
            r16 = r8
            goto L_0x036d
        L_0x02cc:
            float r1 = r11.n
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0310
            lwd r1 = r11.m
            float r2 = r11.b
            r30 = r6
            double r5 = (double) r2
            float r2 = r11.a
            double r3 = (double) r2
            r16 = 2
            long r16 = r21 / r16
            r23 = r1
            r24 = r5
            r26 = r3
            r28 = r16
            bu4 r1 = r23.c(r24, r26, r28)
            lwd r2 = r11.m
            float r3 = r11.n
            double r3 = (double) r3
            r2.i = r3
            r11.n = r13
            float r3 = r1.a
            double r3 = (double) r3
            float r1 = r1.b
            double r5 = (double) r1
            r23 = r2
            r24 = r3
            r26 = r5
            r28 = r16
            bu4 r1 = r23.c(r24, r26, r28)
            float r2 = r1.a
            r11.b = r2
            float r1 = r1.b
            r11.a = r1
            goto L_0x032c
        L_0x0310:
            r30 = r6
            lwd r1 = r11.m
            float r2 = r11.b
            double r2 = (double) r2
            float r4 = r11.a
            double r4 = (double) r4
            r16 = r1
            r17 = r2
            r19 = r4
            bu4 r1 = r16.c(r17, r19, r21)
            float r2 = r1.a
            r11.b = r2
            float r1 = r1.b
            r11.a = r1
        L_0x032c:
            float r1 = r11.b
            float r2 = r11.h
            float r1 = java.lang.Math.max(r1, r2)
            r11.b = r1
            float r2 = r11.g
            float r1 = java.lang.Math.min(r1, r2)
            r11.b = r1
            float r2 = r11.a
            lwd r3 = r11.m
            r3.getClass()
            float r2 = java.lang.Math.abs(r2)
            double r4 = (double) r2
            r16 = r8
            double r7 = r3.e
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x036c
            double r4 = r3.i
            float r2 = (float) r4
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            double r1 = (double) r1
            double r3 = r3.d
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x036c
            lwd r1 = r11.m
            double r1 = r1.i
            float r1 = (float) r1
            r11.b = r1
            r11.a = r15
            r5 = 1
            goto L_0x036d
        L_0x036c:
            r5 = 0
        L_0x036d:
            float r1 = r11.b
            float r2 = r11.g
            float r1 = java.lang.Math.min(r1, r2)
            r11.b = r1
            float r2 = r11.h
            float r1 = java.lang.Math.max(r1, r2)
            r11.b = r1
            r11.e(r1)
            if (r5 == 0) goto L_0x0388
            r1 = 0
            r11.c(r1)
        L_0x0388:
            r1 = 1
            goto L_0x038f
        L_0x038a:
            r30 = r6
            r16 = r8
            r1 = r5
        L_0x038f:
            int r10 = r10 + r1
            r5 = r1
            r8 = r16
            r6 = r30
            r1 = 0
            r3 = 0
            r4 = 0
            goto L_0x024e
        L_0x039b:
            r1 = r5
            boolean r2 = r0.f
            if (r2 == 0) goto L_0x03cf
            int r2 = r11.size()
            int r2 = r2 - r1
        L_0x03a5:
            if (r2 < 0) goto L_0x03b3
            java.lang.Object r1 = r11.get(r2)
            if (r1 != 0) goto L_0x03b0
            r11.remove(r2)
        L_0x03b0:
            int r2 = r2 + -1
            goto L_0x03a5
        L_0x03b3:
            int r1 = r11.size()
            if (r1 != 0) goto L_0x03cb
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x03cb
            y7g r1 = r0.h
            java.lang.Object r2 = r1.b
            dg r2 = (defpackage.dg) r2
            boolean unused = android.animation.ValueAnimator.unregisterDurationScaleChangeListener(r2)
            r2 = 0
            r1.b = r2
        L_0x03cb:
            r1 = 0
            r0.f = r1
            goto L_0x03d0
        L_0x03cf:
            r1 = 0
        L_0x03d0:
            int r2 = r11.size()
            if (r2 <= 0) goto L_0x03e9
            ph4 r2 = r0.e
            r2.getClass()
            eg r3 = new eg
            b r0 = r0.d
            r3.<init>(r1, r0)
            java.lang.Object r0 = r2.a
            android.view.Choreographer r0 = (android.view.Choreographer) r0
            r0.postFrameCallback(r3)
        L_0x03e9:
            return
        L_0x03ea:
            bc7[] r1 = one.me.sdk.messagewrite.markdown.AddLinkBottomSheet.x0
            java.lang.Object r0 = r0.b
            cka r0 = (defpackage.cka) r0
            java.lang.CharSequence r1 = r0.getText()
            int r1 = r1.length()
            r0.setSelection(r1)
            return
        L_0x03fc:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.trim.ActTrimVideo r0 = (ru.ok.messages.media.trim.ActTrimVideo) r0
            we8 r1 = r0.V0
            if (r1 == 0) goto L_0x0415
            y7g r1 = r0.K0
            java.lang.Object r1 = r1.b
            ed3 r1 = (defpackage.ed3) r1
            y8a r1 = (defpackage.y8a) r1
            ye8 r1 = r1.k()
            we8 r0 = r0.V0
            r1.l(r0)
        L_0x0415:
            return
        L_0x0416:
            java.lang.Object r0 = r0.b
            a6 r0 = (defpackage.a6) r0
            r0.getClass()
            int r1 = ru.ok.messages.media.mediabar.ActLocalMedias.s1
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = (ru.ok.messages.media.mediabar.ActLocalMedias) r0
            r0.l0()
            return
        L_0x0427:
            java.lang.Object r0 = r0.b
            z5 r0 = (defpackage.z5) r0
            r0.getClass()
            int r1 = ru.ok.messages.media.mediabar.ActLocalMedias.s1
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = r0.b
            r0.l0()
            return
        L_0x0436:
            java.lang.Object r0 = r0.b
            ru.ok.messages.contacts.profile.ActContactAvatars r0 = (ru.ok.messages.contacts.profile.ActContactAvatars) r0
            androidx.viewpager.widget.ViewPager r1 = r0.V0
            int r1 = r1.getCurrentItem()
            r0.l0(r1)
            return
        L_0x0444:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            we8 r1 = r0.v1
            if (r1 == 0) goto L_0x045d
            y7g r1 = r0.K0
            java.lang.Object r1 = r1.b
            ed3 r1 = (defpackage.ed3) r1
            y8a r1 = (defpackage.y8a) r1
            ye8 r1 = r1.k()
            we8 r2 = r0.v1
            r1.l(r2)
        L_0x045d:
            we8 r1 = r0.w1
            if (r1 == 0) goto L_0x0472
            y7g r1 = r0.K0
            java.lang.Object r1 = r1.b
            ed3 r1 = (defpackage.ed3) r1
            y8a r1 = (defpackage.y8a) r1
            ye8 r1 = r1.k()
            we8 r2 = r0.w1
            r1.l(r2)
        L_0x0472:
            s20 r1 = r0.W0
            if (r1 == 0) goto L_0x04ae
            java.lang.String r1 = r0.g1
            boolean r1 = defpackage.oag.t(r1)
            if (r1 != 0) goto L_0x04ae
            s20 r1 = r0.W0
            java.lang.String r0 = r0.g1
            ru.ok.messages.media.attaches.fragments.FrgAttachView r0 = r1.k(r0)
            boolean r1 = r0 instanceof ru.ok.messages.media.attaches.fragments.FrgAttachVideo
            if (r1 == 0) goto L_0x04ae
            ru.ok.messages.media.attaches.fragments.FrgAttachVideo r0 = (ru.ok.messages.media.attaches.fragments.FrgAttachVideo) r0
            lj9 r1 = r0.N1
            if (r1 != 0) goto L_0x0491
            goto L_0x04ae
        L_0x0491:
            we8 r0 = r0.L1
            bq7 r0 = (defpackage.bq7) r0
            r0.g = r1
            fef r1 = r0.f
            if (r1 == 0) goto L_0x04ae
            int r1 = r0.j()
            int r2 = r0.h()
            int r3 = r0.i()
            ve8 r0 = r0.e
            if (r0 == 0) goto L_0x04ae
            r0.P(r1, r2, r3)
        L_0x04ae:
            return
        L_0x04af:
            r1 = 130(0x82, float:1.82E-43)
            java.lang.Object r0 = r0.b
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r0.fullScroll(r1)
            return
        L_0x04b9:
            java.lang.Object r0 = r0.b
            d r0 = (defpackage.d) r0
            a4c r1 = r0.v0
            java.lang.String r2 = "releaseInternal"
            java.lang.String r3 = "SlmsSource"
            r1.log(r3, r2)
            kq7 r1 = r0.z0
            if (r1 == 0) goto L_0x05b7
            kq7 r1 = r0.z0
            a4c r2 = r1.n
            java.lang.String r4 = "OKRTCLmsAdapter"
            java.lang.String r5 = "release"
            r2.log(r4, r5)
            m5d r2 = r1.D
            if (r2 == 0) goto L_0x04f2
            r6 = 0
            r2.b = r6
            java.lang.Object r6 = r2.c
            android.os.Handler r6 = (android.os.Handler) r6
            java.lang.Object r8 = r2.o
            gwe r8 = (defpackage.gwe) r8
            r6.removeCallbacks(r8)
            java.lang.Object r2 = r2.X
            kq7 r2 = (defpackage.kq7) r2
            a4c r2 = r2.n
            java.lang.String r6 = "Periodical screen dimensions check cancelled"
            r2.log(r4, r6)
        L_0x04f2:
            java.util.concurrent.CopyOnWriteArraySet r2 = r1.c
            r2.clear()
            r2 = 0
            r1.q = r2
            r1.a()
            tv1 r2 = r1.r
            if (r2 == 0) goto L_0x051f
            tv1 r2 = r1.r
            a4c r6 = r2.e
            java.lang.String r8 = "CameraCapturerAdapter"
            r6.log(r8, r5)
            java.util.concurrent.CopyOnWriteArraySet r5 = r2.f
            r5.clear()
            r2.b()
            wd6 r2 = r2.c
            java.lang.Object r2 = r2.b
            org.webrtc.CameraVideoCapturer r2 = (org.webrtc.CameraVideoCapturer) r2
            r2.dispose()
            r2 = 0
            r1.r = r2
            goto L_0x0520
        L_0x051f:
            r2 = 0
        L_0x0520:
            zuc r5 = r1.t
            if (r5 == 0) goto L_0x052b
            zuc r5 = r1.t
            r5.b()
            r1.t = r2
        L_0x052b:
            fwc r2 = r1.u
            if (r2 == 0) goto L_0x055b
            fwc r2 = r1.u
            boolean r5 = r2.c
            if (r5 == 0) goto L_0x0537
        L_0x0535:
            r2 = 0
            goto L_0x0559
        L_0x0537:
            z26 r5 = r2.Y
            if (r5 == 0) goto L_0x0541
            z26 r5 = r2.Y
            r6 = 0
            r5.d(r6)
        L_0x0541:
            mu3 r5 = r2.b
            dwc r6 = new dwc
            r8 = 0
            r6.<init>(r2, r8)
            r5.a(r6)
            mu3 r2 = r2.b
            r2.getClass()
            java.lang.Object r2 = r2.d     // Catch:{ InterruptedException -> 0x0535 }
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2     // Catch:{ InterruptedException -> 0x0535 }
            r2.await()     // Catch:{ InterruptedException -> 0x0535 }
            goto L_0x0535
        L_0x0559:
            r1.u = r2
        L_0x055b:
            java.lang.String r2 = "releaseScreenCastVideoTrack"
            a4c r5 = r1.n
            r5.log(r4, r2)
            yvc r2 = r1.z
            r2.m()
            r1.g()
            n60 r2 = r1.i
            r2.m()
            org.webrtc.MediaStream r2 = r1.h
            r2.dispose()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r5 = ": "
            r2.append(r5)
            org.webrtc.MediaStream r5 = r1.h
            java.lang.String r5 = defpackage.jb9.c(r5)
            r2.append(r5)
            java.lang.String r5 = " was disposed"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            a4c r1 = r1.n
            r1.log(r4, r2)
            a4c r1 = r0.v0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            kq7 r4 = r0.z0
            java.lang.String r4 = defpackage.jb9.c(r4)
            r2.append(r4)
            java.lang.String r4 = " was released"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.log(r3, r2)
            r1 = 0
            r0.z0 = r1
        L_0x05b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.run():void");
    }

    public /* synthetic */ b(l7b l7b, boolean z) {
        this.a = 13;
        this.b = l7b;
    }
}
