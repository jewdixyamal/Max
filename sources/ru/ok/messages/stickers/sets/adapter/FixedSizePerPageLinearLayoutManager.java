package ru.ok.messages.stickers.sets.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

public class FixedSizePerPageLinearLayoutManager extends LinearLayoutManager {
    public final boolean g(pdc pdc) {
        if (pdc == null) {
            return false;
        }
        return pdc.width == Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) 0));
    }

    public final pdc s() {
        pdc s = super.s();
        int round = Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) 0));
        if (this.p == 0) {
            s.width = round;
        } else {
            s.height = round;
        }
        return s;
    }

    public final pdc u(ViewGroup.LayoutParams layoutParams) {
        pdc u = super.u(layoutParams);
        int round = Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) 0));
        if (this.p == 0) {
            u.width = round;
        } else {
            u.height = round;
        }
        return u;
    }
}
