package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: mx9  reason: default package */
public final class mx9 extends ffe implements a66 {
    public List X;
    public int Y;
    public final /* synthetic */ qx9 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mx9(qx9 qx9, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Z = qx9;
        this.s0 = j;
        this.t0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mx9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mx9(this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r12 = r14;
        r14 = r13;
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0012, B:22:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a A[ExcHandler: CancellationException (r13v11 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:5:0x0012] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            qx9 r2 = r13.Z
            r3 = 2
            r4 = 1
            java.lang.String r5 = "qx9"
            if (r1 == 0) goto L_0x002e
            if (r1 == r4) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            java.util.List r13 = r13.X
            defpackage.od2.a0(r14)     // Catch:{ CancellationException -> 0x001a, all -> 0x0017 }
            goto L_0x008f
        L_0x0017:
            r14 = move-exception
            goto L_0x0084
        L_0x001a:
            r13 = move-exception
            goto L_0x00a9
        L_0x001d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0025:
            defpackage.od2.a0(r14)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            goto L_0x0059
        L_0x0029:
            r14 = move-exception
            goto L_0x0052
        L_0x002b:
            r13 = move-exception
            goto L_0x00aa
        L_0x002e:
            defpackage.od2.a0(r14)
            long r8 = r13.s0
            long r10 = r13.t0
            je7 r14 = r2.b     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            ud5 r14 = (defpackage.ud5) r14     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            r13.Y = r4     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            r14.getClass()     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            sd5 r1 = new sd5     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            r6 = r1
            r7 = r14
            r6.<init>(r7, r8, r10)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            ilc r14 = r14.a     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r14 = defpackage.z04.e0(r14, r1, r13)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            if (r14 != r0) goto L_0x0059
            return r0
        L_0x0052:
            java.lang.String r1 = "onSelfReadMarkChanged: failed to remove sent analytics entries"
            defpackage.hm9.l(r5, r1, r14)
            nz4 r14 = defpackage.nz4.a
        L_0x0059:
            java.util.List r14 = (java.util.List) r14
            je7 r1 = r2.d     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            yx9 r1 = (defpackage.yx9) r1     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            r13.X = r14     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            r13.Y = r3     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            r1.getClass()     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            ga r2 = new ga     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            r3 = 22
            r2.<init>(r1, r3, r14)     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            ilc r1 = r1.a     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            java.lang.Object r13 = defpackage.z04.e0(r1, r2, r13)     // Catch:{ CancellationException -> 0x001a, all -> 0x0082 }
            if (r13 != r0) goto L_0x007a
            return r0
        L_0x007a:
            r12 = r14
            r14 = r13
            r13 = r12
            goto L_0x008f
        L_0x007e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto L_0x0084
        L_0x0082:
            r13 = move-exception
            goto L_0x007e
        L_0x0084:
            java.lang.String r0 = "onSelfReadMarkChanged: failed to remove tracker messages"
            defpackage.hm9.l(r5, r0, r14)
            java.lang.Integer r14 = new java.lang.Integer
            r0 = 0
            r14.<init>(r0)
        L_0x008f:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            int r13 = r13.size()
            java.lang.String r0 = "onSelfReadMarkChanged: removed "
            java.lang.String r1 = " analyticsEntries, "
            java.lang.String r2 = " trackerMessages entries"
            java.lang.String r13 = defpackage.wg0.h(r0, r13, r1, r14, r2)
            defpackage.hm9.m(r5, r13, new java.lang.Object[0])
            e5f r13 = defpackage.e5f.a
            return r13
        L_0x00a9:
            throw r13
        L_0x00aa:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx9.o(java.lang.Object):java.lang.Object");
    }
}
