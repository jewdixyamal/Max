package defpackage;

import android.app.Notification;

/* renamed from: ju9  reason: default package */
public abstract class ju9 {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
