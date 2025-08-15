package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: cka  reason: default package */
public final class cka extends LinearLayout implements kre {
    public static final /* synthetic */ bc7[] x0;
    public final EditText a;
    public final bka b = new bka(this, 0);
    public final bka c = new bka(this);
    public final bka o = new bka(new InputFilter[0], this, 2);
    public final bka s0 = new bka(Integer.valueOf(wfa.W), this, 3);
    public final bka t0 = new bka(Integer.valueOf(wfa.X), this, 4);
    public final bka u0 = new bka(this, 5);
    public final je7 v0;
    public final je7 w0;

    static {
        Class<cka> cls = cka.class;
        x0 = new bc7[]{new oi9(cls, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;"), rh4.g(nec.a, cls, "hint", "getHint()Ljava/lang/String;"), new oi9(cls, "filters", "getFilters()[Landroid/text/InputFilter;"), new oi9(cls, "textColorAttr", "getTextColorAttr()I"), new oi9(cls, "hintColorAttr", "getHintColorAttr()I"), new oi9(cls, "currentPlaceholderType", "getCurrentPlaceholderType()Lone/me/sdk/uikit/common/views/OneMeTextInput$PlaceholderType;")};
    }

    public cka(Context context) {
        super(context, (AttributeSet) null);
        EditText editText = new EditText(context);
        editText.setMinimumHeight(tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density));
        editText.setBackground((Drawable) null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        i4f.l.b(editText, du4.b);
        float f = (float) 12;
        editText.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), editText.getPaddingTop(), tu0.G(fk4.d().getDisplayMetrics().density * f), editText.getPaddingBottom());
        editText.setClipToOutline(true);
        editText.setOutlineProvider(new ix3((float) tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density)));
        editText.setCompoundDrawablePadding(tu0.G(f * fk4.d().getDisplayMetrics().density));
        editText.setImportantForAutofill(1);
        editText.setSingleLine(true);
        editText.setInputType(editText.getInputType() | 16384);
        setOnClearIconClick(editText);
        editText.addTextChangedListener(new vf1(editText, 8, this));
        this.a = editText;
        this.v0 = tu0.r(3, new zja(context, 0, this));
        this.w0 = tu0.r(3, new zj7(21, this));
        setOrientation(1);
        addView(editText);
    }

    private final aka getCurrentPlaceholderType() {
        bc7 bc7 = x0[5];
        return (aka) this.u0.b;
    }

    private final TextView getPlaceholderView() {
        return (TextView) this.v0.getValue();
    }

    private final void setCurrentPlaceholderType(aka aka) {
        this.u0.o1(this, x0[5], aka);
    }

    private final void setOnClearIconClick(EditText editText) {
        editText.setOnTouchListener(new ei1(4, editText));
    }

    public final void a() {
        getPlaceholderView().setText((CharSequence) null);
        getPlaceholderView().setVisibility(8);
        setCurrentPlaceholderType((aka) null);
    }

    public final void b(m56 m56) {
        this.a.addTextChangedListener(new z2(6, m56));
    }

    public final boolean c() {
        return getCurrentPlaceholderType() == aka.a && br7.H(this.v0);
    }

    public final void d(String str, aka aka) {
        if (!tpa.f(getPlaceholderView().getText(), str) || aka != getCurrentPlaceholderType()) {
            getPlaceholderView().setText(str);
            getPlaceholderView().setVisibility(0);
            setCurrentPlaceholderType(aka);
        }
    }

    public final void e(fka fka, aka aka) {
        int i;
        int ordinal = aka.ordinal();
        if (ordinal == 0) {
            i = fka.getText().b;
        } else if (ordinal == 1) {
            i = fka.getText().e;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        je7 je7 = this.v0;
        if (je7.a()) {
            ((TextView) je7.getValue()).setTextColor(i);
        }
    }

    public final Integer getBackgroundColorAttr() {
        bc7 bc7 = x0[0];
        return (Integer) this.b.b;
    }

    public final InputFilter[] getFilters() {
        bc7 bc7 = x0[2];
        return (InputFilter[]) this.o.b;
    }

    public final String getHint() {
        bc7 bc7 = x0[1];
        return (String) this.c.b;
    }

    public final int getHintColorAttr() {
        bc7 bc7 = x0[4];
        return ((Number) this.t0.b).intValue();
    }

    public final CharSequence getText() {
        Editable text = this.a.getText();
        return text.subSequence(0, text.length());
    }

    public final int getTextColorAttr() {
        bc7 bc7 = x0[3];
        return ((Number) this.s0.b).intValue();
    }

    public final void onThemeChanged(fka fka) {
        EditText editText = this.a;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(fka.getText().j));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        pq9 pq9 = qp4.u0;
        if (backgroundColorAttr != null) {
            editText.setBackgroundColor(pq9.j(this).c(backgroundColorAttr.intValue()));
        }
        editText.setTextColor(pq9.j(this).c(getTextColorAttr()));
        editText.setHintTextColor(pq9.j(this).c(getHintColorAttr()));
        je7 je7 = this.w0;
        if (je7.a()) {
            ((Drawable) je7.getValue()).setTint(pq9.j(this).getIcon().j);
        }
        aka currentPlaceholderType = getCurrentPlaceholderType();
        if (currentPlaceholderType != null) {
            e(fka, currentPlaceholderType);
        }
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.b.o1(this, x0[0], num);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        this.o.o1(this, x0[2], inputFilterArr);
    }

    public final void setHint(String str) {
        this.c.o1(this, x0[1], str);
    }

    public final void setHintColorAttr(int i) {
        this.t0.o1(this, x0[4], Integer.valueOf(i));
    }

    public final void setInputType(int i) {
        this.a.setInputType(i);
    }

    public final void setSelection(int i) {
        this.a.setSelection(i);
    }

    public final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void setTextColorAttr(int i) {
        this.s0.o1(this, x0[3], Integer.valueOf(i));
    }
}
