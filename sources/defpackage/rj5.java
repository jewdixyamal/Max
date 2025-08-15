package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: rj5  reason: default package */
public final class rj5 extends ffe implements a66 {
    public Object X;
    public long Y;
    public int Z;
    public final /* synthetic */ yj5 s0;
    public final /* synthetic */ wve t0;
    public final /* synthetic */ AsynchronousFileChannel u0;
    public final /* synthetic */ AtomicBoolean v0;
    public final /* synthetic */ AtomicReference w0;
    public final /* synthetic */ iab x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj5(yj5 yj5, wve wve, AsynchronousFileChannel asynchronousFileChannel, AtomicBoolean atomicBoolean, AtomicReference atomicReference, iab iab, Continuation continuation) {
        super(2, continuation);
        this.s0 = yj5;
        this.t0 = wve;
        this.u0 = asynchronousFileChannel;
        this.v0 = atomicBoolean;
        this.w0 = atomicReference;
        this.x0 = iab;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rj5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rj5(this.s0, this.t0, this.u0, this.v0, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7 A[Catch:{ all -> 0x003a, all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8 A[Catch:{ all -> 0x003a, all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0123 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r7 = r16
            tx3 r8 = defpackage.tx3.a
            int r0 = r7.Z
            r9 = 0
            r10 = 0
            r11 = 5
            r12 = 4
            r13 = 3
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 == r2) goto L_0x003d
            if (r0 == r1) goto L_0x002f
            if (r0 == r13) goto L_0x002a
            if (r0 == r12) goto L_0x002a
            if (r0 == r11) goto L_0x0021
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            java.lang.Object r0 = r7.X
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.od2.a0(r17)
            goto L_0x0170
        L_0x002a:
            defpackage.od2.a0(r17)
            goto L_0x0155
        L_0x002f:
            long r0 = r7.Y
            java.lang.Object r2 = r7.X
            w6f r2 = (defpackage.w6f) r2
            defpackage.od2.a0(r17)     // Catch:{ all -> 0x003a }
            goto L_0x00aa
        L_0x003a:
            r0 = move-exception
            goto L_0x0124
        L_0x003d:
            defpackage.od2.a0(r17)     // Catch:{ all -> 0x003a }
            r0 = r17
            goto L_0x0053
        L_0x0043:
            defpackage.od2.a0(r17)
            yj5 r0 = r7.s0     // Catch:{ all -> 0x003a }
            n8f r0 = r0.t     // Catch:{ all -> 0x003a }
            r7.Z = r2     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r0.a(r7)     // Catch:{ all -> 0x003a }
            if (r0 != r8) goto L_0x0053
            return r8
        L_0x0053:
            w6f r0 = (defpackage.w6f) r0     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x00f2
            yj5 r2 = r7.s0     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r2.d     // Catch:{ all -> 0x003a }
            ir6 r4 = defpackage.hm9.m     // Catch:{ all -> 0x003a }
            if (r4 != 0) goto L_0x0060
            goto L_0x0085
        L_0x0060:
            boolean r5 = r4.c()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0085
            us7 r5 = defpackage.us7.X     // Catch:{ all -> 0x003a }
            w0f r2 = r2.c     // Catch:{ all -> 0x003a }
            zh3 r2 = r2.c()     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r6.<init>()     // Catch:{ all -> 0x003a }
            r6.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r14 = " acquired on network="
            r6.append(r14)     // Catch:{ all -> 0x003a }
            r6.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x003a }
            r4.d(r5, r3, r2, r9)     // Catch:{ all -> 0x003a }
        L_0x0085:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003a }
            yj5 r2 = r7.s0     // Catch:{ all -> 0x003a }
            wve r3 = r7.t0     // Catch:{ all -> 0x003a }
            java.nio.channels.AsynchronousFileChannel r4 = r7.u0     // Catch:{ all -> 0x003a }
            qj5 r5 = new qj5     // Catch:{ all -> 0x003a }
            iab r6 = r7.x0     // Catch:{ all -> 0x003a }
            r5.<init>(r6, r2, r9)     // Catch:{ all -> 0x003a }
            r7.X = r0     // Catch:{ all -> 0x003a }
            r7.Y = r14     // Catch:{ all -> 0x003a }
            r7.Z = r1     // Catch:{ all -> 0x003a }
            r1 = r2
            r2 = r3
            r3 = r0
            r6 = r16
            java.lang.Object r1 = defpackage.yj5.a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x003a }
            if (r1 != r8) goto L_0x00a8
            return r8
        L_0x00a8:
            r2 = r0
            r0 = r14
        L_0x00aa:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003a }
            long r3 = r3 - r0
            yj5 r0 = r7.s0     // Catch:{ all -> 0x003a }
            java.lang.String r1 = r0.d     // Catch:{ all -> 0x003a }
            ir6 r5 = defpackage.hm9.m     // Catch:{ all -> 0x003a }
            if (r5 != 0) goto L_0x00b8
            goto L_0x010d
        L_0x00b8:
            boolean r6 = r5.c()     // Catch:{ all -> 0x003a }
            if (r6 == 0) goto L_0x010d
            us7 r6 = defpackage.us7.X     // Catch:{ all -> 0x003a }
            int r14 = defpackage.ft4.o     // Catch:{ all -> 0x003a }
            kt4 r14 = defpackage.kt4.MILLISECONDS     // Catch:{ all -> 0x003a }
            long r3 = defpackage.z7.S(r3, r14)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = defpackage.ft4.j(r3)     // Catch:{ all -> 0x003a }
            w0f r0 = r0.c     // Catch:{ all -> 0x003a }
            zh3 r0 = r0.c()     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r4.<init>()     // Catch:{ all -> 0x003a }
            r4.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = " was uploaded for "
            r4.append(r2)     // Catch:{ all -> 0x003a }
            r4.append(r3)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = " on network="
            r4.append(r2)     // Catch:{ all -> 0x003a }
            r4.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x003a }
            r5.d(r6, r1, r0, r9)     // Catch:{ all -> 0x003a }
            goto L_0x010d
        L_0x00f2:
            yj5 r0 = r7.s0     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r0.d     // Catch:{ all -> 0x003a }
            ir6 r1 = defpackage.hm9.m     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x00fb
            goto L_0x0108
        L_0x00fb:
            boolean r2 = r1.c()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x0108
            us7 r2 = defpackage.us7.X     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "execute: no chunks remained, stopped launcher"
            r1.d(r2, r0, r3, r9)     // Catch:{ all -> 0x003a }
        L_0x0108:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.v0     // Catch:{ all -> 0x003a }
            r0.set(r10)     // Catch:{ all -> 0x003a }
        L_0x010d:
            yj5 r0 = r7.s0
            je7 r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            zve r0 = (defpackage.zve) r0
            wve r1 = r7.t0
            r7.X = r9
            r7.Z = r13
            java.lang.Object r0 = r0.b(r1, r7)
            if (r0 != r8) goto L_0x0155
            return r8
        L_0x0124:
            yj5 r1 = r7.s0     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = r1.d     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "During uploading chunk got exception"
            defpackage.hm9.p(r1, r2, r0)     // Catch:{ all -> 0x0158 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.v0     // Catch:{ all -> 0x0158 }
            r1.set(r10)     // Catch:{ all -> 0x0158 }
            java.util.concurrent.atomic.AtomicReference r1 = r7.w0     // Catch:{ all -> 0x0158 }
            r1.getAndSet(r0)     // Catch:{ all -> 0x0158 }
            yj5 r1 = r7.s0     // Catch:{ all -> 0x0158 }
            w0f r1 = r1.c     // Catch:{ all -> 0x0158 }
            r1.e(r0)     // Catch:{ all -> 0x0158 }
            yj5 r0 = r7.s0
            je7 r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            zve r0 = (defpackage.zve) r0
            wve r1 = r7.t0
            r7.X = r9
            r7.Z = r12
            java.lang.Object r0 = r0.b(r1, r7)
            if (r0 != r8) goto L_0x0155
            return r8
        L_0x0155:
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0158:
            r0 = move-exception
            yj5 r1 = r7.s0
            je7 r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            zve r1 = (defpackage.zve) r1
            wve r2 = r7.t0
            r7.X = r0
            r7.Z = r11
            java.lang.Object r1 = r1.b(r2, r7)
            if (r1 != r8) goto L_0x0170
            return r8
        L_0x0170:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj5.o(java.lang.Object):java.lang.Object");
    }
}
