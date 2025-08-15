package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import java.util.HashSet;
import java.util.List;

/* renamed from: lt9  reason: default package */
public final class lt9 {
    public final Context a;
    public final tda b;
    public final p84 c;
    public final kaa d;
    public final m7b e;
    public NotificationManager f;

    public lt9(Context context, tda tda, p84 p84, kaa kaa, m7b m7b) {
        this.a = context;
        this.b = tda;
        this.c = p84;
        this.d = kaa;
        this.e = m7b;
    }

    public final kt9 a() {
        this.c.getClass();
        return new kt9("ru.oneme.app.new.activeCalls", this.a.getString(c2c.tt_notif_category_active_calls), false, false, (Uri) null, false, (long[]) null, false, 2, false);
    }

    public final kt9 b() {
        p7b p7b = (p7b) this.e;
        boolean z = !p7b.c.x("app.notification.chats.ringtone").equals("_NONE_");
        Uri h = h(false);
        this.c.getClass();
        return new kt9("ru.oneme.app.chats", this.a.getString(c2c.tt_notif_category_chats), z, p7b.c.g.getBoolean("app.notification.chats.vibrate", true), h, p7b.c.g.getBoolean("app.notification.important.priority", true), (long[]) null, false, -1000, true);
    }

    public final kt9 c() {
        p7b p7b = (p7b) this.e;
        boolean z = !p7b.c.x("app.notification.ringtone").equals("_NONE_");
        Uri h = h(true);
        this.c.getClass();
        return new kt9("ru.oneme.app.dialogs", this.a.getString(c2c.tt_notif_category_dialogs), z, p7b.c.d("app.notification.vibrate", true), h, p7b.c.g.getBoolean("app.notification.important.priority", true), (long[]) null, false, -1000, true);
    }

    public final kt9 d() {
        this.b.getClass();
        this.c.getClass();
        return new kt9("ru.oneme.app.inapp.2", this.a.getString(c2c.tt_notif_category_inapp), true, ((p7b) this.e).c.g.getBoolean("app.notification.in.app.vibrate", true), (Uri) null, false, new long[]{0, 100}, false, -1000, true);
    }

    public final void e(kt9 kt9) {
        StringBuilder sb = new StringBuilder("createChannel: ");
        String str = kt9.a;
        sb.append(str);
        hm9.m("lt9", sb.toString(), new Object[0]);
        int i = kt9.c ? kt9.f ? 4 : 3 : 2;
        int i2 = 5;
        if (kt9.h) {
            i = 5;
        }
        int i3 = kt9.i;
        if (i3 != -1000) {
            i = i3;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, kt9.b, i);
        Uri uri = kt9.e;
        if (uri != null) {
            this.c.getClass();
            boolean equals = str.equals("ru.oneme.app.new.incomingCalls.");
            AudioAttributes.Builder contentType = new AudioAttributes.Builder().setContentType(4);
            if (equals) {
                i2 = 6;
            }
            notificationChannel.setSound(uri, contentType.setUsage(i2).build());
        } else {
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
        }
        notificationChannel.enableVibration(kt9.d);
        long[] jArr = kt9.g;
        if (jArr != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(this.b.d());
        String b2 = this.d.b(str);
        if (b2 != null) {
            notificationChannel.setGroup(b2);
        }
        notificationChannel.setShowBadge(kt9.j);
        i().createNotificationChannel(notificationChannel);
    }

    public final void f() {
        kaa kaa = this.d;
        List<NotificationChannelGroup> notificationChannelGroups = ((NotificationManager) kaa.e.getValue()).getNotificationChannelGroups();
        if (notificationChannelGroups != null) {
            xs xsVar = new xs(0);
            for (NotificationChannelGroup id : notificationChannelGroups) {
                xsVar.add(id.getId());
            }
            if (!xsVar.contains("ru.oneme.app.notifications.group.chats")) {
                kaa.a(dpc.z, "ru.oneme.app.notifications.group.chats");
            }
            if (!xsVar.contains("ru.oneme.app.notifications.group.other")) {
                kaa.a(dpc.A, "ru.oneme.app.notifications.group.other");
            }
            if (!xsVar.contains("ru.oneme.app.notifications.group.calls")) {
                kaa.a(dpc.y, "ru.oneme.app.notifications.group.calls");
            }
        }
        List<NotificationChannel> notificationChannels = i().getNotificationChannels();
        HashSet hashSet = new HashSet();
        for (NotificationChannel id2 : notificationChannels) {
            hashSet.add(id2.getId());
        }
        this.c.getClass();
        if (!hashSet.contains("ru.oneme.app.chats")) {
            e(b());
            hashSet.add("ru.oneme.app.chats");
        }
        if (!hashSet.contains("ru.oneme.app.dialogs")) {
            e(c());
            hashSet.add("ru.oneme.app.dialogs");
        }
        boolean contains = hashSet.contains("ru.oneme.app.misc");
        m7b m7b = this.e;
        Context context = this.a;
        if (!contains) {
            p7b p7b = (p7b) m7b;
            e(new kt9("ru.oneme.app.misc", context.getString(c2c.tt_notif_category_misc), !p7b.c.x("app.notification.ringtone").equals("_NONE_"), p7b.c.d("app.notification.vibrate", true), h(true), false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.misc");
        }
        if (!hashSet.contains("ru.oneme.app.inapp.2")) {
            e(d());
            hashSet.add("ru.oneme.app.inapp.2");
        }
        if (!hashSet.contains("ru.oneme.app.fileUpload")) {
            e(new kt9("ru.oneme.app.fileUpload", context.getString(c2c.tt_notif_category_file_loading), false, false, (Uri) null, false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.fileUpload");
        }
        if (!hashSet.contains("ru.oneme.app.media")) {
            e(new kt9("ru.oneme.app.media", context.getString(c2c.tt_notif_category_media), true, false, (Uri) null, false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.media");
        }
        if (hashSet.contains("ru.oneme.app.incomingCalls")) {
            try {
                i().deleteNotificationChannel("ru.oneme.app.incomingCalls");
            } catch (Throwable unused) {
            }
        }
        if (hashSet.contains("ru.oneme.app.activeCalls")) {
            try {
                i().deleteNotificationChannel("ru.oneme.app.activeCalls");
            } catch (Throwable unused2) {
            }
        }
        if (!hashSet.contains("ru.oneme.app.new.incomingCalls.")) {
            e(new kt9("ru.oneme.app.new.incomingCalls.", context.getString(c2c.tt_notif_category_incoming_calls), false, ((p7b) m7b).c.d("app.notification.vibrate", true), (Uri) null, true, (long[]) null, true, -1000, false));
            hashSet.add("ru.oneme.app.new.incomingCalls.");
        }
        if (!hashSet.contains("ru.oneme.app.new.activeCalls")) {
            e(a());
            hashSet.add("ru.oneme.app.new.activeCalls");
        }
        if (!hashSet.contains("ru.oneme.app.liveLocation")) {
            e(new kt9("ru.oneme.app.liveLocation", context.getString(c2c.tt_notif_category_live_location), false, false, (Uri) null, false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.liveLocation");
        }
    }

    public final NotificationChannel g(String str) {
        if (oag.t(str)) {
            return null;
        }
        for (NotificationChannel next : i().getNotificationChannels()) {
            if (str.equals(next.getId())) {
                return next;
            }
        }
        return null;
    }

    public final Uri h(boolean z) {
        p7b p7b = (p7b) this.e;
        String x = z ? p7b.c.x("app.notification.ringtone") : p7b.c.x("app.notification.chats.ringtone");
        if (!"DEFAULT".equals(x)) {
            return Uri.parse(x);
        }
        this.b.getClass();
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public final NotificationManager i() {
        if (this.f == null) {
            this.f = (NotificationManager) this.a.getSystemService("notification");
        }
        return this.f;
    }
}
