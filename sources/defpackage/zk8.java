package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;

/* renamed from: zk8  reason: default package */
public abstract class zk8 {
    public static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, qh8 qh8) {
        mediaStyle.getClass();
        qh8.getClass();
        if (iArr != null) {
            d(mediaStyle, iArr);
        }
        mediaStyle.setMediaSession((MediaSession.Token) qh8.a.h.j.a.c.b);
        return mediaStyle;
    }

    public static void c(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void d(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
