package one.me.calls.ui.ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/settings/CallAdminSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Liq9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallAdminSettingsScreen extends Widget implements iq9 {
    public static final /* synthetic */ bc7[] t0;
    public final je7 X;
    public final je7 Y;
    public final q7c Z;
    public final x27 a = x27.d;
    public final je7 b = createViewModelLazy(k01.class, new s(8, new m(24)));
    public final dz0 c;
    public final je7 o;
    public final je7 s0;

    static {
        Class<CallAdminSettingsScreen> cls = CallAdminSettingsScreen.class;
        t0 = new bc7[]{new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.e(nec.a, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public CallAdminSettingsScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        dz0 dz0 = new dz0(new wmc(this, false), ((iba) zi1.a.getAccessor().c(iba.class)).a());
        this.c = dz0;
        this.o = tu0.r(3, new a01(this, 0));
        this.X = tu0.r(3, new m(25));
        this.Y = tu0.r(3, new m(26));
        viewBinding(y7a.T);
        this.Z = viewBinding(y7a.S);
        od2.L(new zn5(m0().s0, new lq0(2, dz0, dz0.class, "submitList", "submitList(Ljava/util/List;)V", 4, 2), 5), getLifecycleScope());
        this.s0 = tu0.r(3, new a01(this, 1));
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final k01 m0() {
        return (k01) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(y7a.T);
        cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cla.setTitle(b8a.z);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new c01(0, this)));
        pq9 pq9 = qp4.u0;
        cla.setCustomTheme(pq9.p(cla).c);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(y7a.S);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.j((q1d) this.o.getValue());
        recyclerView.j((zz0) this.X.getValue());
        linearLayout.addView(cla);
        linearLayout.addView(recyclerView);
        linearLayout.setBackgroundColor(pq9.p(linearLayout).c.b().l);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        if (((tnd) this.Y.getValue()) != null) {
            tnd.a();
        }
        uu3 uu3 = this;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        znc T = foc != null ? foc.T() : null;
        if (T != null) {
            T.K((b01) this.s0.getValue());
        }
        bc7[] bc7Arr = t0;
        bc7 bc7 = bc7Arr[1];
        q7c q7c = this.Z;
        ((RecyclerView) q7c.T0(this, bc7)).setAdapter((hdc) null);
        ((RecyclerView) q7c.T0(this, bc7Arr[1])).p0((zz0) this.X.getValue());
        ((RecyclerView) q7c.T0(this, bc7Arr[1])).p0((q1d) this.o.getValue());
        k01 m0 = m0();
        ((wr1) ((kr1) m0.X.getValue())).G.remove(m0);
        ez0 q = m0.q();
        q.getClass();
        aa aaVar = (aa) ((yz0) q).F0.getValue();
        bt1 bt1 = (bt1) m0.Y.getValue();
        boolean z = aaVar.b;
        je7 je7 = m0.o;
        se5 se5 = (se5) ((qe5) je7.getValue());
        se5.getClass();
        boolean z2 = false;
        boolean z3 = se5.n(PmsKey.grse, false) ? aaVar.e : false;
        se5 se52 = (se5) ((qe5) je7.getValue());
        se52.getClass();
        if (se52.n(PmsKey.gcwre, false)) {
            z2 = aaVar.g;
        }
        bt1.getClass();
        ky7 ky7 = new ky7();
        Integer d = ((an9) bt1.c.getValue()).d();
        if (d != null) {
            ky7.put("screen", Integer.valueOf(d.intValue()));
        }
        ky7.put("camera", Boolean.valueOf(z));
        ky7.put("microphone", Boolean.valueOf(aaVar.c));
        ky7.put("screenshare", Boolean.valueOf(aaVar.d));
        ky7.put("recording", Boolean.valueOf(z3));
        ky7.put("waiting", Boolean.valueOf(z2));
        bt1.b("ADMIN_CALL_SETTINGS", ky7.b());
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        uu3 uu3 = this;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        znc T = foc != null ? foc.T() : null;
        if (T != null) {
            T.a((b01) this.s0.getValue());
        }
        od2.L(new zn5(tu0.g(m0().t0, getViewLifecycleOwner().Q(), fg7.o), new d01((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
