package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: wx5  reason: default package */
public final class wx5 implements Runnable {
    public static final String X = a14.O("ForceStopRunnable");
    public static final long Y = TimeUnit.DAYS.toMillis(3650);
    public final Context a;
    public final s7g b;
    public final wmc c;
    public int o = 0;

    public wx5(Context context, s7g s7g) {
        this.a = context.getApplicationContext();
        this.b = s7g;
        this.c = s7g.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + Y;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    public final void a() {
        boolean z;
        ilc ilc;
        ktf ktf;
        q36 f;
        wmc wmc = this.c;
        String str = fie.X;
        Context context = this.a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList b2 = fie.b(context, jobScheduler);
        s7g s7g = this.b;
        die v = s7g.c.v();
        v.getClass();
        xlc a2 = xlc.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        ilc ilc2 = (ilc) v.a;
        ilc2.b();
        Cursor o2 = ilc2.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(o2.isNull(0) ? null : o2.getString(0));
            }
            HashSet hashSet = new HashSet(b2 != null ? b2.size() : 0);
            if (b2 != null && !b2.isEmpty()) {
                Iterator it = b2.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    l7g f2 = fie.f(jobInfo);
                    if (f2 != null) {
                        hashSet.add(f2.a);
                    } else {
                        fie.a(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        a14.u().n(fie.X, "Reconciling jobs");
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = s7g.c;
                workDatabase.c();
                try {
                    i8g y = workDatabase.y();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        y.n(-1, (String) it3.next());
                    }
                    workDatabase.r();
                    workDatabase.l();
                } catch (Throwable th) {
                    workDatabase.l();
                    throw th;
                }
            }
            WorkDatabase workDatabase2 = s7g.c;
            i8g y2 = workDatabase2.y();
            a8g x = workDatabase2.x();
            workDatabase2.c();
            try {
                ArrayList h = y2.h();
                boolean z2 = !h.isEmpty();
                if (z2) {
                    Iterator it4 = h.iterator();
                    while (it4.hasNext()) {
                        h8g h8g = (h8g) it4.next();
                        y2.q(m7g.a, h8g.a);
                        y2.n(-1, h8g.a);
                    }
                }
                ilc = (ilc) x.a;
                ilc.b();
                ktf = (ktf) x.o;
                f = ktf.f();
                ilc.c();
                f.n();
                ilc.r();
                ilc.l();
                ktf.t(f);
                workDatabase2.r();
                workDatabase2.l();
                boolean z3 = z2 || z;
                Long j = ((WorkDatabase) s7g.g.a).u().j("reschedule_needed");
                long j2 = 0;
                String str2 = X;
                if (j == null || j.longValue() != 1) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        int i2 = i >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
                        if (i >= 30) {
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            List t = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                            if (t != null && !t.isEmpty()) {
                                Long j3 = ((WorkDatabase) wmc.a).u().j("last_force_stop_ms");
                                if (j3 != null) {
                                    j2 = j3.longValue();
                                }
                                int i3 = 0;
                                while (i3 < t.size()) {
                                    ApplicationExitInfo e = c4.e(t.get(i3));
                                    if (e.getReason() != 10 || e.getTimestamp() < j2) {
                                        i3++;
                                    } else {
                                        a14.u().n(str2, "Application was force-stopped, rescheduling.");
                                        s7g.g();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        wmc.getClass();
                                        ((WorkDatabase) wmc.a).u().p(new g7b("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                                        return;
                                    }
                                }
                            }
                        } else if (broadcast == null) {
                            c(context);
                            a14.u().n(str2, "Application was force-stopped, rescheduling.");
                            s7g.g();
                            long currentTimeMillis2 = System.currentTimeMillis();
                            wmc.getClass();
                            ((WorkDatabase) wmc.a).u().p(new g7b("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                            return;
                        }
                        if (z3) {
                            a14.u().n(str2, "Found unfinished work, scheduling it.");
                            nuc.a(s7g.b, s7g.c, s7g.e);
                        }
                    } catch (IllegalArgumentException | SecurityException e2) {
                        a14.u().S(str2, "Ignoring exception", e2);
                    }
                } else {
                    a14.u().n(str2, "Rescheduling Workers.");
                    s7g.g();
                    wmc wmc2 = s7g.g;
                    wmc2.getClass();
                    ((WorkDatabase) wmc2.a).u().p(new g7b("reschedule_needed", 0L));
                }
            } catch (Throwable th2) {
                workDatabase2.l();
                throw th2;
            }
        } finally {
            o2.close();
            a2.n();
        }
    }

    public final boolean b() {
        this.b.b.getClass();
        boolean isEmpty = TextUtils.isEmpty((CharSequence) null);
        String str = X;
        if (isEmpty) {
            a14.u().n(str, "The default process name was not specified.");
            return true;
        }
        int i = t9b.a;
        boolean f = tpa.f(rk.a.a(), this.a.getApplicationInfo().processName);
        a14 u = a14.u();
        u.n(str, "Is default app process = " + f);
        return f;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|8|9|10|11|33|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e A[LOOP:0: B:6:0x000e->B:32:0x000e, LOOP_START, SYNTHETIC, Splitter:B:6:0x000e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = X
            s7g r1 = r10.b
            boolean r2 = r10.b()     // Catch:{ all -> 0x0023 }
            if (r2 != 0) goto L_0x000e
            r1.f()
            return
        L_0x000e:
            android.content.Context r2 = r10.a     // Catch:{ SQLiteException -> 0x0067 }
            defpackage.mr0.O(r2)     // Catch:{ SQLiteException -> 0x0067 }
            a14 r2 = defpackage.a14.u()     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "Performing cleanup operations."
            r2.n(r0, r3)     // Catch:{ all -> 0x0023 }
            r10.a()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0025 }
            r1.f()
            return
        L_0x0023:
            r10 = move-exception
            goto L_0x007c
        L_0x0025:
            r2 = move-exception
            int r3 = r10.o     // Catch:{ all -> 0x0023 }
            int r3 = r3 + 1
            r10.o = r3     // Catch:{ all -> 0x0023 }
            r4 = 3
            if (r3 >= r4) goto L_0x0053
            long r3 = (long) r3     // Catch:{ all -> 0x0023 }
            r5 = 300(0x12c, double:1.48E-321)
            long r3 = r3 * r5
            a14 r7 = defpackage.a14.u()     // Catch:{ all -> 0x0023 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r8.<init>()     // Catch:{ all -> 0x0023 }
            java.lang.String r9 = "Retrying after "
            r8.append(r9)     // Catch:{ all -> 0x0023 }
            r8.append(r3)     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x0023 }
            r7.o(r0, r3, r2)     // Catch:{ all -> 0x0023 }
            int r2 = r10.o     // Catch:{ all -> 0x0023 }
            long r2 = (long) r2
            long r2 = r2 * r5
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x000e }
            goto L_0x000e
        L_0x0053:
            java.lang.String r10 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            a14 r3 = defpackage.a14.u()     // Catch:{ all -> 0x0023 }
            r3.r(r0, r10, r2)     // Catch:{ all -> 0x0023 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            r0.<init>(r10, r2)     // Catch:{ all -> 0x0023 }
            me3 r10 = r1.b     // Catch:{ all -> 0x0023 }
            r10.getClass()     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0067:
            r10 = move-exception
            java.lang.String r2 = "Unexpected SQLite exception during migrations"
            a14 r3 = defpackage.a14.u()     // Catch:{ all -> 0x0023 }
            r3.q(r0, r2)     // Catch:{ all -> 0x0023 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            r0.<init>(r2, r10)     // Catch:{ all -> 0x0023 }
            me3 r10 = r1.b     // Catch:{ all -> 0x0023 }
            r10.getClass()     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x007c:
            r1.f()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx5.run():void");
    }
}
