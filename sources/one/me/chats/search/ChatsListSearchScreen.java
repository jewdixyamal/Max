package one.me.chats.search;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/search/ChatsListSearchScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "La33;", "Lng3;", "Ltyc;", "Lwq3;", "Ly16;", "<init>", "()V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
public final class ChatsListSearchScreen extends Widget implements xt3, a33, ng3, tyc, wq3, y16 {
    public static final /* synthetic */ bc7[] J0;
    public final xq3 A0;
    public final y51 B0;
    public final y51 C0;
    public final a3g D0;
    public final y51 E0;
    public final nd3 F0;
    public final q7c G0;
    public final w4d H0;
    public vha I0;
    public final fs X = new fs(Boolean.class, Boolean.TRUE, "should.restore.focus");
    public final q7c Y = viewBinding(uvb.chats_list_search_toolbar);
    public final je7 Z = createViewModelLazy(gw2.class, new ti2(17, new hn2(6)));
    public final glc a;
    public final je7 b;
    public final x27 c = x27.d;
    public final fs o = new fs(Long.class, (Object) null, "selected.chatId.Action");
    public final je7 s0 = createViewModelLazy(bh0.class, new ti2(18, new hn2(7)));
    public final ExecutorService t0;
    public final je7 u0;
    public final xq3 v0;
    public final a3g w0;
    public final xq3 x0;
    public final a3g y0;
    public final pz4 z0;

    static {
        Class<ChatsListSearchScreen> cls = ChatsListSearchScreen.class;
        J0 = new bc7[]{new oi9(cls, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), rh4.g(nec.a, cls, "shouldRestoreFocus", "getShouldRestoreFocus()Z"), new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new oi9(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;")};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatsListSearchScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        e11 e11 = r0;
        e11 e112 = new e11(0, this, ChatsListSearchScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 7);
        this.a = new glc(e11, (k56) null, 6);
        ys2 ys2 = ys2.a;
        this.b = ys2.getAccessor().d(an9.class);
        ExecutorService a2 = ys2.c().a();
        this.t0 = a2;
        this.u0 = ys2.getAccessor().d(eua.class);
        xq3 xq3 = new xq3(new zu2(this), a2);
        this.v0 = xq3;
        a3g a3g = new a3g((Object) new jv2(this), a2, 11);
        this.w0 = a3g;
        xq3 xq32 = new xq3((tyc) this, a2);
        this.x0 = xq32;
        a3g a3g2 = new a3g((Object) new gd1(3, this), a2, 3);
        this.y0 = a3g2;
        this.z0 = new pz4(1, this);
        xq3 xq33 = new xq3((tyc) this, a2);
        this.A0 = xq33;
        y51 y51 = new y51(a2, 4);
        this.B0 = y51;
        y51 y512 = new y51(a2, 3);
        this.C0 = y512;
        a3g a3g3 = new a3g((Object) this, a2, 2);
        this.D0 = a3g3;
        y51 y513 = new y51(a2, 1);
        this.E0 = y513;
        this.F0 = new nd3(new md3(false, 1), xq3, a3g3, a3g, xq32, a3g2, xq33, y513, y51, y512);
        this.G0 = viewBinding(p8a.g);
        this.H0 = mqd.D();
    }

    public final void R(int i, int i2, Intent intent) {
        if (i == 101 && i2 == -1) {
            bc7 bc7 = J0[1];
            this.X.b(this, Boolean.FALSE);
        }
    }

    public final x27 getInsetsConfig() {
        return this.c;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("selected.chatId.Action");
            gw2 n0 = n0();
            pnf.n(n0, ((w9a) n0.Z).a(), (vx3) null, new zv2(i, n0, j, (Continuation) null), 2);
        }
    }

    public final void m0() {
        this.v0.E((List) null);
        nz4 nz4 = nz4.a;
        this.w0.E(nz4);
        this.x0.E(nz4);
        this.y0.E(nz4);
    }

    public final gw2 n0() {
        return (gw2) this.Z.getValue();
    }

    public final void o0(izc izc) {
        izc izc2 = izc;
        mr0.G(this);
        int s = au1.s(izc2.a);
        if (s == 0) {
            gw2 n0 = n0();
            pnf.n(n0, ((w9a) n0.Z).b(), (vx3) null, new fw2(n0, izc.getItemId(), (Continuation) null), 2);
            gy2.b2(gy2.c, izc.getItemId(), "local", (Long) null, (Long) null, (List) null, (String) null, 124);
        } else if (s == 1) {
            gy2.b2(gy2.c, izc.getItemId(), "server", (Long) null, (Long) null, (List) null, (String) null, 124);
        } else if (s == 2) {
            gw2 n02 = n0();
            j47.T(n02.a, ((w9a) n02.Z).a(), (vx3) null, new cw2(n02, izc.getItemId(), (Continuation) null), 2);
        } else if (s == 3) {
            gw2 n03 = n0();
            j47.T(n03.a, ((w9a) n03.Z).a(), (vx3) null, new ew2(n03, (td6) izc2, (Continuation) null), 2);
        } else if (s == 4) {
            mx8 mx8 = (mx8) izc2;
            if (mx8.Y != null) {
                j47.T(getViewLifecycleScope(), (lx3) null, (vx3) null, new cv2(this, mx8, (Continuation) null), 3);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onChangeEnded(zu3 zu3, av3 av3) {
        super.onChangeEnded(zu3, av3);
        if (av3 == av3.POP_ENTER) {
            gw2 n0 = n0();
            n0.o.i = n0;
        }
        bc7[] bc7Arr = J0;
        bc7 bc7 = bc7Arr[1];
        fs fsVar = this.X;
        boolean booleanValue = ((Boolean) fsVar.a(this)).booleanValue();
        bc7 bc72 = bc7Arr[1];
        fsVar.b(this, Boolean.TRUE);
        if (av3.b && booleanValue) {
            eha searchView = ((cla) this.Y.T0(this, bc7Arr[2])).getSearchView();
            if (searchView != null) {
                mr0.V((View) searchView.C0.getValue());
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(p8a.h);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        v3c.y(new o(3, (Continuation) null, 2), linearLayout);
        cla cla = new cla(getContext(), 6);
        cla.setId(p8a.i);
        cla.setTransitionName(cla.getContext().getString(r8a.q));
        cla.setForm(uka.b);
        cla.setRightActions(new pka(new xka(new imc(this, cla, false, 11)), new vka(yfa.i, new we1(26))));
        cla.setTitle(r8a.p);
        eha searchView = cla.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(searchView.getResources().getString(r8a.y));
            searchView.setCollapsible(false);
            searchView.setSearchText(((ov2) n0().F0.a.getValue()).b);
            if (bundle != null) {
                searchView.setExpandWithAnimation(false);
                searchView.c(false);
            }
        }
        linearLayout.addView(cla);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(p8a.g);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2.setItemAnimator((mdc) null);
        nd3 nd3 = this.F0;
        endlessRecyclerView2.setAdapter(nd3);
        endlessRecyclerView2.setHasFixedSize(true);
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setPager(new j81(this, 1));
        endlessRecyclerView2.setDelegate(this.E0);
        h8e h8e = new h8e(endlessRecyclerView2, nd3, new em2(1, new ga(this, 5, endlessRecyclerView2)));
        endlessRecyclerView2.j(h8e);
        v3c.y(new gm2(h8e, (Continuation) null, 1), endlessRecyclerView2);
        linearLayout.addView(endlessRecyclerView2);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        this.I0 = null;
        this.A0.B(this.z0);
        super.onDestroyView(view);
    }

    public final void onDismiss() {
        bc7[] bc7Arr = J0;
        bc7 bc7 = bc7Arr[0];
        this.o.b(this, (Object) null);
        x77 x77 = (x77) this.H0.T0(this, bc7Arr[4]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            l5g l5g = new l5g(this, 1);
            String[] strArr2 = eua.e;
            int i2 = jpc.Q1;
            int i3 = jpc.W1;
            ((eua) this.u0.getValue()).getClass();
            eua.k(l5g, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        this.A0.z(this.z0);
        w7c w7c = n0().F0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new dv2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new j31(((bh0) this.s0.getValue()).s0, n0().F0, new v8(3, 4, ChatsListSearchScreen.class, this, "combineSearchAndBanners", "combineSearchAndBanners(Ljava/util/List;Lone/me/chats/search/ChatsListSearchState;)Ljava/util/List;"), 4), getViewLifecycleOwner().Q(), fg7), new ev2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().H0, getViewLifecycleOwner().Q(), fg7), new hv2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(new xk1(tu0.g(n0().I0, getViewLifecycleOwner().Q(), fg7), 22), new iv2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p0(izc izc, View view) {
        if (izc instanceof vq2) {
            mr0.G(this);
            vxd T = j47.T(getViewLifecycleScope(), (lx3) null, vx3.b, new kv2(this, ((vq2) izc).H0, view, (Continuation) null), 1);
            this.H0.o1(this, J0[4], T);
        }
    }

    public final void q0() {
        if (getView() != null) {
            ((EndlessRecyclerView2) this.G0.T0(this, J0[3])).x0(0);
        }
    }

    public final void w(int i) {
        ((eua) this.u0.getValue()).f(new l5g(this, 1), eua.e, 156);
    }

    public final void y(int i, Bundle bundle) {
        bc7[] bc7Arr = J0;
        bc7 bc7 = bc7Arr[0];
        fs fsVar = this.o;
        Long l = (Long) fsVar.a(this);
        if (l != null) {
            long longValue = l.longValue();
            bc7 bc72 = bc7Arr[0];
            fsVar.b(this, (Object) null);
            gw2 n0 = n0();
            pnf.n(n0, ((w9a) n0.Z).a(), (vx3) null, new zv2(i, n0, longValue, (Continuation) null), 2);
        }
    }
}
