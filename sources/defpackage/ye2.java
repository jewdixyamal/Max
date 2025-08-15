package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: ye2  reason: default package */
public final class ye2 extends pnf {
    public final xe2 A0 = new xe2(this);
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final Context b;
    public final kke c;
    public final qrc o;
    public final je7 s0;
    public final je7 t0;
    public final kld u0;
    public final v7c v0;
    public final q0e w0;
    public final w7c x0;
    public vxd y0;
    public final AtomicReference z0 = new AtomicReference((Object) null);

    public ye2(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, Context context, kke kke, qrc qrc) {
        this.b = context;
        this.c = kke;
        this.o = qrc;
        this.X = je7;
        this.Y = je72;
        this.Z = je73;
        this.s0 = je74;
        this.t0 = je75;
        kld a = lld.a(1, Integer.MAX_VALUE, 2);
        this.u0 = a;
        this.v0 = new v7c(a);
        q0e a2 = r0e.a(Float.valueOf(0.0f));
        this.w0 = a2;
        this.x0 = new w7c(a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.ye2 r22, java.lang.String r23, defpackage.k20 r24, defpackage.cu8 r25, kotlin.coroutines.Continuation r26) {
        /*
            r1 = r22
            r2 = r24
            r0 = r25
            r3 = r26
            boolean r4 = r3 instanceof defpackage.ve2
            if (r4 == 0) goto L_0x001c
            r4 = r3
            ve2 r4 = (defpackage.ve2) r4
            int r5 = r4.t0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.t0 = r5
        L_0x001a:
            r11 = r4
            goto L_0x0022
        L_0x001c:
            ve2 r4 = new ve2
            r4.<init>(r1, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r11.Z
            tx3 r4 = defpackage.tx3.a
            int r5 = r11.t0
            e5f r12 = defpackage.e5f.a
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0055
            if (r5 == r8) goto L_0x0043
            if (r5 == r7) goto L_0x003e
            if (r5 != r6) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            defpackage.od2.a0(r3)
            goto L_0x00bf
        L_0x0043:
            k20 r1 = r11.Y
            java.lang.String r2 = r11.X
            ye2 r5 = r11.o
            defpackage.od2.a0(r3)     // Catch:{ all -> 0x0050 }
            r0 = r3
            r3 = r1
            r1 = r5
            goto L_0x008c
        L_0x0050:
            r0 = move-exception
            r3 = r2
            r2 = r1
            r1 = r5
            goto L_0x009c
        L_0x0055:
            defpackage.od2.a0(r3)
            gs9 r3 = new gs9
            long r14 = r2.a
            long r6 = r0.t0
            long r8 = r0.c
            java.lang.String r0 = r2.m
            r13 = r3
            r15 = r14
            r14 = r0
            r17 = r6
            r19 = r8
            r13.<init>(r14, r15, r17, r19)
            we2 r0 = new we2     // Catch:{ all -> 0x0099 }
            r6 = 0
            r0.<init>(r1, r3, r6)     // Catch:{ all -> 0x0099 }
            r11.o = r1     // Catch:{ all -> 0x0099 }
            r3 = r23
            r11.X = r3     // Catch:{ all -> 0x0097 }
            r11.Y = r2     // Catch:{ all -> 0x0097 }
            r6 = 1
            r11.t0 = r6     // Catch:{ all -> 0x0097 }
            r6 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = defpackage.fp3.H(r6, r0, r11)     // Catch:{ all -> 0x0097 }
            if (r0 != r4) goto L_0x0087
            goto L_0x00f4
        L_0x0087:
            r21 = r3
            r3 = r2
            r2 = r21
        L_0x008c:
            zjf r0 = (defpackage.zjf) r0     // Catch:{ all -> 0x0090 }
            r9 = r2
            goto L_0x00a4
        L_0x0090:
            r0 = move-exception
            r21 = r3
            r3 = r2
            r2 = r21
            goto L_0x009c
        L_0x0097:
            r0 = move-exception
            goto L_0x009c
        L_0x0099:
            r0 = move-exception
            r3 = r23
        L_0x009c:
            njc r6 = new njc
            r6.<init>(r0)
            r9 = r3
            r0 = r6
            r3 = r2
        L_0x00a4:
            boolean r2 = r0 instanceof defpackage.njc
            if (r2 == 0) goto L_0x00a9
            r0 = 0
        L_0x00a9:
            zjf r0 = (defpackage.zjf) r0
            if (r0 != 0) goto L_0x00c1
            xe2 r0 = r1.A0
            r1 = 0
            r11.o = r1
            r11.X = r1
            r11.Y = r1
            r1 = 2
            r11.t0 = r1
            r0.a()
            if (r12 != r4) goto L_0x00bf
            goto L_0x00f4
        L_0x00bf:
            r4 = r12
            goto L_0x00f4
        L_0x00c1:
            java.util.Map r0 = r0.c
            java.lang.String r6 = defpackage.f46.H(r0)
            je7 r0 = r1.s0
            java.lang.Object r0 = r0.getValue()
            zi5 r0 = (defpackage.zi5) r0
            long r2 = r3.a
            kk5 r0 = (defpackage.kk5) r0
            java.io.File r7 = r0.s(r2)
            je7 r0 = r1.Y
            java.lang.Object r0 = r0.getValue()
            dfe r0 = (defpackage.dfe) r0
            r2 = 0
            r11.o = r2
            r11.X = r2
            r11.Y = r2
            r2 = 3
            r11.t0 = r2
            efe r5 = r0.a
            xe2 r8 = r1.A0
            r10 = 0
            java.lang.Object r0 = r5.a(r6, r7, r8, r9, r10, r11)
            if (r0 != r4) goto L_0x00bf
        L_0x00f4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye2.q(ye2, java.lang.String, k20, cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static int u(en4 en4, boolean z) {
        switch (en4.ordinal()) {
            case 0:
                return p0c.media_share_dialog_share_video_fail;
            case 1:
            case 3:
            case 5:
                return z ? p0c.media_share_dialog_download_media_fail_not_enough_space : p0c.media_share_dialog_download_media_fail;
            case 2:
                return p0c.media_share_dialog_share_photo_fail;
            case 4:
                return p0c.media_share_dialog_share_gif_fail;
            case 6:
                return p0c.media_share_dialog_share_file_fail;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void r() {
        pnf.n(this, ((w9a) this.c).b().plus(xq9.a), (vx3) null, new pe2(this, (Continuation) null), 2);
        vxd vxd = this.y0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(java.lang.String r12, defpackage.s10 r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.se2
            if (r0 == 0) goto L_0x0014
            r0 = r14
            se2 r0 = (defpackage.se2) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.t0 = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            se2 r0 = new se2
            r0.<init>(r11, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r7.Z
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.t0
            e5f r8 = defpackage.e5f.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x004b
            if (r1 == r4) goto L_0x003f
            if (r1 == r3) goto L_0x003b
            if (r1 != r2) goto L_0x0033
            defpackage.od2.a0(r14)
            goto L_0x00c1
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            defpackage.od2.a0(r14)
            goto L_0x0090
        L_0x003f:
            s10 r13 = r7.Y
            java.lang.String r12 = r7.X
            ye2 r11 = r7.o
            defpackage.od2.a0(r14)     // Catch:{ all -> 0x0049 }
            goto L_0x006e
        L_0x0049:
            r14 = move-exception
            goto L_0x0071
        L_0x004b:
            defpackage.od2.a0(r14)
            tq2 r14 = new tq2
            long r9 = r13.a
            r1 = 14
            r6 = 0
            r14.<init>(r9, r1, r6)
            te2 r1 = new te2     // Catch:{ all -> 0x0049 }
            r1.<init>(r11, r14, r5)     // Catch:{ all -> 0x0049 }
            r7.o = r11     // Catch:{ all -> 0x0049 }
            r7.X = r12     // Catch:{ all -> 0x0049 }
            r7.Y = r13     // Catch:{ all -> 0x0049 }
            r7.t0 = r4     // Catch:{ all -> 0x0049 }
            r9 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r14 = defpackage.fp3.H(r9, r1, r7)     // Catch:{ all -> 0x0049 }
            if (r14 != r0) goto L_0x006e
            return r0
        L_0x006e:
            yg5 r14 = (defpackage.yg5) r14     // Catch:{ all -> 0x0049 }
            goto L_0x0077
        L_0x0071:
            njc r1 = new njc
            r1.<init>(r14)
            r14 = r1
        L_0x0077:
            boolean r1 = r14 instanceof defpackage.njc
            if (r1 == 0) goto L_0x007c
            r14 = r5
        L_0x007c:
            yg5 r14 = (defpackage.yg5) r14
            if (r14 != 0) goto L_0x0091
            xe2 r11 = r11.A0
            r7.o = r5
            r7.X = r5
            r7.Y = r5
            r7.t0 = r3
            r11.a()
            if (r8 != r0) goto L_0x0090
            return r0
        L_0x0090:
            return r8
        L_0x0091:
            je7 r1 = r11.Y
            java.lang.Object r1 = r1.getValue()
            dfe r1 = (defpackage.dfe) r1
            java.lang.String r14 = r14.c
            je7 r3 = r11.s0
            java.lang.Object r3 = r3.getValue()
            zi5 r3 = (defpackage.zi5) r3
            java.lang.String r13 = r13.c
            kk5 r3 = (defpackage.kk5) r3
            java.io.File r3 = r3.i(r13)
            r7.o = r5
            r7.X = r5
            r7.Y = r5
            r7.t0 = r2
            efe r1 = r1.a
            xe2 r4 = r11.A0
            r6 = 0
            r2 = r14
            r5 = r12
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L_0x00c1
            return r0
        L_0x00c1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye2.s(java.lang.String, s10, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void t(boolean z) {
        ne2 ne2 = (ne2) this.z0.get();
        if (ne2 != null) {
            r();
            this.u0.g(new in4(u(ne2.d, z)));
        }
    }
}
