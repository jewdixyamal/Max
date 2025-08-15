package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: tj5  reason: default package */
public final class tj5 extends ffe implements a66 {
    public Object X;
    public yj5 Y;
    public Object Z;
    public Object s0;
    public AtomicReference t0;
    public int u0;
    public /* synthetic */ Object v0;
    public final /* synthetic */ yj5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tj5(yj5 yj5, Continuation continuation) {
        super(2, continuation);
        this.w0 = yj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tj5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tj5 tj5 = new tj5(this.w0, continuation);
        tj5.v0 = obj;
        return tj5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0104, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0128, code lost:
        r6 = new defpackage.oj5(r1.w0, 1);
        r1.v0 = r0;
        r1.u0 = 3;
        r5 = defpackage.ema.C(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0138, code lost:
        if (r5 != r2) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013b, code lost:
        r5 = (java.io.Closeable) r5;
        r6 = r1.w0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r7 = (java.nio.channels.AsynchronousFileChannel) r5;
        r18 = new java.util.concurrent.atomic.AtomicBoolean(true);
        r8 = r0;
        r0 = new java.util.concurrent.atomic.AtomicReference((java.lang.Object) null);
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0156, code lost:
        if (r3.get() == false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0158, code lost:
        defpackage.pag.j(r1.b);
        r4 = r9;
        r17 = r2;
        r9 = new defpackage.sj5(r3, r6, r7, r0, r8, (kotlin.coroutines.Continuation) null);
        r1.v0 = r8;
        r1.X = r5;
        r1.Y = r6;
        r1.Z = r7;
        r1.s0 = r3;
        r1.t0 = r0;
        r1.u0 = 4;
        r2 = ((defpackage.zve) r6.f.getValue()).a(r4, r1);
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018e, code lost:
        if (r2 != r4) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0190, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0191, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0194, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0197, code lost:
        r4 = r2;
        r3 = r0;
        r0 = r6.p.getChildren().iterator();
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a9, code lost:
        if (r0.hasNext() == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ab, code lost:
        r1.v0 = r7;
        r1.X = r5;
        r1.Y = r6;
        r1.Z = r3;
        r1.s0 = r0;
        r1.t0 = null;
        r1.u0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c5, code lost:
        if (((defpackage.x77) r0.next()).join(r1) != r4) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c7, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c8, code lost:
        r0 = (java.lang.Throwable) r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ce, code lost:
        if (r0 != null) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d0, code lost:
        r0 = new defpackage.pjc(new defpackage.h8f(100.0f, r6.j, r6.s));
        r1.v0 = r5;
        r1.X = r6;
        r1.Y = null;
        r1.Z = null;
        r1.s0 = null;
        r1.t0 = null;
        r1.u0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f8, code lost:
        if (((defpackage.fab) r7).a.o(r0, r1) != r4) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fa, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fb, code lost:
        r1 = r5;
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fe, code lost:
        r0 = new defpackage.pjc(new defpackage.njc(r0));
        r1.v0 = r5;
        r1.X = r6;
        r1.Y = null;
        r1.Z = null;
        r1.s0 = null;
        r1.t0 = null;
        r1.u0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        defpackage.od2.a0(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0220, code lost:
        if (((defpackage.fab) r7).a.o(r0, r1) != r4) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0222, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r2 = java.lang.System.currentTimeMillis() - r0.r;
        r0 = r0.d;
        r4 = defpackage.hm9.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022e, code lost:
        if (r4 != null) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0236, code lost:
        if (r4.c() == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0238, code lost:
        r5 = defpackage.us7.X;
        r6 = defpackage.ft4.o;
        r2 = defpackage.ft4.j(defpackage.z7.S(r2, defpackage.kt4.MILLISECONDS));
        r4.d(r5, r0, "FileUploadOperation worked for " + r2, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025c, code lost:
        defpackage.v3c.i(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0261, code lost:
        return defpackage.e5f.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r1 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            tx3 r2 = defpackage.tx3.a
            int r0 = r1.u0
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0093;
                case 1: goto L_0x0088;
                case 2: goto L_0x007f;
                case 3: goto L_0x0074;
                case 4: goto L_0x0050;
                case 5: goto L_0x002e;
                case 6: goto L_0x0025;
                case 7: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0013:
            java.lang.Object r0 = r1.X
            yj5 r0 = (defpackage.yj5) r0
            java.lang.Object r1 = r1.v0
            java.io.Closeable r1 = (java.io.Closeable) r1
        L_0x001b:
            defpackage.od2.a0(r20)     // Catch:{ all -> 0x0020 }
            goto L_0x0223
        L_0x0020:
            r0 = move-exception
            r5 = r1
        L_0x0022:
            r1 = r0
            goto L_0x0262
        L_0x0025:
            java.lang.Object r0 = r1.X
            yj5 r0 = (defpackage.yj5) r0
            java.lang.Object r1 = r1.v0
            java.io.Closeable r1 = (java.io.Closeable) r1
            goto L_0x001b
        L_0x002e:
            java.lang.Object r0 = r1.s0
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r3 = r1.Z
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            yj5 r5 = r1.Y
            java.lang.Object r6 = r1.X
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r7 = r1.v0
            iab r7 = (defpackage.iab) r7
            defpackage.od2.a0(r20)     // Catch:{ all -> 0x004b }
            r4 = r2
            r18 = r6
            r6 = r5
            r5 = r18
            goto L_0x01a5
        L_0x004b:
            r0 = move-exception
            r1 = r0
            r5 = r6
            goto L_0x0262
        L_0x0050:
            java.util.concurrent.atomic.AtomicReference r0 = r1.t0
            java.lang.Object r3 = r1.s0
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Object r5 = r1.Z
            java.nio.channels.AsynchronousFileChannel r5 = (java.nio.channels.AsynchronousFileChannel) r5
            yj5 r6 = r1.Y
            java.lang.Object r7 = r1.X
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r8 = r1.v0
            iab r8 = (defpackage.iab) r8
            defpackage.od2.a0(r20)     // Catch:{ all -> 0x006f }
            r4 = r2
            r18 = r7
            r7 = r5
            r5 = r18
            goto L_0x0191
        L_0x006f:
            r0 = move-exception
            r1 = r0
            r5 = r7
            goto L_0x0262
        L_0x0074:
            java.lang.Object r0 = r1.v0
            iab r0 = (defpackage.iab) r0
            defpackage.od2.a0(r20)
            r5 = r20
            goto L_0x013b
        L_0x007f:
            java.lang.Object r0 = r1.v0
            iab r0 = (defpackage.iab) r0
            defpackage.od2.a0(r20)
            goto L_0x0128
        L_0x0088:
            java.lang.Object r0 = r1.v0
            r5 = r0
            iab r5 = (defpackage.iab) r5
            defpackage.od2.a0(r20)     // Catch:{ all -> 0x0091 }
            goto L_0x0104
        L_0x0091:
            r0 = move-exception
            goto L_0x0106
        L_0x0093:
            defpackage.od2.a0(r20)
            java.lang.Object r0 = r1.v0
            r5 = r0
            iab r5 = (defpackage.iab) r5
            yj5 r0 = r1.w0
            java.lang.String r6 = r0.d
            ir6 r7 = defpackage.hm9.m
            if (r7 != 0) goto L_0x00a4
            goto L_0x00db
        L_0x00a4:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x00db
            us7 r8 = defpackage.us7.X
            java.io.File r9 = r0.i
            java.lang.String r9 = r9.getPath()
            long r10 = r0.j
            w0f r0 = r0.c
            zh3 r0 = r0.c()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Uploading file="
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r9 = " with size="
            r12.append(r9)
            r12.append(r10)
            java.lang.String r9 = " on network="
            r12.append(r9)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r7.d(r8, r6, r0, r4)
        L_0x00db:
            yj5 r0 = r1.w0
            long r6 = java.lang.System.currentTimeMillis()
            r0.r = r6
            yj5 r0 = r1.w0     // Catch:{ all -> 0x0091 }
            n8f r6 = r0.t     // Catch:{ all -> 0x0091 }
            java.net.URI r0 = r0.h     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0091 }
            od3 r7 = new od3     // Catch:{ all -> 0x0091 }
            r7.<init>()     // Catch:{ all -> 0x0091 }
            r7.j(r4, r0)     // Catch:{ all -> 0x0091 }
            vq6 r0 = r7.b()     // Catch:{ all -> 0x0091 }
            r1.v0 = r5     // Catch:{ all -> 0x0091 }
            r1.u0 = r3     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r6.g(r0, r1)     // Catch:{ all -> 0x0091 }
            if (r0 != r2) goto L_0x0104
            return r2
        L_0x0104:
            r0 = r5
            goto L_0x0128
        L_0x0106:
            yj5 r6 = r1.w0
            w0f r6 = r6.c
            r6.e(r0)
            njc r6 = new njc
            r6.<init>(r0)
            pjc r0 = new pjc
            r0.<init>(r6)
            r1.v0 = r5
            r6 = 2
            r1.u0 = r6
            r6 = r5
            fab r6 = (defpackage.fab) r6
            e32 r6 = r6.a
            java.lang.Object r0 = r6.o(r0, r1)
            if (r0 != r2) goto L_0x0104
            return r2
        L_0x0128:
            yj5 r5 = r1.w0
            oj5 r6 = new oj5
            r6.<init>(r5, r3)
            r1.v0 = r0
            r5 = 3
            r1.u0 = r5
            java.lang.Object r5 = defpackage.ema.C(r6, r1)
            if (r5 != r2) goto L_0x013b
            return r2
        L_0x013b:
            java.io.Closeable r5 = (java.io.Closeable) r5
            yj5 r6 = r1.w0
            r7 = r5
            java.nio.channels.AsynchronousFileChannel r7 = (java.nio.channels.AsynchronousFileChannel) r7     // Catch:{ all -> 0x0194 }
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0194 }
            r8.<init>(r3)     // Catch:{ all -> 0x0194 }
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x0194 }
            r3.<init>(r4)     // Catch:{ all -> 0x0194 }
            r18 = r8
            r8 = r0
            r0 = r3
            r3 = r18
        L_0x0152:
            boolean r9 = r3.get()     // Catch:{ all -> 0x0194 }
            if (r9 == 0) goto L_0x0197
            lx3 r9 = r1.b     // Catch:{ all -> 0x0194 }
            defpackage.pag.j(r9)     // Catch:{ all -> 0x0194 }
            je7 r9 = r6.f     // Catch:{ all -> 0x0194 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0194 }
            r15 = r9
            zve r15 = (defpackage.zve) r15     // Catch:{ all -> 0x0194 }
            sj5 r14 = new sj5     // Catch:{ all -> 0x0194 }
            r16 = 0
            r9 = r14
            r10 = r3
            r11 = r6
            r12 = r7
            r13 = r0
            r4 = r14
            r14 = r8
            r17 = r2
            r2 = r15
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0194 }
            r1.v0 = r8     // Catch:{ all -> 0x0194 }
            r1.X = r5     // Catch:{ all -> 0x0194 }
            r1.Y = r6     // Catch:{ all -> 0x0194 }
            r1.Z = r7     // Catch:{ all -> 0x0194 }
            r1.s0 = r3     // Catch:{ all -> 0x0194 }
            r1.t0 = r0     // Catch:{ all -> 0x0194 }
            r9 = 4
            r1.u0 = r9     // Catch:{ all -> 0x0194 }
            java.lang.Object r2 = r2.a(r4, r1)     // Catch:{ all -> 0x0194 }
            r4 = r17
            if (r2 != r4) goto L_0x0191
            return r4
        L_0x0191:
            r2 = r4
            r4 = 0
            goto L_0x0152
        L_0x0194:
            r0 = move-exception
            goto L_0x0022
        L_0x0197:
            r4 = r2
            y77 r2 = r6.p     // Catch:{ all -> 0x0194 }
            c6d r2 = r2.getChildren()     // Catch:{ all -> 0x0194 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0194 }
            r3 = r0
            r0 = r2
            r7 = r8
        L_0x01a5:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0194 }
            if (r2 == 0) goto L_0x01c8
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0194 }
            x77 r2 = (defpackage.x77) r2     // Catch:{ all -> 0x0194 }
            r1.v0 = r7     // Catch:{ all -> 0x0194 }
            r1.X = r5     // Catch:{ all -> 0x0194 }
            r1.Y = r6     // Catch:{ all -> 0x0194 }
            r1.Z = r3     // Catch:{ all -> 0x0194 }
            r1.s0 = r0     // Catch:{ all -> 0x0194 }
            r8 = 0
            r1.t0 = r8     // Catch:{ all -> 0x0194 }
            r8 = 5
            r1.u0 = r8     // Catch:{ all -> 0x0194 }
            java.lang.Object r2 = r2.join(r1)     // Catch:{ all -> 0x0194 }
            if (r2 != r4) goto L_0x01a5
            return r4
        L_0x01c8:
            java.lang.Object r0 = r3.get()     // Catch:{ all -> 0x0194 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0194 }
            if (r0 != 0) goto L_0x01fe
            long r2 = r6.j     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = r6.s     // Catch:{ all -> 0x0194 }
            h8f r8 = new h8f     // Catch:{ all -> 0x0194 }
            r9 = 1120403456(0x42c80000, float:100.0)
            r8.<init>(r9, r2, r0)     // Catch:{ all -> 0x0194 }
            pjc r0 = new pjc     // Catch:{ all -> 0x0194 }
            r0.<init>(r8)     // Catch:{ all -> 0x0194 }
            r1.v0 = r5     // Catch:{ all -> 0x0194 }
            r1.X = r6     // Catch:{ all -> 0x0194 }
            r2 = 0
            r1.Y = r2     // Catch:{ all -> 0x0194 }
            r1.Z = r2     // Catch:{ all -> 0x0194 }
            r1.s0 = r2     // Catch:{ all -> 0x0194 }
            r1.t0 = r2     // Catch:{ all -> 0x0194 }
            r2 = 6
            r1.u0 = r2     // Catch:{ all -> 0x0194 }
            fab r7 = (defpackage.fab) r7     // Catch:{ all -> 0x0194 }
            e32 r2 = r7.a     // Catch:{ all -> 0x0194 }
            java.lang.Object r0 = r2.o(r0, r1)     // Catch:{ all -> 0x0194 }
            if (r0 != r4) goto L_0x01fb
            return r4
        L_0x01fb:
            r1 = r5
            r0 = r6
            goto L_0x0223
        L_0x01fe:
            njc r2 = new njc     // Catch:{ all -> 0x0194 }
            r2.<init>(r0)     // Catch:{ all -> 0x0194 }
            pjc r0 = new pjc     // Catch:{ all -> 0x0194 }
            r0.<init>(r2)     // Catch:{ all -> 0x0194 }
            r1.v0 = r5     // Catch:{ all -> 0x0194 }
            r1.X = r6     // Catch:{ all -> 0x0194 }
            r2 = 0
            r1.Y = r2     // Catch:{ all -> 0x0194 }
            r1.Z = r2     // Catch:{ all -> 0x0194 }
            r1.s0 = r2     // Catch:{ all -> 0x0194 }
            r1.t0 = r2     // Catch:{ all -> 0x0194 }
            r2 = 7
            r1.u0 = r2     // Catch:{ all -> 0x0194 }
            fab r7 = (defpackage.fab) r7     // Catch:{ all -> 0x0194 }
            e32 r2 = r7.a     // Catch:{ all -> 0x0194 }
            java.lang.Object r0 = r2.o(r0, r1)     // Catch:{ all -> 0x0194 }
            if (r0 != r4) goto L_0x01fb
            return r4
        L_0x0223:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0020 }
            long r4 = r0.r     // Catch:{ all -> 0x0020 }
            long r2 = r2 - r4
            java.lang.String r0 = r0.d     // Catch:{ all -> 0x0020 }
            ir6 r4 = defpackage.hm9.m     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x0232
        L_0x0230:
            r2 = 0
            goto L_0x025c
        L_0x0232:
            boolean r5 = r4.c()     // Catch:{ all -> 0x0020 }
            if (r5 == 0) goto L_0x0230
            us7 r5 = defpackage.us7.X     // Catch:{ all -> 0x0020 }
            int r6 = defpackage.ft4.o     // Catch:{ all -> 0x0020 }
            kt4 r6 = defpackage.kt4.MILLISECONDS     // Catch:{ all -> 0x0020 }
            long r2 = defpackage.z7.S(r2, r6)     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = defpackage.ft4.j(r2)     // Catch:{ all -> 0x0020 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0020 }
            r3.<init>()     // Catch:{ all -> 0x0020 }
            java.lang.String r6 = "FileUploadOperation worked for "
            r3.append(r6)     // Catch:{ all -> 0x0020 }
            r3.append(r2)     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0020 }
            r3 = 0
            r4.d(r5, r0, r2, r3)     // Catch:{ all -> 0x0020 }
            goto L_0x0230
        L_0x025c:
            defpackage.v3c.i(r1, r2)
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x0262:
            throw r1     // Catch:{ all -> 0x0263 }
        L_0x0263:
            r0 = move-exception
            r2 = r0
            defpackage.v3c.i(r5, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj5.o(java.lang.Object):java.lang.Object");
    }
}
