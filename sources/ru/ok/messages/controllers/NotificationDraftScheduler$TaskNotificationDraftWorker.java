package ru.ok.messages.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ok/messages/controllers/NotificationDraftScheduler$TaskNotificationDraftWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lwp4;", "draftsNotifications", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lwp4;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationDraftScheduler$TaskNotificationDraftWorker extends Worker {
    public final wp4 b;

    public NotificationDraftScheduler$TaskNotificationDraftWorker(Context context, WorkerParameters workerParameters, wp4 wp4) {
        super(context, workerParameters);
        this.b = wp4;
    }

    public final fm7 b() {
        String str;
        Intent k;
        Handler handler = a14.i;
        UUID id = getId();
        hm9.m("a14", "work " + id + " started", new Object[0]);
        xp4 xp4 = (xp4) this.b;
        xp4.getClass();
        hm9.m("xp4", "notifyDrafts", new Object[0]);
        ArrayList arrayList = new ArrayList();
        v00 v00 = p82.I;
        ArrayList D = xp4.e.D(p82.M, true, (c7b) null);
        Collections.sort(D, v00);
        for (e52 e52 : Collections.unmodifiableList(D)) {
            uaa uaa = e52.b.f0;
        }
        if (arrayList.isEmpty()) {
            hm9.m("xp4", "notifyDrafts: no drafts", new Object[0]);
        } else {
            p7b p7b = xp4.b;
            p7b.a.j("app.draftsChanged", false);
            int size = arrayList.size();
            bea bea = xp4.c;
            Context context = xp4.a;
            if (size > 1) {
                hm9.m("xp4", "notifyDrafts: multiple chats", new Object[0]);
                str = String.format(context.getString(jpc.J1), new Object[]{Integer.valueOf(arrayList.size())});
                k = bea.f(false);
            } else {
                e52 e522 = (e52) arrayList.get(0);
                if (!e522.M() || e522.l() == null) {
                    hm9.m("xp4", "notifyDrafts: chat", new Object[0]);
                    String string = context.getString(jpc.H1);
                    String str2 = e522.b.g;
                    int i = zqe.a;
                    str = String.format(string, new Object[]{(str2 == null || str2.length() == 0) ? "" : zr6.i("\"", str2, "\"")});
                } else {
                    hm9.m("xp4", "notifyDrafts: dialog", new Object[0]);
                    str = String.format(context.getString(jpc.I1), new Object[]{e522.l().d()});
                }
                bea.getClass();
                vw7.c.getClass();
                k = bea.k(new c64(zr6.k(new StringBuilder(":chats?id="), e522.a, "&type=local")));
            }
            Intent intent = k;
            xp4.d.getClass();
            p7b.c.getClass();
            bu9 h = bea.h("ru.oneme.app.misc", false, false);
            h.e(str);
            zt9 zt9 = new zt9(0);
            zt9.f = bu9.c(str);
            h.q(zt9);
            ((tda) bea.d.getValue()).getClass();
            bea.l(h, intent, (Intent) null, 2, (String) null);
        }
        Handler handler2 = a14.i;
        UUID id2 = getId();
        hm9.m("a14", "work " + id2 + " finished", new Object[0]);
        return fm7.b();
    }
}
