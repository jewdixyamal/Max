package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* renamed from: boe  reason: default package */
public final class boe {
    public static final /* synthetic */ int b = 0;
    public final v7g a;

    public boe(v7g v7g) {
        this.a = v7g;
        mta mta = (mta) ((lta) ((lta) new lta(TaskMonitor$TaskMonitorWorker.class, 6, TimeUnit.HOURS).setConstraints(new kj3(1, false, true, false, false, -1, -1, x53.H0(new LinkedHashSet())))).addTag("TASK_MONITOR_PERIODIC_TASK")).build();
        UUID id = mta.getId();
        hm9.m("boe", "work " + id + " try to add TASK_MONITOR_PERIODIC_TASK request", new Object[0]);
        v7g.e(v7g, "TASK_MONITOR_PERIODIC_TASK", 2, mta, false, 24);
    }

    public final void a() {
        rla rla = (rla) ((qla) ((qla) new qla(TaskMonitor$TaskMonitorWorker.class).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("TASK_MONITOR_ONE_TIME_TASK")).build();
        UUID id = rla.getId();
        hm9.m("boe", "work " + id + " try to add TASK_MONITOR_ONE_TIME_TASK request", new Object[0]);
        this.a.b("TASK_MONITOR_ONE_TIME_TASK", h65.b, rla, false).l();
    }
}
