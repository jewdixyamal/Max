package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ps9  reason: default package */
public final class ps9 {
    public static final /* synthetic */ int h = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final ContextScope g;

    public ps9(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, kke kke, ox3 ox3) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
        this.g = j1e.a(((w9a) kke).b().limitedParallelism(1, "notif-msg-delayed-logic").plus(ox3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.ps9 r30, long r31, defpackage.fs8 r33, kotlin.coroutines.Continuation r34) {
        /*
            r0 = r30
            r1 = r34
            boolean r2 = r1 instanceof defpackage.os9
            if (r2 == 0) goto L_0x0017
            r2 = r1
            os9 r2 = (defpackage.os9) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.s0 = r3
            goto L_0x001c
        L_0x0017:
            os9 r2 = new os9
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Y
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.s0
            r5 = 1
            if (r4 == 0) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            fs8 r0 = r2.X
            ps9 r2 = r2.o
            defpackage.od2.a0(r1)
            r7 = r0
            r0 = r2
            goto L_0x0050
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            defpackage.od2.a0(r1)
            r2.o = r0
            r1 = r33
            r2.X = r1
            r2.s0 = r5
            r4 = r31
            java.lang.Object r2 = r0.c(r4, r2)
            if (r2 != r3) goto L_0x004e
            goto L_0x00de
        L_0x004e:
            r7 = r1
            r1 = r2
        L_0x0050:
            e52 r1 = (defpackage.e52) r1
            e5f r8 = defpackage.e5f.a
            if (r1 != 0) goto L_0x0059
        L_0x0056:
            r3 = r8
            goto L_0x00de
        L_0x0059:
            je7 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            el3 r2 = (defpackage.el3) r2
            long r3 = r7.o
            r5 = 0
            uj3 r2 = r2.i(r3, r5)
            r9 = 0
            if (r2 == 0) goto L_0x0070
            java.lang.String r2 = r2.d()
            goto L_0x0071
        L_0x0070:
            r2 = r9
        L_0x0071:
            java.lang.String r10 = ""
            if (r2 != 0) goto L_0x0078
            r18 = r10
            goto L_0x007a
        L_0x0078:
            r18 = r2
        L_0x007a:
            ctc r12 = new ctc
            k92 r2 = r1.b
            long r13 = r2.a
            java.lang.String r17 = r1.q()
            r1 = r12
            r2 = r13
            r4 = r17
            r5 = r7
            r6 = r18
            r1.<init>(r2, r4, r5, r6)
            je7 r0 = r0.e
            java.lang.Object r0 = r0.getValue()
            eqb r0 = (defpackage.eqb) r0
            r0.getClass()
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            java.lang.String r2 = "eqb"
            java.lang.String r3 = "handleScheduledMessageNotification %s"
            defpackage.hm9.m(r2, r3, r1)
            long r1 = r7.a
            boolean r1 = r0.d(r13, r1)
            if (r1 == 0) goto L_0x00ad
            goto L_0x0056
        L_0x00ad:
            ne5 r16 = defpackage.ne5.SCHEDULED
            java.lang.String r1 = r12.a
            if (r1 != 0) goto L_0x00b6
            r23 = r10
            goto L_0x00b8
        L_0x00b6:
            r23 = r1
        L_0x00b8:
            long r1 = r7.a
            long r3 = -r1
            je5 r5 = new je5
            r11 = r5
            java.lang.String r6 = r12.d
            r27 = r6
            boolean r6 = r12.c
            r29 = r6
            long r6 = r7.o
            r19 = r6
            long r6 = r12.b
            r21 = r6
            r26 = 0
            r28 = 1
            r12 = r13
            r14 = r1
            r24 = r3
            r11.<init>(r12, r14, r16, r17, r18, r19, r21, r23, r24, r26, r27, r28, r29)
            r0.e(r5, r9)
            goto L_0x0056
        L_0x00de:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps9.a(ps9, long, fs8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final hs9 b(ps9 ps9, ks9 ks9) {
        long j = ks9.c;
        fs8 fs8 = ks9.Y;
        if (fs8 != null) {
            return new hs9(j, (f52) null, fs8, false, 0, false);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ls9
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ls9 r0 = (defpackage.ls9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            ls9 r0 = new ls9
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.od2.a0(r8)
            goto L_0x006b
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            long r6 = r0.X
            ps9 r5 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0054
        L_0x003a:
            defpackage.od2.a0(r8)
            je7 r8 = r5.a
            java.lang.Object r8 = r8.getValue()
            iy2 r8 = (defpackage.iy2) r8
            r0.o = r5
            r0.X = r6
            r0.s0 = r4
            jz2 r8 = (defpackage.jz2) r8
            java.lang.Object r8 = r8.k(r6, r0)
            if (r8 != r1) goto L_0x0054
            return r1
        L_0x0054:
            e52 r8 = (defpackage.e52) r8
            if (r8 != 0) goto L_0x006b
            ms9 r8 = new ms9
            r2 = 0
            r8.<init>(r5, r6, r2)
            r0.o = r2
            r0.s0 = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = defpackage.fp3.I(r5, r8, r0)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps9.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
