package defpackage;

import android.app.Notification;

/* renamed from: tu9  reason: default package */
public abstract class tu9 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }
}
