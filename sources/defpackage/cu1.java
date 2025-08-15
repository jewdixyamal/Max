package defpackage;

/* renamed from: cu1  reason: default package */
public final /* synthetic */ class cu1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cu1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r6.a
            switch(r3) {
                case 0: goto L_0x033c;
                case 1: goto L_0x0332;
                case 2: goto L_0x032a;
                case 3: goto L_0x0313;
                case 4: goto L_0x0300;
                case 5: goto L_0x02ea;
                case 6: goto L_0x02e2;
                case 7: goto L_0x02bc;
                case 8: goto L_0x0294;
                case 9: goto L_0x0278;
                case 10: goto L_0x0270;
                case 11: goto L_0x0266;
                case 12: goto L_0x0258;
                case 13: goto L_0x024e;
                case 14: goto L_0x0246;
                case 15: goto L_0x0238;
                case 16: goto L_0x0230;
                case 17: goto L_0x0210;
                case 18: goto L_0x01f5;
                case 19: goto L_0x00de;
                case 20: goto L_0x00c5;
                case 21: goto L_0x00b3;
                case 22: goto L_0x008a;
                case 23: goto L_0x0082;
                case 24: goto L_0x006a;
                case 25: goto L_0x0050;
                case 26: goto L_0x0034;
                case 27: goto L_0x0018;
                case 28: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r6 = r6.b
            x94 r6 = (defpackage.x94) r6
            r6.f(r1)
            return
        L_0x0010:
            java.lang.Object r6 = r6.b
            w94 r6 = (defpackage.w94) r6
            r6.f(r1)
            return
        L_0x0018:
            java.lang.Object r6 = r6.b
            z94 r6 = (defpackage.z94) r6
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x0021
            goto L_0x0033
        L_0x0021:
            fr4 r0 = r6.b
            if (r0 == 0) goto L_0x002a
            lr4 r1 = r6.a
            r0.f(r1)
        L_0x002a:
            ba4 r0 = r6.o
            java.util.Set r0 = r0.n
            r0.remove(r6)
            r6.c = r2
        L_0x0033:
            return
        L_0x0034:
            java.lang.Object r6 = r6.b
            y94 r6 = (defpackage.y94) r6
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x003d
            goto L_0x004f
        L_0x003d:
            er4 r0 = r6.b
            if (r0 == 0) goto L_0x0046
            kr4 r1 = r6.a
            r0.f(r1)
        L_0x0046:
            aa4 r0 = r6.o
            java.util.Set r0 = r0.n
            r0.remove(r6)
            r6.c = r2
        L_0x004f:
            return
        L_0x0050:
            java.lang.Object r6 = r6.b
            e84 r6 = (defpackage.e84) r6
            long r0 = r6.k0
            r3 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0069
            qqd r0 = r6.s
            java.lang.Object r0 = r0.b
            v78 r0 = (defpackage.v78) r0
            r0.b2 = r2
            r0 = 0
            r6.k0 = r0
        L_0x0069:
            return
        L_0x006a:
            java.lang.Object r6 = r6.b
            i74 r6 = (defpackage.i74) r6
            fd r0 = r6.b()
            v64 r1 = new v64
            r1.<init>((defpackage.fd) r0)
            r2 = 1028(0x404, float:1.44E-42)
            r6.I(r0, r2, r1)
            pm7 r6 = r6.Y
            r6.d()
            return
        L_0x0082:
            java.lang.Object r6 = r6.b
            org.webrtc.VpxDecoderWrapper r6 = (org.webrtc.VpxDecoderWrapper) r6
            r6.close()
            return
        L_0x008a:
            java.lang.Object r6 = r6.b
            ty2 r6 = (defpackage.ty2) r6
            java.lang.Object r6 = r6.Z
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            r0 = 8
            int r6 = r6.getAndSet(r0)
            int r6 = r6 - r0
            kye r0 = defpackage.kye.a
            js4 r0 = defpackage.kye.b()
            r0.getClass()
            ls4 r1 = new ls4
            java.lang.String r2 = "non_fatal"
            java.lang.String r3 = "max_non_fatals_per_session_reached"
            r1.<init>(r2, r3, r6)
            java.util.List r6 = java.util.Collections.singletonList(r1)
            r0.a(r6)
            return
        L_0x00b3:
            java.lang.Object r6 = r6.b
            androidx.work.CoroutineWorker r6 = (androidx.work.CoroutineWorker) r6
            dcd r0 = r6.b
            java.lang.Object r0 = r0.a
            boolean r0 = r0 instanceof defpackage.r0
            if (r0 == 0) goto L_0x00c4
            y77 r6 = r6.a
            r6.cancel(r1)
        L_0x00c4:
            return
        L_0x00c5:
            java.lang.Object r6 = r6.b
            rr3 r6 = (defpackage.rr3) r6
            java.util.HashSet r6 = r6.j
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x00d6
            return
        L_0x00d6:
            java.lang.Object r6 = r6.next()
            defpackage.au1.r(r6)
            throw r1
        L_0x00de:
            java.lang.Object r6 = r6.b
            androidx.work.impl.workers.ConstraintTrackingWorker r6 = (androidx.work.impl.workers.ConstraintTrackingWorker) r6
            dcd r0 = r6.o
            java.lang.Object r0 = r0.a
            boolean r0 = r0 instanceof defpackage.r0
            if (r0 == 0) goto L_0x00ec
            goto L_0x01f4
        L_0x00ec:
            d24 r0 = r6.getInputData()
            java.lang.String r1 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.lang.String r0 = r0.e(r1)
            a14 r1 = defpackage.a14.u()
            if (r0 == 0) goto L_0x01e4
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0104
            goto L_0x01e4
        L_0x0104:
            p8g r2 = r6.getWorkerFactory()
            android.content.Context r3 = r6.getApplicationContext()
            androidx.work.WorkerParameters r4 = r6.a
            gm7 r2 = r2.b(r3, r0, r4)
            r6.X = r2
            if (r2 != 0) goto L_0x0128
            java.lang.String r0 = defpackage.gj3.a
            java.lang.String r2 = "No worker to delegate to."
            r1.n(r0, r2)
            dcd r6 = r6.o
            cm7 r0 = defpackage.fm7.a()
            r6.j(r0)
            goto L_0x01f4
        L_0x0128:
            android.content.Context r2 = r6.getApplicationContext()
            s7g r2 = defpackage.s7g.d(r2)
            androidx.work.impl.WorkDatabase r3 = r2.c
            i8g r3 = r3.y()
            java.util.UUID r4 = r6.getId()
            java.lang.String r4 = r4.toString()
            h8g r3 = r3.l(r4)
            if (r3 != 0) goto L_0x0151
            dcd r6 = r6.o
            java.lang.String r0 = defpackage.gj3.a
            cm7 r0 = defpackage.fm7.a()
            r6.j(r0)
            goto L_0x01f4
        L_0x0151:
            adb r4 = new adb
            c8d r2 = r2.j
            r4.<init>((defpackage.c8d) r2, (defpackage.e7g) r6)
            java.util.List r2 = java.util.Collections.singletonList(r3)
            r4.w(r2)
            java.util.UUID r2 = r6.getId()
            java.lang.String r2 = r2.toString()
            boolean r2 = r4.b(r2)
            if (r2 == 0) goto L_0x01c1
            java.lang.String r2 = defpackage.gj3.a
            java.lang.String r3 = "Constraints met for delegate "
            java.lang.String r3 = r3.concat(r0)
            r1.n(r2, r3)
            gm7 r2 = r6.X     // Catch:{ all -> 0x018d }
            bm7 r2 = r2.startWork()     // Catch:{ all -> 0x018d }
            wt1 r3 = new wt1     // Catch:{ all -> 0x018d }
            r4 = 13
            r3.<init>(r6, r4, r2)     // Catch:{ all -> 0x018d }
            java.util.concurrent.Executor r4 = r6.getBackgroundExecutor()     // Catch:{ all -> 0x018d }
            r2.d(r3, r4)     // Catch:{ all -> 0x018d }
            goto L_0x01f4
        L_0x018d:
            r2 = move-exception
            java.lang.String r3 = defpackage.gj3.a
            java.lang.String r4 = "Delegated worker "
            java.lang.String r5 = " threw exception in startWork."
            java.lang.String r0 = defpackage.zr6.i(r4, r0, r5)
            r1.o(r3, r0, r2)
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
            boolean r2 = r6.c     // Catch:{ all -> 0x01b2 }
            if (r2 == 0) goto L_0x01b4
            java.lang.String r2 = "Constraints were unmet, Retrying."
            r1.n(r3, r2)     // Catch:{ all -> 0x01b2 }
            dcd r6 = r6.o     // Catch:{ all -> 0x01b2 }
            dm7 r1 = new dm7     // Catch:{ all -> 0x01b2 }
            r1.<init>()     // Catch:{ all -> 0x01b2 }
            r6.j(r1)     // Catch:{ all -> 0x01b2 }
            goto L_0x01bd
        L_0x01b2:
            r6 = move-exception
            goto L_0x01bf
        L_0x01b4:
            dcd r6 = r6.o     // Catch:{ all -> 0x01b2 }
            cm7 r1 = defpackage.fm7.a()     // Catch:{ all -> 0x01b2 }
            r6.j(r1)     // Catch:{ all -> 0x01b2 }
        L_0x01bd:
            monitor-exit(r0)
            goto L_0x01f4
        L_0x01bf:
            monitor-exit(r0)
            throw r6
        L_0x01c1:
            java.lang.String r2 = defpackage.gj3.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Constraints not met for delegate "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ". Requesting retry."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.n(r2, r0)
            dcd r6 = r6.o
            dm7 r0 = new dm7
            r0.<init>()
            r6.j(r0)
            goto L_0x01f4
        L_0x01e4:
            java.lang.String r0 = defpackage.gj3.a
            java.lang.String r2 = "No worker to delegate to."
            r1.q(r0, r2)
            dcd r6 = r6.o
            cm7 r0 = defpackage.fm7.a()
            r6.j(r0)
        L_0x01f4:
            return
        L_0x01f5:
            java.lang.Object r6 = r6.b
            lh3 r6 = (defpackage.lh3) r6
            java.util.concurrent.CopyOnWriteArraySet r6 = r6.i
            java.util.Iterator r6 = r6.iterator()
        L_0x01ff:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x020f
            java.lang.Object r0 = r6.next()
            fh3 r0 = (defpackage.fh3) r0
            r0.b()
            goto L_0x01ff
        L_0x020f:
            return
        L_0x0210:
            java.lang.Object r6 = r6.b
            cd3 r6 = (defpackage.cd3) r6
            int r0 = r6.x0
            int r0 = r0 - r2
            r6.x0 = r0
            if (r0 <= 0) goto L_0x021c
            goto L_0x0223
        L_0x021c:
            if (r0 < 0) goto L_0x0224
            lgf r6 = r6.o
            r6.a()
        L_0x0223:
            return
        L_0x0224:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r6 = r6.x0
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.<init>(r6)
            throw r0
        L_0x0230:
            java.lang.Object r6 = r6.b
            ac3 r6 = (defpackage.ac3) r6
            defpackage.ac3.a(r6)
            return
        L_0x0238:
            java.lang.Object r6 = r6.b
            vb3 r6 = (defpackage.vb3) r6
            java.lang.Runnable r0 = r6.b
            if (r0 == 0) goto L_0x0245
            r0.run()
            r6.b = r1
        L_0x0245:
            return
        L_0x0246:
            java.lang.Object r6 = r6.b
            h33 r6 = (defpackage.h33) r6
            r6.t(r2)
            return
        L_0x024e:
            bc7[] r0 = one.me.chats.search.ChatsListSearchScreen.J0
            java.lang.Object r6 = r6.b
            one.me.chats.search.ChatsListSearchScreen r6 = (one.me.chats.search.ChatsListSearchScreen) r6
            r6.q0()
            return
        L_0x0258:
            bc7[] r0 = one.me.chatscreen.ChatScreen.k1
            java.lang.Object r6 = r6.b
            one.me.chatscreen.ChatScreen r6 = (one.me.chatscreen.ChatScreen) r6
            cla r6 = r6.N0()
            r6.f(r2)
            return
        L_0x0266:
            java.lang.Object r6 = r6.b
            m62 r6 = (defpackage.m62) r6
            r6.O0 = r0
            r6.requestLayout()
            return
        L_0x0270:
            java.lang.Object r6 = r6.b
            com.google.android.material.carousel.CarouselLayoutManager r6 = (com.google.android.material.carousel.CarouselLayoutManager) r6
            r6.p0()
            return
        L_0x0278:
            java.lang.Object r6 = r6.b
            java.util.LinkedHashSet r6 = (java.util.LinkedHashSet) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0280:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0293
            java.lang.Object r0 = r6.next()
            ihe r0 = (defpackage.ihe) r0
            r0.getClass()
            r0.c(r0)
            goto L_0x0280
        L_0x0293:
            return
        L_0x0294:
            java.lang.Object r6 = r6.b
            sz1 r6 = (defpackage.sz1) r6
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            java.util.ArrayList r1 = r6.b     // Catch:{ all -> 0x02a5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x02a5 }
            if (r1 == 0) goto L_0x02a7
            monitor-exit(r0)     // Catch:{ all -> 0x02a5 }
            goto L_0x02b2
        L_0x02a5:
            r6 = move-exception
            goto L_0x02ba
        L_0x02a7:
            java.util.ArrayList r1 = r6.b     // Catch:{ all -> 0x02b3 }
            r6.i(r1)     // Catch:{ all -> 0x02b3 }
            java.util.ArrayList r6 = r6.b     // Catch:{ all -> 0x02a5 }
            r6.clear()     // Catch:{ all -> 0x02a5 }
            monitor-exit(r0)     // Catch:{ all -> 0x02a5 }
        L_0x02b2:
            return
        L_0x02b3:
            r1 = move-exception
            java.util.ArrayList r6 = r6.b     // Catch:{ all -> 0x02a5 }
            r6.clear()     // Catch:{ all -> 0x02a5 }
            throw r1     // Catch:{ all -> 0x02a5 }
        L_0x02ba:
            monitor-exit(r0)     // Catch:{ all -> 0x02a5 }
            throw r6
        L_0x02bc:
            java.lang.Object r6 = r6.b
            oz1 r6 = (defpackage.oz1) r6
            java.lang.Object r6 = r6.b
            l84 r6 = (defpackage.l84) r6
            java.lang.Object r6 = r6.a
            x9b r6 = (defpackage.x9b) r6
            if (r6 == 0) goto L_0x02e1
            yhc r6 = r6.f
            r6.getClass()
            defpackage.kq0.e()
            boolean r0 = r6.g
            if (r0 != 0) goto L_0x02e1
            boolean r0 = r6.h
            if (r0 == 0) goto L_0x02db
            goto L_0x02e1
        L_0x02db:
            r6.h = r2
            fc0 r6 = r6.a
            ey1 r6 = r6.c
        L_0x02e1:
            return
        L_0x02e2:
            java.lang.Object r6 = r6.b
            com.my.tracker.campaign.CampaignService r6 = (com.my.tracker.campaign.CampaignService) r6
            r6.stopSelf()
            return
        L_0x02ea:
            java.lang.Object r6 = r6.b
            ey1 r6 = (defpackage.ey1) r6
            java.lang.Object r0 = r6.b
            fu1 r0 = (defpackage.fu1) r0
            int r0 = r0.S0
            r1 = 9
            if (r0 != r1) goto L_0x02ff
            java.lang.Object r6 = r6.b
            fu1 r6 = (defpackage.fu1) r6
            r6.B()
        L_0x02ff:
            return
        L_0x0300:
            java.lang.Object r6 = r6.b
            tx1 r6 = (defpackage.tx1) r6
            yt1 r6 = (defpackage.yt1) r6
            fu1 r1 = r6.c
            int r1 = r1.S0
            r2 = 4
            if (r1 != r2) goto L_0x0312
            fu1 r6 = r6.c
            r6.J(r0)
        L_0x0312:
            return
        L_0x0313:
            java.lang.Object r6 = r6.b
            kw1 r6 = (defpackage.kw1) r6
            lw1 r0 = r6.c
            java.util.HashMap r2 = r0.h
            java.lang.Object r6 = r2.remove(r6)
            cdc r6 = (defpackage.cdc) r6
            if (r6 == 0) goto L_0x0329
            cdc r2 = r0.g
            if (r2 != r6) goto L_0x0329
            r0.g = r1
        L_0x0329:
            return
        L_0x032a:
            java.lang.Object r6 = r6.b
            eu6 r6 = (defpackage.eu6) r6
            r6.clear()
            return
        L_0x0332:
            java.lang.Object r6 = r6.b
            su1 r6 = (defpackage.su1) r6
            qu1 r6 = r6.i
            r6.c()
            return
        L_0x033c:
            java.lang.Object r6 = r6.b
            du1 r6 = (defpackage.du1) r6
            boolean r3 = r6.b
            if (r3 != 0) goto L_0x037b
            java.lang.Object r3 = r6.o
            eu1 r3 = (defpackage.eu1) r3
            fu1 r3 = r3.f
            int r3 = r3.S0
            r4 = 7
            if (r3 == r4) goto L_0x035a
            java.lang.Object r3 = r6.o
            eu1 r3 = (defpackage.eu1) r3
            fu1 r3 = r3.f
            int r3 = r3.S0
            r4 = 6
            if (r3 != r4) goto L_0x035b
        L_0x035a:
            r0 = r2
        L_0x035b:
            defpackage.c54.p(r1, r0)
            java.lang.Object r0 = r6.o
            eu1 r0 = (defpackage.eu1) r0
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0372
            java.lang.Object r6 = r6.o
            eu1 r6 = (defpackage.eu1) r6
            fu1 r6 = r6.f
            r6.I(r2)
            goto L_0x037b
        L_0x0372:
            java.lang.Object r6 = r6.o
            eu1 r6 = (defpackage.eu1) r6
            fu1 r6 = r6.f
            r6.J(r2)
        L_0x037b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu1.run():void");
    }
}
