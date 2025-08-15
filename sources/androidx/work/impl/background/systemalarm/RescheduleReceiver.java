package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = a14.O("RescheduleReceiver");

    public final void onReceive(Context context, Intent intent) {
        a14 u = a14.u();
        String str = a;
        u.n(str, "Received intent " + intent);
        try {
            s7g d = s7g.d(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            d.getClass();
            synchronized (s7g.m) {
                BroadcastReceiver.PendingResult pendingResult = d.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                d.i = goAsync;
                if (d.h) {
                    goAsync.finish();
                    d.i = null;
                }
            }
        } catch (IllegalStateException e) {
            a14.u().r(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        } catch (Throwable th) {
            throw th;
        }
    }
}
