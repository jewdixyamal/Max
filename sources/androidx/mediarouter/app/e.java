package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;

public abstract class e extends dec {
    public dh8 F0;
    public final ImageButton G0;
    public final MediaRouteVolumeSlider H0;
    public final /* synthetic */ pg8 I0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(pg8 pg8, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int i;
        int i2;
        this.I0 = pg8;
        this.G0 = imageButton;
        this.H0 = mediaRouteVolumeSlider;
        Context context = pg8.y0;
        int i3 = wub.mr_cast_mute_button;
        int i4 = lh8.a;
        Drawable n = s36.n(context, i3);
        if (lh8.i(context)) {
            aq4.g(n, lt3.a(context, lh8.a));
        }
        imageButton.setImageDrawable(n);
        Context context2 = pg8.y0;
        if (lh8.i(context2)) {
            i = lt3.a(context2, dtb.mr_cast_progressbar_progress_and_thumb_light);
            i2 = lt3.a(context2, dtb.mr_cast_progressbar_background_light);
        } else {
            i = lt3.a(context2, dtb.mr_cast_progressbar_progress_and_thumb_dark);
            i2 = lt3.a(context2, dtb.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(i, i2);
    }

    public final void A(dh8 dh8) {
        this.F0 = dh8;
        int i = dh8.o;
        boolean z = i == 0;
        ImageButton imageButton = this.G0;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new e0d(7, this));
        dh8 dh82 = this.F0;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.H0;
        mediaRouteVolumeSlider.setTag(dh82);
        mediaRouteVolumeSlider.setMax(dh8.p);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.I0.F0);
    }

    public final void B(boolean z) {
        ImageButton imageButton = this.G0;
        if (imageButton.isActivated() != z) {
            imageButton.setActivated(z);
            pg8 pg8 = this.I0;
            if (z) {
                pg8.I0.put(this.F0.c, Integer.valueOf(this.H0.getProgress()));
            } else {
                pg8.I0.remove(this.F0.c);
            }
        }
    }
}
