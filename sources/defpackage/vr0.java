package defpackage;

import android.widget.SeekBar;
import androidx.mediarouter.app.d;
import ru.ok.messages.settings.FrgBaseSettings;

/* renamed from: vr0  reason: default package */
public final class vr0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public vr0(wr0 wr0, FrgBaseSettings frgBaseSettings) {
        this.c = wr0;
        this.b = frgBaseSettings;
    }

    private final void a(SeekBar seekBar, int i, boolean z) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (z) {
                    int i2 = d.z1;
                    ((dh8) seekBar.getTag()).j(i);
                    return;
                }
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((wr0) this.c).H0 = true;
                return;
            default:
                d dVar = (d) this.c;
                if (dVar.W0 != null) {
                    dVar.U0.removeCallbacks((q57) this.b);
                }
                dVar.W0 = (dh8) seekBar.getTag();
                return;
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                wr0 wr0 = (wr0) this.c;
                gcd gcd = wr0.G0;
                if (gcd != null) {
                    ((FrgBaseSettings) this.b).u1(gcd.a, Integer.valueOf(seekBar.getProgress()));
                }
                wr0.H0 = false;
                return;
            default:
                ((d) this.c).U0.postDelayed((q57) this.b, 500);
                return;
        }
    }

    public vr0(d dVar) {
        this.c = dVar;
        this.b = new q57(10, this);
    }
}
