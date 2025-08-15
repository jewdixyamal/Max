package defpackage;

import one.me.calllist.ui.callinfo.CallLinkInfoScreen;

/* renamed from: k8  reason: default package */
public final /* synthetic */ class k8 implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ k8(int i) {
        this.a = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            r3 = 0
            int r13 = r13.a
            switch(r13) {
                case 0: goto L_0x0505;
                case 1: goto L_0x0500;
                case 2: goto L_0x04f7;
                case 3: goto L_0x04e2;
                case 4: goto L_0x04d3;
                case 5: goto L_0x04c9;
                case 6: goto L_0x04c0;
                case 7: goto L_0x049b;
                case 8: goto L_0x0492;
                case 9: goto L_0x048b;
                case 10: goto L_0x0486;
                case 11: goto L_0x047d;
                case 12: goto L_0x0474;
                case 13: goto L_0x024e;
                case 14: goto L_0x0241;
                case 15: goto L_0x0237;
                case 16: goto L_0x022d;
                case 17: goto L_0x022a;
                case 18: goto L_0x0220;
                case 19: goto L_0x0216;
                case 20: goto L_0x020a;
                case 21: goto L_0x01fe;
                case 22: goto L_0x01ef;
                case 23: goto L_0x01e3;
                case 24: goto L_0x01d7;
                case 25: goto L_0x017d;
                case 26: goto L_0x004f;
                case 27: goto L_0x0021;
                case 28: goto L_0x0015;
                default: goto L_0x0009;
            }
        L_0x0009:
            fka r14 = (defpackage.fka) r14
            b46 r13 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            r14.b()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            return r13
        L_0x0015:
            fka r14 = (defpackage.fka) r14
            b46 r13 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            r14.getIcon()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            return r13
        L_0x0021:
            android.view.View r14 = (android.view.View) r14
            b46 r13 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            z71 r13 = defpackage.z71.c
            f64 r14 = r13.P1()
            boolean r14 = r14.d()
            if (r14 != 0) goto L_0x004c
            f64 r13 = r13.P1()
            x54 r13 = r13.a()
            haa r13 = (defpackage.haa) r13
            foc r13 = r13.f()
            znc r13 = r13.C()
            android.app.Activity r13 = r13.d()
            if (r13 == 0) goto L_0x004c
            r13.finish()
        L_0x004c:
            e5f r13 = defpackage.e5f.a
            return r13
        L_0x004f:
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            b46 r13 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            s5a r13 = new s5a
            android.content.Context r0 = r14.getContext()
            r13.<init>(r0)
            int r0 = defpackage.r7a.r
            r13.setId(r0)
            j5a r0 = defpackage.j5a.a
            r13.setAvatarShape(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r4 = 96
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = defpackage.tu0.G(r5)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = defpackage.tu0.G(r4)
            r0.<init>(r5, r4)
            r0.gravity = r1
            r4 = 18
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = defpackage.tu0.G(r4)
            r0.topMargin = r4
            r13.setLayoutParams(r0)
            r14.addView(r13)
            android.widget.TextView r13 = new android.widget.TextView
            android.content.Context r0 = r14.getContext()
            r13.<init>(r0)
            int r0 = defpackage.r7a.u
            r13.setId(r0)
            kqe r0 = defpackage.i4f.h
            r0.b(r13, defpackage.du4.b)
            r13.setMaxLines(r1)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r13.setEllipsize(r0)
            r0 = 17
            r13.setGravity(r0)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r1
            int r4 = defpackage.tu0.G(r4)
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r1
            int r5 = defpackage.tu0.G(r5)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r1
            int r6 = defpackage.tu0.G(r6)
            r7 = 4
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = defpackage.tu0.G(r7)
            r13.setPadding(r4, r5, r6, r7)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r2, r2)
            r13.setLayoutParams(r4)
            r14.addView(r13)
            android.widget.TextView r13 = new android.widget.TextView
            android.content.Context r4 = r14.getContext()
            r13.<init>(r4)
            int r4 = defpackage.r7a.s
            r13.setId(r4)
            kqe r4 = defpackage.i4f.f
            r4.b(r13, defpackage.du4.b)
            pq9 r4 = defpackage.qp4.u0
            fka r4 = r4.j(r13)
            xoe r4 = r4.getText()
            int r4 = r4.j
            r13.setTextColor(r4)
            r13.setGravity(r0)
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = defpackage.tu0.G(r0)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r1 = r1 * r4
            int r1 = defpackage.tu0.G(r1)
            r4 = 16
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = defpackage.tu0.G(r4)
            r13.setPadding(r0, r3, r1, r4)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r2)
            r13.setLayoutParams(r0)
            r14.addView(r13)
            e5f r13 = defpackage.e5f.a
            return r13
        L_0x017d:
            androidx.appcompat.widget.Toolbar r14 = (androidx.appcompat.widget.Toolbar) r14
            b46 r13 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            cla r13 = new cla
            android.content.Context r0 = r14.getContext()
            r1 = 6
            r13.<init>(r0, r1)
            int r0 = defpackage.r7a.t
            r13.setId(r0)
            uka r0 = defpackage.uka.a
            r13.setForm(r0)
            r13.setTextShimmerEnabled(r3)
            kka r0 = new kka
            k8 r2 = new k8
            r3 = 27
            r2.<init>(r3)
            r0.<init>(r2)
            r13.setLeftActions(r0)
            float r0 = (float) r1
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r0
            int r1 = defpackage.tu0.G(r1)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.tu0.G(r0)
            int r2 = r13.getPaddingTop()
            int r3 = r13.getPaddingBottom()
            r13.setPaddingRelative(r1, r2, r0, r3)
            r14.addView(r13)
            e5f r13 = defpackage.e5f.a
            return r13
        L_0x01d7:
            fka r14 = (defpackage.fka) r14
            b46 r13 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            r14.b()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            return r13
        L_0x01e3:
            fka r14 = (defpackage.fka) r14
            b46 r13 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.B0
            r14.getIcon()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            return r13
        L_0x01ef:
            android.content.Intent r14 = (android.content.Intent) r14
            java.lang.String r13 = "action-open-call"
            r14.setAction(r13)
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r14.setFlags(r13)
            e5f r13 = defpackage.e5f.a
            return r13
        L_0x01fe:
            boolean r13 = r14 instanceof java.lang.Iterable
            if (r13 == 0) goto L_0x0205
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            goto L_0x0209
        L_0x0205:
            java.util.List r14 = java.util.Collections.singletonList(r14)
        L_0x0209:
            return r14
        L_0x020a:
            boolean r13 = r14 instanceof java.lang.Iterable
            if (r13 == 0) goto L_0x0211
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            goto L_0x0215
        L_0x0211:
            java.util.List r14 = java.util.Collections.singletonList(r14)
        L_0x0215:
            return r14
        L_0x0216:
            fka r14 = (defpackage.fka) r14
            r14.b()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            return r13
        L_0x0220:
            fka r14 = (defpackage.fka) r14
            r14.getIcon()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            return r13
        L_0x022a:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        L_0x022d:
            fka r14 = (defpackage.fka) r14
            r14.b()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            return r13
        L_0x0237:
            fka r14 = (defpackage.fka) r14
            r14.getIcon()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            return r13
        L_0x0241:
            android.view.View r14 = (android.view.View) r14
            int r13 = ru.ok.messages.media.attaches.AudioAttachView.w0
            boolean r13 = r14.isClickable()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L_0x024e:
            gy8 r14 = (defpackage.gy8) r14
            java.lang.String r13 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            int r4 = defpackage.lz7.N(r14)     // Catch:{ all -> 0x0259 }
            goto L_0x0288
        L_0x0259:
            r4 = move-exception
            defpackage.hm9.l0(r2, r13, r4)
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.u7d.a
            java.util.Iterator r5 = r5.iterator()
        L_0x0263:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0276
            java.lang.Object r6 = r5.next()
            r4a r6 = (defpackage.r4a) r6
            r6.getClass()
            defpackage.r4a.a(r4)
            goto L_0x0263
        L_0x0276:
            int r5 = defpackage.k7d.a
            int r5 = defpackage.au1.s(r5)
            if (r5 == 0) goto L_0x0287
            if (r5 == r1) goto L_0x0286
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0286:
            throw r4
        L_0x0287:
            r4 = r3
        L_0x0288:
            if (r4 != 0) goto L_0x028c
            goto L_0x0473
        L_0x028c:
            r7 = r0
            r8 = r7
            r9 = r8
            r5 = r3
            r6 = r5
        L_0x0291:
            if (r5 >= r4) goto L_0x0405
            java.lang.String r10 = defpackage.lz7.P(r14)     // Catch:{ all -> 0x0298 }
            goto L_0x02c7
        L_0x0298:
            r10 = move-exception
            defpackage.hm9.l0(r2, r13, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.u7d.a
            java.util.Iterator r11 = r11.iterator()
        L_0x02a2:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x02b5
            java.lang.Object r12 = r11.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r10)
            goto L_0x02a2
        L_0x02b5:
            int r11 = defpackage.k7d.a
            int r11 = defpackage.au1.s(r11)
            if (r11 == 0) goto L_0x02c6
            if (r11 == r1) goto L_0x02c5
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x02c5:
            throw r10
        L_0x02c6:
            r10 = r0
        L_0x02c7:
            if (r10 != 0) goto L_0x02cb
            goto L_0x0402
        L_0x02cb:
            int r11 = r10.hashCode()
            switch(r11) {
                case 3226745: goto L_0x0394;
                case 3556653: goto L_0x0354;
                case 3575610: goto L_0x0315;
                case 103772132: goto L_0x02d4;
                default: goto L_0x02d2;
            }
        L_0x02d2:
            goto L_0x039c
        L_0x02d4:
            java.lang.String r11 = "media"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x02de
            goto L_0x039c
        L_0x02de:
            bz r8 = defpackage.bz.b(r14)     // Catch:{ all -> 0x02e4 }
            goto L_0x0402
        L_0x02e4:
            r8 = move-exception
            defpackage.hm9.l0(r2, r13, r8)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.u7d.a
            java.util.Iterator r10 = r10.iterator()
        L_0x02ee:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0301
            java.lang.Object r11 = r10.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r8)
            goto L_0x02ee
        L_0x0301:
            int r10 = defpackage.k7d.a
            int r10 = defpackage.au1.s(r10)
            if (r10 == 0) goto L_0x0312
            if (r10 == r1) goto L_0x0311
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0311:
            throw r8
        L_0x0312:
            r8 = r0
            goto L_0x0402
        L_0x0315:
            java.lang.String r11 = "type"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x039c
            short r6 = defpackage.lz7.O(r14)     // Catch:{ all -> 0x0323 }
            goto L_0x0402
        L_0x0323:
            r6 = move-exception
            defpackage.hm9.l0(r2, r13, r6)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.u7d.a
            java.util.Iterator r10 = r10.iterator()
        L_0x032d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0340
            java.lang.Object r11 = r10.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r6)
            goto L_0x032d
        L_0x0340:
            int r10 = defpackage.k7d.a
            int r10 = defpackage.au1.s(r10)
            if (r10 == 0) goto L_0x0351
            if (r10 == r1) goto L_0x0350
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0350:
            throw r6
        L_0x0351:
            r6 = r3
            goto L_0x0402
        L_0x0354:
            java.lang.String r11 = "text"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x035d
            goto L_0x039c
        L_0x035d:
            d5g r7 = defpackage.f8.r(r14)     // Catch:{ all -> 0x0363 }
            goto L_0x0402
        L_0x0363:
            r7 = move-exception
            defpackage.hm9.l0(r2, r13, r7)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.u7d.a
            java.util.Iterator r10 = r10.iterator()
        L_0x036d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0380
            java.lang.Object r11 = r10.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r7)
            goto L_0x036d
        L_0x0380:
            int r10 = defpackage.k7d.a
            int r10 = defpackage.au1.s(r10)
            if (r10 == 0) goto L_0x0391
            if (r10 == r1) goto L_0x0390
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0390:
            throw r7
        L_0x0391:
            r7 = r0
            goto L_0x0402
        L_0x0394:
            java.lang.String r11 = "icon"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x03ce
        L_0x039c:
            r14.z()     // Catch:{ all -> 0x03a0 }
            goto L_0x0402
        L_0x03a0:
            r10 = move-exception
            defpackage.hm9.l0(r2, r13, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.u7d.a
            java.util.Iterator r11 = r11.iterator()
        L_0x03aa:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x03bd
            java.lang.Object r12 = r11.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r10)
            goto L_0x03aa
        L_0x03bd:
            int r11 = defpackage.k7d.a
            int r11 = defpackage.au1.s(r11)
            if (r11 == 0) goto L_0x0402
            if (r11 == r1) goto L_0x03cd
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x03cd:
            throw r10
        L_0x03ce:
            e r9 = defpackage.z04.T(r14)     // Catch:{ all -> 0x03d3 }
            goto L_0x0402
        L_0x03d3:
            r9 = move-exception
            defpackage.hm9.l0(r2, r13, r9)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.u7d.a
            java.util.Iterator r10 = r10.iterator()
        L_0x03dd:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x03f0
            java.lang.Object r11 = r10.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r9)
            goto L_0x03dd
        L_0x03f0:
            int r10 = defpackage.k7d.a
            int r10 = defpackage.au1.s(r10)
            if (r10 == 0) goto L_0x0401
            if (r10 == r1) goto L_0x0400
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0400:
            throw r9
        L_0x0401:
            r9 = r0
        L_0x0402:
            int r5 = r5 + r1
            goto L_0x0291
        L_0x0405:
            nd2 r13 = defpackage.m5g.b
            r13.getClass()
            v25 r13 = defpackage.m5g.X
            java.util.Iterator r13 = r13.iterator()
        L_0x0410:
            r14 = r13
            u1 r14 = (defpackage.u1) r14
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0425
            java.lang.Object r14 = r14.next()
            r1 = r14
            m5g r1 = (defpackage.m5g) r1
            short r1 = r1.a
            if (r1 != r6) goto L_0x0410
            goto L_0x0426
        L_0x0425:
            r14 = r0
        L_0x0426:
            m5g r14 = (defpackage.m5g) r14
            if (r14 != 0) goto L_0x042c
            m5g r14 = defpackage.m5g.UNKNOWN
        L_0x042c:
            m5g r13 = defpackage.m5g.UNKNOWN
            java.lang.Class<m6d> r1 = defpackage.m6d.class
            if (r14 != r13) goto L_0x044d
            java.lang.String r13 = r1.getName()
            ir6 r14 = defpackage.hm9.m
            if (r14 != 0) goto L_0x043b
            goto L_0x0473
        L_0x043b:
            boolean r1 = r14.c()
            if (r1 == 0) goto L_0x0473
            us7 r1 = defpackage.us7.Z
            java.lang.String r2 = "Unknown type of widget, type: "
            java.lang.String r2 = defpackage.zr6.h(r6, r2)
            r14.d(r1, r13, r2, r0)
            goto L_0x0473
        L_0x044d:
            if (r7 != 0) goto L_0x046e
            if (r8 != 0) goto L_0x046e
            if (r9 != 0) goto L_0x046e
            java.lang.String r13 = r1.getName()
            ir6 r14 = defpackage.hm9.m
            if (r14 != 0) goto L_0x045c
            goto L_0x0473
        L_0x045c:
            boolean r1 = r14.c()
            if (r1 == 0) goto L_0x0473
            us7 r1 = defpackage.us7.Z
            java.lang.String r2 = "Widget content is empty, type: "
            java.lang.String r2 = defpackage.zr6.h(r6, r2)
            r14.d(r1, r13, r2, r0)
            goto L_0x0473
        L_0x046e:
            n5g r0 = new n5g
            r0.<init>(r14, r7, r8, r9)
        L_0x0473:
            return r0
        L_0x0474:
            vk6 r14 = (defpackage.vk6) r14
            boolean r13 = r14 instanceof defpackage.uk6
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L_0x047d:
            vk6 r14 = (defpackage.vk6) r14
            boolean r13 = r14 instanceof defpackage.uk6
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L_0x0486:
            nj r14 = (defpackage.nj) r14
            java.util.List r13 = r14.f
            return r13
        L_0x048b:
            java.lang.Long r14 = (java.lang.Long) r14
            q0e r13 = defpackage.r0e.a(r0)
            return r13
        L_0x0492:
            ba r14 = (defpackage.ba) r14
            java.lang.CharSequence r13 = r14.b
            java.lang.String r13 = r13.toString()
            return r13
        L_0x049b:
            uj3 r14 = (defpackage.uj3) r14
            boolean r13 = r14.Y
            if (r13 != 0) goto L_0x04bb
            boolean r13 = r14.w()
            if (r13 != 0) goto L_0x04bb
            int r13 = r14.k()
            if (r13 != 0) goto L_0x04bb
            boolean r13 = r14.t()
            if (r13 == 0) goto L_0x04ba
            boolean r13 = r14.v()
            if (r13 == 0) goto L_0x04ba
            goto L_0x04bb
        L_0x04ba:
            r1 = r3
        L_0x04bb:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            return r13
        L_0x04c0:
            ba r14 = (defpackage.ba) r14
            java.lang.CharSequence r13 = r14.b
            java.lang.String r13 = r13.toString()
            return r13
        L_0x04c9:
            java.lang.Long r14 = (java.lang.Long) r14
            r14.getClass()
            bc7[] r13 = one.me.profile.screens.addadmins.AddChatAdminsScreen.x0
            nz4 r13 = defpackage.nz4.a
            return r13
        L_0x04d3:
            android.app.Activity r14 = (android.app.Activity) r14
            android.view.Window r13 = r14.getWindow()
            android.view.View r13 = r13.getDecorView()
            android.view.View r13 = r13.getRootView()
            return r13
        L_0x04e2:
            android.app.Activity r14 = (android.app.Activity) r14
            boolean r13 = r14.isDestroyed()
            if (r13 != 0) goto L_0x04f2
            boolean r13 = r14.isFinishing()
            if (r13 == 0) goto L_0x04f1
            goto L_0x04f2
        L_0x04f1:
            r1 = r3
        L_0x04f2:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            return r13
        L_0x04f7:
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            java.lang.Object r13 = r14.get()
            android.app.Activity r13 = (android.app.Activity) r13
            return r13
        L_0x0500:
            dec r14 = (defpackage.dec) r14
            android.view.View r13 = r14.a
            return r13
        L_0x0505:
            android.view.View r14 = (android.view.View) r14
            boolean r13 = r14 instanceof android.view.ViewGroup
            if (r13 == 0) goto L_0x050e
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            goto L_0x050f
        L_0x050e:
            r14 = r0
        L_0x050f:
            if (r14 == 0) goto L_0x0521
            int r13 = r14.getChildCount()
            if (r13 <= 0) goto L_0x0518
            goto L_0x0519
        L_0x0518:
            r14 = r0
        L_0x0519:
            if (r14 == 0) goto L_0x0521
            at r0 = new at
            r13 = 7
            r0.<init>(r13, r14)
        L_0x0521:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ k8(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
    }
}
