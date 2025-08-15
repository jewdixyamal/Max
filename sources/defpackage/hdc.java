package defpackage;

import android.database.Observable;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: hdc  reason: default package */
public abstract class hdc {
    public final idc a = new Observable();
    public boolean b = false;
    public int c = 1;

    public void A(boolean z) {
        if (!this.a.a()) {
            this.b = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void B(jdc jdc) {
        this.a.unregisterObserver(jdc);
    }

    public final void h(dec dec, int i) {
        boolean z = dec.D0 == null;
        if (z) {
            dec.c = i;
            if (this.b) {
                dec.X = k(i);
            }
            dec.u0 = (dec.u0 & -520) | 1;
            Trace.beginSection("RV OnBindView");
        }
        dec.D0 = this;
        boolean z2 = RecyclerView.L1;
        View view = dec.a;
        if (z2) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = zmf.a;
                if (view.isAttachedToWindow() != dec.r()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + dec.r() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + dec);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = zmf.a;
                if (view.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + dec);
                }
            }
        }
        s(dec, i, dec.j());
        if (z) {
            ArrayList arrayList = dec.v0;
            if (arrayList != null) {
                arrayList.clear();
            }
            dec.u0 &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof pdc) {
                ((pdc) layoutParams).c = true;
            }
            Trace.endSection();
        }
    }

    public int i(hdc hdc, dec dec, int i) {
        if (hdc == this) {
            return i;
        }
        return -1;
    }

    public abstract int j();

    public long k(int i) {
        return -1;
    }

    public int l(int i) {
        return 0;
    }

    public final void m() {
        this.a.b();
    }

    public final void n(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void o(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public final void p(int i, int i2) {
        this.a.e(i, i2);
    }

    public void q(RecyclerView recyclerView) {
    }

    public abstract void r(dec dec, int i);

    public void s(dec dec, int i, List list) {
        r(dec, i);
    }

    public abstract dec t(ViewGroup viewGroup, int i);

    public void u(RecyclerView recyclerView) {
    }

    public boolean v(dec dec) {
        return false;
    }

    public void w(dec dec) {
    }

    public void x(dec dec) {
    }

    public void y(dec dec) {
    }

    public void z(jdc jdc) {
        this.a.registerObserver(jdc);
    }
}
