package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class g extends e {
    public final View J0;
    public final ImageView K0;
    public final ProgressBar L0;
    public final TextView M0;
    public final RelativeLayout N0;
    public final CheckBox O0;
    public final float P0;
    public final int Q0;
    public final e0d R0 = new e0d(9, this);
    public final /* synthetic */ ng8 S0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(ng8 ng8, View view) {
        super(ng8.x0, view, (ImageButton) view.findViewById(dvb.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(dvb.mr_cast_volume_slider));
        this.S0 = ng8;
        this.J0 = view;
        this.K0 = (ImageView) view.findViewById(dvb.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(dvb.mr_cast_route_progress_bar);
        this.L0 = progressBar;
        this.M0 = (TextView) view.findViewById(dvb.mr_cast_route_name);
        this.N0 = (RelativeLayout) view.findViewById(dvb.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(dvb.mr_cast_checkbox);
        this.O0 = checkBox;
        pg8 pg8 = ng8.x0;
        Context context = pg8.y0;
        Drawable n = s36.n(context, wub.mr_cast_checkbox);
        if (lh8.i(context)) {
            aq4.g(n, lt3.a(context, lh8.a));
        }
        checkBox.setButtonDrawable(n);
        lh8.j(pg8.y0, progressBar);
        this.P0 = lh8.d(pg8.y0);
        Resources resources = pg8.y0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(qtb.mr_dynamic_dialog_row_height, typedValue, true);
        this.Q0 = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean D(dh8 dh8) {
        if (dh8.g()) {
            return true;
        }
        gaa b = this.S0.x0.t0.b(dh8);
        if (b != null) {
            rg8 rg8 = (rg8) b.a;
            if ((rg8 != null ? rg8.b : 1) == 3) {
                return true;
            }
        }
        return false;
    }

    public final void E(boolean z, boolean z2) {
        CheckBox checkBox = this.O0;
        int i = 0;
        checkBox.setEnabled(false);
        this.J0.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.K0.setVisibility(4);
            this.L0.setVisibility(0);
        }
        if (z2) {
            if (z) {
                i = this.Q0;
            }
            this.S0.C(this.N0, i);
        }
    }
}
