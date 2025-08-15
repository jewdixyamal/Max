package ru.ok.tamtam.location.live;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/location/live/LiveLocationWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class LiveLocationWorker extends SdkCoroutineWorker {
    public final khe a = new khe(new hn7(this, 0));
    public final khe b = new khe(new hn7(this, 1));
    public final khe c = new khe(new hn7(this, 2));

    public LiveLocationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final long c() {
        return ((Number) this.a.getValue()).longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0119 A[Catch:{ all -> 0x011a, all -> 0x00a1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.in7
            if (r0 == 0) goto L_0x0013
            r0 = r13
            in7 r0 = (defpackage.in7) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            in7 r0 = new in7
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            java.lang.String r4 = "LIVE_LOCATION_WORKER"
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L_0x0063
            if (r2 == r3) goto L_0x004f
            if (r2 == r6) goto L_0x0044
            if (r2 != r5) goto L_0x003c
            java.lang.String r12 = r0.X
            ru.ok.tamtam.location.live.LiveLocationWorker r2 = r0.o
            defpackage.od2.a0(r13)     // Catch:{ all -> 0x0036 }
            r13 = r12
            r12 = r2
            goto L_0x00a4
        L_0x0036:
            r13 = move-exception
            r0 = r13
            r13 = r12
            r12 = r2
            goto L_0x0123
        L_0x003c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0044:
            java.lang.String r12 = r0.X
            ru.ok.tamtam.location.live.LiveLocationWorker r2 = r0.o
            defpackage.od2.a0(r13)     // Catch:{ all -> 0x0036 }
            r13 = r12
            r12 = r2
            goto L_0x010b
        L_0x004f:
            ru.ok.tamtam.location.live.LiveLocationWorker r12 = r0.Y
            java.lang.String r2 = r0.X
            ru.ok.tamtam.location.live.LiveLocationWorker r7 = r0.o
            defpackage.od2.a0(r13)     // Catch:{ all -> 0x005d }
            r11 = r2
            r2 = r13
            r13 = r11
            goto L_0x00f8
        L_0x005d:
            r13 = move-exception
            r0 = r13
            r13 = r2
        L_0x0060:
            r12 = r7
            goto L_0x0123
        L_0x0063:
            defpackage.od2.a0(r13)
            d24 r13 = r12.getInputData()
            java.lang.String r2 = "workName"
            java.lang.String r13 = r13.e(r2)
            if (r13 != 0) goto L_0x0073
            r13 = r4
        L_0x0073:
            java.lang.String r2 = "doWork"
            defpackage.hm9.m(r13, r2, new java.lang.Object[0])
            fke r2 = r12.getTamComponent()
            jyc r2 = (defpackage.jyc) r2
            ri4 r2 = r2.h()
            r2.f(r13)
            long r7 = r12.c()     // Catch:{ all -> 0x00a1 }
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a4
            fke r0 = r12.getTamComponent()     // Catch:{ all -> 0x00a1 }
            jyc r0 = (defpackage.jyc) r0     // Catch:{ all -> 0x00a1 }
            ri4 r0 = r0.h()     // Catch:{ all -> 0x00a1 }
            r0.g(r13)     // Catch:{ all -> 0x00a1 }
            cm7 r12 = defpackage.fm7.a()     // Catch:{ all -> 0x00a1 }
            return r12
        L_0x00a1:
            r0 = move-exception
            goto L_0x0123
        L_0x00a4:
            boolean r2 = r12.isStopped()     // Catch:{ all -> 0x00a1 }
            if (r2 != 0) goto L_0x011e
            r2 = 0
            khe r7 = r12.c     // Catch:{ all -> 0x00cd }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x00cd }
            cn7 r7 = (defpackage.cn7) r7     // Catch:{ all -> 0x00cd }
            r12.c()     // Catch:{ all -> 0x00cd }
            dn7 r7 = (defpackage.dn7) r7     // Catch:{ all -> 0x00cd }
            r7.getClass()     // Catch:{ all -> 0x00cd }
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00cd }
            q1a r7 = defpackage.iqd.g(r7)     // Catch:{ all -> 0x00cd }
            java.lang.Object r7 = r7.e()     // Catch:{ all -> 0x00cd }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00cd }
            if (r7 == 0) goto L_0x00cd
            boolean r2 = r7.booleanValue()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            if (r2 == 0) goto L_0x011e
            fke r2 = r12.getTamComponent()     // Catch:{ all -> 0x00a1 }
            jyc r2 = (defpackage.jyc) r2     // Catch:{ all -> 0x00a1 }
            m7b r2 = r2.q()     // Catch:{ all -> 0x00a1 }
            p7b r2 = (defpackage.p7b) r2     // Catch:{ all -> 0x00a1 }
            z7d r2 = r2.b     // Catch:{ all -> 0x00a1 }
            r2.getClass()     // Catch:{ all -> 0x00a1 }
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f58livelocationenabled     // Catch:{ all -> 0x00a1 }
            boolean r2 = r2.n(r7, r3)     // Catch:{ all -> 0x00a1 }
            if (r2 == 0) goto L_0x011e
            r0.o = r12     // Catch:{ all -> 0x00a1 }
            r0.X = r13     // Catch:{ all -> 0x00a1 }
            r0.Y = r12     // Catch:{ all -> 0x00a1 }
            r0.t0 = r3     // Catch:{ all -> 0x00a1 }
            java.lang.Object r2 = r12.getForegroundInfo(r0)     // Catch:{ all -> 0x00a1 }
            if (r2 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            r7 = r12
        L_0x00f8:
            ay5 r2 = (defpackage.ay5) r2     // Catch:{ all -> 0x011a }
            r0.o = r7     // Catch:{ all -> 0x011a }
            r0.X = r13     // Catch:{ all -> 0x011a }
            r8 = 0
            r0.Y = r8     // Catch:{ all -> 0x011a }
            r0.t0 = r6     // Catch:{ all -> 0x011a }
            java.lang.Object r12 = r12.setForeground(r2, r0)     // Catch:{ all -> 0x011a }
            if (r12 != r1) goto L_0x010a
            return r1
        L_0x010a:
            r12 = r7
        L_0x010b:
            r0.o = r12     // Catch:{ all -> 0x00a1 }
            r0.X = r13     // Catch:{ all -> 0x00a1 }
            r0.t0 = r5     // Catch:{ all -> 0x00a1 }
            r7 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r2 = defpackage.j47.x(r7, r0)     // Catch:{ all -> 0x00a1 }
            if (r2 != r1) goto L_0x00a4
            return r1
        L_0x011a:
            r12 = move-exception
            r0 = r12
            goto L_0x0060
        L_0x011e:
            em7 r0 = defpackage.fm7.b()     // Catch:{ all -> 0x00a1 }
            goto L_0x013e
        L_0x0123:
            java.lang.String r1 = "failure!"
            defpackage.hm9.p(r4, r1, r0)
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x013a
            khe r0 = r12.c
            java.lang.Object r0 = r0.getValue()
            cn7 r0 = (defpackage.cn7) r0
            r12.c()
            r0.getClass()
        L_0x013a:
            cm7 r0 = defpackage.fm7.a()
        L_0x013e:
            fke r12 = r12.getTamComponent()
            jyc r12 = (defpackage.jyc) r12
            ri4 r12 = r12.h()
            r12.g(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.location.live.LiveLocationWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getForegroundInfo(Continuation continuation) {
        return new ay5(Long.hashCode(c()) ^ -861719020, ((gn7) this.b.getValue()).a(c(), s7g.d(getApplicationContext()).c(getId())), 8);
    }
}
