package defpackage;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zt9  reason: default package */
public final class zt9 extends pu9 {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ zt9(int i) {
        this.e = i;
    }

    public final void b(m5d m5d) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) m5d.c).setBigContentTitle((CharSequence) this.c).bigText((CharSequence) this.f);
                if (this.a) {
                    bigText.setSummaryText((CharSequence) this.d);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) m5d.c).setBigContentTitle((CharSequence) this.c);
                if (this.a) {
                    bigContentTitle.setSummaryText((CharSequence) this.d);
                }
                Iterator it = ((ArrayList) this.f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                return;
        }
    }

    public final String e() {
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
