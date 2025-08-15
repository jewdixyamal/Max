package androidx.appcompat.app;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    public Dialog h1() {
        return new fn(d0(), g1());
    }

    public final void j1(Dialog dialog, int i) {
        if (dialog instanceof fn) {
            fn fnVar = (fn) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            fnVar.d().f(1);
            return;
        }
        super.j1(dialog, i);
    }
}
