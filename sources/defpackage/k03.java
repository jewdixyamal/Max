package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: k03  reason: default package */
public final class k03 extends ote {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k03(int i, Object obj) {
        super(18);
        this.o = i;
        this.X = obj;
    }

    private final void c0(int i) {
    }

    public final void J(int i) {
        switch (this.o) {
            case 0:
                return;
            default:
                dpe dpe = (dpe) this.X;
                dpe.e = true;
                cpe cpe = (cpe) dpe.f.get();
                if (cpe != null) {
                    cpe.a();
                    return;
                }
                return;
        }
    }

    public final void K(Typeface typeface, boolean z) {
        switch (this.o) {
            case 0:
                Chip chip = (Chip) this.X;
                n03 n03 = chip.s0;
                chip.setText(n03.P1 ? n03.Q0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    dpe dpe = (dpe) this.X;
                    dpe.e = true;
                    cpe cpe = (cpe) dpe.f.get();
                    if (cpe != null) {
                        cpe.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
