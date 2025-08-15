package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: xu2  reason: default package */
public final class xu2 implements qdc {
    public boolean X;
    public final RecyclerView a;
    public final k56 b;
    public final je7 c;
    public boolean o;

    public xu2(EndlessRecyclerView2 endlessRecyclerView2, ox2 ox2, je7 je7) {
        this.a = endlessRecyclerView2;
        this.b = ox2;
        this.c = je7;
    }

    public final void b(View view) {
    }

    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View I = recyclerView.I(view);
        dec T = I == null ? null : recyclerView.T(I);
        if (T instanceof a57) {
            if (!this.o) {
                this.o = true;
                pla.a(view, new wu2(view, this, 0));
            }
        } else if ((T instanceof hb5) || (T instanceof db5)) {
            if (!this.X) {
                this.X = true;
                pla.a(view, new wu2(view, this, 1));
            }
        } else if ((T instanceof us2) && !this.X) {
            this.X = true;
            pla.a(view, new wu2(view, this, 2));
        }
    }
}
