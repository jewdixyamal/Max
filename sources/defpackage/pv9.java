package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: pv9  reason: default package */
public final class pv9 {
    public static final Object c = new Object();
    public static String d;
    public static HashSet e = new HashSet();
    public static final Object f = new Object();
    public static ov9 g;
    public final Context a;
    public final NotificationManager b;

    public pv9(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i, notification);
            return;
        }
        lv9 lv9 = new lv9(this.a.getPackageName(), i, str, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new ov9(this.a.getApplicationContext());
                }
                g.b.obtainMessage(0, lv9).sendToTarget();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        notificationManager.cancel(str, i);
    }
}
