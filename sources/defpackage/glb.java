package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: glb  reason: default package */
public final class glb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public glb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((glb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        glb glb = new glb(continuation, this.Y);
        glb.X = obj;
        return glb;
    }

    public final Object o(Object obj) {
        ProfileScreen profileScreen;
        boolean z;
        od2.a0(obj);
        tab tab = (tab) this.X;
        bc7[] bc7Arr = ProfileScreen.D0;
        ProfileScreen profileScreen2 = this.Y;
        CharSequence charSequence = null;
        profileScreen2.p0().setRightActions(tab.b ? new pka((yka) null, new vka(yfa.f, new c01(9, profileScreen2))) : nka.a);
        bc7[] bc7Arr2 = ProfileScreen.D0;
        s5a s5a = (s5a) profileScreen2.t0.T0(profileScreen2, bc7Arr2[4]);
        s5a.setCustomOverlay(tab.g);
        Long l = new Long(tab.a);
        CharSequence charSequence2 = "";
        CharSequence charSequence3 = tab.f;
        if (charSequence3 == null) {
            charSequence3 = charSequence2;
        }
        s5a.g(oag.a(charSequence3, l), true);
        s5a.setAvatarUrls(tab.c);
        s5a.setAlpha(tab.j ? 0.4f : 1.0f);
        tu0.K(s5a, 300, new e0d(11, profileScreen2));
        int i = 8;
        AppCompatTextView appCompatTextView = (AppCompatTextView) profileScreen2.x0.T0(profileScreen2, bc7Arr2[8]);
        jqe jqe = tab.h;
        CharSequence b = jqe != null ? jqe.b(profileScreen2.getContext()) : null;
        boolean z2 = !(b == null || b.length() == 0);
        jqe jqe2 = tab.i;
        if (z2) {
            CharSequence b2 = jqe2 != null ? jqe2.b(profileScreen2.getContext()) : null;
            if (!(b2 == null || b2.length() == 0)) {
                i = 0;
            }
        }
        appCompatTextView.setVisibility(i);
        CharSequence b3 = jqe2 != null ? jqe2.b(profileScreen2.getContext()) : null;
        if (!(b3 == null || b3.length() == 0)) {
            ((AppCompatTextView) profileScreen2.w0.T0(profileScreen2, bc7Arr2[7])).setText(b3);
        }
        TextView textView = (TextView) profileScreen2.v0.T0(profileScreen2, bc7Arr2[6]);
        if (jqe != null) {
            charSequence = jqe.b(profileScreen2.getContext());
        }
        textView.setText(charSequence);
        cla p0 = profileScreen2.p0();
        CharSequence charSequence4 = tab.e;
        p0.setTitle(charSequence4 == null ? charSequence2 : charSequence4);
        TextView o0 = profileScreen2.o0();
        boolean z3 = tab.k;
        if (!z3) {
            profileScreen = profileScreen2;
            z = z3;
        } else {
            int D = br7.D(profileScreen2.getContext());
            ViewGroup.LayoutParams layoutParams = profileScreen2.o0().getLayoutParams();
            int marginStart = D - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = profileScreen2.o0().getLayoutParams();
            int marginEnd = marginStart - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
            Context context = profileScreen2.getContext();
            TextPaint paint = profileScreen2.o0().getPaint();
            ww9 ww9 = new ww9(22);
            if (charSequence4 == null || charSequence4.length() == 0) {
                profileScreen = profileScreen2;
                z = z3;
                if (charSequence4 != null) {
                    charSequence2 = charSequence4;
                }
                charSequence4 = charSequence2;
            } else {
                int I = i24.I(paint.getTextSize() / context.getResources().getDisplayMetrics().density);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence4);
                spannableStringBuilder.append(8288);
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(new fcf(context, I, false, ww9), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(spannableStringBuilder);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), paint, marginEnd);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout build = obtain.setAlignment(alignment).setIncludePad(false).build();
                int min = Math.min(build.getLineCount() - 1, 2);
                CharSequence subSequence = build.getText().subSequence(build.getLineStart(0), build.getLineEnd(min));
                if (tpa.f(subSequence, spannableString)) {
                    profileScreen = profileScreen2;
                    z = z3;
                    charSequence4 = spannableString;
                } else {
                    z = z3;
                    profileScreen = profileScreen2;
                    StaticLayout build2 = StaticLayout.Builder.obtain(spannableString, build.getLineStart(min), build.getLineEnd(min), paint, rh4.q((float) h4f.f(I), fk4.d().getDisplayMetrics().density, rh4.q((float) h4f.i(I), fk4.d().getDisplayMetrics().density, marginEnd))).setAlignment(alignment).setIncludePad(false).build();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(w9e.M0(subSequence, build.getLineStart(min), build.getLineEnd(min), build2.getText().subSequence(build2.getLineStart(0), build2.getLineEnd(0) - 3)));
                    spannableStringBuilder2.append(8288);
                    spannableStringBuilder2.append("...");
                    spannableStringBuilder2.append(8288);
                    spannableStringBuilder2.append(" ");
                    spannableStringBuilder2.setSpan(new fcf(context, I, false, ww9), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    charSequence4 = new SpannableString(spannableStringBuilder2);
                }
            }
        }
        o0.setText(charSequence4);
        ProfileScreen.m0(profileScreen, profileScreen.p0(), z);
        return e5f.a;
    }
}
