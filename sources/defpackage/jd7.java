package defpackage;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: jd7  reason: default package */
public abstract class jd7 {
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
