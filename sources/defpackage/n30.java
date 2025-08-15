package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: n30  reason: default package */
public abstract class n30 {
    /* JADX WARNING: type inference failed for: r0v0, types: [ix6, pw6] */
    private static jx6 a() {
        ? pw6 = new pw6(4);
        pw6.b(8, 7);
        int i = oaf.a;
        if (i >= 31) {
            pw6.b(26, 27);
        }
        if (i >= 33) {
            pw6.a(30);
        }
        return pw6.l();
    }

    public static boolean b(AudioManager audioManager, g40 g40) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (g40 == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{g40.a};
        }
        jx6 a = a();
        for (AudioDeviceInfo type : audioDeviceInfoArr) {
            if (a.contains(Integer.valueOf(type.getType()))) {
                return true;
            }
        }
        return false;
    }
}
