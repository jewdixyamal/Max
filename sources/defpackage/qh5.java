package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: qh5  reason: default package */
public final class qh5 {
    public final Context a;
    public final bea b;
    public final tda c;
    public final p84 d;
    public final int e = c2c.tt_notification_file_downloading_title;
    public final int f = c2c.tt_worker_draft_sync;
    public final int g = c2c.tt_worker_gif_upload;
    public final int h = c2c.tt_worker_attach_upload;

    public qh5(Context context, bea bea, tda tda, p84 p84) {
        this.a = context;
        this.b = bea;
        this.c = tda;
        this.d = p84;
    }

    public final Notification a(String str, String str2, Long l, boolean z, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        bea bea = this.b;
        bea.c();
        this.d.getClass();
        bu9 h2 = bea.h("ru.oneme.app.fileUpload", true, true);
        h2.e = bu9.c(str);
        h2.f = bu9.c(str2);
        long longValue = l != null ? l.longValue() : 0;
        Notification notification = h2.F;
        notification.when = longValue;
        this.c.getClass();
        notification.icon = z ? gpc.q0 : gpc.m0;
        boolean z2 = i == -1;
        h2.o = 100;
        h2.p = i;
        h2.q = z2;
        h2.k = 0;
        h2.g(0);
        h2.p((Uri) null);
        h2.i(2, true);
        h2.i(16, false);
        h2.b.add(new nt9(0, this.a.getString(c2c.tt_worker_cancel), pendingIntent2));
        h2.v = "progress";
        h2.g = pendingIntent;
        return h2.b();
    }

    public final Notification b(long j, Long l, Long l2, String str, String str2, int i, boolean z, PendingIntent pendingIntent) {
        Intent intent;
        int hashCode = Long.hashCode(j);
        long j2 = 0;
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        bea bea = this.b;
        if (i2 == 0) {
            intent = bea.f(false);
        } else {
            long longValue = l != null ? l.longValue() : 0;
            if (l2 != null) {
                j2 = l2.longValue();
            }
            bea.getClass();
            vw7 vw7 = vw7.c;
            Long valueOf = Long.valueOf(longValue);
            Long valueOf2 = Long.valueOf(j2);
            vw7.getClass();
            intent = bea.k(vw7.Z1(j, valueOf, valueOf2));
        }
        return a(str, str2, l, z, i, oag.p(this.a, hashCode, intent), pendingIntent);
    }
}
