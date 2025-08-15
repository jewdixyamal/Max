package one.me.startconversation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/StartConversationScreen;", "Lone/me/sdk/arch/Widget;", "Lfn3;", "Lqd6;", "Lwq3;", "Lnr3;", "Lwy3;", "Lb57;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class StartConversationScreen extends Widget implements fn3, qd6, wq3, nr3, wy3, b57 {
    public static final /* synthetic */ bc7[] I0;
    public final a3g A0;
    public final a3g B0;
    public final a3g C0;
    public final a3g D0;
    public final jv5 E0;
    public final nd3 F0;
    public final pz4 G0;
    public final ru3 H0;
    public final fs X;
    public final je7 Y;
    public final khe Z;
    public final glc a = new glc(new xid(7), (k56) null, 6);
    public final x27 b = x27.d;
    public final fs c;
    public final fs o;
    public final je7 s0;
    public final je7 t0;
    public final q7c u0;
    public final q7c v0;
    public final je7 w0;
    public final ExecutorService x0;
    public final a3g y0;
    public final a3g z0;

    static {
        Class<StartConversationScreen> cls = StartConversationScreen.class;
        I0 = new bc7[]{new oi9(cls, "isNeedScrollToTop", "isNeedScrollToTop()Z"), rh4.g(nec.a, cls, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new oi9(cls, "isInSearch", "isInSearch()Z"), new hob(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartConversationScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls = Boolean.class;
        this.c = new fs(cls, bool, "start_conversations_widget_is_need_scroll_to_top");
        this.o = new fs(CharSequence.class, (Object) null, "start_conversations_widget_search_query");
        fs fsVar = new fs(cls, bool, "contact_list_widget_is_in_search");
        this.X = fsVar;
        nyd nyd = nyd.a;
        this.Y = nyd.getAccessor().d(l67.class);
        this.Z = new khe(new xid(9));
        this.s0 = createViewModelLazy(jzd.class, new nhd(4, new xid(10)));
        this.t0 = createViewModelLazy(bh0.class, new nhd(5, new xid(11)));
        this.u0 = viewBinding(zia.o);
        this.v0 = viewBinding(zia.q);
        this.w0 = fua.a.b();
        ExecutorService a2 = ((iba) nyd.getAccessor().c(iba.class)).a();
        this.x0 = a2;
        a3g a3g = new a3g((Object) this, a2, 4);
        this.y0 = a3g;
        a3g a3g2 = new a3g((Object) this, a2, 2);
        this.z0 = a3g2;
        a3g a3g3 = new a3g((Object) this, a2, 3);
        this.A0 = a3g3;
        a3g a3g4 = new a3g((Object) this, a2, 6);
        this.B0 = a3g4;
        a3g a3g5 = new a3g((Object) this, a2, 3);
        this.C0 = a3g5;
        a3g a3g6 = new a3g((Object) this, a2, 7);
        this.D0 = a3g6;
        jv5 jv5 = new jv5((Object) this, a2, 4);
        this.E0 = jv5;
        this.F0 = new nd3(new md3(false, 1), a3g, a3g6, a3g2, a3g3, a3g4, a3g5, jv5);
        this.G0 = new pz4(7, new lwa(29, this));
        bc7 bc7 = I0[2];
        this.H0 = new ru3(this, ((Boolean) fsVar.a(this)).booleanValue());
        od2.L(new zn5(n0().v0.i, new wyd((Continuation) null, this), 5), getLifecycleScope());
        od2.L(new zn5(n0().x0, new xyd((Continuation) null, this), 5), getLifecycleScope());
    }

    public final void A(x47 x47) {
        int ordinal = x47.ordinal();
        if (ordinal != 0) {
            je7 je7 = this.Y;
            if (ordinal == 1) {
                ((l67) je7.getValue()).a("click_qr", "main", "invite_friends");
                syd.c.P1().b(":invite/qr", (Bundle) null);
            } else if (ordinal == 2) {
                ((l67) je7.getValue()).a("click_link", "main", "invite_friends");
                n0().q();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            syd.c.P1().b(":invite/phone", (Bundle) null);
        }
    }

    public final void J(rd6 rd6) {
        mr0.G(this);
        j47.T(getViewLifecycleScope(), (lx3) null, (vx3) null, new azd(this, rd6, (Continuation) null), 3);
    }

    public final void Q() {
        t();
    }

    public final void d(long j) {
        n0().q();
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final CharSequence m0() {
        bc7 bc7 = I0[1];
        return (CharSequence) this.o.a(this);
    }

    public final jzd n0() {
        return (jzd) this.s0.getValue();
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        i3a onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(this.lifecycleOwner, this.H0);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(zia.m);
        cla cla = new cla(constraintLayout.getContext(), 6);
        cla.setId(zia.q);
        cla.setForm(uka.a);
        cla.setTitle(aja.f);
        cla.setLeftActions(new kka(new uyd(this, 0)));
        cla.setRightActions(new pka((yka) null, new xka(new zyd(this))));
        eha searchView = cla.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(z7.B(cla.getContext(), aja.y));
            bc7 bc7 = I0[2];
            if (((Boolean) this.X.a(this)).booleanValue()) {
                searchView.setExpandWithAnimation(false);
                searchView.d();
                searchView.setExpandWithAnimation(true);
                searchView.setSearchText(m0());
            }
        }
        ti3 ti3 = new ti3(-1, -2);
        ti3.i = 0;
        ti3.e = 0;
        ti3.h = 0;
        constraintLayout.addView(cla, ti3);
        RecyclerView recyclerView = new RecyclerView(constraintLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(zia.o);
        recyclerView.setItemAnimator((mdc) null);
        nd3 nd3 = this.F0;
        recyclerView.setAdapter(nd3);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setClipToPadding(false);
        recyclerView.addOnAttachStateChangeListener(new o50(10, (Object) recyclerView));
        em2 em2 = new em2(4, new uyd(this, 1));
        h8e h8e = new h8e(recyclerView, nd3, em2);
        recyclerView.j(h8e);
        pq9 pq9 = qp4.u0;
        recyclerView.j(new jn3(em2, pq9.j(recyclerView), (in3) new vyd(this, 0)));
        recyclerView.j(new kq(5));
        recyclerView.j(new h8e(recyclerView, nd3, new em2(3, new tyd(this, recyclerView, 1))));
        recyclerView.j(new bw5(pq9.j(recyclerView), new vyd(this, 1)));
        recyclerView.j(new h8e(recyclerView, nd3, new em2(2, new tyd(this, recyclerView, 0))));
        v3c.y(new qb(h8e, (Continuation) null, 4), recyclerView);
        ti3 ti32 = new ti3(-1, 0);
        ti32.j = cla.getId();
        ti32.e = 0;
        ti32.h = 0;
        ti32.l = 0;
        constraintLayout.addView(recyclerView, ti32);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        this.F0.B(this.G0);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            l5g l5g = new l5g(this, 1);
            String[] strArr2 = eua.e;
            int i2 = jpc.Q1;
            int i3 = jpc.W1;
            ((eua) this.w0.getValue()).getClass();
            eua.k(l5g, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(n0().y0, new czd((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().z0, getViewLifecycleOwner().Q(), fg7.o), new bzd((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new j31(n0().u0, ((bh0) this.t0.getValue()).s0, new m1d((Object) this, (Continuation) null, 3), 4), getViewLifecycleScope());
        this.F0.z(this.G0);
    }

    public final void t() {
        ((eua) this.w0.getValue()).f(new l5g(this, 1), eua.e, 156);
    }

    public final void v(long j) {
        jzd n0 = n0();
        pnf.n(n0, ((w9a) ((kke) n0.o.getValue())).a(), (vx3) null, new gzd(n0, j, (Continuation) null), 2);
        mr0.H(requireActivity());
    }

    public final void w(int i) {
        if (yyd.$EnumSwitchMapping$0[au1.s(i)] != 1) {
            t();
        } else if (Build.VERSION.SDK_INT >= 33) {
            ((eua) this.w0.getValue()).f(new l5g(this, 1), eua.k, 177);
        }
    }
}
