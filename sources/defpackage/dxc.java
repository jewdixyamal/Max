package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: dxc  reason: default package */
public final class dxc extends dle {
    public final int X = 1;
    public final String Y = dxc.class.getName();
    public final m56 o;

    public dxc(o59 o59) {
        this.o = o59;
    }

    public static final boolean h0(dxc dxc, RecyclerView recyclerView, int i) {
        dxc.getClass();
        return z7.H(recyclerView, i - 1) && z7.H(recyclerView, z7.l(recyclerView, 1.0f));
    }

    public static final void i0(dxc dxc, hdc hdc) {
        dxc.getClass();
        int j = hdc.j() - 1;
        String str = dxc.Y;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, zr6.h(j, "scrollToBottomNotifier scroll to bottom position, pos:"), (Throwable) null);
        }
        dxc.o.invoke(cxc.a);
    }

    public final jdc W(RecyclerView recyclerView, hdc hdc) {
        return new y15(this, recyclerView, hdc);
    }
}
