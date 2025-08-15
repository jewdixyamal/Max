package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.mediarouter.app.d;

/* renamed from: yf8  reason: default package */
public final class yf8 extends MediaControllerCompat.Callback {
    public final /* synthetic */ d a;

    public yf8(d dVar) {
        this.a = dVar;
    }

    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
        d dVar = this.a;
        dVar.f1 = description;
        dVar.r();
        dVar.q(false);
    }

    public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        d dVar = this.a;
        dVar.e1 = playbackStateCompat;
        dVar.q(false);
    }

    public final void onSessionDestroyed() {
        d dVar = this.a;
        MediaControllerCompat mediaControllerCompat = dVar.c1;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(dVar.d1);
            dVar.c1 = null;
        }
    }
}
