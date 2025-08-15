package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: zx3  reason: default package */
public final class zx3 extends ffe implements a66 {
    public tt0 X;
    public int Y;
    public final /* synthetic */ ilc Z;
    public final /* synthetic */ ay3 s0;
    public final /* synthetic */ e32 t0;
    public final /* synthetic */ Callable u0;
    public final /* synthetic */ e32 v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zx3(ilc ilc, ay3 ay3, zt0 zt0, Callable callable, zt0 zt02, Continuation continuation) {
        super(2, continuation);
        this.Z = ilc;
        this.s0 = ay3;
        this.t0 = zt0;
        this.u0 = callable;
        this.v0 = zt02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zx3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zx3(this.Z, this.s0, (zt0) this.t0, this.u0, (zt0) this.v0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.Y
            r2 = 2
            r3 = 1
            ay3 r4 = r8.s0
            ilc r5 = r8.Z
            if (r1 == 0) goto L_0x0027
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            tt0 r1 = r8.X
            defpackage.od2.a0(r9)     // Catch:{ all -> 0x0017 }
        L_0x0015:
            r9 = r1
            goto L_0x0035
        L_0x0017:
            r8 = move-exception
            goto L_0x0069
        L_0x0019:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0021:
            tt0 r1 = r8.X
            defpackage.od2.a0(r9)     // Catch:{ all -> 0x0017 }
            goto L_0x0043
        L_0x0027:
            defpackage.od2.a0(r9)
            v47 r9 = r5.e
            r9.a(r4)
            e32 r9 = r8.t0     // Catch:{ all -> 0x0017 }
            tt0 r9 = r9.iterator()     // Catch:{ all -> 0x0017 }
        L_0x0035:
            r8.X = r9     // Catch:{ all -> 0x0017 }
            r8.Y = r3     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r9.b(r8)     // Catch:{ all -> 0x0017 }
            if (r1 != r0) goto L_0x0040
            return r0
        L_0x0040:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0043:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0017 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0017 }
            if (r9 == 0) goto L_0x0061
            r1.c()     // Catch:{ all -> 0x0017 }
            java.util.concurrent.Callable r9 = r8.u0     // Catch:{ all -> 0x0017 }
            java.lang.Object r9 = r9.call()     // Catch:{ all -> 0x0017 }
            e32 r6 = r8.v0     // Catch:{ all -> 0x0017 }
            r8.X = r1     // Catch:{ all -> 0x0017 }
            r8.Y = r2     // Catch:{ all -> 0x0017 }
            java.lang.Object r9 = r6.o(r9, r8)     // Catch:{ all -> 0x0017 }
            if (r9 != r0) goto L_0x0015
            return r0
        L_0x0061:
            v47 r8 = r5.e
            r8.c(r4)
            e5f r8 = defpackage.e5f.a
            return r8
        L_0x0069:
            v47 r9 = r5.e
            r9.c(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx3.o(java.lang.Object):java.lang.Object");
    }
}
