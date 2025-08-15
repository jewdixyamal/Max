package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: fie  reason: default package */
public final class fie implements auc {
    public static final String X = a14.O("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final s7g c;
    public final eie o;

    public fie(Context context, s7g s7g) {
        eie eie = new eie(context);
        this.a = context;
        this.c = s7g;
        this.b = (JobScheduler) context.getSystemService("jobscheduler");
        this.o = eie;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            a14.u().r(X, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            a14.u().r(X, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static l7g f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l7g(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final boolean c() {
        return true;
    }

    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList b2 = b(context, jobScheduler);
        if (b2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                l7g f = f(jobInfo);
                if (f != null && str.equals(f.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a(jobScheduler, ((Integer) it2.next()).intValue());
            }
            die v = this.c.c.v();
            ilc ilc = (ilc) v.a;
            ilc.b();
            zkc zkc = (zkc) v.o;
            q36 f2 = zkc.f();
            if (str == null) {
                f2.W(1);
            } else {
                f2.f(1, str);
            }
            ilc.c();
            try {
                f2.n();
                ilc.r();
            } finally {
                ilc.l();
                zkc.t(f2);
            }
        }
    }

    public final void e(h8g... h8gArr) {
        int i;
        s7g s7g = this.c;
        WorkDatabase workDatabase = s7g.c;
        re6 re6 = new re6(16, (Object) workDatabase);
        int length = h8gArr.length;
        int i2 = 0;
        while (i2 < length) {
            h8g h8g = h8gArr[i2];
            workDatabase.c();
            try {
                h8g l = workDatabase.y().l(h8g.a);
                String str = X;
                String str2 = h8g.a;
                if (l == null) {
                    a14 u = a14.u();
                    u.R(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.r();
                } else if (l.b != m7g.a) {
                    a14 u2 = a14.u();
                    u2.R(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.r();
                } else {
                    l7g n = ju0.n(h8g);
                    cie x = workDatabase.v().x(n);
                    if (x != null) {
                        i = x.c;
                    } else {
                        s7g.b.getClass();
                        i = ((Number) ((WorkDatabase) re6.b).p(new ft6(re6, s7g.b.g))).intValue();
                    }
                    if (x == null) {
                        s7g.c.v().A(new cie(n.a, n.b, i));
                    }
                    g(h8g, i);
                    workDatabase.r();
                }
                i2++;
            } finally {
                workDatabase.l();
            }
        }
    }

    public final void g(h8g h8g, int i) {
        int i2;
        JobScheduler jobScheduler = this.b;
        eie eie = this.o;
        eie.getClass();
        kj3 kj3 = h8g.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = h8g.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", h8g.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", h8g.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, eie.a).setRequiresCharging(kj3.b);
        boolean z = kj3.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        int i3 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        int i4 = 0;
        int i5 = kj3.a;
        if (i3 < 30 || i5 != 6) {
            int s = au1.s(i5);
            if (s != 0) {
                if (s != 1) {
                    i2 = 2;
                    if (s != 2) {
                        i2 = 3;
                        if (s != 3) {
                            i2 = 4;
                            if (s != 4) {
                                a14.u().n(eie.b, "API version too low. Cannot convert network type value ".concat(ey8.t(i5)));
                            }
                        }
                    }
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z) {
            extras.setBackoffCriteria(h8g.m, h8g.l == mf0.b ? 0 : 1);
        }
        long max = Math.max(h8g.a() - System.currentTimeMillis(), 0);
        int i6 = (max > 0 ? 1 : (max == 0 ? 0 : -1));
        if (i6 > 0) {
            extras.setMinimumLatency(max);
        } else if (!h8g.q) {
            extras.setImportantWhileForeground(true);
        }
        Set<jj3> set = kj3.h;
        if (!set.isEmpty()) {
            for (jj3 jj3 : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(jj3.a, jj3.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(kj3.f);
            extras.setTriggerContentMaxDelay(kj3.g);
        }
        extras.setPersisted(false);
        int i7 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(kj3.d);
        extras.setRequiresStorageNotLow(kj3.e);
        boolean z3 = h8g.k > 0;
        if (i6 <= 0) {
            z2 = false;
        }
        if (i7 >= 31 && h8g.q && !z3 && !z2) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = X;
        a14.u().n(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            if (jobScheduler.schedule(build) == 0) {
                a14.u().R(str2, "Unable to schedule work ID " + str);
                if (h8g.q && h8g.r == jna.a) {
                    h8g.q = false;
                    a14.u().n(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(h8g, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList b2 = b(this.a, jobScheduler);
            if (b2 != null) {
                i4 = b2.size();
            }
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(i4);
            s7g s7g = this.c;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{valueOf, Integer.valueOf(s7g.c.y().i().size()), Integer.valueOf(s7g.b.h)});
            a14.u().q(str2, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e);
            s7g.b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            a14.u().r(str2, "Unable to schedule " + h8g, th);
        }
    }
}
