package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: al8  reason: default package */
public final class al8 extends pu9 {
    public final qh8 e;
    public int[] f;

    public al8(qh8 qh8) {
        this.e = qh8;
    }

    public final void b(m5d m5d) {
        if (oaf.a >= 21) {
            Notification.MediaStyle a = zk8.a();
            int[] iArr = this.f;
            qh8 qh8 = this.e;
            Notification.MediaStyle b = zk8.b(a, iArr, qh8);
            Notification.Builder builder = (Notification.Builder) m5d.c;
            zk8.c(builder, b);
            Bundle bundle = new Bundle();
            bundle.putBundle("androidx.media3.session", qh8.a.j.b());
            builder.addExtras(bundle);
        }
    }

    public final RemoteViews h() {
        if (oaf.a >= 21) {
            return null;
        }
        int min = Math.min(((bu9) this.b).b.size(), 5);
        RemoteViews c = c(min <= 3 ? ryb.media3_notification_template_big_media_narrow : ryb.media3_notification_template_big_media);
        c.removeAllViews(cvb.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                c.addView(cvb.media_actions, p((nt9) ((bu9) this.b).b.get(i)));
            }
        }
        c.setViewVisibility(cvb.cancel_action, 8);
        return c;
    }

    public final RemoteViews i() {
        if (oaf.a >= 21) {
            return null;
        }
        RemoteViews c = c(ryb.media3_notification_template_media);
        int size = ((bu9) this.b).b.size();
        int[] iArr = this.f;
        if (iArr != null) {
            int min = Math.min(iArr.length, 3);
            c.removeAllViews(cvb.media_actions);
            if (min > 0) {
                int i = 0;
                while (i < min) {
                    if (i < size) {
                        c.addView(cvb.media_actions, p((nt9) ((bu9) this.b).b.get(iArr[i])));
                        i++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
                    }
                }
            }
        }
        c.setViewVisibility(cvb.end_padder, 0);
        c.setViewVisibility(cvb.cancel_action, 8);
        return c;
    }

    public final RemoteViews p(nt9 nt9) {
        boolean z = nt9.j == null;
        RemoteViews remoteViews = new RemoteViews(((bu9) this.b).a.getPackageName(), ryb.media3_notification_media_action);
        IconCompat a = nt9.a();
        if (a != null) {
            remoteViews.setImageViewResource(cvb.action0, a.e());
        }
        if (!z) {
            remoteViews.setOnClickPendingIntent(cvb.action0, nt9.j);
        }
        remoteViews.setContentDescription(cvb.action0, nt9.i);
        return remoteViews;
    }

    public final void q(int... iArr) {
        this.f = iArr;
    }
}
