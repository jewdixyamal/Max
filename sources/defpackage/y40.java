package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: y40  reason: default package */
public final class y40 implements on5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public y40(jec jec, on5 on5, ComplaintBottomSheet complaintBottomSheet) {
        this.a = 4;
        this.c = jec;
        this.o = complaintBottomSheet;
        this.b = on5;
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [iqe] */
    /* JADX WARNING: type inference failed for: r0v35 */
    /* JADX WARNING: type inference failed for: r0v38 */
    /* JADX WARNING: type inference failed for: r0v43, types: [bvd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r20, kotlin.coroutines.Continuation r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r3 = 0
            r4 = 2
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = r1.a
            switch(r9) {
                case 0: goto L_0x042c;
                case 1: goto L_0x03c5;
                case 2: goto L_0x0354;
                case 3: goto L_0x0263;
                case 4: goto L_0x018b;
                case 5: goto L_0x0128;
                case 6: goto L_0x00f8;
                case 7: goto L_0x0089;
                case 8: goto L_0x0029;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.Object r3 = r1.b
            lx3 r3 = (defpackage.lx3) r3
            java.lang.Object r4 = r1.c
            java.lang.Object r1 = r1.o
            y4f r1 = (defpackage.y4f) r1
            java.lang.Object r0 = defpackage.f46.g0(r3, r0, r4, r1, r2)
            tx3 r1 = defpackage.tx3.a
            if (r0 != r1) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            e5f r0 = defpackage.e5f.a
        L_0x0028:
            return r0
        L_0x0029:
            boolean r3 = r2 instanceof defpackage.m79
            if (r3 == 0) goto L_0x003a
            r3 = r2
            m79 r3 = (defpackage.m79) r3
            int r4 = r3.X
            r5 = r4 & r8
            if (r5 == 0) goto L_0x003a
            int r4 = r4 - r8
            r3.X = r4
            goto L_0x003f
        L_0x003a:
            m79 r3 = new m79
            r3.<init>(r1, r2)
        L_0x003f:
            java.lang.Object r2 = r3.o
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x0053
            if (r5 != r7) goto L_0x004d
            defpackage.od2.a0(r2)
            goto L_0x0086
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0053:
            defpackage.od2.a0(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            java.lang.Object r0 = r1.c
            n79 r0 = (defpackage.n79) r0
            q0e r0 = r0.v0
            java.lang.Object r0 = r0.getValue()
            kua r0 = (defpackage.kua) r0
            dk r0 = r0.a()
            java.lang.Object r2 = r1.o
            wxc r2 = (defpackage.wxc) r2
            java.lang.String r2 = r2.toString()
            r0.Z = r2
            kua r0 = r0.a()
            r3.X = r7
            java.lang.Object r1 = r1.b
            on5 r1 = (defpackage.on5) r1
            java.lang.Object r0 = r1.a(r0, r3)
            if (r0 != r4) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            e5f r4 = defpackage.e5f.a
        L_0x0088:
            return r4
        L_0x0089:
            boolean r3 = r2 instanceof defpackage.pq5
            if (r3 == 0) goto L_0x009a
            r3 = r2
            pq5 r3 = (defpackage.pq5) r3
            int r9 = r3.s0
            r10 = r9 & r8
            if (r10 == 0) goto L_0x009a
            int r9 = r9 - r8
            r3.s0 = r9
            goto L_0x009f
        L_0x009a:
            pq5 r3 = new pq5
            r3.<init>(r1, r2)
        L_0x009f:
            java.lang.Object r2 = r3.Y
            tx3 r8 = defpackage.tx3.a
            int r9 = r3.s0
            if (r9 == 0) goto L_0x00bd
            if (r9 == r7) goto L_0x00b5
            if (r9 != r4) goto L_0x00af
            defpackage.od2.a0(r2)
            goto L_0x00f5
        L_0x00af:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x00b5:
            mec r0 = r3.X
            y40 r1 = r3.o
            defpackage.od2.a0(r2)
            goto L_0x00dc
        L_0x00bd:
            defpackage.od2.a0(r2)
            java.lang.Object r2 = r1.c
            mec r2 = (defpackage.mec) r2
            java.lang.Object r6 = r2.a
            r3.o = r1
            r3.X = r2
            r3.s0 = r7
            java.lang.Object r7 = r1.o
            c66 r7 = (defpackage.c66) r7
            java.lang.Object r0 = r7.invoke(r6, r0, r3)
            if (r0 != r8) goto L_0x00d7
            goto L_0x00f7
        L_0x00d7:
            r18 = r2
            r2 = r0
            r0 = r18
        L_0x00dc:
            r0.a = r2
            java.lang.Object r0 = r1.b
            on5 r0 = (defpackage.on5) r0
            java.lang.Object r1 = r1.c
            mec r1 = (defpackage.mec) r1
            java.lang.Object r1 = r1.a
            r3.o = r5
            r3.X = r5
            r3.s0 = r4
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r8) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            e5f r8 = defpackage.e5f.a
        L_0x00f7:
            return r8
        L_0x00f8:
            java.lang.Object r2 = r1.b
            mec r2 = (defpackage.mec) r2
            java.lang.Object r3 = r2.a
            ti9 r3 = (defpackage.ti9) r3
            if (r3 == 0) goto L_0x0106
            r3.setValue(r0)
            goto L_0x0125
        L_0x0106:
            q0e r0 = defpackage.r0e.a(r20)
            w7c r3 = new w7c
            java.lang.Object r4 = r1.c
            sx3 r4 = (defpackage.sx3) r4
            lx3 r4 = r4.getCoroutineContext()
            defpackage.pag.n(r4)
            r3.<init>(r0)
            java.lang.Object r1 = r1.o
            ta3 r1 = (defpackage.ta3) r1
            ua3 r1 = (defpackage.ua3) r1
            r1.makeCompleting$kotlinx_coroutines_core(r3)
            r2.a = r0
        L_0x0125:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0128:
            boolean r3 = r2 instanceof defpackage.hm4
            if (r3 == 0) goto L_0x0139
            r3 = r2
            hm4 r3 = (defpackage.hm4) r3
            int r4 = r3.Y
            r5 = r4 & r8
            if (r5 == 0) goto L_0x0139
            int r4 = r4 - r8
            r3.Y = r4
            goto L_0x013e
        L_0x0139:
            hm4 r3 = new hm4
            r3.<init>(r1, r2)
        L_0x013e:
            java.lang.Object r2 = r3.o
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.Y
            e5f r8 = defpackage.e5f.a
            if (r5 == 0) goto L_0x0154
            if (r5 != r7) goto L_0x014e
            defpackage.od2.a0(r2)
            goto L_0x017a
        L_0x014e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0154:
            defpackage.od2.a0(r2)
            java.lang.Object r2 = r1.c
            im4 r2 = (defpackage.im4) r2
            m56 r5 = r2.b
            java.lang.Object r5 = r5.invoke(r0)
            java.lang.Object r6 = r1.o
            mec r6 = (defpackage.mec) r6
            java.lang.Object r9 = r6.a
            kotlinx.coroutines.internal.Symbol r10 = defpackage.ay9.a
            if (r9 == r10) goto L_0x017c
            a66 r2 = r2.c
            java.lang.Object r2 = r2.invoke(r9, r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x017a
            goto L_0x017c
        L_0x017a:
            r4 = r8
            goto L_0x018a
        L_0x017c:
            r6.a = r5
            r3.Y = r7
            java.lang.Object r1 = r1.b
            on5 r1 = (defpackage.on5) r1
            java.lang.Object r0 = r1.a(r0, r3)
            if (r0 != r4) goto L_0x017a
        L_0x018a:
            return r4
        L_0x018b:
            boolean r4 = r2 instanceof defpackage.ga3
            if (r4 == 0) goto L_0x019c
            r4 = r2
            ga3 r4 = (defpackage.ga3) r4
            int r9 = r4.X
            r10 = r9 & r8
            if (r10 == 0) goto L_0x019c
            int r9 = r9 - r8
            r4.X = r9
            goto L_0x01a1
        L_0x019c:
            ga3 r4 = new ga3
            r4.<init>(r1, r2)
        L_0x01a1:
            java.lang.Object r2 = r4.o
            tx3 r8 = defpackage.tx3.a
            int r9 = r4.X
            if (r9 == 0) goto L_0x01b6
            if (r9 != r7) goto L_0x01b0
            defpackage.od2.a0(r2)
            goto L_0x0260
        L_0x01b0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x01b6:
            defpackage.od2.a0(r2)
            java.lang.Object r2 = r1.c
            jec r2 = (defpackage.jec) r2
            boolean r6 = r2.a
            if (r6 != 0) goto L_0x0253
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            boolean r9 = r6.isEmpty()
            r9 = r9 ^ r7
            if (r9 == 0) goto L_0x0253
            bc7[] r9 = one.me.complaintbottomsheet.ComplaintBottomSheet.X
            java.lang.Object r9 = r1.o
            one.me.complaintbottomsheet.ComplaintBottomSheet r9 = (one.me.complaintbottomsheet.ComplaintBottomSheet) r9
            r9.getClass()
            bc7[] r10 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            int r10 = defpackage.maa.c
            r11 = 6
            lg3 r10 = defpackage.wg0.e(r10, r11, r5)
            int r11 = defpackage.maa.a
            eqe r12 = new eqe
            r12.<init>(r11)
            r10.f(r12)
            java.util.Iterator r6 = r6.iterator()
        L_0x01eb:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x01ff
            java.lang.Object r11 = r6.next()
            mg3 r11 = (defpackage.mg3) r11
            mg3[] r11 = new defpackage.mg3[]{r11}
            r10.a(r11)
            goto L_0x01eb
        L_0x01ff:
            khe r6 = r9.c
            java.lang.Object r6 = r6.getValue()
            mg3 r6 = (defpackage.mg3) r6
            mg3[] r6 = new defpackage.mg3[]{r6}
            r10.a(r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r12 = r10.e()
            ia3 r6 = new ia3
            r6.<init>(r3, r9)
            r12.addLifecycleListener(r6)
            r12.setTargetController(r9)
            r6 = r9
        L_0x021e:
            uu3 r10 = r6.getParentController()
            if (r10 == 0) goto L_0x0229
            uu3 r6 = r6.getParentController()
            goto L_0x021e
        L_0x0229:
            boolean r10 = r6 instanceof defpackage.foc
            if (r10 == 0) goto L_0x0230
            foc r6 = (defpackage.foc) r6
            goto L_0x0231
        L_0x0230:
            r6 = r5
        L_0x0231:
            if (r6 == 0) goto L_0x0237
            znc r5 = r6.T()
        L_0x0237:
            r12.z0(r9)
            if (r5 == 0) goto L_0x0251
            coc r6 = new coc
            r14 = 0
            r17 = -1
            r13 = 0
            r15 = 0
            r16 = 0
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.lang.String r9 = "BottomSheetWidget"
            defpackage.wg0.l(r3, r6, r7, r9)
            r5.G(r6)
        L_0x0251:
            r2.a = r7
        L_0x0253:
            r4.X = r7
            java.lang.Object r1 = r1.b
            on5 r1 = (defpackage.on5) r1
            java.lang.Object r0 = r1.a(r0, r4)
            if (r0 != r8) goto L_0x0260
            goto L_0x0262
        L_0x0260:
            e5f r8 = defpackage.e5f.a
        L_0x0262:
            return r8
        L_0x0263:
            boolean r4 = r2 instanceof defpackage.gq2
            if (r4 == 0) goto L_0x0274
            r4 = r2
            gq2 r4 = (defpackage.gq2) r4
            int r9 = r4.X
            r10 = r9 & r8
            if (r10 == 0) goto L_0x0274
            int r9 = r9 - r8
            r4.X = r9
            goto L_0x0279
        L_0x0274:
            gq2 r4 = new gq2
            r4.<init>(r1, r2)
        L_0x0279:
            java.lang.Object r2 = r4.o
            tx3 r8 = defpackage.tx3.a
            int r9 = r4.X
            if (r9 == 0) goto L_0x028e
            if (r9 != r7) goto L_0x0288
            defpackage.od2.a0(r2)
            goto L_0x0351
        L_0x0288:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x028e:
            defpackage.od2.a0(r2)
            g4f r0 = (defpackage.g4f) r0
            java.lang.Object r2 = r1.c
            rq2 r2 = (defpackage.rq2) r2
            w7c r2 = r2.Y0
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            e52 r2 = (defpackage.e52) r2
            if (r2 == 0) goto L_0x0344
            wv7 r0 = r0.a
            long r9 = r2.a
            java.lang.Object r0 = r0.c(r9)
            ns2 r0 = (defpackage.ns2) r0
            if (r0 != 0) goto L_0x02b1
            goto L_0x0344
        L_0x02b1:
            java.lang.Object r2 = r1.o
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            d4f r2 = (defpackage.d4f) r2
            ld2 r2 = (defpackage.ld2) r2
            r2.getClass()
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r0 = r0.b
            r6.<init>(r0)
            int r0 = r6.length()
            r9 = 33
            r10 = 8203(0x200b, float:1.1495E-41)
            if (r0 != 0) goto L_0x02d2
            goto L_0x0322
        L_0x02d2:
            int r0 = r6.length()     // Catch:{ all -> 0x02e8 }
            int r0 = r0 - r7
            int r11 = r6.length()     // Catch:{ all -> 0x02e8 }
            java.lang.Class<bvd> r12 = defpackage.bvd.class
            java.lang.Object[] r0 = r6.getSpans(r0, r11, r12)     // Catch:{ all -> 0x02e8 }
            java.lang.Object r0 = defpackage.ys.f0(r3, r0)     // Catch:{ all -> 0x02e8 }
            bvd r0 = (defpackage.bvd) r0     // Catch:{ all -> 0x02e8 }
            goto L_0x02ef
        L_0x02e8:
            r0 = move-exception
            njc r3 = new njc
            r3.<init>(r0)
            r0 = r3
        L_0x02ef:
            boolean r3 = r0 instanceof defpackage.njc
            if (r3 == 0) goto L_0x02f4
            goto L_0x02f5
        L_0x02f4:
            r5 = r0
        L_0x02f5:
            bvd r5 = (defpackage.bvd) r5
            if (r5 == 0) goto L_0x02fd
            r6.removeSpan(r5)
            goto L_0x0300
        L_0x02fd:
            r6.append(r10)
        L_0x0300:
            bvd r0 = new bvd
            r3 = 4
            float r3 = (float) r3
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = defpackage.tu0.G(r3)
            r0.<init>(r3)
            int r3 = r6.length()
            int r3 = r3 - r7
            int r5 = r6.length()
            r6.setSpan(r0, r3, r5, r9)
        L_0x0322:
            r6.append(r10)
            khe r0 = r2.s
            java.lang.Object r0 = r0.getValue()
            yl5 r0 = (defpackage.yl5) r0
            int r2 = r6.length()
            int r2 = r2 - r7
            int r3 = r6.length()
            r6.setSpan(r0, r2, r3, r9)
            int r0 = defpackage.gvd.a
            gvd r0 = defpackage.crd.l(r6, r7)
            iqe r5 = new iqe
            r5.<init>(r0)
        L_0x0344:
            r4.X = r7
            java.lang.Object r0 = r1.b
            on5 r0 = (defpackage.on5) r0
            java.lang.Object r0 = r0.a(r5, r4)
            if (r0 != r8) goto L_0x0351
            goto L_0x0353
        L_0x0351:
            e5f r8 = defpackage.e5f.a
        L_0x0353:
            return r8
        L_0x0354:
            boolean r3 = r2 instanceof defpackage.eq2
            if (r3 == 0) goto L_0x0365
            r3 = r2
            eq2 r3 = (defpackage.eq2) r3
            int r9 = r3.X
            r10 = r9 & r8
            if (r10 == 0) goto L_0x0365
            int r9 = r9 - r8
            r3.X = r9
            goto L_0x036a
        L_0x0365:
            eq2 r3 = new eq2
            r3.<init>(r1, r2)
        L_0x036a:
            java.lang.Object r2 = r3.o
            tx3 r8 = defpackage.tx3.a
            int r9 = r3.X
            if (r9 == 0) goto L_0x0386
            if (r9 == r7) goto L_0x0380
            if (r9 != r4) goto L_0x037a
            defpackage.od2.a0(r2)
            goto L_0x03c2
        L_0x037a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0380:
            on5 r0 = r3.Y
            defpackage.od2.a0(r2)
            goto L_0x03b7
        L_0x0386:
            defpackage.od2.a0(r2)
            fka r0 = (defpackage.fka) r0
            java.lang.Object r0 = r1.b
            on5 r0 = (defpackage.on5) r0
            r3.Y = r0
            r3.X = r7
            java.lang.Object r2 = r1.c
            o23 r2 = (defpackage.o23) r2
            java.lang.Object r6 = r2.o
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r6 = r6.getValue()
            kke r6 = (defpackage.kke) r6
            w9a r6 = (defpackage.w9a) r6
            nx3 r6 = r6.b()
            bo7 r7 = new bo7
            java.lang.Object r1 = r1.o
            android.content.Context r1 = (android.content.Context) r1
            r7.<init>(r2, r1, r5)
            java.lang.Object r2 = defpackage.j47.t0(r6, r7, r3)
            if (r2 != r8) goto L_0x03b7
            goto L_0x03c4
        L_0x03b7:
            r3.Y = r5
            r3.X = r4
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r8) goto L_0x03c2
            goto L_0x03c4
        L_0x03c2:
            e5f r8 = defpackage.e5f.a
        L_0x03c4:
            return r8
        L_0x03c5:
            boolean r3 = r2 instanceof defpackage.i31
            if (r3 == 0) goto L_0x03d6
            r3 = r2
            i31 r3 = (defpackage.i31) r3
            int r9 = r3.X
            r10 = r9 & r8
            if (r10 == 0) goto L_0x03d6
            int r9 = r9 - r8
            r3.X = r9
            goto L_0x03db
        L_0x03d6:
            i31 r3 = new i31
            r3.<init>(r1, r2)
        L_0x03db:
            java.lang.Object r2 = r3.o
            tx3 r8 = defpackage.tx3.a
            int r9 = r3.X
            if (r9 == 0) goto L_0x03f7
            if (r9 == r7) goto L_0x03f1
            if (r9 != r4) goto L_0x03eb
            defpackage.od2.a0(r2)
            goto L_0x0429
        L_0x03eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x03f1:
            on5 r0 = r3.Y
            defpackage.od2.a0(r2)
            goto L_0x041e
        L_0x03f7:
            defpackage.od2.a0(r2)
            nm3 r0 = (defpackage.nm3) r0
            bc7[] r0 = defpackage.l31.p
            java.lang.Object r0 = r1.c
            l31 r0 = (defpackage.l31) r0
            iy2 r0 = r0.a()
            java.lang.Object r2 = r1.o
            e52 r2 = (defpackage.e52) r2
            long r9 = r2.a
            java.lang.Object r1 = r1.b
            on5 r1 = (defpackage.on5) r1
            r3.Y = r1
            r3.X = r7
            jz2 r0 = (defpackage.jz2) r0
            java.lang.Comparable r2 = r0.j(r9, r3)
            if (r2 != r8) goto L_0x041d
            goto L_0x042b
        L_0x041d:
            r0 = r1
        L_0x041e:
            r3.Y = r5
            r3.X = r4
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r8) goto L_0x0429
            goto L_0x042b
        L_0x0429:
            e5f r8 = defpackage.e5f.a
        L_0x042b:
            return r8
        L_0x042c:
            boolean r3 = r2 instanceof defpackage.x40
            if (r3 == 0) goto L_0x043d
            r3 = r2
            x40 r3 = (defpackage.x40) r3
            int r4 = r3.X
            r5 = r4 & r8
            if (r5 == 0) goto L_0x043d
            int r4 = r4 - r8
            r3.X = r4
            goto L_0x0442
        L_0x043d:
            x40 r3 = new x40
            r3.<init>(r1, r2)
        L_0x0442:
            java.lang.Object r2 = r3.o
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x0456
            if (r5 != r7) goto L_0x0450
            defpackage.od2.a0(r2)
            goto L_0x048d
        L_0x0450:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0456:
            defpackage.od2.a0(r2)
            java.lang.Object r2 = r1.b
            on5 r2 = (defpackage.on5) r2
            r5 = r0
            java.lang.Number r5 = (java.lang.Number) r5
            r5.floatValue()
            java.lang.Object r5 = r1.c
            c50 r5 = (defpackage.c50) r5
            java.lang.Long r5 = r5.e
            java.lang.Object r1 = r1.o
            je7 r1 = (defpackage.je7) r1
            java.lang.Object r1 = r1.getValue()
            ch9 r1 = (defpackage.ch9) r1
            uh9 r1 = (defpackage.uh9) r1
            long r8 = r1.l()
            if (r5 != 0) goto L_0x047c
            goto L_0x048d
        L_0x047c:
            long r5 = r5.longValue()
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x048d
            r3.X = r7
            java.lang.Object r0 = r2.a(r0, r3)
            if (r0 != r4) goto L_0x048d
            goto L_0x048f
        L_0x048d:
            e5f r4 = defpackage.e5f.a
        L_0x048f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y40.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ y40(Object obj, Object obj2, on5 on5, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = on5;
    }

    public /* synthetic */ y40(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public y40(on5 on5, lx3 lx3) {
        this.a = 9;
        this.b = lx3;
        this.c = ThreadContextKt.threadContextElements(lx3);
        this.o = new y4f(on5, (Continuation) null);
    }
}
