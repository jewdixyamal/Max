package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: tm0  reason: default package */
public final class tm0 implements g2a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricFragment b;

    public /* synthetic */ tm0(BiometricFragment biometricFragment, int i) {
        this.a = i;
        this.b = biometricFragment;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r3v19, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r3v35, types: [ci9, xm7] */
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                cn0 cn0 = (cn0) obj;
                if (cn0 != null) {
                    BiometricFragment biometricFragment = this.b;
                    biometricFragment.i1(cn0);
                    BiometricViewModel biometricViewModel = biometricFragment.m1;
                    if (biometricViewModel.n == null) {
                        biometricViewModel.n = new xm7();
                    }
                    BiometricViewModel.j(biometricViewModel.n, (Object) null);
                    return;
                }
                return;
            case 1:
                rm0 rm0 = (rm0) obj;
                if (rm0 != null) {
                    BiometricFragment biometricFragment2 = this.b;
                    biometricFragment2.getClass();
                    int i = rm0.a;
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case Protos.Attaches.Attach.PRESENT /*12*/:
                        case 13:
                        case Protos.Attaches.Attach.LOCATION /*14*/:
                        case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                            break;
                        default:
                            i = 8;
                            break;
                    }
                    biometricFragment2.d0();
                    biometricFragment2.g1();
                    CharSequence charSequence = rm0.b;
                    if (charSequence == null) {
                        charSequence = biometricFragment2.h0(g0c.default_error_msg) + " " + i;
                    }
                    biometricFragment2.h1(i, charSequence);
                    biometricFragment2.m1.f((rm0) null);
                    return;
                }
                return;
            case 2:
                if (((CharSequence) obj) != null) {
                    BiometricFragment biometricFragment3 = this.b;
                    biometricFragment3.g1();
                    biometricFragment3.m1.f((rm0) null);
                    return;
                }
                return;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    BiometricFragment biometricFragment4 = this.b;
                    biometricFragment4.g1();
                    if (biometricFragment4.m1.j) {
                        new Handler(Looper.getMainLooper()).post(new sm0(biometricFragment4));
                    }
                    BiometricViewModel biometricViewModel2 = biometricFragment4.m1;
                    if (biometricViewModel2.q == null) {
                        biometricViewModel2.q = new xm7();
                    }
                    BiometricViewModel.j(biometricViewModel2.q, Boolean.FALSE);
                    return;
                }
                return;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    BiometricFragment biometricFragment5 = this.b;
                    biometricFragment5.getClass();
                    CharSequence e = biometricFragment5.m1.e();
                    if (e == null) {
                        e = biometricFragment5.h0(g0c.default_error_msg);
                    }
                    biometricFragment5.h1(13, e);
                    biometricFragment5.e1(2);
                    biometricFragment5.m1.i(false);
                    return;
                }
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    BiometricFragment biometricFragment6 = this.b;
                    biometricFragment6.e1(1);
                    biometricFragment6.f1();
                    BiometricViewModel biometricViewModel3 = biometricFragment6.m1;
                    if (biometricViewModel3.s == null) {
                        biometricViewModel3.s = new xm7();
                    }
                    BiometricViewModel.j(biometricViewModel3.s, Boolean.FALSE);
                    return;
                }
                return;
        }
    }
}
