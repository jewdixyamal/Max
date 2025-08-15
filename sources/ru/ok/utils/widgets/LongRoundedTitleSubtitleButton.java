package ru.ok.utils.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lwme;", "", "title", "Le5f;", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
public final class LongRoundedTitleSubtitleButton extends AppCompatButton implements wme {
    public CharSequence o;
    public CharSequence s0;
    public final TextAppearanceSpan t0;
    public final TextAppearanceSpan u0;

    public LongRoundedTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        sme sme;
        this.t0 = new TextAppearanceSpan(context, r2c.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Title);
        this.u0 = new TextAppearanceSpan(context, r2c.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g3c.LongRoundedTitleSubtitleButton);
        String string = obtainStyledAttributes.getString(g3c.LongRoundedTitleSubtitleButton_lrts_title);
        String string2 = obtainStyledAttributes.getString(g3c.LongRoundedTitleSubtitleButton_lrts_subtitle);
        b(string == null ? "" : string, string2 == null ? "" : string2);
        obtainStyledAttributes.recycle();
        setGravity(17);
        if (isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context2 = getContext();
            khe khe = sme.a0;
            sme = fm9.R(context2);
        }
        z(sme);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        SpannableString valueOf;
        SpannableString valueOf2;
        CharSequence charSequence3 = this.o;
        SpannableString spannableString = null;
        SpannableString spannableString2 = charSequence3;
        if (charSequence != charSequence3) {
            if (charSequence == null || (valueOf2 = SpannableString.valueOf(charSequence)) == null) {
                spannableString2 = null;
            } else {
                valueOf2.setSpan(this.t0, 0, charSequence.length(), 17);
                spannableString2 = valueOf2;
            }
        }
        this.o = spannableString2;
        CharSequence charSequence4 = this.s0;
        if (charSequence2 != charSequence4) {
            if (!(charSequence2 == null || (valueOf = SpannableString.valueOf(charSequence2)) == null)) {
                valueOf.setSpan(this.u0, 0, charSequence2.length(), 17);
                spannableString = valueOf;
            }
            charSequence4 = spannableString;
        }
        this.s0 = charSequence4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence5 = this.o;
        if (charSequence5 == null) {
            charSequence5 = "";
        }
        SpannableStringBuilder append = spannableStringBuilder.append(charSequence5);
        CharSequence charSequence6 = this.s0;
        if (charSequence6 != null) {
            append.append("\n").append(charSequence6);
        }
        setText(append);
    }

    public final void setSubtitle(CharSequence charSequence) {
        b(this.o, charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        b(charSequence, this.s0);
    }

    public final void z(sme sme) {
        ngg.f(sme, this, tu0.G(((float) 42) * fk4.d().getDisplayMetrics().density));
    }
}
