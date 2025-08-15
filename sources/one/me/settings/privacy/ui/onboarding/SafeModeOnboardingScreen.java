package one.me.settings.privacy.ui.onboarding;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/onboarding/SafeModeOnboardingScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SafeModeOnboardingScreen extends Widget {
    public static final /* synthetic */ int c = 0;
    public final x27 a = x27.d;
    public final glc b = new glc(wuc.SETTINGS_PRIVACY_SAFE_MODE);

    public SafeModeOnboardingScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        x27 x27 = x27.c;
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final bvc getScreenDelegate() {
        return this.b;
    }

    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        constraintLayout.setId(kxb.oneme_settings_privacy_onboarding_root);
        pq9 pq9 = qp4.u0;
        constraintLayout.setBackgroundColor(pq9.j(constraintLayout).b().k);
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        constraintLayout.setClipToOutline(false);
        cla cla = new cla(constraintLayout.getContext(), 6);
        cla.setId(kxb.oneme_settings_privacy_onboarding_toolbar);
        cla.setForm(uka.a);
        cla.setBackgroundColor(0);
        cla.setLayoutParams(new ti3(-1, -2));
        cla.setTranslationZ(1000.0f);
        cla.setLeftActions(new kka(new rpc(1, this)));
        constraintLayout.addView(cla);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(kxb.oneme_settings_privacy_onboarding_scroll_view);
        scrollView.setLayoutParams(new ti3(-1, -2));
        Context context = scrollView.getContext();
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(kxb.oneme_settings_privacy_onboarding_content);
        constraintLayout2.setClipChildren(false);
        constraintLayout2.setClipToPadding(false);
        constraintLayout2.setClipToOutline(false);
        Guideline guideline = new Guideline(context);
        guideline.setId(kxb.oneme_settings_privacy_onboarding_top_guideline);
        ti3 ti3 = new ti3(0, 0);
        ti3.a = tu0.G(((float) 60) * fk4.d().getDisplayMetrics().density);
        ti3.V = 0;
        guideline.setLayoutParams(ti3);
        constraintLayout2.addView(guideline);
        View view = new View(context);
        view.setId(kxb.oneme_settings_privacy_onboarding_lock_background);
        ti3 ti32 = new ti3(0, 0);
        ti32.topMargin = ((ti3) guideline.getLayoutParams()).a;
        view.setLayoutParams(ti32);
        constraintLayout2.setClipToPadding(false);
        view.setClipToOutline(false);
        kmd kmd = new kmd(context);
        kmd.c(false);
        view.setBackground(kmd);
        constraintLayout2.addView(view);
        ImageView imageView = new ImageView(context);
        imageView.setId(kxb.oneme_settings_privacy_onboarding_lock);
        imageView.setLayoutParams(new ti3(0, 0));
        imageView.setImageResource(nub.oneme_settings_privacy_big_lock);
        constraintLayout2.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(kxb.oneme_settings_privacy_onboarding_content_title);
        ti3 ti33 = new ti3(-2, -2);
        float f = (float) 32;
        ti33.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti33.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        textView.setLayoutParams(ti33);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        i4f.c.b(textView, du4.b);
        textView.setTextColor(pq9.j(textView).getText().e);
        textView.setText(p1c.oneme_settings_privacy_screen_safe_mode);
        constraintLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setId(kxb.oneme_settings_privacy_onboarding_content_subtitle);
        ti3 ti34 = new ti3(-2, -2);
        ti34.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti34.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        textView2.setLayoutParams(ti34);
        textView2.setMaxLines(2);
        textView2.setTextAlignment(4);
        i4f.n.b(textView2, du4.b);
        textView2.setTextColor(pq9.j(textView2).getText().g);
        textView2.setText(p1c.oneme_settings_privacy_onboarding_content_subtitle);
        constraintLayout2.addView(textView2);
        ufd ufd = new ufd(context, (AttributeSet) null);
        ufd.setId(kxb.oneme_settings_privacy_onboarding_item_1);
        ufd.setStartIcon(gpc.l);
        ufd.setTitle((CharSequence) z7.B(ufd.getContext(), p1c.oneme_settings_privacy_onboarding_item_1_title));
        ufd.setDescription((CharSequence) z7.B(ufd.getContext(), p1c.oneme_settings_privacy_onboarding_item_1_subtitle));
        ufd.onThemeChanged(pq9.b(context).i());
        constraintLayout2.addView(ufd);
        ufd ufd2 = new ufd(context, (AttributeSet) null);
        ufd2.setId(kxb.oneme_settings_privacy_onboarding_item_2);
        ufd2.setStartIcon(gpc.i);
        ufd2.setTitle((CharSequence) z7.B(ufd2.getContext(), p1c.oneme_settings_privacy_onboarding_item_2_title));
        ufd2.setDescription((CharSequence) z7.B(ufd2.getContext(), p1c.oneme_settings_privacy_onboarding_item_2_subtitle));
        ufd2.onThemeChanged(pq9.b(context).i());
        constraintLayout2.addView(ufd2);
        ufd ufd3 = new ufd(context, (AttributeSet) null);
        ufd3.setId(kxb.oneme_settings_privacy_onboarding_item_3);
        ufd3.setStartIcon(gpc.Z);
        cla cla2 = cla;
        ufd3.setTitle((CharSequence) z7.B(ufd3.getContext(), p1c.oneme_settings_privacy_onboarding_item_3_title));
        ufd3.setDescription((CharSequence) z7.B(ufd3.getContext(), p1c.oneme_settings_privacy_onboarding_item_3_subtitle));
        ufd3.onThemeChanged(pq9.b(context).i());
        constraintLayout2.addView(ufd3);
        dj3 q = fp3.q(constraintLayout2);
        int id = view.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        float f2 = (float) HttpStatus.SC_MULTIPLE_CHOICES;
        ConstraintLayout constraintLayout3 = constraintLayout;
        q.g(id).d.Z = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        q.g(id).d.a0 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        q.g(id).d.y = "1:1";
        int id2 = imageView.getId();
        q.d(id2, 3, guideline.getId(), 3);
        q.d(id2, 6, view.getId(), 6);
        q.d(id2, 7, view.getId(), 7);
        q.d(id2, 4, view.getId(), 4);
        q.g(id2).d.Z = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        q.g(id2).d.a0 = tu0.G(((float) 212) * fk4.d().getDisplayMetrics().density);
        int id3 = textView.getId();
        q.d(id3, 3, view.getId(), 4);
        q.d(id3, 6, 0, 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id3, 4));
        q.d(id3, 7, 0, 7);
        new l2a(q, 7, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id4 = textView2.getId();
        q.d(id4, 3, textView.getId(), 4);
        q.d(id4, 6, 0, 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id4, 4));
        q.d(id4, 7, 0, 7);
        new l2a(q, 7, id4, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        int id5 = ufd.getId();
        q.d(id5, 3, textView2.getId(), 4);
        au1.p((float) 36, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id5, 4));
        q.d(id5, 6, 0, 6);
        float f3 = (float) 12;
        new l2a(q, 6, id5, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        q.d(id5, 7, 0, 7);
        new l2a(q, 7, id5, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id6 = ufd2.getId();
        q.d(id6, 3, ufd.getId(), 4);
        float f4 = (float) 4;
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id6, 4));
        q.d(id6, 6, 0, 6);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id6, 4));
        q.d(id6, 7, 0, 7);
        new l2a(q, 7, id6, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id7 = ufd3.getId();
        q.d(id7, 3, ufd2.getId(), 4);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id7, 4));
        q.d(id7, 6, 0, 6);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id7, 4));
        q.d(id7, 7, 0, 7);
        new l2a(q, 7, id7, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        q.a(constraintLayout2);
        scrollView.addView(constraintLayout2);
        ConstraintLayout constraintLayout4 = constraintLayout3;
        constraintLayout4.addView(scrollView);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout4.getContext(), (AttributeSet) null);
        oneMeButton.setId(kxb.oneme_settings_privacy_onboarding_set_pin_code_button);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(p1c.oneme_settings_privacy_onboarding_set_pin_code);
        oneMeButton.setLayoutParams(new ti3(0, -2));
        tu0.K(oneMeButton, 300, new y20(7));
        constraintLayout4.addView(oneMeButton);
        dj3 q2 = fp3.q(constraintLayout4);
        int id8 = cla2.getId();
        q2.d(id8, 3, 0, 3);
        q2.d(id8, 6, 0, 6);
        q2.d(id8, 7, 0, 7);
        int id9 = scrollView.getId();
        q2.d(id9, 3, 0, 3);
        q2.d(id9, 6, 0, 6);
        q2.d(id9, 7, 0, 7);
        int id10 = oneMeButton.getId();
        q2.d(id10, 6, 0, 6);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q2, 6, id10, 4));
        q2.d(id10, 7, 0, 7);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q2, 7, id10, 4));
        q2.d(id10, 4, 0, 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q2, 4, id10, 4));
        q2.g(id10).d.Z = tu0.G(((float) 336) * fk4.d().getDisplayMetrics().density);
        q2.a(constraintLayout4);
        return constraintLayout4;
    }

    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        qp4.u0.b(view.getContext()).i().b();
        window.setStatusBarColor(0);
    }

    public final void onViewCreated(View view) {
        v3c.y(new r1b((Object) view, (Continuation) null, 9), view);
    }
}
