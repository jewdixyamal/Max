package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: i76  reason: default package */
public final class i76 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ i76(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v27, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r0v96, types: [java.lang.Object, bm7] */
    /* JADX WARNING: type inference failed for: r1v63, types: [dr6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v68 */
    /* JADX WARNING: type inference failed for: r1v69 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 4
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = r11.a
            switch(r4) {
                case 0: goto L_0x0550;
                case 1: goto L_0x051d;
                case 2: goto L_0x050b;
                case 3: goto L_0x04eb;
                case 4: goto L_0x04df;
                case 5: goto L_0x04ba;
                case 6: goto L_0x046f;
                case 7: goto L_0x0431;
                case 8: goto L_0x03ea;
                case 9: goto L_0x03c8;
                case 10: goto L_0x03bc;
                case 11: goto L_0x03a2;
                case 12: goto L_0x0394;
                case 13: goto L_0x0388;
                case 14: goto L_0x037c;
                case 15: goto L_0x034e;
                case 16: goto L_0x02fe;
                case 17: goto L_0x02f2;
                case 18: goto L_0x02c9;
                case 19: goto L_0x029b;
                case 20: goto L_0x0273;
                case 21: goto L_0x0251;
                case 22: goto L_0x021d;
                case 23: goto L_0x0205;
                case 24: goto L_0x01ec;
                case 25: goto L_0x01d8;
                case 26: goto L_0x0145;
                case 27: goto L_0x00f7;
                case 28: goto L_0x009b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r11.b
            qeg r4 = (defpackage.qeg) r4
            ph3 r5 = r4.b
            int r6 = r5.b
            if (r6 != 0) goto L_0x0014
            r3 = r2
        L_0x0014:
            java.lang.Object r11 = r11.c
            xdg r11 = (defpackage.xdg) r11
            if (r3 == 0) goto L_0x0090
            weg r3 = r4.c
            defpackage.fp3.n(r3)
            ph3 r4 = r3.c
            int r5 = r4.b
            if (r5 != 0) goto L_0x0071
            od r4 = r11.j
            android.os.IBinder r3 = r3.b
            if (r3 != 0) goto L_0x002c
            goto L_0x0042
        L_0x002c:
            int r1 = defpackage.w4.d
            java.lang.String r1 = "com.google.android.gms.common.internal.IAccountAccessor"
            android.os.IInterface r5 = r3.queryLocalInterface(r1)
            boolean r6 = r5 instanceof defpackage.dr6
            if (r6 == 0) goto L_0x003c
            dr6 r5 = (defpackage.dr6) r5
        L_0x003a:
            r1 = r5
            goto L_0x0042
        L_0x003c:
            rkg r5 = new rkg
            r5.<init>(r3, r1, r2)
            goto L_0x003a
        L_0x0042:
            r4.getClass()
            if (r1 == 0) goto L_0x005c
            java.util.Set r2 = r11.g
            if (r2 != 0) goto L_0x004c
            goto L_0x005c
        L_0x004c:
            r4.o = r1
            r4.X = r2
            boolean r0 = r4.a
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r4.b
            ok r0 = (defpackage.ok) r0
            r0.k(r1, r2)
            goto L_0x0095
        L_0x005c:
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "GoogleApiManager"
            java.lang.String r3 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r2, r3, r1)
            ph3 r1 = new ph3
            r1.<init>(r0)
            r4.i(r1)
            goto L_0x0095
        L_0x0071:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "SignInCoordinator"
            android.util.Log.wtf(r2, r0, r1)
            od r0 = r11.j
            r0.i(r4)
            iod r11 = r11.i
            r11.disconnect()
            goto L_0x009a
        L_0x0090:
            od r0 = r11.j
            r0.i(r5)
        L_0x0095:
            iod r11 = r11.i
            r11.disconnect()
        L_0x009a:
            return
        L_0x009b:
            java.lang.Object r0 = r11.c
            od r0 = (defpackage.od) r0
            java.lang.Object r4 = r0.Y
            ie6 r4 = (defpackage.ie6) r4
            java.util.concurrent.ConcurrentHashMap r4 = r4.u0
            java.lang.Object r5 = r0.c
            zk r5 = (defpackage.zk) r5
            java.lang.Object r4 = r4.get(r5)
            kdg r4 = (defpackage.kdg) r4
            if (r4 != 0) goto L_0x00b2
            goto L_0x00f6
        L_0x00b2:
            java.lang.Object r11 = r11.b
            ph3 r11 = (defpackage.ph3) r11
            int r5 = r11.b
            if (r5 != 0) goto L_0x00bb
            r3 = r2
        L_0x00bb:
            if (r3 == 0) goto L_0x00f3
            r0.a = r2
            java.lang.Object r11 = r0.b
            ok r11 = (defpackage.ok) r11
            boolean r2 = r11.j()
            if (r2 == 0) goto L_0x00db
            boolean r1 = r0.a
            if (r1 == 0) goto L_0x00f6
            java.lang.Object r1 = r0.o
            dr6 r1 = (defpackage.dr6) r1
            if (r1 == 0) goto L_0x00f6
            java.lang.Object r0 = r0.X
            java.util.Set r0 = (java.util.Set) r0
            r11.k(r1, r0)
            goto L_0x00f6
        L_0x00db:
            java.util.Set r0 = r11.a()     // Catch:{ SecurityException -> 0x00e3 }
            r11.k(r1, r0)     // Catch:{ SecurityException -> 0x00e3 }
            goto L_0x00f6
        L_0x00e3:
            java.lang.String r0 = "Failed to get service from broker."
            r11.b(r0)
            ph3 r11 = new ph3
            r0 = 10
            r11.<init>(r0)
            r4.m(r11, r1)
            goto L_0x00f6
        L_0x00f3:
            r4.m(r11, r1)
        L_0x00f6:
            return
        L_0x00f7:
            java.lang.String r0 = "Starting work for "
            java.lang.Object r1 = r11.c
            v8g r1 = (defpackage.v8g) r1
            dcd r1 = r1.B0
            java.lang.Object r1 = r1.a
            boolean r1 = r1 instanceof defpackage.r0
            if (r1 == 0) goto L_0x0106
            goto L_0x0144
        L_0x0106:
            java.lang.Object r1 = r11.b     // Catch:{ all -> 0x013a }
            bm7 r1 = (defpackage.bm7) r1     // Catch:{ all -> 0x013a }
            r1.get()     // Catch:{ all -> 0x013a }
            a14 r1 = defpackage.a14.u()     // Catch:{ all -> 0x013a }
            java.lang.String r2 = defpackage.v8g.D0     // Catch:{ all -> 0x013a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013a }
            r3.<init>(r0)     // Catch:{ all -> 0x013a }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x013a }
            v8g r0 = (defpackage.v8g) r0     // Catch:{ all -> 0x013a }
            h8g r0 = r0.X     // Catch:{ all -> 0x013a }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x013a }
            r3.append(r0)     // Catch:{ all -> 0x013a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x013a }
            r1.n(r2, r0)     // Catch:{ all -> 0x013a }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x013a }
            v8g r0 = (defpackage.v8g) r0     // Catch:{ all -> 0x013a }
            dcd r1 = r0.B0     // Catch:{ all -> 0x013a }
            gm7 r0 = r0.Y     // Catch:{ all -> 0x013a }
            bm7 r0 = r0.startWork()     // Catch:{ all -> 0x013a }
            r1.l(r0)     // Catch:{ all -> 0x013a }
            goto L_0x0144
        L_0x013a:
            r0 = move-exception
            java.lang.Object r11 = r11.c
            v8g r11 = (defpackage.v8g) r11
            dcd r11 = r11.B0
            r11.k(r0)
        L_0x0144:
            return
        L_0x0145:
            java.lang.String r0 = "Updating notification for "
            java.lang.String r1 = "Worker was marked important ("
            java.lang.Object r2 = r11.c
            j7g r2 = (defpackage.j7g) r2
            dcd r2 = r2.a
            java.lang.Object r2 = r2.a
            boolean r2 = r2 instanceof defpackage.r0
            if (r2 == 0) goto L_0x0157
            goto L_0x01d7
        L_0x0157:
            java.lang.Object r2 = r11.b     // Catch:{ all -> 0x01ad }
            dcd r2 = (defpackage.dcd) r2     // Catch:{ all -> 0x01ad }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x01ad }
            r7 = r2
            ay5 r7 = (defpackage.ay5) r7     // Catch:{ all -> 0x01ad }
            if (r7 == 0) goto L_0x01af
            a14 r1 = defpackage.a14.u()     // Catch:{ all -> 0x01ad }
            java.lang.String r2 = defpackage.j7g.Z     // Catch:{ all -> 0x01ad }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ad }
            r3.<init>(r0)     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x01ad }
            j7g r0 = (defpackage.j7g) r0     // Catch:{ all -> 0x01ad }
            h8g r0 = r0.c     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x01ad }
            r3.append(r0)     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01ad }
            r1.n(r2, r0)     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x01ad }
            j7g r0 = (defpackage.j7g) r0     // Catch:{ all -> 0x01ad }
            dcd r1 = r0.a     // Catch:{ all -> 0x01ad }
            dy5 r2 = r0.X     // Catch:{ all -> 0x01ad }
            android.content.Context r8 = r0.b     // Catch:{ all -> 0x01ad }
            gm7 r0 = r0.o     // Catch:{ all -> 0x01ad }
            java.util.UUID r6 = r0.getId()     // Catch:{ all -> 0x01ad }
            k7g r2 = (defpackage.k7g) r2     // Catch:{ all -> 0x01ad }
            r2.getClass()     // Catch:{ all -> 0x01ad }
            dcd r0 = new dcd     // Catch:{ all -> 0x01ad }
            r0.<init>()     // Catch:{ all -> 0x01ad }
            z68 r10 = new z68     // Catch:{ all -> 0x01ad }
            r9 = 2
            r3 = r10
            r4 = r2
            r5 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01ad }
            wne r2 = r2.a     // Catch:{ all -> 0x01ad }
            r2.l(r10)     // Catch:{ all -> 0x01ad }
            r1.l(r0)     // Catch:{ all -> 0x01ad }
            goto L_0x01d7
        L_0x01ad:
            r0 = move-exception
            goto L_0x01ce
        L_0x01af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ad }
            r0.<init>(r1)     // Catch:{ all -> 0x01ad }
            java.lang.Object r1 = r11.c     // Catch:{ all -> 0x01ad }
            j7g r1 = (defpackage.j7g) r1     // Catch:{ all -> 0x01ad }
            h8g r1 = r1.c     // Catch:{ all -> 0x01ad }
            java.lang.String r1 = r1.c     // Catch:{ all -> 0x01ad }
            r0.append(r1)     // Catch:{ all -> 0x01ad }
            java.lang.String r1 = ") but did not provide ForegroundInfo"
            r0.append(r1)     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01ad }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01ad }
            r1.<init>(r0)     // Catch:{ all -> 0x01ad }
            throw r1     // Catch:{ all -> 0x01ad }
        L_0x01ce:
            java.lang.Object r11 = r11.c
            j7g r11 = (defpackage.j7g) r11
            dcd r11 = r11.a
            r11.k(r0)
        L_0x01d7:
            return
        L_0x01d8:
            java.lang.Object r0 = r11.b
            s0f r0 = (defpackage.s0f) r0
            r0.o = r2
            java.lang.Object r0 = r11.c
            t0f r0 = (defpackage.t0f) r0
            java.util.concurrent.PriorityBlockingQueue r0 = r0.a
            java.lang.Object r11 = r11.b
            s0f r11 = (defpackage.s0f) r11
            r0.remove(r11)
            return
        L_0x01ec:
            java.lang.Object r0 = r11.b
            rne r0 = (defpackage.rne) r0
            java.lang.Object r11 = r11.c     // Catch:{ CancellationException -> 0x0201, Exception -> 0x01fc }
            java.util.concurrent.Callable r11 = (java.util.concurrent.Callable) r11     // Catch:{ CancellationException -> 0x0201, Exception -> 0x01fc }
            java.lang.Object r11 = r11.call()     // Catch:{ CancellationException -> 0x0201, Exception -> 0x01fc }
            r0.c(r11)     // Catch:{ CancellationException -> 0x0201, Exception -> 0x01fc }
            goto L_0x0204
        L_0x01fc:
            r11 = move-exception
            r0.b(r11)
            goto L_0x0204
        L_0x0201:
            r0.a()
        L_0x0204:
            return
        L_0x0205:
            java.lang.Object r0 = r11.c
            com.google.android.material.behavior.SwipeDismissBehavior r0 = (com.google.android.material.behavior.SwipeDismissBehavior) r0
            dnf r0 = r0.a
            if (r0 == 0) goto L_0x021c
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x021c
            java.util.WeakHashMap r0 = defpackage.zmf.a
            java.lang.Object r0 = r11.b
            android.view.View r0 = (android.view.View) r0
            r0.postOnAnimation(r11)
        L_0x021c:
            return
        L_0x021d:
            java.lang.Object r0 = r11.b
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x0249
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            bc7[] r2 = one.me.stickerssearch.StickersSearchScreen.u0
            java.lang.Object r11 = r11.c
            one.me.stickerssearch.StickersSearchScreen r11 = (one.me.stickerssearch.StickersSearchScreen) r11
            r11.getClass()
            bc7[] r2 = one.me.stickerssearch.StickersSearchScreen.u0
            r3 = 2
            r2 = r2[r3]
            q7c r3 = r11.Y
            java.lang.Object r11 = r3.T0(r11, r2)
            eha r11 = (defpackage.eha) r11
            int r11 = r11.getMeasuredHeight()
            r1.topMargin = r11
            r0.setLayoutParams(r1)
            return
        L_0x0249:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r11.<init>(r0)
            throw r11
        L_0x0251:
            bc7[] r0 = one.me.stickerssettings.stickersscreen.StickersScreen.v0
            java.lang.Object r0 = r11.c
            one.me.stickerssettings.stickersscreen.StickersScreen r0 = (one.me.stickerssettings.stickersscreen.StickersScreen) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.m0()
            java.lang.Object r11 = r11.b
            android.view.View r11 = (android.view.View) r11
            int r11 = r11.getMeasuredHeight()
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingRight()
            int r3 = r0.getPaddingBottom()
            r0.setPadding(r1, r11, r2, r3)
            return
        L_0x0273:
            java.lang.Object r0 = r11.b
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
        L_0x027b:
            if (r3 >= r1) goto L_0x029a
            java.lang.Object r4 = r0.get(r3)
            android.view.View r4 = (android.view.View) r4
            java.util.WeakHashMap r5 = defpackage.zmf.a
            java.lang.String r5 = defpackage.omf.k(r4)
            java.lang.Object r6 = r11.c
            fld r6 = (defpackage.fld) r6
            us r6 = r6.Z
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            defpackage.omf.v(r4, r5)
            int r3 = r3 + r2
            goto L_0x027b
        L_0x029a:
            return
        L_0x029b:
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x02b5 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x02b5 }
            r0.run()     // Catch:{ all -> 0x02b5 }
            java.lang.Object r0 = r11.b
            qm r0 = (defpackage.qm) r0
            java.lang.Object r0 = r0.X
            monitor-enter(r0)
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x02b2 }
            qm r11 = (defpackage.qm) r11     // Catch:{ all -> 0x02b2 }
            r11.a()     // Catch:{ all -> 0x02b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x02b2 }
            return
        L_0x02b2:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02b2 }
            throw r11
        L_0x02b5:
            r0 = move-exception
            java.lang.Object r1 = r11.b
            qm r1 = (defpackage.qm) r1
            java.lang.Object r1 = r1.X
            monitor-enter(r1)
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x02c6 }
            qm r11 = (defpackage.qm) r11     // Catch:{ all -> 0x02c6 }
            r11.a()     // Catch:{ all -> 0x02c6 }
            monitor-exit(r1)     // Catch:{ all -> 0x02c6 }
            throw r0
        L_0x02c6:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02c6 }
            throw r11
        L_0x02c9:
            java.lang.Object r0 = r11.b
            ry1 r0 = (defpackage.ry1) r0
            java.lang.Object r11 = r11.c     // Catch:{ all -> 0x02d9 }
            bm7 r11 = (defpackage.bm7) r11     // Catch:{ all -> 0x02d9 }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x02d9 }
            r0.resumeWith(r11)     // Catch:{ all -> 0x02d9 }
            goto L_0x02f1
        L_0x02d9:
            r11 = move-exception
            java.lang.Throwable r1 = r11.getCause()
            if (r1 != 0) goto L_0x02e1
            r1 = r11
        L_0x02e1:
            boolean r11 = r11 instanceof java.util.concurrent.CancellationException
            if (r11 == 0) goto L_0x02e9
            r0.cancel(r1)
            goto L_0x02f1
        L_0x02e9:
            njc r11 = new njc
            r11.<init>(r1)
            r0.resumeWith(r11)
        L_0x02f1:
            return
        L_0x02f2:
            java.lang.Object r0 = r11.c
            ry1 r0 = (defpackage.ry1) r0
            java.lang.Object r11 = r11.b
            nx3 r11 = (defpackage.nx3) r11
            r0.b(r11)
            return
        L_0x02fe:
            bc7[] r2 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.x0
            java.lang.Object r2 = r11.b
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r2 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r2
            r2.getClass()
            bc7[] r4 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.x0
            r0 = r4[r0]
            q7c r4 = r2.t0
            java.lang.Object r0 = r4.T0(r2, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r11 = r11.c
            one.me.sdk.uikit.common.button.OneMeButton r11 = (one.me.sdk.uikit.common.button.OneMeButton) r11
            int r2 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0326
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0327
        L_0x0326:
            r4 = r1
        L_0x0327:
            if (r4 == 0) goto L_0x032c
            int r4 = r4.bottomMargin
            goto L_0x032d
        L_0x032c:
            r4 = r3
        L_0x032d:
            int r2 = r2 + r4
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r4 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x0339
            r1 = r11
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x0339:
            if (r1 == 0) goto L_0x033d
            int r3 = r1.topMargin
        L_0x033d:
            int r2 = r2 + r3
            int r11 = r0.getPaddingLeft()
            int r1 = r0.getPaddingTop()
            int r3 = r0.getPaddingRight()
            r0.setPadding(r11, r1, r3, r2)
            return
        L_0x034e:
            bc7[] r0 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.v0
            java.lang.Object r0 = r11.c
            one.me.profileedit.screens.changelink.ProfileChangeLinkScreen r0 = (one.me.profileedit.screens.changelink.ProfileChangeLinkScreen) r0
            r0.getClass()
            bc7[] r1 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.v0
            r2 = 5
            r1 = r1[r2]
            q7c r2 = r0.u0
            java.lang.Object r0 = r2.T0(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r11 = r11.b
            android.view.View r11 = (android.view.View) r11
            int r11 = r11.getMeasuredHeight()
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingRight()
            int r3 = r0.getPaddingBottom()
            r0.setPadding(r1, r11, r2, r3)
            return
        L_0x037c:
            java.lang.Object r0 = r11.b
            yia r0 = (defpackage.yia) r0
            java.lang.Object r11 = r11.c
            java.lang.Runnable r11 = (java.lang.Runnable) r11
            r0.removeCallbacks(r11)
            return
        L_0x0388:
            java.lang.Object r0 = r11.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r0
            java.lang.Object r11 = r11.c
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            defpackage.i76.super.invalidateDrawable(r11)
            return
        L_0x0394:
            java.lang.Object r0 = r11.c
            s1a r0 = (defpackage.s1a) r0
            r1a r0 = r0.a
            java.lang.Object r11 = r11.b
            iq1 r11 = (defpackage.iq1) r11
            r0.a(r11)
            return
        L_0x03a2:
            java.lang.Object r0 = r11.c
            jz9 r0 = (defpackage.jz9) r0
            f2a r1 = r0.a     // Catch:{ all -> 0x03b5 }
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x03b5 }
            java.lang.Throwable r11 = (java.lang.Throwable) r11     // Catch:{ all -> 0x03b5 }
            r1.onError(r11)     // Catch:{ all -> 0x03b5 }
            xtc r11 = r0.o
            r11.g()
            return
        L_0x03b5:
            r11 = move-exception
            xtc r0 = r0.o
            r0.g()
            throw r11
        L_0x03bc:
            java.lang.Object r0 = r11.b
            dy8 r0 = (defpackage.dy8) r0
            java.lang.Object r11 = r11.c
            by8 r11 = (defpackage.by8) r11
            r0.setLayout(r11)
            return
        L_0x03c8:
            java.lang.Object r0 = r11.b
            b78 r0 = (defpackage.b78) r0
            c78 r0 = (defpackage.c78) r0
            android.os.Messenger r0 = r0.a
            android.os.IBinder r0 = r0.getBinder()
            java.lang.Object r11 = r11.c
            gaa r11 = (defpackage.gaa) r11
            java.lang.Object r11 = r11.a
            cj8 r11 = (defpackage.cj8) r11
            us r11 = r11.X
            java.lang.Object r11 = r11.remove(r0)
            s68 r11 = (defpackage.s68) r11
            if (r11 == 0) goto L_0x03e9
            r0.unlinkToDeath(r11, r3)
        L_0x03e9:
            return
        L_0x03ea:
            java.lang.Object r0 = r11.c
            t68 r0 = (defpackage.t68) r0
            java.lang.Object r1 = r0.a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r2 = r1.isEmpty()
            java.lang.Object r11 = r11.b
            ai8 r11 = (defpackage.ai8) r11
            if (r2 != 0) goto L_0x041f
            pr6 r2 = r11.a()
            if (r2 == 0) goto L_0x041c
            java.util.Iterator r3 = r1.iterator()
        L_0x0406:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x041c
            java.lang.Object r4 = r3.next()
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "extra_session_binder"
            android.os.IBinder r6 = r2.asBinder()
            r4.putBinder(r5, r6)
            goto L_0x0406
        L_0x041c:
            r1.clear()
        L_0x041f:
            java.lang.Object r0 = r0.b
            v68 r0 = (defpackage.v68) r0
            r0.getClass()
            java.lang.Object r11 = r11.b
            android.media.session.MediaSession$Token r11 = (android.media.session.MediaSession.Token) r11
            r11.getClass()
            r0.setSessionToken(r11)
            return
        L_0x0431:
            java.lang.Object r0 = r11.c
            bn7 r0 = (defpackage.bn7) r0
            java.lang.Object r0 = r0.c
            monitor-enter(r0)
            java.lang.Object r1 = r11.c     // Catch:{ all -> 0x0456 }
            bn7 r1 = (defpackage.bn7) r1     // Catch:{ all -> 0x0456 }
            l66 r1 = r1.o     // Catch:{ all -> 0x0456 }
            java.lang.Object r2 = r11.b     // Catch:{ all -> 0x0456 }
            java.lang.Object r1 = r1.apply(r2)     // Catch:{ all -> 0x0456 }
            java.lang.Object r2 = r11.c     // Catch:{ all -> 0x0456 }
            bn7 r2 = (defpackage.bn7) r2     // Catch:{ all -> 0x0456 }
            java.lang.Object r3 = r2.a     // Catch:{ all -> 0x0456 }
            if (r3 != 0) goto L_0x0458
            if (r1 == 0) goto L_0x0458
            r2.a = r1     // Catch:{ all -> 0x0456 }
            bn8 r11 = r2.X     // Catch:{ all -> 0x0456 }
            r11.i(r1)     // Catch:{ all -> 0x0456 }
            goto L_0x046b
        L_0x0456:
            r11 = move-exception
            goto L_0x046d
        L_0x0458:
            if (r3 == 0) goto L_0x046b
            boolean r2 = r3.equals(r1)     // Catch:{ all -> 0x0456 }
            if (r2 != 0) goto L_0x046b
            java.lang.Object r11 = r11.c     // Catch:{ all -> 0x0456 }
            bn7 r11 = (defpackage.bn7) r11     // Catch:{ all -> 0x0456 }
            r11.a = r1     // Catch:{ all -> 0x0456 }
            bn8 r11 = r11.X     // Catch:{ all -> 0x0456 }
            r11.i(r1)     // Catch:{ all -> 0x0456 }
        L_0x046b:
            monitor-exit(r0)     // Catch:{ all -> 0x0456 }
            return
        L_0x046d:
            monitor-exit(r0)     // Catch:{ all -> 0x0456 }
            throw r11
        L_0x046f:
            java.lang.Object r0 = r11.c
            f77 r0 = (defpackage.f77) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.C0
            if (r1 == 0) goto L_0x04b9
            boolean r1 = r1.G0
            if (r1 == 0) goto L_0x04b9
            java.lang.Object r1 = r11.b
            b77 r1 = (defpackage.b77) r1
            boolean r4 = r1.k
            if (r4 != 0) goto L_0x04b9
            dec r1 = r1.e
            int r1 = r1.g()
            r4 = -1
            if (r1 == r4) goto L_0x04b9
            androidx.recyclerview.widget.RecyclerView r1 = r0.C0
            mdc r1 = r1.getItemAnimator()
            if (r1 == 0) goto L_0x049a
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x04ac
        L_0x049a:
            java.util.ArrayList r1 = r0.A0
            int r4 = r1.size()
        L_0x04a0:
            if (r3 >= r4) goto L_0x04b4
            java.lang.Object r5 = r1.get(r3)
            b77 r5 = (defpackage.b77) r5
            boolean r5 = r5.l
            if (r5 != 0) goto L_0x04b2
        L_0x04ac:
            androidx.recyclerview.widget.RecyclerView r0 = r0.C0
            r0.post(r11)
            goto L_0x04b9
        L_0x04b2:
            int r3 = r3 + r2
            goto L_0x04a0
        L_0x04b4:
            e77 r11 = r0.x0
            r11.getClass()
        L_0x04b9:
            return
        L_0x04ba:
            java.lang.Object r0 = r11.c
            rod r0 = (defpackage.rod) r0
            a4c r1 = r0.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "<!> send retry -> "
            r2.<init>(r3)
            java.lang.Object r11 = r11.b
            d14 r11 = (defpackage.d14) r11
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "OKSignaling"
            r1.log(r3, r2)
            hrf r0 = r0.g
            java.lang.String r11 = r11.a
            r0.f(r11)
            return
        L_0x04df:
            java.lang.Object r0 = r11.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r11 = r11.c
            yl5 r11 = (defpackage.yl5) r11
            defpackage.qqe.b(r0, r11)
            return
        L_0x04eb:
            java.lang.Object r0 = r11.b
            y15 r0 = (defpackage.y15) r0
            java.lang.Object r1 = r0.b
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x050a
            java.lang.Object r11 = r11.c
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r11 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r11
            r11.Y()
            re r1 = new re
            r2 = 18
            r1.<init>(r2, r0)
            r11.post(r1)
        L_0x050a:
            return
        L_0x050b:
            java.lang.Object r0 = r11.b
            mfe r0 = (defpackage.mfe) r0
            java.lang.Object r0 = r0.a
            tu0 r0 = (defpackage.tu0) r0
            if (r0 == 0) goto L_0x051c
            java.lang.Object r11 = r11.c
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11
            r0.x(r11)
        L_0x051c:
            return
        L_0x051d:
            java.lang.Object r0 = r11.c
            e7 r0 = (defpackage.e7) r0
            wq8 r2 = r0.c
            if (r2 == 0) goto L_0x052c
            uq8 r4 = r2.X
            if (r4 == 0) goto L_0x052c
            r4.Q(r2)
        L_0x052c:
            qr8 r2 = r0.s0
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x054d
            android.os.IBinder r2 = r2.getWindowToken()
            if (r2 == 0) goto L_0x054d
            java.lang.Object r11 = r11.b
            b7 r11 = (defpackage.b7) r11
            boolean r2 = r11.b()
            if (r2 == 0) goto L_0x0543
            goto L_0x054b
        L_0x0543:
            android.view.View r2 = r11.f
            if (r2 != 0) goto L_0x0548
            goto L_0x054d
        L_0x0548:
            r11.d(r3, r3, r3, r3)
        L_0x054b:
            r0.D0 = r11
        L_0x054d:
            r0.F0 = r1
            return
        L_0x0550:
            java.lang.Object r0 = r11.c
            a76 r0 = (defpackage.a76) r0
            java.lang.Object r11 = r11.b     // Catch:{ ExecutionException -> 0x0562, Error | RuntimeException -> 0x0560 }
            java.util.concurrent.Future r11 = (java.util.concurrent.Future) r11     // Catch:{ ExecutionException -> 0x0562, Error | RuntimeException -> 0x0560 }
            java.lang.Object r11 = defpackage.kq0.n(r11)     // Catch:{ ExecutionException -> 0x0562, Error | RuntimeException -> 0x0560 }
            r0.a(r11)
            goto L_0x0575
        L_0x0560:
            r11 = move-exception
            goto L_0x0564
        L_0x0562:
            r11 = move-exception
            goto L_0x0568
        L_0x0564:
            r0.d(r11)
            goto L_0x0575
        L_0x0568:
            java.lang.Throwable r1 = r11.getCause()
            if (r1 != 0) goto L_0x0572
            r0.d(r11)
            goto L_0x0575
        L_0x0572:
            r0.d(r1)
        L_0x0575:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i76.run():void");
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return i76.class.getSimpleName() + "," + ((a76) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i76(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ i76(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public i76(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = 23;
        this.c = swipeDismissBehavior;
        this.b = view;
    }

    public i76(f77 f77, b77 b77, int i) {
        this.a = 6;
        this.c = f77;
        this.b = b77;
    }
}
