package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;

/* renamed from: hu9  reason: default package */
public final class hu9 extends pu9 {
    public int[] e;
    public MediaSessionCompat.Token f;

    public final void b(m5d m5d) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) m5d.c;
        if (i >= 34) {
            pt9.d(builder, pt9.b(vt9.a(pt9.a(), (CharSequence) null, 0, (PendingIntent) null, Boolean.FALSE), this.e, this.f));
        } else {
            pt9.d(builder, pt9.b(pt9.a(), this.e, this.f));
        }
    }

    public final RemoteViews h() {
        return null;
    }

    public final RemoteViews i() {
        return null;
    }
}
