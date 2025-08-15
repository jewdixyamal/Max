package one.me.messages.settings;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/messages/settings/MessagesSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "message-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MessagesSettingsScreen extends Widget {
    public static final /* synthetic */ bc7[] Y;
    public final mfd X;
    public final glc a = new glc(new j78(12), (k56) null, 6);
    public final x27 b = x27.d;
    public final je7 c;
    public final q7c o;

    static {
        hob hob = new hob(MessagesSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Y = new bc7[]{hob};
    }

    public MessagesSettingsScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        je7 createViewModelLazy = createViewModelLazy(u89.class, new jp8(4, new j78(13)));
        this.c = createViewModelLazy;
        this.o = viewBinding(uda.a);
        mfd mfd = new mfd(new gd1(16, this), ((iba) p89.a.getAccessor().c(iba.class)).a());
        this.X = mfd;
        od2.L(new zn5(((u89) createViewModelLazy.getValue()).o, new lq0(2, mfd, mfd.class, "submitList", "submitList(Ljava/util/List;)V", 4, 23), 5), getLifecycleScope());
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(uda.b);
        cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cla.setTitle(vda.c);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new wz7(9, this)));
        linearLayout.addView(cla);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(uda.a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new hj8(20), (l) null, 12));
        recyclerView.j(new ry0(2));
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, (Continuation) null, 6), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.T0(this, Y[0])).setAdapter((hdc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((u89) this.c.getValue()).X, getViewLifecycleOwner().Q(), fg7.o), new t89((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
