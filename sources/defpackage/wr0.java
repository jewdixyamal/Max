package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.settings.view.BrightnessSeekBar;

/* renamed from: wr0  reason: default package */
public final class wr0 extends dec {
    public final BrightnessSeekBar F0;
    public gcd G0;
    public boolean H0;

    public wr0(View view, FrgBaseSettings frgBaseSettings) {
        super(view);
        BrightnessSeekBar brightnessSeekBar = (BrightnessSeekBar) view.findViewById(xxb.row_setting_brightness__seek_bar);
        this.F0 = brightnessSeekBar;
        brightnessSeekBar.setMax(100);
        brightnessSeekBar.setOnSeekBarChangeListener(new vr0(this, frgBaseSettings));
        Context context = view.getContext();
        khe khe = sme.a0;
        sme R = fm9.R(context);
        ngg.G(brightnessSeekBar.getProgressDrawable(), R.k);
        ngg.G(brightnessSeekBar.getThumb(), R.k);
        view.findViewById(xxb.row_setting__separator).setBackgroundColor(R.H);
        int i = R.F;
        ((ImageView) view.findViewById(xxb.row_setting_brightness__iv_brigthness_low)).setColorFilter(i);
        ((ImageView) view.findViewById(xxb.row_setting_brightness__iv_brigthness_high)).setColorFilter(i);
    }
}
