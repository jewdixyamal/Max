package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.b;
import java.util.List;
import ru.ok.messages.settings.FrgBaseSettings;

/* renamed from: eed  reason: default package */
public final class eed extends hdc {
    public final LayoutInflater X;
    public final FrgBaseSettings Y;
    public final List o;

    public eed(b bVar, List list, FrgBaseSettings frgBaseSettings) {
        this.o = list;
        this.X = LayoutInflater.from(bVar);
        this.Y = frgBaseSettings;
    }

    public final int j() {
        return this.o.size();
    }

    public final int l(int i) {
        return ((gcd) this.o.get(i)).Y;
    }

    public final void r(dec dec, int i) {
        int i2 = dec.Y;
        boolean z = false;
        List list = this.o;
        if (i2 == 4) {
            we7 we7 = (we7) dec;
            gcd gcd = (gcd) list.get(i);
            we7.L0 = gcd;
            we7.K0.setText(gcd.b);
            SwitchCompat switchCompat = we7.H0;
            switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            switchCompat.setChecked(((Integer) we7.L0.X).intValue() != 0);
            switchCompat.setOnCheckedChangeListener(new wz2(2, we7));
            we7.L0.getClass();
            switchCompat.setEnabled(true);
            int intValue = ((Integer) we7.L0.X).intValue();
            boolean z2 = intValue != 0;
            we7.J0.setVisibility(z2 ? 0 : 8);
            if (z2) {
                we7.F0.setColor(intValue);
            }
            we7.L0.getClass();
            View view = we7.a;
            view.setEnabled(true);
            we7.L0.getClass();
            view.setAlpha(1.0f);
            if (!we7.L0.Z) {
                z = true;
            }
            we7.I0.setVisibility(z ? 1 : 0);
        } else if (i2 == 9) {
            wr0 wr0 = (wr0) dec;
            gcd gcd2 = (gcd) list.get(i);
            wr0.G0 = gcd2;
            if (!wr0.H0) {
                wr0.F0.setProgress(((Integer) gcd2.X).intValue());
            }
            gcd2.getClass();
        } else {
            jcd jcd = (jcd) dec;
            gcd gcd3 = (gcd) list.get(i);
            if (i == list.size() - 1) {
                z = true;
            }
            jcd.A(gcd3, z);
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.X;
        if (i == 3) {
            return new jcd(layoutInflater.inflate(yyb.row_setting_header, viewGroup, false), (FrgBaseSettings) null);
        }
        if (i == 6) {
            return new jcd(layoutInflater.inflate(yyb.row_setting_progress, viewGroup, false), (FrgBaseSettings) null);
        }
        FrgBaseSettings frgBaseSettings = this.Y;
        if (i == 4) {
            return new we7(layoutInflater.inflate(yyb.row_setting_led, viewGroup, false), frgBaseSettings);
        }
        if (i == 7) {
            return new xz2(layoutInflater.inflate(yyb.row_setting_contact, viewGroup, false), frgBaseSettings, 1);
        }
        if (i == 9) {
            return new wr0(layoutInflater.inflate(yyb.row_setting_brightness, viewGroup, false), frgBaseSettings);
        }
        if (i == 8) {
            return new xz2(layoutInflater.inflate(yyb.row_setting_theme, viewGroup, false), frgBaseSettings, 3);
        }
        View inflate = layoutInflater.inflate(yyb.row_setting, viewGroup, false);
        return i == 2 ? new xz2((ViewGroup) inflate, layoutInflater, frgBaseSettings, 0) : i == 1 ? new ype((ViewGroup) inflate, layoutInflater, frgBaseSettings) : i == 10 ? new xz2((ViewGroup) inflate, layoutInflater, frgBaseSettings, 2) : new jcd(inflate, frgBaseSettings);
    }
}
