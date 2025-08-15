package one.me.calls.ui.ui.waitingroom;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/waitingroom/AdminWaitingRoomScreen;", "Lone/me/sdk/arch/Widget;", "Liq9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class AdminWaitingRoomScreen extends Widget implements iq9 {
    public static final /* synthetic */ bc7[] s0;
    public final q7c X = viewBinding(y7a.S0);
    public final q7c Y = viewBinding(y7a.P0);
    public final je7 Z = tu0.r(3, new x5(5, this));
    public final je7 a = createViewModelLazy(qa.class, new s(4, new m(3)));
    public final q7c b = viewBinding(y7a.T0);
    public final q7c c = viewBinding(y7a.Q0);
    public final q7c o = viewBinding(y7a.O0);

    static {
        Class<AdminWaitingRoomScreen> cls = AdminWaitingRoomScreen.class;
        hob hob = new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oec = nec.a;
        s0 = new bc7[]{hob, zr6.e(oec, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(cls, "applyAllButton", "getApplyAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "rejectAllButton", "getRejectAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, oec)};
    }

    public AdminWaitingRoomScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        pq9 pq9 = qp4.u0;
        constraintLayout.setBackgroundColor(pq9.p(constraintLayout).c.b().k);
        cla cla = new cla(getContext(), 6);
        cla.setId(y7a.T0);
        cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cla.setCustomTheme(pq9.p(cla).c);
        cla.setTitle(b8a.X0);
        cla.setSubtitle(b8a.j2);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new l(5, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(y7a.Q0);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((ja) this.Z.getValue());
        recyclerView.setItemAnimator((mdc) null);
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(y7a.O0);
        oneMeButton.setCustomTheme(pq9.p(oneMeButton).c);
        c7a c7a = c7a.c;
        oneMeButton.setSize(c7a);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setText(b8a.S0);
        tu0.K(oneMeButton, 300, new ka(this, 0));
        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        OneMeButton oneMeButton2 = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton2.setId(y7a.S0);
        oneMeButton2.setCustomTheme(pq9.p(oneMeButton2).c);
        oneMeButton2.setSize(c7a);
        oneMeButton2.setMode(b7a.b);
        oneMeButton2.setAppearance(z6a.c);
        oneMeButton2.setText(b8a.W0);
        tu0.K(oneMeButton2, 300, new ka(this, 1));
        oneMeButton2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        aba aba = new aba(getContext(), (AttributeSet) null);
        aba.setId(y7a.P0);
        aba.setIcon(x7a.I0);
        aba.setTitle(new eqe(b8a.V0));
        aba.setSubtitle(new eqe(b8a.U0));
        aba.x(aba.getContext().getString(b8a.T0), new ka(this, 2));
        aba.setCustomTheme(pq9.p(aba).c);
        aba.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        aba.setVisibility(8);
        constraintLayout.addView(cla);
        constraintLayout.addView(aba);
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(oneMeButton);
        constraintLayout.addView(oneMeButton2);
        dj3 q = fp3.q(constraintLayout);
        int id = cla.getId();
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.d(id, 7, 0, 7);
        int id2 = recyclerView.getId();
        q.d(id2, 3, cla.getId(), 4);
        q.d(id2, 6, 0, 6);
        q.d(id2, 7, 0, 7);
        q.d(id2, 4, oneMeButton.getId(), 3);
        int id3 = aba.getId();
        q.d(id3, 3, cla.getId(), 4);
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        q.d(id3, 4, 0, 4);
        int id4 = oneMeButton.getId();
        q.d(id4, 6, oneMeButton2.getId(), 6);
        float f = (float) 12;
        new l2a(q, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        q.d(id4, 7, oneMeButton2.getId(), 7);
        new l2a(q, 7, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        q.d(id4, 4, oneMeButton2.getId(), 3);
        new l2a(q, 4, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id5 = oneMeButton2.getId();
        q.d(id5, 6, 0, 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id5, 4));
        q.d(id5, 7, 0, 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id5, 4));
        q.d(id5, 4, 0, 4);
        new l2a(q, 4, id5, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        q.a(constraintLayout);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.T0(this, s0[1])).setAdapter((hdc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(((qa) this.a.getValue()).X, new la(this, (Continuation) null), 5), getLifecycleScope());
    }
}
