package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ic6  reason: default package */
public final class ic6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jc6 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ic6(jc6 jc6, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = jc6;
        this.Z = j;
        this.s0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ic6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ic6(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r6 = r21
            tx3 r7 = defpackage.tx3.a
            int r0 = r6.X
            r8 = 0
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 == r12) goto L_0x0031
            if (r0 == r11) goto L_0x002b
            if (r0 == r10) goto L_0x0024
            if (r0 != r9) goto L_0x001c
            defpackage.od2.a0(r22)
            r0 = r22
            goto L_0x00e8
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            defpackage.od2.a0(r22)
            r0 = r22
            goto L_0x00af
        L_0x002b:
            defpackage.od2.a0(r22)
            r0 = r22
            goto L_0x0093
        L_0x0031:
            defpackage.od2.a0(r22)
            r0 = r22
            goto L_0x0057
        L_0x0037:
            defpackage.od2.a0(r22)
            jc6 r0 = r6.Y
            java.lang.Object r0 = r0.X
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            r79 r0 = (defpackage.r79) r0
            long r1 = r6.Z
            long r3 = r6.s0
            r6.X = r12
            vlc r0 = r0.a
            r5 = r21
            java.lang.Object r0 = r0.j(r1, r3, r5)
            if (r0 != r7) goto L_0x0057
            return r7
        L_0x0057:
            cu8 r0 = (defpackage.cu8) r0
            if (r0 == 0) goto L_0x007c
            jc6 r1 = r6.Y
            java.lang.Object r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            long r2 = r6.s0
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L_0x0068
            goto L_0x007b
        L_0x0068:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x007b
            us7 r5 = defpackage.us7.X
            java.lang.String r6 = "Found message="
            java.lang.String r7 = " in cache, return it"
            java.lang.String r2 = defpackage.ey8.i(r2, r6, r7)
            r4.d(r5, r1, r2, r8)
        L_0x007b:
            return r0
        L_0x007c:
            jc6 r0 = r6.Y
            java.lang.Object r0 = r0.o
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            iy2 r0 = (defpackage.iy2) r0
            long r1 = r6.Z
            r6.X = r11
            java.lang.Object r0 = r0.d(r1, r6)
            if (r0 != r7) goto L_0x0093
            return r7
        L_0x0093:
            e52 r0 = (defpackage.e52) r0
            k92 r0 = r0.b
            long r0 = r0.a
            jc6 r2 = r6.Y
            long r3 = r6.s0
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r3)
            java.util.List r3 = java.util.Collections.singletonList(r5)
            r6.X = r10
            java.lang.Object r0 = defpackage.jc6.b(r2, r0, r3, r6)
            if (r0 != r7) goto L_0x00af
            return r7
        L_0x00af:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = defpackage.x53.h0(r0)
            r17 = r0
            fs8 r17 = (defpackage.fs8) r17
            if (r17 != 0) goto L_0x00bc
            return r8
        L_0x00bc:
            jc6 r0 = r6.Y
            java.lang.Object r0 = r0.X
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            r79 r0 = (defpackage.r79) r0
            long r1 = r6.Z
            r6.X = r9
            r0.getClass()
            p79 r3 = new p79
            r18 = 0
            r13 = r3
            r14 = r0
            r15 = r1
            r13.<init>(r14, r15, r17, r18)
            vlc r0 = r0.a
            jlc r0 = r0.a
            ilc r0 = r0.m()
            java.lang.Object r0 = defpackage.z04.e0(r0, r3, r6)
            if (r0 != r7) goto L_0x00e8
            return r7
        L_0x00e8:
            cu8 r0 = (defpackage.cu8) r0
            if (r0 == 0) goto L_0x013f
            jc6 r1 = r6.Y
            long r14 = r6.Z
            long r2 = r6.s0
            java.lang.Object r4 = r1.b
            java.lang.String r4 = (java.lang.String) r4
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x00fb
            goto L_0x010e
        L_0x00fb:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x010e
            us7 r6 = defpackage.us7.X
            java.lang.String r7 = "Fetched message="
            java.lang.String r9 = " from server"
            java.lang.String r2 = defpackage.ey8.i(r2, r7, r9)
            r5.d(r6, r4, r2, r8)
        L_0x010e:
            java.lang.Object r1 = r1.o
            je7 r1 = (defpackage.je7) r1
            java.lang.Object r1 = r1.getValue()
            iy2 r1 = (defpackage.iy2) r1
            jz2 r1 = (defpackage.jz2) r1
            p82 r13 = r1.l()
            je7 r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            wxc r1 = (defpackage.wxc) r1
            long r1 = r1.a()
            long r3 = r0.Y
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0133
        L_0x0130:
            r16 = r12
            goto L_0x0135
        L_0x0133:
            r12 = 0
            goto L_0x0130
        L_0x0135:
            r18 = 0
            r19 = 0
            r17 = r0
            r13.T(r14, r16, r17, r18, r19)
            r8 = r0
        L_0x013f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic6.o(java.lang.Object):java.lang.Object");
    }
}
