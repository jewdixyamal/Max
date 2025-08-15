package defpackage;

import androidx.work.WorkRequest;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: vq1  reason: default package */
public final /* synthetic */ class vq1 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ vq1(k56 k56, k56 k562, CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, m56 m56) {
        this.a = 1;
        this.b = k56;
        this.c = k562;
        this.Y = callsAudioManagerV3Impl;
        this.o = str;
        this.X = m56;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v51, types: [java.lang.Throwable, one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.a
            switch(r0) {
                case 0: goto L_0x0388;
                case 1: goto L_0x0370;
                case 2: goto L_0x034a;
                case 3: goto L_0x02c2;
                case 4: goto L_0x0273;
                case 5: goto L_0x01a3;
                case 6: goto L_0x0153;
                case 7: goto L_0x00fe;
                case 8: goto L_0x00c9;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.Y
            s7g r0 = (defpackage.s7g) r0
            androidx.work.impl.WorkDatabase r2 = r0.c
            i8g r2 = r2.y()
            java.lang.Object r3 = r1.o
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r4 = r2.m(r3)
            int r5 = r4.size()
            r6 = 1
            java.lang.Object r7 = r1.c
            imc r7 = (defpackage.imc) r7
            if (r5 <= r6) goto L_0x0035
            mma r0 = new mma
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Can't apply UPDATE policy to the chains of work."
            r1.<init>(r2)
            r0.<init>(r1)
            r7.V(r0)
            goto L_0x00c8
        L_0x0035:
            java.lang.Object r4 = defpackage.x53.i0(r4)
            f8g r4 = (defpackage.f8g) r4
            java.lang.Object r5 = r1.b
            k56 r5 = (defpackage.k56) r5
            if (r4 != 0) goto L_0x0046
            r5.invoke()
            goto L_0x00c8
        L_0x0046:
            java.lang.String r6 = r4.a
            h8g r8 = r2.l(r6)
            if (r8 != 0) goto L_0x0066
            mma r0 = new mma
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "WorkSpec with "
            java.lang.String r4 = ", that matches a name \""
            java.lang.String r5 = "\", wasn't found"
            java.lang.String r2 = defpackage.k7d.j(r2, r6, r4, r3, r5)
            r1.<init>(r2)
            r0.<init>(r1)
            r7.V(r0)
            goto L_0x00c8
        L_0x0066:
            boolean r3 = r8.d()
            if (r3 != 0) goto L_0x007c
            mma r0 = new mma
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type."
            r1.<init>(r2)
            r0.<init>(r1)
            r7.V(r0)
            goto L_0x00c8
        L_0x007c:
            m7g r3 = defpackage.m7g.Y
            m7g r8 = r4.b
            if (r8 != r3) goto L_0x0089
            r2.e(r6)
            r5.invoke()
            goto L_0x00c8
        L_0x0089:
            java.lang.Object r1 = r1.X
            androidx.work.WorkRequest r1 = (androidx.work.WorkRequest) r1
            h8g r8 = r1.getWorkSpec()
            java.lang.String r9 = r4.a
            r14 = 0
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r17 = 1048574(0xffffe, float:1.469365E-39)
            h8g r22 = defpackage.h8g.b(r8, r9, r10, r11, r12, r13, r14, r16, r17)
            y9b r2 = r0.f     // Catch:{ all -> 0x00bf }
            androidx.work.impl.WorkDatabase r3 = r0.c     // Catch:{ all -> 0x00bf }
            me3 r4 = r0.b     // Catch:{ all -> 0x00bf }
            java.util.List r0 = r0.e     // Catch:{ all -> 0x00bf }
            java.util.Set r23 = r1.getTags()     // Catch:{ all -> 0x00bf }
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r0
            defpackage.tu0.N(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x00bf }
            oma r0 = defpackage.pma.Q     // Catch:{ all -> 0x00bf }
            r7.V(r0)     // Catch:{ all -> 0x00bf }
            goto L_0x00c8
        L_0x00bf:
            r0 = move-exception
            mma r1 = new mma
            r1.<init>(r0)
            r7.V(r1)
        L_0x00c8:
            return
        L_0x00c9:
            java.lang.Object r0 = r1.Y
            rdf r0 = (defpackage.rdf) r0
            ax1 r2 = r0.c()
            java.lang.Object r3 = r1.c
            ax1 r3 = (defpackage.ax1) r3
            if (r3 != r2) goto L_0x00fd
            r2 = 1
            java.lang.Object r4 = r1.b
            iee r4 = (defpackage.iee) r4
            see r2 = r4.d(r3, r2)
            r0.u = r2
            aa0 r2 = defpackage.sdf.b
            java.lang.Object r3 = r1.o
            sdf r3 = (defpackage.sdf) r3
            java.lang.Object r2 = r3.h(r2)
            wjf r2 = (defpackage.wjf) r2
            java.util.Objects.requireNonNull(r2)
            see r3 = r0.u
            java.lang.Object r1 = r1.X
            bue r1 = (defpackage.bue) r1
            r2.f(r3, r1)
            r0.P()
        L_0x00fd:
            return
        L_0x00fe:
            java.lang.Object r0 = r1.Y
            r6 = r0
            h7d r6 = (defpackage.h7d) r6
            java.util.Map r5 = r6.A()
            java.lang.Object r0 = r1.c
            r3 = r0
            org.webrtc.StatsReport[] r3 = (org.webrtc.StatsReport[]) r3
            int r0 = r3.length
            ar0[] r4 = new defpackage.ar0[r0]
            r0 = 0
            r2 = r0
        L_0x0111:
            int r7 = r3.length
            if (r2 >= r7) goto L_0x0145
            java.lang.Object r7 = r1.o
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r7.get(r2)
            dbg r7 = (defpackage.dbg) r7
            boolean r8 = r7.b
            if (r8 == 0) goto L_0x012c
            ar0 r7 = new ar0
            r8 = 0
            r9 = 1
            r7.<init>((java.lang.Object) r8, (boolean) r9)
            r4[r2] = r7
            goto L_0x0142
        L_0x012c:
            boolean r8 = r7.c
            if (r8 == 0) goto L_0x0135
            kg1 r7 = r6.v0
            fg1 r7 = r7.a
            goto L_0x013b
        L_0x0135:
            bg1 r7 = r7.a
            fg1 r7 = r6.z(r7)
        L_0x013b:
            ar0 r8 = new ar0
            r8.<init>((java.lang.Object) r7, (boolean) r0)
            r4[r2] = r8
        L_0x0142:
            int r2 = r2 + 1
            goto L_0x0111
        L_0x0145:
            java.lang.Object r0 = r1.X
            y1e r0 = (defpackage.y1e) r0
            java.lang.Object r1 = r1.b
            r2 = r1
            org.webrtc.StatsReport[] r2 = (org.webrtc.StatsReport[]) r2
            r1 = r0
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x0153:
            java.lang.Object r0 = r1.Y
            r2 = r0
            pl8 r2 = (defpackage.pl8) r2
            java.lang.Object r0 = r1.b
            h1f r0 = (defpackage.h1f) r0
            java.lang.Object r3 = r1.c
            dd3 r3 = (defpackage.dd3) r3
            java.lang.Object r4 = r1.o
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.X
            ol8 r1 = (defpackage.ol8) r1
            java.lang.Object r5 = r2.b
            java.lang.String r5 = (java.lang.String) r5
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x0171
            goto L_0x017f
        L_0x0171:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x017f
            us7 r7 = defpackage.us7.X
            r8 = 0
            java.lang.String r9 = "Transformer.startSafely"
            r6.d(r7, r5, r9, r8)
        L_0x017f:
            r0.e(r3, r4)     // Catch:{ all -> 0x0183 }
            goto L_0x01a2
        L_0x0183:
            r0 = move-exception
            r3 = r0
            java.lang.Object r0 = r2.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "Unexpected failure when start transformer"
            defpackage.hm9.p(r0, r2, r3)
            one.me.sdk.media.transformer.MediaTransformException r0 = new one.me.sdk.media.transformer.MediaTransformException
            r0.<init>(r2, r3)
            java.lang.String r2 = r1.b
            java.lang.String r3 = "onError"
            defpackage.hm9.p(r2, r3, r0)
            ml8 r2 = r1.a
            r2.a(r0)
            r1.a()
        L_0x01a2:
            return
        L_0x01a3:
            java.lang.Object r0 = r1.Y
            r2 = r0
            qi8 r2 = (defpackage.qi8) r2
            r2.getClass()
            java.lang.Object r0 = r1.b
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Object r3 = r1.c
            java.util.List r3 = (java.util.List) r3
            int r4 = r3.size()
            if (r0 != r4) goto L_0x0272
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            r6 = r5
        L_0x01c4:
            java.lang.Object r0 = r1.o
            java.util.List r0 = (java.util.List) r0
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x01fe
            java.lang.Object r0 = r0.get(r6)
            bm7 r0 = (defpackage.bm7) r0
            r7 = 0
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r0 = defpackage.fm9.C(r0)     // Catch:{ CancellationException | ExecutionException -> 0x01de }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ CancellationException | ExecutionException -> 0x01de }
            goto L_0x01e5
        L_0x01de:
            r0 = move-exception
            java.lang.String r8 = "Failed to get bitmap"
            defpackage.z04.s(r0, r8)
        L_0x01e4:
            r0 = r7
        L_0x01e5:
            java.lang.Object r8 = r3.get(r6)
            tb8 r8 = (defpackage.tb8) r8
            ja8 r0 = defpackage.gf7.g(r8, r0)
            long r8 = defpackage.gf7.p(r6)
            yh8 r10 = new yh8
            r10.<init>(r7, r0, r8)
            r4.add(r10)
            int r6 = r6 + 1
            goto L_0x01c4
        L_0x01fe:
            int r0 = defpackage.oaf.a
            r3 = 21
            java.lang.Object r2 = r2.X
            si8 r2 = (defpackage.si8) r2
            if (r0 >= r3) goto L_0x026d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r6 = r5
        L_0x0212:
            int r7 = r4.size()     // Catch:{ all -> 0x022f }
            if (r6 >= r7) goto L_0x0231
            java.lang.Object r7 = r4.get(r6)     // Catch:{ all -> 0x022f }
            android.os.Parcelable r7 = (android.os.Parcelable) r7     // Catch:{ all -> 0x022f }
            r3.writeParcelable(r7, r5)     // Catch:{ all -> 0x022f }
            int r8 = r3.dataSize()     // Catch:{ all -> 0x022f }
            r9 = 262144(0x40000, float:3.67342E-40)
            if (r8 >= r9) goto L_0x0231
            r0.add(r7)     // Catch:{ all -> 0x022f }
            int r6 = r6 + 1
            goto L_0x0212
        L_0x022f:
            r0 = move-exception
            goto L_0x0269
        L_0x0231:
            r3.recycle()
            int r3 = r0.size()
            java.lang.Object r1 = r1.X
            mue r1 = (defpackage.mue) r1
            int r4 = r1.p()
            if (r3 == r4) goto L_0x0263
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Sending "
            r3.<init>(r4)
            int r4 = r0.size()
            r3.append(r4)
            java.lang.String r4 = " items out of "
            r3.append(r4)
            int r1 = r1.p()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            defpackage.z04.J(r1)
        L_0x0263:
            bi8 r1 = r2.j
            defpackage.si8.L(r1, r0)
            goto L_0x0272
        L_0x0269:
            r3.recycle()
            throw r0
        L_0x026d:
            bi8 r0 = r2.j
            defpackage.si8.L(r0, r4)
        L_0x0272:
            return
        L_0x0273:
            java.lang.Object r0 = r1.Y
            r6 = r0
            kk4 r6 = (defpackage.kk4) r6
            r6.getClass()
            java.lang.Object r0 = r1.c
            r3 = r0
            org.webrtc.StatsReport[] r3 = (org.webrtc.StatsReport[]) r3
            int r0 = r3.length
            ar0[] r4 = new defpackage.ar0[r0]
            kg1 r0 = r6.v0
            fg1 r0 = r0.a
            java.lang.Object r2 = r1.o
            bg1 r2 = (defpackage.bg1) r2
            fg1 r2 = r6.z(r2)
            r5 = 0
            r7 = r5
        L_0x0291:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02b2
            r8 = r3[r7]
            java.lang.String r8 = r8.id
            java.lang.String r9 = "_recv"
            boolean r8 = r8.endsWith(r9)
            if (r8 == 0) goto L_0x02a8
            ar0 r8 = new ar0
            r8.<init>((java.lang.Object) r2, (boolean) r5)
            r4[r7] = r8
            goto L_0x02af
        L_0x02a8:
            ar0 r8 = new ar0
            r8.<init>((java.lang.Object) r0, (boolean) r5)
            r4[r7] = r8
        L_0x02af:
            int r7 = r7 + 1
            goto L_0x0291
        L_0x02b2:
            java.util.Map r5 = java.util.Collections.EMPTY_MAP
            java.lang.Object r0 = r1.X
            y1e r0 = (defpackage.y1e) r0
            java.lang.Object r1 = r1.b
            r2 = r1
            org.webrtc.StatsReport[] r2 = (org.webrtc.StatsReport[]) r2
            r1 = r0
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x02c2:
            java.lang.Object r0 = r1.Y
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            java.lang.Object r2 = r1.b
            qqd r2 = (defpackage.qqd) r2
            java.lang.Object r3 = r1.c
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r4 = r1.o
            a70 r4 = (defpackage.a70) r4
            java.lang.Object r1 = r1.X
            ae3 r1 = (defpackage.ae3) r1
            r5 = 0
            r0.flush()     // Catch:{ all -> 0x0313 }
            r0.release()     // Catch:{ all -> 0x0313 }
            if (r2 == 0) goto L_0x02f7
            android.os.Looper r0 = r3.getLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x02f7
            wt1 r0 = new wt1
            r6 = 18
            r0.<init>(r2, r6, r4)
            r3.post(r0)
        L_0x02f7:
            r1.g()
            java.lang.Object r6 = defpackage.e84.m0
            monitor-enter(r6)
            int r0 = defpackage.e84.o0     // Catch:{ all -> 0x030d }
            int r0 = r0 + -1
            defpackage.e84.o0 = r0     // Catch:{ all -> 0x030d }
            if (r0 != 0) goto L_0x030f
            java.util.concurrent.ExecutorService r0 = defpackage.e84.n0     // Catch:{ all -> 0x030d }
            r0.shutdown()     // Catch:{ all -> 0x030d }
            defpackage.e84.n0 = r5     // Catch:{ all -> 0x030d }
            goto L_0x030f
        L_0x030d:
            r0 = move-exception
            goto L_0x0311
        L_0x030f:
            monitor-exit(r6)     // Catch:{ all -> 0x030d }
            return
        L_0x0311:
            monitor-exit(r6)     // Catch:{ all -> 0x030d }
            throw r0
        L_0x0313:
            r0 = move-exception
            if (r2 == 0) goto L_0x032e
            android.os.Looper r6 = r3.getLooper()
            java.lang.Thread r6 = r6.getThread()
            boolean r6 = r6.isAlive()
            if (r6 == 0) goto L_0x032e
            wt1 r6 = new wt1
            r7 = 18
            r6.<init>(r2, r7, r4)
            r3.post(r6)
        L_0x032e:
            r1.g()
            java.lang.Object r2 = defpackage.e84.m0
            monitor-enter(r2)
            int r1 = defpackage.e84.o0     // Catch:{ all -> 0x0344 }
            int r1 = r1 + -1
            defpackage.e84.o0 = r1     // Catch:{ all -> 0x0344 }
            if (r1 != 0) goto L_0x0346
            java.util.concurrent.ExecutorService r1 = defpackage.e84.n0     // Catch:{ all -> 0x0344 }
            r1.shutdown()     // Catch:{ all -> 0x0344 }
            defpackage.e84.n0 = r5     // Catch:{ all -> 0x0344 }
            goto L_0x0346
        L_0x0344:
            r0 = move-exception
            goto L_0x0348
        L_0x0346:
            monitor-exit(r2)     // Catch:{ all -> 0x0344 }
            throw r0
        L_0x0348:
            monitor-exit(r2)     // Catch:{ all -> 0x0344 }
            throw r0
        L_0x034a:
            java.lang.Object r0 = r1.Y
            m5d r0 = (defpackage.m5d) r0
            r0.getClass()
            java.lang.Object r2 = r1.b
            zg3 r2 = (defpackage.zg3) r2
            bm7 r2 = r2.run()
            yg3 r3 = new yg3
            java.lang.Object r4 = r1.c
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            java.lang.Object r5 = r1.o
            ah3 r5 = (defpackage.ah3) r5
            java.lang.Object r1 = r1.X
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r3.<init>(r0, r4, r5, r1)
            nk4 r0 = defpackage.nk4.a
            r2.d(r3, r0)
            return
        L_0x0370:
            java.lang.Object r0 = r1.o
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.X
            m56 r2 = (defpackage.m56) r2
            java.lang.Object r3 = r1.b
            k56 r3 = (defpackage.k56) r3
            java.lang.Object r4 = r1.c
            k56 r4 = (defpackage.k56) r4
            java.lang.Object r1 = r1.Y
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl r1 = (ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl) r1
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.doOnOwnThreadUnsafe$lambda$8(r3, r4, r1, r0, r2)
            return
        L_0x0388:
            java.lang.Object r0 = r1.o
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.X
            m56 r2 = (defpackage.m56) r2
            java.lang.Object r3 = r1.Y
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl r3 = (ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl) r3
            java.lang.Object r4 = r1.b
            k56 r4 = (defpackage.k56) r4
            java.lang.Object r1 = r1.c
            k56 r1 = (defpackage.k56) r1
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.doOnOwnThread$lambda$8(r3, r4, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq1.run():void");
    }

    public /* synthetic */ vq1(s7g s7g, String str, imc imc, t8g t8g, WorkRequest workRequest) {
        this.a = 9;
        this.Y = s7g;
        this.o = str;
        this.c = imc;
        this.b = t8g;
        this.X = workRequest;
    }

    public /* synthetic */ vq1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.Y = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
        this.X = obj5;
    }
}
