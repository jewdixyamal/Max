package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vie  reason: default package */
public final class vie extends ffe implements a66 {
    public xie X;
    public xie Y;
    public int Z;
    public final /* synthetic */ xie s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vie(xie xie, Continuation continuation) {
        super(2, continuation);
        this.s0 = xie;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vie) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vie(this.s0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000d, B:11:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014 A[ExcHandler: CancellationException (r6v14 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:4:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.Z
            r2 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            xie r0 = r6.Y
            xie r6 = r6.X
            defpackage.od2.a0(r7)     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            goto L_0x0043
        L_0x0011:
            r6 = move-exception
            goto L_0x00a4
        L_0x0014:
            r6 = move-exception
            goto L_0x00ae
        L_0x0017:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001f:
            defpackage.od2.a0(r7)
            xie r7 = r6.s0
            je7 r1 = r7.Y     // Catch:{ CancellationException -> 0x0014, all -> 0x00a2 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x0014, all -> 0x00a2 }
            vt7 r1 = (defpackage.vt7) r1     // Catch:{ CancellationException -> 0x0014, all -> 0x00a2 }
            v7c r1 = r1.stream()     // Catch:{ CancellationException -> 0x0014, all -> 0x00a2 }
            vy1 r1 = defpackage.od2.h(r1)     // Catch:{ CancellationException -> 0x0014, all -> 0x00a2 }
            r6.X = r7     // Catch:{ CancellationException -> 0x0014, all -> 0x00a2 }
            r6.Y = r7     // Catch:{ CancellationException -> 0x0014, all -> 0x00a2 }
            r6.Z = r2     // Catch:{ CancellationException -> 0x0014, all -> 0x00a2 }
            java.lang.Object r6 = defpackage.od2.A(r1, r6)     // Catch:{ CancellationException -> 0x0014, all -> 0x00a2 }
            if (r6 != r0) goto L_0x0041
            return r0
        L_0x0041:
            r6 = r7
            r0 = r6
        L_0x0043:
            java.lang.String r7 = "analytics-enabled"
            je7 r1 = r6.Z     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            qe5 r1 = (defpackage.qe5) r1     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            se5 r1 = (defpackage.se5) r1     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            r1.getClass()     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f4analyticsenabled     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            boolean r1 = r1.n(r3, r2)     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            kpa r3 = new kpa     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            r3.<init>(r7, r1)     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            java.lang.String r7 = "new-session-logic"
            je7 r1 = r6.Z     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            qe5 r1 = (defpackage.qe5) r1     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            se5 r1 = (defpackage.se5) r1     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            r1.getClass()     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f94newsessionlogic     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            r5 = 0
            boolean r1 = r1.n(r4, r5)     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            kpa r4 = new kpa     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            r4.<init>(r7, r1)     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            kpa[] r7 = new defpackage.kpa[]{r3, r4}     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            java.util.Map r7 = defpackage.mz7.a0(r7)     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            ty3 r6 = r6.c()     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            np r6 = (defpackage.np) r6     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            r6.getClass()     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            boolean r6 = r7.isEmpty()     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x00ab
            pje r6 = defpackage.kye.f     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            if (r6 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r6 = 0
        L_0x009e:
            r6.b(r7)     // Catch:{ CancellationException -> 0x0014, all -> 0x0011 }
            goto L_0x00ab
        L_0x00a2:
            r6 = move-exception
            r0 = r7
        L_0x00a4:
            java.lang.String r7 = r0.a
            java.lang.String r0 = "fail to track pms keys"
            defpackage.hm9.l0(r7, r0, r6)
        L_0x00ab:
            e5f r6 = defpackage.e5f.a
            return r6
        L_0x00ae:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vie.o(java.lang.Object):java.lang.Object");
    }
}
