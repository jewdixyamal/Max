package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.arch.Widget;

/* renamed from: h76  reason: default package */
public final class h76 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ h76(ViewGroup viewGroup, RecyclerView recyclerView, Widget widget, int i) {
        this.a = i;
        this.b = recyclerView;
        this.c = widget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        defpackage.p6d.Y.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r10.c     // Catch:{ all -> 0x005e }
            p6d r2 = (defpackage.p6d) r2     // Catch:{ all -> 0x005e }
            java.util.ArrayDeque r2 = r2.b     // Catch:{ all -> 0x005e }
            monitor-enter(r2)     // Catch:{ all -> 0x005e }
            r3 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r10.c     // Catch:{ all -> 0x0020 }
            p6d r0 = (defpackage.p6d) r0     // Catch:{ all -> 0x0020 }
            int r4 = r0.c     // Catch:{ all -> 0x0020 }
            r5 = 4
            if (r4 != r5) goto L_0x0022
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x001f:
            return
        L_0x0020:
            r10 = move-exception
            goto L_0x0083
        L_0x0022:
            long r6 = r0.o     // Catch:{ all -> 0x0020 }
            r8 = 1
            long r6 = r6 + r8
            r0.o = r6     // Catch:{ all -> 0x0020 }
            r0.c = r5     // Catch:{ all -> 0x0020 }
            r0 = r3
        L_0x002c:
            java.lang.Object r4 = r10.c     // Catch:{ all -> 0x0020 }
            p6d r4 = (defpackage.p6d) r4     // Catch:{ all -> 0x0020 }
            java.util.ArrayDeque r4 = r4.b     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0020 }
            r10.b = r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x004d
            java.lang.Object r10 = r10.c     // Catch:{ all -> 0x0020 }
            p6d r10 = (defpackage.p6d) r10     // Catch:{ all -> 0x0020 }
            r10.c = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x004c
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x004c:
            return
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x005e }
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch:{ RuntimeException -> 0x0062 }
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ RuntimeException -> 0x0062 }
            r3.run()     // Catch:{ RuntimeException -> 0x0062 }
        L_0x005b:
            r10.b = r2     // Catch:{ all -> 0x005e }
            goto L_0x0002
        L_0x005e:
            r10 = move-exception
            goto L_0x0085
        L_0x0060:
            r0 = move-exception
            goto L_0x0080
        L_0x0062:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.p6d.Y     // Catch:{ all -> 0x0060 }
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r6.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.Object r7 = r10.b     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x0060 }
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0060 }
            r4.log(r5, r6, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x005b
        L_0x0080:
            r10.b = r2     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0083:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r10     // Catch:{ all -> 0x005e }
        L_0x0085:
            if (r1 == 0) goto L_0x008e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x008e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h76.a():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: h8g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: v8g} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v34, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r3v44 */
    /* JADX WARNING: type inference failed for: r3v45 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            r0 = 0
            r2 = 1
            r3 = 0
            int r4 = r1.a
            switch(r4) {
                case 0: goto L_0x04a0;
                case 1: goto L_0x0494;
                case 2: goto L_0x046d;
                case 3: goto L_0x042f;
                case 4: goto L_0x0388;
                case 5: goto L_0x035d;
                case 6: goto L_0x0348;
                case 7: goto L_0x033c;
                case 8: goto L_0x0330;
                case 9: goto L_0x02aa;
                case 10: goto L_0x029e;
                case 11: goto L_0x026f;
                case 12: goto L_0x0263;
                case 13: goto L_0x0255;
                case 14: goto L_0x0249;
                case 15: goto L_0x0239;
                case 16: goto L_0x022d;
                case 17: goto L_0x0221;
                case 18: goto L_0x01f3;
                case 19: goto L_0x01e9;
                case 20: goto L_0x01bf;
                case 21: goto L_0x01a7;
                case 22: goto L_0x0169;
                case 23: goto L_0x014d;
                case 24: goto L_0x0102;
                case 25: goto L_0x00cf;
                case 26: goto L_0x006b;
                case 27: goto L_0x0041;
                case 28: goto L_0x0022;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0019 }
            androidx.work.Worker r0 = (androidx.work.Worker) r0     // Catch:{ all -> 0x0019 }
            r0.getClass()     // Catch:{ all -> 0x0019 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0019 }
            java.lang.String r2 = "Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`"
            r0.<init>(r2)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            java.lang.Object r1 = r1.b
            dcd r1 = (defpackage.dcd) r1
            r1.k(r0)
            return
        L_0x0022:
            bc7[] r0 = one.me.chatscreen.videomsg.VideoMessageWidget.y0
            java.lang.Object r0 = r1.b
            one.me.chatscreen.videomsg.VideoMessageWidget r0 = (one.me.chatscreen.videomsg.VideoMessageWidget) r0
            r0.getClass()
            bc7[] r3 = one.me.chatscreen.videomsg.VideoMessageWidget.y0
            r2 = r3[r2]
            q7c r3 = r0.X
            java.lang.Object r0 = r3.T0(r0, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.Object r1 = r1.c
            xgf r1 = (defpackage.xgf) r1
            boolean r1 = r1.a
            r0.setClickable(r1)
            return
        L_0x0041:
            java.lang.Object r0 = r1.c
            hte r0 = (defpackage.hte) r0
            ite r0 = r0.c
            java.lang.Object r1 = r1.b
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            fi0 r2 = (defpackage.fi0) r2
            java.lang.Object r1 = r1.second
            eab r1 = (defpackage.eab) r1
            r0.getClass()
            r4 = r1
            oj0 r4 = (defpackage.oj0) r4
            hab r4 = r4.c
            java.lang.String r5 = "ThrottlingProducer"
            r4.a(r1, r5, r3)
            hte r3 = new hte
            r3.<init>(r0, r2)
            dab r0 = r0.a
            r0.a(r3, r1)
            return
        L_0x006b:
            java.lang.Object r0 = r1.c
            uhe r0 = (defpackage.uhe) r0
            s7g r0 = r0.a
            y9b r0 = r0.f
            java.lang.Object r2 = r1.b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.w0
            monitor-enter(r4)
            java.util.HashMap r5 = r0.Y     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x008e }
            v8g r5 = (defpackage.v8g) r5     // Catch:{ all -> 0x008e }
            if (r5 != 0) goto L_0x0090
            java.util.HashMap r0 = r0.Z     // Catch:{ all -> 0x008e }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x008e }
            r5 = r0
            v8g r5 = (defpackage.v8g) r5     // Catch:{ all -> 0x008e }
            goto L_0x0090
        L_0x008e:
            r0 = move-exception
            goto L_0x00cd
        L_0x0090:
            if (r5 == 0) goto L_0x0096
            h8g r3 = r5.X     // Catch:{ all -> 0x008e }
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            goto L_0x0097
        L_0x0096:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
        L_0x0097:
            if (r3 == 0) goto L_0x00cc
            boolean r0 = r3.c()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r1.c
            uhe r0 = (defpackage.uhe) r0
            java.lang.Object r2 = r0.c
            monitor-enter(r2)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x00c9 }
            uhe r0 = (defpackage.uhe) r0     // Catch:{ all -> 0x00c9 }
            java.util.HashMap r0 = r0.Y     // Catch:{ all -> 0x00c9 }
            l7g r4 = defpackage.ju0.n(r3)     // Catch:{ all -> 0x00c9 }
            r0.put(r4, r3)     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x00c9 }
            uhe r0 = (defpackage.uhe) r0     // Catch:{ all -> 0x00c9 }
            java.util.HashSet r0 = r0.Z     // Catch:{ all -> 0x00c9 }
            r0.add(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x00c9 }
            uhe r0 = (defpackage.uhe) r0     // Catch:{ all -> 0x00c9 }
            adb r1 = r0.s0     // Catch:{ all -> 0x00c9 }
            java.util.HashSet r0 = r0.Z     // Catch:{ all -> 0x00c9 }
            r1.w(r0)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r2)     // Catch:{ all -> 0x00c9 }
            goto L_0x00cc
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c9 }
            throw r0
        L_0x00cc:
            return
        L_0x00cd:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r0
        L_0x00cf:
            java.lang.Object r0 = r1.b
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r0
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            if (r3 == 0) goto L_0x00fa
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            bc7[] r4 = one.me.stickersshowcase.StickersShowcaseScreen.v0
            java.lang.Object r1 = r1.c
            one.me.stickersshowcase.StickersShowcaseScreen r1 = (one.me.stickersshowcase.StickersShowcaseScreen) r1
            r1.getClass()
            bc7[] r4 = one.me.stickersshowcase.StickersShowcaseScreen.v0
            r2 = r4[r2]
            q7c r4 = r1.X
            java.lang.Object r1 = r4.T0(r1, r2)
            cla r1 = (defpackage.cla) r1
            int r1 = r1.getMeasuredHeight()
            r3.topMargin = r1
            r0.setLayoutParams(r3)
            return
        L_0x00fa:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x0102:
            bc7[] r2 = one.me.stickerssettings.stickersscreen.StickersScreen.v0
            java.lang.Object r2 = r1.c
            one.me.stickerssettings.stickersscreen.StickersScreen r2 = (one.me.stickerssettings.stickersscreen.StickersScreen) r2
            androidx.recyclerview.widget.RecyclerView r2 = r2.m0()
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            if (r4 == 0) goto L_0x0145
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            java.lang.Object r1 = r1.b
            android.view.View r1 = (android.view.View) r1
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x0127
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x0128
        L_0x0127:
            r6 = r3
        L_0x0128:
            if (r6 == 0) goto L_0x012d
            int r6 = r6.bottomMargin
            goto L_0x012e
        L_0x012d:
            r6 = r0
        L_0x012e:
            int r5 = r5 + r6
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r6 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x013a
            r3 = r1
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x013a:
            if (r3 == 0) goto L_0x013e
            int r0 = r3.topMargin
        L_0x013e:
            int r5 = r5 + r0
            r4.bottomMargin = r5
            r2.setLayoutParams(r4)
            return
        L_0x0145:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x014d:
            java.lang.Object r0 = r1.c
            one.me.stickerspreview.set.StickerSetBottomSheet r0 = (one.me.stickerspreview.set.StickerSetBottomSheet) r0
            int r0 = one.me.stickerspreview.set.StickerSetBottomSheet.x0(r0)
            java.lang.Object r1 = r1.b
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingTop()
            int r4 = r1.getPaddingRight()
            r1.setPadding(r2, r3, r4, r0)
            return
        L_0x0169:
            java.lang.Object r4 = r1.b
            java.util.List r4 = (java.util.List) r4
            int r5 = r4.size()
            r6 = r0
        L_0x0172:
            if (r6 >= r5) goto L_0x01a6
            java.lang.Object r7 = r4.get(r6)
            android.view.View r7 = (android.view.View) r7
            java.util.WeakHashMap r8 = defpackage.zmf.a
            java.lang.String r8 = defpackage.omf.k(r7)
            if (r8 == 0) goto L_0x01a4
            java.lang.Object r9 = r1.c
            fld r9 = (defpackage.fld) r9
            us r9 = r9.Z
            int r10 = r9.c
            r11 = r0
        L_0x018b:
            if (r11 >= r10) goto L_0x01a0
            java.lang.Object r12 = r9.i(r11)
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x019e
            java.lang.Object r8 = r9.f(r11)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x01a1
        L_0x019e:
            int r11 = r11 + r2
            goto L_0x018b
        L_0x01a0:
            r8 = r3
        L_0x01a1:
            defpackage.omf.v(r7, r8)
        L_0x01a4:
            int r6 = r6 + r2
            goto L_0x0172
        L_0x01a6:
            return
        L_0x01a7:
            r17.a()     // Catch:{ Error -> 0x01ab }
            return
        L_0x01ab:
            r0 = move-exception
            r3 = r0
            java.lang.Object r0 = r1.c
            p6d r0 = (defpackage.p6d) r0
            java.util.ArrayDeque r4 = r0.b
            monitor-enter(r4)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x01bc }
            p6d r0 = (defpackage.p6d) r0     // Catch:{ all -> 0x01bc }
            r0.c = r2     // Catch:{ all -> 0x01bc }
            monitor-exit(r4)     // Catch:{ all -> 0x01bc }
            throw r3
        L_0x01bc:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01bc }
            throw r0
        L_0x01bf:
            java.lang.Object r0 = r1.b
            r2 = r0
            ry1 r2 = (defpackage.ry1) r2
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x01d0 }
            bm7 r0 = (defpackage.bm7) r0     // Catch:{ all -> 0x01d0 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01d0 }
            r2.resumeWith(r0)     // Catch:{ all -> 0x01d0 }
            goto L_0x01e8
        L_0x01d0:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 != 0) goto L_0x01d8
            r1 = r0
        L_0x01d8:
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x01e0
            r2.cancel(r1)
            goto L_0x01e8
        L_0x01e0:
            njc r0 = new njc
            r0.<init>(r1)
            r2.resumeWith(r0)
        L_0x01e8:
            return
        L_0x01e9:
            java.lang.Object r0 = r1.b
            tj3 r0 = (defpackage.tj3) r0
            java.lang.Object r1 = r1.c
            r0.accept(r1)
            return
        L_0x01f3:
            bc7[] r0 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.x0
            java.lang.Object r0 = r1.c
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r0 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r0
            r0.getClass()
            bc7[] r2 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.x0
            r3 = 4
            r2 = r2[r3]
            q7c r3 = r0.t0
            java.lang.Object r0 = r3.T0(r0, r2)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r1 = r1.b
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getMeasuredHeight()
            int r2 = r0.getPaddingLeft()
            int r3 = r0.getPaddingRight()
            int r4 = r0.getPaddingBottom()
            r0.setPadding(r2, r1, r3, r4)
            return
        L_0x0221:
            java.lang.Object r0 = r1.b
            yia r0 = (defpackage.yia) r0
            java.lang.Object r1 = r1.c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            return
        L_0x022d:
            java.lang.Object r0 = r1.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r0
            java.lang.Object r1 = r1.c
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            defpackage.h76.super.invalidateDrawable(r1)
            return
        L_0x0239:
            e5f r0 = defpackage.e5f.a
            java.lang.Object r2 = r1.b
            z3d r2 = (defpackage.z3d) r2
            y3d r2 = (defpackage.y3d) r2
            java.lang.Object r1 = r1.c
            z3a r1 = (defpackage.z3a) r1
            r2.g(r1, r0)
            return
        L_0x0249:
            java.lang.Object r0 = r1.c
            jz9 r0 = (defpackage.jz9) r0
            f2a r0 = r0.a
            java.lang.Object r1 = r1.b
            r0.e(r1)
            return
        L_0x0255:
            java.lang.Object r0 = r1.b
            one.me.messages.list.ui.MessagesListWidget r0 = (one.me.messages.list.ui.MessagesListWidget) r0
            m29 r0 = r0.A0
            java.lang.Object r1 = r1.c
            java.util.List r1 = (java.util.List) r1
            r0.F(r1, r3)
            return
        L_0x0263:
            java.lang.Object r0 = r1.b
            dy8 r0 = (defpackage.dy8) r0
            java.lang.Object r1 = r1.c
            by8 r1 = (defpackage.by8) r1
            r0.setLayout(r1)
            return
        L_0x026f:
            java.lang.Object r2 = r1.b
            b78 r2 = (defpackage.b78) r2
            c78 r2 = (defpackage.c78) r2
            android.os.Messenger r2 = r2.a
            android.os.IBinder r2 = r2.getBinder()
            java.lang.Object r1 = r1.c
            gaa r1 = (defpackage.gaa) r1
            java.lang.Object r1 = r1.a
            cj8 r1 = (defpackage.cj8) r1
            us r1 = r1.X
            java.lang.Object r1 = r1.remove(r2)
            s68 r1 = (defpackage.s68) r1
            if (r1 == 0) goto L_0x029d
            b78 r2 = r1.e
            r2.getClass()
            c78 r2 = (defpackage.c78) r2
            android.os.Messenger r2 = r2.a
            android.os.IBinder r2 = r2.getBinder()
            r2.unlinkToDeath(r1, r0)
        L_0x029d:
            return
        L_0x029e:
            java.lang.Object r0 = r1.c
            f38 r0 = (defpackage.f38) r0
            java.lang.Object r1 = r1.b
            b38 r1 = (defpackage.b38) r1
            r0.a(r1)
            return
        L_0x02aa:
            java.lang.Object r0 = r1.b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x02f0
            java.lang.String r2 = "evgeniiJsEvaluatorException"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r0 = r1.c
            v9g r0 = (defpackage.v9g) r0
            java.lang.Object r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            r2 = 27
            r1.substring(r2)
            wi3 r1 = r0.a
            java.lang.Object r0 = r1.o
            w9g r0 = (defpackage.w9g) r0
            java.util.concurrent.locks.ReentrantLock r0 = r0.e
            r0.lock()
            java.lang.String r0 = defpackage.w9g.g     // Catch:{ all -> 0x02e5 }
            java.lang.Object r0 = r1.o     // Catch:{ all -> 0x02e5 }
            w9g r0 = (defpackage.w9g) r0     // Catch:{ all -> 0x02e5 }
            java.util.concurrent.locks.Condition r0 = r0.f     // Catch:{ all -> 0x02e5 }
            r0.signal()     // Catch:{ all -> 0x02e5 }
            java.lang.Object r0 = r1.o
            w9g r0 = (defpackage.w9g) r0
            java.util.concurrent.locks.ReentrantLock r0 = r0.e
            r0.unlock()
            goto L_0x0322
        L_0x02e5:
            r0 = move-exception
            java.lang.Object r1 = r1.o
            w9g r1 = (defpackage.w9g) r1
            java.util.concurrent.locks.ReentrantLock r1 = r1.e
            r1.unlock()
            throw r0
        L_0x02f0:
            java.lang.Object r0 = r1.c
            r2 = r0
            v9g r2 = (defpackage.v9g) r2
            java.lang.Object r0 = r1.b
            java.lang.String r0 = (java.lang.String) r0
            wi3 r1 = r2.a
            java.lang.Object r1 = r1.o
            w9g r1 = (defpackage.w9g) r1
            java.util.concurrent.locks.ReentrantLock r1 = r1.e
            r1.lock()
            wi3 r1 = r2.a     // Catch:{ all -> 0x0323 }
            java.lang.Object r1 = r1.o     // Catch:{ all -> 0x0323 }
            w9g r1 = (defpackage.w9g) r1     // Catch:{ all -> 0x0323 }
            r1.d = r0     // Catch:{ all -> 0x0323 }
            wi3 r0 = r2.a     // Catch:{ all -> 0x0323 }
            java.lang.Object r0 = r0.o     // Catch:{ all -> 0x0323 }
            w9g r0 = (defpackage.w9g) r0     // Catch:{ all -> 0x0323 }
            java.util.concurrent.locks.Condition r0 = r0.f     // Catch:{ all -> 0x0323 }
            r0.signal()     // Catch:{ all -> 0x0323 }
            wi3 r0 = r2.a
            java.lang.Object r0 = r0.o
            w9g r0 = (defpackage.w9g) r0
            java.util.concurrent.locks.ReentrantLock r0 = r0.e
            r0.unlock()
        L_0x0322:
            return
        L_0x0323:
            r0 = move-exception
            wi3 r1 = r2.a
            java.lang.Object r1 = r1.o
            w9g r1 = (defpackage.w9g) r1
            java.util.concurrent.locks.ReentrantLock r1 = r1.e
            r1.unlock()
            throw r0
        L_0x0330:
            java.lang.Object r0 = r1.b
            ry1 r0 = (defpackage.ry1) r0
            java.lang.Object r1 = r1.c
            wh6 r1 = (defpackage.wh6) r1
            r0.b(r1)
            return
        L_0x033c:
            java.lang.Object r0 = r1.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r1 = r1.c
            yl5 r1 = (defpackage.yl5) r1
            defpackage.qqe.b(r0, r1)
            return
        L_0x0348:
            java.lang.Object r0 = r1.b
            a55 r0 = (defpackage.a55) r0
            uy1 r2 = r0.b
            java.lang.Object r1 = r1.c
            f55 r1 = (defpackage.f55) r1
            zl4 r0 = r1.b(r0)
            r2.getClass()
            defpackage.dm4.c(r2, r0)
            return
        L_0x035d:
            a14 r0 = defpackage.a14.u()
            java.lang.String r2 = defpackage.qg4.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Scheduling work "
            r3.<init>(r4)
            java.lang.Object r4 = r1.b
            h8g r4 = (defpackage.h8g) r4
            java.lang.String r5 = r4.a
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.n(r2, r3)
            java.lang.Object r0 = r1.c
            qg4 r0 = (defpackage.qg4) r0
            uf6 r0 = r0.a
            h8g[] r1 = new defpackage.h8g[]{r4}
            r0.e(r1)
            return
        L_0x0388:
            java.lang.Object r0 = r1.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x0390:
            boolean r4 = r2.hasNext()
            java.lang.Object r5 = r1.c
            yb4 r5 = (defpackage.yb4) r5
            if (r4 == 0) goto L_0x0426
            java.lang.Object r4 = r2.next()
            wb4 r4 = (defpackage.wb4) r4
            r5.getClass()
            dec r6 = r4.a
            if (r6 != 0) goto L_0x03a9
            r10 = r3
            goto L_0x03ac
        L_0x03a9:
            android.view.View r6 = r6.a
            r10 = r6
        L_0x03ac:
            dec r6 = r4.b
            if (r6 == 0) goto L_0x03b4
            android.view.View r6 = r6.a
            r12 = r6
            goto L_0x03b5
        L_0x03b4:
            r12 = r3
        L_0x03b5:
            java.util.ArrayList r13 = r5.r
            r14 = 0
            if (r10 == 0) goto L_0x03f3
            android.view.ViewPropertyAnimator r6 = r10.animate()
            long r7 = r5.f
            android.view.ViewPropertyAnimator r9 = r6.setDuration(r7)
            dec r6 = r4.a
            r13.add(r6)
            int r6 = r4.e
            int r7 = r4.c
            int r6 = r6 - r7
            float r6 = (float) r6
            r9.translationX(r6)
            int r6 = r4.f
            int r7 = r4.d
            int r6 = r6 - r7
            float r6 = (float) r6
            r9.translationY(r6)
            android.view.ViewPropertyAnimator r15 = r9.alpha(r14)
            vb4 r11 = new vb4
            r16 = 0
            r6 = r11
            r7 = r5
            r8 = r4
            r3 = r11
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r3 = r15.setListener(r3)
            r3.start()
        L_0x03f3:
            if (r12 == 0) goto L_0x0423
            android.view.ViewPropertyAnimator r9 = r12.animate()
            dec r3 = r4.b
            r13.add(r3)
            android.view.ViewPropertyAnimator r3 = r9.translationX(r14)
            android.view.ViewPropertyAnimator r3 = r3.translationY(r14)
            long r6 = r5.f
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r3 = r3.alpha(r6)
            vb4 r13 = new vb4
            r11 = 1
            r6 = r13
            r7 = r5
            r8 = r4
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r3 = r3.setListener(r13)
            r3.start()
        L_0x0423:
            r3 = 0
            goto L_0x0390
        L_0x0426:
            r0.clear()
            java.util.ArrayList r1 = r5.n
            r1.remove(r0)
            return
        L_0x042f:
            java.lang.Object r2 = r1.c     // Catch:{ CancellationException -> 0x0456, ExecutionException -> 0x0445 }
            k12 r2 = (defpackage.k12) r2     // Catch:{ CancellationException -> 0x0456, ExecutionException -> 0x0445 }
            java.lang.Object r3 = r1.b     // Catch:{ CancellationException -> 0x0456, ExecutionException -> 0x0445 }
            bm7 r3 = (defpackage.bm7) r3     // Catch:{ CancellationException -> 0x0456, ExecutionException -> 0x0445 }
            java.lang.Object r3 = defpackage.kq0.o(r3)     // Catch:{ CancellationException -> 0x0456, ExecutionException -> 0x0445 }
            lq1 r2 = r2.b     // Catch:{ CancellationException -> 0x0456, ExecutionException -> 0x0445 }
            if (r2 == 0) goto L_0x045d
            r2.b(r3)     // Catch:{ CancellationException -> 0x0456, ExecutionException -> 0x0445 }
            goto L_0x045d
        L_0x0443:
            r0 = move-exception
            goto L_0x0465
        L_0x0445:
            r0 = move-exception
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x0443 }
            k12 r2 = (defpackage.k12) r2     // Catch:{ all -> 0x0443 }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0443 }
            lq1 r2 = r2.b     // Catch:{ all -> 0x0443 }
            if (r2 == 0) goto L_0x045d
            r2.d(r0)     // Catch:{ all -> 0x0443 }
            goto L_0x045d
        L_0x0456:
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x0443 }
            k12 r2 = (defpackage.k12) r2     // Catch:{ all -> 0x0443 }
            r2.cancel(r0)     // Catch:{ all -> 0x0443 }
        L_0x045d:
            java.lang.Object r0 = r1.c
            k12 r0 = (defpackage.k12) r0
            r1 = 0
            r0.Z = r1
            return
        L_0x0465:
            java.lang.Object r1 = r1.c
            k12 r1 = (defpackage.k12) r1
            r2 = 0
            r1.Z = r2
            throw r0
        L_0x046d:
            java.lang.Object r0 = r1.c
            hv r0 = (defpackage.hv) r0
            iv r2 = r0.X
            int r3 = r2.g
            int r4 = r0.c
            if (r3 != r4) goto L_0x0493
            java.util.List r3 = r0.b
            java.lang.Runnable r0 = r0.o
            java.util.List r4 = r2.f
            r2.e = r3
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r2.f = r3
            xl7 r3 = r2.a
            java.lang.Object r1 = r1.b
            wj4 r1 = (defpackage.wj4) r1
            r1.a(r3)
            r2.a(r4, r0)
        L_0x0493:
            return
        L_0x0494:
            java.lang.Object r0 = r1.b
            b34 r0 = (defpackage.b34) r0
            java.lang.Object r1 = r1.c
            g0 r1 = (defpackage.g0) r1
            r0.b(r1)
            return
        L_0x04a0:
            r2 = r3
            java.lang.Object r0 = r1.b
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            boolean r3 = r0 instanceof defpackage.w37
            java.lang.Object r1 = r1.c
            z66 r1 = (defpackage.z66) r1
            if (r3 == 0) goto L_0x04cb
            r3 = r0
            w37 r3 = (defpackage.w37) r3
            k1 r3 = (defpackage.k1) r3
            r3.getClass()
            boolean r4 = r3 instanceof defpackage.d1
            if (r4 == 0) goto L_0x04c4
            java.lang.Object r3 = r3.a
            boolean r4 = r3 instanceof defpackage.t0
            if (r4 == 0) goto L_0x04c4
            t0 r3 = (defpackage.t0) r3
            java.lang.Throwable r3 = r3.a
            goto L_0x04c5
        L_0x04c4:
            r3 = r2
        L_0x04c5:
            if (r3 == 0) goto L_0x04cb
            r1.d(r3)
            goto L_0x04e2
        L_0x04cb:
            java.lang.Object r0 = defpackage.fm9.C(r0)     // Catch:{ ExecutionException -> 0x04d9, all -> 0x04d3 }
            r1.a(r0)
            goto L_0x04e2
        L_0x04d3:
            r0 = move-exception
            r2 = r0
            r1.d(r2)
            goto L_0x04e2
        L_0x04d9:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r0 = r2.getCause()
            r1.d(r0)
        L_0x04e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h76.run():void");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, ph4] */
    public String toString() {
        switch (this.a) {
            case 0:
                glc glc = new glc(h76.class.getSimpleName(), 8);
                ? obj = new Object();
                ((ph4) glc.o).b = obj;
                glc.o = obj;
                obj.a = (z66) this.c;
                return glc.toString();
            case 21:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((p6d) this.c).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h76(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ h76(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public h76(p6d p6d) {
        this.a = 21;
        this.c = p6d;
    }
}
