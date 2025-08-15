package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog B1;
    public DialogInterface.OnCancelListener C1;
    public AlertDialog D1;

    public final Dialog h1() {
        Dialog dialog = this.B1;
        if (dialog != null) {
            return dialog;
        }
        this.s1 = false;
        if (this.D1 == null) {
            Context d0 = d0();
            fp3.n(d0);
            this.D1 = new AlertDialog.Builder(d0).create();
        }
        return this.D1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
