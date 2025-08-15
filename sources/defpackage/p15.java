package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p15  reason: default package */
public final class p15 extends hdc {
    public final /* synthetic */ z15 X;
    public final hdc o;

    public p15(z15 z15, hdc hdc) {
        this.X = z15;
        this.o = hdc;
        A(hdc.b);
    }

    public final void B(jdc jdc) {
        super.B(jdc);
        this.o.B(jdc);
    }

    public final int j() {
        z15 z15 = this.X;
        int i = 0;
        int i2 = (!z15.d2 || z15.g2 == null) ? 0 : 1;
        if (z15.e2 && z15.g2 != null) {
            i = 1;
        }
        return this.o.j() + i + i2;
    }

    public final long k(int i) {
        z15 z15 = this.X;
        if (z15.e2 && i == 0) {
            return -100;
        }
        if (z15.d2 && i == j() - 1) {
            return -200;
        }
        hdc hdc = this.o;
        if (hdc.j() > 0) {
            return hdc.k(i - (z15.e2 ? 1 : 0));
        }
        return -1;
    }

    public final int l(int i) {
        z15 z15 = this.X;
        if ((z15.e2 && i == 0) || (z15.d2 && i == j() - 1)) {
            return -1;
        }
        hdc hdc = this.o;
        if (hdc.j() > 0) {
            return hdc.l(i - (z15.e2 ? 1 : 0));
        }
        return -1;
    }

    public final void q(RecyclerView recyclerView) {
        this.o.q(recyclerView);
    }

    public final void r(dec dec, int i) {
        s(dec, i, new ArrayList());
    }

    public final void s(dec dec, int i, List list) {
        if (!(dec instanceof o15)) {
            hdc hdc = this.o;
            if (hdc.j() > 0) {
                hdc.s(dec, i - (this.X.e2 ? 1 : 0), list);
            }
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i != -1) {
            return this.o.t(viewGroup, i);
        }
        z15 z15 = this.X;
        LayoutInflater from = LayoutInflater.from(z15.getContext());
        Integer num = z15.g2;
        if (num != null) {
            View inflate = from.inflate(num.intValue(), viewGroup, false);
            try {
                tj3 tj3 = z15.h2;
                if (tj3 != null) {
                    tj3.accept(inflate);
                }
            } catch (Exception unused) {
            }
            return new dec(inflate);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void u(RecyclerView recyclerView) {
        this.o.u(recyclerView);
    }

    public final boolean v(dec dec) {
        return (dec instanceof o15) || this.o.v(dec);
    }

    public final void w(dec dec) {
        if (!(dec instanceof o15)) {
            this.o.w(dec);
        }
    }

    public final void x(dec dec) {
        if (!(dec instanceof o15)) {
            this.o.x(dec);
        }
    }

    public final void y(dec dec) {
        if (!(dec instanceof o15)) {
            this.o.y(dec);
        }
    }

    public final void z(jdc jdc) {
        super.z(jdc);
        this.o.z(jdc);
    }
}
