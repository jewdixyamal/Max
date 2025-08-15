package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ft1  reason: default package */
public final class ft1 implements ct1 {
    public static final /* synthetic */ bc7[] f;
    public final jr1 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final w4d e = mqd.D();

    static {
        oi9 oi9 = new oi9(ft1.class, "tokenRefreshJob", "getTokenRefreshJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        f = new bc7[]{oi9};
    }

    public ft1(jr1 jr1, je7 je7, je7 je72, je7 je73) {
        this.a = jr1;
        this.b = je7;
        this.c = je72;
        this.d = je73;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.dt1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            dt1 r0 = (defpackage.dt1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            dt1 r0 = new dt1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            java.lang.String r3 = "app.calls.update_time"
            r4 = 1
            java.lang.String r5 = "CallsCredRepositoryTag"
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            ft1 r10 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x00c4
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            defpackage.od2.a0(r11)
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            boolean r11 = r11.isCurrentThread()
            if (r11 == 0) goto L_0x0058
            je7 r11 = r10.d
            java.lang.Object r11 = r11.getValue()
            x6a r11 = (defpackage.x6a) r11
            r11.getClass()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r2 = "Call token was called from the main thread."
            r11.<init>(r2)
            defpackage.hm9.l0(r5, r2, r11)
        L_0x0058:
            je7 r11 = r10.b
            java.lang.Object r2 = r11.getValue()
            q33 r2 = (defpackage.q33) r2
            hyc r2 = (defpackage.hyc) r2
            long r6 = r2.n()
            java.lang.Object r11 = r11.getValue()
            q33 r11 = (defpackage.q33) r11
            hyc r11 = (defpackage.hyc) r11
            ne7 r11 = r11.g
            r8 = 0
            long r8 = r11.getLong(r3, r8)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x00fc
            je7 r11 = r10.c
            java.lang.Object r11 = r11.getValue()
            w7a r11 = (defpackage.w7a) r11
            r0.o = r10
            r0.Z = r4
            je7 r2 = r11.a
            java.lang.Object r2 = r2.getValue()
            ome r2 = (defpackage.ome) r2
            au r4 = new au
            je7 r6 = r11.c
            java.lang.Object r6 = r6.getValue()
            f5a r6 = (defpackage.f5a) r6
            java.lang.String r6 = r6.f()
            if (r6 == 0) goto L_0x00f0
            je7 r11 = r11.b
            java.lang.Object r11 = r11.getValue()
            q33 r11 = (defpackage.q33) r11
            hyc r11 = (defpackage.hyc) r11
            long r7 = r11.t()
            sla r11 = defpackage.sla.CALLS_TOKEN
            r9 = 11
            r4.<init>((defpackage.sla) r11, (int) r9)
            java.lang.String r11 = "value"
            r4.p(r11, r6)
            java.lang.String r11 = "userId"
            r4.i(r7, r11)
            java.lang.Object r11 = r2.e(r4, r0)
            if (r11 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            fn1 r11 = (defpackage.fn1) r11
            je7 r0 = r10.b
            java.lang.Object r0 = r0.getValue()
            q33 r0 = (defpackage.q33) r0
            java.lang.String r1 = r11.c
            hyc r0 = (defpackage.hyc) r0
            java.lang.String r2 = "user.callsToken"
            r0.m(r2, r1)
            je7 r10 = r10.b
            java.lang.Object r10 = r10.getValue()
            q33 r10 = (defpackage.q33) r10
            hyc r10 = (defpackage.hyc) r10
            long r0 = r11.X
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r10.l(r3, r11)
            java.lang.String r10 = "Calls token updated."
            defpackage.hm9.m(r5, r10, new java.lang.Object[0])
            goto L_0x0112
        L_0x00f0:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Required value was null."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00fc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Calls token will be expired in "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r11 = "."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            defpackage.hm9.m(r5, r10, new java.lang.Object[0])
        L_0x0112:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        bc7[] bc7Arr = f;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.e;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 == null || !x77.isActive()) {
            w4d.o1(this, bc7Arr[0], j47.T(this.a, (lx3) null, (vx3) null, new et1(this, (Continuation) null), 3));
        }
    }
}
