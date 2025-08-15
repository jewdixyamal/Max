package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: lc  reason: default package */
public abstract class lc {
    public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }
}
