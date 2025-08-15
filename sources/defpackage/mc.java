package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: mc  reason: default package */
public abstract class mc {
    public static final String a = a14.O("Alarms");

    public static void a(Context context, l7g l7g, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = d73.X;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        d73.d(intent, l7g);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service != null && alarmManager != null) {
            a14 u = a14.u();
            u.n(a, "Cancelling existing alarm with (workSpecId, systemId) (" + l7g + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, l7g l7g, long j) {
        die v = workDatabase.v();
        cie x = v.x(l7g);
        Class<SystemAlarmService> cls = SystemAlarmService.class;
        if (x != null) {
            int i = x.c;
            a(context, l7g, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = d73.X;
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_DELAY_MET");
            d73.d(intent, l7g);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                lc.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        int intValue = ((Number) workDatabase.p(new l5(6, new re6(16, (Object) workDatabase)))).intValue();
        v.A(new cie(l7g.a, l7g.b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = d73.X;
        Intent intent2 = new Intent(context, cls);
        intent2.setAction("ACTION_DELAY_MET");
        d73.d(intent2, l7g);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            lc.a(alarmManager2, 0, j, service2);
        }
    }
}
