package one.me.stickersshowcase;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickersshowcase/StickersShowcaseScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-showcase_release"}, k = 1, mv = {2, 0, 0})
public final class StickersShowcaseScreen extends Widget {
    public static final /* synthetic */ bc7[] v0;
    public final q7c X;
    public final q7c Y;
    public final qm0 Z;
    public final fs a = new fs(Long.class, 0L, "chat_id");
    public final je7 b = createViewModelLazy(i7e.class, new nhd(11, new z6e(this, 0)));
    public final je7 c;
    public final gw7 o;
    public final qm0 s0;
    public vha t0;
    public final p71 u0;

    static {
        Class<StickersShowcaseScreen> cls = StickersShowcaseScreen.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        v0 = new bc7[]{hob, zr6.e(oec, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(cls, "setsRecycler", "getSetsRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0, oec)};
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [gw7, java.lang.Object] */
    public StickersShowcaseScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        x6e x6e = x6e.a;
        this.c = x6e.getAccessor().d(hw7.class);
        ? obj = new Object();
        this.o = obj;
        this.X = viewBinding(ija.b);
        this.Y = viewBinding(ija.a);
        this.Z = binding(new z6e(this, 1));
        this.s0 = binding(new z6e(this, 2));
        this.u0 = new p71(((iba) x6e.getAccessor().c(iba.class)).a(), obj, new wd6(29, (Object) this));
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final EndlessRecyclerView2 m0() {
        return (EndlessRecyclerView2) this.Y.T0(this, v0[2]);
    }

    public final i7e n0() {
        return (i7e) this.b.getValue();
    }

    public final void onActivityPaused(Activity activity) {
        ((hw7) this.c.getValue()).a(this.o);
    }

    public final void onActivityResumed(Activity activity) {
        ((hw7) this.c.getValue()).b(this.o);
    }

    public final void onChangeStarted(zu3 zu3, av3 av3) {
        super.onChangeStarted(zu3, av3);
        av3 av32 = av3.POP_ENTER;
        je7 je7 = this.c;
        gw7 gw7 = this.o;
        if (av3 == av32 || av3 == av3.PUSH_ENTER) {
            ((hw7) je7.getValue()).b(gw7);
        } else if (av3 == av3.PUSH_EXIT) {
            ((hw7) je7.getValue()).a(gw7);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        v3c.y(new lc8(3, (Continuation) null, 4), frameLayout);
        cla cla = new cla(frameLayout.getContext(), 6);
        cla.setId(ija.b);
        cla.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        cla.setTitle(jja.a);
        cla.setForm(uka.a);
        cla.setRightActions(new pka(new xka(new rz5(this, 1)), new vka(yfa.x, new w8c(9))));
        cla.setLeftActions(new kka(new rpc(10, this)));
        frameLayout.addView(cla);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(ija.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(G, endlessRecyclerView2.getPaddingTop(), G, endlessRecyclerView2.getPaddingBottom());
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.o.b();
        EndlessRecyclerView2 m0 = m0();
        m0.setAdapter((hdc) null);
        m0.setPager((t15) null);
    }

    public final void onViewCreated(View view) {
        EndlessRecyclerView2 m0 = m0();
        cla cla = (cla) this.X.T0(this, v0[1]);
        pla.a(cla, new h76((ViewGroup) cla, (RecyclerView) m0, (Widget) this, 25));
        m0.getContext();
        m0.setLayoutManager(new LinearLayoutManager());
        m0.setItemAnimator((mdc) null);
        m0.j(new sc1(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density), 7));
        m0.setPager(new j81(this, 9));
        m0.setIgnoreRefreshingFlagsForScrollEvent(true);
        m0.setAdapter(this.u0);
        od2.L(new zn5(n0().w0, new shb(2, this, StickersShowcaseScreen.class, "handleNewState", "handleNewState(Lone/me/stickersshowcase/model/ShowcaseState;)V", 4, 17), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().t0, new shb(2, this, StickersShowcaseScreen.class, "handleEvents", "handleEvents(Lone/me/stickersshowcase/ShowcaseEvent;)V", 4, 18), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().u0, new shb(2, this, StickersShowcaseScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 19), 5), getViewLifecycleScope());
    }
}
