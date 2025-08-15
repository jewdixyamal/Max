package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: rhf  reason: default package */
public final class rhf extends ffe implements a66 {
    public vhf X;
    public Object Y;
    public List Z;
    public long s0;
    public int t0;
    public final /* synthetic */ vhf u0;
    public final /* synthetic */ List v0;
    public final /* synthetic */ List w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rhf(vhf vhf, List list, ArrayList arrayList, long j, Continuation continuation) {
        super(2, continuation);
        this.u0 = vhf;
        this.v0 = list;
        this.w0 = arrayList;
        this.x0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rhf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rhf(this.u0, this.v0, (ArrayList) this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        r6 = r3;
        r3 = r9;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        r16 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0127, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015d, code lost:
        r6.i.remove(defpackage.vhf.c(r1, ((java.lang.Number) r0.next()).longValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0172, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x0038, B:29:0x007f] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x001b, B:29:0x007f] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x015d A[LOOP:2: B:86:0x0157->B:88:0x015d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023 A[ExcHandler: CancellationException (r0v15 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:29:0x007f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = "Start fetching video messages (size="
            tx3 r2 = defpackage.tx3.a
            int r3 = r0.t0
            e5f r4 = defpackage.e5f.a
            r5 = 0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 == r7) goto L_0x002e
            if (r3 != r6) goto L_0x0026
            long r1 = r0.s0
            java.lang.Object r3 = r0.Y
            java.util.List r3 = (java.util.List) r3
            vhf r6 = r0.X
            defpackage.od2.a0(r19)     // Catch:{ CancellationException -> 0x0023, all -> 0x0020 }
            goto L_0x0171
        L_0x0020:
            r0 = move-exception
            goto L_0x0133
        L_0x0023:
            r0 = move-exception
            goto L_0x0172
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            long r7 = r0.s0
            java.util.List r3 = r0.Z
            java.lang.Object r1 = r0.Y
            vhf r1 = (defpackage.vhf) r1
            vhf r9 = r0.X
            defpackage.od2.a0(r19)     // Catch:{ CancellationException -> 0x0023, all -> 0x0040 }
            r6 = r1
            r1 = r19
            goto L_0x00d5
        L_0x0040:
            r0 = move-exception
            r6 = r1
        L_0x0042:
            r1 = r7
            goto L_0x0133
        L_0x0045:
            defpackage.od2.a0(r19)
            vhf r3 = r0.u0
            java.util.List r8 = r0.v0
            java.util.List r9 = r0.w0
            long r14 = r0.x0
            java.lang.String r10 = r3.g     // Catch:{ CancellationException -> 0x0023, all -> 0x0130 }
            ir6 r11 = defpackage.hm9.m     // Catch:{ CancellationException -> 0x0023, all -> 0x0130 }
            if (r11 != 0) goto L_0x0057
            goto L_0x007f
        L_0x0057:
            boolean r12 = r11.c()     // Catch:{ CancellationException -> 0x0023, all -> 0x0130 }
            if (r12 == 0) goto L_0x007f
            us7 r12 = defpackage.us7.X     // Catch:{ CancellationException -> 0x0023, all -> 0x007d }
            int r13 = r9.size()     // Catch:{ CancellationException -> 0x0023, all -> 0x007d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0023, all -> 0x007d }
            r6.<init>(r1)     // Catch:{ CancellationException -> 0x0023, all -> 0x007d }
            r6.append(r13)     // Catch:{ CancellationException -> 0x0023, all -> 0x007d }
            java.lang.String r1 = ")"
            r6.append(r1)     // Catch:{ CancellationException -> 0x0023, all -> 0x007d }
            java.lang.String r1 = r6.toString()     // Catch:{ CancellationException -> 0x0023, all -> 0x007d }
            r11.d(r12, r10, r1, r5)     // Catch:{ CancellationException -> 0x0023, all -> 0x007d }
            goto L_0x007f
        L_0x0078:
            r6 = r3
            r3 = r9
            r1 = r14
            goto L_0x0133
        L_0x007d:
            r0 = move-exception
            goto L_0x0078
        L_0x007f:
            kotlinx.coroutines.internal.ContextScope r1 = r3.h     // Catch:{ CancellationException -> 0x0023, all -> 0x0130 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0023, all -> 0x0130 }
            r10 = 10
            int r10 = defpackage.z53.S(r8, r10)     // Catch:{ CancellationException -> 0x0023, all -> 0x0130 }
            r6.<init>(r10)     // Catch:{ CancellationException -> 0x0023, all -> 0x0130 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ CancellationException -> 0x0023, all -> 0x0130 }
        L_0x0090:
            boolean r10 = r8.hasNext()     // Catch:{ CancellationException -> 0x0023, all -> 0x0130 }
            if (r10 == 0) goto L_0x00bc
            java.lang.Object r11 = r8.next()     // Catch:{ CancellationException -> 0x0023, all -> 0x00b8 }
            qhf r13 = new qhf     // Catch:{ CancellationException -> 0x0023, all -> 0x00b8 }
            r12 = 0
            r10 = r13
            r7 = r13
            r13 = r3
            r16 = r14
            r10.<init>(r11, r12, r13, r14)     // Catch:{ CancellationException -> 0x0023, all -> 0x00b1 }
            r10 = 3
            zf4 r7 = defpackage.j47.h(r1, r5, r7, r10)     // Catch:{ CancellationException -> 0x0023, all -> 0x00b1 }
            r6.add(r7)     // Catch:{ CancellationException -> 0x0023, all -> 0x00b1 }
            r14 = r16
            r7 = 1
            goto L_0x0090
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            r6 = r3
            r3 = r9
            r1 = r16
            goto L_0x0133
        L_0x00b8:
            r0 = move-exception
            r16 = r14
            goto L_0x00b2
        L_0x00bc:
            r16 = r14
            r0.X = r3     // Catch:{ CancellationException -> 0x0023, all -> 0x012c }
            r0.Y = r3     // Catch:{ CancellationException -> 0x0023, all -> 0x012c }
            r0.Z = r9     // Catch:{ CancellationException -> 0x0023, all -> 0x012c }
            r7 = r16
            r0.s0 = r7     // Catch:{ CancellationException -> 0x0023, all -> 0x0127 }
            r1 = 1
            r0.t0 = r1     // Catch:{ CancellationException -> 0x0023, all -> 0x0127 }
            java.lang.Object r1 = defpackage.pag.c(r6, r0)     // Catch:{ CancellationException -> 0x0023, all -> 0x0127 }
            if (r1 != r2) goto L_0x00d2
            return r2
        L_0x00d2:
            r6 = r3
            r3 = r9
            r9 = r6
        L_0x00d5:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            boolean r10 = r1 instanceof java.util.Collection     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            if (r10 == 0) goto L_0x00e9
            r10 = r1
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            boolean r10 = r10.isEmpty()     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            if (r10 == 0) goto L_0x00e9
            goto L_0x0171
        L_0x00e6:
            r0 = move-exception
            goto L_0x0042
        L_0x00e9:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
        L_0x00ed:
            boolean r10 = r1.hasNext()     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            if (r10 == 0) goto L_0x0171
            java.lang.Object r10 = r1.next()     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            boolean r10 = r10.booleanValue()     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            if (r10 == 0) goto L_0x00ed
            java.lang.String r1 = r9.g     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            ir6 r10 = defpackage.hm9.m     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            if (r10 != 0) goto L_0x0106
            goto L_0x0113
        L_0x0106:
            boolean r11 = r10.c()     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            if (r11 == 0) goto L_0x0113
            us7 r11 = defpackage.us7.X     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            java.lang.String r12 = "Fetching video messages was completed successful"
            r10.d(r11, r1, r12, r5)     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
        L_0x0113:
            kld r1 = r9.j     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            r0.X = r6     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            r0.Y = r3     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            r0.Z = r5     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            r0.s0 = r7     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            r10 = 2
            r0.t0 = r10     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            java.lang.Object r0 = r1.a(r4, r0)     // Catch:{ CancellationException -> 0x0023, all -> 0x00e6 }
            if (r0 != r2) goto L_0x0171
            return r2
        L_0x0127:
            r0 = move-exception
        L_0x0128:
            r6 = r3
            r1 = r7
            r3 = r9
            goto L_0x0133
        L_0x012c:
            r0 = move-exception
            r7 = r16
            goto L_0x0128
        L_0x0130:
            r0 = move-exception
            r7 = r14
            goto L_0x0128
        L_0x0133:
            java.lang.String r7 = r6.g
            ir6 r8 = defpackage.hm9.m
            if (r8 != 0) goto L_0x013a
            goto L_0x0153
        L_0x013a:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x0153
            us7 r9 = defpackage.us7.s0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed fetching video messages. Exception "
            r10.<init>(r11)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r8.d(r9, r7, r0, r5)
        L_0x0153:
            java.util.Iterator r0 = r3.iterator()
        L_0x0157:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0171
            java.lang.Object r3 = r0.next()
            java.lang.Number r3 = (java.lang.Number) r3
            long r7 = r3.longValue()
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = r6.i
            java.lang.String r5 = defpackage.vhf.c(r1, r7)
            r3.remove(r5)
            goto L_0x0157
        L_0x0171:
            return r4
        L_0x0172:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhf.o(java.lang.Object):java.lang.Object");
    }
}
