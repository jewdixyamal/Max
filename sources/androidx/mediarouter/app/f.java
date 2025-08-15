package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public final class f extends e {
    public final TextView J0;
    public final int K0;
    public final /* synthetic */ ng8 L0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(ng8 ng8, View view) {
        super(ng8.x0, view, (ImageButton) view.findViewById(dvb.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(dvb.mr_cast_volume_slider));
        this.L0 = ng8;
        this.J0 = (TextView) view.findViewById(dvb.mr_group_volume_route_name);
        Resources resources = ng8.x0.y0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(qtb.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.K0 = (int) typedValue.getDimension(displayMetrics);
    }
}
