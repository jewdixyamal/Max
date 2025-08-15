package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: u6c  reason: default package */
public final class u6c {
    public final Context a;
    public t6c b;
    public final j6e c;
    public final RecyclerView d;

    public u6c(Context context, ExecutorService executorService) {
        this.a = context;
        j6e j6e = new j6e(executorService, new l6c(context), new wz7(27, this), new lwa(10, this));
        this.c = j6e;
        ix3 ix3 = new ix3(fk4.d().getDisplayMetrics().density * 24.0f);
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(wxb.one_chat_react_panel_layout);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(8));
        recyclerView.j(new rt5(tu0.G(((float) (ay7.B(context) >= 360 ? 10 : 8)) * fk4.d().getDisplayMetrics().density), new u4a(0, 1, u6c.class, this, "isExpanded", "isExpanded()Z")));
        recyclerView.setOutlineProvider(ix3);
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(j6e);
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToOutline(false);
        float f = (float) 8;
        float f2 = (float) 12;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
        v3c.y(new r1b((Object) this, (Continuation) null, 4), recyclerView);
        this.d = recyclerView;
    }

    public final void a(kl7 kl7, int i) {
        if (kl7.getSize() > 8) {
            RecyclerView recyclerView = this.d;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                int G = tu0.G(((float) 240) * fk4.d().getDisplayMetrics().density);
                if (i > 0) {
                    G = Math.min(G, i);
                }
                layoutParams.height = G;
                recyclerView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.c.F(kl7, new u3c(2, this));
    }
}
