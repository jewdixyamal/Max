package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ox9  reason: default package */
public final class ox9 extends ffe implements a66 {
    public int X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ qx9 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ox9(long j, qx9 qx9, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = qx9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ox9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ox9(this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        r8 = r0;
        r0 = r10;
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0011, B:22:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019 A[ExcHandler: CancellationException (r9v4 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:5:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 2
            r1 = 0
            tx3 r2 = defpackage.tx3.a
            int r3 = r9.Y
            java.lang.String r4 = "qx9"
            r5 = 1
            if (r3 == 0) goto L_0x002d
            if (r3 == r5) goto L_0x0024
            if (r3 != r0) goto L_0x001c
            int r0 = r9.X
            defpackage.od2.a0(r10)     // Catch:{ CancellationException -> 0x0019, all -> 0x0016 }
            goto L_0x00a7
        L_0x0016:
            r10 = move-exception
            goto L_0x009d
        L_0x0019:
            r9 = move-exception
            goto L_0x00e6
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0024:
            defpackage.od2.a0(r10)     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            goto L_0x006c
        L_0x0028:
            r10 = move-exception
            goto L_0x0062
        L_0x002a:
            r9 = move-exception
            goto L_0x00e7
        L_0x002d:
            defpackage.od2.a0(r10)
            long r6 = r9.Z
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "removeTrackerDataToTime: started, time="
            r10.<init>(r3)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            defpackage.hm9.m(r4, r10, new java.lang.Object[0])
            qx9 r10 = r9.s0
            long r6 = r9.Z
            je7 r10 = r10.b     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            ud5 r10 = (defpackage.ud5) r10     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            r9.Y = r5     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            r10.getClass()     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            td5 r3 = new td5     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            r3.<init>(r10, r6, r1)     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            ilc r10 = r10.a     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            java.lang.Object r10 = defpackage.ote.j(r10, r3, r9)     // Catch:{ CancellationException -> 0x002a, all -> 0x0028 }
            if (r10 != r2) goto L_0x006c
            return r2
        L_0x0062:
            java.lang.String r3 = "cleanUpToTime: failed to remove sent analytics entries"
            defpackage.hm9.l(r4, r3, r10)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
        L_0x006c:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            qx9 r3 = r9.s0
            long r5 = r9.Z
            je7 r3 = r3.d     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            java.lang.Object r3 = r3.getValue()     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            yx9 r3 = (defpackage.yx9) r3     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            r9.X = r10     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            r9.Y = r0     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            r3.getClass()     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            td5 r7 = new td5     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            r7.<init>(r3, r5, r0)     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            ilc r0 = r3.a     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            java.lang.Object r0 = defpackage.ote.j(r0, r7, r9)     // Catch:{ CancellationException -> 0x0019, all -> 0x009b }
            if (r0 != r2) goto L_0x0093
            return r2
        L_0x0093:
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x00a7
        L_0x0097:
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x009d
        L_0x009b:
            r0 = move-exception
            goto L_0x0097
        L_0x009d:
            java.lang.String r2 = "cleanUpToTime: failed to remove tracker messages"
            defpackage.hm9.l(r4, r2, r10)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
        L_0x00a7:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            long r1 = r9.Z
            ir6 r9 = defpackage.hm9.m
            if (r9 != 0) goto L_0x00b4
            goto L_0x00e3
        L_0x00b4:
            boolean r3 = r9.c()
            if (r3 == 0) goto L_0x00e3
            us7 r3 = defpackage.us7.X
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "removeTrackerDataToTime: finished, time="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = ", removed "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = " analyticsEntries, "
            r5.append(r0)
            r5.append(r10)
            java.lang.String r10 = " trackerMessages entries"
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            r0 = 0
            r9.d(r3, r4, r10, r0)
        L_0x00e3:
            e5f r9 = defpackage.e5f.a
            return r9
        L_0x00e6:
            throw r9
        L_0x00e7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox9.o(java.lang.Object):java.lang.Object");
    }
}
