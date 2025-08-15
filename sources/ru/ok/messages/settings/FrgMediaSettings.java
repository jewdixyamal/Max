package ru.ok.messages.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.dialogs.LoadMediaDialog;
import ru.ok.messages.views.dialogs.VideoCompressionModeDialog;

public class FrgMediaSettings extends FrgBaseSettings implements bx0 {
    public jp E1;
    public gh3 F1;
    public ad G1;
    public volatile String H1 = "";
    public cx0 I1;

    public final void F() {
    }

    public final void I() {
    }

    public final void J() {
    }

    public final void K0() {
        super.K0();
        this.I1.b();
        ((y8a) ((ed3) this.p1.b)).m().f(wuc.SETTINGS_MEDIA, spa.f);
    }

    public final void O0(View view, Bundle bundle) {
        c0().f0("VideoCompressionModeDialog:result:request", this, new ydf((Runnable) null, new v5(3, this), 0));
    }

    public final void S() {
    }

    public final void f(ArrayList arrayList) {
    }

    public final String f1() {
        return "SETTINGS_MEDIA";
    }

    public final void l1(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 101) {
            int intExtra = intent.getIntExtra("ru.ok.tamtam.extra.SETTING_ID", 0);
            int intExtra2 = intent.getIntExtra("ru.ok.tamtam.extra.RESULT_ITEM", -1);
            if (intExtra == xxb.setting_media_photo) {
                this.E1.k(intExtra2, "app.media.load.photo");
            } else if (intExtra == xxb.setting_media_gif) {
                this.E1.k(intExtra2, "app.media.load.gif");
            } else if (intExtra == xxb.setting_media_audio) {
                this.E1.k(intExtra2, "app.media.load.audio");
            } else if (intExtra == xxb.setting_media_stickers) {
                this.E1.k(intExtra2, "app.media.load.stickers");
            } else if (intExtra == xxb.setting_media_auto_play_video) {
                this.G1.d(intExtra2, "VIDEO_AUTO_PLAY_LOAD_TYPE_CHANGE");
                this.E1.k(intExtra2, "app.video.auto.play");
            }
            v1();
        }
    }

    public final void m(String str) {
        this.H1 = str;
        if (this.o1) {
            v1();
        }
    }

    public final ArrayList r1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gcd(0, h0(jpc.Z0), "", (String) null, (Boolean) null, 3));
        arrayList.add(gcd.a(xxb.setting_media_photo, h0(jpc.q1), w1(this.E1.g.getInt("app.media.load.photo", 0), xxb.setting_media_photo)));
        int i = xxb.setting_media_gif;
        int i2 = jpc.m1;
        arrayList.add(gcd.a(i, h0(i2), w1(this.E1.g.getInt("app.media.load.gif", 0), xxb.setting_media_gif)));
        arrayList.add(gcd.a(xxb.setting_media_audio, h0(jpc.Y0), w1(this.E1.g.getInt("app.media.load.audio", 0), xxb.setting_media_audio)));
        gcd gcd = new gcd(xxb.setting_media_roaming, h0(jpc.r1), this.E1.n() ? h0(jpc.u1) : h0(jpc.t1), (String) null, Boolean.valueOf(this.E1.n()), 2);
        gcd.Z = true;
        arrayList.add(gcd);
        arrayList.add(new gcd(0, h0(jpc.a1), "", (String) null, (Boolean) null, 3));
        gcd a = gcd.a(xxb.setting_media_auto_play_video, h0(jpc.B), w1(this.E1.g.getInt("app.video.auto.play", 1), xxb.setting_media_auto_play_video));
        a.Z = true;
        arrayList.add(a);
        arrayList.add(new gcd(xxb.setting_media_auto_play_gif, h0(i2), "", (String) null, Boolean.valueOf(this.E1.g.getBoolean("app.media.autoplay.gif", true)), 2));
        arrayList.add(new gcd(0, h0(jpc.j1), "", (String) null, (Boolean) null, 3));
        gcd a2 = gcd.a(xxb.setting_media_video_auto_compress, h0(jpc.k1), this.E1.q().a.a);
        a2.Z = true;
        arrayList.add(a2);
        arrayList.add(new gcd(xxb.setting_media_caching_setting, h0(jpc.f1), "", this.H1, (Boolean) null, 1));
        return arrayList;
    }

    public final String s1() {
        return h0(jpc.H0);
    }

    public final void t1(int i) {
        if (i == xxb.setting_media_photo || i == xxb.setting_media_video || i == xxb.setting_media_gif || i == xxb.setting_media_audio || i == xxb.setting_media_stickers || i == xxb.setting_media_auto_play_video) {
            LoadMediaDialog loadMediaDialog = new LoadMediaDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("ru.ok.tamtam.extra.SETTING_ID", i);
            loadMediaDialog.X0(bundle);
            loadMediaDialog.b1(HttpStatus.SC_SWITCHING_PROTOCOLS, this);
            loadMediaDialog.k1(this.F0, "ru.ok.messages.views.dialogs.LoadMediaDialog");
        } else if (i == xxb.setting_media_video_auto_compress) {
            VideoCompressionModeDialog videoCompressionModeDialog = new VideoCompressionModeDialog();
            videoCompressionModeDialog.X0(dy7.g(new kpa("ru.ok.tamtam.extra.SETTING_ID", Integer.valueOf(i))));
            videoCompressionModeDialog.k1(c0(), "ru.ok.messages.settings.FrgBaseSettings");
        } else if (i == xxb.setting_media_caching_setting) {
            Context d0 = d0();
            int i2 = xxb.setting_media_caching;
            int i3 = ActSettings.V0;
            Intent intent = new Intent(d0, ActSettings.class);
            intent.putExtra("ru.ok.tamtam.extra.SETTING_ID", i2);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_PUSH_ALERT", false);
            d0.startActivity(intent);
        }
    }

    public final void u1(int i, Object obj) {
        if (i == xxb.setting_media_gallery_auto_save) {
            this.E1.j("app.media.save.to.gallery", ((Boolean) obj).booleanValue());
        } else if (i == xxb.setting_media_auto_play_gif) {
            this.E1.j("app.media.autoplay.gif", ((Boolean) obj).booleanValue());
        } else if (i == xxb.setting_media_roaming) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.E1.j("app.media.load.roaming", booleanValue);
            this.G1.g("ROAMING_SWITCH", booleanValue ? "1" : "0");
            v1();
        }
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        this.E1 = ((y8a) ((ed3) this.p1.b)).n().c;
        ((y8a) ((ed3) this.p1.b)).n();
        this.F1 = (gh3) ((y8a) ((ed3) this.p1.b)).getAccessor().c(gh3.class);
        this.G1 = ((y8a) ((ed3) this.p1.b)).b();
        this.I1 = new cx0((ng5) this.q1.getAccessor().c(ng5.class), (f40) ((y8a) ((ed3) this.p1.b)).getAccessor().c(f40.class), new s23(d0()), this.q1.u(), muc.a(), ce.a(), new z16(4, this), this);
    }

    public final String w1(int i, int i2) {
        if (i == -1) {
            return i2 == xxb.setting_media_auto_play_video ? h0(jpc.b1) : h0(jpc.l1);
        }
        String str = "";
        if (i != 0) {
            return i != 1 ? str : h0(jpc.o1);
        }
        if (!this.E1.n() && this.F1.g()) {
            str = " " + h0(jpc.s1);
        }
        return h0(jpc.W0) + str;
    }
}
