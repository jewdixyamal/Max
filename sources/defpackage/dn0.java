package defpackage;

import android.os.Build;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.c;

/* renamed from: dn0  reason: default package */
public final class dn0 {
    public c a;

    public final void a(ay ayVar, a8g a8g) {
        c cVar = this.a;
        if (cVar != null && !cVar.Q()) {
            c cVar2 = this.a;
            BiometricFragment biometricFragment = (BiometricFragment) cVar2.E("androidx.biometric.BiometricFragment");
            if (biometricFragment == null) {
                biometricFragment = new BiometricFragment();
                he0 he0 = new he0(cVar2);
                he0.f(0, biometricFragment, "androidx.biometric.BiometricFragment", 1);
                he0.d(true);
                cVar2.A(true);
                cVar2.F();
            }
            if (biometricFragment.b0() != null) {
                BiometricViewModel biometricViewModel = biometricFragment.m1;
                biometricViewModel.c = ayVar;
                int i = ayVar.c;
                if (i == 0) {
                    i = a8g != null ? 15 : 255;
                }
                if (Build.VERSION.SDK_INT < 30 && i == 15 && a8g == null) {
                    biometricViewModel.d = oag.k();
                } else {
                    biometricViewModel.d = a8g;
                }
                BiometricViewModel biometricViewModel2 = biometricFragment.m1;
                biometricViewModel2.h = null;
                if (biometricViewModel2.l) {
                    biometricFragment.l1.postDelayed(new ym0(biometricFragment), 600);
                } else {
                    biometricFragment.j1();
                }
            }
        }
    }
}
