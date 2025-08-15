package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;

/* renamed from: jg8  reason: default package */
public final class jg8 extends MediaControllerCompat.Callback {
    public final /* synthetic */ pg8 a;

    public jg8(pg8 pg8) {
        this.a = pg8;
    }

    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
        pg8 pg8 = this.a;
        pg8.W0 = description;
        pg8.h();
        pg8.l();
    }

    public final void onSessionDestroyed() {
        pg8 pg8 = this.a;
        MediaControllerCompat mediaControllerCompat = pg8.U0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(pg8.V0);
            pg8.U0 = null;
        }
    }
}
