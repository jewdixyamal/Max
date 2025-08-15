package one.me.webapp.settings;

import android.annotation.SuppressLint;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/webapp/settings/WebAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "(J)V", "web-app_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class WebAppSettingsScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] s0;
    public final q7c X;
    public bwf Y;
    public final a3g Z;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final q7c o;

    static {
        Class<WebAppSettingsScreen> cls = WebAppSettingsScreen.class;
        hob hob = new hob(cls, "botId", "getBotId()J", 0);
        oec oec = nec.a;
        s0 = new bc7[]{hob, zr6.e(oec, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec)};
    }

    public WebAppSettingsScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new glc(new bse(22), (k56) null, 6);
        this.b = x27.d;
        this.c = createViewModelLazy(p0g.class, new nhd(17, new eh2(bundle, 11)));
        this.o = viewBinding(kla.f);
        this.X = viewBinding(kla.i);
        this.Z = new a3g(((iba) jwf.a.getAccessor().c(iba.class)).a(), (Object) new i0g(this), 0);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
    }

    public final p0g m0() {
        return (p0g) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(kla.i);
        cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new rpc(16, this)));
        linearLayout.addView(cla);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(kla.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Z);
        float f = (float) 12;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new gte(17, (Object) this), (l) null, 12));
        recyclerView.j(new d71());
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, (Continuation) null, 16), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.T0(this, s0[1])).setAdapter((hdc) null);
        this.Y = null;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.Y = new bwf(requireActivity(), (k56) new e09(0, m0(), p0g.class, "onBiometrySuccess", "onBiometrySuccess()V", 0, 18), (k56) new e09(0, m0(), p0g.class, "onBiometryFail", "onBiometryFail()V", 0, 19));
        w7c w7c = m0().u0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new f0g((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().v0, getViewLifecycleOwner().Q(), fg7), new g0g((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().w0, getViewLifecycleOwner().Q(), fg7), new h0g((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public WebAppSettingsScreen(long j) {
        this(dy7.g(new kpa("bot_id_arg", Long.valueOf(j))));
    }
}
