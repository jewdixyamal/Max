package one.me.settings.media.ui;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/media/ui/SettingMediaScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "<init>", "()V", "settings-media_release"}, k = 1, mv = {2, 0, 0})
public final class SettingMediaScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] Y;
    public final lgd X;
    public final glc a = new glc(new hbc(17), (k56) null, 6);
    public final x27 b = x27.d;
    public final je7 c = createViewModelLazy(ndd.class, new jp8(27, new hbc(18)));
    public final q7c o = viewBinding(fha.B);

    static {
        hob hob = new hob(SettingMediaScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Y = new bc7[]{hob};
    }

    public SettingMediaScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        lgd lgd = new lgd(new fd7(this), ((iba) mgd.a.getAccessor().c(iba.class)).a());
        this.X = lgd;
        od2.L(new zn5(m0().Y, new shb(2, lgd, lgd.class, "submitList", "submitList(Ljava/util/List;)V", 4, 3), 5), getLifecycleScope());
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        m0().s(i);
    }

    public final ndd m0() {
        return (ndd) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(fha.E);
        cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cla.setTitle(gha.u);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new rpc(3, this)));
        linearLayout.addView(cla);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(fha.B);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new bqc(8, this), (l) null, 12));
        recyclerView.j(new ry0(4));
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, (Continuation) null, 11), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.T0(this, Y[0])).setAdapter((hdc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(m0().z0, getViewLifecycleOwner().Q(), fg7.o), new cdd((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
