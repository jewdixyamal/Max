package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: hj4  reason: default package */
public final class hj4 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment a;

    public hj4(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.w1;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
