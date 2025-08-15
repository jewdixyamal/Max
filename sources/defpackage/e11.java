package defpackage;

/* renamed from: e11  reason: default package */
public final /* synthetic */ class e11 extends p66 implements k56 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e11(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARNING: type inference failed for: r1v32, types: [uu3] */
    /* JADX WARNING: type inference failed for: r6v8, types: [um9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r19 = this;
            r0 = r19
            r1 = 11
            r2 = 3
            r3 = 200(0xc8, double:9.9E-322)
            r5 = 2
            r6 = 0
            r7 = 1
            r8 = 4
            e5f r9 = defpackage.e5f.a
            r10 = 0
            int r11 = r0.a
            switch(r11) {
                case 0: goto L_0x03ac;
                case 1: goto L_0x0389;
                case 2: goto L_0x0316;
                case 3: goto L_0x02e1;
                case 4: goto L_0x02d8;
                case 5: goto L_0x02cf;
                case 6: goto L_0x02c6;
                case 7: goto L_0x02a2;
                case 8: goto L_0x0299;
                case 9: goto L_0x0290;
                case 10: goto L_0x0254;
                case 11: goto L_0x024b;
                case 12: goto L_0x0242;
                case 13: goto L_0x0239;
                case 14: goto L_0x0230;
                case 15: goto L_0x0227;
                case 16: goto L_0x021e;
                case 17: goto L_0x01ae;
                case 18: goto L_0x01a6;
                case 19: goto L_0x019e;
                case 20: goto L_0x018b;
                case 21: goto L_0x0178;
                case 22: goto L_0x0165;
                case 23: goto L_0x013c;
                case 24: goto L_0x012f;
                case 25: goto L_0x00ff;
                case 26: goto L_0x00d1;
                case 27: goto L_0x008c;
                case 28: goto L_0x0036;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.Object r0 = r0.receiver
            one.me.sdk.messagewrite.MessageWriteWidget r0 = (one.me.sdk.messagewrite.MessageWriteWidget) r0
            bc7[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            sv8 r1 = r0.q0()
            java.lang.CharSequence r1 = r1.getText()
            xp7 r2 = r0.X
            p4d r2 = r2.f
            r2.k = r1
            xz8 r0 = r0.v0()
            q0e r0 = r0.G0
            tm9 r1 = new tm9
            r1.<init>()
            r0.m(r6, r1)
            return r9
        L_0x0036:
            java.lang.Object r0 = r0.receiver
            one.me.keyboardmedia.MediaKeyboardWidget r0 = (one.me.keyboardmedia.MediaKeyboardWidget) r0
            android.animation.ObjectAnimator r1 = r0.A0
            if (r1 == 0) goto L_0x0045
            boolean r1 = r1.isRunning()
            if (r1 != r7) goto L_0x0045
            goto L_0x008b
        L_0x0045:
            android.view.View r1 = r0.n0()
            float r1 = r1.getTranslationY()
            android.view.View r2 = r0.n0()
            int r2 = r2.getHeight()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x005b
            goto L_0x008b
        L_0x005b:
            android.animation.ObjectAnimator r1 = r0.A0
            if (r1 == 0) goto L_0x0062
            r1.cancel()
        L_0x0062:
            android.view.View r1 = r0.n0()
            float r1 = r1.getTranslationY()
            android.view.View r2 = r0.n0()
            int r2 = r2.getHeight()
            float r2 = (float) r2
            android.view.View r6 = r0.n0()
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r5 = new float[r5]
            r5[r10] = r1
            r5[r7] = r2
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r6, r8, r5)
            r1.setDuration(r3)
            r1.start()
            r0.A0 = r1
        L_0x008b:
            return r9
        L_0x008c:
            java.lang.Object r0 = r0.receiver
            one.me.keyboardmedia.MediaKeyboardWidget r0 = (one.me.keyboardmedia.MediaKeyboardWidget) r0
            android.animation.ObjectAnimator r1 = r0.A0
            if (r1 == 0) goto L_0x009b
            boolean r1 = r1.isRunning()
            if (r1 != r7) goto L_0x009b
            goto L_0x00d0
        L_0x009b:
            android.view.View r1 = r0.n0()
            float r1 = r1.getTranslationY()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x00a9
            goto L_0x00d0
        L_0x00a9:
            android.animation.ObjectAnimator r1 = r0.A0
            if (r1 == 0) goto L_0x00b0
            r1.cancel()
        L_0x00b0:
            android.view.View r1 = r0.n0()
            float r1 = r1.getTranslationY()
            android.view.View r6 = r0.n0()
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r5 = new float[r5]
            r5[r10] = r1
            r5[r7] = r2
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r6, r8, r5)
            r1.setDuration(r3)
            r1.start()
            r0.A0 = r1
        L_0x00d0:
            return r9
        L_0x00d1:
            java.lang.Object r0 = r0.receiver
            one.me.main.MainScreen r0 = (one.me.main.MainScreen) r0
            huc r1 = one.me.main.MainScreen.Z
            ox7 r1 = r0.r0()
            t6a r1 = r1.o
            znc r0 = r0.p0()
            if (r0 != 0) goto L_0x00e6
            spa r0 = defpackage.spa.f
            goto L_0x00fe
        L_0x00e6:
            java.lang.String r1 = r1.d
            uu3 r0 = r0.g(r1)
            boolean r1 = r0 instanceof defpackage.um9
            if (r1 == 0) goto L_0x00f3
            r6 = r0
            um9 r6 = (defpackage.um9) r6
        L_0x00f3:
            if (r6 != 0) goto L_0x00f8
            spa r0 = defpackage.spa.f
            goto L_0x00fe
        L_0x00f8:
            one.me.chats.tab.ChatsTabWidget r6 = (one.me.chats.tab.ChatsTabWidget) r6
            spa r0 = r6.r0()
        L_0x00fe:
            return r0
        L_0x00ff:
            java.lang.Object r0 = r0.receiver
            one.me.main.MainScreen r0 = (one.me.main.MainScreen) r0
            huc r1 = one.me.main.MainScreen.Z
            ox7 r1 = r0.r0()
            t6a r1 = r1.o
            znc r2 = r0.p0()
            if (r2 != 0) goto L_0x0116
            wuc r0 = r0.q0()
            goto L_0x012e
        L_0x0116:
            java.lang.String r1 = r1.d
            uu3 r1 = r2.g(r1)
            boolean r2 = r1 instanceof defpackage.vm9
            if (r2 == 0) goto L_0x0123
            r6 = r1
            vm9 r6 = (defpackage.vm9) r6
        L_0x0123:
            if (r6 != 0) goto L_0x012a
            wuc r0 = r0.q0()
            goto L_0x012e
        L_0x012a:
            wuc r0 = r6.o()
        L_0x012e:
            return r0
        L_0x012f:
            java.lang.Object r0 = r0.receiver
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r0 = r0.get()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x013c:
            java.lang.Object r0 = r0.receiver
            jt5 r0 = (defpackage.jt5) r0
            one.me.folders.edit.FolderEditScreen r0 = (one.me.folders.edit.FolderEditScreen) r0
            nu5 r0 = r0.n0()
            kke r1 = r0.o
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.a()
            vx3 r2 = defpackage.vx3.b
            fu5 r3 = new fu5
            r3.<init>(r0, r6)
            kotlinx.coroutines.internal.ContextScope r4 = r0.a
            vxd r1 = defpackage.j47.S(r4, r1, r2, r3)
            bc7[] r2 = defpackage.nu5.D0
            r2 = r2[r10]
            w4d r3 = r0.B0
            r3.o1(r0, r2, r1)
            return r9
        L_0x0165:
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            ne7 r0 = r0.g
            java.lang.String r1 = "web_app:ssl_check"
            boolean r0 = r0.getBoolean(r1, r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0178:
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            ne7 r0 = r0.g
            java.lang.String r1 = "app.enable_in_app_review_not_from_market_build"
            boolean r0 = r0.getBoolean(r1, r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x018b:
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            ne7 r0 = r0.g
            java.lang.String r1 = "app.disable_in_app_review_time_condition"
            boolean r0 = r0.getBoolean(r1, r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x019e:
            java.lang.Object r0 = r0.receiver
            nr3 r0 = (defpackage.nr3) r0
            r0.Q()
            return r9
        L_0x01a6:
            java.lang.Object r0 = r0.receiver
            nr3 r0 = (defpackage.nr3) r0
            r0.Q()
            return r9
        L_0x01ae:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            r0.getClass()
            dj3 r1 = new dj3
            r1.<init>()
            r1.c(r0)
            je7 r2 = r0.P0
            boolean r3 = defpackage.br7.H(r2)
            s5a r0 = r0.G0
            if (r3 == 0) goto L_0x01e6
            java.lang.Object r3 = r2.getValue()
            androidx.appcompat.widget.AppCompatCheckBox r3 = (androidx.appcompat.widget.AppCompatCheckBox) r3
            int r3 = r3.getId()
            sh0 r4 = new sh0
            r4.<init>((int) r3, (int) r8, (java.lang.Object) r1)
            r4.G(r10)
            r4.e(r10)
            r4.D(r10)
            int r3 = r0.getId()
            r4.p(r3)
        L_0x01e6:
            int r0 = r0.getId()
            sh0 r3 = new sh0
            r3.<init>((int) r0, (int) r8, (java.lang.Object) r1)
            r3.G(r10)
            r3.e(r10)
            boolean r0 = defpackage.br7.H(r2)
            if (r0 == 0) goto L_0x021a
            java.lang.Object r0 = r2.getValue()
            androidx.appcompat.widget.AppCompatCheckBox r0 = (androidx.appcompat.widget.AppCompatCheckBox) r0
            int r0 = r0.getId()
            l2a r0 = r3.C(r0)
            r2 = 12
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            defpackage.au1.p(r2, r3, r0)
            goto L_0x021d
        L_0x021a:
            r3.D(r10)
        L_0x021d:
            return r1
        L_0x021e:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            dj3 r0 = defpackage.lk3.I(r0)
            return r0
        L_0x0227:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            dj3 r0 = defpackage.lk3.G(r0)
            return r0
        L_0x0230:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            dj3 r0 = defpackage.lk3.F(r0)
            return r0
        L_0x0239:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            dj3 r0 = defpackage.lk3.A(r0)
            return r0
        L_0x0242:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            dj3 r0 = defpackage.lk3.E(r0)
            return r0
        L_0x024b:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            dj3 r0 = defpackage.lk3.C(r0)
            return r0
        L_0x0254:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            r0.getClass()
            dj3 r1 = new dj3
            r1.<init>()
            r1.c(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = r0.H0
            int r0 = r0.getId()
            r1.d(r0, r2, r10, r2)
            r1.d(r0, r8, r10, r8)
            r2 = 6
            r1.d(r0, r2, r10, r2)
            l2a r3 = new l2a
            r3.<init>(r1, r2, r0, r8)
            r3.e(r10)
            r2 = 7
            r1.d(r0, r2, r10, r2)
            l2a r3 = new l2a
            r3.<init>(r1, r2, r0, r8)
            r3.e(r10)
            yi3 r0 = r1.g(r0)
            zi3 r0 = r0.d
            r0.l0 = r7
            return r1
        L_0x0290:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            dj3 r0 = defpackage.lk3.y(r0)
            return r0
        L_0x0299:
            java.lang.Object r0 = r0.receiver
            lk3 r0 = (defpackage.lk3) r0
            dj3 r0 = defpackage.lk3.B(r0)
            return r0
        L_0x02a2:
            java.lang.Object r0 = r0.receiver
            one.me.chats.search.ChatsListSearchScreen r0 = (one.me.chats.search.ChatsListSearchScreen) r0
            bc7[] r1 = one.me.chats.search.ChatsListSearchScreen.J0
            gw2 r0 = r0.n0()
            w7c r0 = r0.F0
            j0e r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            ov2 r0 = (defpackage.ov2) r0
            nv2 r0 = r0.a
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x02c3
            if (r0 == r8) goto L_0x02c3
            wuc r0 = defpackage.wuc.CHATS_LIST_SEARCH_INITIAL
            goto L_0x02c5
        L_0x02c3:
            wuc r0 = defpackage.wuc.CHATS_LIST_SEARCH_RESULT
        L_0x02c5:
            return r0
        L_0x02c6:
            java.lang.Object r0 = r0.receiver
            bl2 r0 = (defpackage.bl2) r0
            mn5 r0 = r0.s()
            return r0
        L_0x02cf:
            java.lang.Object r0 = r0.receiver
            bl2 r0 = (defpackage.bl2) r0
            mn5 r0 = r0.s()
            return r0
        L_0x02d8:
            java.lang.Object r0 = r0.receiver
            one.me.profile.screens.media.ChatMediaTabWidget r0 = (one.me.profile.screens.media.ChatMediaTabWidget) r0
            wuc r0 = one.me.profile.screens.media.ChatMediaTabWidget.m0(r0)
            return r0
        L_0x02e1:
            java.lang.Object r0 = r0.receiver
            u52 r0 = (defpackage.u52) r0
            je7 r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            iy2 r2 = (defpackage.iy2) r2
            long r3 = r0.b
            jz2 r2 = (defpackage.jz2) r2
            w7c r2 = r2.m(r3)
            t03 r3 = new t03
            r3.<init>(r2, r1)
            xk1 r2 = new xk1
            r2.<init>(r3, r1)
            je7 r0 = r0.X
            java.lang.Object r0 = r0.getValue()
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.b()
            mn5 r0 = defpackage.od2.F(r2, r0)
            mn5 r0 = defpackage.od2.x(r0)
            return r0
        L_0x0316:
            java.lang.Object r0 = r0.receiver
            one.me.calls.ui.ui.incoming.CallIncomingScreen r0 = (one.me.calls.ui.ui.incoming.CallIncomingScreen) r0
            crd r1 = one.me.calls.ui.ui.incoming.CallIncomingScreen.Z
            je7 r1 = r0.o
            java.lang.Object r1 = r1.getValue()
            eua r1 = (defpackage.eua) r1
            java.lang.String[] r3 = defpackage.eua.h
            boolean r1 = r1.b(r3)
            if (r1 != 0) goto L_0x0381
            je7 r1 = r0.X
            java.lang.Object r1 = r1.getValue()
            r10 = r1
            bt1 r10 = (defpackage.bt1) r10
            kr1 r1 = r0.a
            wr1 r1 = (defpackage.wr1) r1
            d04 r2 = r1.k()
            java.lang.String r12 = r2.c
            d04 r1 = r1.k()
            boolean r1 = r1.h
            r10.getClass()
            r14 = 0
            r18 = 56
            java.lang.String r11 = "REQUEST_PERMISSION_MIC"
            java.lang.String r13 = "BEFORE_JOIN"
            r15 = 0
            r16 = 0
            r17 = r1
            defpackage.bt1.c(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            je7 r1 = r0.o
            java.lang.Object r1 = r1.getValue()
            eua r1 = (defpackage.eua) r1
            je7 r0 = r0.Y
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            l5g r2 = (defpackage.l5g) r2
            int r6 = defpackage.b8a.E
            r1.getClass()
            int r5 = defpackage.j1c.permissions_audio_title
            int r7 = defpackage.oga.g
            boolean r0 = defpackage.eua.i(r2, r3)
            r4 = 160(0xa0, float:2.24E-43)
            if (r0 == 0) goto L_0x037d
            r2.c(r3, r4, r5, r6, r7)
            goto L_0x0388
        L_0x037d:
            r1.f(r2, r3, r4)
            goto L_0x0388
        L_0x0381:
            e91 r0 = r0.m0()
            r0.q()
        L_0x0388:
            return r9
        L_0x0389:
            java.lang.Object r0 = r0.receiver
            r1 = r0
            e91 r1 = (defpackage.e91) r1
            ji6 r0 = defpackage.ji6.c
            kr1 r2 = r1.X
            wr1 r2 = (defpackage.wr1) r2
            r2.w(r0)
        L_0x0397:
            q0e r0 = r1.t0
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            c91 r3 = (defpackage.c91) r3
            b91 r3 = new b91
            r3.<init>(r10)
            boolean r0 = r0.c(r2, r3)
            if (r0 == 0) goto L_0x0397
            return r9
        L_0x03ac:
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            ne7 r0 = r0.g
            java.lang.String r1 = "app.calls_sdk.logging.webrtc"
            boolean r0 = r0.getBoolean(r1, r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.invoke():java.lang.Object");
    }
}
