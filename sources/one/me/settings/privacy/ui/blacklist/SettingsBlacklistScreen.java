package one.me.settings.privacy.ui.blacklist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/blacklist/SettingsBlacklistScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SettingsBlacklistScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] Z;
    public final q7c X = viewBinding(iha.a);
    public final jv5 Y = new jv5((Object) new gaa((Object) this), ((iba) ehd.a.getAccessor().c(iba.class)).a(), 12);
    public final glc a = new glc(wuc.SETTINGS_PRIVACY_BLOCK_LIST);
    public final x27 b = x27.d;
    public final je7 c = createViewModelLazy(ped.class, new jp8(28, new hbc(19)));
    public final q7c o = viewBinding(iha.b);

    static {
        Class<SettingsBlacklistScreen> cls = SettingsBlacklistScreen.class;
        Z = new bc7[]{new hob(cls, "recycler", "getRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), zr6.e(nec.a, cls, "emptyState", "getEmptyState()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    }

    public SettingsBlacklistScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        if (i == iha.d) {
            ped m0 = m0();
            m0.getClass();
            if (bundle != null) {
                pnf.n(m0, ((w9a) ((kke) m0.s0.getValue())).b(), (vx3) null, new oed(m0, bundle.getLong("user_unblock_id"), (Continuation) null), 2);
            }
        }
    }

    public final ped m0() {
        return (ped) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(iha.c);
        cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cla.setTitle(kha.e);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new rpc(4, this)));
        linearLayout.addView(cla);
        aba aba = new aba(linearLayout.getContext(), (AttributeSet) null);
        aba.setId(iha.a);
        aba.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        aba.setIcon(woc.l0);
        aba.setTitle(new eqe(kha.d));
        aba.onThemeChanged(qp4.u0.j(aba));
        linearLayout.addView(aba);
        z15 z15 = new z15(linearLayout.getContext(), (AttributeSet) null);
        z15.setId(iha.b);
        z15.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        z15.getContext();
        z15.setLayoutManager(new LinearLayoutManager());
        z15.setAdapter(this.Y);
        z15.setHasFixedSize(true);
        z15.setPager(m0());
        linearLayout.addView(z15);
        v3c.y(new o(3, (Continuation) null, 12), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((z15) this.o.T0(this, Z[0])).setAdapter((hdc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        w7c w7c = m0().u0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new ied((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().y0, getViewLifecycleOwner().Q(), fg7), new jed((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
