package defpackage;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: q30  reason: default package */
public abstract class q30 {
    public static t30 a(AudioManager audioManager, h30 h30) {
        List x = audioManager.getDirectProfilesForAttributes((AudioAttributes) h30.b().a);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(s5c.i(12)));
        for (int i = 0; i < x.size(); i++) {
            AudioProfile i2 = m30.i(x.get(i));
            if (i2.getEncapsulationType() != 1) {
                int y = i2.getFormat();
                if (!oaf.L(y)) {
                    if (!t30.e.containsKey(Integer.valueOf(y))) {
                    }
                }
                if (hashMap.containsKey(Integer.valueOf(y))) {
                    Set set = (Set) hashMap.get(Integer.valueOf(y));
                    set.getClass();
                    set.addAll(s5c.i(i2.getChannelMasks()));
                } else {
                    hashMap.put(Integer.valueOf(y), new HashSet(s5c.i(i2.getChannelMasks())));
                }
            }
        }
        ww6 i3 = zw6.i();
        for (Map.Entry entry : hashMap.entrySet()) {
            i3.a(new r30(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new t30(i3.j());
    }

    public static g40 b(AudioManager audioManager, h30 h30) {
        try {
            audioManager.getClass();
            List p = audioManager.getAudioDevicesForAttributes((AudioAttributes) h30.b().a);
            if (p.isEmpty()) {
                return null;
            }
            return new g40((AudioDeviceInfo) p.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
