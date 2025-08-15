package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import ru.ok.tamtam.animoji.views.AnimojiTextView;

public class ImageSpanEllipsizedTextView extends AnimojiTextView {
    public CharSequence w0;
    public final Rect x0 = new Rect();
    public final Rect y0 = new Rect();

    public ImageSpanEllipsizedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        Rect rect = this.x0;
        int i5 = 0;
        if (!isEmpty) {
            getPaint().getTextBounds(text.toString(), 0, text.length(), rect);
        } else {
            rect.setEmpty();
        }
        int width = getWidth() - (getPaddingRight() + getPaddingLeft());
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative[2];
        if (drawable != null) {
            Rect rect2 = this.y0;
            drawable.copyBounds(rect2);
            Drawable drawable2 = compoundDrawablesRelative[0];
            if (drawable2 != null) {
                i5 = drawable2.getBounds().right + getCompoundDrawablePadding();
            }
            int i6 = rect.right - width;
            int compoundDrawablePadding = getCompoundDrawablePadding() + rect2.width() + i6 + i5;
            if (c54.K(this)) {
                compoundDrawablePadding = -compoundDrawablePadding;
            }
            rect2.set(compoundDrawablePadding, rect2.top, rect2.width() + compoundDrawablePadding, rect2.bottom);
            compoundDrawablesRelative[2].setBounds(rect2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        Drawable[] compoundDrawables = getCompoundDrawables();
        int i5 = 0;
        Drawable drawable = compoundDrawables[0];
        if (drawable != null) {
            i4 = drawable.getIntrinsicWidth();
            i3 = getCompoundDrawablePadding();
        } else {
            i4 = 0;
            i3 = 0;
        }
        Drawable drawable2 = compoundDrawables[2];
        if (drawable2 != null) {
            i5 = drawable2.getIntrinsicWidth();
            i3 += getCompoundDrawablePadding();
        }
        TextUtils.TruncateAt ellipsize = getEllipsize();
        if (ellipsize == null) {
            ellipsize = TextUtils.TruncateAt.END;
        }
        if (TextUtils.isEmpty(this.w0)) {
            setText((CharSequence) null);
        } else {
            setText(TextUtils.ellipsize(this.w0, getPaint(), (float) (((((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) - i4) - i5) - i3), ellipsize));
        }
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.w0 = charSequence;
        super.setText(charSequence, bufferType);
    }
}
