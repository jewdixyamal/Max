package ru.ok.messages.media.trim;

import android.content.res.Configuration;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import ru.ok.messages.views.fragments.base.FrgBase;

public class FrgTrimVideo extends FrgBase {
    public MediaMetadataRetriever B1;
    public hk9 C1;
    public Uri D1;

    public final void H0() {
        super.H0();
        hk9 hk9 = this.C1;
        if (hk9 != null) {
            hk9.pause();
        }
    }

    public final void L0(Bundle bundle) {
        super.L0(bundle);
        hk9 hk9 = this.C1;
        if (hk9 != null) {
            bundle.putLong("ru.ok.tamtam.extra.POINTER_POSITION", hk9.u0);
            bundle.putLong("ru.ok.tamtam.extra.START_POSITION", hk9.s0);
            bundle.putLong("ru.ok.tamtam.extra.END_POSITION", hk9.t0);
        }
    }

    public final String f1() {
        return "TRIM_VIDEO";
    }

    public final boolean n1() {
        r1();
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
        hk9 hk9 = this.C1;
        ((nl9) ((kk9) hk9.b)).A(hk9.u0, hk9.s0, hk9.t0, hk9.Z);
    }

    public final void r1() {
        MediaMetadataRetriever mediaMetadataRetriever = this.B1;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                hm9.p("ru.ok.messages.media.trim.FrgTrimVideo", "fail to release", th);
            }
            this.B1 = null;
        }
        hk9 hk9 = this.C1;
        if (hk9 != null) {
            ((nl9) ((kk9) hk9.b)).t0.b();
            bq7 bq7 = (bq7) hk9.Y;
            if (bq7.g == hk9) {
                bq7.u();
                bq7.e = null;
                bq7.r((Surface) null);
                bq7.g = null;
            }
            cqc.b(hk9.x0);
            hk9.x0 = null;
            cqc.b(hk9.w0);
            hk9.w0 = null;
            this.C1 = null;
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        this.D1 = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.VIDEO_URI");
        ((ActTrimVideo) b0()).g0((View.OnSystemUiVisibilityChangeListener) null);
        nl9 nl9 = new nl9(layoutInflater.getContext(), viewGroup, this, new y7g((a) this), this, ((y8a) ((ed3) this.p1.b)).c());
        nl9 nl92 = nl9;
        String str = "ru.ok.tamtam.extra.END_POSITION";
        hk9 hk9 = new hk9(nl9, this, ((y8a) ((ed3) this.p1.b)).b(), this.D1.toString(), ((xe8) b0()).b(), this.Z.getLong("ru.ok.tamtam.extra.START_POSITION", 0), this.Z.getLong("ru.ok.tamtam.extra.END_POSITION", 0), this.Z.getBoolean("ru.ok.tamtam.extra.MUTE"));
        this.C1 = hk9;
        if (bundle2 != null) {
            hk9.u0 = bundle2.getLong("ru.ok.tamtam.extra.POINTER_POSITION");
            hk9.s0 = bundle2.getLong("ru.ok.tamtam.extra.START_POSITION");
            long j = bundle2.getLong(str);
            hk9.t0 = j;
            nl92.A(hk9.u0, hk9.s0, j, hk9.Z);
            hk9.c2();
        }
        return (View) nl92.c;
    }

    public final void y0() {
        super.y0();
        r1();
    }
}
