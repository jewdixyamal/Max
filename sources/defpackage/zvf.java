package defpackage;

import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.b;

/* renamed from: zvf  reason: default package */
public final /* synthetic */ class zvf implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bwf b;

    public /* synthetic */ zvf(bwf bwf, int i) {
        this.a = i;
        this.b = bwf;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [dn0, java.lang.Object] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new awf(this.b);
            default:
                bwf bwf = this.b;
                awf awf = (awf) ((je7) bwf.e).getValue();
                ? obj = new Object();
                b bVar = (b) bwf.a;
                if (bVar == null) {
                    throw new IllegalArgumentException("FragmentActivity must not be null.");
                } else if (awf != null) {
                    n16 S = bVar.S();
                    BiometricViewModel biometricViewModel = (BiometricViewModel) new xje(bVar).b(nec.a(BiometricViewModel.class));
                    obj.a = S;
                    if (biometricViewModel != null) {
                        biometricViewModel.b = awf;
                    }
                    return obj;
                } else {
                    throw new IllegalArgumentException("AuthenticationCallback must not be null.");
                }
        }
    }
}
