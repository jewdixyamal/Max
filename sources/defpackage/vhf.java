package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: vhf  reason: default package */
public final class vhf {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final String g = vhf.class.getName();
    public final ContextScope h;
    public final ConcurrentHashMap.KeySetView i;
    public final kld j;
    public final v7c k;

    public vhf(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je77;
        this.h = j1e.a(((w9a) ((kke) je76.getValue())).b().plus(f46.a()));
        this.i = ConcurrentHashMap.newKeySet();
        kld b2 = lld.b(0, 0, 0, 7);
        this.j = b2;
        this.k = new v7c(b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.vhf r22, long r23, long r25, kotlin.coroutines.Continuation r27) {
        /*
            r0 = r22
            r1 = r23
            r3 = r25
            r5 = r27
            boolean r6 = r5 instanceof defpackage.shf
            if (r6 == 0) goto L_0x001c
            r6 = r5
            shf r6 = (defpackage.shf) r6
            int r7 = r6.w0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001c
            int r7 = r7 - r8
            r6.w0 = r7
        L_0x001a:
            r14 = r6
            goto L_0x0022
        L_0x001c:
            shf r6 = new shf
            r6.<init>(r0, r5)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r5 = r14.u0
            tx3 r6 = defpackage.tx3.a
            int r7 = r14.w0
            r8 = 2
            r13 = 3
            r9 = 1
            if (r7 == 0) goto L_0x0072
            if (r7 == r9) goto L_0x005a
            if (r7 == r8) goto L_0x0046
            if (r7 != r13) goto L_0x003e
            long r0 = r14.s0
            long r2 = r14.Z
            vhf r4 = r14.o
            defpackage.od2.a0(r5)
            goto L_0x021b
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            boolean r0 = r14.t0
            long r1 = r14.s0
            long r3 = r14.Z
            l20 r7 = r14.Y
            java.lang.Object r8 = r14.X
            cu8 r8 = (defpackage.cu8) r8
            vhf r9 = r14.o
            defpackage.od2.a0(r5)
            r15 = r13
            goto L_0x01a1
        L_0x005a:
            long r0 = r14.s0
            long r2 = r14.Z
            java.lang.Object r4 = r14.X
            e52 r4 = (defpackage.e52) r4
            vhf r7 = r14.o
            defpackage.od2.a0(r5)
            r19 = r7
            r7 = r4
            r20 = r0
            r0 = r5
            r4 = r20
            r1 = r19
            goto L_0x00b3
        L_0x0072:
            defpackage.od2.a0(r5)
            je7 r5 = r0.a
            java.lang.Object r5 = r5.getValue()
            iy2 r5 = (defpackage.iy2) r5
            jz2 r5 = (defpackage.jz2) r5
            w7c r5 = r5.m(r1)
            j0e r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            e52 r5 = (defpackage.e52) r5
            if (r5 != 0) goto L_0x0091
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L_0x022a
        L_0x0091:
            je7 r7 = r0.b
            java.lang.Object r7 = r7.getValue()
            r79 r7 = (defpackage.r79) r7
            r14.o = r0
            r14.X = r5
            r14.Z = r1
            r14.s0 = r3
            r14.w0 = r9
            java.lang.Object r7 = r7.a(r3, r14)
            if (r7 != r6) goto L_0x00ab
            goto L_0x022a
        L_0x00ab:
            r19 = r1
            r1 = r0
            r0 = r7
            r7 = r5
            r4 = r3
            r2 = r19
        L_0x00b3:
            r11 = r0
            cu8 r11 = (defpackage.cu8) r11
            if (r11 != 0) goto L_0x00bc
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L_0x022a
        L_0x00bc:
            g20 r0 = defpackage.g20.o
            l20 r12 = r11.a(r0)
            if (r12 != 0) goto L_0x00c8
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L_0x022a
        L_0x00c8:
            k20 r0 = r12.d
            r1.getClass()
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.b
            goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            if (r0 != r8) goto L_0x00d8
            r16 = r9
            goto L_0x00da
        L_0x00d8:
            r16 = 0
        L_0x00da:
            je7 r0 = r1.e
            java.lang.Object r0 = r0.getValue()
            zi5 r0 = (defpackage.zi5) r0
            java.lang.String r10 = r12.s
            kk5 r0 = (defpackage.kk5) r0
            java.io.File r0 = r0.i(r10)
            boolean r10 = r0.exists()     // Catch:{ all -> 0x00f8 }
            if (r10 == 0) goto L_0x00fa
            boolean r0 = r0.canRead()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00fa
            r0 = r9
            goto L_0x00fb
        L_0x00f8:
            r0 = move-exception
            goto L_0x0100
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00f8 }
            goto L_0x0106
        L_0x0100:
            njc r10 = new njc
            r10.<init>(r0)
            r0 = r10
        L_0x0106:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            boolean r13 = r0 instanceof defpackage.njc
            if (r13 == 0) goto L_0x010d
            r0 = r10
        L_0x010d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ r9
            if (r16 == 0) goto L_0x012e
            if (r0 == 0) goto L_0x012e
            d20 r0 = r12.o
            boolean r10 = r0.e()
            if (r10 != 0) goto L_0x0126
            boolean r10 = r0.b()
            if (r10 == 0) goto L_0x012e
        L_0x0126:
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x012e
            r0 = r9
            goto L_0x012f
        L_0x012e:
            r0 = 0
        L_0x012f:
            je7 r9 = r1.c
            java.lang.Object r9 = r9.getValue()
            rff r9 = (defpackage.rff) r9
            java.lang.String r10 = r12.r
            ief r9 = r9.e
            r9.getClass()
            gef r9 = defpackage.ief.a(r10)
            if (r9 != 0) goto L_0x01a8
            java.lang.String r9 = r1.g
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x014b
            goto L_0x0163
        L_0x014b:
            boolean r13 = r10.c()
            if (r13 == 0) goto L_0x0163
            us7 r13 = defpackage.us7.X
            r22 = r9
            long r8 = r11.c
            java.lang.String r15 = "Load video content for video message id="
            java.lang.String r8 = defpackage.ey8.h(r8, r15)
            r15 = r22
            r9 = 0
            r10.d(r13, r15, r8, r9)
        L_0x0163:
            je7 r8 = r1.c
            java.lang.Object r8 = r8.getValue()
            rff r8 = (defpackage.rff) r8
            k92 r7 = r7.b
            long r9 = r7.a
            r22 = r9
            long r9 = r11.c
            r14.o = r1
            r14.X = r11
            r14.Y = r12
            r14.Z = r2
            r14.s0 = r4
            r14.t0 = r0
            r7 = 2
            r14.w0 = r7
            r7 = r8
            r8 = r12
            r15 = r9
            r9 = r22
            r17 = r11
            r18 = r12
            r11 = r15
            r15 = 3
            r13 = r14
            java.lang.Object r7 = r7.c(r8, r9, r11, r13)
            if (r7 != r6) goto L_0x0196
            goto L_0x022a
        L_0x0196:
            r9 = r1
            r8 = r17
            r19 = r4
            r5 = r7
            r3 = r2
            r1 = r19
            r7 = r18
        L_0x01a1:
            gef r5 = (defpackage.gef) r5
            r13 = r5
            r12 = r7
            r11 = r8
            r5 = r9
            goto L_0x01b4
        L_0x01a8:
            r17 = r11
            r18 = r12
            r15 = 3
            r13 = r9
            r19 = r4
            r5 = r1
            r3 = r2
            r1 = r19
        L_0x01b4:
            if (r13 != 0) goto L_0x01d4
            java.lang.String r0 = r5.g
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x01bd
            goto L_0x01d1
        L_0x01bd:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01d1
            us7 r2 = defpackage.us7.Z
            long r3 = r11.c
            java.lang.String r5 = "We couldn't fetch a video content for a message id="
            java.lang.String r3 = defpackage.ey8.h(r3, r5)
            r4 = 0
            r1.d(r2, r0, r3, r4)
        L_0x01d1:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L_0x022a
        L_0x01d4:
            if (r0 != 0) goto L_0x01e2
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r5.i
            java.lang.String r1 = c(r3, r1)
            r0.remove(r1)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            goto L_0x022a
        L_0x01e2:
            java.lang.String r0 = r5.g
            ir6 r7 = defpackage.hm9.m
            if (r7 != 0) goto L_0x01ea
        L_0x01e8:
            r10 = 0
            goto L_0x01fe
        L_0x01ea:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x01e8
            us7 r8 = defpackage.us7.X
            long r9 = r11.c
            java.lang.String r11 = "Start downloading video file for video message id="
            java.lang.String r9 = defpackage.ey8.h(r9, r11)
            r10 = 0
            r7.d(r8, r0, r9, r10)
        L_0x01fe:
            r14.o = r5
            r14.X = r10
            r14.Y = r10
            r14.Z = r3
            r14.s0 = r1
            r14.w0 = r15
            r7 = r5
            r8 = r3
            r10 = r1
            java.lang.Object r0 = r7.b(r8, r10, r12, r13, r14)
            if (r0 != r6) goto L_0x0214
            goto L_0x022a
        L_0x0214:
            r19 = r5
            r5 = r0
            r0 = r1
            r2 = r3
            r4 = r19
        L_0x021b:
            r6 = r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = r4.i
            java.lang.String r0 = c(r2, r0)
            r4.remove(r0)
        L_0x022a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhf.a(vhf, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static String c(long j2, long j3) {
        return j2 + ":" + j3;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [one, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r16, long r18, defpackage.l20 r20, defpackage.gef r21, kotlin.coroutines.Continuation r22) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            r2 = r22
            boolean r3 = r2 instanceof defpackage.phf
            if (r3 == 0) goto L_0x0018
            r3 = r2
            phf r3 = (defpackage.phf) r3
            int r4 = r3.u0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0018
            int r4 = r4 - r5
            r3.u0 = r4
            goto L_0x001d
        L_0x0018:
            phf r3 = new phf
            r3.<init>(r15, r2)
        L_0x001d:
            java.lang.Object r2 = r3.s0
            tx3 r12 = defpackage.tx3.a
            int r4 = r3.u0
            r13 = 2
            r14 = 1
            if (r4 == 0) goto L_0x0046
            if (r4 == r14) goto L_0x0038
            if (r4 != r13) goto L_0x0030
            defpackage.od2.a0(r2)
            goto L_0x00b2
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            long r0 = r3.Z
            gef r4 = r3.Y
            l20 r5 = r3.X
            vhf r6 = r3.o
            defpackage.od2.a0(r2)
            r1 = r0
            r0 = r6
            goto L_0x0072
        L_0x0046:
            defpackage.od2.a0(r2)
            je7 r2 = r0.f
            java.lang.Object r2 = r2.getValue()
            r4 = r2
            k6f r4 = (defpackage.k6f) r4
            java.lang.String r9 = r1.r
            d20 r10 = defpackage.d20.X
            r3.o = r0
            r3.X = r1
            r2 = r21
            r3.Y = r2
            r7 = r18
            r3.Z = r7
            r3.u0 = r14
            r5 = r16
            r11 = r3
            java.lang.Object r4 = r4.a(r5, r7, r9, r10, r11)
            if (r4 != r12) goto L_0x006e
            return r12
        L_0x006e:
            r5 = r1
            r4 = r2
            r1 = r18
        L_0x0072:
            long r6 = r4.e()
            one r8 = new one
            r8.<init>()
            r8.a = r1
            java.lang.String r1 = r5.r
            r8.b = r1
            r8.c = r6
            android.net.Uri r1 = r4.l()
            java.lang.String r1 = r1.toString()
            r8.g = r1
            r8.h = r14
            r8.n = r14
            pne r1 = new pne
            r1.<init>(r8)
            je7 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            rf5 r2 = (defpackage.rf5) r2
            t03 r1 = r2.a(r1)
            r2 = 0
            r3.o = r2
            r3.X = r2
            r3.Y = r2
            r3.u0 = r13
            java.lang.Enum r2 = r0.d(r1, r3)
            if (r2 != r12) goto L_0x00b2
            return r12
        L_0x00b2:
            m7g r0 = defpackage.m7g.c
            if (r2 != r0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r14 = 0
        L_0x00b8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhf.b(long, long, l20, gef, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [a66, ffe] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Enum d(defpackage.t03 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.thf
            if (r0 == 0) goto L_0x0013
            r0 = r6
            thf r0 = (defpackage.thf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            thf r0 = new thf
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r4 = r0.o
            tx3 r6 = defpackage.tx3.a
            int r1 = r0.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r3) goto L_0x0028
            defpackage.od2.a0(r4)
            goto L_0x0042
        L_0x0028:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0030:
            defpackage.od2.a0(r4)
            uhf r4 = new uhf
            r1 = 2
            r4.<init>(r1, r2)
            r0.Y = r3
            java.lang.Object r4 = defpackage.od2.z(r5, r4, r0)
            if (r4 != r6) goto L_0x0042
            return r6
        L_0x0042:
            n7g r4 = (defpackage.n7g) r4
            if (r4 == 0) goto L_0x0048
            m7g r2 = r4.b
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhf.d(t03, kotlin.coroutines.Continuation):java.lang.Enum");
    }
}
