package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;

/* renamed from: oi8  reason: default package */
public abstract class oi8 {
    public static void a(bi8 bi8, ComponentName componentName) {
        MediaSession mediaSession = bi8.a.a;
        mediaSession.getClass();
        mediaSession.setMediaButtonBroadcastReceiver(componentName);
    }
}
