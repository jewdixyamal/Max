package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: v29  reason: default package */
public final class v29 implements qdc {
    public final RecyclerView a;
    public final k56 b;

    public v29(EndlessRecyclerView2 endlessRecyclerView2, p59 p59) {
        this.a = endlessRecyclerView2;
        this.b = p59;
    }

    public final void b(View view) {
    }

    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View I = recyclerView.I(view);
        if ((I == null ? null : recyclerView.T(I)) instanceof qy8) {
            pla.a(view, new q57(13, view, this));
        }
    }
}
