package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: c67  reason: default package */
public final class c67 extends pnf implements dh3 {
    public static final yxc E0 = new yxc(12);
    public static final /* synthetic */ bc7[] F0;
    public final w4d A0;
    public final w4d B0;
    public final qec C0;
    public int D0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final /* synthetic */ snf b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final s35 t0 = new s35(0);
    public final s35 u0 = new s35(0);
    public final kld v0;
    public final m32 w0;
    public final q0e x0;
    public final w7c y0;
    public final w4d z0;

    static {
        Class<c67> cls = c67.class;
        F0 = new bc7[]{new oi9(cls, "findContactByPhoneJob", "getFindContactByPhoneJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;"), new oi9(cls, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;")};
    }

    public c67() {
        c57 c57 = c57.a;
        khe d = c57.getAccessor().d(ib6.class);
        khe d2 = c57.getAccessor().d(oc6.class);
        khe d3 = c57.getAccessor().d(zua.class);
        khe d4 = c57.getAccessor().d(iy2.class);
        khe d5 = c57.getAccessor().d(blb.class);
        khe d6 = c57.getAccessor().d(gh3.class);
        khe d7 = c57.getAccessor().d(kke.class);
        khe d8 = c57.getAccessor().d(q33.class);
        snf snf = new snf(d6, new g27(5));
        this.b = snf;
        this.c = d;
        this.o = d2;
        this.X = d4;
        this.Y = d5;
        this.Z = d7;
        this.s0 = d8;
        kld b2 = lld.b(0, 0, 0, 7);
        this.v0 = b2;
        this.w0 = od2.N(b2, new t03(snf.o, 11));
        q0e a = r0e.a(daa.b);
        this.x0 = a;
        sb1 sb1 = new sb1(a, this, d7, d3, 3);
        my3 my3 = new my3((eaa) a.getValue(), Integer.MAX_VALUE, new eqe(hca.i));
        this.y0 = od2.X(sb1, this.a, wld.a, my3);
        this.z0 = mqd.D();
        this.A0 = mqd.D();
        this.B0 = mqd.D();
        this.C0 = new qec("[^0-9+]");
        this.D0 = Integer.MAX_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.c67 r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof defpackage.t57
            if (r0 == 0) goto L_0x0013
            r0 = r9
            t57 r0 = (defpackage.t57) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            t57 r0 = new t57
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.o
            jqe r6 = (defpackage.jqe) r6
            defpackage.od2.a0(r9)
            goto L_0x0095
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            java.lang.Object r6 = r0.o
            c67 r6 = (defpackage.c67) r6
            defpackage.od2.a0(r9)
            goto L_0x006d
        L_0x003f:
            defpackage.od2.a0(r9)
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0052
            int r7 = defpackage.yoc.f0
            eqe r8 = new eqe
            r8.<init>(r7)
        L_0x004f:
            r7 = r6
            r6 = r8
            goto L_0x0081
        L_0x0052:
            int r8 = r7.length()
            int r9 = r6.D0
            if (r8 <= r9) goto L_0x0062
            int r7 = defpackage.yoc.g0
            eqe r8 = new eqe
            r8.<init>(r7)
            goto L_0x004f
        L_0x0062:
            r0.o = r6
            r0.Z = r4
            java.lang.Object r9 = r(r7, r6, r0)
            if (r9 != r1) goto L_0x006d
            goto L_0x009d
        L_0x006d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L_0x007d
            int r7 = defpackage.hca.d
            eqe r8 = new eqe
            r8.<init>(r7)
            goto L_0x004f
        L_0x007d:
            r7 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0081:
            if (r6 == 0) goto L_0x0095
            kld r7 = r7.v0
            g57 r8 = new g57
            r8.<init>(r6)
            r0.o = r6
            r0.Z = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x0095
            goto L_0x009d
        L_0x0095:
            if (r6 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r4 = 0
        L_0x0099:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c67.q(c67, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(java.lang.String r8, defpackage.c67 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.u57
            if (r0 == 0) goto L_0x0013
            r0 = r10
            u57 r0 = (defpackage.u57) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            u57 r0 = new u57
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            java.lang.Long r8 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x007c
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            defpackage.od2.a0(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r2 = r8.length()
            r5 = r4
        L_0x003f:
            if (r5 >= r2) goto L_0x0053
            char r6 = r8.charAt(r5)
            char r6 = (char) r6
            char r7 = (char) r6
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 == 0) goto L_0x0050
            r10.append(r6)
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x003f
        L_0x0053:
            java.lang.String r8 = r10.toString()
            java.lang.Long r8 = defpackage.dae.f0(r8)
            je7 r10 = r9.Y
            java.lang.Object r10 = r10.getValue()
            blb r10 = (defpackage.blb) r10
            je7 r9 = r9.s0
            java.lang.Object r9 = r9.getValue()
            q33 r9 = (defpackage.q33) r9
            hyc r9 = (defpackage.hyc) r9
            long r5 = r9.t()
            r0.o = r8
            r0.Y = r3
            java.lang.Object r10 = r10.a(r5, r0)
            if (r10 != r1) goto L_0x007c
            return r1
        L_0x007c:
            oab r10 = (defpackage.oab) r10
            uj3 r9 = r10.d
            long r9 = r9.o()
            if (r8 != 0) goto L_0x0087
            goto L_0x0090
        L_0x0087:
            long r0 = r8.longValue()
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r3 = r4
        L_0x0091:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c67.r(java.lang.String, c67, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final v7c f() {
        return this.b.o;
    }

    public final void p() {
        bc7[] bc7Arr = F0;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.z0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
        bc7 bc72 = bc7Arr[1];
        w4d w4d2 = this.A0;
        x77 x772 = (x77) w4d2.T0(this, bc72);
        if (x772 != null) {
            x772.cancel((CancellationException) null);
        }
        w4d2.o1(this, bc7Arr[1], (Object) null);
        bc7 bc73 = bc7Arr[2];
        w4d w4d3 = this.B0;
        x77 x773 = (x77) w4d3.T0(this, bc73);
        if (x773 != null) {
            x773.cancel((CancellationException) null);
        }
        w4d3.o1(this, bc7Arr[2], (Object) null);
    }
}
