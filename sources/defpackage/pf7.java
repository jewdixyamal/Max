package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pf7  reason: default package */
public final class pf7 extends ffe implements a66 {
    public xi9 X;
    public qf7 Y;
    public f4f Z;
    public int s0;
    public final /* synthetic */ qf7 t0;
    public final /* synthetic */ f4f u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pf7(qf7 qf7, f4f f4f, Continuation continuation) {
        super(2, continuation);
        this.t0 = qf7;
        this.u0 = f4f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pf7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pf7(this.t0, this.u0, continuation);
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [xi9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.s0
            e5f r2 = defpackage.e5f.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0034
            if (r1 == r5) goto L_0x0027
            if (r1 == r4) goto L_0x0024
            if (r1 != r3) goto L_0x001c
            xi9 r11 = r11.X
        L_0x0014:
            defpackage.od2.a0(r12)     // Catch:{ all -> 0x0019 }
            goto L_0x0081
        L_0x0019:
            r12 = move-exception
            goto L_0x008b
        L_0x001c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0024:
            xi9 r11 = r11.X
            goto L_0x0014
        L_0x0027:
            f4f r1 = r11.Z
            qf7 r5 = r11.Y
            xi9 r7 = r11.X
            defpackage.od2.a0(r12)
            r10 = r7
            r7 = r1
            r1 = r10
            goto L_0x004d
        L_0x0034:
            defpackage.od2.a0(r12)
            qf7 r12 = r11.t0
            aj9 r1 = r12.f
            r11.X = r1
            r11.Y = r12
            f4f r7 = r11.u0
            r11.Z = r7
            r11.s0 = r5
            java.lang.Object r5 = r1.d(r11)
            if (r5 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r5 = r12
        L_0x004d:
            mz6 r12 = r5.a     // Catch:{ all -> 0x0071 }
            long r8 = r7.b     // Catch:{ all -> 0x0071 }
            java.util.concurrent.ConcurrentHashMap r12 = r12.k     // Catch:{ all -> 0x0089 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0089 }
            boolean r12 = r12.containsKey(r8)     // Catch:{ all -> 0x0089 }
            long r7 = r7.b
            if (r12 == 0) goto L_0x0073
            r11.X = r1     // Catch:{ all -> 0x0071 }
            r11.Y = r6     // Catch:{ all -> 0x0071 }
            r11.Z = r6     // Catch:{ all -> 0x0071 }
            r11.s0 = r4     // Catch:{ all -> 0x0071 }
            defpackage.qf7.a(r5, r7)     // Catch:{ all -> 0x0071 }
            if (r2 != r0) goto L_0x006d
            return r0
        L_0x006d:
            r11 = r1
            goto L_0x0081
        L_0x006f:
            r11 = r1
            goto L_0x008b
        L_0x0071:
            r12 = move-exception
            goto L_0x006f
        L_0x0073:
            r11.X = r1     // Catch:{ all -> 0x0071 }
            r11.Y = r6     // Catch:{ all -> 0x0071 }
            r11.Z = r6     // Catch:{ all -> 0x0071 }
            r11.s0 = r3     // Catch:{ all -> 0x0071 }
            defpackage.qf7.b(r5, r7)     // Catch:{ all -> 0x0071 }
            if (r2 != r0) goto L_0x006d
            return r0
        L_0x0081:
            aj9 r11 = (defpackage.aj9) r11
            r11.e(r6)
            return r2
        L_0x0087:
            r12 = r11
            goto L_0x006f
        L_0x0089:
            r11 = move-exception
            goto L_0x0087
        L_0x008b:
            aj9 r11 = (defpackage.aj9) r11
            r11.e(r6)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf7.o(java.lang.Object):java.lang.Object");
    }
}
