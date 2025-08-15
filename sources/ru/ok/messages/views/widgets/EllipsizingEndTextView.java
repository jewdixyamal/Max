package ru.ok.messages.views.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.tamtam.animoji.views.AnimojiTextView;

public class EllipsizingEndTextView extends AnimojiTextView {
    public static final Pattern E0 = Pattern.compile("[\\.,…;\\:\\s]*$", 32);
    public float A0 = 1.0f;
    public float B0 = 0.0f;
    public Pattern C0;
    public boolean D0;
    public boolean w0;
    public boolean x0;
    public CharSequence y0;
    public int z0;

    public EllipsizingEndTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.setEllipsize((TextUtils.TruncateAt) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091});
        setMaxLines(obtainStyledAttributes.getInt(0, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
        setEndPunctuationPattern(E0);
    }

    private int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / l("").getLineBottom(0);
    }

    private int getLinesCount() {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    @SuppressLint({"Override"})
    public int getMaxLines() {
        return this.z0;
    }

    public final StaticLayout l(CharSequence charSequence) {
        int i;
        int i2;
        Drawable[] compoundDrawables = getCompoundDrawables();
        int i3 = 0;
        Drawable drawable = compoundDrawables[0];
        if (drawable != null) {
            i2 = drawable.getIntrinsicWidth();
            i = getCompoundDrawablePadding();
        } else {
            i2 = 0;
            i = 0;
        }
        Drawable drawable2 = compoundDrawables[2];
        if (drawable2 != null) {
            i3 = drawable2.getIntrinsicWidth();
            i += getCompoundDrawablePadding();
        }
        return new StaticLayout(charSequence, getPaint(), ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - i2) - i3) - i, Layout.Alignment.ALIGN_NORMAL, this.A0, this.B0, false);
    }

    public final void onDraw(Canvas canvas) {
        if (this.w0) {
            CharSequence charSequence = "…";
            if (this.D0) {
                CharSequence charSequence2 = this.y0;
                charSequence = TextUtils.concat(new CharSequence[]{charSequence, charSequence2.subSequence(charSequence2.length() - 1, this.y0.length())});
            }
            CharSequence charSequence3 = this.y0;
            StaticLayout l = l(charSequence3);
            int linesCount = getLinesCount();
            SpannableStringBuilder spannableStringBuilder = charSequence3;
            if (linesCount > 0) {
                spannableStringBuilder = charSequence3;
                if (l.getLineCount() > linesCount) {
                    int lineEnd = l.getLineEnd(linesCount - 1) + 1;
                    if (lineEnd >= this.y0.length()) {
                        lineEnd = this.y0.length() - 1;
                    }
                    CharSequence subSequence = this.y0.subSequence(0, lineEnd);
                    while (true) {
                        if (l(TextUtils.concat(new CharSequence[]{subSequence, charSequence})).getLineCount() > linesCount && lineEnd - 1 > 0) {
                            subSequence = subSequence.subSequence(0, lineEnd);
                        }
                    }
                    if (subSequence instanceof SpannedString) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(subSequence);
                        Matcher matcher = this.C0.matcher(subSequence);
                        spannableStringBuilder = spannableStringBuilder2;
                        if (matcher.find()) {
                            spannableStringBuilder2.replace(matcher.start(), ((SpannedString) subSequence).length(), charSequence);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                    } else {
                        spannableStringBuilder = TextUtils.concat(new CharSequence[]{this.C0.matcher(subSequence).replaceFirst(""), charSequence});
                    }
                }
            }
            if (!TextUtils.equals(spannableStringBuilder, getText())) {
                this.x0 = true;
                try {
                    setText(spannableStringBuilder);
                } finally {
                    this.x0 = false;
                }
            }
            this.w0 = false;
        }
        super.onDraw(canvas);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.w0 = true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if ((!this.x0 && this.y0 == null) || !charSequence.equals(this.y0)) {
            this.y0 = charSequence;
            this.w0 = true;
        }
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.C0 = pattern;
    }

    public final void setLineSpacing(float f, float f2) {
        this.B0 = f;
        this.A0 = f2;
        super.setLineSpacing(f, f2);
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.z0 = i;
        this.w0 = true;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.w0 = true;
    }

    public void setSaveLastCharPosition(boolean z) {
        this.D0 = z;
    }
}
