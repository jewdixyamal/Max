package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: m74  reason: default package */
public abstract class m74 {
    /* JADX WARNING: type inference failed for: r4v1, types: [x50, java.lang.Object] */
    public static y50 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int a = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (a == 0) {
            return y50.d;
        }
        ? obj = new Object();
        boolean z2 = oaf.a > 32 && a == 2;
        obj.a = true;
        obj.b = z2;
        obj.c = z;
        return obj.a();
    }
}
