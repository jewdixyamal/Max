package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: b98  reason: default package */
public final class b98 extends MediaController.Callback {
    public final WeakReference a;

    public b98(ba8 ba8) {
        this.a = new WeakReference(ba8);
    }

    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        ba8 ba8 = (ba8) this.a.get();
        if (ba8 != null && playbackInfo != null) {
            ba8.a(new f98(playbackInfo.getPlaybackType(), new j30(new i30(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
        }
    }

    public final void onExtrasChanged(Bundle bundle) {
        bi8.a(bundle);
        ba8 ba8 = (ba8) this.a.get();
        if (ba8 != null) {
            ba8.c(bundle);
        }
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        hd8 hd8;
        ba8 ba8 = (ba8) this.a.get();
        if (ba8 != null) {
            us usVar = hd8.c;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                hd8 = hd8.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                hd8.b = mediaMetadata;
            } else {
                hd8 = null;
            }
            ba8.d(hd8);
        }
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ba8 ba8 = (ba8) this.a.get();
        if (ba8 != null && ba8.c == null) {
            ba8.e(i3b.a(playbackState));
        }
    }

    public final void onQueueChanged(List list) {
        ba8 ba8 = (ba8) this.a.get();
        if (ba8 != null) {
            ba8.f(yh8.a(list));
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        ba8 ba8 = (ba8) this.a.get();
        if (ba8 != null) {
            ba8.g(charSequence);
        }
    }

    public final void onSessionDestroyed() {
        ba8 ba8 = (ba8) this.a.get();
        if (ba8 != null) {
            ba8.e.b.release();
        }
    }

    public final void onSessionEvent(String str, Bundle bundle) {
        bi8.a(bundle);
        ba8 ba8 = (ba8) this.a.get();
        if (ba8 != null) {
            ba8.h(str, bundle);
        }
    }
}
