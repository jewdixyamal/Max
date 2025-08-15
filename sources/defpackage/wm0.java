package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: wm0  reason: default package */
public abstract class wm0 {
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }
}
