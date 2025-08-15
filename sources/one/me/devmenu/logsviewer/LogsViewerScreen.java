package one.me.devmenu.logsviewer;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/logsviewer/LogsViewerScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "kn7", "uu7", "logsviewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class LogsViewerScreen extends Widget {
    public static final /* synthetic */ bc7[] Y;
    public static final int Z = View.generateViewId();
    public final kn7 X = new kn7(m0().s0);
    public final x27 a = x27.d;
    public final qm0 b = binding(new zj7(2, this));
    public final je7 c = createViewModelLazy(mv7.class, new nj4(18, new m57(23)));
    public final kn7 o = new kn7(m0().Y);

    static {
        hob hob = new hob(LogsViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        nec.a.getClass();
        Y = new bc7[]{hob};
    }

    public LogsViewerScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final mv7 m0() {
        return (mv7) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        bc7 bc7 = Y[0];
        linearLayout.addView((cla) this.b.getValue(), new FrameLayout.LayoutParams(-1, -2));
        EditText editText = new EditText(linearLayout.getContext());
        editText.setSingleLine(true);
        i4f.l.b(editText, du4.b);
        pq9 pq9 = qp4.u0;
        editText.setTextColor(pq9.j(editText).getText().e);
        editText.addTextChangedListener(new z2(1, this));
        linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(pq9.j(view).i().b.b);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, tu0.F(((double) fk4.d().getDisplayMetrics().density) * 0.5d)));
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(linearLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setAdapter(this.o);
        endlessRecyclerView2.setThreshold(10);
        endlessRecyclerView2.j(new bo6(new ColorDrawable(-16777216)));
        endlessRecyclerView2.setPager(new j81(this, 3));
        od2.L(new j31(m0().Y, m0().s0, new c3(endlessRecyclerView2, this, (Continuation) null, 15), 4), getViewLifecycleScope());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(endlessRecyclerView2, layoutParams);
        return linearLayout;
    }
}
