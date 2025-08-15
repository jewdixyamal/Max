package one.me.sdk.tasks;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"one/me/sdk/tasks/TaskMonitor$TaskMonitorWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Leoe;", "taskRepository", "Lhle;", "schedulers", "Ls8g;", "workerService", "Lq33;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Leoe;Lhle;Ls8g;Lq33;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class TaskMonitor$TaskMonitorWorker extends Worker {
    public final q33 X;
    public final lp0 Y = new CountDownLatch(1);
    public final eoe b;
    public final hle c;
    public final s8g o;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.concurrent.CountDownLatch, lp0] */
    public TaskMonitor$TaskMonitorWorker(Context context, WorkerParameters workerParameters, eoe eoe, hle hle, s8g s8g, q33 q33) {
        super(context, workerParameters);
        this.b = eoe;
        this.c = hle;
        this.o = s8g;
        this.X = q33;
    }

    /* JADX WARNING: type inference failed for: r11v10, types: [fm7, java.lang.Object] */
    public final fm7 b() {
        Boolean bool;
        hm9.m("boe", "work %s started at %s", getId(), Integer.valueOf(System.identityHashCode(this)));
        if (!c()) {
            UUID id = getId();
            hm9.m("boe", "work " + id + " No tasks to be executed", new Object[0]);
            return fm7.b();
        }
        ((hyc) this.X).y(true);
        r9d.y(this.o);
        xpb xpb = this.b.c;
        aoe aoe = new aoe(this);
        xpb.getClass();
        ty9 ty9 = new ty9(xpb, aoe, 2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ztc ztc = (ztc) ((jle) this.c).c.getValue();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztc, "scheduler is null");
        b2a b2a = new b2a(ty9, 15000, timeUnit, ztc);
        aoe aoe2 = new aoe(this);
        lp0 lp0 = this.Y;
        Objects.requireNonNull(lp0, "observer is null");
        try {
            b2a.a(new f0a(lp0, aoe2, 1));
            try {
                if (lp0.getCount() != 0) {
                    lp0.await();
                }
                Throwable th = lp0.b;
                if (th == null) {
                    bool = (Boolean) lp0.a;
                    if (bool == null) {
                        UUID id2 = getId();
                        hm9.p("boe", "work " + id2 + " result null. Set failure state", (Throwable) null);
                        return fm7.a();
                    } else if (!bool.booleanValue()) {
                        UUID id3 = getId();
                        hm9.m0("boe", "work " + id3 + " Timeout. Set retry state", new Object[0]);
                        return new Object();
                    } else {
                        UUID id4 = getId();
                        hm9.m("boe", "work " + id4 + " finished", new Object[0]);
                        return fm7.b();
                    }
                } else {
                    throw q45.f(th);
                }
            } catch (InterruptedException e) {
                lp0.g();
                throw q45.f(e);
            } catch (Throwable th2) {
                UUID id5 = getId();
                hm9.p("boe", "work " + id5 + " Exception", th2);
                bool = null;
            }
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th3) {
            c37.B(th3);
            j47.Z(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public final boolean c() {
        eoe eoe = this.b;
        int k = eoe.k();
        UUID id = getId();
        hm9.m("boe", "work " + id + " Task count to be executed = " + k, new Object[0]);
        if (1 <= k && k < 10) {
            String n0 = x53.n0(eoe.m(), "; ", (String) null, (String) null, new w8c(18), 30);
            UUID id2 = getId();
            hm9.m("boe", "work " + id2 + " Last task to execute: " + n0, new Object[0]);
        }
        return k > 0;
    }

    public final void onStopped() {
        UUID id = getId();
        int identityHashCode = System.identityHashCode(this);
        hm9.m("boe", "work " + id + " requested to stop " + identityHashCode, new Object[0]);
        lp0 lp0 = this.Y;
        lp0.g();
        lp0.countDown();
        UUID id2 = getId();
        int identityHashCode2 = System.identityHashCode(this);
        hm9.m("boe", "work " + id2 + " stopped " + identityHashCode2, new Object[0]);
    }
}
