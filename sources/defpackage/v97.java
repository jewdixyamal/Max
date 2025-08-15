package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v97  reason: default package */
public final class v97 extends ffe implements a66 {
    public tt0 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ w97 s0;
    public final /* synthetic */ a66 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v97(w97 w97, xwf xwf, Continuation continuation) {
        super(2, continuation);
        this.s0 = w97;
        this.t0 = xwf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v97) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v97 v97 = new v97(this.s0, (xwf) this.t0, continuation);
        v97.Z = obj;
        return v97;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[Catch:{ all -> 0x0067 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            tt0 r1 = r6.X
            java.lang.Object r4 = r6.Z
            a66 r4 = (defpackage.a66) r4
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x0067 }
        L_0x0015:
            r7 = r4
            goto L_0x003e
        L_0x0017:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001f:
            tt0 r1 = r6.X
            java.lang.Object r4 = r6.Z
            a66 r4 = (defpackage.a66) r4
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x0067 }
            goto L_0x004e
        L_0x0029:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Z
            sx3 r7 = (defpackage.sx3) r7
            w97 r7 = r6.s0
            zt0 r7 = r7.a     // Catch:{ all -> 0x0067 }
            r7.getClass()     // Catch:{ all -> 0x0067 }
            tt0 r1 = new tt0     // Catch:{ all -> 0x0067 }
            r1.<init>(r7)     // Catch:{ all -> 0x0067 }
            a66 r7 = r6.t0
        L_0x003e:
            r6.Z = r7     // Catch:{ all -> 0x0067 }
            r6.X = r1     // Catch:{ all -> 0x0067 }
            r6.Y = r3     // Catch:{ all -> 0x0067 }
            java.lang.Object r4 = r1.b(r6)     // Catch:{ all -> 0x0067 }
            if (r4 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r5 = r4
            r4 = r7
            r7 = r5
        L_0x004e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0067 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0067
            java.lang.Object r7 = r1.c()     // Catch:{ all -> 0x0067 }
            r6.Z = r4     // Catch:{ all -> 0x0067 }
            r6.X = r1     // Catch:{ all -> 0x0067 }
            r6.Y = r2     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = r4.invoke(r7, r6)     // Catch:{ all -> 0x0067 }
            if (r7 != r0) goto L_0x0015
            return r0
        L_0x0067:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v97.o(java.lang.Object):java.lang.Object");
    }
}
