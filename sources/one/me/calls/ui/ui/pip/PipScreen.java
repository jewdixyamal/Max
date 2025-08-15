package one.me.calls.ui.ui.pip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/pip/PipScreen;", "Lone/me/sdk/arch/Widget;", "Liq9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class PipScreen extends Widget implements iq9 {
    public static final /* synthetic */ bc7[] o;
    public final qm0 a = binding(new z1b(this, 0));
    public final je7 b = tu0.r(3, new z1b(this, 1));
    public final je7 c = tu0.r(3, new s4a(26));

    static {
        hob hob = new hob(PipScreen.class, "fakePipView", "getFakePipView()Lone/me/calls/ui/view/pip/CallPipView;", 0);
        nec.a.getClass();
        o = new bc7[]{hob};
    }

    public PipScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((tnd) this.c.getValue()).getClass();
        tnd.a();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(y7a.q0);
        bc7 bc7 = o[0];
        frameLayout.addView((xg1) this.a.getValue());
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    public final void onDestroy() {
        super.onDestroy();
        t1b t1b = (t1b) this.b.getValue();
        t1b.a.c(t1b);
        t1b.c = null;
        ((ugf) t1b.Y.getValue()).b();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7 = this.b;
        bc7 bc7 = o[0];
        ((t1b) je7.getValue()).c = (xg1) this.a.getValue();
        od2.L(new zn5(((t1b) je7.getValue()).X, new a2b(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}
