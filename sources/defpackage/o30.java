package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: o30  reason: default package */
public abstract class o30 {
    public static int[] a() {
        ww6 i = zw6.i();
        for (int i2 : s30.e) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                i.a(Integer.valueOf(i2));
            }
        }
        i.a(2);
        return s5c.c0(i.j());
    }
}
