package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* renamed from: t78  reason: default package */
public abstract class t78 {
    public static void a(b70 b70, Object obj) {
        g40 g40;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        e84 e84 = (e84) b70;
        if (audioDeviceInfo == null) {
            g40 = null;
        } else {
            e84.getClass();
            g40 = new g40(audioDeviceInfo);
        }
        e84.c0 = g40;
        x30 x30 = e84.y;
        if (x30 != null) {
            x30.f(audioDeviceInfo);
        }
        AudioTrack audioTrack = e84.w;
        if (audioTrack != null) {
            o74.a(audioTrack, e84.c0);
        }
    }
}
