package defpackage;

/* renamed from: shb  reason: default package */
public final /* synthetic */ class shb extends v8 implements a66 {
    public final /* synthetic */ int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shb(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.s0 = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r1v48, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r9v12, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r9v15, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r9v18, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r9v21, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = -1
            r2 = 5
            r3 = 3
            r4 = 2
            java.lang.String r5 = ""
            r6 = 8
            r7 = 1
            r8 = 0
            r9 = 0
            int r10 = r0.s0
            switch(r10) {
                case 0: goto L_0x0969;
                case 1: goto L_0x08de;
                case 2: goto L_0x08ca;
                case 3: goto L_0x08b6;
                case 4: goto L_0x08a2;
                case 5: goto L_0x088e;
                case 6: goto L_0x0841;
                case 7: goto L_0x070e;
                case 8: goto L_0x06fa;
                case 9: goto L_0x0661;
                case 10: goto L_0x0628;
                case 11: goto L_0x0598;
                case 12: goto L_0x04d4;
                case 13: goto L_0x04b2;
                case 14: goto L_0x0466;
                case 15: goto L_0x0422;
                case 16: goto L_0x02b6;
                case 17: goto L_0x01ed;
                case 18: goto L_0x01ac;
                case 19: goto L_0x018d;
                case 20: goto L_0x0114;
                case 21: goto L_0x00c1;
                case 22: goto L_0x00a1;
                case 23: goto L_0x006c;
                case 24: goto L_0x005a;
                default: goto L_0x0012;
            }
        L_0x0012:
            r1 = r33
            jff r1 = (defpackage.jff) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            gdf r0 = (defpackage.gdf) r0
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.jff
            if (r2 == 0) goto L_0x0054
            androidx.recyclerview.widget.RecyclerView r2 = r0.f
            java.lang.String r1 = r1.a
            java.lang.String r3 = "video_fetching_autoplay"
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 == 0) goto L_0x0051
            if (r2 != 0) goto L_0x0034
            goto L_0x0051
        L_0x0034:
            java.lang.String r1 = r0.e
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x003b
            goto L_0x0048
        L_0x003b:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0048
            us7 r4 = defpackage.us7.X
            java.lang.String r5 = "Player autoplay. Handle fetch event, try start autoplay."
            r3.d(r4, r1, r5, r9)
        L_0x0048:
            int r1 = r2.getScrollState()
            if (r1 != 0) goto L_0x0051
            r0.e(r2, r8)
        L_0x0051:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0054:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x005a:
            r1 = r33
            ly8 r1 = (defpackage.ly8) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r0 = (ru.ok.tamtam.upload.workers.UploadFileAttachWorker) r0
            r0.g(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x006c:
            r1 = r33
            uj3 r1 = (defpackage.uj3) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            j5f r0 = (defpackage.j5f) r0
            r0.getClass()
            boolean r2 = r1.Y
            q0e r0 = r0.h
            if (r2 != 0) goto L_0x009b
            boolean r2 = r1.c()
            if (r2 != 0) goto L_0x009b
            boolean r2 = r1.s()
            if (r2 == 0) goto L_0x008e
            goto L_0x009b
        L_0x008e:
            g5f r2 = new g5f
            long r3 = r1.n()
            r2.<init>(r3)
            r0.m(r9, r2)
            goto L_0x009e
        L_0x009b:
            r0.setValue(r9)
        L_0x009e:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00a1:
            r1 = r33
            d7f r1 = (defpackage.d7f) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            cge r0 = (defpackage.cge) r0
            r0.getClass()
            rfe r3 = new rfe
            r3.<init>(r0, r1, r9)
            m32 r0 = new m32
            hz4 r4 = defpackage.hz4.a
            r5 = -2
            r6 = 1
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x00c1:
            r1 = r33
            v6f r1 = (defpackage.v6f) r1
            r3 = r34
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r0.a
            cge r0 = (defpackage.cge) r0
            r0.getClass()
            tfe r3 = new tfe
            r3.<init>(r0, r1, r9)
            mqc r4 = new mqc
            r4.<init>(r3)
            ap8 r3 = new ap8
            r5 = 14
            r3.<init>(r4, r1, r5)
            int r4 = defpackage.ft4.o
            r4 = 500(0x1f4, float:7.0E-43)
            kt4 r5 = defpackage.kt4.MILLISECONDS
            long r4 = defpackage.z7.R(r4, r5)
            m32 r3 = defpackage.nu0.Q(r3, r4)
            vp5 r4 = new vp5
            r5 = 10
            r4.<init>(r0, r1, r9, r5)
            ac r1 = new ac
            r5 = 18
            r1.<init>(r3, r5, r4)
            ufe r3 = new ufe
            r3.<init>(r0, r9)
            ac r4 = new ac
            r5 = 19
            r4.<init>(r1, r5, r3)
            vfe r1 = new vfe
            r1.<init>(r0, r9)
            zn5 r0 = new zn5
            r0.<init>(r4, r1, r2)
            return r0
        L_0x0114:
            r1 = r33
            java.util.List r1 = (java.util.List) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            a8e r0 = (defpackage.a8e) r0
            r0.getClass()
            kl7 r2 = defpackage.j1e.l()
            java.util.Iterator r1 = r1.iterator()
        L_0x012b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0181
            java.lang.Object r3 = r1.next()
            d2e r3 = (defpackage.d2e) r3
            java.lang.String r4 = r3.s0
            if (r4 != 0) goto L_0x013c
            r4 = r5
        L_0x013c:
            int r6 = r4.length()
            if (r6 != 0) goto L_0x0144
            java.lang.String r4 = r3.o
        L_0x0144:
            r17 = r4
            z2e r4 = new z2e
            je7 r6 = r0.t0
            java.lang.Object r6 = r6.getValue()
            qe5 r6 = (defpackage.qe5) r6
            se5 r6 = (defpackage.se5) r6
            boolean r6 = r6.w()
            if (r6 == 0) goto L_0x015d
            java.lang.String r6 = r3.z0
            r19 = r6
            goto L_0x015f
        L_0x015d:
            r19 = r9
        L_0x015f:
            r22 = 0
            r26 = 7744(0x1e40, float:1.0852E-41)
            long r11 = r3.a
            long r6 = r3.v0
            r13 = r6
            r15 = r6
            java.lang.String r6 = r3.w0
            r18 = r6
            int r6 = r3.b
            r20 = r6
            int r3 = r3.c
            r21 = r3
            r23 = 0
            r24 = 0
            r10 = r4
            r10.<init>(r11, r13, r15, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            r2.add(r4)
            goto L_0x012b
        L_0x0181:
            kl7 r1 = defpackage.j1e.d(r2)
            q0e r0 = r0.x0
            r0.setValue(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x018d:
            r1 = r33
            wm9 r1 = (defpackage.wm9) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            one.me.stickersshowcase.StickersShowcaseScreen r0 = (one.me.stickersshowcase.StickersShowcaseScreen) r0
            bc7[] r2 = one.me.stickersshowcase.StickersShowcaseScreen.v0
            r0.getClass()
            boolean r1 = r1 instanceof defpackage.g43
            if (r1 == 0) goto L_0x01a9
            znc r0 = r0.getRouter()
            r0.C()
        L_0x01a9:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x01ac:
            r1 = r33
            vnd r1 = (defpackage.vnd) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            one.me.stickersshowcase.StickersShowcaseScreen r0 = (one.me.stickersshowcase.StickersShowcaseScreen) r0
            bc7[] r2 = one.me.stickersshowcase.StickersShowcaseScreen.v0
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.vnd
            if (r2 == 0) goto L_0x01ea
            vha r2 = r0.t0
            if (r2 == 0) goto L_0x01c8
            r2.a()
        L_0x01c8:
            wha r2 = new wha
            r2.<init>((one.me.sdk.arch.Widget) r0)
            kia r3 = new kia
            int r4 = r1.a
            r3.<init>(r4)
            r2.e(r3)
            android.content.Context r3 = r0.getContext()
            int r1 = r1.b
            java.lang.String r1 = r3.getString(r1)
            r2.h(r1)
            vha r1 = r2.i()
            r0.t0 = r1
        L_0x01ea:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x01ed:
            r2 = r33
            xnd r2 = (defpackage.xnd) r2
            r5 = r34
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r0 = r0.a
            one.me.stickersshowcase.StickersShowcaseScreen r0 = (one.me.stickersshowcase.StickersShowcaseScreen) r0
            bc7[] r5 = one.me.stickersshowcase.StickersShowcaseScreen.v0
            r0.getClass()
            wnd r5 = r2.a
            int r5 = r5.ordinal()
            p71 r10 = r0.u0
            qm0 r11 = r0.Z
            qm0 r12 = r0.s0
            if (r5 == 0) goto L_0x027e
            if (r5 == r7) goto L_0x025c
            if (r5 == r4) goto L_0x025c
            if (r5 != r3) goto L_0x0256
            android.view.View r2 = r0.getView()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x021d
            r9 = r2
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x021d:
            if (r9 == 0) goto L_0x023f
            java.lang.Object r2 = r12.getValue()
            android.view.View r2 = (android.view.View) r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r1, r1)
            bc7[] r1 = one.me.stickersshowcase.StickersShowcaseScreen.v0
            r1 = r1[r7]
            q7c r4 = r0.X
            java.lang.Object r1 = r4.T0(r0, r1)
            cla r1 = (defpackage.cla) r1
            int r1 = r1.getMeasuredHeight()
            r3.topMargin = r1
            defpackage.ay7.a(r9, r2, r3)
        L_0x023f:
            r12.getValue()
            java.lang.Object r1 = r12.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r8)
            defpackage.j47.P(r11)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r0.m0()
            r0.setVisibility(r6)
            goto L_0x02b3
        L_0x0256:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x025c:
            java.util.List r1 = r2.b
            r10.E(r1)
            defpackage.j47.P(r11)
            defpackage.j47.P(r12)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.m0()
            r1.setVisibility(r8)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.m0()
            i7e r0 = r0.n0()
            boolean r0 = r0.r()
            r1.setRefreshingNext(r0)
            goto L_0x02b3
        L_0x027e:
            android.view.View r1 = r0.getView()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0289
            r9 = r1
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x0289:
            if (r9 == 0) goto L_0x0294
            java.lang.Object r1 = r11.getValue()
            android.view.View r1 = (android.view.View) r1
            defpackage.ay7.b(r9, r1, -1)
        L_0x0294:
            java.lang.Object r1 = r11.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r8)
            defpackage.j47.P(r12)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.m0()
            r1.setVisibility(r6)
            nz4 r1 = defpackage.nz4.a
            r10.E(r1)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r0.m0()
            r0.setRefreshingNext(r8)
        L_0x02b3:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x02b6:
            r1 = r33
            s6e r1 = (defpackage.s6e) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            w6e r0 = (defpackage.w6e) r0
            r0.getClass()
            java.util.List r2 = r1.a
            if (r2 == 0) goto L_0x041f
            java.util.List r2 = r1.b
            if (r2 == 0) goto L_0x041f
            java.util.List r2 = r1.c
            if (r2 == 0) goto L_0x041f
            kl7 r2 = defpackage.j1e.l()
            java.util.List r3 = r1.a
            if (r3 == 0) goto L_0x02ec
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x02e0
            goto L_0x02ec
        L_0x02e0:
            java.lang.String r3 = r0.q(r3)
            iqe r4 = new iqe
            r4.<init>(r3)
            r16 = r4
            goto L_0x02ee
        L_0x02ec:
            r16 = r9
        L_0x02ee:
            vfd r3 = new vfd
            int r4 = defpackage.hja.p
            eqe r14 = new eqe
            r14.<init>(r4)
            int r4 = defpackage.fja.c
            java.lang.Integer r17 = java.lang.Integer.valueOf(r4)
            cfd r26 = defpackage.cfd.a
            r20 = 0
            r23 = 1928(0x788, float:2.702E-42)
            r11 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r13 = 0
            r15 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r10 = r3
            r18 = r26
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            x0d r4 = new x0d
            l6e r6 = defpackage.l6e.c
            r6.getClass()
            c64 r6 = new c64
            java.lang.String r10 = ":stickers/recent"
            r6.<init>(r10)
            int r20 = defpackage.gja.m
            r23 = 1
            r21 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r17 = r4
            r18 = r3
            r19 = r6
            r17.<init>(r18, r19, r20, r21, r23)
            r2.add(r4)
            java.util.List r3 = r1.b
            if (r3 == 0) goto L_0x0350
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0344
            goto L_0x0350
        L_0x0344:
            java.lang.String r3 = r0.q(r3)
            iqe r4 = new iqe
            r4.<init>(r3)
            r24 = r4
            goto L_0x0352
        L_0x0350:
            r24 = r9
        L_0x0352:
            vfd r11 = new vfd
            int r3 = defpackage.hja.d
            eqe r4 = new eqe
            r4.<init>(r3)
            int r3 = defpackage.woc.J
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r28 = 0
            r31 = 1928(0x788, float:2.702E-42)
            r19 = 9223372036854775805(0x7ffffffffffffffd, double:NaN)
            r21 = 0
            r23 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r18 = r11
            r22 = r4
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            x0d r3 = new x0d
            c64 r12 = new c64
            java.lang.String r4 = ":stickers/favorite"
            r12.<init>(r4)
            int r13 = defpackage.gja.h
            r16 = 3
            r14 = 9223372036854775805(0x7ffffffffffffffd, double:NaN)
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r16)
            r2.add(r3)
            java.util.List r3 = r1.c
            if (r3 == 0) goto L_0x03f6
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x039f
            goto L_0x03f6
        L_0x039f:
            t0d r3 = new t0d
            int r4 = defpackage.hja.r
            eqe r6 = new eqe
            r6.<init>(r4)
            int r4 = defpackage.gja.s
            r3.<init>(r4, r6)
            r2.add(r3)
            java.util.List r1 = r1.c
            if (r1 == 0) goto L_0x03f6
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x03bb
            goto L_0x03f6
        L_0x03bb:
            java.util.Iterator r3 = r1.iterator()
        L_0x03bf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03f6
            java.lang.Object r4 = r3.next()
            m3e r4 = (defpackage.m3e) r4
            w0d r6 = new w0d
            long r11 = r4.a
            java.lang.String r10 = r4.b
            if (r10 != 0) goto L_0x03d5
            r14 = r5
            goto L_0x03d6
        L_0x03d5:
            r14 = r10
        L_0x03d6:
            java.util.List r10 = r4.h
            java.lang.String r15 = r0.q(r10)
            java.lang.String r13 = r4.g
            int r10 = r1.size()
            if (r10 <= r7) goto L_0x03e7
            r17 = r7
            goto L_0x03e9
        L_0x03e7:
            r17 = r8
        L_0x03e9:
            java.lang.String r4 = r4.c
            r10 = r6
            r16 = r13
            r13 = r4
            r10.<init>(r11, r13, r14, r15, r16, r17)
            r2.add(r6)
            goto L_0x03bf
        L_0x03f6:
            kl7 r1 = defpackage.j1e.d(r2)
            q0e r0 = r0.X
            r0.setValue(r1)
            java.lang.Class<w6e> r0 = defpackage.w6e.class
            java.lang.String r0 = r0.getName()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x040a
            goto L_0x041f
        L_0x040a:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x041f
            us7 r3 = defpackage.us7.X
            int r1 = r1.getSize()
            java.lang.String r4 = "process sections. finish, size:"
            java.lang.String r1 = defpackage.zr6.h(r1, r4)
            r2.d(r3, r0, r1, r9)
        L_0x041f:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0422:
            r1 = r33
            java.lang.String r1 = (java.lang.String) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            g6e r0 = (defpackage.g6e) r0
            java.lang.Class<g6e> r2 = defpackage.g6e.class
            java.lang.String r2 = r2.getName()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0439
            goto L_0x044d
        L_0x0439:
            r0.getClass()
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x044d
            us7 r4 = defpackage.us7.X
            java.lang.String r5 = "Stickers sets search. start, q:"
            java.lang.String r5 = defpackage.wg0.i(r5, r1)
            r3.d(r4, r2, r5, r9)
        L_0x044d:
            kotlinx.coroutines.internal.ContextScope r2 = r0.c
            vx3 r3 = defpackage.vx3.b
            f6e r4 = new f6e
            r4.<init>(r1, r0, r9)
            vxd r1 = defpackage.j47.T(r2, r9, r3, r4, r7)
            w4d r2 = r0.i
            bc7[] r3 = defpackage.g6e.j
            r3 = r3[r8]
            r2.o1(r0, r3, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0466:
            r1 = r33
            java.lang.String r1 = (java.lang.String) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            q5e r0 = (defpackage.q5e) r0
            java.lang.Class<q5e> r2 = defpackage.q5e.class
            java.lang.String r2 = r2.getName()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x047d
            goto L_0x0491
        L_0x047d:
            r0.getClass()
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0491
            us7 r4 = defpackage.us7.X
            java.lang.String r5 = "Stickers search. start, q:"
            java.lang.String r5 = defpackage.wg0.i(r5, r1)
            r3.d(r4, r2, r5, r9)
        L_0x0491:
            kke r2 = r0.c
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            vx3 r3 = defpackage.vx3.b
            p5e r4 = new p5e
            r4.<init>(r1, r0, r9)
            kotlinx.coroutines.internal.ContextScope r1 = r0.a
            vxd r1 = defpackage.j47.S(r1, r2, r3, r4)
            w4d r2 = r0.x0
            bc7[] r3 = defpackage.q5e.z0
            r3 = r3[r8]
            r2.o1(r0, r3, r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x04b2:
            r1 = r33
            wm9 r1 = (defpackage.wm9) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            one.me.stickerssearch.StickersSearchScreen r0 = (one.me.stickerssearch.StickersSearchScreen) r0
            bc7[] r2 = one.me.stickerssearch.StickersSearchScreen.u0
            r0.getClass()
            boolean r1 = r1 instanceof defpackage.g43
            if (r1 == 0) goto L_0x04d1
            defpackage.mr0.G(r0)
            znc r0 = r0.getRouter()
            r0.C()
        L_0x04d1:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x04d4:
            r2 = r33
            szc r2 = (defpackage.szc) r2
            r3 = r34
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r0.a
            one.me.stickerssearch.StickersSearchScreen r0 = (one.me.stickerssearch.StickersSearchScreen) r0
            bc7[] r3 = one.me.stickerssearch.StickersSearchScreen.u0
            r0.getClass()
            int r3 = r2.a
            int r3 = defpackage.au1.s(r3)
            a3g r5 = r0.t0
            qm0 r10 = r0.Z
            qm0 r11 = r0.s0
            if (r3 == 0) goto L_0x0560
            if (r3 == r7) goto L_0x053e
            if (r3 != r4) goto L_0x0538
            android.view.View r2 = r0.getView()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0502
            r9 = r2
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x0502:
            if (r9 == 0) goto L_0x0524
            java.lang.Object r2 = r11.getValue()
            android.view.View r2 = (android.view.View) r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r1, r1)
            bc7[] r1 = one.me.stickerssearch.StickersSearchScreen.u0
            r1 = r1[r4]
            q7c r4 = r0.Y
            java.lang.Object r1 = r4.T0(r0, r1)
            eha r1 = (defpackage.eha) r1
            int r1 = r1.getMeasuredHeight()
            r3.topMargin = r1
            defpackage.ay7.a(r9, r2, r3)
        L_0x0524:
            java.lang.Object r1 = r11.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r8)
            defpackage.j47.P(r10)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r0.m0()
            r0.setVisibility(r6)
            goto L_0x0595
        L_0x0538:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x053e:
            java.util.List r1 = r2.b
            r5.E(r1)
            defpackage.j47.P(r10)
            defpackage.j47.P(r11)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.m0()
            r1.setVisibility(r8)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.m0()
            q5e r0 = r0.n0()
            boolean r0 = r0.r()
            r1.setRefreshingNext(r0)
            goto L_0x0595
        L_0x0560:
            android.view.View r1 = r0.getView()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x056b
            r9 = r1
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x056b:
            if (r9 == 0) goto L_0x0576
            java.lang.Object r1 = r10.getValue()
            android.view.View r1 = (android.view.View) r1
            defpackage.ay7.b(r9, r1, -1)
        L_0x0576:
            java.lang.Object r1 = r10.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r8)
            defpackage.j47.P(r11)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.m0()
            r1.setVisibility(r6)
            nz4 r1 = defpackage.nz4.a
            r5.E(r1)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r0.m0()
            r0.setRefreshingNext(r8)
        L_0x0595:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0598:
            r1 = r33
            w3e r1 = (defpackage.w3e) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            one.me.stickerspreview.set.StickerSetBottomSheet r0 = (one.me.stickerspreview.set.StickerSetBottomSheet) r0
            bc7[] r2 = one.me.stickerspreview.set.StickerSetBottomSheet.A0
            if (r1 != 0) goto L_0x05ad
            r0.getClass()
            goto L_0x0625
        L_0x05ad:
            r0.getClass()
            bc7[] r2 = one.me.stickerspreview.set.StickerSetBottomSheet.A0
            r3 = r2[r3]
            qm0 r3 = r0.z0
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r6)
            java.util.List r3 = r1.X
            int r6 = r3.size()
            android.content.Context r9 = r0.getContext()
            android.content.res.Resources r9 = r9.getResources()
            int r10 = defpackage.uga.a
            java.lang.String r9 = r9.getQuantityString(r10, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r6 = java.lang.String.format(r9, r6)
            int r9 = r1.Y
            if (r9 != r4) goto L_0x05ea
            int r10 = defpackage.vga.b
            goto L_0x05ec
        L_0x05ea:
            int r10 = defpackage.vga.a
        L_0x05ec:
            if (r9 != r4) goto L_0x05f1
            b7a r4 = defpackage.b7a.b
            goto L_0x05f3
        L_0x05f1:
            b7a r4 = defpackage.b7a.a
        L_0x05f3:
            r2 = r2[r7]
            q7c r7 = r0.v0
            java.lang.Object r2 = r7.T0(r0, r2)
            v5e r2 = (defpackage.v5e) r2
            android.content.Context r7 = r0.getContext()
            jqe r1 = r1.b
            java.lang.CharSequence r1 = r1.b(r7)
            if (r1 != 0) goto L_0x060a
            goto L_0x060b
        L_0x060a:
            r5 = r1
        L_0x060b:
            android.widget.TextView r1 = r2.a
            r1.setText(r5)
            android.widget.TextView r1 = r2.b
            r1.setText(r6)
            one.me.sdk.uikit.common.button.OneMeButton r1 = r2.c
            r1.setText((int) r10)
            r1.setMode(r4)
            r1.setVisibility(r8)
            a3g r0 = r0.x0
            r0.E(r3)
        L_0x0625:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0628:
            r1 = r33
            o35 r1 = (defpackage.o35) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            one.me.stickerspreview.StickerPreviewScreen r0 = (one.me.stickerspreview.StickerPreviewScreen) r0
            bc7[] r2 = one.me.stickerspreview.StickerPreviewScreen.A0
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.qnd
            if (r2 == 0) goto L_0x065e
            wha r2 = new wha
            r2.<init>((one.me.sdk.arch.Widget) r0)
            kia r3 = new kia
            qnd r1 = (defpackage.qnd) r1
            int r4 = r1.a
            r3.<init>(r4)
            r2.e(r3)
            android.content.Context r0 = r0.getContext()
            int r1 = r1.b
            java.lang.String r0 = r0.getString(r1)
            r2.h(r0)
            r2.i()
        L_0x065e:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0661:
            r1 = r33
            wm9 r1 = (defpackage.wm9) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            one.me.stickerspreview.StickerPreviewScreen r0 = (one.me.stickerspreview.StickerPreviewScreen) r0
            bc7[] r2 = one.me.stickerspreview.StickerPreviewScreen.A0
            r0.getClass()
            boolean r1 = r1 instanceof defpackage.g43
            if (r1 == 0) goto L_0x06f7
            bc7[] r1 = one.me.stickerspreview.StickerPreviewScreen.A0
            r1 = r1[r7]
            fs r1 = r0.a
            java.lang.Object r1 = r1.a(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.String r3 = "chats?id="
            java.lang.String r1 = defpackage.ey8.h(r1, r3)
            znc r2 = r0.getRouter()
            java.util.ArrayList r2 = r2.e()
            java.util.Iterator r2 = r2.iterator()
        L_0x0698:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x06b0
            java.lang.Object r3 = r2.next()
            r4 = r3
            coc r4 = (defpackage.coc) r4
            java.lang.String r4 = r4.b
            if (r4 == 0) goto L_0x0698
            boolean r4 = defpackage.w9e.p0(r4, r1, r8)
            if (r4 != r7) goto L_0x0698
            goto L_0x06b1
        L_0x06b0:
            r3 = r9
        L_0x06b1:
            coc r3 = (defpackage.coc) r3
            if (r3 == 0) goto L_0x06b7
            java.lang.String r9 = r3.b
        L_0x06b7:
            znc r2 = r0.getRouter()
            java.util.ArrayList r2 = r2.e()
            znc r3 = r0.getRouter()
            java.util.ArrayList r3 = r3.e()
            int r3 = defpackage.y53.L(r3)
            int r3 = r3 - r7
            java.lang.Object r2 = defpackage.x53.j0(r3, r2)
            coc r2 = (defpackage.coc) r2
            if (r9 == 0) goto L_0x06f0
            int r3 = r9.length()
            if (r3 != 0) goto L_0x06db
            goto L_0x06f0
        L_0x06db:
            if (r2 == 0) goto L_0x06e8
            java.lang.String r2 = r2.b
            if (r2 == 0) goto L_0x06e8
            boolean r1 = defpackage.w9e.p0(r2, r1, r8)
            if (r1 != r7) goto L_0x06e8
            goto L_0x06f0
        L_0x06e8:
            znc r0 = r0.getRouter()
            r0.D(r9)
            goto L_0x06f7
        L_0x06f0:
            znc r0 = r0.getRouter()
            r0.C()
        L_0x06f7:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x06fa:
            r1 = r33
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            cla r0 = (defpackage.cla) r0
            bc7[] r2 = one.me.stickerspreview.StickerPreviewScreen.A0
            r0.setTitle((java.lang.CharSequence) r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x070e:
            r1 = r33
            z2e r1 = (defpackage.z2e) r1
            r3 = r34
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r0.a
            one.me.stickerspreview.StickerPreviewScreen r0 = (one.me.stickerspreview.StickerPreviewScreen) r0
            if (r1 != 0) goto L_0x0723
            bc7[] r1 = one.me.stickerspreview.StickerPreviewScreen.A0
            r0.getClass()
            goto L_0x083e
        L_0x0723:
            gw7 r3 = r0.Z
            q7c r4 = r0.u0
            gic r5 = r0.y0
            gic r7 = r0.x0
            gic r9 = r0.z0
            r10 = 160(0xa0, float:2.24E-43)
            java.lang.String r11 = r1.Y
            if (r11 == 0) goto L_0x0786
            int r11 = r11.length()
            if (r11 != 0) goto L_0x073a
            goto L_0x0786
        L_0x073a:
            java.lang.Object r9 = r9.getValue()
            a4g r9 = (defpackage.a4g) r9
            bc7[] r11 = one.me.stickerspreview.StickerPreviewScreen.A0
            r2 = r11[r2]
            java.lang.Object r2 = r4.T0(r0, r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            defpackage.ay7.b(r2, r9, -1)
            float r2 = (float) r10
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r2 = defpackage.tu0.G(r2)
            r9.a(r1, r2)
            r9.setVisibility(r8)
            r9.b(r3)
            boolean r2 = defpackage.br7.H(r7)
            if (r2 == 0) goto L_0x0775
            java.lang.Object r2 = r7.getValue()
            i2e r2 = (defpackage.i2e) r2
            r2.setVisibility(r6)
        L_0x0775:
            boolean r2 = defpackage.br7.H(r5)
            if (r2 == 0) goto L_0x0813
            java.lang.Object r2 = r5.getValue()
            iw7 r2 = (defpackage.iw7) r2
            r2.setVisibility(r6)
            goto L_0x0813
        L_0x0786:
            java.lang.String r11 = r1.X
            if (r11 == 0) goto L_0x07dc
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0791
            goto L_0x07dc
        L_0x0791:
            java.lang.Object r5 = r5.getValue()
            iw7 r5 = (defpackage.iw7) r5
            bc7[] r11 = one.me.stickerspreview.StickerPreviewScreen.A0
            r2 = r11[r2]
            java.lang.Object r2 = r4.T0(r0, r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            defpackage.ay7.b(r2, r5, -1)
            float r2 = (float) r10
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r2 = defpackage.tu0.G(r2)
            r5.a(r1, r2)
            r5.setVisibility(r8)
            r5.b(r3)
            boolean r2 = defpackage.br7.H(r7)
            if (r2 == 0) goto L_0x07cc
            java.lang.Object r2 = r7.getValue()
            i2e r2 = (defpackage.i2e) r2
            r2.setVisibility(r6)
        L_0x07cc:
            boolean r2 = defpackage.br7.H(r9)
            if (r2 == 0) goto L_0x0813
            java.lang.Object r2 = r9.getValue()
            a4g r2 = (defpackage.a4g) r2
            r2.setVisibility(r6)
            goto L_0x0813
        L_0x07dc:
            java.lang.Object r3 = r7.getValue()
            i2e r3 = (defpackage.i2e) r3
            bc7[] r7 = one.me.stickerspreview.StickerPreviewScreen.A0
            r2 = r7[r2]
            java.lang.Object r2 = r4.T0(r0, r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            defpackage.ay7.b(r2, r3, -1)
            r3.a(r1)
            r3.setVisibility(r8)
            boolean r2 = defpackage.br7.H(r9)
            if (r2 == 0) goto L_0x0804
            java.lang.Object r2 = r9.getValue()
            a4g r2 = (defpackage.a4g) r2
            r2.setVisibility(r6)
        L_0x0804:
            boolean r2 = defpackage.br7.H(r5)
            if (r2 == 0) goto L_0x0813
            java.lang.Object r2 = r5.getValue()
            iw7 r2 = (defpackage.iw7) r2
            r2.setVisibility(r6)
        L_0x0813:
            bc7[] r2 = one.me.stickerspreview.StickerPreviewScreen.A0
            r3 = 6
            r4 = r2[r3]
            q7c r5 = r0.v0
            java.lang.Object r4 = r5.T0(r0, r4)
            as6 r4 = (defpackage.as6) r4
            boolean r1 = r1.v0
            if (r1 == 0) goto L_0x0827
            int r6 = defpackage.woc.K
            goto L_0x0829
        L_0x0827:
            int r6 = defpackage.woc.J
        L_0x0829:
            r4.setIcon(r6)
            r2 = r2[r3]
            java.lang.Object r0 = r5.T0(r0, r2)
            as6 r0 = (defpackage.as6) r0
            if (r1 == 0) goto L_0x0839
            int r1 = defpackage.cja.c
            goto L_0x083b
        L_0x0839:
            int r1 = defpackage.cja.a
        L_0x083b:
            r0.setLabel(r1)
        L_0x083e:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0841:
            r1 = r33
            l17 r1 = (defpackage.l17) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            bud r0 = (defpackage.bud) r0
            r0.getClass()
            if (r1 == 0) goto L_0x088b
            ptd r1 = (defpackage.ptd) r1
            eg3 r1 = r1.H0
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = -1054867456(0xffffffffc1200000, float:-10.0)
            float r2 = r2 * r3
            android.view.ViewPropertyAnimator r2 = r1.translationY(r2)
            r3 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            je7 r3 = r0.b
            java.lang.Object r3 = r3.getValue()
            android.view.animation.AccelerateDecelerateInterpolator r3 = (android.view.animation.AccelerateDecelerateInterpolator) r3
            android.view.ViewPropertyAnimator r2 = r2.setInterpolator(r3)
            flc r3 = new flc
            r4 = 20
            r3.<init>(r1, r4, r0)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r3)
            r0.start()
        L_0x088b:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x088e:
            r1 = r33
            java.util.List r1 = (java.util.List) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            hid r0 = (defpackage.hid) r0
            bc7[] r2 = one.me.settings.storage.ui.SettingsStorageScreen.X
            r0.E(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x08a2:
            r1 = r33
            java.util.List r1 = (java.util.List) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            chd r0 = (defpackage.chd) r0
            bc7[] r2 = one.me.settings.privacy.ui.SettingsPrivacyScreen.Z
            r0.E(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x08b6:
            r1 = r33
            java.util.List r1 = (java.util.List) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            lgd r0 = (defpackage.lgd) r0
            bc7[] r2 = one.me.settings.media.ui.SettingMediaScreen.Y
            r0.E(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x08ca:
            r1 = r33
            java.util.List r1 = (java.util.List) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            kjb r0 = (defpackage.kjb) r0
            int r2 = one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen.o
            r0.E(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x08de:
            r1 = r33
            gz3 r1 = (defpackage.gz3) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            jib r0 = (defpackage.jib) r0
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.y0
            boolean r2 = r2.compareAndSet(r8, r7)
            if (r2 != 0) goto L_0x08f3
            goto L_0x0960
        L_0x08f3:
            e52 r2 = r0.r()
            if (r2 != 0) goto L_0x08fa
            goto L_0x0960
        L_0x08fa:
            r0.q(r2)
            ez3 r2 = defpackage.ez3.a
            boolean r2 = defpackage.tpa.f(r1, r2)
            s35 r0 = r0.C0
            if (r2 == 0) goto L_0x0930
            mhb r1 = new mhb
            int r2 = defpackage.yea.f1
            eqe r4 = new eqe
            r4.<init>(r2)
            int r2 = defpackage.yea.d1
            eqe r5 = new eqe
            r5.<init>(r2)
            mg3 r2 = new mg3
            int r6 = defpackage.wea.N
            int r7 = defpackage.yea.c1
            eqe r9 = new eqe
            r9.<init>(r7)
            r2.<init>(r6, r9, r3, r8)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r4, r5, r2)
            defpackage.pnf.o(r0, r1)
            goto L_0x0960
        L_0x0930:
            fz3 r2 = defpackage.fz3.a
            boolean r1 = defpackage.tpa.f(r1, r2)
            if (r1 == 0) goto L_0x0963
            mhb r1 = new mhb
            int r2 = defpackage.yea.f1
            eqe r4 = new eqe
            r4.<init>(r2)
            int r2 = defpackage.yea.e1
            eqe r5 = new eqe
            r5.<init>(r2)
            mg3 r2 = new mg3
            int r6 = defpackage.wea.N
            int r7 = defpackage.yea.c1
            eqe r9 = new eqe
            r9.<init>(r7)
            r2.<init>(r6, r9, r3, r8)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r4, r5, r2)
            defpackage.pnf.o(r0, r1)
        L_0x0960:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0963:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0969:
            r1 = r33
            java.util.List r1 = (java.util.List) r1
            r2 = r34
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.a
            xhb r0 = (defpackage.xhb) r0
            bc7[] r2 = one.me.profile.screens.invite.ProfileInviteScreen.Y
            r0.E(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shb.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
