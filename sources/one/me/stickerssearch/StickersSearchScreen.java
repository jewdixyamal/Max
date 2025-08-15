package one.me.stickerssearch;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssearch/StickersSearchScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-search_release"}, k = 1, mv = {2, 0, 0})
public final class StickersSearchScreen extends Widget {
    public static final /* synthetic */ bc7[] u0;
    public final q7c X;
    public final q7c Y;
    public final qm0 Z;
    public final fs a = new fs(Long.class, "chat_id");
    public final je7 b = createViewModelLazy(q5e.class, new nhd(9, new g5e(this, 0)));
    public final je7 c;
    public final gw7 o;
    public final qm0 s0;
    public final a3g t0;

    static {
        Class<StickersSearchScreen> cls = StickersSearchScreen.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        u0 = new bc7[]{hob, zr6.e(oec, cls, "stickersRecycler", "getStickersRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zr6.f(cls, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0, oec)};
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [gw7, java.lang.Object] */
    public StickersSearchScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        e5e e5e = e5e.a;
        this.c = e5e.getAccessor().d(hw7.class);
        this.o = new Object();
        this.X = viewBinding(dja.a);
        this.Y = viewBinding(dja.b);
        this.Z = binding(new g5e(this, 1));
        this.s0 = binding(new g5e(this, 2));
        this.t0 = new a3g(((iba) e5e.getAccessor().c(iba.class)).a(), new wmc(this, false));
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final EndlessRecyclerView2 m0() {
        return (EndlessRecyclerView2) this.X.T0(this, u0[1]);
    }

    public final q5e n0() {
        return (q5e) this.b.getValue();
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
        v3c.y(new lc8(3, (Continuation) null, 3), frameLayout);
        eha eha = new eha(frameLayout.getContext());
        eha.setId(dja.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        layoutParams.rightMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        eha.setLayoutParams(layoutParams);
        eha.setSearchHint(eha.getContext().getString(eja.a));
        eha.c(true);
        eha.setListener(new h5e(this));
        frameLayout.addView(eha);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(dja.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int G = tu0.G(f * fk4.d().getDisplayMetrics().density);
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
        eha eha = (eha) this.Y.T0(this, u0[2]);
        pla.a(eha, new i76((ViewGroup) eha, (Object) m0, (Object) this, 22));
        int A = z7.A(m0.getContext());
        m0.getContext();
        m0.setLayoutManager(new GridLayoutManager(A));
        m0.setItemAnimator((mdc) null);
        m0.j(new ry0(A, tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), 8));
        m0.k(new yc7(4, this));
        m0.setPager(new j81(this, 8));
        m0.setIgnoreRefreshingFlagsForScrollEvent(true);
        m0.setAdapter(this.t0);
        w7c w7c = n0().s0;
        gh7 Q = this.lifecycleOwner.Q();
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, Q, fg7), new shb(2, this, StickersSearchScreen.class, "handleNewState", "handleNewState(Lone/me/stickerssearch/model/SearchState;)V", 4, 12), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(n0().t0, this.lifecycleOwner.Q(), fg7), new shb(2, this, StickersSearchScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 13), 5), getLifecycleScope());
    }
}
