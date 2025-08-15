package defpackage;

import android.content.Context;

/* renamed from: cb5  reason: default package */
public final class cb5 implements nb5 {
    public static final /* synthetic */ bc7[] i;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f = tu0.r(3, new za5(this, 0));
    public xg1 g;
    public final w4d h = mqd.D();

    static {
        oi9 oi9 = new oi9(cb5.class, "pipStateJob", "getPipStateJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9};
    }

    public cb5(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je73;
        this.b = je74;
        this.c = je7;
        this.d = je72;
        this.e = je75;
    }

    public final xg1 a(Context context, znc znc) {
        xg1 xg1 = new xg1(context);
        xg1.setPipTheme(qp4.u0.p(xg1).c);
        xg1.setPipMode(ug1.c);
        xg1.setApplicationPipDepended(new qz7((Object) this, 18, (Object) xg1));
        xg1.setListener(new ab5(znc));
        xg1.setVideoLayoutUpdatesControllerProvider(new za5(this, 1));
        return xg1;
    }

    public final t1b b() {
        return (t1b) this.f.getValue();
    }

    public final void c(long j) {
        hm9.m("FakePipController", "try to hide local pip", new Object[0]);
        xg1 xg1 = this.g;
        if (xg1 != null) {
            if (!ft.l(xg1)) {
                hm9.m("FakePipController", "local pip in hidden progress", new Object[0]);
                return;
            }
            String str = ((wr1) ((kr1) this.e.getValue())).k().c;
            w1e w1e = (w1e) ((tg1) this.a.getValue());
            q0e q0e = w1e.a;
            if (q0e.getValue() == v1e.b) {
                w1e.a(str, false);
            }
            q0e.m((Object) null, v1e.a);
            ft.f(xg1, false, j, new ga(this, 13, xg1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r8 = r8.getContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.app.Activity r7, defpackage.znc r8) {
        /*
            r6 = this;
            java.lang.String r0 = "FakePipController"
            java.lang.String r1 = "start preparing local pip"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            xg1 r1 = r6.g     // Catch:{ IllegalArgumentException -> 0x0011 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r6 = "local pip already prepared"
            defpackage.hm9.m(r0, r6, new java.lang.Object[0])     // Catch:{ IllegalArgumentException -> 0x0011 }
            return
        L_0x0011:
            r6 = move-exception
            goto L_0x009c
        L_0x0014:
            xg1 r7 = r6.a(r7, r8)     // Catch:{ IllegalArgumentException -> 0x0011 }
            r6.g = r7     // Catch:{ IllegalArgumentException -> 0x0011 }
            r8 = 0
            r7.setAlpha(r8)     // Catch:{ IllegalArgumentException -> 0x0011 }
            t1b r8 = r6.b()     // Catch:{ IllegalArgumentException -> 0x0011 }
            w7c r8 = r8.X     // Catch:{ IllegalArgumentException -> 0x0011 }
            j0e r8 = r8.a     // Catch:{ IllegalArgumentException -> 0x0011 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IllegalArgumentException -> 0x0011 }
            qma r8 = (defpackage.qma) r8     // Catch:{ IllegalArgumentException -> 0x0011 }
            r7.d(r8)     // Catch:{ IllegalArgumentException -> 0x0011 }
            xg1 r8 = r6.g     // Catch:{ IllegalArgumentException -> 0x0011 }
            r1 = 0
            if (r8 == 0) goto L_0x003f
            android.content.Context r8 = r8.getContext()     // Catch:{ IllegalArgumentException -> 0x0011 }
            if (r8 == 0) goto L_0x003f
            android.view.WindowManager r8 = defpackage.nd7.z(r8)     // Catch:{ IllegalArgumentException -> 0x0011 }
            goto L_0x0040
        L_0x003f:
            r8 = r1
        L_0x0040:
            if (r8 == 0) goto L_0x006b
            android.view.WindowManager$LayoutParams r2 = r7.getWindowsViewLayoutParams()     // Catch:{ IllegalArgumentException -> 0x0011 }
            je7 r3 = r6.b     // Catch:{ IllegalArgumentException -> 0x0011 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ IllegalArgumentException -> 0x0011 }
            aa1 r3 = (defpackage.aa1) r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            ba1 r3 = (defpackage.ba1) r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            r3.getClass()     // Catch:{ IllegalArgumentException -> 0x0011 }
            android.graphics.PointF r4 = new android.graphics.PointF     // Catch:{ IllegalArgumentException -> 0x0011 }
            android.graphics.PointF r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x0011 }
            float r5 = r3.x     // Catch:{ IllegalArgumentException -> 0x0011 }
            float r3 = r3.y     // Catch:{ IllegalArgumentException -> 0x0011 }
            r4.<init>(r5, r3)     // Catch:{ IllegalArgumentException -> 0x0011 }
            float r3 = r4.x     // Catch:{ IllegalArgumentException -> 0x0011 }
            int r3 = (int) r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            r2.x = r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            float r3 = r4.y     // Catch:{ IllegalArgumentException -> 0x0011 }
            int r3 = (int) r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            r2.y = r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            r8.addView(r7, r2)     // Catch:{ IllegalArgumentException -> 0x0011 }
        L_0x006b:
            t1b r8 = r6.b()     // Catch:{ IllegalArgumentException -> 0x0011 }
            r8.c = r7     // Catch:{ IllegalArgumentException -> 0x0011 }
            je7 r7 = r6.c     // Catch:{ IllegalArgumentException -> 0x0011 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ IllegalArgumentException -> 0x0011 }
            jr1 r7 = (defpackage.jr1) r7     // Catch:{ IllegalArgumentException -> 0x0011 }
            je7 r8 = r6.d     // Catch:{ IllegalArgumentException -> 0x0011 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IllegalArgumentException -> 0x0011 }
            kke r8 = (defpackage.kke) r8     // Catch:{ IllegalArgumentException -> 0x0011 }
            w9a r8 = (defpackage.w9a) r8     // Catch:{ IllegalArgumentException -> 0x0011 }
            cx7 r8 = r8.c()     // Catch:{ IllegalArgumentException -> 0x0011 }
            bb5 r2 = new bb5     // Catch:{ IllegalArgumentException -> 0x0011 }
            r2.<init>(r6, r1)     // Catch:{ IllegalArgumentException -> 0x0011 }
            r3 = 2
            vxd r7 = defpackage.j47.T(r7, r8, r1, r2, r3)     // Catch:{ IllegalArgumentException -> 0x0011 }
            bc7[] r8 = i     // Catch:{ IllegalArgumentException -> 0x0011 }
            r1 = 0
            r8 = r8[r1]     // Catch:{ IllegalArgumentException -> 0x0011 }
            w4d r1 = r6.h     // Catch:{ IllegalArgumentException -> 0x0011 }
            r1.o1(r6, r8, r7)     // Catch:{ IllegalArgumentException -> 0x0011 }
            goto L_0x00a1
        L_0x009c:
            java.lang.String r7 = "can't prepare local pip"
            defpackage.hm9.p(r0, r7, r6)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb5.d(android.app.Activity, znc):void");
    }
}
