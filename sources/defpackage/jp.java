package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.WeakHashMap;

/* renamed from: jp  reason: default package */
public final class jp extends kxc {
    public static int[] n;
    public final WeakHashMap m = new WeakHashMap(1);

    public jp(Context context, mi5 mi5) {
        super(context, mi5);
    }

    public final boolean u() {
        return this.g.getBoolean("app.messages.enable.animations", true);
    }

    public final int v() {
        return w()[3];
    }

    public final int[] w() {
        if (n == null) {
            Context context = this.f;
            n = new int[]{context.getResources().getColor(ftb.led_1), context.getResources().getColor(ftb.led_2), context.getResources().getColor(ftb.led_3), context.getResources().getColor(ftb.led_4), context.getResources().getColor(ftb.led_5), context.getResources().getColor(ftb.led_6), context.getResources().getColor(ftb.led_7)};
        }
        return n;
    }

    public final String x(String str) {
        ne7 ne7 = this.g;
        String string = ne7.getString(str, "DEFAULT");
        if (!string.equals("DEFAULT") && !string.equals("_NONE_")) {
            if (ne7.getBoolean("app.oldSounds", false)) {
                this.f.getResources();
                throw null;
            } else if (string.equals(Settings.System.DEFAULT_NOTIFICATION_URI.toString())) {
                return "DEFAULT";
            }
        }
        return string;
    }

    public final void y(String str) {
        m("app.night.mode", str);
    }

    public final void z(gaf gaf) {
        hm9.m("jp", "updateUserSettings, settings = %s", gaf);
        Long l = gaf.b;
        if (l != null) {
            l("app.notification.dontDisturbUntil", l);
        }
        Boolean bool = gaf.a;
        if (bool != null) {
            j("app.notification.show.new.users", bool.booleanValue());
        }
        int i = 2;
        String str = gaf.c;
        if (str != null) {
            int i2 = !str.equals("OFF") ? !str.equals("REPLY") ? 0 : 2 : 1;
            k(i2, "app.notification.dialogs.show");
            this.j.e(Integer.valueOf(i2));
        }
        String str2 = gaf.d;
        if (str2 != null) {
            if (str2.equals("OFF")) {
                i = 1;
            } else if (!str2.equals("REPLY")) {
                i = 0;
            }
            s(i);
        }
        String str3 = gaf.e;
        if (str3 != null) {
            m("app.notification.ringtone", str3);
        }
        String str4 = gaf.f;
        if (str4 != null) {
            m("app.notification.dialogs.ringtone", str4);
        }
        String str5 = gaf.g;
        if (str5 != null) {
            m("app.notification.chats.ringtone", str5);
        }
        Integer num = gaf.i;
        if (num != null) {
            k(m6d.s(num.intValue()), "app.notification.led.color");
        }
        Boolean bool2 = gaf.h;
        if (bool2 != null) {
            j("app.privacy.online.show", !bool2.booleanValue());
        }
        Integer num2 = gaf.j;
        if (num2 != null) {
            k(m6d.s(num2.intValue()), "app.notification.dialogs.led.color");
        }
        Integer num3 = gaf.k;
        if (num3 != null) {
            k(m6d.s(num3.intValue()), "app.notification.chats.led.color");
        }
        Boolean bool3 = gaf.l;
        if (bool3 != null) {
            j("app.notification.vibrate", bool3.booleanValue());
        }
        Boolean bool4 = gaf.m;
        if (bool4 != null) {
            j("app.notification.dialogs.vibrate", bool4.booleanValue());
        }
        Boolean bool5 = gaf.n;
        if (bool5 != null) {
            j("app.notification.chats.vibrate", bool5.booleanValue());
        }
        int i3 = gaf.p;
        if (i3 != 0) {
            m("app.privacy.incoming.call", h4f.k(i3));
        }
        int i4 = gaf.o;
        if (i4 != 0) {
            m("app.privacy.chats.invite", h4f.k(i4));
        }
        faf faf = gaf.q;
        if (faf != null) {
            m("app.privacy.inactive.ttl", faf.a);
        }
        int i5 = gaf.r;
        if (i5 != 0) {
            m("app.group.chat.call.notification.status", h4f.j(i5));
        }
        int i6 = gaf.s;
        if (i6 != 0) {
            m("app.suggest.stickers.status", h4f.l(i6));
        }
        Boolean bool6 = gaf.t;
        if (bool6 != null) {
            j("audio.transcription.enabled", bool6.booleanValue());
        }
        Boolean bool7 = gaf.u;
        if (bool7 != null) {
            j("app.privacy.safe_mode", bool7.booleanValue());
        }
        int i7 = gaf.v;
        if (i7 != 0) {
            m("app.privacy.search_by_phone", h4f.k(i7));
        }
        Boolean bool8 = gaf.w;
        if (bool8 != null) {
            j("app.privacy.unsafe.files", bool8.booleanValue());
        }
    }
}
