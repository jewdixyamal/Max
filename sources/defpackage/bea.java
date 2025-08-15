package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import one.me.android.MainActivity;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: bea  reason: default package */
public final class bea {
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public pv9 h;
    public NotificationManager i;
    public final String j;
    public final String k;

    public bea(String str, String str2, Context context, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.a = context;
        this.d = je7;
        this.b = je72;
        this.c = je73;
        this.e = je74;
        this.f = je76;
        this.g = je75;
        c();
        this.j = str;
        this.k = str2;
    }

    public final void a(int i2) {
        ((tda) this.d.getValue()).getClass();
        b(i2, (String) null);
    }

    public final void b(int i2, String str) {
        Locale locale = Locale.ENGLISH;
        hm9.m("bea", "cancel: notificationId = " + i2 + ", notificationTag = " + str, new Object[0]);
        j(true).b.cancel(str, i2);
    }

    public final void c() {
        try {
            ((lt9) this.e.getValue()).f();
        } catch (Throwable th) {
            hm9.p("bea", "fail to create missing channels", th);
            ((o45) this.f.getValue()).a(th);
        }
    }

    public final List d(String str) {
        try {
            List asList = Arrays.asList(i().getActiveNotifications());
            if (oag.t(str)) {
                return asList;
            }
            if ((asList instanceof Collection) && asList.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : asList) {
                try {
                    if (str.equals(((StatusBarNotification) next).getTag())) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return Collections.emptyList();
        }
    }

    public final mt9 e(ql2 ql2, int i2, int i3) {
        int i4 = NotificationTamService.u0;
        Context context = this.a;
        Intent intent = new Intent(context, NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.DIRECT_REPLY");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", ql2.c);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", ql2.a);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", ql2.b);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", ql2.l);
        PendingIntent service = PendingIntent.getService(context, i2, intent, oag.I(intent, oag.m(134217728)));
        HashSet hashSet = new HashSet();
        vfc vfc = new vfc("ru.ok.tamtam.extra.TEXT_REPLY", context.getString(c2c.tt_reply), (CharSequence[]) null, true, 0, new Bundle(), hashSet);
        mt9 mt9 = new mt9(i3, context.getString(c2c.tt_reply), service);
        mt9.f = new ArrayList();
        mt9.f.add(vfc);
        mt9.g = 1;
        mt9.h = false;
        return mt9;
    }

    public final Intent f(boolean z) {
        vw7.c.getClass();
        Intent k2 = k(vw7.a2((String) null, z));
        if (z) {
            k2.putExtra("push_action", "push_action_open_chats");
        }
        return k2;
    }

    public final mt9 g(ql2 ql2, int i2, int i3) {
        int i4 = NotificationTamService.u0;
        Context context = this.a;
        Intent intent = new Intent(context, NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.MARK_AS_READ");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", ql2.c);
        intent.putExtra("ru.ok.tamtam.extra.MARK", ql2.m);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", ql2.a);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", ql2.b);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", ql2.l);
        mt9 mt9 = new mt9(i3, context.getString(c2c.tt_mark_as_read), PendingIntent.getService(context, i2, intent, oag.I(intent, oag.m(201326592))));
        mt9.g = 2;
        mt9.h = false;
        return mt9;
    }

    public final bu9 h(String str, boolean z, boolean z2) {
        String str2;
        boolean z3;
        Uri uri;
        c();
        bu9 bu9 = new bu9(this.a, str);
        je7 je7 = this.d;
        ((tda) je7.getValue()).getClass();
        bu9.F.icon = avb.ic_notification;
        bu9.x = ((tda) je7.getValue()).d();
        bu9.i(16, true);
        bu9.f(((tda) je7.getValue()).a.getString(yzb.oneme_app_name));
        bu9.z = str;
        jp jpVar = ((p7b) ((m7b) this.b.getValue())).c;
        je7 je72 = this.c;
        if (((lqf) ((zp) je72.getValue())).c()) {
            z3 = jpVar.g.getBoolean("app.notification.in.app.vibrate", true);
            str2 = jpVar.d("app.notification.in.app.sound", true) ? jpVar.x("app.notification.ringtone") : null;
        } else {
            z3 = jpVar.d("app.notification.vibrate", true);
            str2 = jpVar.x("app.notification.ringtone");
        }
        int i2 = 0;
        boolean z4 = jpVar.g.getBoolean("app.notification.important.priority", true) && !((lqf) ((zp) je72.getValue())).c();
        int e2 = jpVar.e("app.notification.led.color", jpVar.v());
        if (z) {
            if (z3) {
                i2 = 2;
            } else {
                bu9.F.vibrate = new long[0];
            }
            if (str2 == null || "_NONE_".equals(str2)) {
                bu9.p((Uri) null);
            } else {
                if ("DEFAULT".equals(str2)) {
                    ((tda) je7.getValue()).getClass();
                    uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                } else {
                    uri = Uri.parse(str2);
                }
                bu9.p(uri);
            }
            bu9.g(i2);
        }
        if (e2 != 0) {
            Notification notification = bu9.F;
            notification.ledARGB = e2;
            notification.ledOnMS = 1000;
            notification.ledOffMS = 1000;
            notification.flags = (notification.flags & -2) | 1;
        }
        if (z4) {
            bu9.k = 2;
        }
        bu9.u = z2;
        return bu9;
    }

    public final NotificationManager i() {
        if (this.i == null) {
            this.i = (NotificationManager) this.a.getSystemService("notification");
            c();
        }
        return this.i;
    }

    public final pv9 j(boolean z) {
        if (this.h == null) {
            this.h = new pv9(this.a);
        }
        if (z) {
            c();
        }
        return this.h;
    }

    public final Intent k(c64 c64) {
        vw7.c.getClass();
        Context context = this.a;
        String str = this.j;
        String str2 = this.k;
        Intent intent = new Intent(context, MainActivity.class);
        intent.setAction("CUSTOM_DEEP_LINK");
        vw7.c.getClass();
        intent.setData(Uri.parse(str + "://" + str2 + "/" + c64.b));
        return intent;
    }

    public final void l(bu9 bu9, Intent intent, Intent intent2, int i2, String str) {
        Context context = this.a;
        bu9.g = oag.p(context, i2, intent);
        if (intent2 != null) {
            bu9.F.deleteIntent = PendingIntent.getService(context, i2, intent2, oag.I(intent2, oag.m(134217728)));
        }
        Notification b2 = bu9.b();
        ((tda) this.d.getValue()).e();
        j(true).a(str, i2, b2);
        hm9.h0("bea", "notify: tag = %s, id = %d, %s", str, Integer.valueOf(i2), b2);
    }

    public final void m() {
        try {
            lt9 lt9 = (lt9) this.e.getValue();
            lt9.c.getClass();
            NotificationChannel g2 = lt9.g("ru.oneme.app.new.activeCalls");
            kt9 a2 = lt9.a();
            if (g2 == null) {
                lt9.e(a2);
            } else if (!(g2.getSound() == null && !g2.shouldVibrate() && g2.getAudioAttributes() == null && g2.getImportance() == 2)) {
                lt9.i().deleteNotificationChannel("ru.oneme.app.new.activeCalls");
                lt9.e(a2);
            }
            hm9.m("bea", "recreateActiveCallChannelIfNeeded: created = $created", new Object[0]);
        } catch (Throwable th) {
            hm9.p("bea", "recreateActiveCallChannelIfNeeded", th);
        }
    }
}
