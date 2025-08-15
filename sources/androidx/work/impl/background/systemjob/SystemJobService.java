package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import java.util.HashMap;

public class SystemJobService extends JobService implements w45 {
    public static final String o = a14.O("SystemJobService");
    public s7g a;
    public final HashMap b = new HashMap();
    public final bdb c = new bdb(6);

    public static l7g a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l7g(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final void b(l7g l7g, boolean z) {
        JobParameters jobParameters;
        a14 u = a14.u();
        String str = o;
        u.n(str, l7g.a + " executed on JobScheduler");
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(l7g);
        }
        this.c.j(l7g);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public final void onCreate() {
        super.onCreate();
        try {
            s7g d = s7g.d(getApplicationContext());
            this.a = d;
            d.f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                a14.u().R(o, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        s7g s7g = this.a;
        if (s7g != null) {
            s7g.f.e(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r0 = new defpackage.glc(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (defpackage.gie.b(r8) == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r0.c = java.util.Arrays.asList(defpackage.gie.b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (defpackage.gie.a(r8) == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        r0.b = java.util.Arrays.asList(defpackage.gie.a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        r0.o = defpackage.hie.a(r8);
        r7.a.h(r7.c.o(r2), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            s7g r2 = r7.a
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0019
            a14 r0 = defpackage.a14.u()
            java.lang.String r1 = o
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            r0.n(r1, r2)
            r7.jobFinished(r8, r3)
            return r4
        L_0x0019:
            l7g r2 = a(r8)
            if (r2 != 0) goto L_0x002b
            a14 r7 = defpackage.a14.u()
            java.lang.String r8 = o
            java.lang.String r0 = "WorkSpec id not found!"
            r7.q(r8, r0)
            return r4
        L_0x002b:
            java.util.HashMap r5 = r7.b
            monitor-enter(r5)
            java.util.HashMap r6 = r7.b     // Catch:{ all -> 0x004d }
            boolean r6 = r6.containsKey(r2)     // Catch:{ all -> 0x004d }
            if (r6 == 0) goto L_0x004f
            a14 r7 = defpackage.a14.u()     // Catch:{ all -> 0x004d }
            java.lang.String r8 = o     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r0.<init>(r1)     // Catch:{ all -> 0x004d }
            r0.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004d }
            r7.n(r8, r0)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            return r4
        L_0x004d:
            r7 = move-exception
            goto L_0x00a3
        L_0x004f:
            a14 r1 = defpackage.a14.u()     // Catch:{ all -> 0x004d }
            java.lang.String r4 = o     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r6.<init>(r0)     // Catch:{ all -> 0x004d }
            r6.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x004d }
            r1.n(r4, r0)     // Catch:{ all -> 0x004d }
            java.util.HashMap r0 = r7.b     // Catch:{ all -> 0x004d }
            r0.put(r2, r8)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            glc r0 = new glc
            r1 = 14
            r0.<init>((int) r1)
            android.net.Uri[] r1 = defpackage.gie.b(r8)
            if (r1 == 0) goto L_0x0081
            android.net.Uri[] r1 = defpackage.gie.b(r8)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.c = r1
        L_0x0081:
            java.lang.String[] r1 = defpackage.gie.a(r8)
            if (r1 == 0) goto L_0x0091
            java.lang.String[] r1 = defpackage.gie.a(r8)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.b = r1
        L_0x0091:
            android.net.Network r8 = defpackage.hie.a(r8)
            r0.o = r8
            s7g r8 = r7.a
            bdb r7 = r7.c
            yzd r7 = r7.o(r2)
            r8.h(r7, r0)
            return r3
        L_0x00a3:
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.a == null) {
            a14.u().n(o, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        l7g a2 = a(jobParameters);
        if (a2 == null) {
            a14.u().q(o, "WorkSpec id not found!");
            return false;
        }
        a14 u = a14.u();
        String str = o;
        u.n(str, "onStopJob for " + a2);
        synchronized (this.b) {
            this.b.remove(a2);
        }
        yzd j = this.c.j(a2);
        if (j != null) {
            s7g s7g = this.a;
            s7g.d.l(new k8e(s7g, j, false));
        }
        y9b y9b = this.a.f;
        String str2 = a2.a;
        synchronized (y9b.w0) {
            contains = y9b.u0.contains(str2);
        }
        return !contains;
    }
}
