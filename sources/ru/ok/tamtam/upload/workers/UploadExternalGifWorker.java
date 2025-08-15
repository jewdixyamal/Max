package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadExternalGifWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "q7f", "m7f", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class UploadExternalGifWorker extends ForegroundWorker {
    public final s7f A0 = new s7f(this);
    public final khe X = new khe(new k7f(this, 10));
    public final khe Y = new khe(new k7f(this, 11));
    public final khe Z = new khe(new k7f(this, 12));
    public final khe a = new khe(new k7f(this, 0));
    public final khe b = new khe(new k7f(this, 7));
    public final khe c = new khe(new k7f(this, 8));
    public final khe o = new khe(new k7f(this, 9));
    public final khe s0 = new khe(new k7f(this, 1));
    public final khe t0 = new khe(new k7f(this, 2));
    public final khe u0 = new khe(new k7f(this, 3));
    public final khe v0 = new khe(new k7f(this, 4));
    public final khe w0 = new khe(new k7f(this, 5));
    public final khe x0 = new khe(new k7f(this, 6));
    public long y0;
    public volatile q7f z0;

    public UploadExternalGifWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static final void c(UploadExternalGifWorker uploadExternalGifWorker) {
        e52 C = ((p82) uploadExternalGifWorker.X.getValue()).C(uploadExternalGifWorker.d().e);
        if (C != null) {
            long j = C.b.a;
            long j2 = uploadExternalGifWorker.d().d;
            ((sna) uploadExternalGifWorker.Z.getValue()).getClass();
            sna.b(j, j2);
        }
        ((mh5) uploadExternalGifWorker.u0.getValue()).b(((kk5) ((zi5) uploadExternalGifWorker.c.getValue())).n(uploadExternalGifWorker.d().f));
    }

    public final Object createForegroundInfo(Continuation continuation) {
        kpa kpa;
        String str;
        q7f q7f = this.z0;
        if (q7f instanceof p7f) {
            p7f p7f = (p7f) q7f;
            kpa = new kpa(new Float(p7f.a), new Long(p7f.b));
        } else {
            kpa = new kpa(new Float(-1.0f), new Long(0));
        }
        float floatValue = ((Number) kpa.a).floatValue();
        long longValue = ((Number) kpa.b).longValue();
        PendingIntent c2 = s7g.d(getApplicationContext()).c(getId());
        e52 C = ((p82) this.X.getValue()).C(d().e);
        qh5 qh5 = (qh5) this.x0.getValue();
        long j = d().e;
        Long l = new Long(longValue);
        Long l2 = new Long(d().d);
        if (C == null || (str = C.q()) == null) {
            str = "";
        }
        return new ay5(((Number) this.b.getValue()).intValue(), qh5.b(j, l, l2, str, getApplicationContext().getString(((qh5) this.x0.getValue()).g), (int) floatValue, false, c2), 1);
    }

    public final m7f d() {
        return (m7f) this.a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017c A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ab A[Catch:{ all -> 0x003a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bd A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.r7f
            if (r2 == 0) goto L_0x0017
            r2 = r1
            r7f r2 = (defpackage.r7f) r2
            int r3 = r2.t0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.t0 = r3
            goto L_0x001c
        L_0x0017:
            r7f r2 = new r7f
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Z
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.t0
            r5 = 3
            r6 = 2
            r7 = 1
            java.lang.String r8 = "ru.ok.tamtam.upload.workers.UploadExternalGifWorker"
            if (r4 == 0) goto L_0x005e
            if (r4 == r7) goto L_0x004e
            if (r4 == r6) goto L_0x0045
            if (r4 != r5) goto L_0x003d
            fm7 r0 = r2.X
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r4 = r2.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x003a }
            r1 = r0
            r0 = r4
            goto L_0x00d1
        L_0x003a:
            r0 = move-exception
            goto L_0x01e0
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            fm7 r0 = r2.X
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r4 = r2.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x003a }
            goto L_0x017e
        L_0x004e:
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r0 = r2.Y
            fm7 r4 = r2.X
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r9 = r2.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x003a }
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x016a
        L_0x005e:
            defpackage.od2.a0(r1)
            java.lang.String r1 = "doWork"
            defpackage.hm9.m(r8, r1, new java.lang.Object[0])
            em7 r1 = defpackage.fm7.b()
            khe r4 = r0.X     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x003a }
            p82 r4 = (defpackage.p82) r4     // Catch:{ all -> 0x003a }
            m7f r9 = r17.d()     // Catch:{ all -> 0x003a }
            long r9 = r9.e     // Catch:{ all -> 0x003a }
            e52 r4 = r4.C(r9)     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0096
            khe r9 = r0.Z     // Catch:{ all -> 0x003a }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x003a }
            r10 = r9
            sna r10 = (defpackage.sna) r10     // Catch:{ all -> 0x003a }
            k92 r4 = r4.b     // Catch:{ all -> 0x003a }
            long r11 = r4.a     // Catch:{ all -> 0x003a }
            b10 r13 = defpackage.b10.PHOTO     // Catch:{ all -> 0x003a }
            m7f r4 = r17.d()     // Catch:{ all -> 0x003a }
            long r14 = r4.d     // Catch:{ all -> 0x003a }
            r10.f(r11, r13, r14)     // Catch:{ all -> 0x003a }
        L_0x0096:
            khe r4 = r0.c     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x003a }
            zi5 r4 = (defpackage.zi5) r4     // Catch:{ all -> 0x003a }
            m7f r9 = r17.d()     // Catch:{ all -> 0x003a }
            java.lang.String r9 = r9.f     // Catch:{ all -> 0x003a }
            kk5 r4 = (defpackage.kk5) r4     // Catch:{ all -> 0x003a }
            java.io.File r4 = r4.n(r9)     // Catch:{ all -> 0x003a }
            boolean r9 = defpackage.pag.k(r4)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x00b6
            s7f r9 = r0.A0     // Catch:{ all -> 0x003a }
            r9.e(r4)     // Catch:{ all -> 0x003a }
            goto L_0x00d1
        L_0x00b6:
            khe r9 = r0.Y     // Catch:{ all -> 0x003a }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x003a }
            gq6 r9 = (defpackage.gq6) r9     // Catch:{ all -> 0x003a }
            m7f r10 = r17.d()     // Catch:{ all -> 0x003a }
            java.lang.String r10 = r10.b     // Catch:{ all -> 0x003a }
            s7f r11 = r0.A0     // Catch:{ all -> 0x003a }
            m7f r12 = r17.d()     // Catch:{ all -> 0x003a }
            java.lang.String r12 = r12.f     // Catch:{ all -> 0x003a }
            iq6 r9 = r9.a     // Catch:{ all -> 0x003a }
            r9.b(r10, r4, r11, r12)     // Catch:{ all -> 0x003a }
        L_0x00d1:
            boolean r4 = r0.isStopped()     // Catch:{ all -> 0x003a }
            if (r4 != 0) goto L_0x01ac
            khe r4 = r0.X     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x003a }
            p82 r4 = (defpackage.p82) r4     // Catch:{ all -> 0x003a }
            m7f r9 = r0.d()     // Catch:{ all -> 0x003a }
            long r9 = r9.e     // Catch:{ all -> 0x003a }
            e52 r4 = r4.C(r9)     // Catch:{ all -> 0x003a }
            rq9 r9 = defpackage.rq9.u0
            if (r4 != 0) goto L_0x00ef
            r0.z0 = r9     // Catch:{ all -> 0x003a }
        L_0x00ef:
            q7f r4 = r0.z0     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x019b
            boolean r9 = r4.equals(r9)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0106
            r1 = 5
            d24 r1 = defpackage.rh4.a(r1)     // Catch:{ all -> 0x003a }
            cm7 r2 = new cm7     // Catch:{ all -> 0x003a }
            r2.<init>(r1)     // Catch:{ all -> 0x003a }
        L_0x0103:
            r1 = r2
            goto L_0x01ac
        L_0x0106:
            boolean r9 = r4 instanceof defpackage.o7f     // Catch:{ all -> 0x003a }
            if (r9 != 0) goto L_0x01ac
            boolean r9 = r4 instanceof defpackage.n7f     // Catch:{ all -> 0x003a }
            if (r9 != 0) goto L_0x01ac
            hx9 r9 = defpackage.hx9.u0     // Catch:{ all -> 0x003a }
            boolean r9 = r4.equals(r9)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0121
            r1 = 4
            d24 r1 = defpackage.rh4.a(r1)     // Catch:{ all -> 0x003a }
            cm7 r2 = new cm7     // Catch:{ all -> 0x003a }
            r2.<init>(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0103
        L_0x0121:
            buc r9 = defpackage.buc.u0     // Catch:{ all -> 0x003a }
            boolean r9 = r4.equals(r9)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0133
            d24 r1 = defpackage.rh4.a(r5)     // Catch:{ all -> 0x003a }
            cm7 r2 = new cm7     // Catch:{ all -> 0x003a }
            r2.<init>(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0103
        L_0x0133:
            boolean r9 = r4 instanceof defpackage.p7f     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0181
            r9 = r4
            p7f r9 = (defpackage.p7f) r9     // Catch:{ all -> 0x003a }
            float r9 = r9.a     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r10.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r11 = "progress "
            r10.append(r11)     // Catch:{ all -> 0x003a }
            r10.append(r9)     // Catch:{ all -> 0x003a }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x003a }
            defpackage.hm9.m(r8, r9, new java.lang.Object[0])     // Catch:{ all -> 0x003a }
            p7f r4 = (defpackage.p7f) r4     // Catch:{ all -> 0x003a }
            float r4 = r4.a     // Catch:{ all -> 0x003a }
            boolean r4 = r0.needToShowNotification(r4)     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x019b
            r2.o = r0     // Catch:{ all -> 0x003a }
            r2.X = r1     // Catch:{ all -> 0x003a }
            r2.Y = r0     // Catch:{ all -> 0x003a }
            r2.t0 = r7     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r0.getForegroundInfo(r2)     // Catch:{ all -> 0x003a }
            if (r4 != r3) goto L_0x0169
            return r3
        L_0x0169:
            r9 = r0
        L_0x016a:
            ay5 r4 = (defpackage.ay5) r4     // Catch:{ all -> 0x003a }
            r2.o = r9     // Catch:{ all -> 0x003a }
            r2.X = r1     // Catch:{ all -> 0x003a }
            r10 = 0
            r2.Y = r10     // Catch:{ all -> 0x003a }
            r2.t0 = r6     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r0.setForeground(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 != r3) goto L_0x017c
            return r3
        L_0x017c:
            r0 = r1
            r4 = r9
        L_0x017e:
            r1 = r0
            r0 = r4
            goto L_0x019b
        L_0x0181:
            huc r1 = defpackage.huc.u0     // Catch:{ all -> 0x003a }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0195
            r1 = 6
            d24 r1 = defpackage.rh4.a(r1)     // Catch:{ all -> 0x003a }
            cm7 r2 = new cm7     // Catch:{ all -> 0x003a }
            r2.<init>(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0103
        L_0x0195:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x003a }
            r0.<init>()     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x019b:
            long r9 = r0.getWorkDelay()     // Catch:{ all -> 0x003a }
            r2.o = r0     // Catch:{ all -> 0x003a }
            r2.X = r1     // Catch:{ all -> 0x003a }
            r2.t0 = r5     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = defpackage.j47.x(r9, r2)     // Catch:{ all -> 0x003a }
            if (r4 != r3) goto L_0x00d1
            return r3
        L_0x01ac:
            java.lang.String r2 = "doWork %s"
            q7f r3 = r0.z0     // Catch:{ all -> 0x003a }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x003a }
            defpackage.hm9.m(r8, r2, r3)     // Catch:{ all -> 0x003a }
            q7f r2 = r0.z0     // Catch:{ all -> 0x003a }
            boolean r3 = r2 instanceof defpackage.n7f     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x01e9
            khe r3 = r0.v0     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x003a }
            r9 = r3
            dg5 r9 = (defpackage.dg5) r9     // Catch:{ all -> 0x003a }
            n7f r2 = (defpackage.n7f) r2     // Catch:{ all -> 0x003a }
            y95 r10 = r2.a     // Catch:{ all -> 0x003a }
            m7f r2 = r0.d()     // Catch:{ all -> 0x003a }
            long r11 = r2.d     // Catch:{ all -> 0x003a }
            m7f r2 = r0.d()     // Catch:{ all -> 0x003a }
            long r13 = r2.e     // Catch:{ all -> 0x003a }
            m7f r0 = r0.d()     // Catch:{ all -> 0x003a }
            java.lang.String r15 = r0.c     // Catch:{ all -> 0x003a }
            r9.c(r10, r11, r13, r15)     // Catch:{ all -> 0x003a }
            goto L_0x01e9
        L_0x01e0:
            java.lang.String r1 = "failure!"
            defpackage.hm9.p(r8, r1, r0)
            cm7 r1 = defpackage.fm7.a()
        L_0x01e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadExternalGifWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String getName() {
        String e = getInputData().e("taskName");
        return e == null ? "ru.ok.tamtam.upload.workers.UploadExternalGifWorker" : e;
    }
}
