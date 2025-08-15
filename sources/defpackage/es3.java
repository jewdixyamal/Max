package defpackage;

/* renamed from: es3  reason: default package */
public final /* synthetic */ class es3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ es3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v87, resolved type: t25} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [xt3] */
    /* JADX WARNING: type inference failed for: r3v5, types: [xt3] */
    /* JADX WARNING: type inference failed for: r3v17, types: [znc] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r15 = this;
            r0 = 6
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            e5f r5 = defpackage.e5f.a
            java.lang.Object r6 = r15.b
            int r15 = r15.a
            switch(r15) {
                case 0: goto L_0x0382;
                case 1: goto L_0x0351;
                case 2: goto L_0x0320;
                case 3: goto L_0x0319;
                case 4: goto L_0x0312;
                case 5: goto L_0x030f;
                case 6: goto L_0x030a;
                case 7: goto L_0x02fc;
                case 8: goto L_0x02f6;
                case 9: goto L_0x02e2;
                case 10: goto L_0x02db;
                case 11: goto L_0x02bd;
                case 12: goto L_0x02b8;
                case 13: goto L_0x028e;
                case 14: goto L_0x01e9;
                case 15: goto L_0x01e1;
                case 16: goto L_0x01d9;
                case 17: goto L_0x01b5;
                case 18: goto L_0x01a3;
                case 19: goto L_0x0192;
                case 20: goto L_0x017e;
                case 21: goto L_0x0176;
                case 22: goto L_0x016f;
                case 23: goto L_0x0167;
                case 24: goto L_0x015e;
                case 25: goto L_0x00a2;
                case 26: goto L_0x0095;
                case 27: goto L_0x0043;
                case 28: goto L_0x0022;
                default: goto L_0x000e;
            }
        L_0x000e:
            n97 r15 = new n97
            bc7[] r0 = one.me.android.join.JoinChatWidget.x0
            r0 = r0[r4]
            one.me.android.join.JoinChatWidget r6 = (one.me.android.join.JoinChatWidget) r6
            fs r0 = r6.s0
            java.lang.Object r0 = r0.a(r6)
            java.lang.String r0 = (java.lang.String) r0
            r15.<init>(r0)
            return r15
        L_0x0022:
            bc7[] r15 = one.me.inviteactions.invitebyqr.InviteByQrBottomSheet.G0
            wha r15 = new wha
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r6 = (one.me.inviteactions.invitebyqr.InviteByQrBottomSheet) r6
            r15.<init>((one.me.sdk.arch.Widget) r6)
            android.content.Context r0 = r6.getContext()
            int r1 = defpackage.yoc.f
            java.lang.String r0 = r0.getString(r1)
            r15.h(r0)
            kia r0 = new kia
            int r1 = defpackage.woc.I
            r0.<init>(r1)
            r15.e(r0)
            return r15
        L_0x0043:
            bc7[] r15 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.B0
            bc7[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            one.me.sdk.phoneutils.SelectCountryBottomSheet r8 = new one.me.sdk.phoneutils.SelectCountryBottomSheet
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            kpa r0 = new kpa
            java.lang.String r1 = "is_narnia_available"
            r0.<init>(r1, r15)
            kpa[] r15 = new defpackage.kpa[]{r0}
            android.os.Bundle r15 = defpackage.dy7.g(r15)
            r8.<init>(r15)
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r6 = (one.me.inviteactions.invitebyphone.InviteByPhoneScreen) r6
            r8.setTargetController(r6)
            r15 = r6
        L_0x0063:
            uu3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x006e
            uu3 r15 = r15.getParentController()
            goto L_0x0063
        L_0x006e:
            boolean r0 = r15 instanceof defpackage.foc
            if (r0 == 0) goto L_0x0075
            foc r15 = (defpackage.foc) r15
            goto L_0x0076
        L_0x0075:
            r15 = r3
        L_0x0076:
            if (r15 == 0) goto L_0x007c
            znc r3 = r15.T()
        L_0x007c:
            r8.z0(r6)
            if (r3 == 0) goto L_0x0094
            coc r15 = new coc
            r10 = 0
            r13 = -1
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "BottomSheetWidget"
            defpackage.wg0.l(r2, r15, r4, r0)
            r3.G(r15)
        L_0x0094:
            return r5
        L_0x0095:
            java.lang.String r15 = defpackage.fz6.E0
            java.lang.String r0 = "ManualGalleryContentObserver: on content changed"
            defpackage.hm9.m(r15, r0, new java.lang.Object[0])
            fz6 r6 = (defpackage.fz6) r6
            r6.e()
            return r5
        L_0x00a2:
            ay6 r6 = (defpackage.ay6) r6
            yb3 r15 = r6.a
            if (r15 != 0) goto L_0x00aa
            goto L_0x015d
        L_0x00aa:
            aab r0 = r6.b
            if (r0 != 0) goto L_0x00b0
            goto L_0x015d
        L_0x00b0:
            boolean r7 = r15.isDestroyed()
            if (r7 != 0) goto L_0x0156
            boolean r7 = r15.isFinishing()
            if (r7 == 0) goto L_0x00be
            goto L_0x0156
        L_0x00be:
            hkc r7 = r6.c
            if (r7 != 0) goto L_0x00cb
            buc r15 = r6.d
            if (r15 == 0) goto L_0x015d
            defpackage.buc.y()
            goto L_0x015d
        L_0x00cb:
            yb3 r8 = r6.a
            if (r8 != 0) goto L_0x00d0
            goto L_0x00eb
        L_0x00d0:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r9 = "com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE"
            r2.<init>(r9)
            java.lang.String r9 = "com.android.vending"
            r2.setPackage(r9)
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            r9 = 128(0x80, float:1.794E-43)
            java.util.List r2 = r8.queryIntentServices(r2, r9)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
        L_0x00eb:
            if (r2 != 0) goto L_0x00f5
            buc r15 = r6.d
            if (r15 == 0) goto L_0x015d
            defpackage.buc.y()
            goto L_0x015d
        L_0x00f5:
            zeg r7 = (defpackage.zeg) r7
            boolean r2 = r7.b
            if (r2 == 0) goto L_0x0100
            ukg r15 = defpackage.j1e.r(r3)
            goto L_0x0137
        L_0x0100:
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.google.android.play.core.common.PlayCoreDialogWrapperActivity> r3 = com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class
            r2.<init>(r15, r3)
            java.lang.String r3 = "confirmation_intent"
            android.app.PendingIntent r7 = r7.a
            r2.putExtra(r3, r7)
            android.view.Window r3 = r15.getWindow()
            android.view.View r3 = r3.getDecorView()
            int r3 = r3.getWindowSystemUiVisibility()
            java.lang.String r7 = "window_flags"
            r2.putExtra(r7, r3)
            qne r3 = new qne
            r3.<init>()
            java.lang.Object r0 = r0.b
            android.os.Handler r0 = (android.os.Handler) r0
            c98 r7 = new c98
            r7.<init>(r1, r0, r3)
            java.lang.String r0 = "result_receiver"
            r2.putExtra(r0, r7)
            r15.startActivity(r2)
            ukg r15 = r3.a
        L_0x0137:
            zx6 r0 = new zx6
            r0.<init>(r6, r4)
            r15.getClass()
            q67 r2 = defpackage.xne.a
            r15.c(r2, r0)
            zx6 r0 = new zx6
            r0.<init>(r6, r1)
            r15.a(r2, r0)
            zx6 r0 = new zx6
            r1 = 3
            r0.<init>(r6, r1)
            r15.i(r0)
            goto L_0x015d
        L_0x0156:
            buc r15 = r6.d
            if (r15 == 0) goto L_0x015d
            defpackage.buc.y()
        L_0x015d:
            return r5
        L_0x015e:
            nl6 r6 = (defpackage.nl6) r6
            tk6 r15 = r6.a
            sk6 r15 = r15.i()
            return r15
        L_0x0167:
            ve6 r15 = new ve6
            we6 r6 = (defpackage.we6) r6
            r15.<init>(r6)
            return r15
        L_0x016f:
            pa6 r6 = (defpackage.pa6) r6
            android.graphics.drawable.ShapeDrawable r15 = defpackage.pa6.a(r6)
            return r15
        L_0x0176:
            d96 r15 = new d96
            z96 r6 = (defpackage.z96) r6
            r15.<init>(r6)
            return r15
        L_0x017e:
            lv6 r15 = new lv6
            s26 r6 = (defpackage.s26) r6
            je7 r0 = r6.e
            java.lang.Object r0 = r0.getValue()
            kv6 r0 = (defpackage.kv6) r0
            r15.<init>(r0)
            iv6 r15 = r15.f()
            return r15
        L_0x0192:
            ru.ok.tamtam.upload.workers.ForegroundWorker r6 = (ru.ok.tamtam.upload.workers.ForegroundWorker) r6
            fke r15 = r6.getTamComponent()
            jyc r15 = (defpackage.jyc) r15
            m7b r15 = r15.q()
            p7b r15 = (defpackage.p7b) r15
            z7d r15 = r15.b
            return r15
        L_0x01a3:
            bc7[] r15 = one.me.folders.picker.FolderMemberPickerScreen.y0
            int r15 = defpackage.vc7.a
            int r15 = defpackage.vc7.c
            boolean r15 = defpackage.vc7.b(r15)
            if (r15 == 0) goto L_0x01b4
            one.me.folders.picker.FolderMemberPickerScreen r6 = (one.me.folders.picker.FolderMemberPickerScreen) r6
            defpackage.mr0.G(r6)
        L_0x01b4:
            return r5
        L_0x01b5:
            bc7[] r15 = one.me.folders.edit.FolderEditScreen.s0
            nu5 r15 = new nu5
            bc7[] r0 = one.me.folders.edit.FolderEditScreen.s0
            r1 = r0[r2]
            one.me.folders.edit.FolderEditScreen r6 = (one.me.folders.edit.FolderEditScreen) r6
            fs r1 = r6.b
            java.lang.Object r1 = r1.a(r6)
            java.lang.String r1 = (java.lang.String) r1
            r0 = r0[r4]
            fs r0 = r6.c
            java.lang.Object r0 = r0.a(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r15.<init>(r1, r2)
            return r15
        L_0x01d9:
            en5 r15 = new en5
            fn5 r6 = (defpackage.fn5) r6
            r15.<init>(r6)
            return r15
        L_0x01e1:
            ni5 r15 = new ni5
            oi5 r6 = (defpackage.oi5) r6
            r15.<init>(r6)
            return r15
        L_0x01e9:
            at r15 = new at
            java.util.List r6 = (java.util.List) r6
            r15.<init>(r1, r6)
            pz2 r0 = new pz2
            r1 = 19
            r0.<init>(r1)
            qk5 r15 = defpackage.l6d.Z(r15, r0)
            java.util.Iterator r15 = r15.iterator()
            boolean r0 = r15.hasNext()
            if (r0 != 0) goto L_0x0208
            wz4 r15 = defpackage.wz4.a
            goto L_0x023e
        L_0x0208:
            java.lang.Object r0 = r15.next()
            je5 r0 = (defpackage.je5) r0
            long r0 = r0.f
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r1 = r15.hasNext()
            if (r1 != 0) goto L_0x021f
            java.util.Set r15 = java.util.Collections.singleton(r0)
            goto L_0x023e
        L_0x021f:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r1.add(r0)
        L_0x0227:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x023d
            java.lang.Object r0 = r15.next()
            je5 r0 = (defpackage.je5) r0
            long r2 = r0.f
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.add(r0)
            goto L_0x0227
        L_0x023d:
            r15 = r1
        L_0x023e:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 10
            int r1 = defpackage.z53.S(r15, r1)
            int r1 = defpackage.mz7.Z(r1)
            r2 = 16
            if (r1 >= r2) goto L_0x024f
            r1 = r2
        L_0x024f:
            r0.<init>(r1)
            java.util.Iterator r15 = r15.iterator()
        L_0x0256:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x028d
            java.lang.Object r1 = r15.next()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            int r4 = r6.size()
            java.util.ListIterator r4 = r6.listIterator(r4)
        L_0x026f:
            boolean r5 = r4.hasPrevious()
            if (r5 == 0) goto L_0x0285
            java.lang.Object r5 = r4.previous()
            je5 r5 = (defpackage.je5) r5
            long r7 = r5.f
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x026f
            r0.put(r1, r5)
            goto L_0x0256
        L_0x0285:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "List contains no element matching the predicate."
            r15.<init>(r0)
            throw r15
        L_0x028d:
            return r0
        L_0x028e:
            bc7[] r15 = one.me.inappreview.ui.FakeInAppReviewBottomSheet.H0
            pq9 r15 = defpackage.qp4.u0
            one.me.inappreview.ui.FakeInAppReviewBottomSheet r6 = (one.me.inappreview.ui.FakeInAppReviewBottomSheet) r6
            android.content.Context r0 = r6.getContext()
            qp4 r15 = r15.b(r0)
            fka r15 = r15.i()
            a1e r15 = r15.d()
            y0e r15 = r15.a
            x0e r15 = r15.a
            int r15 = r15.c
            android.graphics.drawable.ShapeDrawable r0 = r6.C0
            android.graphics.drawable.ShapeDrawable r1 = r6.A0
            android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r15 = android.content.res.ColorStateList.valueOf(r15)
            r2.<init>(r15, r0, r1)
            return r2
        L_0x02b8:
            k8g r6 = (defpackage.k8g) r6
            r6.b = r3
            return r5
        L_0x02bd:
            w25 r6 = (defpackage.w25) r6
            r6d r15 = r6.b
            if (r15 != 0) goto L_0x02da
            t25 r15 = new t25
            java.lang.Enum[] r0 = r6.a
            int r1 = r0.length
            r15.<init>(r1)
            int r1 = r0.length
            r3 = r2
        L_0x02cd:
            if (r3 >= r1) goto L_0x02da
            r5 = r0[r3]
            java.lang.String r5 = r5.name()
            r15.k(r5, r2)
            int r3 = r3 + r4
            goto L_0x02cd
        L_0x02da:
            return r15
        L_0x02db:
            one.me.sdk.richvector.EnhancedAnimatedVectorDrawable r6 = (one.me.sdk.richvector.EnhancedAnimatedVectorDrawable) r6
            d25 r15 = one.me.sdk.richvector.EnhancedAnimatedVectorDrawable.animatorListener_delegate$lambda$0(r6)
            return r15
        L_0x02e2:
            iy4 r6 = (defpackage.iy4) r6
            float r15 = r6.a()
            float r0 = r6.a()
            r1 = 11
            float r1 = (float) r1
            float r0 = r0 / r1
            float r0 = r0 + r15
            java.lang.Float r15 = java.lang.Float.valueOf(r0)
            return r15
        L_0x02f6:
            zm4 r6 = (defpackage.zm4) r6
            r6.d()
            return r5
        L_0x02fc:
            ri4 r6 = (defpackage.ri4) r6
            m7b r15 = r6.b
            p7b r15 = (defpackage.p7b) r15
            z7d r15 = r15.b
            r15.getClass()
            yxc r15 = defpackage.yxc.c
            return r15
        L_0x030a:
            p44 r6 = (defpackage.p44) r6
            r6.b = r4
            return r5
        L_0x030f:
            pfa r6 = (defpackage.pfa) r6
            return r6
        L_0x0312:
            rm4 r6 = (defpackage.rm4) r6
            java.lang.Object r15 = r6.get()
            return r15
        L_0x0319:
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r6 = (ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore) r6
            zad r15 = r6.getActiveRoomId()
            return r15
        L_0x0320:
            bc7[] r15 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.u0
            one.me.sdk.contextmenu.popup.ContextMenuPopupWindow r6 = (one.me.sdk.contextmenu.popup.ContextMenuPopupWindow) r6
            r6.getClass()
            bc7[] r15 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.u0
            r1 = r15[r0]
            fs r1 = r6.Z
            java.lang.Object r2 = r1.a(r6)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0350
            r15 = r15[r0]
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r1.b(r6, r15)
            uu3 r15 = r6.getTargetController()
            boolean r0 = r15 instanceof defpackage.xt3
            if (r0 == 0) goto L_0x034b
            r3 = r15
            xt3 r3 = (defpackage.xt3) r3
        L_0x034b:
            if (r3 == 0) goto L_0x0350
            r3.onDismiss()
        L_0x0350:
            return r5
        L_0x0351:
            bc7[] r15 = one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet.G0
            one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet r6 = (one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet) r6
            r6.getClass()
            bc7[] r15 = one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet.G0
            r1 = r15[r0]
            fs r1 = r6.E0
            java.lang.Object r2 = r1.a(r6)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0381
            r15 = r15[r0]
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r1.b(r6, r15)
            uu3 r15 = r6.getTargetController()
            boolean r0 = r15 instanceof defpackage.xt3
            if (r0 == 0) goto L_0x037c
            r3 = r15
            xt3 r3 = (defpackage.xt3) r3
        L_0x037c:
            if (r3 == 0) goto L_0x0381
            r3.onDismiss()
        L_0x0381:
            return r5
        L_0x0382:
            q0e r15 = defpackage.r0e.a(r3)
            r0 = 200(0xc8, double:9.9E-322)
            mn5 r0 = defpackage.od2.u(r15, r0)
            lq0 r1 = new lq0
            java.lang.String r12 = "startSearch(Ljava/lang/String;)V"
            r13 = 4
            r8 = 2
            js3 r6 = (defpackage.js3) r6
            java.lang.Class<js3> r10 = defpackage.js3.class
            java.lang.String r11 = "startSearch"
            r14 = 15
            r7 = r1
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            sx3 r0 = r6.a
            defpackage.od2.L(r2, r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es3.invoke():java.lang.Object");
    }
}
