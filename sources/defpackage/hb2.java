package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hb2  reason: default package */
public final class hb2 extends ffe implements a66 {
    public Object X;
    public zb2 Y;
    public at5 Z;
    public int s0;
    public final /* synthetic */ zb2 t0;
    public final /* synthetic */ at5 u0;
    public final /* synthetic */ k56 v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hb2(zb2 zb2, at5 at5, k56 k56, Continuation continuation) {
        super(2, continuation);
        this.t0 = zb2;
        this.u0 = at5;
        this.v0 = k56;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hb2(this.t0, this.u0, this.v0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: zb2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070 A[Catch:{ all -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e A[Catch:{ all -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ef A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            at5 r4 = r0.u0
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            zb2 r9 = r0.t0
            r13 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r13) goto L_0x003a
            if (r2 == r8) goto L_0x0035
            if (r2 == r7) goto L_0x0028
            if (r2 != r6) goto L_0x0020
            defpackage.od2.a0(r18)
            goto L_0x0113
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            java.lang.Object r2 = r0.X
            r9 = r2
            zb2 r9 = (defpackage.zb2) r9
            defpackage.od2.a0(r18)
            r2 = r18
        L_0x0032:
            r11 = r9
            goto L_0x00f0
        L_0x0035:
            defpackage.od2.a0(r18)
            goto L_0x00df
        L_0x003a:
            at5 r2 = r0.Z
            zb2 r10 = r0.Y
            java.lang.Object r11 = r0.X
            xi9 r11 = (defpackage.xi9) r11
            defpackage.od2.a0(r18)
            goto L_0x005c
        L_0x0046:
            defpackage.od2.a0(r18)
            aj9 r11 = r9.C0
            r0.X = r11
            r0.Y = r9
            r0.Z = r4
            r0.s0 = r13
            java.lang.Object r2 = r11.d(r0)
            if (r2 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r2 = r4
            r10 = r9
        L_0x005c:
            khe r12 = r10.G0     // Catch:{ all -> 0x0088 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0088 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0088 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0088 }
            r14 = 0
            r15 = r14
        L_0x006a:
            boolean r16 = r12.hasNext()     // Catch:{ all -> 0x0088 }
            if (r16 == 0) goto L_0x008b
            java.lang.Object r16 = r12.next()     // Catch:{ all -> 0x0088 }
            r13 = r16
            nkc r13 = (defpackage.nkc) r13     // Catch:{ all -> 0x0088 }
            java.lang.String r13 = r13.a     // Catch:{ all -> 0x0088 }
            java.lang.String r6 = r2.a     // Catch:{ all -> 0x0088 }
            boolean r6 = defpackage.tpa.f(r13, r6)     // Catch:{ all -> 0x0088 }
            if (r6 == 0) goto L_0x0083
            goto L_0x008c
        L_0x0083:
            int r15 = r15 + 1
            r6 = 4
            r13 = 1
            goto L_0x006a
        L_0x0088:
            r0 = move-exception
            goto L_0x0114
        L_0x008b:
            r15 = -1
        L_0x008c:
            if (r15 < 0) goto L_0x00ad
            khe r6 = r10.G0     // Catch:{ all -> 0x0088 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0088 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0088 }
            nkc r10 = new nkc     // Catch:{ all -> 0x0088 }
            java.util.UUID r12 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0088 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0088 }
            r13 = 262142(0x3fffe, float:3.67339E-40)
            at5 r2 = defpackage.at5.a(r2, r12, r14, r5, r13)     // Catch:{ all -> 0x0088 }
            r10.<init>(r2)     // Catch:{ all -> 0x0088 }
            r6.set(r15, r10)     // Catch:{ all -> 0x0088 }
        L_0x00ad:
            aj9 r11 = (defpackage.aj9) r11
            r11.e(r5)
            alc r2 = r9.e()
            nkc r6 = new nkc
            nz4 r10 = defpackage.nz4.a
            r11 = 262127(0x3ffef, float:3.67318E-40)
            at5 r4 = defpackage.at5.a(r4, r5, r14, r10, r11)
            r6.<init>(r4)
            r0.X = r5
            r0.Y = r5
            r0.Z = r5
            r0.s0 = r8
            r2.getClass()
            uh r4 = new uh
            r8 = 23
            r4.<init>(r2, r8, r6)
            ilc r2 = r2.a
            java.lang.Object r2 = defpackage.ote.j(r2, r4, r0)
            if (r2 != r1) goto L_0x00df
            return r1
        L_0x00df:
            java.lang.String r2 = defpackage.zb2.K0
            alc r2 = r9.e()
            r0.X = r9
            r0.s0 = r7
            java.lang.Object r2 = r2.d(r0)
            if (r2 != r1) goto L_0x0032
            return r1
        L_0x00f0:
            r12 = r2
            java.util.List r12 = (java.util.List) r12
            r0.X = r5
            r2 = 4
            r0.s0 = r2
            java.lang.String r2 = defpackage.zb2.K0
            r11.getClass()
            rb2 r2 = new rb2
            r15 = 0
            k56 r14 = r0.v0
            r10 = r2
            r4 = 1
            r13 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.Object r0 = defpackage.j1e.k(r2, r0)
            if (r0 != r1) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r0 = r3
        L_0x0110:
            if (r0 != r1) goto L_0x0113
            return r1
        L_0x0113:
            return r3
        L_0x0114:
            aj9 r11 = (defpackage.aj9) r11
            r11.e(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb2.o(java.lang.Object):java.lang.Object");
    }
}
