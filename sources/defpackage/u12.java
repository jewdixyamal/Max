package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: u12  reason: default package */
public final class u12 extends LinearLayout implements kre {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final TextView c;
    public final OneMeButton o;

    public u12(ForgotPinCodeDialog forgotPinCodeDialog, Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        i4f.d.b(textView, du4.b);
        textView.setGravity(1);
        textView.setText(p1c.oneme_settings_privacy_forgot_pin_code);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        i4f.m.b(textView2, du4.b);
        textView2.setText(p1c.oneme_settings_privacy_forgot_pin_code_write_support);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(jpc.w3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        tu0.K(oneMeButton, 300, new xx5(1, forgotPinCodeDialog));
        addView(oneMeButton);
        this.o = oneMeButton;
        onThemeChanged(qp4.u0.j(this));
    }

    public final void onThemeChanged(fka fka) {
        switch (this.a) {
            case 0:
                this.b.setTextColor(fka.getText().e);
                this.c.setTextColor(fka.getText().g);
                this.o.onThemeChanged(fka);
                return;
            default:
                this.b.setTextColor(fka.getText().e);
                this.c.setTextColor(fka.getText().g);
                this.o.onThemeChanged(fka);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u12(ChangeDisabledDialog changeDisabledDialog, Context context) {
        super(context);
        pq9 pq9;
        int i = 0;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        i4f.d.b(textView, du4.b);
        textView.setGravity(1);
        textView.setText(p1c.oneme_settings_privacy_change_disabled_title);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        i4f.m.b(textView2, du4.b);
        int i2 = ChangeDisabledDialog.y0;
        SpannableString valueOf = SpannableString.valueOf(changeDisabledDialog.getContext().getText(p1c.oneme_settings_privacy_change_disabled_description));
        URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
        qyc qyc = (qyc) ((y7d) ehd.a.getAccessor().d(y7d.class).getValue());
        qyc.getClass();
        String s = qyc.s(PmsKey.f121supportaccount, "max.ru/support");
        int length = uRLSpanArr.length;
        while (true) {
            pq9 = qp4.u0;
            if (i >= length) {
                break;
            }
            URLSpan uRLSpan = uRLSpanArr[i];
            int spanStart = valueOf.getSpanStart(uRLSpan);
            int spanEnd = valueOf.getSpanEnd(uRLSpan);
            if (spanStart >= 0 && spanStart < spanEnd) {
                valueOf.removeSpan(uRLSpan);
                xoe text = pq9.j(textView2).getText();
                v02 v02 = new v02(2, changeDisabledDialog);
                ek7 ek7 = new ek7(s, text.j);
                ek7.c = v02;
                ft.B(valueOf, ek7, spanStart, spanEnd);
                break;
            }
            i++;
        }
        textView2.setText(valueOf);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(jpc.k0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        tu0.K(oneMeButton, 300, new c5(15, (Object) changeDisabledDialog));
        addView(oneMeButton);
        this.o = oneMeButton;
        onThemeChanged(pq9.j(this));
    }
}
