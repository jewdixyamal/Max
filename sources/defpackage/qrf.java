package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: qrf  reason: default package */
public abstract class qrf {
    public static final String a = a14.O("WakeLocks");

    public static final PowerManager.WakeLock a(Context context, String str) {
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, concat);
        synchronized (rrf.a) {
            String str2 = (String) rrf.b.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
