package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: llc  reason: default package */
public final class llc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ilc Z;
    public final /* synthetic */ m56 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public llc(ilc ilc, m56 m56, Continuation continuation) {
        super(2, continuation);
        this.Z = ilc;
        this.s0 = m56;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((llc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        llc llc = new llc(this.Z, this.s0, continuation);
        llc.Y = obj;
        return llc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.X
            java.lang.String r2 = "Transaction was never started or was already released."
            r3 = 1
            ilc r4 = r6.Z
            if (r1 == 0) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            java.lang.Object r6 = r6.Y
            v0f r6 = (defpackage.v0f) r6
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x0015 }
            goto L_0x004a
        L_0x0015:
            r7 = move-exception
            goto L_0x0063
        L_0x0017:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001f:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            sx3 r7 = (defpackage.sx3) r7
            lx3 r7 = r7.getCoroutineContext()
            sp3 r1 = defpackage.v0f.c
            jx3 r7 = r7.get(r1)
            v0f r7 = (defpackage.v0f) r7
            java.util.concurrent.atomic.AtomicInteger r1 = r7.b
            r1.incrementAndGet()
            r4.c()     // Catch:{ all -> 0x0069 }
            m56 r1 = r6.s0     // Catch:{ all -> 0x005f }
            r6.Y = r7     // Catch:{ all -> 0x005f }
            r6.X = r3     // Catch:{ all -> 0x005f }
            java.lang.Object r6 = r1.invoke(r6)     // Catch:{ all -> 0x005f }
            if (r6 != r0) goto L_0x0047
            return r0
        L_0x0047:
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x004a:
            r4.r()     // Catch:{ all -> 0x0015 }
            r4.l()     // Catch:{ all -> 0x0067 }
            java.util.concurrent.atomic.AtomicInteger r6 = r6.b
            int r6 = r6.decrementAndGet()
            if (r6 < 0) goto L_0x0059
            return r7
        L_0x0059:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        L_0x005f:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0063:
            r4.l()     // Catch:{ all -> 0x0067 }
            throw r7     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r7 = move-exception
            goto L_0x006d
        L_0x0069:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x006d:
            java.util.concurrent.atomic.AtomicInteger r6 = r6.b
            int r6 = r6.decrementAndGet()
            if (r6 < 0) goto L_0x0076
            throw r7
        L_0x0076:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llc.o(java.lang.Object):java.lang.Object");
    }
}
