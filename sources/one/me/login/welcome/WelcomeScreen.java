package one.me.login.welcome;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
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
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/welcome/WelcomeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class WelcomeScreen extends Widget {
    public static final /* synthetic */ bc7[] s0;
    public final je7 X;
    public final je7 Y;
    public final fka Z;
    public final x27 a = new x27(0, new yq0(3, 1, false), 1);
    public final glc b = new glc(new bse(25), (k56) null, 6);
    public final je7 c;
    public final q7c o;

    static {
        Class<WelcomeScreen> cls = WelcomeScreen.class;
        s0 = new bc7[]{new hob(cls, "imageView", "getImageView()Landroid/widget/ImageView;", 0), zr6.e(nec.a, cls, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    }

    public WelcomeScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        m82getSharedViewModelcp94BC8("LoginScope", iu7.class, (k56) null);
        this.c = iyc.m;
        viewBinding(hwb.oneme_login_welcome_placeholder);
        this.o = viewBinding(hwb.oneme_login_welcome_terms);
        this.X = tu0.r(3, new rzd(16, this));
        this.Y = tu0.r(3, new bse(26));
        this.Z = qp4.u0.o(getContext()).c;
    }

    public static final void m0(WelcomeScreen welcomeScreen, String str) {
        welcomeScreen.getClass();
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        try {
            welcomeScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            hm9.p("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", (Throwable) null);
            wha wha = new wha((Widget) welcomeScreen);
            wha.h(welcomeScreen.getContext().getString(jpc.F1));
            wha.i();
        }
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final bvc getScreenDelegate() {
        return this.b;
    }

    public final void n0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan) {
        int A0 = w9e.A0(str, str2, 0, false, 6);
        int length = str2.length() + A0;
        spannableString.setSpan(clickableSpan, A0, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(this.Z.getText().e), A0, length, 33);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        djd djd = new djd(constraintLayout.getContext());
        ti3 ti3 = new ti3(-1, -1);
        ti3.i = 0;
        ti3.t = 0;
        ti3.v = 0;
        ti3.l = 0;
        djd.setLayoutParams(ti3);
        constraintLayout.addView(djd);
        View view = new View(constraintLayout.getContext());
        view.setId(hwb.oneme_login_welcome_toolbar);
        ti3 ti32 = new ti3(0, tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density));
        ti32.i = 0;
        ti32.t = 0;
        ti32.v = 0;
        view.setLayoutParams(ti32);
        br7.e(view);
        constraintLayout.addView(view);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(hwb.oneme_login_welcome_title);
        ti3 ti33 = new ti3(-2, -2);
        float f = (float) 16;
        ti33.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti33.j = hwb.oneme_login_welcome_toolbar;
        ti33.t = 0;
        ti33.v = 0;
        ti33.k = hwb.oneme_login_welcome_description;
        ti33.K = 2;
        textView.setLayoutParams(ti33);
        textView.setGravity(17);
        fka fka = this.Z;
        textView.setTextColor(fka.getText().e);
        i4f.x.b(textView, du4.b);
        textView.setText(v0c.oneme_login_welcome_title);
        je7 je7 = this.Y;
        ((x6a) je7.getValue()).getClass();
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(hwb.oneme_login_welcome_description);
        ti3 ti34 = new ti3(-2, -2);
        float f2 = (float) 12;
        ti34.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti34.j = hwb.oneme_login_welcome_title;
        ti34.t = 0;
        ti34.v = 0;
        ti34.k = hwb.oneme_login_welcome_placeholder;
        textView2.setLayoutParams(ti34);
        textView2.setTextColor(fka.getText().h);
        i4f.m.b(textView2, du4.b);
        textView2.setText(v0c.oneme_login_welcome_description);
        ((x6a) je7.getValue()).getClass();
        constraintLayout.addView(textView2);
        ld6 ld6 = new ld6(constraintLayout.getContext());
        ld6.setId(hwb.oneme_login_welcome_placeholder);
        float f3 = (float) 234;
        ti3 ti35 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        ti35.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti35.j = hwb.oneme_login_welcome_title;
        ti35.k = hwb.oneme_login_welcome_continue_btn;
        ti35.t = 0;
        ti35.v = 0;
        ld6.setLayoutParams(ti35);
        ld6.setImageDrawable(kt3.b(getContext(), eub.welcome_logo));
        ((x6a) je7.getValue()).getClass();
        constraintLayout.addView(ld6);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(hwb.oneme_login_welcome_continue_btn);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(v0c.oneme_login_welcome_continue_btn);
        ti3 ti36 = new ti3(0, -2);
        ti36.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti36.k = hwb.oneme_login_welcome_terms;
        ti36.t = 0;
        ti36.v = 0;
        oneMeButton.setLayoutParams(ti36);
        tu0.K(oneMeButton, 300, new elb(18, (Object) this));
        oneMeButton.setCustomTheme(fka);
        constraintLayout.addView(oneMeButton);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(hwb.oneme_login_welcome_terms);
        textView3.setGravity(1);
        ti3 ti37 = new ti3(-1, -2);
        ti37.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        ti37.l = 0;
        ti37.t = 0;
        ti37.v = 0;
        textView3.setLayoutParams(ti37);
        i4f.p.b(textView3, du4.b);
        textView3.setTextColor(fka.getText().g);
        constraintLayout.addView(textView3);
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bc7[] bc7Arr = s0;
        bc7 bc7 = bc7Arr[1];
        q7c q7c = this.o;
        String B = z7.B(getContext(), v0c.oneme_login_welcome_terms);
        String B2 = z7.B(getContext(), v0c.oneme_login_welcome_privacy_policy_clickable_part);
        String B3 = z7.B(getContext(), v0c.oneme_login_welcome_user_agreement_clickable_part);
        SpannableString spannableString = new SpannableString(B);
        n0(B, B2, spannableString, new x4g(this, 0));
        n0(B, B3, spannableString, new x4g(this, 1));
        ((TextView) q7c.T0(this, bc7)).setText(spannableString);
        ((TextView) q7c.T0(this, bc7Arr[1])).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
