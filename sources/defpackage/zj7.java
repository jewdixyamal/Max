package defpackage;

/* renamed from: zj7  reason: default package */
public final /* synthetic */ class zj7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [uu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r10 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = 4
            r2 = 2
            r3 = 6
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r10.a
            switch(r8) {
                case 0: goto L_0x0378;
                case 1: goto L_0x036f;
                case 2: goto L_0x0341;
                case 3: goto L_0x030f;
                case 4: goto L_0x0302;
                case 5: goto L_0x02e8;
                case 6: goto L_0x02d8;
                case 7: goto L_0x02b6;
                case 8: goto L_0x02ad;
                case 9: goto L_0x02a6;
                case 10: goto L_0x0299;
                case 11: goto L_0x026c;
                case 12: goto L_0x025d;
                case 13: goto L_0x021f;
                case 14: goto L_0x019a;
                case 15: goto L_0x0189;
                case 16: goto L_0x0168;
                case 17: goto L_0x0159;
                case 18: goto L_0x0147;
                case 19: goto L_0x013e;
                case 20: goto L_0x010e;
                case 21: goto L_0x00cc;
                case 22: goto L_0x00a8;
                case 23: goto L_0x009e;
                case 24: goto L_0x0094;
                case 25: goto L_0x008b;
                case 26: goto L_0x0057;
                case 27: goto L_0x0039;
                case 28: goto L_0x002a;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.Object r10 = r10.b
            fwa r10 = (defpackage.fwa) r10
            khe r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            float r10 = (float) r10
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r0 = r0 * r10
            float r10 = r10 - r0
            int r10 = (int) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        L_0x002a:
            java.lang.Object r10 = r10.b
            imc r10 = (defpackage.imc) r10
            java.lang.Object r10 = r10.b
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r0 = "permissions_prefs"
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r0, r7)
            return r10
        L_0x0039:
            java.lang.Object r10 = r10.b
            dua r10 = (defpackage.dua) r10
            je7 r0 = r10.b
            java.lang.Object r0 = r0.getValue()
            eua r0 = (defpackage.eua) r0
            java.lang.String[] r10 = r10.a
            boolean r10 = r0.b(r10)
            if (r10 == 0) goto L_0x0050
            bua r10 = defpackage.bua.a
            goto L_0x0052
        L_0x0050:
            bua r10 = defpackage.bua.b
        L_0x0052:
            q0e r10 = defpackage.r0e.a(r10)
            return r10
        L_0x0057:
            bc7[] r0 = one.me.sdk.permissionhost.PermissionBottomSheet.H0
            r1 = r0[r3]
            java.lang.Object r10 = r10.b
            one.me.sdk.permissionhost.PermissionBottomSheet r10 = (one.me.sdk.permissionhost.PermissionBottomSheet) r10
            fs r1 = r10.F0
            java.lang.Object r2 = r1.a(r10)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0088
            r0 = r0[r3]
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.b(r10, r0)
            uu3 r0 = r10.getTargetController()
            boolean r1 = r0 instanceof defpackage.nta
            if (r1 == 0) goto L_0x007f
            r6 = r0
            nta r6 = (defpackage.nta) r6
        L_0x007f:
            if (r6 == 0) goto L_0x0086
            boolean r0 = r10.G0
            r6.Y(r0)
        L_0x0086:
            r10.G0 = r7
        L_0x0088:
            e5f r10 = defpackage.e5f.a
            return r10
        L_0x008b:
            java.lang.Object r10 = r10.b
            one.me.sdk.richvector.internal.element.PathElement r10 = (one.me.sdk.richvector.internal.element.PathElement) r10
            android.graphics.Path r10 = one.me.sdk.richvector.internal.element.PathElement.path_delegate$lambda$0(r10)
            return r10
        L_0x0094:
            nz0 r0 = new nz0
            java.lang.Object r10 = r10.b
            cra r10 = (defpackage.cra) r10
            r0.<init>(r10, r4)
            return r0
        L_0x009e:
            ala r0 = new ala
            java.lang.Object r10 = r10.b
            cla r10 = (defpackage.cla) r10
            r0.<init>(r10)
            return r0
        L_0x00a8:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.lang.Object r10 = r10.b
            adb r10 = (defpackage.adb) r10
            java.lang.Object r10 = r10.a
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00b9:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00cb
            java.lang.Object r1 = r10.next()
            sba r1 = (defpackage.sba) r1
            java.lang.String r2 = r1.a
            r0.put(r2, r1)
            goto L_0x00b9
        L_0x00cb:
            return r0
        L_0x00cc:
            int r0 = defpackage.woc.o0
            java.lang.Object r10 = r10.b
            cka r10 = (defpackage.cka) r10
            android.content.Context r1 = r10.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.kt3.b(r1, r0)
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.tu0.G(r1)
            r0.setBounds(r7, r7, r2, r1)
            pq9 r1 = defpackage.qp4.u0
            fka r10 = r1.j(r10)
            bs6 r10 = r10.getIcon()
            int r10 = r10.j
            r0.setTint(r10)
            return r0
        L_0x010e:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.Object r10 = r10.b
            wja r10 = (defpackage.wja) r10
            xja r10 = r10.m1
            float r6 = r10.a
            r8 = 8
            float[] r8 = new float[r8]
            r8[r7] = r6
            r8[r4] = r6
            r8[r2] = r6
            r2 = 3
            r8[r2] = r6
            r8[r1] = r5
            r1 = 5
            r8[r1] = r5
            r8[r3] = r5
            r1 = 7
            r8[r1] = r5
            r0.setCornerRadii(r8)
            r0.setShape(r7)
            int r10 = r10.b
            r0.setSize(r7, r10)
            return r0
        L_0x013e:
            java.lang.Object r10 = r10.b
            b8c r10 = (defpackage.b8c) r10
            yic r10 = r10.f()
            return r10
        L_0x0147:
            gl8 r0 = new gl8
            java.lang.Object r10 = r10.b
            y7d r10 = (defpackage.y7d) r10
            qyc r10 = (defpackage.qyc) r10
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f80mediatransform
            java.lang.String r10 = r10.w(r1, r6)
            r0.<init>(r10)
            return r0
        L_0x0159:
            java.lang.Object r10 = r10.b
            kaa r10 = (defpackage.kaa) r10
            android.content.Context r10 = r10.a
            java.lang.String r0 = "notification"
            java.lang.Object r10 = r10.getSystemService(r0)
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            return r10
        L_0x0168:
            java.lang.Object r10 = r10.b
            caa r10 = (defpackage.caa) r10
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.s0 = r0
            r10.N0 = r1
            r10.u0 = r6
            r10.w0 = r6
            r10.v0 = r6
            android.text.TextPaint r0 = r10.G0
            int r1 = r10.M0
            r0.setAlpha(r1)
            android.graphics.drawable.GradientDrawable r10 = r10.C0
            r0 = 255(0xff, float:3.57E-43)
            r10.setAlpha(r0)
            e5f r10 = defpackage.e5f.a
            return r10
        L_0x0189:
            java.lang.Object r10 = r10.b
            d8a r10 = (defpackage.d8a) r10
            khe r10 = r10.b
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r10 = java.util.Collections.singletonList(r10)
            return r10
        L_0x019a:
            java.lang.Object r10 = r10.b
            java.util.concurrent.atomic.AtomicBoolean r10 = (java.util.concurrent.atomic.AtomicBoolean) r10
            int r0 = one.me.android.OneMeApplication.s0
            y8a r0 = defpackage.y8a.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<jh0> r1 = defpackage.jh0.class
            java.lang.Object r0 = r0.c(r1)
            jh0 r0 = (defpackage.jh0) r0
            r0.getClass()
            long r1 = java.lang.System.nanoTime()
            je7 r3 = r0.a
            java.lang.Object r3 = r3.getValue()
            eua r3 = (defpackage.eua) r3
            java.lang.String[] r5 = defpackage.eua.f
            boolean r3 = r3.b(r5)
            r3 = r3 ^ r4
            r0.e = r3
            je7 r3 = r0.a
            java.lang.Object r3 = r3.getValue()
            eua r3 = (defpackage.eua) r3
            int r5 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r5 < r8) goto L_0x01db
            java.lang.String[] r5 = defpackage.eua.k
            boolean r3 = r3.b(r5)
            goto L_0x01df
        L_0x01db:
            r3.getClass()
            r3 = r4
        L_0x01df:
            r3 = r3 ^ r4
            r0.g = r3
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x01e7
            goto L_0x020b
        L_0x01e7:
            boolean r5 = r3.c()
            if (r5 == 0) goto L_0x020b
            us7 r5 = defpackage.us7.X
            int r8 = defpackage.ft4.o
            long r8 = java.lang.System.nanoTime()
            long r8 = r8 - r1
            kt4 r1 = defpackage.kt4.NANOSECONDS
            long r1 = defpackage.z7.S(r8, r1)
            java.lang.String r1 = defpackage.ft4.j(r1)
            java.lang.String r2 = "checkMainBannerPermissions by "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "BannersInitialDataStorage"
            r3.d(r5, r2, r1, r6)
        L_0x020b:
            boolean r1 = r0.e
            if (r1 != 0) goto L_0x0218
            boolean r1 = r0.g
            if (r1 != 0) goto L_0x0218
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x0218
            goto L_0x0219
        L_0x0218:
            r4 = r7
        L_0x0219:
            r10.set(r4)
            e5f r10 = defpackage.e5f.a
            return r10
        L_0x021f:
            r1 = 64
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.tu0.G(r1)
            no9 r2 = new no9
            r2.<init>()
            java.lang.Object r10 = r10.b
            oo9 r10 = (defpackage.oo9) r10
            r2.setCallback(r10)
            pq9 r3 = defpackage.qp4.u0
            fka r10 = r3.j(r10)
            yld r10 = defpackage.oo9.q(r10)
            r2.b(r10)
            r2.setBounds(r7, r7, r1, r1)
            float r10 = (float) r1
            float r10 = r10 / r0
            bc7[] r0 = defpackage.no9.j
            r0 = r0[r7]
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            yj r1 = r2.i
            r1.o1(r2, r0, r10)
            return r2
        L_0x025d:
            java.lang.Object r10 = r10.b
            kg9 r10 = (defpackage.kg9) r10
            androidx.recyclerview.widget.RecyclerView r10 = r10.a
            android.content.Context r10 = r10.getContext()
            android.graphics.drawable.StateListDrawable r10 = defpackage.a14.m(r10)
            return r10
        L_0x026c:
            java.lang.Object r10 = r10.b
            ib9 r10 = (defpackage.ib9) r10
            android.graphics.Rect r1 = r10.getBounds()
            int r1 = r1.width()
            float r1 = (float) r1
            float r1 = r1 * r0
            float[] r0 = new float[r2]
            r0[r7] = r1
            r0[r4] = r5
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r1 = 10000(0x2710, double:4.9407E-320)
            r0.setDuration(r1)
            r1 = -1
            r0.setRepeatCount(r1)
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            r0.addUpdateListener(r10)
            return r0
        L_0x0299:
            java.lang.Object r10 = r10.b
            t68 r10 = (defpackage.t68) r10
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            return r10
        L_0x02a6:
            bc7[] r0 = one.me.messages.list.ui.MessagesListWidget.X0
            java.lang.Object r10 = r10.b
            android.view.View r10 = (android.view.View) r10
            return r10
        L_0x02ad:
            java.lang.Object r10 = r10.b
            one.me.messages.list.ui.recycler.MessagesLayoutManager r10 = (one.me.messages.list.ui.recycler.MessagesLayoutManager) r10
            r10.H = r7
            e5f r10 = defpackage.e5f.a
            return r10
        L_0x02b6:
            java.lang.Object r10 = r10.b
            dy8 r10 = (defpackage.dy8) r10
            boolean r0 = r10.isInEditMode()
            if (r0 == 0) goto L_0x02c3
            ee4 r10 = defpackage.ee4.e0
            goto L_0x02cd
        L_0x02c3:
            android.content.Context r10 = r10.getContext()
            khe r0 = defpackage.sme.a0
            sme r10 = defpackage.fm9.R(r10)
        L_0x02cd:
            is0 r10 = r10.g
            ls0 r10 = r10.d
            int r10 = r10.b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        L_0x02d8:
            c17 r0 = new c17
            java.lang.Object r10 = r10.b
            ht8 r10 = (defpackage.ht8) r10
            android.view.View r10 = r10.I0
            android.content.Context r10 = r10.getContext()
            r0.<init>(r10)
            return r0
        L_0x02e8:
            java.lang.Object r10 = r10.b
            jq8 r10 = (defpackage.jq8) r10
            y7d r10 = r10.X
            qyc r10 = (defpackage.qyc) r10
            r10.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f74maxreadmarks
            r1 = 300(0x12c, float:4.2E-43)
            long r1 = (long) r1
            long r0 = r10.q(r0, r1)
            int r10 = (int) r0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        L_0x0302:
            java.lang.Object r10 = r10.b
            bp8 r10 = (defpackage.bp8) r10
            k56 r10 = r10.X
            java.lang.Object r10 = r10.invoke()
            pc4 r10 = (defpackage.pc4) r10
            return r10
        L_0x030f:
            huc r0 = one.me.main.MainScreen.Z
            java.lang.Object r10 = r10.b
            one.me.main.MainScreen r10 = (one.me.main.MainScreen) r10
            android.os.Bundle r10 = r10.getArgs()
            java.lang.String r0 = "main:arg:deep_link"
            java.lang.String r10 = r10.getString(r0)
            if (r10 != 0) goto L_0x0323
            java.lang.String r10 = ""
        L_0x0323:
            bx7 r0 = defpackage.bx7.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<uq0> r1 = defpackage.uq0.class
            java.lang.Object r0 = r0.c(r1)
            uq0 r0 = (defpackage.uq0) r0
            jyc r1 = defpackage.jyc.a
            m7b r1 = r1.q()
            p7b r1 = (defpackage.p7b) r1
            jp r1 = r1.c
            ox7 r2 = new ox7
            r2.<init>(r1, r0, r10)
            return r2
        L_0x0341:
            bc7[] r0 = one.me.devmenu.logsviewer.LogsViewerScreen.Y
            cla r0 = new cla
            java.lang.Object r10 = r10.b
            one.me.devmenu.logsviewer.LogsViewerScreen r10 = (one.me.devmenu.logsviewer.LogsViewerScreen) r10
            android.content.Context r1 = r10.getContext()
            r0.<init>(r1, r3)
            int r1 = one.me.devmenu.logsviewer.LogsViewerScreen.Z
            r0.setId(r1)
            java.lang.String r1 = "Логи"
            r0.setTitle((java.lang.CharSequence) r1)
            uka r1 = defpackage.uka.a
            r0.setForm(r1)
            kka r1 = new kka
            jy2 r2 = new jy2
            r3 = 29
            r2.<init>(r3, r10)
            r1.<init>(r2)
            r0.setLeftActions(r1)
            return r0
        L_0x036f:
            java.lang.Object r10 = r10.b
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r10 = (ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker) r10
            fx4 r10 = ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker.emojiFontLoadingNotifications_delegate$lambda$0(r10)
            return r10
        L_0x0378:
            vw7 r0 = defpackage.vw7.c
            java.lang.Object r10 = r10.b
            ej7 r10 = (defpackage.ej7) r10
            aj7 r10 = (defpackage.aj7) r10
            java.lang.String r10 = r10.a
            f64 r0 = r0.P1()
            y7g r1 = new y7g
            r2 = 13
            r1.<init>((int) r2)
            java.lang.String r2 = ":call-join-preview"
            r1.b = r2
            java.lang.String r2 = "link"
            r1.D(r10, r2)
            android.net.Uri r10 = r1.r()
            r0.c(r10, r6)
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj7.invoke():java.lang.Object");
    }
}
