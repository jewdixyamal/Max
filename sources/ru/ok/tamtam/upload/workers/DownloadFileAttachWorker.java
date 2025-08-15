package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "un4", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class DownloadFileAttachWorker extends ForegroundWorker {
    public final AtomicInteger A0 = new AtomicInteger();
    public int B0;
    public long C0;
    public volatile un4 D0;
    public File E0;
    public final ao4 F0 = new ao4(this);
    public final khe X = new khe(new ln4(this, 1));
    public final khe Y = new khe(new ln4(this, 2));
    public final khe Z = new khe(new ln4(this, 3));
    public final khe a = new khe(new ln4(this, 0));
    public final khe b = new khe(new ln4(this, 12));
    public final khe c = new khe(new ln4(this, 13));
    public final khe o = new khe(new ln4(this, 14));
    public final khe s0 = new khe(new ln4(this, 4));
    public final khe t0 = new khe(new ln4(this, 5));
    public final khe u0 = new khe(new ln4(this, 6));
    public final khe v0 = new khe(new ln4(this, 7));
    public final khe w0 = new khe(new ln4(this, 8));
    public final khe x0 = new khe(new ln4(this, 9));
    public final khe y0 = new khe(new ln4(this, 10));
    public final khe z0 = new khe(new ln4(this, 11));

    public DownloadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final Object c(hu3 hu3) {
        File file = this.E0;
        File file2 = null;
        if (file == null) {
            file = null;
        }
        hm9.m("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. CancelLoading: %s", file);
        dfe dfe = (dfe) this.Y.getValue();
        File file3 = this.E0;
        if (file3 != null) {
            file2 = file3;
        }
        Object b2 = dfe.a.b(file2, g().b, hu3);
        return b2 == tx3.a ? b2 : e5f.a;
    }

    public final Object createForegroundInfo(Continuation continuation) {
        long j;
        long j2;
        float f;
        Object obj;
        PendingIntent c2 = s7g.d(getApplicationContext()).c(getId());
        un4 un4 = this.D0;
        File file = null;
        sn4 sn4 = un4 instanceof sn4 ? (sn4) un4 : null;
        if (sn4 != null) {
            f = sn4.a;
            long j3 = sn4.b;
            j2 = sn4.c;
            j = j3;
        } else {
            j2 = 0;
            f = -1.0f;
            j = 0;
        }
        e52 C = ((p82) this.X.getValue()).C(j2);
        String string = getApplicationContext().getString(((qh5) this.w0.getValue()).e);
        qh5 qh5 = (qh5) this.w0.getValue();
        Long l = new Long(j);
        Long l2 = new Long(g().a);
        String q = C != null ? C.q() : null;
        try {
            File file2 = this.E0;
            if (file2 != null) {
                file = file2;
            }
            obj = file.getName();
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (obj instanceof njc) {
            obj = "";
        }
        return new ay5(((Number) this.b.getValue()).intValue(), qh5.b(j2, l, l2, q, string + " " + obj, tu0.G(f), false, c2), 1);
    }

    public final zi5 d() {
        return (zi5) this.c.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116 A[Catch:{ all -> 0x0048 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0134 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof defpackage.vn4
            if (r2 == 0) goto L_0x0017
            r2 = r0
            vn4 r2 = (defpackage.vn4) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001c
        L_0x0017:
            vn4 r2 = new vn4
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.X
            tx3 r10 = defpackage.tx3.a
            int r3 = r2.Z
            r11 = 1
            r12 = 4
            r4 = 2
            r13 = 3
            r14 = 5
            java.lang.String r15 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r9 = 0
            if (r3 == 0) goto L_0x0058
            if (r3 == r11) goto L_0x0052
            if (r3 == r4) goto L_0x004b
            if (r3 == r13) goto L_0x0041
            if (r3 != r12) goto L_0x0039
            defpackage.od2.a0(r0)
            goto L_0x01a1
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0117
        L_0x0048:
            r0 = move-exception
            goto L_0x018d
        L_0x004b:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x00e3
        L_0x0052:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0086
        L_0x0058:
            defpackage.od2.a0(r0)
            java.lang.String r0 = "File download. doWork %s"
            pne r3 = r16.g()     // Catch:{ all -> 0x0048 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0048 }
            defpackage.hm9.m(r15, r0, r3)     // Catch:{ all -> 0x0048 }
            khe r0 = r1.x0     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0048 }
            kke r0 = (defpackage.kke) r0     // Catch:{ all -> 0x0048 }
            w9a r0 = (defpackage.w9a) r0     // Catch:{ all -> 0x0048 }
            nx3 r0 = r0.b()     // Catch:{ all -> 0x0048 }
            wn4 r3 = new wn4     // Catch:{ all -> 0x0048 }
            r3.<init>(r1, r9)     // Catch:{ all -> 0x0048 }
            r2.o = r1     // Catch:{ all -> 0x0048 }
            r2.Z = r11     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = defpackage.j47.t0(r0, r3, r2)     // Catch:{ all -> 0x0048 }
            if (r0 != r10) goto L_0x0086
            return r10
        L_0x0086:
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0094
            d24 r0 = defpackage.rh4.a(r4)     // Catch:{ all -> 0x0048 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            return r3
        L_0x0094:
            r1.E0 = r0     // Catch:{ all -> 0x0048 }
            khe r0 = r1.y0     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0048 }
            gh3 r0 = (defpackage.gh3) r0     // Catch:{ all -> 0x0048 }
            r2.o = r1     // Catch:{ all -> 0x0048 }
            r2.getClass()     // Catch:{ all -> 0x0048 }
            r2.Z = r4     // Catch:{ all -> 0x0048 }
            sy1 r3 = new sy1     // Catch:{ all -> 0x0048 }
            kotlin.coroutines.Continuation r4 = defpackage.v3c.u(r2)     // Catch:{ all -> 0x0048 }
            r3.<init>(r11, r4)     // Catch:{ all -> 0x0048 }
            r3.n()     // Catch:{ all -> 0x0048 }
            boolean r4 = r0.f()     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x00bd
            e5f r0 = defpackage.e5f.a     // Catch:{ all -> 0x0048 }
            r3.resumeWith(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x00dc
        L_0x00bd:
            fr1 r4 = new fr1     // Catch:{ all -> 0x0048 }
            r5 = 1
            r4.<init>(r0, r3, r5)     // Catch:{ all -> 0x0048 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x0048 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "Network connection lost, waiting network."
            defpackage.hm9.m(r5, r6, new java.lang.Object[0])     // Catch:{ all -> 0x0048 }
            r0.c(r4)     // Catch:{ all -> 0x0048 }
            zp1 r5 = new zp1     // Catch:{ all -> 0x0048 }
            r6 = 3
            r5.<init>(r0, r6, r4)     // Catch:{ all -> 0x0048 }
            r3.d(r5)     // Catch:{ all -> 0x0048 }
        L_0x00dc:
            java.lang.Object r0 = r3.m()     // Catch:{ all -> 0x0048 }
            if (r0 != r10) goto L_0x00e3
            return r10
        L_0x00e3:
            khe r0 = r1.Y     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0048 }
            dfe r0 = (defpackage.dfe) r0     // Catch:{ all -> 0x0048 }
            pne r3 = r1.g()     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = r3.g     // Catch:{ all -> 0x0048 }
            java.io.File r3 = r1.E0     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x00f7
            r5 = r9
            goto L_0x00f8
        L_0x00f7:
            r5 = r3
        L_0x00f8:
            ao4 r6 = r1.F0     // Catch:{ all -> 0x0048 }
            pne r3 = r1.g()     // Catch:{ all -> 0x0048 }
            java.lang.String r7 = r3.b     // Catch:{ all -> 0x0048 }
            pne r3 = r1.g()     // Catch:{ all -> 0x0048 }
            boolean r8 = r3.m     // Catch:{ all -> 0x0048 }
            r2.o = r1     // Catch:{ all -> 0x0048 }
            r2.getClass()     // Catch:{ all -> 0x0048 }
            r2.Z = r13     // Catch:{ all -> 0x0048 }
            efe r3 = r0.a     // Catch:{ all -> 0x0048 }
            r9 = r2
            java.lang.Object r0 = r3.a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0048 }
            if (r0 != r10) goto L_0x0117
            return r10
        L_0x0117:
            bfe r0 = (defpackage.bfe) r0     // Catch:{ all -> 0x0048 }
            bfe r3 = defpackage.bfe.a     // Catch:{ all -> 0x0048 }
            if (r0 != r3) goto L_0x0134
            java.lang.String r0 = "File download. Process: already downloading file %s"
            pne r3 = r1.g()     // Catch:{ all -> 0x0048 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0048 }
            defpackage.hm9.m(r15, r0, r3)     // Catch:{ all -> 0x0048 }
            d24 r0 = defpackage.rh4.a(r11)     // Catch:{ all -> 0x0048 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            return r3
        L_0x0134:
            un4 r0 = r1.D0     // Catch:{ all -> 0x0048 }
            boolean r3 = r0 instanceof defpackage.rn4     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0151
            rn4 r0 = (defpackage.rn4) r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.a     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0146
            dm7 r0 = new dm7     // Catch:{ all -> 0x0048 }
            r0.<init>()     // Catch:{ all -> 0x0048 }
            goto L_0x01ab
        L_0x0146:
            d24 r0 = defpackage.rh4.a(r13)     // Catch:{ all -> 0x0048 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
        L_0x014f:
            r0 = r3
            goto L_0x01ab
        L_0x0151:
            qn4 r3 = defpackage.qn4.a     // Catch:{ all -> 0x0048 }
            boolean r3 = defpackage.tpa.f(r0, r3)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0163
            d24 r0 = defpackage.rh4.a(r12)     // Catch:{ all -> 0x0048 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x014f
        L_0x0163:
            on4 r3 = defpackage.on4.a     // Catch:{ all -> 0x0048 }
            boolean r3 = defpackage.tpa.f(r0, r3)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0175
            d24 r0 = defpackage.rh4.a(r14)     // Catch:{ all -> 0x0048 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x014f
        L_0x0175:
            tn4 r3 = defpackage.tn4.a     // Catch:{ all -> 0x0048 }
            boolean r0 = defpackage.tpa.f(r0, r3)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0188
            r0 = 6
            d24 r0 = defpackage.rh4.a(r0)     // Catch:{ all -> 0x0048 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x014f
        L_0x0188:
            em7 r0 = defpackage.fm7.b()     // Catch:{ all -> 0x0048 }
            goto L_0x01ab
        L_0x018d:
            java.lang.String r3 = "File download. Cancelled!"
            defpackage.hm9.l0(r15, r3, r0)
            r3 = 0
            r2.o = r3
            r2.getClass()
            r2.Z = r12
            java.lang.Object r0 = r1.c(r2)
            if (r0 != r10) goto L_0x01a1
            return r10
        L_0x01a1:
            d24 r0 = defpackage.rh4.a(r14)
            cm7 r1 = new cm7
            r1.<init>(r0)
            r0 = r1
        L_0x01ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final au8 e() {
        return (au8) this.o.getValue();
    }

    public final pne g() {
        return (pne) this.a.getValue();
    }

    public final nx3 getCoroutineContext() {
        return (nx3) ((w9a) ((kke) this.x0.getValue())).d.getValue();
    }

    public final String getName() {
        String e = getInputData().e("taskName");
        return e == null ? "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker" : e;
    }

    public final long getWorkDelay() {
        return 500;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.cu8 r23, defpackage.d20 r24, int r25, long r26, long r28, java.io.File r30, kotlin.coroutines.Continuation r31) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r10 = r25
            r2 = r31
            boolean r3 = r2 instanceof defpackage.bo4
            if (r3 == 0) goto L_0x001b
            r3 = r2
            bo4 r3 = (defpackage.bo4) r3
            int r4 = r3.t0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.t0 = r4
            goto L_0x0020
        L_0x001b:
            bo4 r3 = new bo4
            r3.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r3.Z
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.t0
            e5f r11 = defpackage.e5f.a
            r6 = 1
            if (r5 == 0) goto L_0x0042
            if (r5 != r6) goto L_0x003a
            long r0 = r3.Y
            cu8 r4 = r3.X
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r3.o
            defpackage.od2.a0(r2)
            r13 = r0
            r0 = r3
            r1 = r4
            goto L_0x0084
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            defpackage.od2.a0(r2)
            if (r1 == 0) goto L_0x004d
            vx8 r2 = r1.v0
            vx8 r5 = defpackage.vx8.DELETED
            if (r2 != r5) goto L_0x0051
        L_0x004d:
            r31 = r11
            goto L_0x0157
        L_0x0051:
            pne r2 = r22.g()
            java.lang.String r2 = r2.b
            l20 r12 = defpackage.s5c.A(r1, r2)
            if (r12 != 0) goto L_0x005e
            return r11
        L_0x005e:
            d20 r2 = r12.o
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x009b
            boolean r2 = r24.a()
            if (r2 != 0) goto L_0x009b
            java.lang.String r2 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            java.lang.String r5 = "File download. updateAttachStatus: cancelled!"
            defpackage.hm9.m0(r2, r5, new java.lang.Object[0])
            r3.o = r0
            r3.X = r1
            r13 = r28
            r3.Y = r13
            r3.t0 = r6
            java.lang.Object r2 = r0.c(r3)
            if (r2 != r4) goto L_0x0084
            return r4
        L_0x0084:
            on4 r2 = defpackage.on4.a
            r0.D0 = r2
            khe r0 = r0.z0
            java.lang.Object r0 = r0.getValue()
            d00 r0 = (defpackage.d00) r0
            o5c r2 = new o5c
            long r3 = r1.b
            r2.<init>(r3, r13)
            r0.a(r2)
            return r11
        L_0x009b:
            r13 = r28
            r0.B0 = r10
            au8 r15 = r22.e()
            pne r2 = r22.g()
            long r7 = r2.a
            java.lang.String r9 = r12.r
            mn4 r5 = new mn4
            r2 = r5
            r3 = r24
            r4 = r25
            r13 = r5
            r5 = r26
            r31 = r11
            r10 = r7
            r7 = r28
            r14 = r9
            r9 = r30
            r2.<init>(r3, r4, r5, r7, r9)
            r15.v(r10, r14, r13)
            int r2 = r24.ordinal()
            r3 = 2
            if (r2 == r3) goto L_0x0126
            r3 = 4
            if (r2 == r3) goto L_0x00e2
            khe r2 = r0.z0
            java.lang.Object r2 = r2.getValue()
            d00 r2 = (defpackage.d00) r2
            o5c r3 = new o5c
            long r4 = r1.b
            long r6 = r12.u
            r3.<init>(r4, r6)
            r2.a(r3)
            goto L_0x013a
        L_0x00e2:
            boolean r2 = r12.c()
            r3 = 0
            if (r2 == 0) goto L_0x00ec
            s10 r2 = r12.j
            goto L_0x00ed
        L_0x00ec:
            r2 = r3
        L_0x00ed:
            khe r4 = r0.z0
            java.lang.Object r4 = r4.getValue()
            d00 r4 = (defpackage.d00) r4
            long r13 = r1.b
            r5 = r25
            float r5 = (float) r5
            if (r2 == 0) goto L_0x0106
            long r6 = r2.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            r20 = r8
            goto L_0x0108
        L_0x0106:
            r20 = r3
        L_0x0108:
            if (r2 == 0) goto L_0x0114
            long r2 = r2.b
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r2)
            r21 = r6
            goto L_0x0116
        L_0x0114:
            r21 = r3
        L_0x0116:
            n5c r2 = new n5c
            r12 = r2
            r15 = r28
            r17 = r5
            r18 = r26
            r12.<init>(r13, r15, r17, r18, r20, r21)
            r4.a(r2)
            goto L_0x013a
        L_0x0126:
            khe r2 = r0.z0
            java.lang.Object r2 = r2.getValue()
            d00 r2 = (defpackage.d00) r2
            p5c r3 = new p5c
            long r4 = r1.b
            long r6 = r12.u
            r3.<init>(r4, r6)
            r2.a(r3)
        L_0x013a:
            khe r0 = r0.u0
            java.lang.Object r0 = r0.getValue()
            av0 r0 = (defpackage.av0) r0
            l6f r2 = new l6f
            long r3 = r1.t0
            long r5 = r1.b
            r1 = 0
            r22 = r2
            r23 = r3
            r25 = r5
            r27 = r1
            r22.<init>(r23, r25, r27)
            r0.c(r2)
        L_0x0157:
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.h(cu8, d20, int, long, long, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object onStopWork(Continuation continuation) {
        hm9.m("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. OnStopWork", new Object[0]);
        dfe dfe = (dfe) this.Y.getValue();
        File file = this.E0;
        if (file == null) {
            file = null;
        }
        Object c2 = dfe.a.c(file, g().b, continuation);
        return c2 == tx3.a ? c2 : e5f.a;
    }
}
