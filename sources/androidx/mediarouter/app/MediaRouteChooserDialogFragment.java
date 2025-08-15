package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import java.util.List;

public class MediaRouteChooserDialogFragment extends DialogFragment {
    public final boolean B1 = false;
    public fn C1;
    public wg8 D1;

    public MediaRouteChooserDialogFragment() {
        this.r1 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public final Dialog h1() {
        if (this.B1) {
            gg8 gg8 = new gg8(d0());
            this.C1 = gg8;
            l1();
            gg8.h(this.D1);
        } else {
            qf8 qf8 = new qf8(d0());
            this.C1 = qf8;
            l1();
            qf8.h(this.D1);
        }
        return this.C1;
    }

    public final void l1() {
        if (this.D1 == null) {
            Bundle bundle = this.Z;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("selector");
                wg8 wg8 = null;
                if (bundle2 != null) {
                    wg8 = new wg8((List) null, bundle2);
                } else {
                    wg8 wg82 = wg8.c;
                }
                this.D1 = wg8;
            }
            if (this.D1 == null) {
                this.D1 = wg8.c;
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
        fn fnVar = this.C1;
        if (fnVar != null) {
            int i = -2;
            if (this.B1) {
                gg8 gg8 = (gg8) fnVar;
                Context context = gg8.s0;
                int v = !context.getResources().getBoolean(wsb.is_tablet) ? -1 : dy7.v(context);
                if (!context.getResources().getBoolean(wsb.is_tablet)) {
                    i = -1;
                }
                gg8.getWindow().setLayout(v, i);
                return;
            }
            qf8 qf8 = (qf8) fnVar;
            qf8.getWindow().setLayout(dy7.v(qf8.getContext()), -2);
        }
    }
}
