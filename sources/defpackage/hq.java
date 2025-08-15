package defpackage;

import android.view.View;

/* renamed from: hq  reason: default package */
public final class hq implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hq(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.sdk.arch.Widget] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            r8 = 4
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r7.c
            java.lang.Object r4 = r7.b
            int r7 = r7.a
            switch(r7) {
                case 0: goto L_0x013d;
                case 1: goto L_0x011e;
                case 2: goto L_0x0106;
                case 3: goto L_0x00e6;
                case 4: goto L_0x0094;
                case 5: goto L_0x0025;
                case 6: goto L_0x0015;
                default: goto L_0x000d;
            }
        L_0x000d:
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ ActivityNotFoundException -> 0x0014 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ ActivityNotFoundException -> 0x0014 }
            r4.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x0014 }
        L_0x0014:
            return
        L_0x0015:
            rwe r3 = (defpackage.rwe) r3
            android.view.Window$Callback r7 = r3.k
            if (r7 == 0) goto L_0x0024
            boolean r8 = r3.l
            if (r8 == 0) goto L_0x0024
            y6 r4 = (defpackage.y6) r4
            r7.onMenuItemSelected(r2, r4)
        L_0x0024:
            return
        L_0x0025:
            bc7[] r7 = one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet.G0
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r4 = (one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet) r4
            je7 r7 = r4.z0
            java.lang.Object r7 = r7.getValue()
            kcc r7 = (defpackage.kcc) r7
            icc r3 = (defpackage.icc) r3
            hcc r8 = r3.c
            long r5 = r8.a
            int r8 = (int) r5
            yz2 r3 = r4.A0()
            boolean r3 = r3.isChecked()
            r7.getClass()
            int r5 = defpackage.y7a.t1
            if (r8 == r5) goto L_0x0090
            int r5 = defpackage.y7a.k1
            if (r8 == r5) goto L_0x0090
            int r5 = defpackage.y7a.s1
            ir1 r6 = r7.o
            if (r8 != r5) goto L_0x0059
            kr1 r7 = r6.a
            wr1 r7 = (defpackage.wr1) r7
            r7.v()
            goto L_0x0090
        L_0x0059:
            int r5 = defpackage.y7a.l1
            if (r8 != r5) goto L_0x0090
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            w7c r3 = r7.s0
            j0e r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            icc r3 = (defpackage.icc) r3
            if (r3 == 0) goto L_0x0072
            boolean r3 = r3.f
            if (r3 != r1) goto L_0x0072
            r0 = r8
        L_0x0072:
            if (r0 == 0) goto L_0x0078
            boolean r2 = r0.booleanValue()
        L_0x0078:
            java.lang.Boolean r8 = r7.c
            if (r8 == 0) goto L_0x008d
            boolean r8 = r8.booleanValue()
            je7 r7 = r7.Z
            java.lang.Object r7 = r7.getValue()
            ez0 r7 = (defpackage.ez0) r7
            yz0 r7 = (defpackage.yz0) r7
            r7.i(r8)
        L_0x008d:
            r6.k(r2)
        L_0x0090:
            r4.s0(r1)
            return
        L_0x0094:
            one.me.sdk.permissionhost.PermissionBottomSheet r4 = (one.me.sdk.permissionhost.PermissionBottomSheet) r4
            r4.G0 = r1
            one.me.sdk.permissionhost.PermissionBottomSheet r3 = (one.me.sdk.permissionhost.PermissionBottomSheet) r3
            je7 r7 = r3.y0
            java.lang.Object r7 = r7.getValue()
            eua r7 = (defpackage.eua) r7
            uu3 r4 = r3.getTargetController()
            boolean r5 = r4 instanceof one.me.sdk.arch.Widget
            if (r5 == 0) goto L_0x00ad
            r0 = r4
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
        L_0x00ad:
            if (r0 == 0) goto L_0x00da
            l5g r4 = new l5g
            r4.<init>(r0, r1)
            bc7[] r0 = one.me.sdk.permissionhost.PermissionBottomSheet.H0
            r8 = r0[r8]
            fs r8 = r3.D0
            java.lang.Object r8 = r8.a(r3)
            java.lang.String[] r8 = (java.lang.String[]) r8
            if (r8 != 0) goto L_0x00c4
            java.lang.String[] r8 = new java.lang.String[r2]
        L_0x00c4:
            r2 = 5
            r0 = r0[r2]
            fs r0 = r3.E0
            java.lang.Object r0 = r0.a(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r7.f(r4, r8, r0)
            r3.s0(r1)
            return
        L_0x00da:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Required value was null."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x00e6:
            one.me.sdk.permissionhost.PermissionBottomSheet r3 = (one.me.sdk.permissionhost.PermissionBottomSheet) r3
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            java.lang.String r2 = "package"
            android.content.Context r4 = r4.getContext()     // Catch:{ all -> 0x0102 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0102 }
            android.net.Uri r0 = android.net.Uri.fromParts(r2, r4, r0)     // Catch:{ all -> 0x0102 }
            r7.<init>(r8, r0)     // Catch:{ all -> 0x0102 }
            r3.startActivity(r7)     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r3.s0(r1)
            return
        L_0x0106:
            eg8 r3 = (defpackage.eg8) r3
            fg8 r7 = r3.J0
            gg8 r7 = r7.u0
            dh8 r4 = (defpackage.dh8) r4
            r7.y0 = r4
            r4.l()
            android.widget.ImageView r7 = r3.G0
            r7.setVisibility(r8)
            android.widget.ProgressBar r7 = r3.H0
            r7.setVisibility(r2)
            return
        L_0x011e:
            up1 r3 = (defpackage.up1) r3
            rp1 r3 = (defpackage.rp1) r3
            long r7 = r3.d
            one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget r4 = (one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget) r4
            r4.o0(r7)
            je1 r7 = defpackage.je1.c
            java.lang.String r8 = r4.m81getScopeIdIluPPks()
            f64 r7 = r7.P1()
            java.lang.String r1 = ":call-opponents-list?arg_key_scope_id="
            java.lang.String r8 = r1.concat(r8)
            r7.b(r8, r0)
            return
        L_0x013d:
            eq r3 = (defpackage.eq) r3
            aq r7 = r3.a
            m56 r4 = (defpackage.m56) r4
            r4.invoke(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq.onClick(android.view.View):void");
    }

    public hq(rwe rwe) {
        this.a = 6;
        this.c = rwe;
        this.b = new y6(rwe.a.getContext(), rwe.h);
    }

    public hq(eg8 eg8, dh8 dh8) {
        this.a = 2;
        this.c = eg8;
        this.b = dh8;
    }
}
