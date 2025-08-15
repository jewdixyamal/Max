package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vb6  reason: default package */
public final class vb6 extends ffe implements a66 {
    public zf4 X;
    public boolean Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ cz5 t0;
    public final /* synthetic */ xb6 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vb6(cz5 cz5, xb6 xb6, Continuation continuation) {
        super(2, continuation);
        this.t0 = cz5;
        this.u0 = xb6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vb6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vb6 vb6 = new vb6(this.t0, this.u0, continuation);
        vb6.s0 = obj;
        return vb6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x014c A[LOOP:3: B:48:0x0146->B:50:0x014c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0178 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 10
            lx3 r9 = r0.b
            if (r2 == 0) goto L_0x0049
            if (r2 == r7) goto L_0x003e
            if (r2 == r6) goto L_0x0037
            if (r2 == r4) goto L_0x0028
            if (r2 != r5) goto L_0x0020
            defpackage.od2.a0(r19)
            r0 = r19
            goto L_0x0179
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            boolean r2 = r0.Y
            zf4 r6 = r0.X
            java.lang.Object r7 = r0.s0
            ta3 r7 = (defpackage.ta3) r7
            defpackage.od2.a0(r19)
            r10 = r19
            goto L_0x0128
        L_0x0037:
            defpackage.od2.a0(r19)
            r0 = r19
            goto L_0x00df
        L_0x003e:
            java.lang.Object r2 = r0.s0
            java.lang.Long r2 = (java.lang.Long) r2
            defpackage.od2.a0(r19)
            r12 = r2
            r2 = r19
            goto L_0x009f
        L_0x0049:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.s0
            sx3 r2 = (defpackage.sx3) r2
            cz5 r10 = r0.t0
            if (r10 == 0) goto L_0x017c
            java.util.Set r11 = r10.a
            if (r11 == 0) goto L_0x017c
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0060
            goto L_0x017c
        L_0x0060:
            boolean r12 = r10.c
            if (r12 == 0) goto L_0x0067
            java.lang.Long r12 = r10.b
            goto L_0x0068
        L_0x0067:
            r12 = r3
        L_0x0068:
            xb6 r13 = r0.u0
            if (r12 == 0) goto L_0x00e2
            kotlinx.coroutines.internal.ContextScope r2 = defpackage.j1e.a(r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r10 = defpackage.z53.S(r11, r8)
            r5.<init>(r10)
            java.util.Iterator r10 = r11.iterator()
        L_0x007d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0094
            java.lang.Object r11 = r10.next()
            qb6 r14 = new qb6
            r14.<init>(r11, r3, r13)
            zf4 r11 = defpackage.j47.h(r2, r3, r14, r4)
            r5.add(r11)
            goto L_0x007d
        L_0x0094:
            r0.s0 = r12
            r0.Z = r7
            java.lang.Object r2 = defpackage.pag.c(r5, r0)
            if (r2 != r1) goto L_0x009f
            return r1
        L_0x009f:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            fs4 r5 = new fs4
            r7 = 27
            r5.<init>(r7)
            java.util.List r2 = defpackage.x53.x0(r2, r5)
            kotlinx.coroutines.internal.ContextScope r5 = defpackage.j1e.a(r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = defpackage.z53.S(r2, r8)
            r7.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x00bd:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00d4
            java.lang.Object r8 = r2.next()
            rb6 r9 = new rb6
            r9.<init>(r8, r3, r12)
            zf4 r8 = defpackage.j47.h(r5, r3, r9, r4)
            r7.add(r8)
            goto L_0x00bd
        L_0x00d4:
            r0.s0 = r3
            r0.Z = r6
            java.lang.Object r0 = defpackage.pag.c(r7, r0)
            if (r0 != r1) goto L_0x00df
            return r1
        L_0x00df:
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x00e2:
            ua3 r7 = defpackage.ngg.a()
            ub6 r6 = new ub6
            r6.<init>(r13, r7, r3)
            zf4 r6 = defpackage.j47.h(r2, r3, r6, r4)
            kotlinx.coroutines.internal.ContextScope r2 = defpackage.j1e.a(r9)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r14 = defpackage.z53.S(r11, r8)
            r12.<init>(r14)
            java.util.Iterator r11 = r11.iterator()
        L_0x0100:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0117
            java.lang.Object r14 = r11.next()
            sb6 r15 = new sb6
            r15.<init>(r14, r3, r13)
            zf4 r14 = defpackage.j47.h(r2, r3, r15, r4)
            r12.add(r14)
            goto L_0x0100
        L_0x0117:
            r0.s0 = r7
            r0.X = r6
            boolean r2 = r10.e
            r0.Y = r2
            r0.Z = r4
            java.lang.Object r10 = defpackage.pag.c(r12, r0)
            if (r10 != r1) goto L_0x0128
            return r1
        L_0x0128:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            fs4 r11 = new fs4
            r12 = 28
            r11.<init>(r12)
            java.util.List r10 = defpackage.x53.x0(r10, r11)
            kotlinx.coroutines.internal.ContextScope r9 = defpackage.j1e.a(r9)
            java.util.ArrayList r15 = new java.util.ArrayList
            int r8 = defpackage.z53.S(r10, r8)
            r15.<init>(r8)
            java.util.Iterator r8 = r10.iterator()
        L_0x0146:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x016a
            java.lang.Object r12 = r8.next()
            tb6 r10 = new tb6
            r13 = 0
            xb6 r14 = r0.u0
            r11 = r10
            r16 = r14
            r14 = r7
            r5 = r15
            r15 = r6
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            zf4 r10 = defpackage.j47.h(r9, r3, r10, r4)
            r5.add(r10)
            r15 = r5
            r5 = 4
            goto L_0x0146
        L_0x016a:
            r5 = r15
            r0.s0 = r3
            r0.X = r3
            r2 = 4
            r0.Z = r2
            java.lang.Object r0 = defpackage.pag.c(r5, r0)
            if (r0 != r1) goto L_0x0179
            return r1
        L_0x0179:
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x017c:
            nz4 r0 = defpackage.nz4.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb6.o(java.lang.Object):java.lang.Object");
    }
}
