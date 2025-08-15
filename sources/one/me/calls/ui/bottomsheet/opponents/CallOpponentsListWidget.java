package one.me.calls.ui.bottomsheet.opponents;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponents/CallOpponentsListWidget;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Ldn1;", "Liq9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallOpponentsListWidget extends Widget implements xt3, dn1, iq9 {
    public static final /* synthetic */ bc7[] H0;
    public final qm0 A0 = binding(new pf1(this, 13));
    public final qm0 B0 = binding(new pf1(this, 14));
    public final qm0 C0 = binding(new pf1(this, 15));
    public final khe D0 = new khe(new pf1(this, 16));
    public final je7 E0 = tu0.r(3, new pf1(this, 17));
    public final qm0 F0 = binding(new pf1(this, 0));
    public final glc G0 = new glc(new k11(19), (k56) null, 6);
    public final je7 X = tu0.r(3, new pf1(this, 2));
    public final je7 Y = createViewModelLazy(of1.class, new s(18, new pf1(this, 3)));
    public final qm0 Z = binding(new pf1(this, 4));
    public final je7 a = tu0.r(3, new k11(21));
    public final je7 b = yi1.b();
    public final je7 c = tu0.r(3, new pf1(this, 1));
    public final je7 o = tu0.r(3, new k11(20));
    public final je7 s0 = tu0.r(3, new pf1(this, 5));
    public final qm0 t0 = binding(new pf1(this, 6));
    public final qm0 u0 = binding(new pf1(this, 7));
    public final qm0 v0 = binding(new pf1(this, 8));
    public final qm0 w0 = binding(new pf1(this, 10));
    public final qm0 x0 = binding(new pf1(this, 11));
    public final qm0 y0 = binding(new pf1(this, 12));
    public final q7c z0 = viewBinding(y7a.T0);

    static {
        Class<CallOpponentsListWidget> cls = CallOpponentsListWidget.class;
        hob hob = new hob(cls, "collapsibleHeaderContainer", "getCollapsibleHeaderContainer()Landroid/widget/LinearLayout;", 0);
        oec oec = nec.a;
        H0 = new bc7[]{hob, zr6.e(oec, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(cls, "oneMeButtonToolStack", "getOneMeButtonToolStack()Lone/me/sdk/uikit/common/buttonstack/OneMeButtonToolStack;", 0, oec), zr6.f(cls, "opponentsListView", "getOpponentsListView()Landroidx/recyclerview/widget/RecyclerView;", 0, oec), zr6.f(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "titleOpponentListView", "getTitleOpponentListView()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "titleWaitingListView", "getTitleWaitingListView()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "searchView", "getSearchView()Landroid/widget/EditText;", 0, oec), zr6.f(cls, "emptyStateViewStub", "getEmptyStateViewStub()Landroid/view/ViewStub;", 0, oec), zr6.f(cls, "emptyStateView", "getEmptyStateView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, oec), zr6.f(cls, "appBarLayoutView", "getAppBarLayoutView()Lcom/google/android/material/appbar/AppBarLayout;", 0, oec)};
    }

    public CallOpponentsListWidget() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final bvc getScreenDelegate() {
        return this.G0;
    }

    public final fm m0() {
        bc7 bc7 = H0[11];
        return (fm) this.F0.getValue();
    }

    public final LinearLayout n0() {
        bc7 bc7 = H0[0];
        return (LinearLayout) this.Z.getValue();
    }

    public final ViewStub o0() {
        bc7 bc7 = H0[9];
        return (ViewStub) this.B0.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        coordinatorLayout.setBackgroundColor(qp4.u0.p(coordinatorLayout).c.b().k);
        qf1 qf1 = new qf1(this, 2);
        fm m0 = m0();
        qf1.invoke(m0);
        coordinatorLayout.addView(m0);
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        bc7 bc7 = H0[3];
        linearLayout.addView((RecyclerView) this.v0.getValue());
        linearLayout.addView(o0());
        rw3 rw3 = new rw3(-1, -1);
        rw3.b(new AppBarLayout$ScrollingViewBehavior());
        linearLayout.setLayoutParams(rw3);
        coordinatorLayout.addView(linearLayout);
        return coordinatorLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        mr0.I(p0());
        p0().clearFocus();
        r0().B0.a.remove(this);
        of1 r0 = r0();
        eo1 eo1 = r0.c;
        eo1.getClass();
        x77 x77 = (x77) eo1.h.T0(eo1, eo1.k[0]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        ((wr1) ((kr1) r0.u0.getValue())).G.remove(r0);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        p0().clearFocus();
        m0().requestFocus();
        en1 en1 = r0().B0;
        en1.a.add(this);
        x(en1.b);
        m0().a(s36.D(new vc1(new wb5(), this, 1), m0(), getViewLifecycleOwner()));
        w7c w7c = r0().D0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new sf1((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().A0, getViewLifecycleOwner().Q(), fg7), new tf1((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().E0, getViewLifecycleOwner().Q(), fg7), new uf1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final EditText p0() {
        bc7 bc7 = H0[8];
        return (EditText) this.A0.getValue();
    }

    public final cla q0() {
        bc7 bc7 = H0[1];
        return (cla) this.t0.getValue();
    }

    public final of1 r0() {
        return (of1) this.Y.getValue();
    }

    public final void x(cn1 cn1) {
        bc7 bc7 = H0[5];
        ((TextView) this.x0.getValue()).setText(cn1 != null ? cn1.c : null);
    }

    public final void y(int i, Bundle bundle) {
        r0().c.b(i, bundle);
    }
}
