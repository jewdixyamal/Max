package defpackage;

import android.view.View;

/* renamed from: v7d  reason: default package */
public final /* synthetic */ class v7d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v7d(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [java.lang.CharSequence, android.text.Editable] */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r7v43, types: [w2g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            r8 = 0
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r7.c
            java.lang.Object r3 = r7.b
            int r7 = r7.a
            switch(r7) {
                case 0: goto L_0x0306;
                case 1: goto L_0x02cf;
                case 2: goto L_0x02c3;
                case 3: goto L_0x02ac;
                case 4: goto L_0x0149;
                case 5: goto L_0x013c;
                case 6: goto L_0x0129;
                case 7: goto L_0x00ca;
                case 8: goto L_0x00be;
                case 9: goto L_0x00b2;
                case 10: goto L_0x0095;
                case 11: goto L_0x0089;
                case 12: goto L_0x006a;
                case 13: goto L_0x0060;
                case 14: goto L_0x0058;
                case 15: goto L_0x004b;
                case 16: goto L_0x0041;
                case 17: goto L_0x0024;
                case 18: goto L_0x0018;
                default: goto L_0x000c;
            }
        L_0x000c:
            jw7 r3 = (defpackage.jw7) r3
            z2e r7 = r3.H0
            if (r7 == 0) goto L_0x0017
            w2e r2 = (defpackage.w2e) r2
            r2.k(r7)
        L_0x0017:
            return
        L_0x0018:
            z2g r3 = (defpackage.z2g) r3
            w2g r7 = r3.F0
            if (r7 == 0) goto L_0x0023
            m56 r2 = (defpackage.m56) r2
            r2.invoke(r7)
        L_0x0023:
            return
        L_0x0024:
            y2g r3 = (defpackage.y2g) r3
            w2g r7 = r3.F0
            boolean r8 = r7 instanceof defpackage.u2g
            if (r8 == 0) goto L_0x002f
            r1 = r7
            u2g r1 = (defpackage.u2g) r1
        L_0x002f:
            if (r1 != 0) goto L_0x0032
            goto L_0x0040
        L_0x0032:
            vfd r7 = r1.a
            hfd r7 = r7.Z
            ffd r7 = (defpackage.ffd) r7
            boolean r7 = r7.a
            r7 = r7 ^ r0
            x2g r2 = (defpackage.x2g) r2
            r2.b(r1, r7)
        L_0x0040:
            return
        L_0x0041:
            x9f r2 = (defpackage.x9f) r2
            androidx.appcompat.widget.AppCompatImageView r7 = r2.o
            m56 r3 = (defpackage.m56) r3
            r3.invoke(r7)
            return
        L_0x004b:
            k56 r3 = (defpackage.k56) r3
            if (r3 == 0) goto L_0x0052
            r3.invoke()
        L_0x0052:
            ywe r2 = (defpackage.ywe) r2
            r2.a()
            return
        L_0x0058:
            m56 r3 = (defpackage.m56) r3
            wre r2 = (defpackage.wre) r2
            r3.invoke(r2)
            return
        L_0x0060:
            vre r2 = (defpackage.vre) r2
            java.lang.String r7 = r2.a
            m56 r3 = (defpackage.m56) r3
            r3.invoke(r7)
            return
        L_0x006a:
            oce r3 = (defpackage.oce) r3
            r7 = r3
            one.me.sdk.messagewrite.mention.SuggestionsWidget r7 = (one.me.sdk.messagewrite.mention.SuggestionsWidget) r7
            yce r8 = r7.B0()
        L_0x0073:
            q0e r0 = r8.I0
            java.lang.Object r1 = r0.getValue()
            r3 = r1
            rce r3 = (defpackage.rce) r3
            r3 = r2
            rce r3 = (defpackage.rce) r3
            boolean r0 = r0.c(r1, r3)
            if (r0 == 0) goto L_0x0073
            r7.C0()
            return
        L_0x0089:
            i6e r3 = (defpackage.i6e) r3
            y0d r7 = r3.F0
            if (r7 == 0) goto L_0x0094
            m56 r2 = (defpackage.m56) r2
            r2.invoke(r7)
        L_0x0094:
            return
        L_0x0095:
            h4e r3 = (defpackage.h4e) r3
            e02 r7 = r3.L0
            if (r7 == 0) goto L_0x00b1
            android.view.View r8 = r3.a
            one.me.sdk.uikit.common.views.OneMeDraweeView r8 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r8
            android.graphics.drawable.ShapeDrawable r0 = r3.F0
            r8.setBackground(r0)
            w3e r7 = r7.b
            long r7 = r7.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            m56 r2 = (defpackage.m56) r2
            r2.invoke(r7)
        L_0x00b1:
            return
        L_0x00b2:
            s3e r3 = (defpackage.s3e) r3
            y0d r7 = r3.J0
            if (r7 == 0) goto L_0x00bd
            m56 r2 = (defpackage.m56) r2
            r2.invoke(r7)
        L_0x00bd:
            return
        L_0x00be:
            jw7 r3 = (defpackage.jw7) r3
            z2e r7 = r3.H0
            if (r7 == 0) goto L_0x00c9
            w2e r2 = (defpackage.w2e) r2
            r2.k(r7)
        L_0x00c9:
            return
        L_0x00ca:
            bc7[] r7 = one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet.A0
            one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet r3 = (one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet) r3
            je7 r7 = r3.z0
            java.lang.Object r7 = r7.getValue()
            xzd r7 = (defpackage.xzd) r7
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.text.Editable r2 = r2.getText()
            el1 r7 = r7.b
            if (r2 == 0) goto L_0x00f4
            boolean r4 = defpackage.w9e.C0(r2)
            if (r4 == 0) goto L_0x00f4
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x00f4
            s35 r7 = r7.M0
            uj1 r8 = defpackage.wj1.z
            defpackage.pnf.o(r7, r8)
            goto L_0x0128
        L_0x00f4:
            if (r2 == 0) goto L_0x00fc
            int r4 = r2.length()
            if (r4 != 0) goto L_0x00fd
        L_0x00fc:
            r8 = r0
        L_0x00fd:
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r2 = r1
        L_0x0102:
            if (r2 != 0) goto L_0x011b
            w7c r8 = r7.C0
            j0e r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            la1 r8 = (defpackage.la1) r8
            m31 r8 = r8.f
            if (r8 == 0) goto L_0x0114
            java.lang.CharSequence r1 = r8.b
        L_0x0114:
            if (r1 != 0) goto L_0x011a
            java.lang.String r8 = ""
            r2 = r8
            goto L_0x011b
        L_0x011a:
            r2 = r1
        L_0x011b:
            s35 r7 = r7.M0
            mj1 r8 = new mj1
            r8.<init>(r2)
            defpackage.pnf.o(r7, r8)
            r3.s0(r0)
        L_0x0128:
            return
        L_0x0129:
            wpd r2 = (defpackage.wpd) r2
            int r7 = r2.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            xpd r3 = (defpackage.xpd) r3
            m56 r8 = r3.b
            r8.invoke(r7)
            r3.dismiss()
            return
        L_0x013c:
            tmd r3 = (defpackage.tmd) r3
            one.me.sdk.uikit.common.button.OneMeButton r7 = r3.J0
            r7.setProgressEnabled(r0)
            k56 r2 = (defpackage.k56) r2
            r2.invoke()
            return
        L_0x0149:
            ol7 r2 = (defpackage.ol7) r2
            v0d r2 = (defpackage.v0d) r2
            bc7[] r7 = one.me.settings.privacy.ui.SettingsPrivacyScreen.Z
            qqd r3 = (defpackage.qqd) r3
            java.lang.Object r7 = r3.b
            one.me.settings.privacy.ui.SettingsPrivacyScreen r7 = (one.me.settings.privacy.ui.SettingsPrivacyScreen) r7
            cid r7 = r7.m0()
            r7.getClass()
            long r0 = defpackage.jha.j
            long r2 = r2.o
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x016b
            aed r8 = defpackage.aed.f
            r7.w(r8)
            goto L_0x02ab
        L_0x016b:
            long r0 = defpackage.jha.e
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x01a6
            y7d r8 = r7.v()
            qyc r8 = (defpackage.qyc) r8
            boolean r8 = r8.v()
            if (r8 == 0) goto L_0x019f
            kxc r8 = r7.s()
            boolean r8 = r8.r()
            if (r8 == 0) goto L_0x019f
            r7.K0 = r2
            q33 r8 = r7.t()
            boolean r8 = r8.b()
            if (r8 == 0) goto L_0x0198
            r7.x()
            goto L_0x02ab
        L_0x0198:
            xdd r8 = defpackage.xdd.b
            r7.w(r8)
            goto L_0x02ab
        L_0x019f:
            aed r8 = defpackage.aed.h
            r7.w(r8)
            goto L_0x02ab
        L_0x01a6:
            long r0 = defpackage.jha.c
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x01e1
            y7d r8 = r7.v()
            qyc r8 = (defpackage.qyc) r8
            boolean r8 = r8.v()
            if (r8 == 0) goto L_0x01da
            kxc r8 = r7.s()
            boolean r8 = r8.r()
            if (r8 == 0) goto L_0x01da
            r7.K0 = r2
            q33 r8 = r7.t()
            boolean r8 = r8.b()
            if (r8 == 0) goto L_0x01d3
            r7.x()
            goto L_0x02ab
        L_0x01d3:
            xdd r8 = defpackage.xdd.b
            r7.w(r8)
            goto L_0x02ab
        L_0x01da:
            aed r8 = defpackage.aed.j
            r7.w(r8)
            goto L_0x02ab
        L_0x01e1:
            long r0 = defpackage.jha.k
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x01f8
            ihd r8 = defpackage.ihd.c
            r8.getClass()
            c64 r8 = new c64
            java.lang.String r0 = ":settings/webapps"
            r8.<init>(r0)
            r7.w(r8)
            goto L_0x02ab
        L_0x01f8:
            long r0 = defpackage.jha.d
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x020f
            ihd r8 = defpackage.ihd.c
            r8.getClass()
            c64 r8 = new c64
            java.lang.String r0 = ":settings/blacklist"
            r8.<init>(r0)
            r7.w(r8)
            goto L_0x02ab
        L_0x020f:
            long r0 = defpackage.jha.f
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x021c
            aed r8 = defpackage.aed.k
            r7.w(r8)
            goto L_0x02ab
        L_0x021c:
            long r0 = defpackage.jha.i
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0254
            y7d r8 = r7.v()
            qyc r8 = (defpackage.qyc) r8
            boolean r8 = r8.v()
            if (r8 == 0) goto L_0x024e
            kxc r8 = r7.s()
            boolean r8 = r8.r()
            if (r8 == 0) goto L_0x024e
            r7.K0 = r2
            q33 r8 = r7.t()
            boolean r8 = r8.b()
            if (r8 == 0) goto L_0x0248
            r7.x()
            goto L_0x02ab
        L_0x0248:
            xdd r8 = defpackage.xdd.b
            r7.w(r8)
            goto L_0x02ab
        L_0x024e:
            aed r8 = defpackage.aed.i
            r7.w(r8)
            goto L_0x02ab
        L_0x0254:
            long r0 = defpackage.jha.h
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0274
            kxc r8 = r7.s()
            boolean r8 = r8.r()
            if (r8 == 0) goto L_0x02ab
            q33 r8 = r7.t()
            boolean r8 = r8.b()
            if (r8 != 0) goto L_0x02ab
            xdd r8 = defpackage.xdd.b
            r7.w(r8)
            goto L_0x02ab
        L_0x0274:
            long r0 = defpackage.jha.b
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x02ab
            y7d r8 = r7.v()
            qyc r8 = (defpackage.qyc) r8
            boolean r8 = r8.v()
            if (r8 == 0) goto L_0x02a6
            kxc r8 = r7.s()
            boolean r8 = r8.r()
            if (r8 == 0) goto L_0x02a6
            r7.K0 = r2
            q33 r8 = r7.t()
            boolean r8 = r8.b()
            if (r8 == 0) goto L_0x02a0
            r7.x()
            goto L_0x02ab
        L_0x02a0:
            xdd r8 = defpackage.xdd.b
            r7.w(r8)
            goto L_0x02ab
        L_0x02a6:
            aed r8 = defpackage.aed.l
            r7.w(r8)
        L_0x02ab:
            return
        L_0x02ac:
            ol7 r2 = (defpackage.ol7) r2
            c1d r2 = (defpackage.c1d) r2
            bc7[] r7 = one.me.settings.media.ui.SettingMediaScreen.Y
            fd7 r3 = (defpackage.fd7) r3
            java.lang.Object r7 = r3.a
            one.me.settings.media.ui.SettingMediaScreen r7 = (one.me.settings.media.ui.SettingMediaScreen) r7
            ndd r7 = r7.m0()
            long r0 = r2.o
            int r8 = (int) r0
            r7.s(r8)
            return
        L_0x02c3:
            kfd r2 = (defpackage.kfd) r2
            long r7 = r2.getItemId()
            lfd r3 = (defpackage.lfd) r3
            r3.i(r7)
            return
        L_0x02cf:
            ol7 r2 = (defpackage.ol7) r2
            wo0 r2 = (defpackage.wo0) r2
            bc7[] r7 = one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen.Z
            gaa r3 = (defpackage.gaa) r3
            java.lang.Object r7 = r3.a
            one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen r7 = (one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen) r7
            ped r7 = r7.m0()
            je7 r0 = r7.s0
            java.lang.Object r0 = r0.getValue()
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.a()
            vx3 r3 = defpackage.vx3.b
            ned r4 = new ned
            long r5 = r2.a
            r4.<init>(r7, r5, r1)
            kotlinx.coroutines.internal.ContextScope r1 = r7.a
            vxd r0 = defpackage.j47.S(r1, r0, r3, r4)
            bc7[] r1 = defpackage.ped.z0
            r8 = r1[r8]
            w4d r1 = r7.x0
            r1.o1(r7, r8, r0)
            return
        L_0x0306:
            bc7[] r7 = one.me.devmenu.server.ServerPortBottomSheet.B0
            r7 = r7[r8]
            one.me.devmenu.server.ServerPortBottomSheet r3 = (one.me.devmenu.server.ServerPortBottomSheet) r3
            q7c r4 = r3.z0
            java.lang.Object r7 = r4.T0(r3, r7)
            cka r7 = (defpackage.cka) r7
            java.lang.CharSequence r7 = r7.getText()
            if (r7 == 0) goto L_0x0320
            int r4 = r7.length()
            if (r4 != 0) goto L_0x0321
        L_0x0320:
            r8 = r0
        L_0x0321:
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x0358
            je7 r8 = r3.y0
            java.lang.Object r8 = r8.getValue()
            l6b r8 = (defpackage.l6b) r8
            java.lang.String r7 = r7.toString()
            zja r0 = new zja
            one.me.sdk.uikit.common.button.OneMeButton r2 = (one.me.sdk.uikit.common.button.OneMeButton) r2
            r4 = 18
            r0.<init>(r2, r4, r3)
            kotlinx.coroutines.internal.ContextScope r2 = r8.a
            je7 r3 = r8.c
            java.lang.Object r3 = r3.getValue()
            kke r3 = (defpackage.kke) r3
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.b()
            xq9 r4 = defpackage.xq9.a
            lx3 r3 = r3.plus(r4)
            k6b r4 = new k6b
            r4.<init>(r8, r7, r0, r1)
            r7 = 2
            defpackage.j47.T(r2, r3, r1, r4, r7)
        L_0x0358:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7d.onClick(android.view.View):void");
    }
}
