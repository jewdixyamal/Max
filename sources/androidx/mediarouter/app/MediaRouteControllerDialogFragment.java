package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import androidx.fragment.app.DialogFragment;

public class MediaRouteControllerDialogFragment extends DialogFragment {
    public final boolean B1 = false;
    public fn C1;
    public wg8 D1;

    public MediaRouteControllerDialogFragment() {
        this.r1 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public final void N0() {
        super.N0();
        fn fnVar = this.C1;
        if (fnVar != null && !this.B1) {
            ((d) fnVar).j(false);
        }
    }

    public final Dialog h1() {
        if (this.B1) {
            pg8 pg8 = new pg8(d0());
            this.C1 = pg8;
            pg8.j(this.D1);
        } else {
            this.C1 = new d(d0());
        }
        return this.C1;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
        fn fnVar = this.C1;
        if (fnVar == null) {
            return;
        }
        if (this.B1) {
            ((pg8) fnVar).k();
        } else {
            ((d) fnVar).s();
        }
    }
}
