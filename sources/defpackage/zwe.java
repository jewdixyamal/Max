package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: zwe  reason: default package */
public final class zwe extends dle {
    public final ae3 o;

    public zwe(ae3 ae3) {
        this.o = ae3;
    }

    public static final void h0(zwe zwe, RecyclerView recyclerView) {
        zwe.getClass();
        a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            if (recyclerView.canScrollVertically(-1)) {
                return;
            }
        } else if (linearLayoutManager.W0() > 0) {
            return;
        }
        if (zwe.o.b) {
            recyclerView.B0(0);
        } else {
            recyclerView.x0(0);
        }
    }

    public final jdc W(RecyclerView recyclerView, hdc hdc) {
        return new f8e(this, recyclerView, 1);
    }
}
