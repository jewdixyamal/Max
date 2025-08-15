package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* renamed from: jj4  reason: default package */
public final class jj4 extends br7 {
    public final /* synthetic */ br7 t0;
    public final /* synthetic */ DialogFragment u0;

    public jj4(DialogFragment dialogFragment, v06 v06) {
        this.u0 = dialogFragment;
        this.t0 = v06;
    }

    public final View J(int i) {
        br7 br7 = this.t0;
        if (br7.K()) {
            return br7.J(i);
        }
        Dialog dialog = this.u0.w1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean K() {
        return this.t0.K() || this.u0.A1;
    }
}
