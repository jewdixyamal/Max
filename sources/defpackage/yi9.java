package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yi9  reason: default package */
public final class yi9 extends ffe implements a66 {
    public xi9 X;
    public m56 Y;
    public int Z;
    public final /* synthetic */ xi9 s0;
    public final /* synthetic */ m56 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yi9(xi9 xi9, t9a t9a, Continuation continuation) {
        super(2, continuation);
        this.s0 = xi9;
        this.t0 = t9a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yi9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yi9(this.s0, (t9a) this.t0, continuation);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [xi9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.Z
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            xi9 r6 = r6.X
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x0013 }
            goto L_0x004c
        L_0x0013:
            r7 = move-exception
            goto L_0x0056
        L_0x0015:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001d:
            m56 r1 = r6.Y
            xi9 r3 = r6.X
            defpackage.od2.a0(r7)
            r7 = r3
            goto L_0x003c
        L_0x0026:
            defpackage.od2.a0(r7)
            xi9 r7 = r6.s0
            r6.X = r7
            m56 r1 = r6.t0
            r6.Y = r1
            r6.Z = r3
            aj9 r7 = (defpackage.aj9) r7
            java.lang.Object r3 = r7.d(r6)
            if (r3 != r0) goto L_0x003c
            return r0
        L_0x003c:
            r6.X = r7     // Catch:{ all -> 0x0052 }
            r6.Y = r4     // Catch:{ all -> 0x0052 }
            r6.Z = r2     // Catch:{ all -> 0x0052 }
            java.lang.Object r6 = r1.invoke(r6)     // Catch:{ all -> 0x0052 }
            if (r6 != r0) goto L_0x0049
            return r0
        L_0x0049:
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x004c:
            aj9 r6 = (defpackage.aj9) r6
            r6.e(r4)
            return r7
        L_0x0052:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0056:
            aj9 r6 = (defpackage.aj9) r6
            r6.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi9.o(java.lang.Object):java.lang.Object");
    }
}
