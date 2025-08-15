package com.google.android.material.bottomsheet;

import android.app.Dialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import java.util.ArrayList;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public boolean B1;

    public final void e1() {
        Dialog dialog = this.w1;
        if (dialog instanceof ir0) {
            ir0 ir0 = (ir0) dialog;
            BottomSheetBehavior h = ir0.h();
            if (h.I && ir0.u0) {
                this.B1 = true;
                if (h.L == 5) {
                    l1();
                    return;
                }
                Dialog dialog2 = this.w1;
                if (dialog2 instanceof ir0) {
                    ir0 ir02 = (ir0) dialog2;
                    BottomSheetBehavior bottomSheetBehavior = ir02.Y;
                    bottomSheetBehavior.W.remove(ir02.B0);
                }
                gr0 gr0 = new gr0(1, (ScheduledSendPickerDialogFragment) this);
                ArrayList arrayList = h.W;
                if (!arrayList.contains(gr0)) {
                    arrayList.add(gr0);
                }
                h.K(5);
                return;
            }
        }
        super.e1();
    }

    public Dialog h1() {
        return new ir0(d0(), g1());
    }

    public final void l1() {
        if (this.B1) {
            super.e1();
        } else {
            f1(false, false);
        }
    }
}
