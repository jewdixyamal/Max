package androidx.biometric;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.a;
import androidx.fragment.app.c;

public class BiometricFragment extends a {
    public final Handler l1 = new Handler(Looper.getMainLooper());
    public BiometricViewModel m1;

    public final void M0() {
        int i;
        this.S0 = true;
        if (Build.VERSION.SDK_INT == 29) {
            BiometricViewModel biometricViewModel = this.m1;
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
            if (f8.m(i)) {
                BiometricViewModel biometricViewModel2 = this.m1;
                biometricViewModel2.m = true;
                this.l1.postDelayed(new ym0(biometricViewModel2, 2), 250);
            }
        }
    }

    public final void N0() {
        this.S0 = true;
    }

    public final void e1(int i) {
        if (i == 3 || !this.m1.m) {
            g1();
            BiometricViewModel biometricViewModel = this.m1;
            if (biometricViewModel.f == null) {
                biometricViewModel.f = new y7g(9);
            }
            y7g y7g = biometricViewModel.f;
            CancellationSignal cancellationSignal = (CancellationSignal) y7g.c;
            if (cancellationSignal != null) {
                try {
                    zy1.a(cancellationSignal);
                } catch (NullPointerException unused) {
                }
                y7g.c = null;
            }
            y7g.getClass();
        }
    }

    public final void f1() {
        BiometricViewModel biometricViewModel = this.m1;
        biometricViewModel.i = false;
        biometricViewModel.i = false;
        if (o0()) {
            c f0 = f0();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) f0.E("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.o0()) {
                    fingerprintDialogFragment.e1();
                } else {
                    he0 he0 = new he0(f0);
                    he0.h(fingerprintDialogFragment);
                    he0.d(true);
                }
            }
        }
        if (!this.m1.k && o0()) {
            he0 he02 = new he0(f0());
            he02.h(this);
            he02.d(true);
        }
        Context d0 = d0();
        if (d0 != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29) {
                int i = ksb.delay_showing_prompt_models;
                if (str != null) {
                    for (String equals : d0.getResources().getStringArray(i)) {
                        if (str.equals(equals)) {
                            BiometricViewModel biometricViewModel2 = this.m1;
                            biometricViewModel2.l = true;
                            this.l1.postDelayed(new ym0(biometricViewModel2, 1), 600);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void g1() {
        if (b0() != null && this.m1.d != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
        }
    }

    public final void h1(int i, CharSequence charSequence) {
        BiometricViewModel biometricViewModel = this.m1;
        if (!biometricViewModel.k && biometricViewModel.j) {
            biometricViewModel.j = false;
            new Handler(Looper.getMainLooper()).post(new sm0(this, i, charSequence));
        }
        f1();
    }

    public final void i1(cn0 cn0) {
        BiometricViewModel biometricViewModel = this.m1;
        if (biometricViewModel.j) {
            biometricViewModel.j = false;
            new Handler(Looper.getMainLooper()).post(new sm0(this, cn0));
        }
        f1();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j1() {
        /*
            r9 = this;
            androidx.biometric.BiometricViewModel r0 = r9.m1
            boolean r0 = r0.i
            if (r0 != 0) goto L_0x0126
            android.content.Context r0 = r9.d0()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            androidx.biometric.BiometricViewModel r0 = r9.m1
            r1 = 1
            r0.i = r1
            r0.j = r1
            r9.g1()
            android.content.Context r0 = r9.U0()
            android.content.Context r0 = r0.getApplicationContext()
            android.hardware.biometrics.BiometricPrompt$Builder r0 = defpackage.um0.d(r0)
            androidx.biometric.BiometricViewModel r2 = r9.m1
            ay r3 = r2.c
            r4 = 0
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r3.o
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            r2.getClass()
            androidx.biometric.BiometricViewModel r2 = r9.m1
            ay r2 = r2.c
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = r2.X
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L_0x003e:
            if (r3 == 0) goto L_0x0043
            defpackage.um0.g(r0, r3)
        L_0x0043:
            if (r4 == 0) goto L_0x0048
            defpackage.um0.e(r0, r4)
        L_0x0048:
            androidx.biometric.BiometricViewModel r2 = r9.m1
            java.lang.CharSequence r2 = r2.e()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0071
            androidx.biometric.BiometricViewModel r3 = r9.m1
            r3.getClass()
            q67 r3 = new q67
            r4 = 1
            r3.<init>((int) r4)
            androidx.biometric.BiometricViewModel r4 = r9.m1
            gn0 r5 = r4.g
            if (r5 != 0) goto L_0x006c
            gn0 r5 = new gn0
            r5.<init>((androidx.biometric.BiometricViewModel) r4)
            r4.g = r5
        L_0x006c:
            gn0 r4 = r4.g
            defpackage.um0.f(r0, r2, r3, r4)
        L_0x0071:
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.biometric.BiometricViewModel r3 = r9.m1
            ay r3 = r3.c
            r4 = 0
            if (r3 == 0) goto L_0x0081
            boolean r3 = r3.b
            if (r3 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r3 = r4
            goto L_0x0082
        L_0x0081:
            r3 = r1
        L_0x0082:
            defpackage.vm0.a(r0, r3)
            androidx.biometric.BiometricViewModel r3 = r9.m1
            ay r5 = r3.c
            if (r5 == 0) goto L_0x009a
            a8g r3 = r3.d
            int r4 = r5.c
            if (r4 == 0) goto L_0x0092
            goto L_0x009a
        L_0x0092:
            if (r3 == 0) goto L_0x0097
            r3 = 15
            goto L_0x0099
        L_0x0097:
            r3 = 255(0xff, float:3.57E-43)
        L_0x0099:
            r4 = r3
        L_0x009a:
            r3 = 30
            if (r2 < r3) goto L_0x00a2
            defpackage.wm0.a(r0, r4)
            goto L_0x00a9
        L_0x00a2:
            boolean r2 = defpackage.f8.m(r4)
            defpackage.vm0.b(r0, r2)
        L_0x00a9:
            android.hardware.biometrics.BiometricPrompt r0 = defpackage.um0.c(r0)
            android.content.Context r2 = r9.d0()
            androidx.biometric.BiometricViewModel r3 = r9.m1
            a8g r3 = r3.d
            android.hardware.biometrics.BiometricPrompt$CryptoObject r3 = defpackage.oag.H(r3)
            androidx.biometric.BiometricViewModel r4 = r9.m1
            y7g r5 = r4.f
            if (r5 != 0) goto L_0x00c8
            y7g r5 = new y7g
            r6 = 9
            r5.<init>((int) r6)
            r4.f = r5
        L_0x00c8:
            y7g r4 = r4.f
            java.lang.Object r5 = r4.c
            android.os.CancellationSignal r5 = (android.os.CancellationSignal) r5
            if (r5 != 0) goto L_0x00dd
            java.lang.Object r5 = r4.b
            vu4 r5 = (defpackage.vu4) r5
            r5.getClass()
            android.os.CancellationSignal r5 = defpackage.zy1.b()
            r4.c = r5
        L_0x00dd:
            java.lang.Object r4 = r4.c
            android.os.CancellationSignal r4 = (android.os.CancellationSignal) r4
            xm0 r5 = new xm0
            r5.<init>()
            androidx.biometric.BiometricViewModel r6 = r9.m1
            imc r7 = r6.e
            if (r7 != 0) goto L_0x00f8
            imc r7 = new imc
            fn0 r8 = new fn0
            r8.<init>(r6)
            r7.<init>((defpackage.fn0) r8)
            r6.e = r7
        L_0x00f8:
            imc r6 = r6.e
            java.lang.Object r7 = r6.b
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r7 = (android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) r7
            if (r7 != 0) goto L_0x010a
            java.lang.Object r7 = r6.c
            n80 r7 = (defpackage.n80) r7
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r7 = defpackage.l80.a(r7)
            r6.b = r7
        L_0x010a:
            java.lang.Object r6 = r6.b
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r6 = (android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) r6
            if (r3 != 0) goto L_0x0114
            defpackage.um0.b(r0, r4, r5, r6)     // Catch:{ NullPointerException -> 0x0118 }
            goto L_0x0126
        L_0x0114:
            defpackage.um0.a(r0, r3, r4, r5, r6)     // Catch:{ NullPointerException -> 0x0118 }
            goto L_0x0126
        L_0x0118:
            if (r2 == 0) goto L_0x0121
            int r0 = defpackage.g0c.default_error_msg
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0123
        L_0x0121:
            java.lang.String r0 = ""
        L_0x0123:
            r9.h1(r1, r0)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.j1():void");
    }

    public final void s0(int i, int i2, Intent intent) {
        super.s0(i, i2, intent);
        if (i == 1) {
            this.m1.k = false;
            if (i2 == -1) {
                i1(new cn0((a8g) null, 1));
            } else {
                h1(10, h0(g0c.generic_error_user_canceled));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r0v16, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r0v17, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r0v18, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r0v19, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r0v20, types: [ci9, xm7] */
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        if (b0() != null) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) new xje(b0()).b(nec.a(BiometricViewModel.class));
            this.m1 = biometricViewModel;
            if (biometricViewModel.n == null) {
                biometricViewModel.n = new xm7();
            }
            biometricViewModel.n.e(this, new tm0(this, 0));
            BiometricViewModel biometricViewModel2 = this.m1;
            if (biometricViewModel2.o == null) {
                biometricViewModel2.o = new xm7();
            }
            biometricViewModel2.o.e(this, new tm0(this, 1));
            BiometricViewModel biometricViewModel3 = this.m1;
            if (biometricViewModel3.p == null) {
                biometricViewModel3.p = new xm7();
            }
            biometricViewModel3.p.e(this, new tm0(this, 2));
            BiometricViewModel biometricViewModel4 = this.m1;
            if (biometricViewModel4.q == null) {
                biometricViewModel4.q = new xm7();
            }
            biometricViewModel4.q.e(this, new tm0(this, 3));
            BiometricViewModel biometricViewModel5 = this.m1;
            if (biometricViewModel5.r == null) {
                biometricViewModel5.r = new xm7();
            }
            biometricViewModel5.r.e(this, new tm0(this, 4));
            BiometricViewModel biometricViewModel6 = this.m1;
            if (biometricViewModel6.s == null) {
                biometricViewModel6.s = new xm7();
            }
            biometricViewModel6.s.e(this, new tm0(this, 5));
        }
    }
}
