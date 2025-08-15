package ru.ok.messages.media.trim;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;

public class ActTrimVideo extends q5 implements xe8 {
    public cl8 U0;
    public we8 V0;

    public final String Z() {
        return null;
    }

    public final we8 b() {
        if (this.V0 == null) {
            this.V0 = ((y8a) ((ed3) this.K0.b)).k().n(ze8.c, new x50(true, false, false));
        }
        return this.V0;
    }

    public final we8 i() {
        hm9.p("ru.ok.messages.media.trim.ActTrimVideo", "Trim is only for video", (Throwable) null);
        ye8 k = ((y8a) ((ed3) this.K0.b)).k();
        ze8 ze8 = ze8.a;
        k.getClass();
        return k.n(ze8, new x50(false, false, true));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nd7.R(new b(6, (Object) this), 300);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.V0 = b();
        setContentView(yyb.act_trim_video);
        f0(u().L);
        if (bundle == null) {
            Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.VIDEO_URI");
            long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.START_POSITION", 0);
            long longExtra2 = getIntent().getLongExtra("ru.ok.tamtam.extra.END_POSITION", -1);
            boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.MUTE", false);
            if (longExtra2 == -1) {
                longExtra2 = s36.s(this, uri);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ru.ok.tamtam.extra.VIDEO_URI", uri);
            bundle2.putLong("ru.ok.tamtam.extra.START_POSITION", longExtra);
            bundle2.putLong("ru.ok.tamtam.extra.END_POSITION", longExtra2);
            bundle2.putBoolean("ru.ok.tamtam.extra.MUTE", booleanExtra);
            FrgTrimVideo frgTrimVideo = new FrgTrimVideo();
            frgTrimVideo.X0(bundle2);
            dy7.e(S(), xxb.act_trim_video__container, frgTrimVideo, "ru.ok.messages.media.trim.FrgTrimVideo");
            return;
        }
        bq7 bq7 = (bq7) this.V0;
        bq7.h = bundle.getFloat(bq7.b("MediaPlayerController.Volume"));
        bq7.i = bundle.getBoolean(bq7.b("MediaPlayerController.Looping"));
        bq7.j = bundle.getBoolean(bq7.b("MediaPlayerController.PlayWhenReady"));
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.V0 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.V0);
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.V0 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.V0);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.V0 != null) {
            ((y8a) ((ed3) this.K0.b)).k().l(this.V0);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        we8 we8 = this.V0;
        if (we8 != null) {
            bq7 bq7 = (bq7) we8;
            bundle.putFloat(bq7.b("MediaPlayerController.Volume"), bq7.h);
            bundle.putBoolean(bq7.b("MediaPlayerController.Looping"), bq7.i);
            bundle.putBoolean(bq7.b("MediaPlayerController.PlayWhenReady"), bq7.j);
        }
    }

    public final sme u() {
        if (this.U0 == null) {
            this.U0 = cl8.e0;
        }
        return this.U0;
    }
}
