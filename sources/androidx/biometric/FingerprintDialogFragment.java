package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.b;

public class FingerprintDialogFragment extends DialogFragment {
    public final Handler B1 = new Handler(Looper.getMainLooper());
    public final re C1 = new re(20, this);
    public BiometricViewModel D1;
    public int E1;
    public int F1;
    public ImageView G1;
    public TextView H1;

    public final void H0() {
        this.S0 = true;
        this.B1.removeCallbacksAndMessages((Object) null);
    }

    public final void K0() {
        this.S0 = true;
        BiometricViewModel biometricViewModel = this.D1;
        biometricViewModel.t = 0;
        biometricViewModel.h(1);
        this.D1.g(h0(g0c.fingerprint_dialog_touch_sensor));
    }

    public final Dialog h1() {
        int i;
        sc scVar = new sc(U0());
        ay ayVar = this.D1.c;
        CharSequence charSequence = null;
        scVar.setTitle(ayVar != null ? (CharSequence) ayVar.o : null);
        View inflate = LayoutInflater.from(scVar.getContext()).inflate(qyb.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(xvb.fingerprint_subtitle);
        if (textView != null) {
            this.D1.getClass();
            if (TextUtils.isEmpty((CharSequence) null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(xvb.fingerprint_description);
        if (textView2 != null) {
            ay ayVar2 = this.D1.c;
            if (ayVar2 != null) {
                charSequence = (CharSequence) ayVar2.X;
            }
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence);
            }
        }
        this.G1 = (ImageView) inflate.findViewById(xvb.fingerprint_icon);
        this.H1 = (TextView) inflate.findViewById(xvb.fingerprint_error);
        BiometricViewModel biometricViewModel = this.D1;
        ay ayVar3 = biometricViewModel.c;
        if (ayVar3 != null) {
            a8g a8g = biometricViewModel.d;
            i = ayVar3.c;
            if (i == 0) {
                i = a8g != null ? 15 : 255;
            }
        } else {
            i = 0;
        }
        CharSequence h0 = f8.m(i) ? h0(g0c.confirm_device_credential_password) : this.D1.e();
        gn0 gn0 = new gn0(this);
        oc ocVar = scVar.a;
        ocVar.i = h0;
        ocVar.j = gn0;
        scVar.setView(inflate);
        tc create = scVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public final int l1(int i) {
        Context d0 = d0();
        b b0 = b0();
        if (d0 == null || b0 == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        d0.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = b0.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [ci9, xm7] */
    public final void onCancel(DialogInterface dialogInterface) {
        BiometricViewModel biometricViewModel = this.D1;
        if (biometricViewModel.s == null) {
            biometricViewModel.s = new xm7();
        }
        BiometricViewModel.j(biometricViewModel.s, Boolean.TRUE);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r0v6, types: [ci9, xm7] */
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        b b0 = b0();
        if (b0 != null) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) new xje(b0).b(nec.a(BiometricViewModel.class));
            this.D1 = biometricViewModel;
            if (biometricViewModel.u == null) {
                biometricViewModel.u = new xm7();
            }
            biometricViewModel.u.e(this, new uk5(this, 0));
            BiometricViewModel biometricViewModel2 = this.D1;
            if (biometricViewModel2.v == null) {
                biometricViewModel2.v = new xm7();
            }
            biometricViewModel2.v.e(this, new uk5(this, 1));
        }
        this.E1 = l1(wk5.a());
        this.F1 = l1(16842808);
    }
}
