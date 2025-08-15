package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ci2  reason: default package */
public final class ci2 extends ffe implements a66 {
    public l20 X;
    public int Y;
    public final /* synthetic */ gi2 Z;
    public final /* synthetic */ xm8 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ci2(gi2 gi2, xm8 xm8, Continuation continuation) {
        super(2, continuation);
        this.Z = gi2;
        this.s0 = xm8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ci2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ci2(this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            xm8 r10 = r0.s0
            gi2 r11 = r0.Z
            if (r2 == 0) goto L_0x003f
            if (r2 == r9) goto L_0x0039
            if (r2 == r8) goto L_0x0030
            if (r2 == r7) goto L_0x002b
            if (r2 == r6) goto L_0x002b
            if (r2 != r5) goto L_0x0023
            defpackage.od2.a0(r27)
            goto L_0x00db
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            defpackage.od2.a0(r27)
            goto L_0x01bb
        L_0x0030:
            l20 r2 = r0.X
            defpackage.od2.a0(r27)
            r5 = r27
            goto L_0x017b
        L_0x0039:
            defpackage.od2.a0(r27)
            r2 = r27
            goto L_0x0052
        L_0x003f:
            defpackage.od2.a0(r27)
            r2 = r10
            wm8 r2 = (defpackage.wm8) r2
            long r12 = r2.b
            r0.Y = r9
            bc7[] r2 = defpackage.gi2.R0
            java.lang.Object r2 = r11.y(r12, r0)
            if (r2 != r1) goto L_0x0052
            return r1
        L_0x0052:
            es8 r2 = (defpackage.es8) r2
            if (r2 != 0) goto L_0x0057
            return r3
        L_0x0057:
            wm8 r10 = (defpackage.wm8) r10
            int r12 = r10.X
            int r12 = defpackage.au1.s(r12)
            cu8 r2 = r2.a
            if (r12 == 0) goto L_0x010f
            if (r12 == r9) goto L_0x006f
            if (r12 != r8) goto L_0x0069
            goto L_0x010f
        L_0x0069:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x006f:
            k8g r6 = r2.z0
            if (r6 == 0) goto L_0x010e
            java.lang.Object r6 = r6.a
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x010e
            java.util.Iterator r6 = r6.iterator()
        L_0x007d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0099
            java.lang.Object r7 = r6.next()
            r8 = r7
            l20 r8 = (defpackage.l20) r8
            if (r8 == 0) goto L_0x007d
            k20 r8 = r8.d
            if (r8 == 0) goto L_0x007d
            long r12 = r10.c
            long r8 = r8.a
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x007d
            goto L_0x009a
        L_0x0099:
            r7 = r4
        L_0x009a:
            l20 r7 = (defpackage.l20) r7
            if (r7 != 0) goto L_0x009f
            goto L_0x010e
        L_0x009f:
            bc7[] r6 = defpackage.gi2.R0
            e52 r6 = r11.v()
            if (r6 == 0) goto L_0x010e
            k92 r6 = r6.b
            long r8 = r6.a
            xcb r6 = defpackage.xcb.a
            v4 r6 = r6.getAccessor()
            java.lang.Class<gh3> r12 = defpackage.gh3.class
            khe r6 = r6.d(r12)
            java.lang.Object r6 = r6.getValue()
            gh3 r6 = (defpackage.gh3) r6
            boolean r6 = r6.f()
            if (r6 != 0) goto L_0x00dc
            kke r2 = r11.w()
            w9a r2 = (defpackage.w9a) r2
            cx7 r2 = r2.c()
            bi2 r6 = new bi2
            r6.<init>(r11, r4)
            r0.Y = r5
            java.lang.Object r0 = defpackage.j47.t0(r2, r6, r0)
            if (r0 != r1) goto L_0x00db
            return r1
        L_0x00db:
            return r3
        L_0x00dc:
            long r14 = r10.c
            long r0 = r10.b
            k20 r4 = r7.d
            java.lang.String r4 = r4.m
            pk r5 = r11.Y
            r12 = r5
            k4a r12 = (defpackage.k4a) r12
            r23 = 1
            r24 = 1
            r13 = 1
            long r5 = r2.c
            java.lang.String r2 = r7.r
            r16 = r8
            r18 = r5
            r20 = r0
            r22 = r2
            r25 = r4
            r12.L(r13, r14, r16, r18, r20, r22, r23, r24, r25)
            q0e r0 = r11.I0
            java.lang.Object r0 = r0.getValue()
            di9 r0 = (defpackage.di9) r0
            long r1 = r10.b
            r0.a(r1)
            goto L_0x01bb
        L_0x010e:
            return r3
        L_0x010f:
            k8g r2 = r2.z0
            if (r2 == 0) goto L_0x01bb
            java.lang.Object r2 = r2.a
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x01bb
            java.util.Iterator r2 = r2.iterator()
        L_0x011d:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0139
            java.lang.Object r5 = r2.next()
            r9 = r5
            l20 r9 = (defpackage.l20) r9
            if (r9 == 0) goto L_0x011d
            x10 r9 = r9.b
            if (r9 == 0) goto L_0x011d
            long r12 = r10.c
            long r14 = r9.s0
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x011d
            goto L_0x013a
        L_0x0139:
            r5 = r4
        L_0x013a:
            r2 = r5
            l20 r2 = (defpackage.l20) r2
            if (r2 != 0) goto L_0x0141
            goto L_0x01bb
        L_0x0141:
            boolean r5 = r2.d()
            x10 r9 = r2.b
            if (r5 == 0) goto L_0x0160
            java.lang.String r5 = r9.a
            boolean r9 = defpackage.oag.t(r5)
            if (r9 != 0) goto L_0x0157
            boolean r9 = defpackage.oag.t(r5)
            if (r9 == 0) goto L_0x0159
        L_0x0157:
            r5 = r4
            goto L_0x0164
        L_0x0159:
            java.lang.String r9 = "&fn=legacy_44"
            java.lang.String r5 = defpackage.au1.g(r5, r9)
            goto L_0x0164
        L_0x0160:
            java.lang.String r5 = r9.a()
        L_0x0164:
            khe r9 = r11.w0
            java.lang.Object r9 = r9.getValue()
            qrc r9 = (defpackage.qrc) r9
            boolean r10 = r2.d()
            r0.X = r2
            r0.Y = r8
            java.lang.Object r5 = r9.b(r5, r10, r0)
            if (r5 != r1) goto L_0x017b
            return r1
        L_0x017b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x019f
            bc7[] r5 = defpackage.gi2.R0
            kke r5 = r11.w()
            w9a r5 = (defpackage.w9a) r5
            cx7 r5 = r5.c()
            zh2 r6 = new zh2
            r6.<init>(r2, r11, r4)
            r0.X = r4
            r0.Y = r7
            java.lang.Object r0 = defpackage.j47.t0(r5, r6, r0)
            if (r0 != r1) goto L_0x01bb
            return r1
        L_0x019f:
            bc7[] r2 = defpackage.gi2.R0
            kke r2 = r11.w()
            w9a r2 = (defpackage.w9a) r2
            cx7 r2 = r2.c()
            ai2 r5 = new ai2
            r5.<init>(r11, r4)
            r0.X = r4
            r0.Y = r6
            java.lang.Object r0 = defpackage.j47.t0(r2, r5, r0)
            if (r0 != r1) goto L_0x01bb
            return r1
        L_0x01bb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci2.o(java.lang.Object):java.lang.Object");
    }
}
