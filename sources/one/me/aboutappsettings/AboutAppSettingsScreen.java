package one.me.aboutappsettings;

import android.annotation.SuppressLint;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/aboutappsettings/AboutAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "about-app-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AboutAppSettingsScreen extends Widget {
    public static final /* synthetic */ int c = 0;
    public final je7 a = createViewModelLazy(v.class, new s(0, new m(0)));
    public final jv5 b = new jv5(((iba) h.a.getAccessor().d(iba.class).getValue()).a(), (Object) new n(this), 1);

    public AboutAppSettingsScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla cla = new cla(getContext(), 6);
        cla.setForm(uka.a);
        cla.setTitle(g4a.a);
        cla.setLeftActions(new kka(new l(0, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = (float) 12;
        recyclerView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.b);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new xw0(6), (l) null, 8));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(cla);
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, (Continuation) null, 0), linearLayout);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7 = this.a;
        w7c w7c = ((v) je7.getValue()).X;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new p((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((v) je7.getValue()).c, getViewLifecycleOwner().Q(), fg7), new q((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
