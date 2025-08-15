package ru.ok.messages.settings;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/settings/FrgMessagesSettings;", "Lru/ok/messages/settings/FrgBaseSettings;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class FrgMessagesSettings extends FrgBaseSettings {
    public final String f1() {
        return "SETTINGS_MESSAGES";
    }

    public final ArrayList r1() {
        String str;
        jp jpVar = ((y8a) ((ed3) this.p1.b)).n().c;
        ArrayList arrayList = new ArrayList();
        gcd gcd = new gcd(xxb.setting_message_send_by_enter, h0(jpc.C1), (String) null, (String) null, Boolean.valueOf(jpVar.g.getBoolean("app.messages.send.by.enter", false)), 2);
        gcd.Z = true;
        arrayList.add(gcd);
        z7d z7d = ((y8a) ((ed3) this.p1.b)).n().b;
        z7d.getClass();
        List t = z7d.t(PmsKey.f8audiotranscriptionlocales, qyc.n);
        t33 t33 = ((y8a) ((ed3) this.p1.b)).n().a;
        int i = lz7.g;
        String r = t33.r();
        if (oag.t(r)) {
            r = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        }
        Locale locale = Locale.ROOT;
        if (!t.contains(r.toLowerCase(locale)) && !t.contains(Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage().toLowerCase(locale))) {
            str = null;
        } else {
            int i2 = xxb.setting_message_audio_transcription;
            String h0 = h0(jpc.B1);
            Boolean valueOf = Boolean.valueOf(jpVar.g.getBoolean("audio.transcription.enabled", true));
            str = null;
            gcd gcd2 = new gcd(i2, h0, (String) null, (String) null, valueOf, 2);
            gcd2.Z = true;
            arrayList.add(gcd2);
        }
        arrayList.add(gcd.a(xxb.setting_message_stickers, h0(jpc.c3), str));
        return arrayList;
    }

    public final String s1() {
        return h0(jpc.A1);
    }

    public final void t1(int i) {
    }

    public final void u1(int i, Object obj) {
        jp jpVar = vl.o.a().c;
        if (i == xxb.setting_message_send_by_enter) {
            jpVar.j("app.messages.send.by.enter", ((Boolean) obj).booleanValue());
            return;
        }
        String str = "1";
        if (i == xxb.setting_message_in_app_browser) {
            ad b = ((y8a) ((ed3) this.p1.b)).b();
            Boolean bool = (Boolean) obj;
            if (!bool.booleanValue()) {
                str = "2";
            }
            b.g("ACTION_IN_APP_BROWSER", str);
            jpVar.j("app.messages.inAppBrowser", bool.booleanValue());
        } else if (i == xxb.setting_message_replace_emoji) {
            ad b2 = ((y8a) ((ed3) this.p1.b)).b();
            Boolean bool2 = (Boolean) obj;
            if (!bool2.booleanValue()) {
                str = "0";
            }
            b2.g("REPLACE_EMOJI", str);
            jpVar.j("app.messages.replace.emoji", bool2.booleanValue());
        } else if (i == xxb.setting_message_reactions_double_tap) {
            ad b3 = ((y8a) ((ed3) this.p1.b)).b();
            Boolean bool3 = (Boolean) obj;
            if (!bool3.booleanValue()) {
                str = "0";
            }
            b3.g("ENABLE_DOUBLE_TAP_REACTIONS", str);
            jpVar.j("app.messages.enable.double.tap.reactions", bool3.booleanValue());
        } else if (i == xxb.setting_message_audio_transcription) {
            ad b4 = ((y8a) ((ed3) this.p1.b)).b();
            Boolean bool4 = (Boolean) obj;
            if (!bool4.booleanValue()) {
                str = "0";
            }
            b4.g("ENABLE_AUDIO_TRANSCRIPTION", str);
            jpVar.j("audio.transcription.enabled", bool4.booleanValue());
            j47.T(f46.J(this), ((w9a) ((kke) ((y8a) ((ed3) this.p1.b)).getAccessor().c(kke.class))).b().plus(xq9.a), (vx3) null, new z46(this, (Continuation) null), 2);
        }
    }
}
