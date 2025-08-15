package defpackage;

import android.view.View;

/* renamed from: vu5  reason: default package */
public final /* synthetic */ class vu5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vu5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v52, types: [uu3] */
    /* JADX WARNING: type inference failed for: r3v30, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x037e A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 3
            r2 = 0
            r3 = 0
            r4 = 1
            int r5 = r0.a
            switch(r5) {
                case 0: goto L_0x050b;
                case 1: goto L_0x04fd;
                case 2: goto L_0x04a8;
                case 3: goto L_0x049c;
                case 4: goto L_0x0490;
                case 5: goto L_0x0484;
                case 6: goto L_0x0476;
                case 7: goto L_0x0468;
                case 8: goto L_0x0446;
                case 9: goto L_0x03af;
                case 10: goto L_0x039f;
                case 11: goto L_0x026c;
                case 12: goto L_0x0231;
                case 13: goto L_0x0221;
                case 14: goto L_0x020f;
                case 15: goto L_0x01fd;
                case 16: goto L_0x01e5;
                case 17: goto L_0x01d9;
                case 18: goto L_0x01a0;
                case 19: goto L_0x0192;
                case 20: goto L_0x0186;
                case 21: goto L_0x0174;
                case 22: goto L_0x0162;
                case 23: goto L_0x014c;
                case 24: goto L_0x008f;
                case 25: goto L_0x0067;
                case 26: goto L_0x005b;
                case 27: goto L_0x004f;
                case 28: goto L_0x0031;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r1 = r0.b
            d4d r1 = (defpackage.d4d) r1
            android.widget.ImageView r2 = r1.F0
            boolean r2 = r2.isSelected()
            if (r2 == 0) goto L_0x0018
            goto L_0x0030
        L_0x0018:
            int r2 = defpackage.rwb.profile_selectable_item_tag
            android.view.View r1 = r1.a
            java.lang.Object r1 = defpackage.tpa.v(r1, r2)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x0027
            r3 = r1
            java.lang.Integer r3 = (java.lang.Integer) r3
        L_0x0027:
            if (r3 == 0) goto L_0x0030
            java.lang.Object r0 = r0.c
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r3)
        L_0x0030:
            return
        L_0x0031:
            int r1 = one.me.sdk.phoneutils.SelectCountryBottomSheet.y0
            java.lang.Object r1 = r0.b
            one.me.sdk.phoneutils.SelectCountryBottomSheet r1 = (one.me.sdk.phoneutils.SelectCountryBottomSheet) r1
            uu3 r2 = r1.getTargetController()
            boolean r5 = r2 instanceof defpackage.oy3
            if (r5 == 0) goto L_0x0042
            r3 = r2
            oy3 r3 = (defpackage.oy3) r3
        L_0x0042:
            if (r3 == 0) goto L_0x004b
            java.lang.Object r0 = r0.c
            eaa r0 = (defpackage.eaa) r0
            r3.K(r0)
        L_0x004b:
            r1.s0(r4)
            return
        L_0x004f:
            java.lang.Object r1 = r0.b
            m56 r1 = (defpackage.m56) r1
            java.lang.Object r0 = r0.c
            v8c r0 = (defpackage.v8c) r0
            r1.invoke(r0)
            return
        L_0x005b:
            java.lang.Object r1 = r0.b
            m56 r1 = (defpackage.m56) r1
            java.lang.Object r0 = r0.c
            j6c r0 = (defpackage.j6c) r0
            r1.invoke(r0)
            return
        L_0x0067:
            mi6 r1 = defpackage.mi6.CONFIRM
            java.lang.Object r2 = r0.b
            z5c r2 = (defpackage.z5c) r2
            defpackage.pag.F(r2, r1)
            v5c r1 = r2.getReaction()
            java.lang.Object r0 = r0.c
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
            int r0 = r2.getCount()
            if (r0 != r4) goto L_0x0087
            boolean r0 = r2.b()
            if (r0 != 0) goto L_0x008e
        L_0x0087:
            boolean r0 = r2.b()
            r2.a(r0)
        L_0x008e:
            return
        L_0x008f:
            java.lang.Object r1 = r0.b
            w4c r1 = (defpackage.w4c) r1
            u4c r1 = r1.a
            if (r1 == 0) goto L_0x014b
            one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet r1 = (one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet) r1
            lh1 r1 = r1.B0()
            q0e r2 = r1.Z
            java.lang.Object r5 = r2.getValue()
            jh1 r5 = (defpackage.jh1) r5
            java.lang.Integer r5 = r5.a
            java.lang.Object r0 = r0.c
            v4c r0 = (defpackage.v4c) r0
            int r0 = r0.a
            if (r5 != 0) goto L_0x00b0
            goto L_0x00b8
        L_0x00b0:
            int r5 = r5.intValue()
            if (r5 != r0) goto L_0x00b8
            goto L_0x014b
        L_0x00b8:
            eh1 r5 = defpackage.eh1.a
            s35 r6 = r1.z0
            defpackage.pnf.o(r6, r5)
            java.lang.Object r5 = r2.getValue()
            jh1 r5 = (defpackage.jh1) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 6
            jh1 r5 = defpackage.jh1.a(r5, r6, r3, r3, r7)
            r2.m(r3, r5)
            java.util.List r2 = r1.r()
            q0e r5 = r1.u0
            r5.m(r3, r2)
            int r2 = defpackage.y7a.z0
            q0e r5 = r1.w0
            q0e r6 = r1.s0
            if (r0 != r2) goto L_0x011e
            int r0 = defpackage.b8a.q0
            eqe r1 = new eqe
            r1.<init>(r0)
            r6.m(r3, r1)
            qq9 r0 = defpackage.y4c.b
            r0.getClass()
            y4c r0 = defpackage.y4c.OTHER
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0106:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x011a
            java.lang.Object r2 = r0.next()
            y4c r2 = (defpackage.y4c) r2
            ih1 r2 = defpackage.f8.C(r2, r4)
            r1.add(r2)
            goto L_0x0106
        L_0x011a:
            r5.m(r3, r1)
            goto L_0x014b
        L_0x011e:
            int r2 = defpackage.y7a.y0
            boolean r1 = r1.c
            if (r0 != r2) goto L_0x0136
            int r0 = defpackage.b8a.p0
            eqe r2 = new eqe
            r2.<init>(r0)
            r6.m(r3, r2)
            java.util.ArrayList r0 = defpackage.lh1.q(r1)
            r5.m(r3, r0)
            goto L_0x014b
        L_0x0136:
            int r2 = defpackage.y7a.x0
            if (r0 != r2) goto L_0x014b
            int r0 = defpackage.b8a.o0
            eqe r2 = new eqe
            r2.<init>(r0)
            r6.m(r3, r2)
            java.util.ArrayList r0 = defpackage.lh1.q(r1)
            r5.m(r3, r0)
        L_0x014b:
            return
        L_0x014c:
            java.lang.Object r1 = r0.c
            pxa r1 = (defpackage.pxa) r1
            gza r1 = r1.s0
            long r2 = r1.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            fza r1 = r1.b
            java.lang.Object r0 = r0.b
            a66 r0 = (defpackage.a66) r0
            r0.invoke(r2, r1)
            return
        L_0x0162:
            java.lang.Object r1 = r0.c
            zka r1 = (defpackage.zka) r1
            int r1 = r1.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.b
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
            return
        L_0x0174:
            java.lang.Object r1 = r0.b
            o7a r1 = (defpackage.o7a) r1
            m7a r1 = r1.a
            if (r1 == 0) goto L_0x0185
            java.lang.Object r0 = r0.c
            l7a r0 = (defpackage.l7a) r0
            int r0 = r0.a
            r1.c(r0)
        L_0x0185:
            return
        L_0x0186:
            java.lang.Object r1 = r0.b
            m56 r1 = (defpackage.m56) r1
            java.lang.Object r0 = r0.c
            qo9 r0 = (defpackage.qo9) r0
            r1.invoke(r0)
            return
        L_0x0192:
            java.lang.Object r1 = r0.c
            eb9 r1 = (defpackage.eb9) r1
            db9 r1 = r1.G0
            java.lang.Object r0 = r0.b
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
            return
        L_0x01a0:
            bc7[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            java.lang.Object r1 = r0.b
            one.me.sdk.messagewrite.MessageWriteWidget r1 = (one.me.sdk.messagewrite.MessageWriteWidget) r1
            xz8 r5 = r1.v0()
            q0e r5 = r5.O0
            java.lang.Object r6 = r5.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4 = r4 ^ r6
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5.m(r3, r4)
            java.lang.Object r0 = r0.c
            dz8 r0 = (defpackage.dz8) r0
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x01ce
            int r0 = defpackage.yoc.h0
            eqe r3 = new eqe
            r3.<init>(r0)
            goto L_0x01d5
        L_0x01ce:
            int r0 = defpackage.yoc.j0
            eqe r3 = new eqe
            r3.<init>(r0)
        L_0x01d5:
            r1.C0(r3, r2)
            return
        L_0x01d9:
            java.lang.Object r1 = r0.b
            m56 r1 = (defpackage.m56) r1
            java.lang.Object r0 = r0.c
            mx8 r0 = (defpackage.mx8) r0
            r1.invoke(r0)
            return
        L_0x01e5:
            java.lang.Object r1 = r0.b
            vt3 r1 = (defpackage.vt3) r1
            java.lang.Object r1 = r1.I0
            jn8 r1 = (defpackage.jn8) r1
            if (r1 == 0) goto L_0x01fc
            long r1 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.c
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
        L_0x01fc:
            return
        L_0x01fd:
            java.lang.Object r1 = r0.c
            kn8 r1 = (defpackage.kn8) r1
            long r1 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.b
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
            return
        L_0x020f:
            java.lang.Object r1 = r0.c
            en8 r1 = (defpackage.en8) r1
            int r1 = r1.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.b
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
            return
        L_0x0221:
            java.lang.Object r1 = r0.b
            tl8 r1 = (defpackage.tl8) r1
            m56 r1 = r1.a
            if (r1 == 0) goto L_0x0230
            java.lang.Object r0 = r0.c
            jm8 r0 = (defpackage.jm8) r0
            r1.invoke(r0)
        L_0x0230:
            return
        L_0x0231:
            java.lang.Object r1 = r0.b
            ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView r1 = (ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView) r1
            java.util.ArrayList r5 = r1.a
            java.util.Iterator r5 = r5.iterator()
            r6 = r2
        L_0x023c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0266
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x0262
            tz7 r7 = (defpackage.tz7) r7
            java.lang.Object r9 = r7.getTag()
            java.lang.Object r10 = r0.c
            sz7 r10 = (defpackage.sz7) r10
            if (r9 != r10) goto L_0x0258
            r9 = r4
            goto L_0x0259
        L_0x0258:
            r9 = r2
        L_0x0259:
            r7.a(r9, r4)
            if (r9 == 0) goto L_0x0260
            r1.c = r6
        L_0x0260:
            r6 = r8
            goto L_0x023c
        L_0x0262:
            defpackage.y53.R()
            throw r3
        L_0x0266:
            int r0 = r1.c
            r1.a(r0, r4)
            return
        L_0x026c:
            java.lang.Object r1 = r0.b
            one.me.main.MainScreen r1 = (one.me.main.MainScreen) r1
            java.lang.Object r0 = r0.c
            t6a r0 = (defpackage.t6a) r0
            java.lang.String r5 = r1.Y
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x027c
            goto L_0x039b
        L_0x027c:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x039b
            us7 r7 = defpackage.us7.X
            android.graphics.Rect r8 = defpackage.mpf.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "\n"
            r8.<init>(r9)
            android.content.res.Resources r10 = r20.getResources()
            android.view.View r11 = r20.getRootView()
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            kpa r13 = new kpa
            java.lang.String r14 = ""
            r13.<init>(r14, r11)
            r12.push(r13)
        L_0x02a4:
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto L_0x0389
            java.lang.Object r11 = r12.pop()
            kpa r11 = (defpackage.kpa) r11
            java.lang.Object r13 = r11.b
            android.view.View r13 = (android.view.View) r13
            boolean r15 = r12.isEmpty()
            java.lang.Object r11 = r11.a
            if (r15 != 0) goto L_0x02cd
            java.lang.Object r15 = r12.peek()
            kpa r15 = (defpackage.kpa) r15
            java.lang.Object r15 = r15.a
            boolean r15 = defpackage.tpa.f(r11, r15)
            if (r15 == 0) goto L_0x02cb
            goto L_0x02cd
        L_0x02cb:
            r15 = r2
            goto L_0x02ce
        L_0x02cd:
            r15 = r4
        L_0x02ce:
            if (r15 == 0) goto L_0x02d5
            java.lang.String r16 = "└── "
        L_0x02d2:
            r2 = r16
            goto L_0x02d8
        L_0x02d5:
            java.lang.String r16 = "├── "
            goto L_0x02d2
        L_0x02d8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Class r3 = r13.getClass()
            java.lang.String r3 = r3.getSimpleName()
            int r4 = r13.getId()
            r19 = r14
            java.lang.String r14 = " / "
            if (r10 != 0) goto L_0x0302
            r17 = r0
            r18 = r10
        L_0x02fd:
            r0 = r19
        L_0x02ff:
            r10 = r20
            goto L_0x031e
        L_0x0302:
            r17 = r0
            int r0 = r13.getId()     // Catch:{ all -> 0x031b }
            java.lang.String r0 = r10.getResourceEntryName(r0)     // Catch:{ all -> 0x031b }
            r18 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fd }
            r10.<init>(r14)     // Catch:{ all -> 0x02fd }
            r10.append(r0)     // Catch:{ all -> 0x02fd }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x02fd }
            goto L_0x02ff
        L_0x031b:
            r18 = r10
            goto L_0x02fd
        L_0x031e:
            boolean r14 = r13.equals(r10)
            if (r14 == 0) goto L_0x0327
            java.lang.String r14 = " *********"
            goto L_0x0329
        L_0x0327:
            r14 = r19
        L_0x0329:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r3)
            java.lang.String r2 = " id="
            r10.append(r2)
            r10.append(r4)
            r10.append(r0)
            r10.append(r14)
            java.lang.String r0 = r10.toString()
            r8.append(r0)
            r8.append(r9)
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x037e
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r0 = r13.getChildCount()
            r2 = 0
        L_0x0357:
            if (r2 >= r0) goto L_0x037e
            if (r15 == 0) goto L_0x035e
            java.lang.String r3 = "    "
            goto L_0x0360
        L_0x035e:
            java.lang.String r3 = "│   "
        L_0x0360:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.view.View r4 = r13.getChildAt(r2)
            kpa r10 = new kpa
            r10.<init>(r3, r4)
            r12.push(r10)
            r3 = 1
            int r2 = r2 + r3
            goto L_0x0357
        L_0x037e:
            r14 = r19
            r0 = r17
            r10 = r18
            r2 = 0
            r3 = 0
            r4 = 1
            goto L_0x02a4
        L_0x0389:
            r17 = r0
            java.lang.String r0 = r8.toString()
            java.lang.String r2 = "before handleClick, view hierarchy ... "
            java.lang.String r0 = r2.concat(r0)
            r2 = 0
            r6.d(r7, r5, r0, r2)
            r0 = r17
        L_0x039b:
            r1.s0(r0)
            return
        L_0x039f:
            java.lang.Object r1 = r0.b
            jw7 r1 = (defpackage.jw7) r1
            z2e r1 = r1.H0
            if (r1 == 0) goto L_0x03ae
            java.lang.Object r0 = r0.c
            w2e r0 = (defpackage.w2e) r0
            r0.k(r1)
        L_0x03ae:
            return
        L_0x03af:
            bc7[] r2 = one.me.devmenu.utils.LongValueBottomSheet.D0
            r1 = r2[r1]
            java.lang.Object r3 = r0.b
            one.me.devmenu.utils.LongValueBottomSheet r3 = (one.me.devmenu.utils.LongValueBottomSheet) r3
            q7c r4 = r3.B0
            java.lang.Object r1 = r4.T0(r3, r1)
            cka r1 = (defpackage.cka) r1
            java.lang.CharSequence r1 = r1.getText()
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x0445
            uu3 r4 = r3.getTargetController()
            boolean r5 = r4 instanceof defpackage.xv7
            if (r5 == 0) goto L_0x03d4
            xv7 r4 = (defpackage.xv7) r4
            goto L_0x03d5
        L_0x03d4:
            r4 = 0
        L_0x03d5:
            if (r4 == 0) goto L_0x043a
            r5 = 1
            r2 = r2[r5]
            fs r2 = r3.z0
            java.lang.Object r2 = r2.a(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            java.lang.String r1 = r1.toString()
            long r1 = java.lang.Long.parseLong(r1)
            one.me.devmenu.DevMenuScreen r4 = (one.me.devmenu.DevMenuScreen) r4
            java.util.List r4 = r4.Z
            boolean r7 = r4 instanceof java.util.Collection
            if (r7 == 0) goto L_0x03fc
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x043a
        L_0x03fc:
            java.util.Iterator r4 = r4.iterator()
        L_0x0400:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x043a
            java.lang.Object r7 = r4.next()
            pi4 r7 = (defpackage.pi4) r7
            j0e r8 = r7.c()
            java.lang.Object r8 = r8.getValue()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x041a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x042e
            java.lang.Object r9 = r8.next()
            r10 = r9
            b54 r10 = (defpackage.b54) r10
            long r10 = r10.a
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x041a
            goto L_0x042f
        L_0x042e:
            r9 = 0
        L_0x042f:
            b54 r9 = (defpackage.b54) r9
            if (r9 == 0) goto L_0x0400
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.a(r9, r1)
        L_0x043a:
            java.lang.Object r0 = r0.c
            one.me.sdk.uikit.common.button.OneMeButton r0 = (one.me.sdk.uikit.common.button.OneMeButton) r0
            defpackage.mr0.I(r0)
            r2 = 1
            r3.s0(r2)
        L_0x0445:
            return
        L_0x0446:
            r2 = r4
            bc7[] r3 = one.me.android.join.JoinChatWidget.x0
            java.lang.Object r3 = r0.b
            one.me.sdk.uikit.common.button.OneMeButton r3 = (one.me.sdk.uikit.common.button.OneMeButton) r3
            r3.setProgressEnabled(r2)
            java.lang.Object r0 = r0.c
            one.me.android.join.JoinChatWidget r0 = (one.me.android.join.JoinChatWidget) r0
            je7 r0 = r0.v0
            java.lang.Object r0 = r0.getValue()
            n97 r0 = (defpackage.n97) r0
            kotlinx.coroutines.internal.ContextScope r2 = r0.a
            l97 r3 = new l97
            r4 = 0
            r3.<init>(r0, r4)
            defpackage.j47.T(r2, r4, r4, r3, r1)
            return
        L_0x0468:
            java.lang.Object r1 = r0.c
            y47 r1 = (defpackage.y47) r1
            x47 r1 = r1.a
            java.lang.Object r0 = r0.b
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
            return
        L_0x0476:
            java.lang.Object r1 = r0.c
            go6 r1 = (defpackage.go6) r1
            java.lang.String r1 = r1.a
            java.lang.Object r0 = r0.b
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
            return
        L_0x0484:
            java.lang.Object r1 = r0.b
            m56 r1 = (defpackage.m56) r1
            java.lang.Object r0 = r0.c
            td6 r0 = (defpackage.td6) r0
            r1.invoke(r0)
            return
        L_0x0490:
            java.lang.Object r1 = r0.b
            m56 r1 = (defpackage.m56) r1
            java.lang.Object r0 = r0.c
            rd6 r0 = (defpackage.rd6) r0
            r1.invoke(r0)
            return
        L_0x049c:
            java.lang.Object r1 = r0.b
            m56 r1 = (defpackage.m56) r1
            java.lang.Object r0 = r0.c
            od6 r0 = (defpackage.od6) r0
            r1.invoke(r0)
            return
        L_0x04a8:
            bc7[] r1 = one.me.chats.forward.ForwardPickerScreen.I0
            java.lang.Object r1 = r0.b
            one.me.chats.forward.ForwardPickerScreen r1 = (one.me.chats.forward.ForwardPickerScreen) r1
            txa r2 = r1.v0()
            qza r2 = r2.c
            iz5 r2 = (defpackage.iz5) r2
            q0e r2 = r2.s
        L_0x04b8:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 1
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r3 = r2.c(r3, r4)
            if (r3 == 0) goto L_0x04b8
            txa r2 = r1.v0()
            qza r2 = r2.c
            iz5 r2 = (defpackage.iz5) r2
            q0e r2 = r2.s
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x04ed
            int r2 = defpackage.yoc.h0
            eqe r3 = new eqe
            r3.<init>(r2)
            goto L_0x04f4
        L_0x04ed:
            int r2 = defpackage.yoc.j0
            eqe r3 = new eqe
            r3.<init>(r2)
        L_0x04f4:
            java.lang.Object r0 = r0.c
            csb r0 = (defpackage.csb) r0
            r4 = 0
            one.me.chats.forward.ForwardPickerScreen.x0(r1, r0, r3, r4)
            return
        L_0x04fd:
            java.lang.Object r1 = r0.b
            cm0 r1 = (defpackage.cm0) r1
            m56 r1 = r1.G0
            java.lang.Object r0 = r0.c
            ov5 r0 = (defpackage.ov5) r0
            r1.invoke(r0)
            return
        L_0x050b:
            java.lang.Object r1 = r0.b
            jt5 r1 = (defpackage.jt5) r1
            one.me.folders.edit.FolderEditScreen r1 = (one.me.folders.edit.FolderEditScreen) r1
            nu5 r1 = r1.n0()
            kke r2 = r1.o
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            iu5 r3 = new iu5
            java.lang.Object r0 = r0.c
            pu5 r0 = (defpackage.pu5) r0
            long r4 = r0.a
            r0 = 0
            r3.<init>(r1, r4, r0)
            r4 = 2
            defpackage.pnf.n(r1, r2, r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu5.onClick(android.view.View):void");
    }
}
