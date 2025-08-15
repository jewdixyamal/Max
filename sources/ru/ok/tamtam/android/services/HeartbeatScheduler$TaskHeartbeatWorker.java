package ru.ok.tamtam.android.services;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ok/tamtam/android/services/HeartbeatScheduler$TaskHeartbeatWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lqj6;", "heartbeatLogic", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqj6;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class HeartbeatScheduler$TaskHeartbeatWorker extends SdkCoroutineWorker {
    public final qj6 a;

    public HeartbeatScheduler$TaskHeartbeatWorker(Context context, WorkerParameters workerParameters, qj6 qj6) {
        super(context, workerParameters);
        this.a = qj6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.rj6
            if (r0 == 0) goto L_0x0013
            r0 = r13
            rj6 r0 = (defpackage.rj6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            rj6 r0 = new rj6
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            java.lang.String r3 = "sj6"
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker r12 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x0124
        L_0x002c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0034:
            defpackage.od2.a0(r13)
            java.util.UUID r13 = r12.getId()
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r2 = "work %s started"
            defpackage.hm9.m(r3, r2, r13)
            r0.o = r12
            r0.Z = r4
            qj6 r13 = r12.a
            je7 r2 = r13.a
            java.lang.Object r2 = r2.getValue()
            f5a r2 = (defpackage.f5a) r2
            boolean r2 = r2.d()
            je7 r5 = r13.b
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r5.getValue()
            ri4 r2 = (defpackage.ri4) r2
            r2.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            je7 r2 = r13.c
            java.lang.Object r8 = r2.getValue()
            m7b r8 = (defpackage.m7b) r8
            p7b r8 = (defpackage.p7b) r8
            t33 r8 = r8.a
            ne7 r8 = r8.g
            java.lang.String r9 = "app.lastSuccessfulRequestTime"
            r10 = 0
            long r8 = r8.getLong(r9, r10)
            long r6 = r6 - r8
            double r6 = (double) r6
            double r6 = java.lang.Math.abs(r6)
            r8 = 4718496151362338816(0x417b774000000000, double:2.88E7)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a4
            java.lang.Object r2 = r2.getValue()
            m7b r2 = (defpackage.m7b) r2
            p7b r2 = (defpackage.p7b) r2
            t33 r2 = r2.a
            r2.y(r4)
            je7 r2 = r13.d
            java.lang.Object r2 = r2.getValue()
            boe r2 = (defpackage.boe) r2
            r2.a()
        L_0x00a4:
            java.lang.Object r2 = r5.getValue()
            ri4 r2 = (defpackage.ri4) r2
            boolean r2 = r2.d()
            if (r2 != 0) goto L_0x00e0
            je7 r2 = r13.e
            java.lang.Object r2 = r2.getValue()
            ch3 r2 = (defpackage.ch3) r2
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x00e0
            je7 r2 = r13.f
            java.lang.Object r2 = r2.getValue()
            pk r2 = (defpackage.pk) r2
            java.lang.Object r4 = r5.getValue()
            ri4 r4 = (defpackage.ri4) r4
            boolean r4 = r4.d()
            k4a r2 = (defpackage.k4a) r2
            r2.G(r4)
            je7 r2 = r13.g
            java.lang.Object r2 = r2.getValue()
            s8g r2 = (defpackage.s8g) r2
            defpackage.r9d.y(r2)
        L_0x00e0:
            je7 r13 = r13.h
            java.lang.Object r2 = r13.getValue()
            js7 r2 = (defpackage.js7) r2
            boolean r2 = r2.e()
            e5f r4 = defpackage.e5f.a
            r6 = 0
            if (r2 == 0) goto L_0x0108
            java.lang.Object r2 = r5.getValue()
            ri4 r2 = (defpackage.ri4) r2
            boolean r2 = r2.d()
            if (r2 != 0) goto L_0x0108
            java.lang.Object r13 = r13.getValue()
            js7 r13 = (defpackage.js7) r13
            r0 = 3
            defpackage.js7.g(r13, r6, r0)
            goto L_0x0121
        L_0x0108:
            java.lang.Object r2 = r13.getValue()
            js7 r2 = (defpackage.js7) r2
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0121
            java.lang.Object r13 = r13.getValue()
            js7 r13 = (defpackage.js7) r13
            java.lang.Object r13 = r13.f(r6, r0)
            if (r13 != r1) goto L_0x0121
            r4 = r13
        L_0x0121:
            if (r4 != r1) goto L_0x0124
            return r1
        L_0x0124:
            java.util.UUID r12 = r12.getId()
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r13 = "work %s finished"
            defpackage.hm9.m(r3, r13, r12)
            em7 r12 = defpackage.fm7.b()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
