package one.me.settings.storage.ui;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/storage/ui/SettingsStorageScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "<init>", "()V", "settings-storage_release"}, k = 1, mv = {2, 0, 0})
public final class SettingsStorageScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] X;
    public final je7 a;
    public final q7c b = viewBinding(nha.D);
    public final hid c;
    public final x27 o;

    static {
        hob hob = new hob(SettingsStorageScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        X = new bc7[]{hob};
    }

    public SettingsStorageScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        je7 createViewModelLazy = createViewModelLazy(vid.class, new nhd(1, new hbc(29)));
        this.a = createViewModelLazy;
        hid hid = new hid(new rxd(27, this), ((iba) iid.a.getAccessor().c(iba.class)).a());
        this.c = hid;
        this.o = x27.d;
        od2.L(new zn5(((vid) createViewModelLazy.getValue()).s0, new shb(2, hid, hid.class, "submitList", "submitList(Ljava/util/List;)V", 4, 5), 5), getLifecycleScope());
    }

    public final x27 getInsetsConfig() {
        return this.o;
    }

    public final void h(int i, Bundle bundle) {
        ((vid) this.a.getValue()).t(i);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(nha.I);
        cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cla.setTitle(oha.z);
        cla.setLeftActions(new kka(new rpc(6, this)));
        cla.setForm(uka.a);
        linearLayout.addView(cla);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(nha.D);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new bqc(10, this), (l) null, 12));
        recyclerView.j(new ry0(7));
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, (Continuation) null, 14), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.b.T0(this, X[0])).setAdapter((hdc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((vid) this.a.getValue()).v0, getViewLifecycleOwner().Q(), fg7.o), new oid((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
