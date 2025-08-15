package one.me.login.inputphone;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/login/inputphone/InputPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Loy3;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class InputPhoneScreen extends Widget implements oy3 {
    public static final /* synthetic */ bc7[] E0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final vf1 D0;
    public final fs X = new fs(String.class, "", "screen:input_phone:phone");
    public final String Y = "LoginScope";
    public final je7 Z;
    public final /* synthetic */ dp3 a = new Object();
    public final x27 b = new x27(0, new yq0(3, 3, false), 1);
    public final glc c = new glc(new fh5(21), (k56) null, 6);
    public final je7 o = createViewModelLazy(q27.class, new nj4(9, new fh5(22)));
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public AppCompatTextView x0;
    public final je7 y0;
    public f47 z0;

    static {
        Class<InputPhoneScreen> cls = InputPhoneScreen.class;
        E0 = new bc7[]{new oi9(cls, "phone", "getPhone()Ljava/lang/String;"), z7b.g(nec.a, cls, "containerView", "getContainerView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new hob(cls, "gradientBgView", "getGradientBgView()Landroid/view/View;", 0), new hob(cls, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new hob(cls, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new hob(cls, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [dp3, java.lang.Object] */
    public InputPhoneScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        lt7 lt7 = lt7.a;
        this.Z = lt7.getAccessor().d(ad.class);
        this.s0 = viewBinding(hwb.oneme_login_input_constraint_layout);
        this.t0 = viewBinding(hwb.oneme_login_input_gradient_bg);
        this.u0 = viewBinding(hwb.oneme_login_input_continue_button);
        this.v0 = viewBinding(hwb.oneme_login_input_phone_number_input);
        this.w0 = viewBinding(hwb.oneme_login_input_help_button);
        this.y0 = lt7.getAccessor().d(zua.class);
        this.A0 = tu0.r(3, new y17(this, 0));
        fua.a.b();
        this.B0 = lt7.getAccessor().d(d80.class);
        this.C0 = lt7.getAccessor().d(x6a.class);
        this.D0 = new vf1(this, 4);
    }

    public static final void m0(InputPhoneScreen inputPhoneScreen, String str) {
        inputPhoneScreen.getClass();
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        try {
            inputPhoneScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            hm9.p("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", (Throwable) null);
            wha wha = new wha((Widget) inputPhoneScreen);
            wha.h(inputPhoneScreen.getContext().getString(jpc.F1));
            wha.i();
        }
    }

    public static final void n0(InputPhoneScreen inputPhoneScreen, CharSequence charSequence) {
        int i = 0;
        if (inputPhoneScreen.x0 == null && charSequence != null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(inputPhoneScreen.getContext(), (AttributeSet) null);
            i4f.p.b(appCompatTextView, du4.b);
            ti3 ti3 = new ti3(0, -2);
            float f = (float) 24;
            ti3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
            ti3.j = hwb.oneme_login_input_phone_number_input;
            ti3.t = 0;
            ti3.v = 0;
            appCompatTextView.setGravity(8388611);
            appCompatTextView.setLayoutParams(ti3);
            v3c.y(new mb5(3, (Continuation) null, 1), appCompatTextView);
            ((ConstraintLayout) inputPhoneScreen.s0.T0(inputPhoneScreen, E0[1])).addView(appCompatTextView);
            inputPhoneScreen.x0 = appCompatTextView;
        }
        AppCompatTextView appCompatTextView2 = inputPhoneScreen.x0;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(charSequence);
        }
        AppCompatTextView appCompatTextView3 = inputPhoneScreen.x0;
        if (appCompatTextView3 != null) {
            if (!(!(charSequence == null || charSequence.length() == 0))) {
                i = 8;
            }
            appCompatTextView3.setVisibility(i);
        }
    }

    public static void r0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan, fka fka) {
        int A02 = w9e.A0(str, str2, 0, false, 6);
        int length = str2.length() + A02;
        spannableString.setSpan(clickableSpan, A02, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(fka.getText().e), A02, length, 33);
    }

    public final void K(eaa eaa) {
        q0().w0.m((Object) null, eaa);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m64getScopeIdIluPPks() {
        return this.Y;
    }

    public final bvc getScreenDelegate() {
        return this.c;
    }

    public final OneMeButton o0() {
        return (OneMeButton) this.u0.T0(this, E0[3]);
    }

    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
        q27 q0 = q0();
        pnf.o(q0.s0, e5f.a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setFillViewport(true);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ConstraintLayout constraintLayout = new ConstraintLayout(scrollView.getContext());
        constraintLayout.setId(hwb.oneme_login_input_constraint_layout);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        v3c.y(new a27(this, (Continuation) null, 0), constraintLayout);
        View view = new View(constraintLayout.getContext());
        view.setId(hwb.oneme_login_input_gradient_bg);
        ti3 ti3 = new ti3(-1, tu0.G(((float) 283) * fk4.d().getDisplayMetrics().density));
        ti3.i = 0;
        ti3.t = 0;
        ti3.v = 0;
        view.setLayoutParams(ti3);
        ib9 ib9 = new ib9();
        ib9.setAlpha(127);
        view.setBackground(ib9);
        v3c.y(new a27(this, (Continuation) null, 1), view);
        constraintLayout.addView(view);
        cla cla = new cla(constraintLayout.getContext(), 6);
        cla.setId(hwb.oneme_login_input_toolbar);
        ti3 ti32 = new ti3(-1, -2);
        ti32.i = 0;
        ti32.t = 0;
        ti32.v = 0;
        cla.setLayoutParams(ti32);
        cla.setForm(uka.a);
        cla.setRightActions(new pka((yka) null, new wka(yfa.z, wfa.Q, new ga(cla, 16, this), 6)));
        ((x6a) this.C0.getValue()).getClass();
        br7.d(cla, new x27(3, (yq0) null, 2), (m56) null);
        constraintLayout.addView(cla);
        vf7 vf7 = new vf7(constraintLayout.getContext());
        vf7.setId(hwb.oneme_login_input_logo);
        ti3 ti33 = new ti3(-1, 0);
        ti33.i = 0;
        ti33.t = 0;
        ti33.v = 0;
        ti33.l = hwb.oneme_login_input_toolbar;
        vf7.setLayoutParams(ti33);
        br7.d(vf7, new x27(3, (yq0) null, 2), (m56) null);
        constraintLayout.addView(vf7);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(hwb.oneme_login_input_title);
        i4f.c.b(textView, du4.b);
        textView.setText(v0c.oneme_login_input_title);
        ti3 ti34 = new ti3(0, -2);
        float f = (float) 28;
        float f2 = (float) 24;
        ti34.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti34.j = hwb.oneme_login_input_toolbar;
        ti34.t = 0;
        ti34.v = 0;
        textView.setGravity(17);
        textView.setLayoutParams(ti34);
        v3c.y(new v9(3, (Continuation) null, 15), textView);
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(hwb.oneme_login_input_description);
        i4f.m.b(textView2, du4.b);
        textView2.setText(v0c.oneme_login_input_description);
        ti3 ti35 = new ti3(0, -2);
        float f3 = (float) 12;
        ti35.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        ti35.j = hwb.oneme_login_input_title;
        ti35.t = 0;
        ti35.v = 0;
        textView2.setGravity(17);
        textView2.setLayoutParams(ti35);
        v3c.y(new v9(3, (Continuation) null, 14), textView2);
        constraintLayout.addView(textView2);
        lea lea = new lea(constraintLayout.getContext());
        lea.setId(hwb.oneme_login_input_phone_number_input);
        ti3 ti36 = new ti3(0, -2);
        ti36.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        ti36.j = hwb.oneme_login_input_description;
        ti36.t = 0;
        ti36.v = 0;
        lea.setLayoutParams(ti36);
        lea.setPhoneFormatterProvider(new d74(this, 16, lea));
        lea.setOnCountryViewClickListener(new y17(this, 1));
        constraintLayout.addView(lea);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(hwb.oneme_login_input_continue_button);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        ti3 ti37 = new ti3(0, -2);
        float f4 = (float) 16;
        ti37.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4));
        ti37.j = hwb.oneme_login_input_phone_number_input;
        ti37.k = hwb.oneme_login_input_help_button;
        ti37.t = 0;
        ti37.v = 0;
        ti37.F = 1.0f;
        oneMeButton.setLayoutParams(ti37);
        oneMeButton.setText(v0c.oneme_login_input_continue);
        constraintLayout.addView(oneMeButton);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(hwb.oneme_login_input_help_button);
        textView3.setGravity(1);
        ti3 ti38 = new ti3(-1, -2);
        ti38.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(f4 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        ti38.l = 0;
        ti38.t = 0;
        ti38.v = 0;
        textView3.setLayoutParams(ti38);
        i4f.p.b(textView3, du4.b);
        v3c.y(new c3(this, (Continuation) null, 13), textView3);
        constraintLayout.addView(textView3);
        scrollView.addView(constraintLayout);
        return scrollView;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.x0 = null;
        lea p0 = p0();
        p0.w0.removeTextChangedListener(this.z0);
        this.z0 = null;
    }

    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        qp4.u0.b(view.getContext()).i().b();
        window.setStatusBarColor(0);
    }

    public final void onViewCreated(View view) {
        bc7[] bc7Arr = E0;
        Drawable background = ((View) this.t0.T0(this, bc7Arr[2])).getBackground();
        ib9 ib9 = background instanceof ib9 ? (ib9) background : null;
        if (ib9 != null) {
            ib9.start();
        }
        ((TextView) this.w0.T0(this, bc7Arr[5])).setMovementMethod(LinkMovementMethod.getInstance());
        lea p0 = p0();
        boolean z = false;
        bc7 bc7 = bc7Arr[0];
        fs fsVar = this.X;
        p0.setText((String) fsVar.a(this));
        OneMeButton o0 = o0();
        bc7 bc72 = bc7Arr[0];
        if (((String) fsVar.a(this)).length() > 0) {
            z = true;
        }
        o0.setEnabled(z);
        tu0.K(o0(), 300, new xx5(4, this));
        p0().w0.addTextChangedListener(this.D0);
        od2.L(new zn5(q0().Y, new z17((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(q0().t0, new d27((Continuation) null, this), 5), getViewLifecycleScope());
        mn5 mn5 = q0().z0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(mn5, getViewLifecycleOwner().Q(), fg7), new b27((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().s0, getViewLifecycleOwner().Q(), fg7), new c27((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().x0, getViewLifecycleOwner().Q(), fg7), new f27((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final lea p0() {
        return (lea) this.v0.T0(this, E0[4]);
    }

    public final q27 q0() {
        return (q27) this.o.getValue();
    }
}
