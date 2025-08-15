package defpackage;

import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: av2  reason: default package */
public final /* synthetic */ class av2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ av2(y9b y9b, l7g l7g) {
        this.a = 2;
        this.c = y9b;
        this.o = l7g;
        this.b = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = r0.Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2 = (defpackage.xff) ((java.util.ArrayDeque) r0.s0).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r2.run();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r0 = 1
            int r1 = r8.a
            switch(r1) {
                case 0: goto L_0x0162;
                case 1: goto L_0x0125;
                case 2: goto L_0x0117;
                case 3: goto L_0x00bf;
                case 4: goto L_0x007b;
                case 5: goto L_0x006d;
                case 6: goto L_0x002f;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r8.c
            pbg r0 = (defpackage.pbg) r0
            koc r0 = r0.a
            java.util.concurrent.atomic.AtomicReference r1 = r0.b
            java.lang.Object r1 = r1.get()
            e24 r1 = (defpackage.e24) r1
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.j
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x002e
            java.lang.Object r2 = r8.o
            e24 r2 = (defpackage.e24) r2
            if (r1 == r2) goto L_0x0023
            goto L_0x002e
        L_0x0023:
            boolean r8 = r8.b
            if (r8 == 0) goto L_0x002b
            r0.b()
            goto L_0x002e
        L_0x002b:
            r0.a()
        L_0x002e:
            return
        L_0x002f:
            java.lang.Object r0 = r8.c
            nx0 r0 = (defpackage.nx0) r0
            boolean r1 = r8.b
            java.lang.Object r8 = r8.o
            xff r8 = (defpackage.xff) r8
            r0.getClass()
            java.lang.Object r2 = r0.Z     // Catch:{ Exception -> 0x005e }
            monitor-enter(r2)     // Catch:{ Exception -> 0x005e }
            boolean r3 = r0.Y     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0049
            if (r1 != 0) goto L_0x0049
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            goto L_0x006c
        L_0x0047:
            r8 = move-exception
            goto L_0x0067
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
        L_0x004a:
            java.lang.Object r1 = r0.Z     // Catch:{ Exception -> 0x005e }
            monitor-enter(r1)     // Catch:{ Exception -> 0x005e }
            java.lang.Object r2 = r0.s0     // Catch:{ all -> 0x0064 }
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch:{ all -> 0x0064 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0064 }
            xff r2 = (defpackage.xff) r2     // Catch:{ all -> 0x0064 }
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0060
            r8.run()     // Catch:{ Exception -> 0x005e }
            goto L_0x006c
        L_0x005e:
            r8 = move-exception
            goto L_0x0069
        L_0x0060:
            r2.run()     // Catch:{ Exception -> 0x005e }
            goto L_0x004a
        L_0x0064:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ Exception -> 0x005e }
        L_0x0067:
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            throw r8     // Catch:{ Exception -> 0x005e }
        L_0x0069:
            r0.d(r8)
        L_0x006c:
            return
        L_0x006d:
            java.lang.Object r0 = r8.c
            bye r0 = (defpackage.bye) r0
            java.lang.Object r1 = r8.o
            lq1 r1 = (defpackage.lq1) r1
            boolean r8 = r8.b
            r0.a(r1, r8)
            return
        L_0x007b:
            java.lang.Object r1 = r8.o
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r2 = r8.b
            java.lang.Object r8 = r8.c
            ike r8 = (defpackage.ike) r8
            r8.getClass()
            java.lang.String r3 = "ike"
            long r4 = java.lang.System.currentTimeMillis()
            r8.g(r1, r2)     // Catch:{ Exception -> 0x0092 }
            goto L_0x00a4
        L_0x0092:
            r2 = move-exception
            java.lang.String r6 = "sync exception"
            defpackage.hm9.p(r3, r6, r2)
            ru.ok.tamtam.util.HandledException r6 = new ru.ok.tamtam.util.HandledException
            r6.<init>(r2)
            o45 r8 = r8.j
            cba r8 = (defpackage.cba) r8
            r8.c(r6, r0)
        L_0x00a4:
            long r6 = java.lang.System.currentTimeMillis()
            int r8 = r1.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            long r6 = r6 - r4
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            java.lang.String r0 = "syncWorker: sync %d ids done for %d"
            defpackage.hm9.m(r3, r0, r8)
            return
        L_0x00bf:
            java.lang.Object r1 = r8.c
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r8.o
            qne r2 = (defpackage.qne) r2
            r3 = 0
            int r4 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x00e0 }
            android.content.pm.ApplicationInfo r5 = r1.getApplicationInfo()     // Catch:{ all -> 0x00e0 }
            int r5 = r5.uid     // Catch:{ all -> 0x00e0 }
            if (r4 != r5) goto L_0x00d6
            r4 = r0
            goto L_0x00d7
        L_0x00d6:
            r4 = 0
        L_0x00d7:
            if (r4 != 0) goto L_0x00e2
            r1.getPackageName()     // Catch:{ all -> 0x00e0 }
        L_0x00dc:
            r2.d(r3)
            goto L_0x0112
        L_0x00e0:
            r8 = move-exception
            goto L_0x0113
        L_0x00e2:
            android.content.SharedPreferences r4 = defpackage.v3c.q(r1)     // Catch:{ all -> 0x00e0 }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x00e0 }
            java.lang.String r5 = "proxy_notification_initialized"
            r4.putBoolean(r5, r0)     // Catch:{ all -> 0x00e0 }
            r4.apply()     // Catch:{ all -> 0x00e0 }
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x00e0 }
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch:{ all -> 0x00e0 }
            boolean r8 = r8.b
            java.lang.String r1 = "com.google.android.gms"
            if (r8 == 0) goto L_0x0104
            r0.setNotificationDelegate(r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x00dc
        L_0x0104:
            java.lang.String r8 = r0.getNotificationDelegate()     // Catch:{ all -> 0x00e0 }
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x00e0 }
            if (r8 == 0) goto L_0x00dc
            r0.setNotificationDelegate(r3)     // Catch:{ all -> 0x00e0 }
            goto L_0x00dc
        L_0x0112:
            return
        L_0x0113:
            r2.d(r3)
            throw r8
        L_0x0117:
            java.lang.Object r0 = r8.c
            y9b r0 = (defpackage.y9b) r0
            java.lang.Object r1 = r8.o
            l7g r1 = (defpackage.l7g) r1
            boolean r8 = r8.b
            r0.b(r1, r8)
            return
        L_0x0125:
            java.lang.Object r0 = r8.c
            xs5 r0 = (defpackage.xs5) r0
            boolean r1 = r8.b
            java.lang.Object r8 = r8.o
            lq1 r8 = (defpackage.lq1) r8
            st1 r2 = r0.a
            ws5 r3 = r0.w
            qt1 r2 = r2.b
            java.lang.Object r2 = r2.b
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.remove(r3)
            r0.v = r1
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x014f
            if (r8 == 0) goto L_0x0161
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "Camera is not active."
            r0.<init>(r1)
            r8.d(r0)
            goto L_0x0161
        L_0x014f:
            st1 r1 = r0.a
            long r1 = r1.A()
            ws5 r3 = new ws5
            r3.<init>(r0, r1, r8)
            r0.w = r3
            st1 r8 = r0.a
            r8.p(r3)
        L_0x0161:
            return
        L_0x0162:
            bc7[] r1 = one.me.chats.search.ChatsListSearchScreen.J0
            boolean r1 = r8.b
            java.lang.Object r2 = r8.c
            one.me.chats.search.ChatsListSearchScreen r2 = (one.me.chats.search.ChatsListSearchScreen) r2
            if (r1 == 0) goto L_0x016f
            r2.q0()
        L_0x016f:
            je7 r1 = r2.s0
            java.lang.Object r1 = r1.getValue()
            bh0 r1 = (defpackage.bh0) r1
            w7c r1 = r1.s0
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            a3g r3 = r2.D0
            r3.E(r1)
            java.lang.Object r8 = r8.o
            it6 r8 = (defpackage.it6) r8
            java.util.List r1 = r8.b
            boolean r3 = r1.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x019a
            r9c r0 = defpackage.r9c.a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L_0x019c
        L_0x019a:
            nz4 r0 = defpackage.nz4.a
        L_0x019c:
            a3g r3 = r2.w0
            r3.E(r0)
            xq3 r0 = r2.x0
            r0.E(r1)
            a3g r0 = r2.y0
            java.util.List r8 = r8.c
            r0.E(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av2.run():void");
    }

    public /* synthetic */ av2(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
    }

    public /* synthetic */ av2(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.o = obj2;
    }

    public /* synthetic */ av2(boolean z, ChatsListSearchScreen chatsListSearchScreen, it6 it6) {
        this.a = 0;
        this.b = z;
        this.c = chatsListSearchScreen;
        this.o = it6;
    }
}
