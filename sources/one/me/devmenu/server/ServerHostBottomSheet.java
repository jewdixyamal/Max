package one.me.devmenu.server;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/server/ServerHostBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ServerHostBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] G0;
    public final jv5 A0;
    public final q7c B0;
    public final q7c C0;
    public final q7c D0;
    public final q7c E0;
    public final q7c F0;
    public final je7 y0;
    public final AutoTransition z0 = new AutoTransition();

    static {
        Class<ServerHostBottomSheet> cls = ServerHostBottomSheet.class;
        hob hob = new hob(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        oec oec = nec.a;
        G0 = new bc7[]{hob, zr6.e(oec, cls, "loaderView", "getLoaderView()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), zr6.f(cls, "customContainer", "getCustomContainer()Landroid/widget/LinearLayout;", 0, oec), zr6.f(cls, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0, oec), zr6.f(cls, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec)};
    }

    public ServerHostBottomSheet() {
        super((Bundle) null, 1, (z84) null);
        je7 createViewModelLazy = createViewModelLazy(oo6.class, new jp8(25, new hbc(15)));
        this.y0 = createViewModelLazy;
        this.A0 = new jv5((Object) new o7d((oo6) createViewModelLazy.getValue()), ((iba) fi4.a.getAccessor().c(iba.class)).a(), 7);
        this.B0 = viewBinding(zvb.server_host_recycler);
        this.C0 = viewBinding(zvb.server_host_loader);
        this.D0 = viewBinding(zvb.server_host_container);
        this.E0 = viewBinding(zvb.server_host_input);
        this.F0 = viewBinding(zvb.server_host_custom_btn);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7 = this.y0;
        q0e q0e = ((oo6) je7.getValue()).s0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(q0e, getViewLifecycleOwner().Q(), fg7), new p7d((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((oo6) je7.getValue()).t0, getViewLifecycleOwner().Q(), fg7), new q7d((Continuation) null, this, view), 5), getViewLifecycleScope());
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Адрес сервера");
        i4f.c.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(zvb.server_host_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setAdapter(this.A0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        linearLayout.addView(recyclerView);
        nfa nfa = new nfa(linearLayout.getContext());
        nfa.setId(zvb.server_host_loader);
        linearLayout.setGravity(17);
        nfa.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nfa.setAppearance(ffa.a);
        nfa.setSize(ifa.a);
        nfa.setVisibility(8);
        linearLayout.addView(nfa);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(zvb.server_host_container);
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(8);
        cka cka = new cka(linearLayout2.getContext());
        cka.setId(zvb.server_host_input);
        cka.setLayoutParams(new ti3(-1, -2));
        cka.setBackgroundColorAttr(Integer.valueOf(wfa.L));
        cka.setHint("Введите кастомный адрес");
        EditText editText = cka.a;
        z2 z2Var = new z2(8, this);
        editText.addTextChangedListener(z2Var);
        editText.addTextChangedListener(z2Var);
        linearLayout2.addView(cka);
        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), (AttributeSet) null);
        oneMeButton.setId(zvb.server_host_custom_btn);
        ti3 ti3 = new ti3(-1, -2);
        ti3.topMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(ti3);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText((CharSequence) "Установить");
        tu0.K(oneMeButton, 300, new elb(3, (Object) this));
        linearLayout2.addView(oneMeButton);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }
}
