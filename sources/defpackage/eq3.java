package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: eq3  reason: default package */
public final class eq3 extends LinearLayout implements hk7, i33 {
    public dq3 a;
    public final j33 b;
    public final kk7 c = new kk7(this, new md1(27, this), 4);
    public final TextView o;
    public final p85 s0;

    public eq3(Context context) {
        super(context, (AttributeSet) null);
        this.b = new j33(context, this);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.p.b(textView, du4.b);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        v3c.y(new v9(3, (Continuation) null, 10), textView);
        textView.setGravity(8388627);
        textView.setSingleLine(true);
        this.o = textView;
        p85 p85 = new p85(context);
        p85.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(16);
        p85.setTypography(i4f.H);
        p85.setCollapsedLines(5);
        p85.setExpandWithAnimation(true);
        p85.setOnTouchListener(new rf1(p85, 1, this));
        this.s0 = p85;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = (float) 12;
        float f2 = (float) 8;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        addView(textView);
        addView(p85);
        ViewGroup.LayoutParams layoutParams = p85.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
            p85.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void b(String str, lk7 lk7, ClickableSpan clickableSpan) {
        dq3 dq3 = this.a;
        if (dq3 != null) {
            ((gaa) ((ey1) dq3).b).G(str, lk7);
        }
    }

    public final boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7, MotionEvent motionEvent) {
        dq3 dq3 = this.a;
        if (dq3 == null) {
            return false;
        }
        ((gaa) ((ey1) dq3).b).H(str, lk7, motionEvent);
        return true;
    }

    public final dq3 getListener() {
        return this.a;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SpannableString text = this.s0.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        if (text != null) {
            this.c.c(text);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpannableString text = this.s0.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        if (text != null) {
            this.c.getClass();
            kk7.a(text);
        }
    }

    public final void setDescription(CharSequence charSequence) {
        p85 p85 = this.s0;
        SpannableString text = p85.getText();
        SpannableString spannableString = null;
        if (!(text instanceof Spannable)) {
            text = null;
        }
        kk7 kk7 = this.c;
        if (text != null) {
            kk7.getClass();
            kk7.a(text);
        }
        p85.setText(kk7.getTransformation(charSequence, p85));
        SpannableString text2 = p85.getText();
        if (text2 instanceof Spannable) {
            spannableString = text2;
        }
        if (spannableString != null) {
            kk7.c(spannableString);
        }
    }

    public final void setListener(dq3 dq3) {
        this.a = dq3;
    }

    public final void setTitle(CharSequence charSequence) {
        this.o.setText(charSequence);
    }
}
