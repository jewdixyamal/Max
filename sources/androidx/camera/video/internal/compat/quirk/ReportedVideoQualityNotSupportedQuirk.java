package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;

public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    public static boolean e() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList(new String[]{"JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1"}).contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean h() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    public final boolean a(yw1 yw1, mb0 mb0) {
        if (e() || f()) {
            return mb0 == mb0.g;
        }
        if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            return mb0 == mb0.e || mb0 == mb0.f;
        }
        if (g()) {
            return yw1.g() == 0 && (mb0 == mb0.f || mb0 == mb0.e);
        }
        if (h()) {
            return yw1.g() == 1 && mb0 == mb0.g;
        }
        return false;
    }

    public final boolean b() {
        return e() || f() || g() || h();
    }
}
