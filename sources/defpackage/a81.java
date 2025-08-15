package defpackage;

/* renamed from: a81  reason: default package */
public final /* synthetic */ class a81 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ a81(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.animation.Animator] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r15 = this;
            r0 = 2
            java.lang.String r1 = "Required value was null."
            r2 = 0
            r3 = 1
            r4 = 0
            int r5 = r15.a
            switch(r5) {
                case 0: goto L_0x051a;
                case 1: goto L_0x04a7;
                case 2: goto L_0x0494;
                case 3: goto L_0x039f;
                case 4: goto L_0x0275;
                case 5: goto L_0x0259;
                case 6: goto L_0x0225;
                case 7: goto L_0x01f1;
                case 8: goto L_0x01c0;
                case 9: goto L_0x019a;
                case 10: goto L_0x017f;
                case 11: goto L_0x0164;
                case 12: goto L_0x0141;
                case 13: goto L_0x011e;
                case 14: goto L_0x00aa;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r15.b
            see r0 = (defpackage.see) r0
            java.lang.Object r2 = r15.c
            sif r2 = (defpackage.sif) r2
            java.lang.Object r15 = r15.o
            eu4 r15 = (defpackage.eu4) r15
            android.util.Size r5 = r0.b
            ax1 r6 = r0.e
            boolean r6 = r6.d()
            java.lang.String r7 = r2.a
            ir6 r8 = defpackage.hm9.m
            if (r8 != 0) goto L_0x0026
            goto L_0x004f
        L_0x0026:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x004f
            us7 r9 = defpackage.us7.X
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "onInputSurface, surface_request_resolution="
            r10.<init>(r11)
            r10.append(r5)
            java.lang.String r11 = ", dr="
            r10.append(r11)
            r10.append(r15)
            java.lang.String r11 = ", isFrontCamera="
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            r8.d(r9, r7, r10, r4)
        L_0x004f:
            android.graphics.SurfaceTexture r4 = new android.graphics.SurfaceTexture
            fjf r7 = r2.u0
            if (r7 == 0) goto L_0x00a0
            java.lang.Object r1 = r7.c
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            defpackage.o76.d(r1, r3)
            java.lang.Object r1 = r7.e
            java.lang.Thread r1 = (java.lang.Thread) r1
            defpackage.o76.c(r1)
            int r1 = r7.b
            r4.<init>(r1)
            int r1 = r5.getWidth()
            int r5 = r5.getHeight()
            r4.setDefaultBufferSize(r1, r5)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r4)
            int r5 = r2.w0
            int r5 = r5 + r3
            r2.w0 = r5
            zh6 r3 = r2.X
            djb r5 = new djb
            r7 = 11
            r5.<init>((java.lang.Object) r2, (int) r7, (java.lang.Object) r15)
            r0.c(r3, r5)
            zh6 r15 = r2.X
            rif r3 = new rif
            r3.<init>(r2, r0, r4, r1)
            r0.b(r1, r15, r3)
            oif r15 = new oif
            r15.<init>(r2, r6)
            android.os.Handler r0 = r2.o
            r4.setOnFrameAvailableListener(r15, r0)
            e5f r15 = defpackage.e5f.a
            return r15
        L_0x00a0:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x00aa:
            java.lang.Object r0 = r15.b
            uu3 r0 = (defpackage.uu3) r0
            java.lang.Object r3 = r15.c
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r3 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r3
            java.lang.Object r15 = r15.o
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            int r5 = one.me.sdk.conductor.changehandlers.swipe.SwipeWidget.c
            android.view.View r5 = r0.getView()
            if (r5 != 0) goto L_0x00f6
            java.lang.String r5 = r3.a
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x00d2
            us7 r7 = defpackage.us7.X
            java.lang.String r8 = "getUnderlyingViewProvider: underlying view is null, inflating new one"
            r6.d(r7, r5, r8, r4)
        L_0x00d2:
            e54 r5 = defpackage.cv3.b
            bc7[] r6 = defpackage.cv3.a
            r2 = r6[r2]
            java.lang.Object r2 = r5.T0(r4, r2)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L_0x00ec
            java.lang.Object[] r1 = new java.lang.Object[]{r15}
            java.lang.Object r0 = r2.invoke(r0, r1)
            r5 = r0
            android.view.View r5 = (android.view.View) r5
            goto L_0x00f6
        L_0x00ec:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x00f6:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = r3.a
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0103
            goto L_0x0110
        L_0x0103:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0110
            us7 r2 = defpackage.us7.X
            java.lang.String r3 = "getUnderlyingViewProvider: underlying view is not attached, adding it to container"
            r1.d(r2, r0, r3, r4)
        L_0x0110:
            int r0 = defpackage.wwb.swipe_fade
            android.view.View r0 = r15.findViewById(r0)
            int r0 = r15.indexOfChild(r0)
            r15.addView(r5, r0)
        L_0x011d:
            return r5
        L_0x011e:
            java.lang.Object r0 = r15.c
            v6f r0 = (defpackage.v6f) r0
            d7f r0 = r0.a
            java.lang.String r0 = r0.a
            java.lang.Object r1 = r15.o
            it3 r1 = (defpackage.it3) r1
            java.lang.String r1 = r1.c
            java.lang.Object r15 = r15.b
            cge r15 = (defpackage.cge) r15
            w0f r15 = r15.a
            je7 r15 = r15.g
            java.lang.Object r15 = r15.getValue()
            af8 r15 = (defpackage.af8) r15
            cj0 r15 = (defpackage.cj0) r15
            java.lang.String r15 = r15.a(r0, r1)
            return r15
        L_0x0141:
            java.lang.Object r0 = r15.c
            lk3 r0 = (defpackage.lk3) r0
            android.view.View r0 = r0.getAnchorButton()
            java.lang.Object r1 = r15.b
            oce r1 = (defpackage.oce) r1
            one.me.sdk.messagewrite.mention.SuggestionsWidget r1 = (one.me.sdk.messagewrite.mention.SuggestionsWidget) r1
            yce r1 = r1.B0()
            lce r2 = new lce
            java.lang.Object r15 = r15.o
            rce r15 = (defpackage.rce) r15
            r2.<init>(r0, r15)
            q0e r15 = r1.K0
            r15.setValue(r2)
            e5f r15 = defpackage.e5f.a
            return r15
        L_0x0164:
            e19 r0 = new e19
            java.lang.Object r1 = r15.o
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            long r1 = r1.a
            java.lang.Object r3 = r15.c
            vqd r3 = (defpackage.vqd) r3
            r0.<init>(r3, r1, r4)
            java.lang.Object r15 = r15.b
            l53 r15 = (defpackage.l53) r15
            m56 r15 = r15.U0
            r15.invoke(r0)
            e5f r15 = defpackage.e5f.a
            return r15
        L_0x017f:
            e19 r0 = new e19
            java.lang.Object r1 = r15.o
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            long r1 = r1.a
            java.lang.Object r3 = r15.c
            vqd r3 = (defpackage.vqd) r3
            r0.<init>(r3, r1, r4)
            java.lang.Object r15 = r15.b
            l53 r15 = (defpackage.l53) r15
            m56 r15 = r15.U0
            r15.invoke(r0)
            e5f r15 = defpackage.e5f.a
            return r15
        L_0x019a:
            xh1 r0 = new xh1
            java.lang.Object r1 = r15.b
            je7 r1 = (defpackage.je7) r1
            java.lang.Object r1 = r1.getValue()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r15.c
            lkc r2 = (defpackage.lkc) r2
            khe r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            wh1 r2 = (defpackage.wh1) r2
            java.lang.Object r15 = r15.o
            je7 r15 = (defpackage.je7) r15
            java.lang.Object r15 = r15.getValue()
            y7d r15 = (defpackage.y7d) r15
            r0.<init>(r1, r2, r15)
            return r0
        L_0x01c0:
            jr2 r0 = new jr2
            qqd r6 = new qqd
            java.lang.Object r1 = r15.c
            je7 r1 = (defpackage.je7) r1
            java.lang.Object r1 = r1.getValue()
            nx3 r1 = (defpackage.nx3) r1
            java.lang.String r4 = "chat-subscribe"
            nx3 r1 = r1.limitedParallelism(r3, r4)
            r6.<init>((int) r2, (java.lang.Object) r1)
            b7c r10 = new b7c
            java.lang.Object r1 = r15.b
            ru.ok.onechat.reactions.ReactionsViewModel r1 = (ru.ok.onechat.reactions.ReactionsViewModel) r1
            r2 = 3
            r10.<init>(r1, r2)
            long r4 = r1.b
            iy2 r9 = r1.c
            java.lang.Object r15 = r15.o
            r7 = r15
            je7 r7 = (defpackage.je7) r7
            y7d r8 = r1.d
            r3 = r0
            r3.<init>(r4, r6, r7, r8, r9, r10)
            return r0
        L_0x01f1:
            java.lang.Object r1 = r15.b
            k56 r1 = (defpackage.k56) r1
            r1.invoke()
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            if (r0 == 0) goto L_0x0216
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
            zf r1 = new zf
            java.lang.Object r2 = r15.o
            android.view.View r2 = (android.view.View) r2
            r3 = 4
            r1.<init>(r2, r3)
            r0.addUpdateListener(r1)
            r4 = r0
        L_0x0216:
            java.lang.Object r15 = r15.c
            m1b r15 = (defpackage.m1b) r15
            r15.getClass()
            if (r4 == 0) goto L_0x0222
            r4.start()
        L_0x0222:
            e5f r15 = defpackage.e5f.a
            return r15
        L_0x0225:
            java.lang.Object r0 = r15.b
            u9a r0 = (defpackage.u9a) r0
            je7 r0 = r0.j
            java.lang.Object r0 = r0.getValue()
            t6b r0 = (defpackage.t6b) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.c
            java.lang.Object r2 = r15.c
            cu8 r2 = (defpackage.cu8) r2
            long r3 = r2.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            lr1 r4 = new lr1
            java.lang.Object r15 = r15.o
            e52 r15 = (defpackage.e52) r15
            r5 = 10
            r4.<init>(r0, r2, r15, r5)
            di r0 = new di
            r2 = 16
            r0.<init>(r2, r4)
            java.lang.Object r0 = r1.computeIfAbsent(r3, r0)
            u6b r0 = (defpackage.u6b) r0
            r0.h(r15)
            return r0
        L_0x0259:
            f8a r0 = new f8a
            java.lang.Object r1 = r15.o
            qi8 r1 = (defpackage.qi8) r1
            long r4 = r1.o
            java.lang.Object r1 = r1.b
            r6 = r1
            ol6 r6 = (defpackage.ol6) r6
            java.lang.Object r1 = r15.b
            r2 = r1
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r15 = r15.c
            r3 = r15
            je7 r3 = (defpackage.je7) r3
            r1 = r0
            r1.<init>(r2, r3, r4, r6)
            return r0
        L_0x0275:
            java.lang.Object r1 = r15.b
            one.me.android.OneMeApplication r1 = (one.me.android.OneMeApplication) r1
            java.lang.Object r2 = r15.c
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r15 = r15.o
            java.util.concurrent.atomic.AtomicReference r15 = (java.util.concurrent.atomic.AtomicReference) r15
            int r5 = one.me.android.OneMeApplication.s0
            q4a r5 = new q4a
            r6 = 19
            r5.<init>(r6)
            jyc r6 = defpackage.jyc.a
            f5a r7 = r6.d()
            boolean r7 = r7.d()
            if (r7 == 0) goto L_0x0366
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x0366
            long r8 = java.lang.System.nanoTime()
            dh0 r2 = defpackage.dh0.a
            v4 r2 = r2.getAccessor()
            java.lang.Class<q84> r10 = defpackage.q84.class
            java.lang.Object r2 = r2.c(r10)
            q84 r2 = (defpackage.q84) r2
            jw3 r10 = new jw3
            r10.<init>(r15, r0)
            r2.getClass()
            oz2 r0 = new oz2
            java.lang.String r2 = "all.chat.folder"
            r0.<init>(r2, r10)
            el3 r2 = r6.g()
            r2.b()
            y8a r2 = defpackage.y8a.a
            v4 r2 = r2.getAccessor()
            java.lang.Class<jh0> r10 = defpackage.jh0.class
            java.lang.Object r2 = r2.c(r10)
            jh0 r2 = (defpackage.jh0) r2
            r2.getClass()
            long r10 = java.lang.System.nanoTime()
            je7 r12 = r2.a
            java.lang.Object r12 = r12.getValue()
            eua r12 = (defpackage.eua) r12
            java.lang.String[] r13 = defpackage.eua.f
            boolean r12 = r12.b(r13)
            r12 = r12 ^ r3
            r2.e = r12
            je7 r12 = r2.a
            java.lang.Object r12 = r12.getValue()
            eua r12 = (defpackage.eua) r12
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 33
            if (r13 < r14) goto L_0x02ff
            java.lang.String[] r13 = defpackage.eua.k
            boolean r12 = r12.b(r13)
            goto L_0x0303
        L_0x02ff:
            r12.getClass()
            r12 = r3
        L_0x0303:
            r3 = r3 ^ r12
            r2.g = r3
            boolean r12 = r2.e
            if (r12 != 0) goto L_0x030c
            if (r3 == 0) goto L_0x0314
        L_0x030c:
            eh0 r3 = new eh0
            r3.<init>(r2, r0, r4)
            java.lang.Object unused = defpackage.j47.f0(defpackage.hz4.a, r3)
        L_0x0314:
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0319
            goto L_0x033d
        L_0x0319:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x033d
            us7 r2 = defpackage.us7.X
            int r3 = defpackage.ft4.o
            long r12 = java.lang.System.nanoTime()
            long r12 = r12 - r10
            kt4 r3 = defpackage.kt4.NANOSECONDS
            long r10 = defpackage.z7.S(r12, r3)
            java.lang.String r3 = defpackage.ft4.j(r10)
            java.lang.String r10 = "load time "
            java.lang.String r3 = r10.concat(r3)
            java.lang.String r10 = "BannersInitialDataStorage"
            r0.d(r2, r10, r3, r4)
        L_0x033d:
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0342
            goto L_0x0366
        L_0x0342:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0366
            us7 r2 = defpackage.us7.X
            int r3 = defpackage.ft4.o
            long r10 = java.lang.System.nanoTime()
            long r10 = r10 - r8
            kt4 r3 = defpackage.kt4.NANOSECONDS
            long r8 = defpackage.z7.S(r10, r3)
            java.lang.String r3 = defpackage.ft4.j(r8)
            java.lang.String r8 = "bannersInitialDataStorage.load by "
            java.lang.String r3 = r8.concat(r3)
            java.lang.String r8 = "InitialDataStorage"
            r0.d(r2, r8, r3, r4)
        L_0x0366:
            java.lang.Object r15 = r15.get()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x0380
            if (r7 != 0) goto L_0x0375
            goto L_0x0380
        L_0x0375:
            java.lang.String r15 = r1.Y
            java.lang.String r0 = "LegacyChats: sync load"
            defpackage.hm9.m(r15, r0, new java.lang.Object[0])
            r5.invoke()
            goto L_0x039c
        L_0x0380:
            java.lang.String r15 = r1.Y
            java.lang.String r0 = "LegacyChats: async load"
            defpackage.hm9.m(r15, r0, new java.lang.Object[0])
            kke r15 = r6.s()
            w9a r15 = (defpackage.w9a) r15
            nx3 r15 = r15.b()
            xq9 r0 = defpackage.xq9.a
            yh0 r1 = new yh0
            r2 = 6
            r1.<init>(r2, r5)
            r15.dispatch(r0, r1)
        L_0x039c:
            e5f r15 = defpackage.e5f.a
            return r15
        L_0x039f:
            java.lang.Object r0 = r15.b
            xe6 r0 = (defpackage.xe6) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x03ab
            goto L_0x0493
        L_0x03ab:
            java.lang.String r1 = "Start creating FirebaseApp"
            java.lang.String r5 = r0.b
            defpackage.hm9.m(r5, r1, new java.lang.Object[0])
            long r6 = java.lang.System.nanoTime()
            java.lang.Object r1 = r15.c
            je7 r1 = (defpackage.je7) r1
            java.lang.Object r8 = r1.getValue()
            y7d r8 = (defpackage.y7d) r8
            qyc r8 = (defpackage.qyc) r8
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f42fbexecreplace
            boolean r8 = r8.n(r9, r3)
            if (r8 == 0) goto L_0x0473
            java.lang.Object r1 = r1.getValue()
            y7d r1 = (defpackage.y7d) r1
            qyc r1 = (defpackage.qyc) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f41fbexecmodifiersnames
            java.lang.String r8 = r8.name()
            ne7 r1 = r1.g
            java.util.Set r1 = r1.getStringSet(r8, r4)
            if (r1 == 0) goto L_0x03f0
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r8)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L_0x03f2
        L_0x03f0:
            java.lang.String[] r1 = defpackage.y7d.b
        L_0x03f2:
            java.lang.String r8 = "ReplaceExecutorRegistrarLogic"
            java.lang.String r9 = "start"
            defpackage.hm9.m(r8, r9, new java.lang.Object[0])
            int r9 = r1.length
        L_0x03fa:
            if (r2 >= r9) goto L_0x040b
            r10 = r1[r2]
            java.lang.Class<java.lang.reflect.Field> r11 = java.lang.reflect.Field.class
            java.lang.reflect.Field r10 = r11.getDeclaredField(r10)     // Catch:{ all -> 0x0409 }
            r10.setAccessible(r3)     // Catch:{ all -> 0x0409 }
            r4 = r10
            goto L_0x040b
        L_0x0409:
            int r2 = r2 + r3
            goto L_0x03fa
        L_0x040b:
            if (r4 != 0) goto L_0x040e
            goto L_0x0473
        L_0x040e:
            java.lang.String r1 = "BG_EXECUTOR"
            java.lang.reflect.Field r1 = defpackage.mr0.C(r4, r1)
            java.lang.Object r15 = r15.o
            je7 r15 = (defpackage.je7) r15
            if (r1 == 0) goto L_0x0429
            z30 r2 = new z30
            r3 = 23
            r2.<init>(r3, r15)
            defpackage.mr0.T(r1, r2)
            java.lang.String r1 = "BG_EXECUTOR replaced"
            defpackage.hm9.m(r8, r1, new java.lang.Object[0])
        L_0x0429:
            java.lang.String r1 = "LITE_EXECUTOR"
            java.lang.reflect.Field r1 = defpackage.mr0.C(r4, r1)
            if (r1 == 0) goto L_0x0440
            z30 r2 = new z30
            r3 = 24
            r2.<init>(r3, r15)
            defpackage.mr0.T(r1, r2)
            java.lang.String r1 = "LITE_EXECUTOR replaced"
            defpackage.hm9.m(r8, r1, new java.lang.Object[0])
        L_0x0440:
            java.lang.String r1 = "BLOCKING_EXECUTOR"
            java.lang.reflect.Field r1 = defpackage.mr0.C(r4, r1)
            if (r1 == 0) goto L_0x0457
            z30 r2 = new z30
            r3 = 25
            r2.<init>(r3, r15)
            defpackage.mr0.T(r1, r2)
            java.lang.String r1 = "BLOCKING_EXECUTOR replaced"
            defpackage.hm9.m(r8, r1, new java.lang.Object[0])
        L_0x0457:
            java.lang.String r1 = "SCHEDULER"
            java.lang.reflect.Field r1 = defpackage.mr0.C(r4, r1)
            if (r1 == 0) goto L_0x046e
            z30 r2 = new z30
            r3 = 26
            r2.<init>(r3, r15)
            defpackage.mr0.T(r1, r2)
            java.lang.String r15 = "SCHEDULER replaced"
            defpackage.hm9.m(r8, r15, new java.lang.Object[0])
        L_0x046e:
            java.lang.String r15 = "finish"
            defpackage.hm9.m(r8, r15, new java.lang.Object[0])
        L_0x0473:
            android.content.Context r15 = r0.a
            fl5 r4 = defpackage.fl5.e(r15)
            int r15 = defpackage.ft4.o
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r6
            kt4 r15 = defpackage.kt4.NANOSECONDS
            long r0 = defpackage.z7.S(r0, r15)
            java.lang.String r15 = defpackage.ft4.j(r0)
            java.lang.String r0 = "End creating FirebaseApp. Takes "
            java.lang.String r15 = r0.concat(r15)
            defpackage.hm9.m(r5, r15, new java.lang.Object[0])
        L_0x0493:
            return r4
        L_0x0494:
            java.lang.Object r0 = r15.b
            ds3 r0 = (defpackage.ds3) r0
            el3 r0 = r0.a
            java.lang.Object r1 = r15.c
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r15 = r15.o
            ol3 r15 = (defpackage.ol3) r15
            java.util.List r15 = r0.t(r1, r15)
            return r15
        L_0x04a7:
            java.lang.Object r0 = r15.b
            eo1 r0 = (defpackage.eo1) r0
            java.lang.Object r1 = r15.c
            gg1 r1 = (defpackage.gg1) r1
            java.lang.Object r15 = r15.o
            java.lang.String r15 = (java.lang.String) r15
            je7 r3 = r0.d
            java.lang.Object r3 = r3.getValue()
            ez0 r3 = (defpackage.ez0) r3
            yz0 r3 = (defpackage.yz0) r3
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x04c2
            goto L_0x04e5
        L_0x04c2:
            r3.getClass()
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x04e5
            us7 r6 = defpackage.us7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Removing user "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r8 = " from call"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "CallAdminSettingsController"
            r5.d(r6, r8, r7, r4)
        L_0x04e5:
            fw3 r3 = r3.d()
            ru.ok.android.externcalls.sdk.Conversation r3 = r3.a()
            if (r3 == 0) goto L_0x04f6
            ru.ok.android.externcalls.sdk.id.ParticipantId r1 = defpackage.mqa.d(r1)
            r3.removeParticipant(r1, r2)
        L_0x04f6:
            kld r0 = r0.i
            uj1 r1 = defpackage.wj1.b
            uj1 r1 = new uj1
            int r2 = defpackage.b8a.R0
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            gqe r3 = new gqe
            java.util.List r15 = defpackage.ys.m0(r15)
            r3.<init>(r2, r15)
            int r15 = defpackage.x7a.A0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r1.<init>(r3, r15)
            r0.g(r1)
            e5f r15 = defpackage.e5f.a
            return r15
        L_0x051a:
            java.lang.Object r0 = r15.c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r15.b
            f81 r1 = (defpackage.f81) r1
            r1.x0 = r0
            java.lang.Object r15 = r15.o
            wj4 r15 = (defpackage.wj4) r15
            r15.getClass()
            y8 r0 = new y8
            r0.<init>((java.lang.Object) r1)
            r15.a(r0)
            e5f r15 = defpackage.e5f.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a81.invoke():java.lang.Object");
    }
}
