package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qgc  reason: default package */
public final class qgc extends ffe implements a66 {
    public mec X;
    public mec Y;
    public int Z;
    public final /* synthetic */ gh7 s0;
    public final /* synthetic */ fg7 t0;
    public final /* synthetic */ sx3 u0;
    public final /* synthetic */ a66 v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qgc(gh7 gh7, fg7 fg7, sx3 sx3, a66 a66, Continuation continuation) {
        super(2, continuation);
        this.s0 = gh7;
        this.t0 = fg7;
        this.u0 = sx3;
        this.v0 = a66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qgc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qgc(this.s0, this.t0, this.u0, this.v0, continuation);
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, mec] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 0
            gh7 r5 = r0.s0
            r6 = 1
            if (r2 == 0) goto L_0x0024
            if (r2 != r6) goto L_0x001c
            mec r1 = r0.Y
            mec r2 = r0.X
            defpackage.od2.a0(r18)     // Catch:{ all -> 0x0019 }
            goto L_0x00a0
        L_0x0019:
            r0 = move-exception
            goto L_0x00b5
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            defpackage.od2.a0(r18)
            fg7 r2 = r5.d
            fg7 r7 = defpackage.fg7.a
            if (r2 != r7) goto L_0x002e
            return r3
        L_0x002e:
            mec r2 = new mec
            r2.<init>()
            mec r7 = new mec
            r7.<init>()
            fg7 r8 = r0.t0     // Catch:{ all -> 0x00b3 }
            sx3 r11 = r0.u0     // Catch:{ all -> 0x00b3 }
            a66 r15 = r0.v0     // Catch:{ all -> 0x00b3 }
            r0.X = r2     // Catch:{ all -> 0x00b3 }
            r0.Y = r7     // Catch:{ all -> 0x00b3 }
            r0.Z = r6     // Catch:{ all -> 0x00b3 }
            sy1 r14 = new sy1     // Catch:{ all -> 0x00b3 }
            kotlin.coroutines.Continuation r0 = defpackage.v3c.u(r17)     // Catch:{ all -> 0x00b3 }
            r14.<init>(r6, r0)     // Catch:{ all -> 0x00b3 }
            r14.n()     // Catch:{ all -> 0x00b3 }
            cg7 r0 = defpackage.eg7.Companion     // Catch:{ all -> 0x00b3 }
            r0.getClass()     // Catch:{ all -> 0x00b3 }
            int r0 = r8.ordinal()     // Catch:{ all -> 0x00b3 }
            r6 = 4
            r9 = 3
            r10 = 2
            if (r0 == r10) goto L_0x006a
            if (r0 == r9) goto L_0x0067
            if (r0 == r6) goto L_0x0064
            r0 = r4
            goto L_0x006c
        L_0x0064:
            eg7 r0 = defpackage.eg7.ON_RESUME     // Catch:{ all -> 0x00b3 }
            goto L_0x006c
        L_0x0067:
            eg7 r0 = defpackage.eg7.ON_START     // Catch:{ all -> 0x00b3 }
            goto L_0x006c
        L_0x006a:
            eg7 r0 = defpackage.eg7.ON_CREATE     // Catch:{ all -> 0x00b3 }
        L_0x006c:
            int r8 = r8.ordinal()     // Catch:{ all -> 0x00b3 }
            if (r8 == r10) goto L_0x007f
            if (r8 == r9) goto L_0x007c
            if (r8 == r6) goto L_0x0078
            r12 = r4
            goto L_0x0082
        L_0x0078:
            eg7 r6 = defpackage.eg7.ON_PAUSE     // Catch:{ all -> 0x00b3 }
        L_0x007a:
            r12 = r6
            goto L_0x0082
        L_0x007c:
            eg7 r6 = defpackage.eg7.ON_STOP     // Catch:{ all -> 0x00b3 }
            goto L_0x007a
        L_0x007f:
            eg7 r6 = defpackage.eg7.ON_DESTROY     // Catch:{ all -> 0x00b3 }
            goto L_0x007a
        L_0x0082:
            aj9 r6 = defpackage.bj9.a()     // Catch:{ all -> 0x00b3 }
            pgc r13 = new pgc     // Catch:{ all -> 0x00b3 }
            r8 = r13
            r9 = r0
            r10 = r2
            r0 = r13
            r13 = r14
            r16 = r14
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00b3 }
            r7.a = r0     // Catch:{ all -> 0x00b3 }
            r5.a(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.Object r0 = r16.m()     // Catch:{ all -> 0x00b3 }
            if (r0 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r1 = r7
        L_0x00a0:
            java.lang.Object r0 = r2.a
            x77 r0 = (defpackage.x77) r0
            if (r0 == 0) goto L_0x00a9
            r0.cancel(r4)
        L_0x00a9:
            java.lang.Object r0 = r1.a
            ug7 r0 = (defpackage.ug7) r0
            if (r0 == 0) goto L_0x00b2
            r5.f(r0)
        L_0x00b2:
            return r3
        L_0x00b3:
            r0 = move-exception
            r1 = r7
        L_0x00b5:
            java.lang.Object r2 = r2.a
            x77 r2 = (defpackage.x77) r2
            if (r2 == 0) goto L_0x00be
            r2.cancel(r4)
        L_0x00be:
            java.lang.Object r1 = r1.a
            ug7 r1 = (defpackage.ug7) r1
            if (r1 == 0) goto L_0x00c7
            r5.f(r1)
        L_0x00c7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgc.o(java.lang.Object):java.lang.Object");
    }
}
