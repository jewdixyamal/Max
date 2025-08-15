package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: hud  reason: default package */
public final class hud extends tdc {
    public boolean a = false;
    public final /* synthetic */ g34 b;

    public hud(g34 g34) {
        this.b = g34;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.o();
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.a = true;
        }
    }
}
