package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileFromWebAppWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "io4", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class DownloadFileFromWebAppWorker extends ForegroundWorker {
    public final khe X = new khe(new co4(this, 4));
    public final khe Y = new khe(new co4(this, 5));
    public final khe Z = new khe(new co4(this, 6));
    public final khe a = new khe(new co4(this, 0));
    public final khe b = new khe(new co4(this, 1));
    public final khe c = new khe(new co4(this, 2));
    public final khe o = new khe(new co4(this, 3));
    public final khe s0 = new khe(new co4(this, 7));
    public final khe t0 = new khe(new co4(this, 8));
    public final khe u0 = new khe(new co4(this, 9));
    public final AtomicInteger v0 = new AtomicInteger();
    public long w0;
    public volatile io4 x0;
    public File y0;
    public final mo4 z0 = new mo4(this);

    public DownloadFileFromWebAppWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final yne c() {
        return (yne) this.a.getValue();
    }

    public final Object createForegroundInfo(Continuation continuation) {
        long j;
        long j2;
        float f;
        Object obj;
        PendingIntent c2 = s7g.d(getApplicationContext()).c(getId());
        io4 io4 = this.x0;
        ho4 ho4 = io4 instanceof ho4 ? (ho4) io4 : null;
        if (ho4 != null) {
            f = ho4.a;
            j2 = ho4.b;
            j = ho4.c;
        } else {
            j2 = 0;
            f = -1.0f;
            j = 0;
        }
        String string = getApplicationContext().getString(((qh5) this.Z.getValue()).e);
        uj3 uj3 = (uj3) ((ds3) this.u0.getValue()).c(j).a.getValue();
        String d = uj3 != null ? uj3.d() : null;
        qh5 qh5 = (qh5) this.Z.getValue();
        try {
            File file = this.y0;
            if (file == null) {
                file = null;
            }
            obj = file.getName();
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (obj instanceof njc) {
            obj = "";
        }
        String str = string + " " + obj;
        int G = tu0.G(f);
        qh5.getClass();
        int hashCode = Long.hashCode(j);
        bea bea = qh5.b;
        bea.getClass();
        vw7 vw7 = vw7.c;
        osf osf = osf.FROM_NOTIFICATION;
        vw7.getClass();
        return new ay5(((Number) this.b.getValue()).intValue(), qh5.a(d, str, Long.valueOf(j2), false, G, oag.p(qh5.a, hashCode, bea.k(vw7.c2(j, osf, (String) null))), c2), 1);
    }

    public final av0 d() {
        return (av0) this.o.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db A[Catch:{ all -> 0x004e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107 A[Catch:{ all -> 0x0125 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0127 A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof defpackage.jo4
            if (r2 == 0) goto L_0x0017
            r2 = r0
            jo4 r2 = (defpackage.jo4) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001c
        L_0x0017:
            jo4 r2 = new jo4
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.X
            tx3 r10 = defpackage.tx3.a
            int r3 = r2.Z
            do4 r11 = defpackage.do4.a
            e5f r12 = defpackage.e5f.a
            r13 = 1
            r14 = 4
            r15 = 3
            r16 = 5
            r4 = 2
            java.lang.String r9 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker"
            r8 = 0
            if (r3 == 0) goto L_0x005f
            if (r3 == r13) goto L_0x0059
            if (r3 == r4) goto L_0x0052
            if (r3 == r15) goto L_0x0046
            if (r3 != r14) goto L_0x003e
            defpackage.od2.a0(r0)
            goto L_0x01d7
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x004e }
            r14 = r9
            goto L_0x0108
        L_0x004e:
            r0 = move-exception
            r14 = r9
            goto L_0x0188
        L_0x0052:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x004e }
            goto L_0x00dc
        L_0x0059:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x004e }
            goto L_0x008d
        L_0x005f:
            defpackage.od2.a0(r0)
            java.lang.String r0 = "File download. doWork %s"
            yne r3 = r17.c()     // Catch:{ all -> 0x004e }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x004e }
            defpackage.hm9.m(r9, r0, r3)     // Catch:{ all -> 0x004e }
            khe r0 = r1.s0     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004e }
            kke r0 = (defpackage.kke) r0     // Catch:{ all -> 0x004e }
            w9a r0 = (defpackage.w9a) r0     // Catch:{ all -> 0x004e }
            nx3 r0 = r0.b()     // Catch:{ all -> 0x004e }
            ko4 r3 = new ko4     // Catch:{ all -> 0x004e }
            r3.<init>(r1, r8)     // Catch:{ all -> 0x004e }
            r2.o = r1     // Catch:{ all -> 0x004e }
            r2.Z = r13     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = defpackage.j47.t0(r0, r3, r2)     // Catch:{ all -> 0x004e }
            if (r0 != r10) goto L_0x008d
            return r10
        L_0x008d:
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x004e }
            r1.y0 = r0     // Catch:{ all -> 0x004e }
            khe r0 = r1.t0     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004e }
            gh3 r0 = (defpackage.gh3) r0     // Catch:{ all -> 0x004e }
            r2.o = r1     // Catch:{ all -> 0x004e }
            r2.getClass()     // Catch:{ all -> 0x004e }
            r2.Z = r4     // Catch:{ all -> 0x004e }
            sy1 r3 = new sy1     // Catch:{ all -> 0x004e }
            kotlin.coroutines.Continuation r4 = defpackage.v3c.u(r2)     // Catch:{ all -> 0x004e }
            r3.<init>(r13, r4)     // Catch:{ all -> 0x004e }
            r3.n()     // Catch:{ all -> 0x004e }
            boolean r4 = r0.f()     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x00b6
            r3.resumeWith(r12)     // Catch:{ all -> 0x004e }
            goto L_0x00d5
        L_0x00b6:
            fr1 r4 = new fr1     // Catch:{ all -> 0x004e }
            r5 = 1
            r4.<init>(r0, r3, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "Network connection lost, waiting network."
            defpackage.hm9.m(r5, r6, new java.lang.Object[0])     // Catch:{ all -> 0x004e }
            r0.c(r4)     // Catch:{ all -> 0x004e }
            zp1 r5 = new zp1     // Catch:{ all -> 0x004e }
            r6 = 3
            r5.<init>(r0, r6, r4)     // Catch:{ all -> 0x004e }
            r3.d(r5)     // Catch:{ all -> 0x004e }
        L_0x00d5:
            java.lang.Object r0 = r3.m()     // Catch:{ all -> 0x004e }
            if (r0 != r10) goto L_0x00dc
            return r10
        L_0x00dc:
            khe r0 = r1.X     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004e }
            dfe r0 = (defpackage.dfe) r0     // Catch:{ all -> 0x004e }
            yne r3 = r1.c()     // Catch:{ all -> 0x004e }
            java.lang.String r4 = r3.c     // Catch:{ all -> 0x004e }
            java.io.File r3 = r1.y0     // Catch:{ all -> 0x004e }
            if (r3 != 0) goto L_0x00f0
            r5 = r8
            goto L_0x00f1
        L_0x00f0:
            r5 = r3
        L_0x00f1:
            mo4 r6 = r1.z0     // Catch:{ all -> 0x004e }
            r2.o = r1     // Catch:{ all -> 0x004e }
            r2.getClass()     // Catch:{ all -> 0x004e }
            r2.Z = r15     // Catch:{ all -> 0x004e }
            efe r3 = r0.a     // Catch:{ all -> 0x004e }
            r7 = 0
            r0 = 1
            r8 = r0
            r14 = r9
            r9 = r2
            java.lang.Object r0 = r3.a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0125 }
            if (r0 != r10) goto L_0x0108
            return r10
        L_0x0108:
            bfe r0 = (defpackage.bfe) r0     // Catch:{ all -> 0x0125 }
            bfe r3 = defpackage.bfe.a     // Catch:{ all -> 0x0125 }
            if (r0 != r3) goto L_0x0127
            java.lang.String r0 = "File download. Process: already downloading file %s"
            yne r3 = r1.c()     // Catch:{ all -> 0x0125 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0125 }
            defpackage.hm9.m(r14, r0, r3)     // Catch:{ all -> 0x0125 }
            d24 r0 = defpackage.rh4.a(r13)     // Catch:{ all -> 0x0125 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0125 }
            r3.<init>(r0)     // Catch:{ all -> 0x0125 }
            return r3
        L_0x0125:
            r0 = move-exception
            goto L_0x0188
        L_0x0127:
            io4 r0 = r1.x0     // Catch:{ all -> 0x0125 }
            boolean r3 = r0 instanceof defpackage.go4     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x0146
            go4 r0 = (defpackage.go4) r0     // Catch:{ all -> 0x0125 }
            boolean r0 = r0.a     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x013a
            dm7 r0 = new dm7     // Catch:{ all -> 0x0125 }
            r0.<init>()     // Catch:{ all -> 0x0125 }
            goto L_0x01e1
        L_0x013a:
            d24 r0 = defpackage.rh4.a(r15)     // Catch:{ all -> 0x0125 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0125 }
            r3.<init>(r0)     // Catch:{ all -> 0x0125 }
        L_0x0143:
            r0 = r3
            goto L_0x01e1
        L_0x0146:
            fo4 r3 = defpackage.fo4.a     // Catch:{ all -> 0x0125 }
            boolean r3 = defpackage.tpa.f(r0, r3)     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x0159
            r3 = 4
            d24 r0 = defpackage.rh4.a(r3)     // Catch:{ all -> 0x0125 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0125 }
            r3.<init>(r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0143
        L_0x0159:
            boolean r3 = defpackage.tpa.f(r0, r11)     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x0169
            d24 r0 = defpackage.rh4.a(r16)     // Catch:{ all -> 0x0125 }
            cm7 r3 = new cm7     // Catch:{ all -> 0x0125 }
            r3.<init>(r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0143
        L_0x0169:
            eo4 r3 = defpackage.eo4.a     // Catch:{ all -> 0x0125 }
            boolean r3 = defpackage.tpa.f(r0, r3)     // Catch:{ all -> 0x0125 }
            if (r3 != 0) goto L_0x0183
            if (r0 != 0) goto L_0x0174
            goto L_0x0183
        L_0x0174:
            boolean r0 = r0 instanceof defpackage.ho4     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x017d
            em7 r0 = defpackage.fm7.b()     // Catch:{ all -> 0x0125 }
            goto L_0x01e1
        L_0x017d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0125 }
            r0.<init>()     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x0183:
            em7 r0 = defpackage.fm7.b()     // Catch:{ all -> 0x0125 }
            goto L_0x01e1
        L_0x0188:
            java.lang.String r3 = "File download. Cancelled!"
            defpackage.hm9.l0(r14, r3, r0)
            r3 = 0
            r2.o = r3
            r2.getClass()
            r4 = 4
            r2.Z = r4
            java.io.File r8 = r1.y0
            if (r8 != 0) goto L_0x019b
            r8 = r3
        L_0x019b:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            java.lang.String r4 = "File download. CancelLoading: %s"
            defpackage.hm9.m(r14, r4, r0)
            av0 r0 = r1.d()
            xg5 r4 = new xg5
            yne r5 = r1.c()
            long r5 = r5.a
            yne r7 = r1.c()
            java.lang.String r7 = r7.c
            r4.<init>(r5)
            r0.c(r4)
            r1.x0 = r11
            khe r0 = r1.X
            java.lang.Object r0 = r0.getValue()
            dfe r0 = (defpackage.dfe) r0
            java.io.File r8 = r1.y0
            if (r8 != 0) goto L_0x01cb
            r8 = r3
        L_0x01cb:
            efe r0 = r0.a
            java.lang.Object r0 = r0.b(r8, r3, r2)
            if (r0 != r10) goto L_0x01d4
            r12 = r0
        L_0x01d4:
            if (r12 != r10) goto L_0x01d7
            return r10
        L_0x01d7:
            d24 r0 = defpackage.rh4.a(r16)
            cm7 r1 = new cm7
            r1.<init>(r0)
            r0 = r1
        L_0x01e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final nx3 getCoroutineContext() {
        return (nx3) ((w9a) ((kke) this.s0.getValue())).d.getValue();
    }

    public final String getName() {
        String e = getInputData().e("taskName");
        return e == null ? "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker" : e;
    }

    public final long getWorkDelay() {
        return 500;
    }

    public final Object onStopWork(Continuation continuation) {
        hm9.m("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "File download. OnStopWork", new Object[0]);
        av0 d = d();
        long j = c().a;
        String str = c().c;
        d.c(new xg5(j));
        this.x0 = do4.a;
        dfe dfe = (dfe) this.X.getValue();
        File file = this.y0;
        if (file == null) {
            file = null;
        }
        Object c2 = dfe.a.c(file, (String) null, continuation);
        return c2 == tx3.a ? c2 : e5f.a;
    }
}
