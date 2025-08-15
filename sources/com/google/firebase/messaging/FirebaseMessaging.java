package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {
    public static final long j = TimeUnit.HOURS.toSeconds(8);
    public static re6 k;
    public static gpb l = new dc3(5);
    public static ScheduledThreadPoolExecutor m;
    public final fl5 a;
    public final Context b;
    public final bwf c;
    public final b9b d;
    public final w36 e;
    public final Executor f;
    public final Executor g;
    public final jjf h;
    public boolean i = false;

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, w36] */
    public FirebaseMessaging(fl5 fl5, gpb gpb, gpb gpb2, jl5 jl5, gpb gpb3, wae wae) {
        fl5 fl52 = fl5;
        fl5.a();
        Context context = fl52.a;
        jjf jjf = new jjf(context);
        bwf bwf = new bwf(fl5, jjf, gpb, gpb2, jl5);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new cm9("Firebase-Messaging-Task", 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new cm9("Firebase-Messaging-Init", 0));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cm9("Firebase-Messaging-File-Io", 0));
        l = gpb3;
        this.a = fl52;
        ? obj = new Object();
        obj.o = this;
        obj.b = wae;
        this.e = obj;
        fl5.a();
        Context context2 = fl52.a;
        this.b = context2;
        ie5 ie5 = new ie5();
        this.h = jjf;
        this.c = bwf;
        this.d = new b9b(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        fl5.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(ie5);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new ll5(this, 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new cm9("Firebase-Messaging-Topics-Io", 0));
        int i2 = uxe.j;
        j1e.g(new txe(context2, scheduledThreadPoolExecutor2, this, jjf, bwf), scheduledThreadPoolExecutor2).d(scheduledThreadPoolExecutor, new ml5(this, 0));
        scheduledThreadPoolExecutor.execute(new ll5(this, 1));
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new cm9("TAG", 0));
                }
                m.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized re6 c(Context context) {
        re6 re6;
        synchronized (FirebaseMessaging.class) {
            try {
                if (k == null) {
                    k = new re6(context, 29);
                }
                re6 = k;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return re6;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(fl5 fl5) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            Class<FirebaseMessaging> cls = FirebaseMessaging.class;
            fl5.a();
            firebaseMessaging = (FirebaseMessaging) fl5.d.a(cls);
            fp3.o(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        t8e e2 = e();
        if (!i(e2)) {
            return e2.a;
        }
        String h2 = jjf.h(this.a);
        b9b b9b = this.d;
        synchronized (b9b) {
            task = (Task) ((us) b9b.c).get(h2);
            if (task == null) {
                bwf bwf = this.c;
                task = bwf.g(bwf.n(jjf.h((fl5) bwf.a), "*", new Bundle())).l(this.g, new u00((Object) this, (Object) h2, (Object) e2, 10)).k((Executor) b9b.b, new y98((Object) b9b, 28, (Object) h2));
                ((us) b9b.c).put(h2, task);
            }
        }
        try {
            return (String) j1e.b(task);
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public final String d() {
        fl5 fl5 = this.a;
        fl5.a();
        return "[DEFAULT]".equals(fl5.b) ? "" : fl5.c();
    }

    public final t8e e() {
        t8e a2;
        re6 c2 = c(this.b);
        String d2 = d();
        String h2 = jjf.h(this.a);
        synchronized (c2) {
            a2 = t8e.a(((SharedPreferences) c2.b).getString(re6.m0(d2, h2), (String) null));
        }
        return a2;
    }

    public final void f() {
        ukg ukg;
        int i2;
        goc goc = (goc) this.c.c;
        if (goc.c.g() >= 241100000) {
            pkg f2 = pkg.f(goc.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (f2) {
                i2 = f2.b;
                f2.b = i2 + 1;
            }
            ukg = f2.h(new ckg(i2, 5, bundle, 1)).j(ok4.o, sp3.v0);
        } else {
            ukg = j1e.q(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        ukg.d(this.f, new ml5(this, 1));
    }

    public final boolean g() {
        Context context = this.b;
        tpa.x(context);
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            context.getPackageName();
            return false;
        } else if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        } else {
            fl5 fl5 = this.a;
            fl5.a();
            if (fl5.d.a(bd.class) != null) {
                return true;
            }
            return m6d.l() && l != null;
        }
    }

    public final synchronized void h(long j2) {
        b(new i0e(this, Math.min(Math.max(30, 2 * j2), j)), j2);
        this.i = true;
    }

    public final boolean i(t8e t8e) {
        if (t8e != null) {
            return System.currentTimeMillis() > t8e.c + t8e.d || !this.h.g().equals(t8e.b);
        }
    }
}
