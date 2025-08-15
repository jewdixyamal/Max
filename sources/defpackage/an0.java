package defpackage;

import android.hardware.biometrics.BiometricManager;

/* renamed from: an0  reason: default package */
public abstract class an0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
