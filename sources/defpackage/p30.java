package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: p30  reason: default package */
public abstract class p30 {
    public static zw6 a(h30 h30) {
        ww6 i = zw6.i();
        m5f g = t30.e.keySet().iterator();
        while (g.hasNext()) {
            Integer num = (Integer) g.next();
            int intValue = num.intValue();
            if (oaf.a >= oaf.r(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) h30.b().a)) {
                i.a(num);
            }
        }
        i.a(2);
        return i.j();
    }

    public static int b(int i, int i2, h30 h30) {
        for (int i3 = 10; i3 > 0; i3--) {
            int t = oaf.t(i3);
            if (t != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(t).build(), (AudioAttributes) h30.b().a)) {
                return i3;
            }
        }
        return 0;
    }
}
