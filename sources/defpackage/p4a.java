package defpackage;

import one.me.android.OneMeApplication;

/* renamed from: p4a  reason: default package */
public final /* synthetic */ class p4a implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeApplication b;

    public /* synthetic */ p4a(OneMeApplication oneMeApplication, int i) {
        this.a = i;
        this.b = oneMeApplication;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [a66, ffe] */
    /* JADX WARNING: type inference failed for: r2v31, types: [a66, ffe] */
    /* JADX WARNING: type inference failed for: r1v32, types: [a66, ffe] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x05e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r18 = this;
            r1 = r18
            java.lang.Class<vi4> r0 = defpackage.vi4.class
            r2 = 12
            r3 = -1
            java.lang.Class<qyc> r5 = defpackage.qyc.class
            r6 = 14
            r7 = 0
            java.lang.Class<hyc> r8 = defpackage.hyc.class
            r9 = 3
            r10 = 5
            r11 = 0
            r12 = 2
            r13 = 1
            int r14 = r1.a
            switch(r14) {
                case 0: goto L_0x0679;
                case 1: goto L_0x0540;
                case 2: goto L_0x0530;
                case 3: goto L_0x0524;
                case 4: goto L_0x0518;
                case 5: goto L_0x04f2;
                case 6: goto L_0x04da;
                case 7: goto L_0x04b7;
                case 8: goto L_0x0497;
                case 9: goto L_0x046e;
                case 10: goto L_0x0454;
                case 11: goto L_0x0446;
                case 12: goto L_0x034f;
                case 13: goto L_0x01bb;
                case 14: goto L_0x0194;
                case 15: goto L_0x0123;
                case 16: goto L_0x00f6;
                case 17: goto L_0x0073;
                default: goto L_0x0019;
            }
        L_0x0019:
            int r0 = one.me.android.OneMeApplication.s0
            y8a r0 = defpackage.y8a.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<zaa> r2 = defpackage.zaa.class
            java.lang.Object r0 = r0.c(r2)
            zaa r0 = (defpackage.zaa) r0
            y77 r2 = defpackage.pag.a()
            jyc r3 = defpackage.jyc.a
            v4 r4 = r3.getAccessor()
            java.lang.Class<ox3> r5 = defpackage.ox3.class
            java.lang.Object r4 = r4.c(r5)
            ox3 r4 = (defpackage.ox3) r4
            lx3 r2 = r2.plus((defpackage.lx3) r4)
            kke r3 = r3.s()
            w9a r3 = (defpackage.w9a) r3
            cx7 r3 = r3.c()
            cx7 r3 = r3.getImmediate()
            lx3 r2 = r2.plus(r3)
            kotlinx.coroutines.internal.ContextScope r2 = defpackage.j1e.a(r2)
            x4f r3 = defpackage.ql4.b
            y4a r4 = new y4a
            one.me.android.OneMeApplication r1 = r1.b
            r4.<init>(r0, r1, r11)
            defpackage.j47.T(r2, r3, r11, r4, r12)
            j0e r0 = r0.a
            z4a r3 = new z4a
            r3.<init>(r1, r11)
            zn5 r1 = new zn5
            r1.<init>(r0, r3, r10)
            defpackage.od2.L(r1, r2)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0073:
            one.me.android.OneMeApplication r0 = r1.b
            int r1 = one.me.android.OneMeApplication.s0
            qx7 r1 = new qx7
            jyc r1 = defpackage.jyc.a
            ad r1 = r1.b()
            o7b r2 = defpackage.o7b.a
            v4 r2 = r2.getAccessor()
            java.lang.Object r2 = r2.c(r8)
            hyc r2 = (defpackage.hyc) r2
            java.lang.String r3 = "qx7"
            java.lang.String r4 = "execute"
            defpackage.hm9.m(r3, r4, new java.lang.Object[0])
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r4.getInstallerPackageName(r0)     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00e7
            int r4 = r0.length()
            if (r4 != 0) goto L_0x00a7
            goto L_0x00e7
        L_0x00a7:
            java.lang.String r4 = "execute: installer %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r0}
            defpackage.hm9.m(r3, r4, r5)
            r4 = 32
            r5 = 95
            java.lang.String r0 = r0.replace(r4, r5)
            r4 = 47
            java.lang.String r0 = r0.replace(r4, r5)
            ne7 r4 = r2.g
            java.lang.String r5 = "install-market"
            java.lang.String r4 = r4.getString(r5, r11)
            java.lang.String r6 = "execute: prevInstaller %s"
            java.lang.Object[] r7 = new java.lang.Object[]{r4}
            defpackage.hm9.m(r3, r6, r7)
            if (r4 == 0) goto L_0x00de
            int r3 = r4.length()
            if (r3 != 0) goto L_0x00d8
            goto L_0x00de
        L_0x00d8:
            boolean r3 = r4.equals(r0)
            if (r3 != 0) goto L_0x00f3
        L_0x00de:
            r2.m(r5, r0)
            java.lang.String r2 = "INSTALLER"
            r1.g(r2, r0)
            goto L_0x00f3
        L_0x00e7:
            java.lang.String r0 = "installer is empty"
            defpackage.hm9.m0(r3, r0, new java.lang.Object[0])
            goto L_0x00f3
        L_0x00ed:
            r0 = move-exception
            java.lang.String r1 = "could not get installer package name"
            defpackage.hm9.p(r3, r1, r0)
        L_0x00f3:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00f6:
            int r0 = one.me.android.OneMeApplication.s0
            ru.ok.messages.TimeChangeReceiver r0 = new ru.ok.messages.TimeChangeReceiver
            r0.<init>()
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.DATE_CHANGED"
            r2.<init>(r3)
            one.me.android.OneMeApplication r1 = r1.b
            r1.registerReceiver(r0, r2)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.TIME_SET"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.TIMEZONE_CHANGED"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            ru.ok.messages.TimeChangeReceiver.a(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0123:
            int r0 = one.me.android.OneMeApplication.s0
            x4a r0 = new x4a
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1)
            r1.registerActivityLifecycleCallbacks(r0)
            qx7 r2 = defpackage.qx7.c
            hr2 r3 = new hr2
            r3.<init>(r2, r13)
            one.me.android.di.ConcurrentComponent r2 = one.me.android.di.ConcurrentComponent.INSTANCE
            kke r4 = r2.getDispatchers()
            w9a r4 = (defpackage.w9a) r4
            nx3 r4 = r4.a()
            java.lang.String r5 = "chroma"
            nx3 r4 = r4.limitedParallelism(r13, r5)
            y77 r5 = defpackage.pag.a()
            lx3 r4 = r4.plus(r5)
            lx3 r4 = r4.plus(r3)
            kotlinx.coroutines.internal.ContextScope r4 = defpackage.j1e.a(r4)
            v4a r5 = new v4a
            r5.<init>(r1, r0, r11)
            defpackage.j47.T(r4, r11, r11, r5, r9)
            pq9 r0 = defpackage.qp4.u0
            qp4 r0 = r0.b(r1)
            java.lang.Object r0 = r0.t0
            w7c r0 = (defpackage.w7c) r0
            w4a r1 = new w4a
            r1.<init>(r12, r11)
            zn5 r4 = new zn5
            r4.<init>(r0, r1, r10)
            kke r0 = r2.getDispatchers()
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.a()
            y77 r1 = defpackage.pag.a()
            lx3 r0 = r0.plus(r1)
            lx3 r0 = r0.plus(r3)
            kotlinx.coroutines.internal.ContextScope r0 = defpackage.j1e.a(r0)
            defpackage.od2.L(r4, r0)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0194:
            int r0 = one.me.android.OneMeApplication.s0
            one.me.android.di.ConcurrentComponent r0 = one.me.android.di.ConcurrentComponent.INSTANCE
            kke r0 = r0.getDispatchers()
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.a()
            y77 r2 = defpackage.pag.a()
            lx3 r0 = r0.plus(r2)
            kotlinx.coroutines.internal.ContextScope r0 = defpackage.j1e.a(r0)
            t4a r2 = new t4a
            one.me.android.OneMeApplication r1 = r1.b
            r2.<init>(r1, r11)
            defpackage.j47.T(r0, r11, r11, r2, r9)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x01bb:
            int r0 = one.me.android.OneMeApplication.s0
            y8a r0 = defpackage.y8a.a
            o7b r0 = defpackage.o7b.a
            v4 r0 = r0.getAccessor()
            java.lang.Object r0 = r0.c(r8)
            hyc r0 = (defpackage.hyc) r0
            int r2 = defpackage.lz7.g
            java.lang.String r2 = r0.r()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "setupLocale "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "lz7"
            defpackage.hm9.m(r4, r3, new java.lang.Object[0])
            boolean r3 = defpackage.oag.t(r2)
            if (r3 == 0) goto L_0x0331
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.os.LocaleList r2 = r2.getLocales()
            java.util.Locale r2 = r2.get(r7)
            if (r2 != 0) goto L_0x01ff
            java.util.Locale r2 = java.util.Locale.ENGLISH
            goto L_0x0208
        L_0x01ff:
            java.lang.String r3 = r2.getLanguage()
            java.lang.String r5 = "user.systemLang"
            r0.m(r5, r3)
        L_0x0208:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "ru"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "en"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "az"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "de"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "hy"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "it"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "es"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "ka"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "kk"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "ky"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "ro"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "tg"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "tr"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "uk"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "uz"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "fa"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "ar"
            r5.<init>(r8)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r8 = "pt"
            r5.<init>(r8)
            r3.add(r5)
            java.lang.String r5 = r2.getLanguage()
            java.lang.String r8 = r2.getLanguage()
            java.util.Locale r9 = new java.util.Locale
            java.lang.String r10 = "be"
            r9.<init>(r10)
            java.util.Locale r10 = new java.util.Locale
            java.lang.String r11 = "bg"
            r10.<init>(r11)
            java.lang.String r9 = r9.getLanguage()
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x031a
            java.lang.String r9 = r10.getLanguage()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ec
            goto L_0x031a
        L_0x02ec:
            hb3 r3 = defpackage.qy9.j(r3)
            kp7 r7 = new kp7
            r7.<init>(r13)
            ty9 r8 = new ty9
            r8.<init>(r3, r7, r13)
            z16 r3 = new z16
            r3.<init>(r6, r2)
            vy9 r2 = new vy9
            r2.<init>(r8, r3)
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ r13
            if (r2 == 0) goto L_0x0318
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.getLanguage()
            goto L_0x031b
        L_0x0318:
            r2 = r5
            goto L_0x031b
        L_0x031a:
            r2 = r7
        L_0x031b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "setupLocaleInitial: "
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            defpackage.hm9.m(r4, r3, new java.lang.Object[0])
            java.lang.String r3 = "user.lang"
            r0.m(r3, r2)
        L_0x0331:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r2)
            java.util.Locale.setDefault(r0)
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>()
            r3 = 0
            r2.fontScale = r3
            r2.setLocale(r0)
            r2.setLayoutDirection(r0)
            one.me.android.OneMeApplication r0 = r1.b
            r0.createConfigurationContext(r2)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x034f:
            int r0 = one.me.android.OneMeApplication.s0
            o7b r0 = defpackage.o7b.a
            v4 r9 = r0.getAccessor()
            java.lang.Object r9 = r9.c(r5)
            qyc r9 = (defpackage.qyc) r9
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r14 = ru.ok.tamtam.android.prefs.PmsKey.f89mytrackerenabled
            boolean r9 = r9.n(r14, r13)
            if (r9 == 0) goto L_0x0443
            ul9 r9 = defpackage.ul9.a
            v4 r9 = r0.getAccessor()
            java.lang.Object r5 = r9.c(r5)
            qyc r5 = (defpackage.qyc) r5
            r5.getClass()
            boolean r9 = r5.n(r14, r13)
            r9 = r9 ^ r13
            if (r9 == 0) goto L_0x0380
            goto L_0x0443
        L_0x0380:
            v4 r0 = r0.getAccessor()
            java.lang.Object r0 = r0.c(r8)
            hyc r0 = (defpackage.hyc) r0
            long r8 = r0.t()
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x039e
            com.my.tracker.MyTrackerParams r3 = com.my.tracker.MyTracker.getTrackerParams()
            java.lang.String r4 = java.lang.String.valueOf(r8)
            r3.setCustomUserId(r4)
            goto L_0x03a5
        L_0x039e:
            com.my.tracker.MyTrackerParams r3 = com.my.tracker.MyTracker.getTrackerParams()
            r3.setCustomUserId(r11)
        L_0x03a5:
            com.my.tracker.MyTrackerConfig r3 = com.my.tracker.MyTracker.getTrackerConfig()
            jj9 r4 = new jj9
            r4.<init>((int) r6)
            com.my.tracker.MyTrackerConfig r3 = r3.setOkHttpClientProvider(r4)
            com.my.tracker.MyTrackerConfig r3 = r3.setKidMode(r7)
            khe r4 = defpackage.sd3.f
            java.lang.Object r4 = r4.getValue()
            iba r4 = (defpackage.iba) r4
            java.util.concurrent.ExecutorService r4 = r4.c()
            com.my.tracker.MyTrackerConfig r3 = r3.setBackgroundExecutor(r4)
            yt8 r4 = new yt8
            r4.<init>((int) r2, (java.lang.Object) r5)
            r3.setLogger(r4)
            jj9 r3 = new jj9
            r4 = 15
            r3.<init>((int) r4)
            com.my.tracker.MyTracker.setAttributionListener(r3)
            java.lang.String r3 = "34982109644049932883"
            one.me.android.OneMeApplication r1 = r1.b
            com.my.tracker.MyTracker.initTracker(r3, r1)
            zn5 r3 = r0.u()
            y98 r4 = new y98
            r4.<init>(r3)
            hb3 r3 = new hb3
            r3.<init>(r12, r4)
            kq1 r3 = defpackage.c37.c(r3)
            sl9 r4 = new sl9
            r4.<init>(r12, r11)
            zn5 r5 = new zn5
            r5.<init>(r3, r4, r10)
            kotlinx.coroutines.internal.ContextScope r3 = defpackage.ul9.b
            defpackage.od2.L(r5, r3)
            y8a r4 = defpackage.y8a.a
            v4 r5 = r4.getAccessor()
            java.lang.Class<vt7> r6 = defpackage.vt7.class
            java.lang.Object r5 = r5.c(r6)
            vt7 r5 = (defpackage.vt7) r5
            v7c r5 = r5.stream()
            ap8 r6 = new ap8
            r6.<init>(r5, r0, r12)
            m58 r0 = new m58
            r0.<init>(r6, r2)
            tl9 r2 = new tl9
            r2.<init>(r12, r11)
            zn5 r5 = new zn5
            r5.<init>(r0, r2, r10)
            defpackage.od2.L(r5, r3)
            java.lang.String r0 = com.my.tracker.MyTracker.getInstanceId(r1)     // Catch:{ all -> 0x0437 }
            ti4 r1 = r4.f()     // Catch:{ all -> 0x0437 }
            java.util.concurrent.atomic.AtomicReference r1 = r1.l     // Catch:{ all -> 0x0437 }
            r1.set(r0)     // Catch:{ all -> 0x0437 }
            goto L_0x0443
        L_0x0437:
            r0 = move-exception
            java.lang.Class<ul9> r1 = defpackage.ul9.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "fail to fetch mytracker instance id"
            defpackage.hm9.p(r1, r2, r0)
        L_0x0443:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0446:
            one.me.android.OneMeApplication r0 = r1.b
            int r1 = one.me.android.OneMeApplication.s0
            jj9 r1 = new jj9
            r1.<init>((one.me.android.OneMeApplication) r0)
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase.m = r1
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0454:
            int r0 = one.me.android.OneMeApplication.s0
            ey6 r0 = new ey6
            jyc r2 = defpackage.jyc.a
            zi5 r2 = r2.j()
            ww9 r3 = new ww9
            r3.<init>(r13)
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1, r2, r3)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x046e:
            int r0 = one.me.android.OneMeApplication.s0
            o7b r0 = defpackage.o7b.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<m7b> r2 = defpackage.m7b.class
            java.lang.Object r0 = r0.c(r2)
            m7b r0 = (defpackage.m7b) r0
            int r2 = defpackage.q6c.a
            one.me.android.OneMeApplication r1 = r1.b
            defpackage.oag.i(r1, r0)
            r2 = r0
            p7b r2 = (defpackage.p7b) r2
            qi4 r3 = new qi4
            r3.<init>(r1, r13, r0)
            z7d r0 = r2.b
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.l
            r0.add(r3)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0497:
            int r0 = one.me.android.OneMeApplication.s0
            y8a r0 = defpackage.y8a.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<aua> r2 = defpackage.aua.class
            java.lang.Object r0 = r0.c(r2)
            aua r0 = (defpackage.aua) r0
            r0.getClass()
            ie5 r2 = new ie5
            r2.<init>(r9, r0)
            one.me.android.OneMeApplication r0 = r1.b
            r0.registerActivityLifecycleCallbacks(r2)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x04b7:
            int r0 = one.me.android.OneMeApplication.s0
            java.lang.String[] r0 = defpackage.wmd.d
            java.lang.String[] r2 = defpackage.wmd.e
            one.me.android.OneMeApplication r1 = r1.b
            boolean r2 = defpackage.wmd.j(r1, r2)
            android.content.SharedPreferences r1 = defpackage.wmd.r(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
        L_0x04cb:
            if (r7 >= r12) goto L_0x04d4
            r3 = r0[r7]
            r1.putBoolean(r3, r2)
            int r7 = r7 + r13
            goto L_0x04cb
        L_0x04d4:
            r1.commit()
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x04da:
            int r0 = one.me.android.OneMeApplication.s0
            y8a r0 = defpackage.y8a.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<t7> r2 = defpackage.t7.class
            java.lang.Object r0 = r0.c(r2)
            t7 r0 = (defpackage.t7) r0
            one.me.android.OneMeApplication r1 = r1.b
            r1.registerActivityLifecycleCallbacks(r0)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x04f2:
            int r2 = one.me.android.OneMeApplication.s0
            y8a r2 = defpackage.y8a.a
            v4 r2 = r2.getAccessor()
            java.lang.Object r0 = r2.c(r0)
            vi4 r0 = (defpackage.vi4) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "performance.class = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            one.me.android.OneMeApplication r1 = r1.b
            java.lang.String r1 = r1.Y
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0518:
            int r0 = one.me.android.OneMeApplication.s0
            sld r0 = new sld
            khe r2 = defpackage.sd3.i
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1, r2)
            return r0
        L_0x0524:
            int r0 = one.me.android.OneMeApplication.s0
            pq9 r0 = defpackage.qp4.u0
            one.me.android.OneMeApplication r1 = r1.b
            r0.b(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0530:
            one.me.android.OneMeApplication r0 = r1.b
            int r1 = one.me.android.OneMeApplication.s0
            re6 r1 = new re6
            r2 = 22
            r1.<init>((int) r2, (java.lang.Object) r0)
            defpackage.j47.s0 = r1
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0540:
            one.me.android.OneMeApplication r1 = r1.b
            int r2 = one.me.android.OneMeApplication.s0
            y8a r2 = defpackage.y8a.a
            v4 r6 = r2.getAccessor()
            java.lang.Class<x6a> r7 = defpackage.x6a.class
            java.lang.Object r6 = r6.c(r7)
            x6a r6 = (defpackage.x6a) r6
            r6.getClass()
            o7b r6 = defpackage.o7b.a
            v4 r6 = r6.getAccessor()
            java.lang.Object r5 = r6.c(r5)
            qyc r5 = (defpackage.qyc) r5
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f6anrconfig
            java.lang.String r5 = r5.w(r6, r11)
            if (r5 != 0) goto L_0x056b
            goto L_0x0676
        L_0x056b:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x05d2 }
            r6.<init>((java.lang.String) r5)     // Catch:{ all -> 0x05d2 }
            java.lang.String r7 = "enabled"
            boolean r7 = r6.optBoolean(r7)     // Catch:{ all -> 0x05d2 }
            if (r7 != 0) goto L_0x057b
        L_0x0578:
            r0 = r11
            goto L_0x05e3
        L_0x057b:
            java.lang.String r7 = "timeout"
            org.json.JSONObject r6 = r6.optJSONObject(r7)     // Catch:{ all -> 0x05d2 }
            if (r6 != 0) goto L_0x0584
            goto L_0x0578
        L_0x0584:
            v4 r2 = r2.getAccessor()     // Catch:{ all -> 0x05d2 }
            java.lang.Object r0 = r2.c(r0)     // Catch:{ all -> 0x05d2 }
            vi4 r0 = (defpackage.vi4) r0     // Catch:{ all -> 0x05d2 }
            java.lang.String r2 = "low"
            long r7 = r6.optLong(r2, r3)     // Catch:{ all -> 0x05d2 }
            java.lang.String r2 = "avg"
            long r14 = r6.optLong(r2, r3)     // Catch:{ all -> 0x05d2 }
            java.lang.String r2 = "high"
            long r16 = r6.optLong(r2, r3)     // Catch:{ all -> 0x05d2 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x05bf
            if (r0 == r13) goto L_0x05b8
            if (r0 != r12) goto L_0x05b2
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x05af
            goto L_0x0578
        L_0x05af:
            r7 = r16
            goto L_0x05c4
        L_0x05b2:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x05d2 }
            r0.<init>()     // Catch:{ all -> 0x05d2 }
            throw r0     // Catch:{ all -> 0x05d2 }
        L_0x05b8:
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x05bd
            goto L_0x0578
        L_0x05bd:
            r7 = r14
            goto L_0x05c4
        L_0x05bf:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x05c4
            goto L_0x0578
        L_0x05c4:
            fk r0 = new fk     // Catch:{ all -> 0x05d2 }
            int r2 = defpackage.ft4.o     // Catch:{ all -> 0x05d2 }
            kt4 r2 = defpackage.kt4.MILLISECONDS     // Catch:{ all -> 0x05d2 }
            long r2 = defpackage.z7.S(r7, r2)     // Catch:{ all -> 0x05d2 }
            r0.<init>(r2)     // Catch:{ all -> 0x05d2 }
            goto L_0x05e3
        L_0x05d2:
            java.lang.String r0 = "invalid anr json config "
            java.lang.String r0 = r0.concat(r5)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            java.lang.String r3 = "AnrConfig"
            defpackage.hm9.p(r3, r0, r2)
            goto L_0x0578
        L_0x05e3:
            if (r0 != 0) goto L_0x05e7
            goto L_0x0676
        L_0x05e7:
            java.lang.String r1 = r1.Y
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x05ee
            goto L_0x0607
        L_0x05ee:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0607
            us7 r3 = defpackage.us7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "anr config = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2.d(r3, r1, r4, r11)
        L_0x0607:
            bkb r1 = new bkb
            khe r2 = defpackage.sd3.i
            java.lang.Object r3 = r2.getValue()
            kke r3 = (defpackage.kke) r3
            w9a r3 = (defpackage.w9a) r3
            cx7 r3 = r3.c()
            q4a r4 = new q4a
            r5 = 20
            r4.<init>(r5)
            r1.<init>(r0, r3, r4)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>(r13)
            kk r4 = new kk
            r4.<init>(r1, r11)
            mqc r1 = new mqc
            r1.<init>(r4)
            q9b r4 = defpackage.q9b.s0
            gh7 r5 = r4.Y
            fg7 r6 = defpackage.fg7.o
            kq1 r1 = defpackage.tu0.g(r1, r5, r6)
            b5a r5 = new b5a
            r5.<init>(r3, r0, r11)
            zn5 r0 = new zn5
            r0.<init>(r1, r5, r10)
            er2 r1 = new er2
            r1.<init>(r9, r11, r9)
            ac r3 = new ac
            r5 = 18
            r3.<init>(r0, r5, r1)
            java.lang.Object r0 = r2.getValue()
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.a()
            java.lang.String r1 = "AnrWatchDog-Observe"
            nx3 r0 = r0.limitedParallelism(r13, r1)
            mn5 r0 = defpackage.od2.F(r3, r0)
            rg7 r1 = defpackage.f46.J(r4)
            defpackage.od2.L(r0, r1)
        L_0x0676:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0679:
            int r0 = one.me.android.OneMeApplication.s0
            bg7 r0 = new bg7     // Catch:{ all -> 0x0684 }
            r0.<init>()     // Catch:{ all -> 0x0684 }
            r0.a()     // Catch:{ all -> 0x0684 }
            goto L_0x068e
        L_0x0684:
            r0 = move-exception
            one.me.android.OneMeApplication r1 = r1.b
            java.lang.String r1 = r1.Y
            java.lang.String r2 = "fail to upgrade library!"
            defpackage.hm9.p(r1, r2, r0)
        L_0x068e:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4a.invoke():java.lang.Object");
    }
}
