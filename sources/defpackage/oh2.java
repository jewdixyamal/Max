package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oh2  reason: default package */
public final class oh2 extends ffe implements a66 {
    public es8 X;
    public int Y;
    public final /* synthetic */ gi2 Z;
    public final /* synthetic */ xm8 s0;
    public final /* synthetic */ boolean t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oh2(gi2 gi2, xm8 xm8, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = gi2;
        this.s0 = xm8;
        this.t0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oh2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oh2(this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r26) {
        /*
            r25 = this;
            r8 = r25
            tx3 r9 = defpackage.tx3.a
            int r0 = r8.Y
            e5f r10 = defpackage.e5f.a
            r2 = 3
            r3 = 4
            r4 = 2
            r5 = 1
            gi2 r6 = r8.Z
            if (r0 == 0) goto L_0x0035
            if (r0 == r5) goto L_0x002f
            if (r0 == r4) goto L_0x0026
            if (r0 == r2) goto L_0x0021
            if (r0 != r3) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            defpackage.od2.a0(r26)
            goto L_0x0173
        L_0x0026:
            es8 r0 = r8.X
            defpackage.od2.a0(r26)
            r1 = r26
            goto L_0x00c2
        L_0x002f:
            defpackage.od2.a0(r26)
            r0 = r26
            goto L_0x0049
        L_0x0035:
            defpackage.od2.a0(r26)
            xm8 r0 = r8.s0
            long r11 = r0.j()
            r8.Y = r5
            bc7[] r0 = defpackage.gi2.R0
            java.lang.Object r0 = r6.y(r11, r8)
            if (r0 != r9) goto L_0x0049
            return r9
        L_0x0049:
            es8 r0 = (defpackage.es8) r0
            if (r0 != 0) goto L_0x004e
            return r10
        L_0x004e:
            bc7[] r7 = defpackage.gi2.R0
            e52 r7 = r6.v()
            if (r7 == 0) goto L_0x0173
            k92 r7 = r7.b
            long r14 = r7.a
            cu8 r7 = r0.a
            long r12 = r7.c
            k8g r7 = r7.z0
            if (r7 == 0) goto L_0x00cc
            java.lang.Object r7 = r7.a
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x00cc
            lx3 r11 = r8.b
            kotlinx.coroutines.internal.ContextScope r11 = defpackage.j1e.a(r11)
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.z53.S(r7, r5)
            r3.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
        L_0x007d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00b6
            java.lang.Object r7 = r5.next()
            nh2 r4 = new nh2
            xm8 r1 = r8.s0
            gi2 r2 = r8.Z
            r16 = 0
            r20 = r11
            r11 = r4
            r21 = r12
            r12 = r7
            r13 = r16
            r23 = r14
            r14 = r1
            r15 = r23
            r17 = r21
            r19 = r2
            r11.<init>(r12, r13, r14, r15, r17, r19)
            r7 = r20
            r1 = 0
            r2 = 3
            zf4 r4 = defpackage.j47.h(r7, r1, r4, r2)
            r3.add(r4)
            r11 = r7
            r12 = r21
            r14 = r23
            r2 = 3
            r4 = 2
            goto L_0x007d
        L_0x00b6:
            r8.X = r0
            r1 = 2
            r8.Y = r1
            java.lang.Object r1 = defpackage.pag.c(r3, r8)
            if (r1 != r9) goto L_0x00c2
            return r9
        L_0x00c2:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00cc
            java.util.List r1 = defpackage.x53.e0(r1)
            r7 = r1
            goto L_0x00cd
        L_0x00cc:
            r7 = 0
        L_0x00cd:
            if (r7 == 0) goto L_0x0173
            cu8 r1 = r0.a
            k8g r1 = r1.z0
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00e7
            int r1 = r1.size()
            int r2 = r7.size()
            if (r1 != r2) goto L_0x00e7
            goto L_0x0173
        L_0x00e7:
            boolean r1 = r7.isEmpty()
            cu8 r2 = r0.a
            r3 = 1
            if (r1 != r3) goto L_0x00fb
            java.lang.String r1 = r2.s0
            if (r1 == 0) goto L_0x0101
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            ih2 r1 = r6.c
            ih2 r3 = defpackage.ih2.a
            if (r1 == r3) goto L_0x0140
        L_0x0101:
            bc7[] r1 = defpackage.gi2.R0
            e52 r1 = r6.v()
            if (r1 != 0) goto L_0x010a
            return r10
        L_0x010a:
            uj3 r0 = r0.b
            boolean r0 = r0.Y
            se5 r3 = r6.z0
            boolean r0 = defpackage.sw8.a(r1, r3, r0)
            if (r0 != 0) goto L_0x0117
            return r10
        L_0x0117:
            je7 r0 = r6.u0
            java.lang.Object r0 = r0.getValue()
            hu8 r0 = (defpackage.hu8) r0
            long r1 = r2.b
            r3 = 0
            r8.X = r3
            r3 = 3
            r8.Y = r3
            r0.getClass()
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            java.util.List r1 = java.util.Collections.singletonList(r3)
            boolean r2 = r8.t0
            java.lang.Object r0 = r0.a(r2, r1, r8)
            if (r0 != r9) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r0 = r10
        L_0x013d:
            if (r0 != r9) goto L_0x0173
            return r9
        L_0x0140:
            e52 r1 = r6.v()
            if (r1 != 0) goto L_0x0147
            return r10
        L_0x0147:
            sw8 r3 = r0.Y
            boolean r0 = r3.b(r1, r0)
            if (r0 != 0) goto L_0x0150
            return r10
        L_0x0150:
            je7 r0 = r6.t0
            java.lang.Object r0 = r0.getValue()
            dv4 r0 = (defpackage.dv4) r0
            long r3 = r2.b
            r1 = 0
            r8.X = r1
            r1 = 4
            r8.Y = r1
            r11 = 1
            long r5 = r2.t0
            java.lang.String r12 = r2.s0
            r1 = r3
            r3 = r5
            r5 = r12
            r6 = r7
            r7 = r11
            r8 = r25
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7, r8)
            if (r0 != r9) goto L_0x0173
            return r9
        L_0x0173:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh2.o(java.lang.Object):java.lang.Object");
    }
}
