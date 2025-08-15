package defpackage;

import android.view.View;

/* renamed from: yj  reason: default package */
public final class yj extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj(int i, View view, Object obj) {
        super(9, obj);
        this.c = i;
        this.o = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0290, code lost:
        if (r1 != null) goto L_0x0292;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L1(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 3
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            int r5 = r13.c
            switch(r5) {
                case 0: goto L_0x05c4;
                case 1: goto L_0x0537;
                case 2: goto L_0x0509;
                case 3: goto L_0x04f7;
                case 4: goto L_0x0440;
                case 5: goto L_0x031f;
                case 6: goto L_0x02f8;
                case 7: goto L_0x02c8;
                case 8: goto L_0x02a6;
                case 9: goto L_0x027a;
                case 10: goto L_0x0268;
                case 11: goto L_0x024e;
                case 12: goto L_0x0228;
                case 13: goto L_0x020f;
                case 14: goto L_0x01f0;
                case 15: goto L_0x01d8;
                case 16: goto L_0x01c0;
                case 17: goto L_0x01a8;
                case 18: goto L_0x0196;
                case 19: goto L_0x014b;
                case 20: goto L_0x0131;
                case 21: goto L_0x0109;
                case 22: goto L_0x00f4;
                case 23: goto L_0x00d9;
                case 24: goto L_0x00c1;
                case 25: goto L_0x00a9;
                case 26: goto L_0x006a;
                case 27: goto L_0x001c;
                default: goto L_0x000a;
            }
        L_0x000a:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x001b
            wgf r15 = (defpackage.wgf) r15
            wgf r14 = (defpackage.wgf) r14
            java.lang.Object r13 = r13.o
            dif r13 = (defpackage.dif) r13
            defpackage.dif.h(r13)
        L_0x001b:
            return
        L_0x001c:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x0069
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r15.getClass()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            java.lang.Object r13 = r13.o
            ohf r13 = (defpackage.ohf) r13
            android.animation.ValueAnimator r14 = r13.E0
            if (r14 == 0) goto L_0x0037
            r14.cancel()
        L_0x0037:
            float r14 = r13.B0
            float r15 = r13.g()
            float[] r0 = new float[r2]
            r0[r3] = r14
            r0[r4] = r15
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 100
            r14.setDuration(r0)
            android.view.animation.AccelerateDecelerateInterpolator r15 = new android.view.animation.AccelerateDecelerateInterpolator
            r15.<init>()
            r14.setInterpolator(r15)
            lhf r15 = new lhf
            r15.<init>(r13, r3)
            r14.addUpdateListener(r15)
            nhf r15 = new nhf
            r15.<init>(r13, r4)
            r14.addListener(r15)
            r14.start()
            r13.E0 = r14
        L_0x0069:
            return
        L_0x006a:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x00a8
            szd r15 = (defpackage.szd) r15
            szd r14 = (defpackage.szd) r14
            int r14 = r15.ordinal()
            java.lang.Object r13 = r13.o
            uzd r13 = (defpackage.uzd) r13
            if (r14 == 0) goto L_0x008a
            if (r14 != r4) goto L_0x0084
            defpackage.uzd.a(r13)
            goto L_0x00a8
        L_0x0084:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x008a:
            khe r14 = r13.c
            boolean r15 = r14.a()
            if (r15 == 0) goto L_0x00a8
            java.lang.Object r14 = r14.getValue()
            android.widget.TextView r14 = (android.widget.TextView) r14
            android.animation.ValueAnimator r15 = r13.s0
            if (r15 == 0) goto L_0x009f
            r15.cancel()
        L_0x009f:
            android.animation.ValueAnimator r14 = defpackage.uzd.b(r13, r14, r3)
            r13.s0 = r14
            r14.start()
        L_0x00a8:
            return
        L_0x00a9:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x00c0
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r15.getClass()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            java.lang.Object r13 = r13.o
            qtd r13 = (defpackage.qtd) r13
            r13.m()
        L_0x00c0:
            return
        L_0x00c1:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x00d8
            zld r15 = (defpackage.zld) r15
            zld r14 = (defpackage.zld) r14
            pq9 r14 = defpackage.qp4.u0
            java.lang.Object r13 = r13.o
            amd r13 = (defpackage.amd) r13
            fka r14 = r14.j(r13)
            r13.a(r14)
        L_0x00d8:
            return
        L_0x00d9:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x00f3
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r15.getClass()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            java.lang.Object r13 = r13.o
            b6c r13 = (defpackage.b6c) r13
            r13.requestLayout()
            r13.invalidate()
        L_0x00f3:
            return
        L_0x00f4:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x0108
            s4c r15 = (defpackage.s4c) r15
            s4c r14 = (defpackage.s4c) r14
            java.lang.Object r13 = r13.o
            t4c r13 = (defpackage.t4c) r13
            defpackage.t4c.a(r13, r15)
            r13.b()
        L_0x0108:
            return
        L_0x0109:
            androidx.recyclerview.widget.RecyclerView r15 = (androidx.recyclerview.widget.RecyclerView) r15
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14
            if (r14 == 0) goto L_0x0111
            if (r14 == r15) goto L_0x0130
        L_0x0111:
            java.lang.Object r13 = r13.o
            j7b r13 = (defpackage.j7b) r13
            boolean r14 = r13.g
            if (r14 == 0) goto L_0x0130
            bc7[] r14 = defpackage.j7b.m
            r14 = r14[r3]
            yj r14 = r13.l
            java.lang.Object r14 = r14.b
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14
            if (r14 != 0) goto L_0x0126
            goto L_0x0130
        L_0x0126:
            do9 r15 = new do9
            r0 = 12
            r15.<init>(r13, r0, r14)
            r14.post(r15)
        L_0x0130:
            return
        L_0x0131:
            fka r15 = (defpackage.fka) r15
            fka r14 = (defpackage.fka) r14
            boolean r14 = defpackage.tpa.f(r14, r15)
            if (r14 != 0) goto L_0x014a
            java.lang.Object r13 = r13.o
            aba r13 = (defpackage.aba) r13
            if (r15 != 0) goto L_0x0147
            pq9 r14 = defpackage.qp4.u0
            fka r15 = r14.j(r13)
        L_0x0147:
            r13.onThemeChanged(r15)
        L_0x014a:
            return
        L_0x014b:
            paa r15 = (defpackage.paa) r15
            paa r14 = (defpackage.paa) r14
            if (r14 == r15) goto L_0x0195
            java.lang.Object r13 = r13.o
            qaa r13 = (defpackage.qaa) r13
            android.graphics.Paint r14 = r13.c
            pq9 r1 = defpackage.qp4.u0
            fka r13 = r1.j(r13)
            int r15 = r15.ordinal()
            if (r15 == 0) goto L_0x018a
            if (r15 == r4) goto L_0x0181
            if (r15 == r2) goto L_0x0178
            if (r15 != r0) goto L_0x0172
            ne0 r13 = r13.b()
            me0 r13 = r13.a
            int r13 = r13.e
            goto L_0x0192
        L_0x0172:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0178:
            ne0 r13 = r13.b()
            me0 r13 = r13.a
            int r13 = r13.g
            goto L_0x0192
        L_0x0181:
            ne0 r13 = r13.b()
            me0 r13 = r13.a
            int r13 = r13.c
            goto L_0x0192
        L_0x018a:
            ne0 r13 = r13.b()
            me0 r13 = r13.a
            int r13 = r13.m
        L_0x0192:
            r14.setColor(r13)
        L_0x0195:
            return
        L_0x0196:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x01a7
            e7a r15 = (defpackage.e7a) r15
            e7a r14 = (defpackage.e7a) r14
            java.lang.Object r13 = r13.o
            f7a r13 = (defpackage.f7a) r13
            r13.a(r15)
        L_0x01a7:
            return
        L_0x01a8:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = defpackage.tpa.f(r14, r15)
            if (r14 != 0) goto L_0x01bf
            pq9 r14 = defpackage.qp4.u0
            java.lang.Object r13 = r13.o
            u6a r13 = (defpackage.u6a) r13
            fka r14 = r14.j(r13)
            r13.a(r14, r15)
        L_0x01bf:
            return
        L_0x01c0:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x01d7
            h4a r15 = (defpackage.h4a) r15
            h4a r14 = (defpackage.h4a) r14
            pq9 r14 = defpackage.qp4.u0
            java.lang.Object r13 = r13.o
            i4a r13 = (defpackage.i4a) r13
            fka r14 = r14.j(r13)
            r13.onThemeChanged(r14)
        L_0x01d7:
            return
        L_0x01d8:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x01ef
            java.lang.Number r15 = (java.lang.Number) r15
            r15.floatValue()
            java.lang.Number r14 = (java.lang.Number) r14
            r14.floatValue()
            java.lang.Object r13 = r13.o
            no9 r13 = (defpackage.no9) r13
            r13.invalidateSelf()
        L_0x01ef:
            return
        L_0x01f0:
            m56 r15 = (defpackage.m56) r15
            m56 r14 = (defpackage.m56) r14
            java.lang.Object r13 = r13.o
            dy8 r13 = (defpackage.dy8) r13
            j33 r13 = r13.getDefaultMovementMethod()
            if (r15 == 0) goto L_0x01ff
            r3 = r4
        L_0x01ff:
            android.view.GestureDetector r14 = r13.l
            if (r3 == 0) goto L_0x0209
            q00 r15 = r13.k
            r14.setOnDoubleTapListener(r15)
            goto L_0x020c
        L_0x0209:
            r14.setOnDoubleTapListener(r1)
        L_0x020c:
            r13.i = r3
            return
        L_0x020f:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x0227
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            java.lang.Object r13 = r13.o
            sv8 r13 = (defpackage.sv8) r13
            r13.setVideoMsgButtonVisible(r15)
        L_0x0227:
            return
        L_0x0228:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x024d
            x38 r15 = (defpackage.x38) r15
            x38 r14 = (defpackage.x38) r14
            if (r15 == 0) goto L_0x024d
            java.lang.Object r13 = r13.o
            bl8 r13 = (defpackage.bl8) r13
            j34 r14 = r13.getDate$message_list_release()
            boolean r0 = r15.c()
            r0 = r0 ^ r4
            r14.setBackgroundEnabled$message_list_release(r0)
            r13.v(r15)
            r13.requestLayout()
            r13.invalidate()
        L_0x024d:
            return
        L_0x024e:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x0267
            x38 r15 = (defpackage.x38) r15
            x38 r14 = (defpackage.x38) r14
            if (r15 == 0) goto L_0x0267
            java.lang.Object r13 = r13.o
            bd8 r13 = (defpackage.bd8) r13
            r13.v(r15)
            r13.requestLayout()
            r13.invalidate()
        L_0x0267:
            return
        L_0x0268:
            y5a r15 = (defpackage.y5a) r15
            y5a r14 = (defpackage.y5a) r14
            boolean r14 = defpackage.tpa.f(r14, r15)
            if (r14 != 0) goto L_0x0279
            java.lang.Object r13 = r13.o
            dd7 r13 = (defpackage.dd7) r13
            defpackage.dd7.a(r13)
        L_0x0279:
            return
        L_0x027a:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x02a5
            zf5 r15 = (defpackage.zf5) r15
            zf5 r14 = (defpackage.zf5) r14
            if (r15 == 0) goto L_0x0289
            yt6 r0 = r15.k
            goto L_0x028a
        L_0x0289:
            r0 = r1
        L_0x028a:
            if (r0 != 0) goto L_0x0292
            if (r15 == 0) goto L_0x0290
            wcf r1 = r15.l
        L_0x0290:
            if (r1 == 0) goto L_0x0298
        L_0x0292:
            boolean r15 = r15.m
            if (r15 != 0) goto L_0x0298
            r15 = r4
            goto L_0x0299
        L_0x0298:
            r15 = r3
        L_0x0299:
            java.lang.Object r13 = r13.o
            gi5 r13 = (defpackage.gi5) r13
            r13.D0 = r15
            if (r14 != 0) goto L_0x02a2
            r3 = r4
        L_0x02a2:
            defpackage.gi5.x(r13, r3)
        L_0x02a5:
            return
        L_0x02a6:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x02c7
            kqe r15 = (defpackage.kqe) r15
            kqe r14 = (defpackage.kqe) r14
            java.lang.Object r13 = r13.o
            p85 r13 = (defpackage.p85) r13
            android.text.TextPaint r14 = r13.o
            android.content.res.Resources r0 = r13.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r15.a(r14, r0, defpackage.du4.b)
            r13.invalidate()
            r13.requestLayout()
        L_0x02c7:
            return
        L_0x02c8:
            sme r15 = (defpackage.sme) r15
            sme r14 = (defpackage.sme) r14
            boolean r14 = defpackage.tpa.f(r14, r15)
            if (r14 != 0) goto L_0x02f7
            java.lang.Object r13 = r13.o
            cu3 r13 = (defpackage.cu3) r13
            zt3 r14 = r13.a
            r14.setCustomTheme(r15)
            if (r15 != 0) goto L_0x02f4
            android.view.View r14 = r13.getContentView()
            boolean r15 = r14.isInEditMode()
            if (r15 == 0) goto L_0x02ea
            ee4 r15 = defpackage.ee4.e0
            goto L_0x02f4
        L_0x02ea:
            android.content.Context r14 = r14.getContext()
            khe r15 = defpackage.sme.a0
            sme r15 = defpackage.fm9.R(r14)
        L_0x02f4:
            r13.a(r15)
        L_0x02f7:
            return
        L_0x02f8:
            sme r15 = (defpackage.sme) r15
            sme r14 = (defpackage.sme) r14
            boolean r14 = defpackage.tpa.f(r14, r15)
            if (r14 != 0) goto L_0x031e
            java.lang.Object r13 = r13.o
            zt3 r13 = (defpackage.zt3) r13
            if (r15 != 0) goto L_0x031b
            boolean r14 = r13.isInEditMode()
            if (r14 == 0) goto L_0x0311
            ee4 r15 = defpackage.ee4.e0
            goto L_0x031b
        L_0x0311:
            android.content.Context r14 = r13.getContext()
            khe r15 = defpackage.sme.a0
            sme r15 = defpackage.fm9.R(r14)
        L_0x031b:
            r13.z(r15)
        L_0x031e:
            return
        L_0x031f:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x043f
            java.util.List r15 = (java.util.List) r15
            java.util.List r14 = (java.util.List) r14
            java.util.Iterator r14 = r15.iterator()
            r15 = r3
        L_0x032e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x043f
            java.lang.Object r0 = r14.next()
            int r2 = r15 + 1
            if (r15 < 0) goto L_0x043b
            a53 r0 = (defpackage.a53) r0
            java.lang.Object r5 = r13.o
            e53 r5 = (defpackage.e53) r5
            ar0 r6 = r5.e
            java.lang.Object r7 = r6.b
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r7 = r7.size()
            android.content.Context r8 = r5.a
            if (r7 <= r15) goto L_0x0357
            sq4 r15 = r6.i(r15)
            zt6 r15 = (defpackage.zt6) r15
            goto L_0x0379
        L_0x0357:
            zt6 r15 = new zt6
            ma6 r7 = new ma6
            android.content.res.Resources r9 = r8.getResources()
            r7.<init>(r9)
            r7.b = r3
            la6 r7 = r7.a()
            r15.<init>(r7)
            umc r7 = r15.e()
            if (r7 == 0) goto L_0x0376
            android.view.View r9 = r5.b
            r7.setCallback(r9)
        L_0x0376:
            r6.b(r15)
        L_0x0379:
            boolean r6 = r0 instanceof defpackage.yt6
            if (r6 == 0) goto L_0x0392
            r7 = r0
            yt6 r7 = (defpackage.yt6) r7
            boolean r9 = r7.e
            if (r9 == 0) goto L_0x0387
            android.net.Uri r9 = r7.h
            goto L_0x038f
        L_0x0387:
            boolean r9 = r7.g
            if (r9 == 0) goto L_0x038d
            r9 = r1
            goto L_0x038f
        L_0x038d:
            android.net.Uri r9 = r7.b
        L_0x038f:
            jic r7 = r7.i
            goto L_0x039d
        L_0x0392:
            boolean r7 = r0 instanceof defpackage.wcf
            if (r7 == 0) goto L_0x0435
            r7 = r0
            wcf r7 = (defpackage.wcf) r7
            android.net.Uri r9 = r7.b
            jic r7 = r7.i
        L_0x039d:
            rq4 r10 = r15.o
            r10.getClass()
            la6 r10 = (defpackage.la6) r10
            ssc r11 = defpackage.ssc.l
            r10.h(r11)
            us r11 = r5.j
            if (r6 == 0) goto L_0x03cc
            r12 = r0
            yt6 r12 = (defpackage.yt6) r12
            boolean r12 = r12.g
            if (r12 == 0) goto L_0x03ca
            java.lang.Object r12 = r11.get(r15)
            if (r12 != 0) goto L_0x03c7
            y2b r12 = new y2b
            r12.<init>(r8)
            int r8 = defpackage.woc.u0
            r12.a(r8)
            r11.put(r15, r12)
        L_0x03c7:
            y2b r12 = (defpackage.y2b) r12
            goto L_0x03e0
        L_0x03ca:
            r12 = r1
            goto L_0x03e0
        L_0x03cc:
            boolean r12 = r0 instanceof defpackage.wcf
            if (r12 == 0) goto L_0x042f
            java.lang.Object r12 = r11.get(r15)
            if (r12 != 0) goto L_0x03de
            y2b r12 = new y2b
            r12.<init>(r8)
            r11.put(r15, r12)
        L_0x03de:
            y2b r12 = (defpackage.y2b) r12
        L_0x03e0:
            r10.k(r12)
            mq4 r8 = r15.X
            f2b r10 = defpackage.s36.a
            e2b r10 = r10.get()
            r10.l = r8
            r10.k = r4
            d53 r8 = new d53
            r8.<init>(r5, r0)
            r10.h = r8
            if (r9 == 0) goto L_0x0404
            xv6 r5 = defpackage.xv6.d(r9)
            r5.d = r7
            wv6 r5 = r5.a()
            r10.e = r5
        L_0x0404:
            if (r6 == 0) goto L_0x040b
            yt6 r0 = (defpackage.yt6) r0
            android.net.Uri r0 = r0.h
            goto L_0x0413
        L_0x040b:
            boolean r5 = r0 instanceof defpackage.wcf
            if (r5 == 0) goto L_0x0429
            wcf r0 = (defpackage.wcf) r0
            android.net.Uri r0 = r0.h
        L_0x0413:
            if (r0 == 0) goto L_0x041f
            xv6 r0 = defpackage.xv6.d(r0)
            wv6 r0 = r0.a()
            r10.f = r0
        L_0x041f:
            d2b r0 = r10.a()
            r15.i(r0)
            r15 = r2
            goto L_0x032e
        L_0x0429:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x042f:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0435:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x043b:
            defpackage.y53.R()
            throw r1
        L_0x043f:
            return
        L_0x0440:
            boolean r1 = defpackage.tpa.f(r14, r15)
            if (r1 != 0) goto L_0x04f6
            vv1 r15 = (defpackage.vv1) r15
            vv1 r14 = (defpackage.vv1) r14
            java.lang.Object r13 = r13.o
            wv1 r13 = (defpackage.wv1) r13
            android.animation.ValueAnimator r14 = r13.o
            if (r14 == 0) goto L_0x0455
            r14.cancel()
        L_0x0455:
            android.graphics.Paint r14 = r13.t0
            int r7 = r14.getColor()
            vv1 r14 = r13.getType()
            int r14 = r14.ordinal()
            pq9 r15 = defpackage.qp4.u0
            if (r14 == 0) goto L_0x048b
            if (r14 == r4) goto L_0x0480
            if (r14 == r2) goto L_0x0474
            if (r14 != r0) goto L_0x046e
            goto L_0x0474
        L_0x046e:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0474:
            fka r14 = r15.j(r13)
            x3 r14 = r14.f()
            int r14 = r14.a
        L_0x047e:
            r8 = r14
            goto L_0x0496
        L_0x0480:
            fka r14 = r15.j(r13)
            gae r14 = r14.i()
            int r14 = r14.c
            goto L_0x047e
        L_0x048b:
            fka r14 = r15.j(r13)
            r14.i()
            r14 = 1308622847(0x4dffffff, float:5.3687088E8)
            goto L_0x047e
        L_0x0496:
            float r9 = r13.u0
            vv1 r14 = r13.getType()
            int r14 = r14.ordinal()
            if (r14 == 0) goto L_0x04b8
            if (r14 == r4) goto L_0x04b5
            if (r14 == r2) goto L_0x04b2
            if (r14 != r0) goto L_0x04ac
            float r14 = defpackage.wv1.C0
        L_0x04aa:
            r10 = r14
            goto L_0x04bb
        L_0x04ac:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x04b2:
            float r14 = defpackage.wv1.B0
            goto L_0x04aa
        L_0x04b5:
            float r14 = defpackage.wv1.A0
            goto L_0x04aa
        L_0x04b8:
            float r14 = defpackage.wv1.z0
            goto L_0x04aa
        L_0x04bb:
            float r11 = r13.v0
            vv1 r14 = r13.getType()
            int r14 = r14.ordinal()
            r15 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r14 == 0) goto L_0x04d8
            if (r14 == r4) goto L_0x04d8
            if (r14 == r2) goto L_0x04d8
            if (r14 != r0) goto L_0x04d2
            r12 = r1
            goto L_0x04d9
        L_0x04d2:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x04d8:
            r12 = r15
        L_0x04d9:
            float[] r14 = new float[r2]
            r14 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r14)
            uv1 r15 = new uv1
            r5 = r15
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r14.addUpdateListener(r15)
            r0 = 200(0xc8, double:9.9E-322)
            r14.setDuration(r0)
            r14.start()
            r13.o = r14
        L_0x04f6:
            return
        L_0x04f7:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x0508
            t91 r15 = (defpackage.t91) r15
            t91 r14 = (defpackage.t91) r14
            java.lang.Object r13 = r13.o
            u91 r13 = (defpackage.u91) r13
            r13.invalidateSelf()
        L_0x0508:
            return
        L_0x0509:
            n91 r15 = (defpackage.n91) r15
            n91 r14 = (defpackage.n91) r14
            if (r14 == r15) goto L_0x0536
            java.lang.Object r13 = r13.o
            o91 r13 = (defpackage.o91) r13
            u91 r13 = r13.getBackground()
            if (r13 == 0) goto L_0x0536
            int r14 = r15.ordinal()
            if (r14 == 0) goto L_0x052f
            if (r14 == r4) goto L_0x052c
            if (r14 != r2) goto L_0x0526
            hmd r14 = defpackage.hmd.o
            goto L_0x0531
        L_0x0526:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x052c:
            hmd r14 = defpackage.hmd.c
            goto L_0x0531
        L_0x052f:
            hmd r14 = defpackage.hmd.b
        L_0x0531:
            kmd r13 = r13.Y
            r13.b(r14)
        L_0x0536:
            return
        L_0x0537:
            ag0 r15 = (defpackage.ag0) r15
            ag0 r14 = (defpackage.ag0) r14
            boolean r14 = defpackage.tpa.f(r14, r15)
            if (r14 != 0) goto L_0x05c3
            java.lang.Object r13 = r13.o
            ru.ok.utils.widgets.BadgeCountView r13 = (ru.ok.utils.widgets.BadgeCountView) r13
            if (r15 != 0) goto L_0x054d
            r14 = 8
            r13.setVisibility(r14)
            goto L_0x05c3
        L_0x054d:
            bc7[] r14 = ru.ok.utils.widgets.BadgeCountView.z0
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            if (r14 == 0) goto L_0x05bb
            boolean r0 = r13.u0
            int r1 = r15.b
            if (r0 != 0) goto L_0x0570
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r1 = (float) r1
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = defpackage.tu0.G(r1)
            goto L_0x0593
        L_0x0570:
            float r0 = (float) r2
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r0 = defpackage.rh4.c(r0, r2, r1)
            android.content.Context r1 = r13.getContext()
            android.content.res.Resources r1 = r1.getResources()
            float r0 = (float) r0
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.tu0.G(r0)
        L_0x0593:
            r14.width = r0
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = r15.c
            float r1 = (float) r1
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = defpackage.tu0.G(r1)
            r14.height = r0
            r13.setLayoutParams(r14)
            android.graphics.drawable.Drawable r14 = r15.a
            r13.setBackground(r14)
            float r14 = r15.d
            r13.setTextSize(r14)
            goto L_0x05c3
        L_0x05bb:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r13.<init>(r14)
            throw r13
        L_0x05c3:
            return
        L_0x05c4:
            boolean r0 = defpackage.tpa.f(r14, r15)
            if (r0 != 0) goto L_0x0609
            uj r15 = (defpackage.uj) r15
            uj r14 = (defpackage.uj) r14
            java.lang.Object r14 = r13.o
            zj r14 = (defpackage.zj) r14
            java.lang.String r14 = r14.s0
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x05d9
            goto L_0x05f2
        L_0x05d9:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x05f2
            us7 r2 = defpackage.us7.X
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "state = "
            r3.<init>(r4)
            r3.append(r15)
            java.lang.String r15 = r3.toString()
            r0.d(r2, r14, r15, r1)
        L_0x05f2:
            java.lang.Object r14 = r13.o
            zj r14 = (defpackage.zj) r14
            r14.d()
            java.lang.Object r14 = r13.o
            zj r14 = (defpackage.zj) r14
            r14.d()
            java.lang.Object r13 = r13.o
            zj r13 = (defpackage.zj) r13
            pf r14 = r13.t0
            r14.invalidateDrawable(r13)
        L_0x0609:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.L1(java.lang.Object, java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj(int i, Object obj) {
        super(9, (Object) null);
        this.c = i;
        this.o = obj;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.zj r2) {
        /*
            r1 = this;
            r0 = 0
            r1.c = r0
            uj r0 = defpackage.uj.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(zj):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.o91 r2) {
        /*
            r1 = this;
            r0 = 2
            r1.c = r0
            n91 r0 = defpackage.n91.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(o91):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.u91 r2) {
        /*
            r1 = this;
            r0 = 3
            r1.c = r0
            t91 r0 = defpackage.t91.b
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(u91):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.wv1 r2) {
        /*
            r1 = this;
            r0 = 4
            r1.c = r0
            vv1 r0 = defpackage.vv1.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(wv1):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.e53 r2) {
        /*
            r1 = this;
            r0 = 5
            r1.c = r0
            nz4 r0 = defpackage.nz4.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(e53):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.sv8 r2) {
        /*
            r1 = this;
            r0 = 13
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(sv8):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.no9 r2) {
        /*
            r1 = this;
            r0 = 15
            r1.c = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(no9):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.i4a r2) {
        /*
            r1 = this;
            r0 = 16
            r1.c = r0
            h4a r0 = defpackage.h4a.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(i4a):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.f7a r2) {
        /*
            r1 = this;
            r0 = 18
            r1.c = r0
            e7a r0 = defpackage.e7a.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(f7a):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.qaa r2) {
        /*
            r1 = this;
            r0 = 19
            r1.c = r0
            paa r0 = defpackage.paa.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(qaa):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.t4c r2) {
        /*
            r1 = this;
            r0 = 22
            r1.c = r0
            s4c r0 = defpackage.s4c.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(t4c):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.b6c r2) {
        /*
            r1 = this;
            r0 = 23
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(b6c):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.amd r2) {
        /*
            r1 = this;
            r0 = 24
            r1.c = r0
            zld r0 = defpackage.zld.b
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(amd):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.qtd r2) {
        /*
            r1 = this;
            r0 = 25
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(qtd):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.uzd r2) {
        /*
            r1 = this;
            r0 = 26
            r1.c = r0
            szd r0 = defpackage.szd.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(uzd):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.ohf r2) {
        /*
            r1 = this;
            r0 = 27
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(ohf):void");
    }
}
