package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: l74  reason: default package */
public abstract class l74 {
    /* JADX WARNING: type inference failed for: r0v2, types: [x50, java.lang.Object] */
    public static y50 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return y50.d;
        }
        ? obj = new Object();
        obj.a = true;
        obj.c = z;
        return obj.a();
    }
}
