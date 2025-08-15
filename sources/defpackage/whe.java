package defpackage;

import android.app.Notification;
import android.app.Service;

/* renamed from: whe  reason: default package */
public abstract class whe {
    public static void a(Service service, int i, Notification notification, int i2) {
        service.startForeground(i, notification, i2);
    }
}
