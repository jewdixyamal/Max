package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallTopPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lpn1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class CallTopPanelWidget extends Widget implements xt3, pn1 {
    public static final /* synthetic */ bc7[] o;
    public final je7 a;
    public final je7 b;
    public final q7c c;

    static {
        Class<CallTopPanelWidget> cls = CallTopPanelWidget.class;
        o = new bc7[]{new hob(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), zr6.e(nec.a, cls, "callTopPanel", "getCallTopPanel()Lone/me/calls/ui/view/controls/CallTopControlViewWrapper;", 0)};
    }

    public CallTopPanelWidget(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final on1 m0() {
        return (on1) this.c.T0(this, o[1]);
    }

    public final sn1 n0() {
        return (sn1) this.b.getValue();
    }

    public final void onAttach(View view) {
        od2.L(new zn5(tu0.g(n0().X, getViewLifecycleOwner().Q(), fg7.o), new un1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        on1 on1 = new on1(getContext());
        on1.setId(rvb.call_top_control);
        return on1;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        m0().a();
    }

    public final void onViewCreated(View view) {
        m0().setClickListener(new o9g(6, (Object) this));
        od2.L(new zn5(tu0.g(n0().o, getViewLifecycleOwner().Q(), fg7.o), new vn1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void x(cn1 cn1) {
        if (((el1) this.a.getValue()).u() && getView() != null) {
            int i = cn1 != null ? cn1.a : 0;
            int i2 = i == 0 ? -1 : tn1.$EnumSwitchMapping$0[au1.s(i)];
            if (i2 == -1) {
                return;
            }
            if (i2 == 1) {
                m0().setTitle(cn1.b);
                m0().setStatus(cn1.c);
            } else if (i2 == 2) {
                m0().setTitle((CharSequence) null);
                m0().setStatus((CharSequence) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void y(int i, Bundle bundle) {
        if (i == y7a.G) {
            pnf.o(n0().b.M0, hj1.D);
        } else if (i == y7a.r) {
            pnf.o(n0().b.M0, ij1.D);
        }
    }

    public CallTopPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        fs fsVar = new fs(suc.class, new suc("default"), Widget.ARG_SCOPE_ID);
        bc7 bc7 = o[0];
        this.a = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, el1.class, (k56) null);
        this.b = createViewModelLazy(sn1.class, new s(21, new md1(3, this)));
        this.c = viewBinding(rvb.call_top_control);
    }
}
