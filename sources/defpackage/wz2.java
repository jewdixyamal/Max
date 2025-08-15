package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: wz2  reason: default package */
public final /* synthetic */ class wz2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.a) {
            case 0:
                xz2 xz2 = (xz2) this.b;
                FrgBaseSettings frgBaseSettings = xz2.N0;
                if (frgBaseSettings != null) {
                    frgBaseSettings.u1(xz2.M0.a, Boolean.valueOf(z));
                    return;
                }
                return;
            case 1:
                Chip chip = (Chip) this.b;
                m18 m18 = chip.x0;
                if (m18 != null) {
                    ana ana = (ana) ((o9g) m18).b;
                    if (!z ? ana.n(chip, ana.b) : ana.f(chip)) {
                        ana.m();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.w0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            case 2:
                we7 we7 = (we7) this.b;
                FrgBaseSettings frgBaseSettings2 = we7.G0;
                if (frgBaseSettings2 != null) {
                    frgBaseSettings2.u1(we7.L0.a, Integer.valueOf(z ? ((y8a) vl.b()).n().c.v() : 0));
                    return;
                }
                return;
            case 3:
                ScheduledSendPickerViewModel n1 = ((ScheduledSendPickerDialogFragment) this.b).n1();
                n1.o.o1(n1, ScheduledSendPickerViewModel.p[0], Boolean.valueOf(z));
                return;
            default:
                if (z) {
                    ((ufd) this.b).callOnClick();
                    return;
                }
                return;
        }
    }
}
