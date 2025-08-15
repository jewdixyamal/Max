package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: lea  reason: default package */
public final class lea extends LinearLayout implements kre {
    public kea a;
    public m56 b;
    public eaa c;
    public final qec o = new qec("^[+\\d][\\d\\s\\u00A0-]*$");
    public boolean s0;
    public final AppCompatImageView t0;
    public final AppCompatTextView u0;
    public final AppCompatImageView v0;
    public final EditText w0;
    public z2 x0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lea(android.content.Context r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 4
            r3 = 0
            r4 = 1
            r5 = 0
            r0.<init>(r1, r5)
            qec r6 = new qec
            java.lang.String r7 = "^[+\\d][\\d\\s\\u00A0-]*$"
            r6.<init>((java.lang.String) r7)
            r0.o = r6
            jea r6 = new jea
            r6.<init>(r0)
            android.text.InputFilter[] r7 = new android.text.InputFilter[r4]
            r7[r3] = r6
            androidx.appcompat.widget.AppCompatImageView r6 = new androidx.appcompat.widget.AppCompatImageView
            r6.<init>(r1, r5)
            int r8 = android.view.View.generateViewId()
            r6.setId(r8)
            r0.t0 = r6
            androidx.appcompat.widget.AppCompatTextView r8 = new androidx.appcompat.widget.AppCompatTextView
            r8.<init>(r1, r5)
            int r9 = defpackage.xoc.P
            r8.setId(r9)
            kqe r9 = defpackage.i4f.l
            r9.b(r8, defpackage.du4.b)
            float r10 = (float) r2
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = defpackage.tu0.G(r11)
            float r12 = (float) r3
            android.content.res.Resources r13 = defpackage.fk4.d()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r12
            int r13 = defpackage.tu0.G(r13)
            android.content.res.Resources r14 = defpackage.fk4.d()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r10 = r10 * r14
            int r10 = defpackage.tu0.G(r10)
            android.content.res.Resources r14 = defpackage.fk4.d()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r12 = r12 * r14
            int r12 = defpackage.tu0.G(r12)
            r8.setPadding(r11, r13, r10, r12)
            r0.u0 = r8
            androidx.appcompat.widget.AppCompatImageView r10 = new androidx.appcompat.widget.AppCompatImageView
            r10.<init>(r1, r5)
            int r11 = android.view.View.generateViewId()
            r10.setId(r11)
            int r11 = defpackage.woc.Y
            r10.setImageResource(r11)
            r0.v0 = r10
            hra r11 = new hra
            wz7 r12 = new wz7
            r13 = 13
            r12.<init>(r13, r0)
            r11.<init>(r1, r12)
            android.widget.EditText r12 = new android.widget.EditText
            r12.<init>(r1)
            int r1 = defpackage.xoc.Q
            r12.setId(r1)
            r12.setPadding(r3, r3, r3, r3)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r14 = -2
            r1.<init>(r13, r14)
            r15 = 8
            float r15 = (float) r15
            android.content.res.Resources r16 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r16.getDisplayMetrics()
            float r2 = r2.density
            float r15 = r15 * r2
            int r2 = defpackage.tu0.G(r15)
            r1.setMargins(r2, r3, r3, r3)
            r12.setLayoutParams(r1)
            r9.b(r12, defpackage.du4.b)
            java.lang.String r1 = "phone"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r12.setAutofillHints(r1)
            r12.setBackground(r5)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r3)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            double r13 = (double) r2
            r15 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r13 = r13 * r15
            int r2 = defpackage.tu0.F(r13)
            int r9 = r12.getLineHeight()
            r1.setSize(r2, r9)
            r12.setTextCursorDrawable(r1)
            r12.setFilters(r7)
            java.lang.String r1 = "0123456789 -()"
            android.text.method.DigitsKeyListener r1 = android.text.method.DigitsKeyListener.getInstance(r1)
            r12.setKeyListener(r1)
            r12.setImportantForAutofill(r4)
            r1 = 3
            r12.setInputType(r1)
            r12.setSingleLine(r4)
            r12.setSaveEnabled(r3)
            r12.setFocusable(r4)
            r12.setFocusableInTouchMode(r4)
            r12.setCustomSelectionActionModeCallback(r11)
            r12.setCustomInsertionActionModeCallback(r11)
            e33 r1 = new e33
            r2 = 2
            r1.<init>(r2, r0)
            r12.setOnFocusChangeListener(r1)
            b09 r1 = new b09
            r1.<init>(r4, r0)
            r12.setOnKeyListener(r1)
            r0.w0 = r12
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r5 = -2
            r1.<init>(r2, r5)
            r0.setLayoutParams(r1)
            r1 = 16
            r0.setGravity(r1)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = defpackage.tu0.G(r1)
            int r5 = r17.getPaddingTop()
            int r7 = r17.getPaddingBottom()
            r0.setPadding(r2, r5, r1, r7)
            r0.setOrientation(r3)
            r1 = 52
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.tu0.G(r1)
            r0.setMinimumHeight(r1)
            r0.setClipToOutline(r4)
            ix3 r1 = new ix3
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r3
            r1.<init>(r2)
            r0.setOutlineProvider(r1)
            r0.addView(r6)
            r0.addView(r8)
            r0.addView(r10)
            r0.addView(r12)
            pq9 r1 = defpackage.qp4.u0
            fka r1 = r1.j(r0)
            r0.onThemeChanged(r1)
            z2 r1 = new z2
            r2 = 4
            r1.<init>(r2, r0)
            r12.addTextChangedListener(r1)
            r0.x0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lea.<init>(android.content.Context):void");
    }

    public final String getCode() {
        return String.valueOf(this.u0.getText());
    }

    public final m56 getOnWindowFocusChanged() {
        return this.b;
    }

    public final String getPhone() {
        CharSequence text = this.u0.getText();
        Editable text2 = this.w0.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(text2);
        return sb.toString();
    }

    public final kea getPhoneFormatterProvider() {
        return this.a;
    }

    public final String getPhoneWithoutCode() {
        return String.valueOf(this.w0.getText());
    }

    public final void onDetachedFromWindow() {
        this.w0.removeTextChangedListener(this.x0);
        this.x0 = null;
        this.a = null;
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(fka fka) {
        setBackgroundColor(fka.b().a.g);
        EditText editText = this.w0;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(fka.getText().j));
        }
        editText.setTextColor(fka.getText().e);
        editText.setHintTextColor(fka.getText().g);
        this.v0.setImageTintList(ColorStateList.valueOf(fka.getIcon().j));
        this.u0.setTextColor(fka.getText().e);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m56 m56 = this.b;
        if (m56 != null) {
            m56.invoke(Boolean.valueOf(z));
        }
    }

    public final void setCountry(eaa eaa) {
        Drawable drawable;
        this.c = eaa;
        AppCompatImageView appCompatImageView = this.t0;
        Integer num = eaa.o;
        if (num != null) {
            drawable = kt3.b(getContext(), num.intValue());
        } else {
            drawable = null;
        }
        appCompatImageView.setImageDrawable(drawable);
        AppCompatTextView appCompatTextView = this.u0;
        appCompatTextView.setText("+" + eaa.b);
    }

    public final void setHint(CharSequence charSequence) {
        this.w0.setHint(charSequence);
    }

    public final void setOnCountryViewClickListener(k56 k56) {
        m6 m6Var = new m6(16, k56);
        this.t0.setOnClickListener(m6Var);
        this.u0.setOnClickListener(m6Var);
        this.v0.setOnClickListener(m6Var);
    }

    public final void setOnWindowFocusChanged(m56 m56) {
        this.b = m56;
    }

    public final void setPhoneFormatterProvider(kea kea) {
        this.a = kea;
    }

    public final void setText(CharSequence charSequence) {
        EditText editText = this.w0;
        editText.setText(charSequence, TextView.BufferType.NORMAL);
        try {
            editText.setSelection(charSequence.length());
        } catch (IndexOutOfBoundsException e) {
            hm9.p(lea.class.getName(), e.toString(), e);
        }
    }
}
