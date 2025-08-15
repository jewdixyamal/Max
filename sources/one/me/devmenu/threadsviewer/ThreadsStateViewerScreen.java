package one.me.devmenu.threadsviewer;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/threadsviewer/ThreadsStateViewerScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "jv5", "vt3", "threads-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ThreadsStateViewerScreen extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final x27 a = x27.d;
    public final qm0 b = binding(new rzd(10, this));
    public final je7 c = createViewModelLazy(cte.class, new nhd(13, new bse(2)));
    public final jv5 o = new jv5(this, ((iba) dte.a.getAccessor().c(iba.class)).a());

    static {
        hob hob = new hob(ThreadsStateViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        nec.a.getClass();
        X = new bc7[]{hob};
    }

    public ThreadsStateViewerScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        bc7 bc7 = X[0];
        linearLayout.addView((cla) this.b.getValue(), new FrameLayout.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        float f = (float) 12;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.o);
        recyclerView.j(new bo6(new ColorDrawable(-16777216)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 112;
        linearLayout.addView(recyclerView, layoutParams);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((cte) this.c.getValue()).b, getViewLifecycleOwner().Q(), fg7.o), new fte((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
