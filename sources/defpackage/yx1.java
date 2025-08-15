package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* renamed from: yx1  reason: default package */
public abstract class yx1 {
    public static final px1 a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new tf7(2));
        a = new px1(linkedHashSet);
    }

    public static void a(Context context, va8 va8, px1 px1) {
        Integer num;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT < 34 || on0.b(context) == 0) {
            if (px1 != null) {
                try {
                    num = px1.b();
                    if (num == null) {
                        return;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            } else {
                num = null;
            }
            String str = Build.DEVICE;
            PackageManager packageManager = context.getPackageManager();
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera")) {
                    if (px1 != null) {
                        if (num.intValue() == 1) {
                        }
                    }
                    px1.c.c(va8.w());
                    i = 1;
                }
            } catch (IllegalArgumentException e) {
                illegalArgumentException = e;
            }
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                    if (px1 != null) {
                        if (num.intValue() == 0) {
                        }
                    }
                    px1.b.c(va8.w());
                    i++;
                }
            } catch (IllegalArgumentException e2) {
                illegalArgumentException = e2;
            }
            try {
                a.c(va8.w());
                i++;
            } catch (IllegalArgumentException unused2) {
            }
            if (illegalArgumentException != null) {
                va8.w().toString();
                throw new CameraValidator$CameraIdListIncorrectException("Expected camera missing from device.", i, illegalArgumentException);
            }
            return;
        }
        LinkedHashSet w = va8.w();
        if (!w.isEmpty()) {
            on0.b(context);
            w.size();
            return;
        }
        throw new CameraValidator$CameraIdListIncorrectException("No cameras available", 0, (IllegalArgumentException) null);
    }
}
