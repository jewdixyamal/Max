package ru.ok.messages.views.dialogs;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class FrgDlgBase extends DialogFragment {
    public boolean B1 = true;
    public gua C1;
    public boolean D1;
    public y7g E1;

    public final void H0() {
        this.S0 = true;
        this.D1 = false;
    }

    public final void J0(int i, String[] strArr, int[] iArr) {
        wmd.z(d0(), strArr, iArr);
        if (this.D1) {
            m1(i, strArr, iArr);
        } else {
            this.C1 = new gua(i, strArr, iArr);
        }
    }

    public final void K0() {
        this.S0 = true;
        this.D1 = true;
        gua gua = this.C1;
        if (gua != null) {
            m1(gua.a, gua.b, gua.c);
            this.C1 = null;
        }
    }

    public void l1(q5 q5Var) {
        this.B1 = false;
    }

    public void m1(int i, String[] strArr, int[] iArr) {
    }

    public final void t0(Activity activity) {
        this.S0 = true;
        hm9.m("ru.ok.messages.views.dialogs.FrgDlgBase", "onAttach: ".concat(getClass().getName()), new Object[0]);
        if (activity instanceof q5) {
            this.B1 = true;
            l1((q5) activity);
            return;
        }
        throw new IllegalStateException("Use FrgDlgBase only in ActBase subclasses.");
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        q5 q5Var = (b0() == null || b0().isFinishing()) ? null : (q5) b0();
        if (q5Var == null) {
            f1(false, false);
            return;
        }
        this.E1 = q5Var.K0;
        if (this.B1) {
            throw new IllegalStateException("super.onAttachBase() not called");
        }
    }
}
