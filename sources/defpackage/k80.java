package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: k80  reason: default package */
public final class k80 extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ n80 a;

    public k80(n80 n80) {
        this.a = n80;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [ci9, xm7] */
    public void onAuthenticationFailed() {
        WeakReference weakReference = ((fn0) this.a).a;
        if (weakReference.get() != null && ((BiometricViewModel) weakReference.get()).j) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
            if (biometricViewModel.q == null) {
                biometricViewModel.q = new xm7();
            }
            BiometricViewModel.j(biometricViewModel.q, Boolean.TRUE);
        }
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [a8g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [a8g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [a8g, java.lang.Object] */
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b;
        a8g a8g = null;
        if (!(authenticationResult == null || (cryptoObject = authenticationResult.getCryptoObject()) == null)) {
            Cipher d = tz3.d(cryptoObject);
            if (d != null) {
                a8g = new a8g(d);
            } else {
                Signature f = tz3.f(cryptoObject);
                if (f != null) {
                    ? obj = new Object();
                    obj.a = f;
                    obj.b = null;
                    obj.c = null;
                    obj.o = null;
                    a8g = obj;
                } else {
                    Mac e = tz3.e(cryptoObject);
                    if (e != null) {
                        ? obj2 = new Object();
                        obj2.a = null;
                        obj2.b = null;
                        obj2.c = e;
                        obj2.o = null;
                        a8g = obj2;
                    } else if (Build.VERSION.SDK_INT >= 30 && (b = uz3.b(cryptoObject)) != null) {
                        ? obj3 = new Object();
                        obj3.a = null;
                        obj3.b = null;
                        obj3.c = null;
                        obj3.o = b;
                        a8g = obj3;
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = m80.a(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.a.b(new cn0(a8g, i2));
    }
}
