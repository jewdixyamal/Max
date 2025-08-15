package ru.ok.messages;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/messages/TimeChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "TaskTimeChangeWorker", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class TimeChangeReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/messages/TimeChangeReceiver$TaskTimeChangeWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lt6b;", "preProcessDataCache", "Lp82;", "chatController", "Lav0;", "uiBus", "Ltme;", "themeController", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lt6b;Lp82;Lav0;Ltme;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
    public static final class TaskTimeChangeWorker extends Worker {
        public final tme X;
        public final t6b b;
        public final p82 c;
        public final av0 o;

        public TaskTimeChangeWorker(Context context, WorkerParameters workerParameters, t6b t6b, p82 p82, av0 av0, tme tme) {
            super(context, workerParameters);
            this.b = t6b;
            this.c = p82;
            this.o = av0;
            this.X = tme;
        }

        public final fm7 b() {
            int i = TimeChangeReceiver.a;
            hm9.m("ru.ok.messages.TimeChangeReceiver", "work %s started", getId());
            synchronized (ay7.c) {
                ay7.b = null;
            }
            synchronized (ay7.e) {
                ay7.d = null;
            }
            synchronized (ay7.g) {
                ay7.f = null;
            }
            synchronized (ay7.i) {
                ay7.h = null;
            }
            synchronized (ay7.k) {
                ay7.j = null;
            }
            synchronized (ay7.m) {
                ay7.l = null;
            }
            synchronized (ay7.o) {
                ay7.n = null;
            }
            synchronized (ay7.p) {
            }
            synchronized (ay7.v) {
                ay7.u = null;
            }
            synchronized (ay7.t) {
                ay7.s = null;
            }
            this.b.a();
            p82 p82 = this.c;
            if (p82.i) {
                for (e52 e52 : p82.f.values()) {
                    e52.z0 = null;
                }
                p82.m.c(new vz2(Collections.emptyList(), true));
            }
            this.o.c(new su(12));
            this.X.f();
            new TimeChangeReceiver();
            TimeChangeReceiver.a(getApplicationContext());
            hm9.m("ru.ok.messages.TimeChangeReceiver", "work %s finished", getId());
            return fm7.b();
        }
    }

    public static void a(Context context) {
        v7g v7g = (v7g) ((y8a) vl.b()).getAccessor().c(v7g.class);
        qla qla = new qla(TaskTimeChangeWorker.class);
        mf0 mf0 = mf0.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qla qla2 = (qla) qla.setBackoffCriteria(mf0, WorkRequest.MIN_BACKOFF_MILLIS, timeUnit);
        n34 g = n34.g(System.currentTimeMillis(), TimeZone.getDefault());
        long h = new n34(g.a, g.b, g.c, (Integer) null, (Integer) null, (Integer) null, (Integer) null).l(1).h(TimeZone.getDefault()) - n34.g(System.currentTimeMillis(), TimeZone.getDefault()).h(TimeZone.getDefault());
        if (h > 0) {
            qla2.setInitialDelay(h, timeUnit);
        }
        rla rla = (rla) ((qla) qla2.addTag("TIME_CHANGE")).build();
        UUID id = rla.getId();
        hm9.m("ru.ok.messages.TimeChangeReceiver", "work " + id + " try to add TIME_CHANGE request. Schedule on next date", new Object[0]);
        v7g.b("TIME_CHANGE", h65.c, rla, false).l();
    }

    public final void onReceive(Context context, Intent intent) {
        rla rla = (rla) ((qla) ((qla) new qla(TaskTimeChangeWorker.class).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("TIME_CHANGE")).build();
        UUID id = rla.getId();
        hm9.m("ru.ok.messages.TimeChangeReceiver", "work " + id + " try to add TIME_CHANGE request. Schedule now", new Object[0]);
        ((v7g) ((y8a) vl.b()).getAccessor().c(v7g.class)).b("TIME_CHANGE", h65.a, rla, false).l();
    }
}
