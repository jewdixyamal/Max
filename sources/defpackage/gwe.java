package defpackage;

/* renamed from: gwe  reason: default package */
public final class gwe implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gwe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L_0x01e2;
                case 1: goto L_0x01a7;
                case 2: goto L_0x019f;
                case 3: goto L_0x0186;
                case 4: goto L_0x017d;
                case 5: goto L_0x0171;
                case 6: goto L_0x015c;
                case 7: goto L_0x013a;
                case 8: goto L_0x0116;
                case 9: goto L_0x010e;
                case 10: goto L_0x00f2;
                case 11: goto L_0x00e2;
                case 12: goto L_0x00e0;
                case 13: goto L_0x00af;
                case 14: goto L_0x00a0;
                case 15: goto L_0x0085;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r8 = r8.b
            cjg r8 = (defpackage.cjg) r8
            java.lang.Object r0 = r8.a
            android.content.Context r0 = (android.content.Context) r0
            android.content.SharedPreferences r0 = defpackage.cjg.i(r0)
            java.lang.String r1 = "app_set_id_last_used_time"
            r2 = -1
            long r4 = r0.getLong(r1, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0024
            r6 = 33696000000(0x7d8702800, double:1.66480360023E-313)
            long r4 = r4 + r6
            goto L_0x0025
        L_0x0024:
            r4 = r2
        L_0x0025:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0084
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            java.lang.Object r8 = r8.a
            android.content.Context r8 = (android.content.Context) r8
            android.content.SharedPreferences r0 = defpackage.cjg.i(r8)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "app_set_id"
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = r8.getPackageName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = "Failed to clear app set ID generated for App "
            r2.concat(r0)
        L_0x005c:
            java.lang.String r0 = "app_set_id_storage"
            r2 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L_0x0084
            java.lang.String r8 = r8.getPackageName()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "Failed to clear app set ID last used time for App "
            r0.concat(r8)
        L_0x0084:
            return
        L_0x0085:
            java.lang.Object r0 = r8.b
            gig r0 = (defpackage.gig) r0
            java.lang.Object r0 = r0.c
            monitor-enter(r0)
            java.lang.Object r8 = r8.b     // Catch:{ all -> 0x009a }
            gig r8 = (defpackage.gig) r8     // Catch:{ all -> 0x009a }
            java.lang.Object r8 = r8.o     // Catch:{ all -> 0x009a }
            k3a r8 = (defpackage.k3a) r8     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x009c
            r8.d()     // Catch:{ all -> 0x009a }
            goto L_0x009c
        L_0x009a:
            r8 = move-exception
            goto L_0x009e
        L_0x009c:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            return
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            throw r8
        L_0x00a0:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "TIMEOUT"
            r0.<init>(r1)
            java.lang.Object r8 = r8.b
            qne r8 = (defpackage.qne) r8
            r8.c(r0)
            return
        L_0x00af:
            java.lang.Object r8 = r8.b
            orf r8 = (defpackage.orf) r8
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            boolean r1 = r8.b()     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x00c0
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            goto L_0x00dd
        L_0x00be:
            r8 = move-exception
            goto L_0x00de
        L_0x00c0:
            java.lang.String r1 = r8.j     // Catch:{ all -> 0x00be }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            r1.concat(r2)     // Catch:{ all -> 0x00be }
            r8.d()     // Catch:{ all -> 0x00be }
            boolean r1 = r8.b()     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x00d6
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            goto L_0x00dd
        L_0x00d6:
            r1 = 1
            r8.c = r1     // Catch:{ all -> 0x00be }
            r8.e()     // Catch:{ all -> 0x00be }
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
        L_0x00dd:
            return
        L_0x00de:
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            throw r8
        L_0x00e0:
            r8 = 0
            throw r8
        L_0x00e2:
            java.lang.Object r8 = r8.b
            xdg r8 = (defpackage.xdg) r8
            od r8 = r8.j
            ph3 r0 = new ph3
            r1 = 4
            r0.<init>(r1)
            r8.i(r0)
            return
        L_0x00f2:
            java.lang.Object r8 = r8.b
            y7f r8 = (defpackage.y7f) r8
            java.lang.Object r8 = r8.b
            kdg r8 = (defpackage.kdg) r8
            ok r8 = r8.d
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " disconnecting because it was signed out."
            java.lang.String r0 = r0.concat(r1)
            r8.b(r0)
            return
        L_0x010e:
            java.lang.Object r8 = r8.b
            kdg r8 = (defpackage.kdg) r8
            r8.e()
            return
        L_0x0116:
            java.lang.Object r0 = r8.b
            m5d r0 = (defpackage.m5d) r0
            java.lang.Object r1 = r0.X     // Catch:{ all -> 0x012b }
            kq7 r1 = (defpackage.kq7) r1     // Catch:{ all -> 0x012b }
            java.util.concurrent.Executor r1 = r1.g     // Catch:{ all -> 0x012b }
            ule r2 = new ule     // Catch:{ all -> 0x012b }
            r3 = 23
            r2.<init>(r3, r8)     // Catch:{ all -> 0x012b }
            r1.execute(r2)     // Catch:{ all -> 0x012b }
            goto L_0x0139
        L_0x012b:
            r8 = move-exception
            java.lang.Object r0 = r0.X
            kq7 r0 = (defpackage.kq7) r0
            a4c r0 = r0.n
            java.lang.String r1 = "OKRTCLmsAdapter"
            java.lang.String r2 = "Unexpected executor usage error"
            r0.logException(r1, r2, r8)
        L_0x0139:
            return
        L_0x013a:
            java.lang.Object r8 = r8.b
            py0 r8 = (defpackage.py0) r8
            a4c r0 = r8.V0
            java.lang.String r1 = "OKRTCCall"
            java.lang.String r2 = "💀 pc.timeout"
            r0.log(r1, r2)
            ji6 r0 = defpackage.ji6.a
            r8.d(r0)
            r8.Q0 = r0
            va8 r0 = r8.k2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$PeerConnectionTimeout r1 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.PeerConnectionTimeout.INSTANCE
            r0.E(r1)
            w51 r0 = defpackage.w51.c
            r1 = 0
            r8.k(r0, r1)
            return
        L_0x015c:
            java.lang.Object r8 = r8.b
            androidx.work.Worker r8 = (androidx.work.Worker) r8
            fm7 r0 = r8.b()     // Catch:{ all -> 0x016a }
            dcd r1 = r8.a     // Catch:{ all -> 0x016a }
            r1.j(r0)     // Catch:{ all -> 0x016a }
            goto L_0x0170
        L_0x016a:
            r0 = move-exception
            dcd r8 = r8.a
            r8.k(r0)
        L_0x0170:
            return
        L_0x0171:
            r0 = 0
            java.lang.Object r8 = r8.b
            androidx.viewpager.widget.ViewPager r8 = (androidx.viewpager.widget.ViewPager) r8
            r8.setScrollState(r0)
            r8.q()
            return
        L_0x017d:
            java.lang.Object r8 = r8.b
            dnf r8 = (defpackage.dnf) r8
            r0 = 0
            r8.m(r0)
            return
        L_0x0186:
            java.lang.Object r8 = r8.b
            e4f r8 = (defpackage.e4f) r8
            boolean r0 = r8.x0
            if (r0 != 0) goto L_0x018f
            goto L_0x019e
        L_0x018f:
            r8.invalidateSelf()
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 8
            long r0 = r0 + r2
            gwe r2 = r8.w0
            r8.scheduleSelf(r2, r0)
        L_0x019e:
            return
        L_0x019f:
            java.lang.Object r8 = r8.b
            xu3 r8 = (defpackage.xu3) r8
            r8.q()
            return
        L_0x01a7:
            java.lang.Object r8 = r8.b
            mwe r8 = (defpackage.mwe) r8
            android.view.Window$Callback r0 = r8.X
            android.view.Menu r8 = r8.c0()
            boolean r1 = r8 instanceof defpackage.wq8
            r2 = 0
            if (r1 == 0) goto L_0x01ba
            r1 = r8
            wq8 r1 = (defpackage.wq8) r1
            goto L_0x01bb
        L_0x01ba:
            r1 = r2
        L_0x01bb:
            if (r1 == 0) goto L_0x01c0
            r1.w()
        L_0x01c0:
            r8.clear()     // Catch:{ all -> 0x01d1 }
            r3 = 0
            boolean r4 = r0.onCreatePanelMenu(r3, r8)     // Catch:{ all -> 0x01d1 }
            if (r4 == 0) goto L_0x01d3
            boolean r0 = r0.onPreparePanel(r3, r2, r8)     // Catch:{ all -> 0x01d1 }
            if (r0 != 0) goto L_0x01d6
            goto L_0x01d3
        L_0x01d1:
            r8 = move-exception
            goto L_0x01dc
        L_0x01d3:
            r8.clear()     // Catch:{ all -> 0x01d1 }
        L_0x01d6:
            if (r1 == 0) goto L_0x01db
            r1.v()
        L_0x01db:
            return
        L_0x01dc:
            if (r1 == 0) goto L_0x01e1
            r1.v()
        L_0x01e1:
            throw r8
        L_0x01e2:
            java.lang.Object r8 = r8.b
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r8.w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwe.run():void");
    }

    public gwe(gdg gdg, sh0 sh0) {
        this.a = 12;
        this.b = sh0;
    }
}
