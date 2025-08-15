package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: m80  reason: default package */
public abstract class m80 {
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
