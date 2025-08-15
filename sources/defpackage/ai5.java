package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ai5  reason: default package */
public final class ai5 extends ffe implements a66 {
    public xi9 X;
    public bi5 Y;
    public String Z;
    public int s0;
    public final /* synthetic */ bi5 t0;
    public final /* synthetic */ String u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai5(bi5 bi5, String str, Continuation continuation) {
        super(2, continuation);
        this.t0 = bi5;
        this.u0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ai5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ai5(this.t0, this.u0, continuation);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [xi9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.s0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            xi9 r7 = r7.X
            defpackage.od2.a0(r8)     // Catch:{ all -> 0x0013 }
            goto L_0x0055
        L_0x0013:
            r8 = move-exception
            goto L_0x0061
        L_0x0015:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001d:
            java.lang.String r1 = r7.Z
            bi5 r3 = r7.Y
            xi9 r5 = r7.X
            defpackage.od2.a0(r8)
            r6 = r5
            r5 = r1
            r1 = r6
            goto L_0x0043
        L_0x002a:
            defpackage.od2.a0(r8)
            bi5 r8 = r7.t0
            aj9 r1 = r8.l
            r7.X = r1
            r7.Y = r8
            java.lang.String r5 = r7.u0
            r7.Z = r5
            r7.s0 = r3
            java.lang.Object r3 = r1.d(r7)
            if (r3 != r0) goto L_0x0042
            return r0
        L_0x0042:
            r3 = r8
        L_0x0043:
            kld r8 = r3.m     // Catch:{ all -> 0x005f }
            r7.X = r1     // Catch:{ all -> 0x005f }
            r7.Y = r4     // Catch:{ all -> 0x005f }
            r7.Z = r4     // Catch:{ all -> 0x005f }
            r7.s0 = r2     // Catch:{ all -> 0x005f }
            java.lang.Object r7 = r8.a(r5, r7)     // Catch:{ all -> 0x005f }
            if (r7 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r7 = r1
        L_0x0055:
            aj9 r7 = (defpackage.aj9) r7
            r7.e(r4)
            e5f r7 = defpackage.e5f.a
            return r7
        L_0x005d:
            r7 = r1
            goto L_0x0061
        L_0x005f:
            r8 = move-exception
            goto L_0x005d
        L_0x0061:
            aj9 r7 = (defpackage.aj9) r7
            r7.e(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai5.o(java.lang.Object):java.lang.Object");
    }
}
