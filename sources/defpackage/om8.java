package defpackage;

/* renamed from: om8  reason: default package */
public final /* synthetic */ class om8 extends p66 implements m56 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: h4d} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v12, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b9, code lost:
        if (r1 < 0.0f) goto L_0x02c2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x041a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 3
            r2 = 0
            java.lang.String r4 = "CallSessionRoomsManager"
            r5 = 0
            r6 = 1
            r7 = 2
            r8 = 0
            int r9 = r0.a
            switch(r9) {
                case 0: goto L_0x0909;
                case 1: goto L_0x08e7;
                case 2: goto L_0x0896;
                case 3: goto L_0x0852;
                case 4: goto L_0x0802;
                case 5: goto L_0x0640;
                case 6: goto L_0x061a;
                case 7: goto L_0x05f0;
                case 8: goto L_0x05cd;
                case 9: goto L_0x055c;
                case 10: goto L_0x0517;
                case 11: goto L_0x0501;
                case 12: goto L_0x04e9;
                case 13: goto L_0x04c0;
                case 14: goto L_0x0476;
                case 15: goto L_0x0469;
                case 16: goto L_0x042a;
                case 17: goto L_0x01c1;
                case 18: goto L_0x01b1;
                case 19: goto L_0x0184;
                case 20: goto L_0x0159;
                case 21: goto L_0x0143;
                case 22: goto L_0x0135;
                case 23: goto L_0x00eb;
                case 24: goto L_0x00d7;
                case 25: goto L_0x00c3;
                case 26: goto L_0x00b1;
                case 27: goto L_0x00a3;
                case 28: goto L_0x0091;
                default: goto L_0x0010;
            }
        L_0x0010:
            r1 = r18
            me1 r1 = (defpackage.me1) r1
            java.lang.Object r0 = r0.receiver
            oe1 r0 = (defpackage.oe1) r0
            re r2 = r0.c
            jbg r3 = r1.k
            r3.removeCallbacks(r2)
            java.lang.String r2 = "Statistics report task cancelled"
            a4c r3 = r0.a
            java.lang.String r4 = r0.d
            r3.log(r4, r2)
            java.util.ArrayList r2 = r0.i
            int r5 = r2.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Will now release "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " registered drawers"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r3.log(r4, r5)
            java.util.Iterator r5 = r2.iterator()
        L_0x0048:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r5.next()
            ne1 r6 = (defpackage.ne1) r6
            android.opengl.EGLSurface r7 = r6.a
            r6.a = r8
            r1.e(r7)
            r6.a()
            goto L_0x0048
        L_0x005f:
            int r1 = r2.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = " drawers were released"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r3.log(r4, r1)
            r2.clear()
            org.webrtc.GlRectDrawer r1 = r0.h
            r1.release()
            java.lang.String r1 = "Shared holder released"
            r3.log(r4, r1)
            org.webrtc.VideoFrameDrawer r0 = r0.g
            r0.release()
            java.lang.String r0 = "Frame drawer released"
            r3.log(r4, r0)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0091:
            r1 = r18
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            sl1 r0 = (defpackage.sl1) r0
            a4c r0 = r0.a
            java.lang.String r2 = "All rooms load error"
            r0.logException(r4, r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00a3:
            r1 = r18
            ipd r1 = (defpackage.ipd) r1
            java.lang.Object r0 = r0.receiver
            sl1 r0 = (defpackage.sl1) r0
            r0.e(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00b1:
            r1 = r18
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            sl1 r0 = (defpackage.sl1) r0
            a4c r0 = r0.a
            java.lang.String r2 = "All participants load error"
            r0.logException(r4, r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00c3:
            r1 = r18
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.receiver
            rkf r0 = (defpackage.rkf) r0
            java.lang.Object r0 = r0.c
            a4c r0 = (defpackage.a4c) r0
            java.lang.String r2 = "VideoRecord_BufferTransform"
            r0.log(r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00d7:
            r1 = r18
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            me1 r0 = (defpackage.me1) r0
            a4c r2 = r0.a
            java.lang.String r0 = r0.j
            java.lang.String r3 = "Unexpected error during media processing"
            r2.reportException(r0, r3, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00eb:
            r1 = r18
            p7 r1 = (defpackage.p7) r1
            java.lang.Object r0 = r0.receiver
            q7 r0 = (defpackage.q7) r0
            r0.getClass()
            java.lang.String r4 = r1.b
            ru.ok.android.externcalls.analytics.events.EventItemValue r4 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r4)
            bkb r1 = r1.a
            java.lang.Object r1 = r1.c
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0106
            java.lang.String r1 = "NULL"
        L_0x0106:
            ru.ok.android.externcalls.analytics.events.EventItemValue r1 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r1)
            ru.ok.android.externcalls.analytics.events.EventItemValue r2 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((long) r2)
            ru.ok.android.externcalls.analytics.events.EventItemsMap r3 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            kpa r5 = new kpa
            java.lang.String r6 = "codec_implementation"
            r5.<init>(r6, r4)
            kpa r4 = new kpa
            java.lang.String r6 = "string_value"
            r4.<init>(r6, r1)
            kpa[] r1 = new defpackage.kpa[]{r5, r4}
            java.util.Map r1 = defpackage.mz7.a0(r1)
            r3.<init>(r1)
            m61 r0 = r0.a
            n61 r0 = (defpackage.n61) r0
            java.lang.String r1 = "codec_usage"
            r0.c(r1, r2, r3)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0135:
            r1 = r18
            w2g r1 = (defpackage.w2g) r1
            java.lang.Object r0 = r0.receiver
            x2g r0 = (defpackage.x2g) r0
            r0.a(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0143:
            r1 = r18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            java.lang.String r2 = "app.toggle.webapp_fullscreen"
            r0.j(r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0159:
            r1 = r18
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.receiver
            cse r0 = (defpackage.cse) r0
            lse r0 = r0.a
            kotlinx.coroutines.internal.ContextScope r2 = r0.a
            je7 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            kke r3 = (defpackage.kke) r3
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.a()
            xq9 r4 = defpackage.xq9.a
            lx3 r3 = r3.plus(r4)
            kse r4 = new kse
            r4.<init>(r0, r1, r8)
            defpackage.j47.T(r2, r3, r8, r4, r7)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0184:
            r1 = r18
            wre r1 = (defpackage.wre) r1
            java.lang.Object r0 = r0.receiver
            cr r0 = (defpackage.cr) r0
            kr r0 = r0.a
            je7 r2 = r0.t0
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            jr r3 = new jr
            r3.<init>(r0, r1, r8)
            vxd r1 = defpackage.pnf.n(r0, r2, r8, r3, r7)
            bc7[] r2 = defpackage.kr.E0
            r2 = r2[r5]
            w4d r3 = r0.D0
            r3.o1(r0, r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x01b1:
            r1 = r18
            gy8 r1 = (defpackage.gy8) r1
            java.lang.Object r0 = r0.receiver
            ku8 r0 = (defpackage.ku8) r0
            r0.getClass()
            lu8 r0 = defpackage.ku8.a(r1)
            return r0
        L_0x01c1:
            r2 = r18
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            java.lang.Object r0 = r0.receiver
            rge r0 = (defpackage.rge) r0
            k56 r3 = r0.a
            java.lang.Object r3 = r3.invoke()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x01d9
            goto L_0x0425
        L_0x01d9:
            int r3 = r2.getPointerCount()
            int r4 = r0.l
            int r8 = r0.k
            android.view.View r9 = r0.b
            if (r3 <= r6) goto L_0x0201
            boolean r3 = r0.f
            if (r3 == 0) goto L_0x0201
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x01f6
            float r1 = r9.getTranslationX()
            float r2 = (float) r8
        L_0x01f4:
            float r1 = r1 / r2
            goto L_0x01fc
        L_0x01f6:
            float r1 = r9.getTranslationY()
            float r2 = (float) r4
            goto L_0x01f4
        L_0x01fc:
            r0.c(r1, r6)
            goto L_0x0425
        L_0x0201:
            gic r3 = r0.o
            java.lang.Object r10 = r3.getValue()
            android.view.VelocityTracker r10 = (android.view.VelocityTracker) r10
            r10.addMovement(r2)
            int r10 = r2.getAction()
            int r11 = r0.e
            r12 = 0
            if (r10 == r6) goto L_0x031f
            int r10 = r2.getAction()
            if (r10 != r1) goto L_0x021d
            goto L_0x031f
        L_0x021d:
            boolean r1 = r0.f
            if (r1 == 0) goto L_0x0279
            if (r1 != 0) goto L_0x0225
            goto L_0x0423
        L_0x0225:
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x022e
            float r1 = r0.g
            goto L_0x0230
        L_0x022e:
            float r1 = r0.h
        L_0x0230:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0423
            boolean r3 = r0.b()
            if (r3 == 0) goto L_0x0240
            float r3 = r2.getRawX()
        L_0x023e:
            float r1 = r1 - r3
            goto L_0x0245
        L_0x0240:
            float r3 = r2.getRawY()
            goto L_0x023e
        L_0x0245:
            boolean r3 = r0.b()
            if (r3 == 0) goto L_0x0257
            float r3 = r9.getTranslationX()
            float r3 = r3 - r1
            float r1 = defpackage.ote.b(r3, r12)
            float r3 = (float) r8
            float r1 = r1 / r3
            goto L_0x025f
        L_0x0257:
            float r3 = r9.getTranslationY()
            float r3 = r3 - r1
            float r1 = (float) r4
            float r1 = r3 / r1
        L_0x025f:
            r0.d(r1)
            nge r1 = r0.q
            if (r1 == 0) goto L_0x026b
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r1 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r1
            r1.q0()
        L_0x026b:
            float r1 = r2.getRawX()
            r0.g = r1
            float r1 = r2.getRawY()
            r0.h = r1
            goto L_0x0423
        L_0x0279:
            float r1 = r0.g
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0305
            float r1 = r0.h
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0305
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0293
            float r1 = r0.i
            float r3 = r2.getRawX()
        L_0x0291:
            float r1 = r1 - r3
            goto L_0x029a
        L_0x0293:
            float r1 = r0.j
            float r3 = r2.getRawY()
            goto L_0x0291
        L_0x029a:
            boolean r3 = r0.b()
            if (r3 == 0) goto L_0x02a8
            float r3 = r0.j
            float r4 = r2.getRawY()
        L_0x02a6:
            float r3 = r3 - r4
            goto L_0x02af
        L_0x02a8:
            float r3 = r0.i
            float r4 = r2.getRawX()
            goto L_0x02a6
        L_0x02af:
            int r4 = defpackage.au1.s(r11)
            if (r4 == 0) goto L_0x02c2
            if (r4 != r6) goto L_0x02bc
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0311
            goto L_0x02c2
        L_0x02bc:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02c2:
            float r4 = java.lang.Math.abs(r1)
            je7 r5 = r0.p
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0311
            float r1 = java.lang.Math.abs(r1)
            float r3 = java.lang.Math.abs(r3)
            float r4 = (float) r7
            float r3 = r3 * r4
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0311
            r0.f = r6
            android.view.ViewParent r1 = r9.getParent()
            r1.requestDisallowInterceptTouchEvent(r6)
            l6 r1 = r0.n
            android.view.ViewGroup r3 = r0.c
            int r4 = r3.indexOfChild(r9)
            r3.addView(r1, r4)
            nge r1 = r0.q
            if (r1 == 0) goto L_0x0311
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r1 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r1
            r1.b = r6
            r1.r0()
            goto L_0x0311
        L_0x0305:
            float r1 = r2.getRawX()
            r0.i = r1
            float r1 = r2.getRawY()
            r0.j = r1
        L_0x0311:
            float r1 = r2.getRawX()
            r0.g = r1
            float r1 = r2.getRawY()
            r0.h = r1
            goto L_0x0423
        L_0x031f:
            boolean r1 = r0.f
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x032d
            r0.f = r5
            r0.g = r10
            r0.h = r10
            goto L_0x0423
        L_0x032d:
            java.lang.Object r1 = r3.getValue()
            android.view.VelocityTracker r1 = (android.view.VelocityTracker) r1
            r1.computeCurrentVelocity(r6)
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x034f
            java.lang.Object r1 = r3.getValue()
            android.view.VelocityTracker r1 = (android.view.VelocityTracker) r1
            int r13 = r2.getActionIndex()
            int r2 = r2.getPointerId(r13)
            float r1 = r1.getXVelocity(r2)
            goto L_0x0361
        L_0x034f:
            java.lang.Object r1 = r3.getValue()
            android.view.VelocityTracker r1 = (android.view.VelocityTracker) r1
            int r13 = r2.getActionIndex()
            int r2 = r2.getPointerId(r13)
            float r1 = r1.getYVelocity(r2)
        L_0x0361:
            java.lang.Object r2 = r3.getValue()
            android.view.VelocityTracker r2 = (android.view.VelocityTracker) r2
            r2.recycle()
            c32 r2 = defpackage.c32.Y
            r3.b = r2
            int r2 = defpackage.au1.s(r11)
            if (r2 == 0) goto L_0x037a
            if (r2 != r6) goto L_0x037e
            int r2 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x037c
        L_0x037a:
            r2 = r6
            goto L_0x0384
        L_0x037c:
            r2 = r5
            goto L_0x0384
        L_0x037e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0384:
            boolean r3 = r0.b()
            if (r3 == 0) goto L_0x038f
            float r3 = r9.getTranslationX()
            goto L_0x0393
        L_0x038f:
            float r3 = r9.getTranslationY()
        L_0x0393:
            boolean r11 = r0.b()
            if (r11 == 0) goto L_0x03a0
            float r9 = r9.getTranslationX()
            float r11 = (float) r8
        L_0x039e:
            float r9 = r9 / r11
            goto L_0x03a6
        L_0x03a0:
            float r9 = r9.getTranslationY()
            float r11 = (float) r4
            goto L_0x039e
        L_0x03a6:
            if (r2 == 0) goto L_0x03b2
            float r1 = java.lang.Math.abs(r1)
            r2 = 1069547520(0x3fc00000, float:1.5)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x03d0
        L_0x03b2:
            boolean r1 = r0.b()
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            if (r1 == 0) goto L_0x03c6
            float r1 = (float) r8
            float r3 = r3 / r1
            float r1 = java.lang.Math.abs(r3)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x041a
            goto L_0x03d0
        L_0x03c6:
            float r1 = (float) r4
            float r3 = r3 / r1
            float r1 = java.lang.Math.abs(r3)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x041a
        L_0x03d0:
            android.animation.ValueAnimator r1 = r0.t
            if (r1 == 0) goto L_0x03db
            boolean r1 = r1.isRunning()
            if (r1 != r6) goto L_0x03db
            goto L_0x041d
        L_0x03db:
            int r1 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 >= 0) goto L_0x03e3
            r1 = r10
            goto L_0x03e4
        L_0x03e3:
            r1 = r2
        L_0x03e4:
            float r3 = java.lang.Math.abs(r9)
            float r2 = r2 - r3
            r3 = 200(0xc8, double:9.9E-322)
            float r3 = (float) r3
            float r2 = r2 * r3
            long r11 = (long) r2
            r13 = 0
            r15 = 200(0xc8, double:9.9E-322)
            long r2 = defpackage.ote.f(r11, r13, r15)
            float[] r4 = new float[r7]
            r4[r5] = r9
            r4[r6] = r1
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r4)
            android.animation.ValueAnimator r1 = r1.setDuration(r2)
            qge r2 = new qge
            r2.<init>(r0, r5)
            r1.addUpdateListener(r2)
            mf r2 = new mf
            r2.<init>((defpackage.rge) r0, (float) r9)
            r1.addListener(r2)
            r0.t = r1
            r1.start()
            goto L_0x041d
        L_0x041a:
            r0.c(r9, r5)
        L_0x041d:
            r0.f = r5
            r0.g = r10
            r0.h = r10
        L_0x0423:
            boolean r5 = r0.f
        L_0x0425:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x042a:
            r1 = r18
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.receiver
            one.me.stickerssettings.stickersscreen.StickersScreen r0 = (one.me.stickerssettings.stickersscreen.StickersScreen) r0
            bc7[] r2 = one.me.stickerssettings.stickersscreen.StickersScreen.v0
            a8e r2 = r0.o0()
            w7c r2 = r2.z0
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            m7e r2 = (defpackage.m7e) r2
            if (r2 == 0) goto L_0x0446
            java.util.List r8 = r2.d
        L_0x0446:
            if (r8 == 0) goto L_0x0466
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x044f
            goto L_0x0466
        L_0x044f:
            qt3 r2 = defpackage.dy7.c(r6)
            qt3 r2 = r2.I(r8)
            qt3 r1 = r2.Y(r1)
            qt3 r1 = r1.s()
            rt3 r1 = r1.build()
            r1.q(r0)
        L_0x0466:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0469:
            r1 = r18
            vne r1 = (defpackage.vne) r1
            java.lang.Object r0 = r0.receiver
            jmc r0 = (defpackage.jmc) r0
            une r0 = r0.f(r1)
            return r0
        L_0x0476:
            r1 = r18
            v8c r1 = (defpackage.v8c) r1
            java.lang.Object r0 = r0.receiver
            zu2 r0 = (defpackage.zu2) r0
            r0.getClass()
            bc7[] r2 = one.me.chats.search.ChatsListSearchScreen.J0
            one.me.chats.search.ChatsListSearchScreen r0 = r0.a
            defpackage.mr0.G(r0)
            gw2 r0 = r0.n0()
            s35 r2 = r0.H0
            boolean r3 = r1.s0
            if (r3 == 0) goto L_0x04a2
            gy2 r0 = defpackage.gy2.c
            r0.getClass()
            c64 r0 = new c64
            java.lang.String r1 = ":saved-messages"
            r0.<init>(r1)
            defpackage.pnf.o(r2, r0)
            goto L_0x04bd
        L_0x04a2:
            boolean r3 = r1.Z
            if (r3 == 0) goto L_0x04b8
            gy2 r4 = defpackage.gy2.c
            osf r7 = defpackage.osf.FROM_SEARCH
            long r5 = r1.a
            r10 = 4
            r8 = 0
            r9 = 101(0x65, float:1.42E-43)
            c64 r0 = defpackage.gy2.c2(r4, r5, r7, r8, r9, r10)
            defpackage.pnf.o(r2, r0)
            goto L_0x04bd
        L_0x04b8:
            long r1 = r1.a
            r0.u(r1)
        L_0x04bd:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x04c0:
            r2 = r18
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Object r0 = r0.receiver
            jjb r0 = (defpackage.jjb) r0
            one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen r0 = (one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen) r0
            zjb r0 = r0.m0()
            z87 r4 = r0.A0
            boolean r4 = r4.isActive()
            if (r4 == 0) goto L_0x04db
            goto L_0x04e6
        L_0x04db:
            qjb r4 = new qjb
            r4.<init>(r2, r0, r8)
            vxd r1 = defpackage.pnf.n(r0, r8, r8, r4, r1)
            r0.A0 = r1
        L_0x04e6:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x04e9:
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            mdb r0 = (defpackage.mdb) r0
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r0 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r0
            feb r0 = r0.o0()
            r0.v(r1, r6)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0501:
            r1 = r18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            q33 r0 = (defpackage.q33) r0
            t33 r0 = (defpackage.t33) r0
            java.lang.String r2 = "app.debug.profile.info.enabled"
            r0.j(r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0517:
            r1 = r18
            bbb r1 = (defpackage.bbb) r1
            java.lang.Object r0 = r0.receiver
            ccb r0 = (defpackage.ccb) r0
            r0.getClass()
            yab r2 = defpackage.yab.a
            boolean r2 = defpackage.tpa.f(r1, r2)
            if (r2 == 0) goto L_0x052d
            ubb r1 = defpackage.ubb.a
            goto L_0x054e
        L_0x052d:
            boolean r2 = r1 instanceof defpackage.zab
            if (r2 == 0) goto L_0x0540
            zab r1 = (defpackage.zab) r1
            int r2 = r1.a
            r0.Y = r2
            ybb r2 = new ybb
            int r1 = r1.a
            r2.<init>(r1)
        L_0x053e:
            r1 = r2
            goto L_0x054e
        L_0x0540:
            boolean r2 = r1 instanceof defpackage.abb
            if (r2 == 0) goto L_0x0556
            xbb r2 = new xbb
            abb r1 = (defpackage.abb) r1
            android.net.Uri r1 = r1.a
            r2.<init>(r1)
            goto L_0x053e
        L_0x054e:
            s35 r0 = r0.Z
            defpackage.pnf.o(r0, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0556:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x055c:
            r1 = r18
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.receiver
            one.me.profile.screens.avatars.ProfileAvatarsScreen r0 = (one.me.profile.screens.avatars.ProfileAvatarsScreen) r0
            bc7[] r2 = one.me.profile.screens.avatars.ProfileAvatarsScreen.z0
            r0.getClass()
            qt3 r2 = defpackage.dy7.c(r6)
            ccb r3 = r0.B0()
            androidx.viewpager2.widget.ViewPager2 r4 = r0.C0()
            int r4 = r4.getCurrentItem()
            fbb r7 = r3.b
            int r3 = r3.Y
            if (r4 != r3) goto L_0x0580
            r5 = r6
        L_0x0580:
            java.util.List r3 = r7.c(r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.z53.S(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0593:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x05b3
            java.lang.Object r5 = r3.next()
            xab r5 = (defpackage.xab) r5
            tt3 r12 = new tt3
            int r7 = r5.ordinal()
            jqe r8 = r5.a
            r9 = 0
            r10 = 0
            r11 = 28
            r6 = r12
            r6.<init>((int) r7, (defpackage.jqe) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (int) r11)
            r4.add(r12)
            goto L_0x0593
        L_0x05b3:
            qt3 r2 = r2.I(r4)
            qt3 r1 = r2.Y(r1)
            qt3 r1 = r1.y()
            qt3 r1 = r1.s()
            rt3 r1 = r1.build()
            r1.q(r0)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x05cd:
            r1 = r18
            qo9 r1 = (defpackage.qo9) r1
            java.lang.Object r0 = r0.receiver
            wp9 r0 = (defpackage.wp9) r0
            r0.getClass()
            if (r1 == 0) goto L_0x05ed
            int r1 = r1.c
            int r2 = r0.Y
            if (r1 != r2) goto L_0x05e1
            goto L_0x05ed
        L_0x05e1:
            r0.Y = r1
            kld r0 = r0.v0
            ro9 r2 = new ro9
            r2.<init>(r1, r8)
            r0.g(r2)
        L_0x05ed:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x05f0:
            r1 = r18
            qo9 r1 = (defpackage.qo9) r1
            java.lang.Object r0 = r0.receiver
            gp9 r0 = (defpackage.gp9) r0
            wp9 r0 = r0.a
            r0.getClass()
            if (r1 == 0) goto L_0x0604
            qo9 r1 = defpackage.qo9.y(r1, r6)
            goto L_0x0605
        L_0x0604:
            r1 = r8
        L_0x0605:
            if (r1 == 0) goto L_0x0612
            h4d r8 = new h4d
            int r2 = r1.c
            java.lang.String r3 = r1.b
            long r4 = r1.a
            r8.<init>(r4, r3, r2)
        L_0x0612:
            z4d r0 = r0.c
            r0.a(r8)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x061a:
            r1 = r18
            n19 r1 = (defpackage.n19) r1
            java.lang.Object r0 = r0.receiver
            n59 r0 = (defpackage.n59) r0
            r0.getClass()
            vx3 r2 = defpackage.vx3.b
            d49 r3 = new d49
            r3.<init>(r0, r1, r8)
            nx3 r1 = r0.B0
            kotlinx.coroutines.internal.ContextScope r4 = r0.a
            vxd r1 = defpackage.j47.S(r4, r1, r2, r3)
            bc7[] r2 = defpackage.n59.D1
            r2 = r2[r7]
            w4d r3 = r0.k1
            r3.o1(r0, r2, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0640:
            r1 = r18
            gs8 r1 = (defpackage.gs8) r1
            java.lang.Object r0 = r0.receiver
            is8 r0 = (defpackage.is8) r0
            r0.getClass()
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x07e5;
                case 1: goto L_0x07c8;
                case 2: goto L_0x07ab;
                case 3: goto L_0x078e;
                case 4: goto L_0x0770;
                case 5: goto L_0x074d;
                case 6: goto L_0x072a;
                case 7: goto L_0x070c;
                case 8: goto L_0x06ee;
                case 9: goto L_0x06d0;
                case 10: goto L_0x06b2;
                case 11: goto L_0x0694;
                case 12: goto L_0x0676;
                case 13: goto L_0x0658;
                default: goto L_0x0652;
            }
        L_0x0652:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0658:
            tt3 r0 = new tt3
            int r2 = defpackage.mwb.messages_list_context_action_share_externally
            int r1 = defpackage.y0c.chat_screen_action_share_externally
            eqe r3 = new eqe
            r3.<init>(r1)
            int r1 = defpackage.yfa.y
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.jqe) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0801
        L_0x0676:
            tt3 r0 = new tt3
            int r8 = defpackage.mda.r
            int r1 = defpackage.oda.f
            eqe r9 = new eqe
            r9.<init>(r1)
            int r1 = defpackage.woc.t
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.jqe) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0801
        L_0x0694:
            tt3 r0 = new tt3
            int r2 = defpackage.mda.A
            int r1 = defpackage.oda.q
            eqe r3 = new eqe
            r3.<init>(r1)
            int r1 = defpackage.woc.D
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.jqe) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0801
        L_0x06b2:
            tt3 r0 = new tt3
            int r8 = defpackage.mda.u
            int r1 = defpackage.oda.k
            eqe r9 = new eqe
            r9.<init>(r1)
            int r1 = defpackage.woc.F
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.jqe) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0801
        L_0x06d0:
            tt3 r0 = new tt3
            int r2 = defpackage.mda.B
            int r1 = defpackage.oda.r
            eqe r3 = new eqe
            r3.<init>(r1)
            int r1 = defpackage.woc.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.jqe) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0801
        L_0x06ee:
            tt3 r0 = new tt3
            int r8 = defpackage.mda.C
            int r1 = defpackage.oda.s
            eqe r9 = new eqe
            r9.<init>(r1)
            int r1 = defpackage.woc.C1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.jqe) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0801
        L_0x070c:
            tt3 r0 = new tt3
            int r2 = defpackage.mda.x
            int r1 = defpackage.oda.n
            eqe r3 = new eqe
            r3.<init>(r1)
            int r1 = defpackage.woc.E1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.jqe) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0801
        L_0x072a:
            tt3 r0 = new tt3
            int r8 = defpackage.mda.t
            int r1 = defpackage.oda.j
            eqe r9 = new eqe
            r9.<init>(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.w
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r7 = r0
            r7.<init>((int) r8, (defpackage.jqe) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12)
            goto L_0x0801
        L_0x074d:
            tt3 r0 = new tt3
            int r2 = defpackage.mda.s
            int r1 = defpackage.oda.i
            eqe r3 = new eqe
            r3.<init>(r1)
            int r1 = defpackage.wfa.U
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.woc.w
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.P
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r1 = r0
            r1.<init>((int) r2, (defpackage.jqe) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6)
            goto L_0x0801
        L_0x0770:
            tt3 r0 = new tt3
            int r8 = defpackage.mda.y
            int r1 = defpackage.oda.o
            eqe r9 = new eqe
            r9.<init>(r1)
            int r1 = defpackage.woc.R1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.jqe) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0801
        L_0x078e:
            tt3 r0 = new tt3
            int r2 = defpackage.mda.w
            int r1 = defpackage.oda.m
            eqe r3 = new eqe
            r3.<init>(r1)
            int r1 = defpackage.woc.m1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.jqe) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0801
        L_0x07ab:
            tt3 r0 = new tt3
            int r8 = defpackage.mda.z
            int r1 = defpackage.oda.p
            eqe r9 = new eqe
            r9.<init>(r1)
            int r1 = defpackage.woc.S1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.jqe) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0801
        L_0x07c8:
            tt3 r0 = new tt3
            int r2 = defpackage.mda.q
            int r1 = defpackage.oda.e
            eqe r3 = new eqe
            r3.<init>(r1)
            int r1 = defpackage.woc.t
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.jqe) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0801
        L_0x07e5:
            tt3 r0 = new tt3
            int r8 = defpackage.mda.v
            int r1 = defpackage.oda.l
            eqe r9 = new eqe
            r9.<init>(r1)
            int r1 = defpackage.woc.Z1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.wfa.S
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.jqe) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
        L_0x0801:
            return r0
        L_0x0802:
            r1 = r18
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            java.lang.Object r0 = r0.receiver
            one.me.sdk.messagewrite.MessageWriteWidget r0 = (one.me.sdk.messagewrite.MessageWriteWidget) r0
            bc7[] r2 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            android.view.View r2 = r0.getView()
            if (r2 != 0) goto L_0x0813
            goto L_0x084f
        L_0x0813:
            sv8 r2 = r0.q0()
            java.lang.CharSequence r2 = r2.getText()
            if (r2 == 0) goto L_0x0823
            boolean r2 = defpackage.w9e.C0(r2)
            if (r2 == 0) goto L_0x084f
        L_0x0823:
            sv8 r2 = r0.q0()
            ov8 r2 = r2.getSendActionState()
            boolean r2 = r2 instanceof defpackage.kv8
            if (r2 == 0) goto L_0x084f
            sv8 r2 = r0.q0()
            iv8 r2 = r2.getEmojiExpandableState()
            iv8 r3 = defpackage.iv8.a
            if (r2 == r3) goto L_0x083c
            goto L_0x084f
        L_0x083c:
            xz8 r0 = r0.v0()
            r0.getClass()
            ez8 r2 = new ez8
            bac r3 = defpackage.bac.b
            r2.<init>(r3, r1)
            s35 r0 = r0.T0
            defpackage.pnf.o(r0, r2)
        L_0x084f:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0852:
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            jq8 r0 = (defpackage.jq8) r0
            java.lang.String r3 = r0.J0
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L_0x0865
            goto L_0x0876
        L_0x0865:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0876
            us7 r5 = defpackage.us7.X
            java.lang.String r6 = "process click on member: "
            java.lang.String r6 = defpackage.ey8.h(r1, r6)
            r4.d(r5, r3, r6, r8)
        L_0x0876:
            s35 r0 = r0.H0
            u29 r3 = defpackage.u29.c
            r3.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ":profile?id="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "&type=contact"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            defpackage.wg0.k(r1, r0)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0896:
            r1 = r18
            vv8 r1 = (defpackage.vv8) r1
            java.lang.Object r0 = r0.receiver
            xs8 r0 = (defpackage.xs8) r0
            b69 r0 = (defpackage.b69) r0
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.tv8
            one.me.messages.list.ui.MessagesListWidget r0 = r0.a
            if (r2 == 0) goto L_0x08cd
            bc7[] r2 = one.me.messages.list.ui.MessagesListWidget.X0
            n59 r10 = r0.x0()
            tv8 r1 = (defpackage.tv8) r1
            kotlinx.coroutines.internal.ContextScope r0 = r10.a
            kke r2 = r10.Y
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            b49 r3 = new b49
            java.lang.String r13 = r1.b
            r16 = 0
            long r14 = r1.c
            long r11 = r1.a
            r9 = r3
            r9.<init>(r10, r11, r13, r14, r16)
            defpackage.j47.T(r0, r2, r8, r3, r7)
            goto L_0x08de
        L_0x08cd:
            boolean r2 = r1 instanceof defpackage.uv8
            if (r2 == 0) goto L_0x08e1
            bc7[] r2 = one.me.messages.list.ui.MessagesListWidget.X0
            n59 r0 = r0.x0()
            uv8 r1 = (defpackage.uv8) r1
            long r1 = r1.a
            r0.G(r1)
        L_0x08de:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x08e1:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x08e7:
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.receiver
            gn8 r0 = (defpackage.gn8) r0
            one.me.members.list.MembersListWidget r0 = (one.me.members.list.MembersListWidget) r0
            ro8 r0 = r0.o0()
            r0.getClass()
            no8 r2 = new no8
            r2.<init>(r1)
            s35 r0 = r0.X
            defpackage.pnf.o(r0, r2)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0909:
            r1 = r18
            jm8 r1 = (defpackage.jm8) r1
            java.lang.Object r0 = r0.receiver
            dm8 r0 = (defpackage.dm8) r0
            r0.getClass()
            gm8 r4 = defpackage.gm8.a
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0993
            im8 r4 = defpackage.im8.a
            boolean r4 = r1.equals(r4)
            s35 r5 = r0.Y
            if (r4 == 0) goto L_0x0959
            je7 r1 = r0.Z
            java.lang.Object r1 = r1.getValue()
            y7d r1 = (defpackage.y7d) r1
            qyc r1 = (defpackage.qyc) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f86moneytransferbotid
            long r1 = r1.q(r4, r2)
            vo2 r3 = defpackage.vo2.c
            r3.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ":webapp:root?bot_id="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "&entry_point=money_button&chat_id="
            r3.append(r1)
            long r0 = r0.c
            java.lang.String r2 = "&request_code=1010"
            java.lang.String r0 = defpackage.zr6.k(r3, r0, r2)
            defpackage.wg0.k(r0, r5)
            goto L_0x0993
        L_0x0959:
            hm8 r0 = defpackage.hm8.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0967
            ul8 r0 = defpackage.ul8.b
            defpackage.pnf.o(r5, r0)
            goto L_0x0993
        L_0x0967:
            em8 r0 = defpackage.em8.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x097f
            vo2 r0 = defpackage.vo2.c
            r0.getClass()
            c64 r0 = new c64
            java.lang.String r1 = ":contacts-picker?request_code=372"
            r0.<init>(r1)
            defpackage.pnf.o(r5, r0)
            goto L_0x0993
        L_0x097f:
            fm8 r0 = defpackage.fm8.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x098d
            vl8 r0 = defpackage.vl8.b
            defpackage.pnf.o(r5, r0)
            goto L_0x0993
        L_0x098d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0993:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om8.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public om8(int i, Object obj) {
        super(1, 0, sl1.class, obj, "onAllParticipantsLoadError", "onAllParticipantsLoadError(Ljava/lang/Throwable;)V");
        this.a = i;
        switch (i) {
            case 27:
                super(1, 0, sl1.class, obj, "onAllRoomsLoaded", "onAllRoomsLoaded(Lru/ok/android/webrtc/signaling/sessionroom/event/SignalingSessionRooms;)V");
                return;
            case 28:
                super(1, 0, sl1.class, obj, "onAllRoomsLoadError", "onAllRoomsLoadError(Ljava/lang/Throwable;)V");
                return;
            default:
                return;
        }
    }
}
