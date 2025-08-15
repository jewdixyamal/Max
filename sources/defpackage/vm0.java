package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: vm0  reason: default package */
public abstract class vm0 {
    public static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
