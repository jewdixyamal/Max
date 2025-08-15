package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.settings.view.LedSeekBar;

/* renamed from: we7  reason: default package */
public final class we7 extends dec {
    public final LedSeekBar F0;
    public final FrgBaseSettings G0;
    public final SwitchCompat H0;
    public final View I0;
    public final View J0;
    public final TextView K0;
    public gcd L0;

    public we7(View view, FrgBaseSettings frgBaseSettings) {
        super(view);
        Context context = view.getContext();
        khe khe = sme.a0;
        sme R = fm9.R(context);
        this.G0 = frgBaseSettings;
        LedSeekBar ledSeekBar = (LedSeekBar) view.findViewById(xxb.row_setting_led__ls_seekbar);
        this.F0 = ledSeekBar;
        TextView textView = (TextView) view.findViewById(xxb.row_setting_led__title);
        this.K0 = textView;
        textView.setTextColor(R.F);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(xxb.row_setting_led__cb_check);
        this.H0 = switchCompat;
        ngg.h(R, switchCompat);
        View findViewById = view.findViewById(xxb.row_setting__separator);
        this.I0 = findViewById;
        findViewById.setBackgroundColor(R.H);
        view.findViewById(xxb.row_setting_led__separator_small).setBackgroundColor(R.K);
        this.J0 = view.findViewById(xxb.row_setting_led__ll_led_container);
        ledSeekBar.setListener(new d74(this, 19, frgBaseSettings));
        view.findViewById(xxb.row_setting_led__ll_root).setOnClickListener(new xx5(9, this));
    }
}
