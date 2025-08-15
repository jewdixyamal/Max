package ru.ok.messages;

import android.content.Context;
import androidx.work.WorkerParameters;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;
import ru.ok.messages.TimeChangeReceiver;
import ru.ok.messages.analytics.DailyAnalyticsWorker;
import ru.ok.messages.controllers.NotificationDraftScheduler$TaskNotificationDraftWorker;
import ru.ok.messages.location.StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;

public final class a extends p8g {
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;

    public a(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79, je7 je710, je7 je711, je7 je712, je7 je713, je7 je714, je7 je715, je7 je716, je7 je717) {
        this.b = je717;
        this.c = je7;
        this.d = je72;
        this.e = je73;
        this.f = je74;
        this.g = je75;
        this.h = je76;
        this.i = je77;
        this.j = je78;
        this.k = je79;
        this.l = je710;
        this.m = je711;
        this.n = je712;
        this.o = je713;
        this.p = je714;
        this.q = je715;
        this.r = je716;
    }

    public final gm7 a(Context context, String str, WorkerParameters workerParameters) {
        boolean equals = str.equals(DailyAnalyticsWorker.class.getName());
        je7 je7 = this.d;
        if (equals) {
            return new DailyAnalyticsWorker(context, workerParameters, (ad) this.c.getValue(), (ep) je7.getValue(), (gh3) this.e.getValue(), (ti4) this.f.getValue(), (u8e) this.g.getValue(), (aua) this.r.getValue(), this.b);
        }
        boolean equals2 = str.equals(TaskMonitor$TaskMonitorWorker.class.getName());
        je7 je72 = this.h;
        if (equals2) {
            t33 t33 = ((p7b) ((m7b) je72.getValue())).a;
            return new TaskMonitor$TaskMonitorWorker(context, workerParameters, (eoe) this.i.getValue(), (hle) this.q.getValue(), (s8g) this.j.getValue(), t33);
        } else if (str.equals(HeartbeatScheduler$TaskHeartbeatWorker.class.getName())) {
            return new HeartbeatScheduler$TaskHeartbeatWorker(context, workerParameters, (qj6) this.k.getValue());
        } else {
            if (str.equals(TimeChangeReceiver.TaskTimeChangeWorker.class.getName())) {
                return new TimeChangeReceiver.TaskTimeChangeWorker(context, workerParameters, (t6b) this.l.getValue(), (p82) this.m.getValue(), (cy7) this.n.getValue(), (tme) this.o.getValue());
            } else if (str.equals(NotificationDraftScheduler$TaskNotificationDraftWorker.class.getName())) {
                return new NotificationDraftScheduler$TaskNotificationDraftWorker(context, workerParameters, (wp4) ((ep) je7.getValue()).m.getValue());
            } else {
                if (str.equals(StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker.class.getName())) {
                    return new StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker(context, workerParameters, (cn7) this.p.getValue());
                }
                if (str.equals(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class.getName())) {
                    return new NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(context, workerParameters, (qx9) ((ep) je7.getValue()).h.getValue(), ((p7b) ((m7b) je72.getValue())).a);
                }
                return null;
            }
        }
    }
}
