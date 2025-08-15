package androidx.camera.video.internal.compat.quirk;

import android.os.Build;

public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    public final boolean a(yw1 yw1, mb0 mb0) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && yw1.g() == 0 && mb0 == mb0.d;
    }
}
