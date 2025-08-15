package defpackage;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: dp  reason: default package */
public final /* synthetic */ class dp implements lde, wde {
    public final /* synthetic */ Context a;

    public /* synthetic */ dp(Context context) {
        this.a = context;
    }

    public xde a(ana ana) {
        l0f l0f = (l0f) ana.X;
        if (l0f != null) {
            String str = (String) ana.o;
            if (str != null && str.length() != 0) {
                return new o36(this.a, str, l0f, true, true);
            }
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
    }

    public Object get() {
        return (AudioManager) this.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }
}
