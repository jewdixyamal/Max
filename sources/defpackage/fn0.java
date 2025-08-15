package defpackage;

import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* renamed from: fn0  reason: default package */
public final class fn0 extends n80 {
    public final WeakReference a;

    public fn0(BiometricViewModel biometricViewModel) {
        this.a = new WeakReference(biometricViewModel);
    }

    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && !((BiometricViewModel) weakReference.get()).k && ((BiometricViewModel) weakReference.get()).j) {
            ((BiometricViewModel) weakReference.get()).f(new rm0(i, charSequence));
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [ci9, xm7] */
    public final void b(cn0 cn0) {
        int i;
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && ((BiometricViewModel) weakReference.get()).j) {
            int i2 = -1;
            if (cn0.b == -1) {
                BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
                ay ayVar = biometricViewModel.c;
                if (ayVar != null) {
                    a8g a8g = biometricViewModel.d;
                    i = ayVar.c;
                    if (i == 0) {
                        i = a8g != null ? 15 : 255;
                    }
                } else {
                    i = 0;
                }
                if ((i & 32767) != 0 && !f8.m(i)) {
                    i2 = 2;
                }
                cn0 = new cn0(cn0.a, i2);
            }
            BiometricViewModel biometricViewModel2 = (BiometricViewModel) weakReference.get();
            if (biometricViewModel2.n == null) {
                biometricViewModel2.n = new xm7();
            }
            BiometricViewModel.j(biometricViewModel2.n, cn0);
        }
    }
}
