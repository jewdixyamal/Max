package defpackage;

import java.util.UUID;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* renamed from: aoe  reason: default package */
public final class aoe implements b7b, b66 {
    public final /* synthetic */ TaskMonitor$TaskMonitorWorker a;

    public /* synthetic */ aoe(TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker) {
        this.a = taskMonitor$TaskMonitorWorker;
    }

    public Object apply(Object obj) {
        UUID id = this.a.getId();
        hm9.p("boe", "work " + id + " on error", (Throwable) obj);
        return Boolean.FALSE;
    }

    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker = this.a;
        UUID id = taskMonitor$TaskMonitorWorker.getId();
        hm9.m("boe", "work " + id + " Receive task remove callback", new Object[0]);
        return taskMonitor$TaskMonitorWorker.c();
    }
}
