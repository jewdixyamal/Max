package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: vi3  reason: default package */
public abstract class vi3 extends BroadcastReceiver {
    public static final String a = a14.O("ConstraintProxy");

    public final void onReceive(Context context, Intent intent) {
        a14 u = a14.u();
        u.n(a, "onReceive : " + intent);
        String str = d73.X;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
