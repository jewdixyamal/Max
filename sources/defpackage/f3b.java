package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* renamed from: f3b  reason: default package */
public abstract class f3b {
    public static Bundle a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
