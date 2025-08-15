package defpackage;

import android.media.AudioTrack;

/* renamed from: o74  reason: default package */
public abstract class o74 {
    public static void a(AudioTrack audioTrack, g40 g40) {
        audioTrack.setPreferredDevice(g40 == null ? null : g40.a);
    }
}
