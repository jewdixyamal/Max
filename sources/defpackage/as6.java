package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: as6  reason: default package */
public final class as6 extends ViewGroup implements kre {
    public final int a = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
    public final OneMeButton b;
    public final TextView c;

    public as6(Context context) {
        super(context, (AttributeSet) null);
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setSize(c7a.b);
        oneMeButton.setMode(b7a.b);
        oneMeButton.setAppearance(z6a.c);
        this.b = oneMeButton;
        TextView textView = new TextView(context);
        pq9 pq9 = qp4.u0;
        pq9.j(textView).getText();
        textView.setTextColor(-1);
        textView.setGravity(17);
        i4f.G.b(textView, du4.b);
        this.c = textView;
        addView(oneMeButton);
        addView(textView);
        setBackground(new RippleDrawable(ColorStateList.valueOf(pq9.j(this).d().a.a.h), (Drawable) null, (Drawable) null));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        TextView textView = this.c;
        int measuredWidth = textView.getMeasuredWidth();
        OneMeButton oneMeButton = this.b;
        int measuredWidth2 = measuredWidth > oneMeButton.getMeasuredWidth() ? ((textView.getMeasuredWidth() / 2) - (oneMeButton.getMeasuredWidth() / 2)) + getPaddingStart() : getPaddingStart();
        oneMeButton.layout(measuredWidth2, paddingTop, oneMeButton.getMeasuredWidth() + measuredWidth2, oneMeButton.getMeasuredHeight() + paddingTop);
        int paddingStart = textView.getMeasuredWidth() > oneMeButton.getMeasuredWidth() ? getPaddingStart() : getPaddingStart() + ((oneMeButton.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2));
        int bottom = oneMeButton.getBottom() + paddingTop + this.a;
        textView.layout(paddingStart, bottom, textView.getMeasuredWidth() + paddingStart, textView.getMeasuredHeight() + bottom);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        OneMeButton oneMeButton = this.b;
        oneMeButton.measure(makeMeasureSpec, makeMeasureSpec2);
        int makeMeasureSpec3 = View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        setMeasuredDimension(getPaddingEnd() + getPaddingStart() + Math.max(oneMeButton.getMeasuredWidth(), textView.getMeasuredWidth()), getPaddingBottom() + getPaddingTop() + textView.getMeasuredHeight() + oneMeButton.getMeasuredHeight() + this.a);
    }

    public final void onThemeChanged(fka fka) {
        this.b.onThemeChanged(fka);
        TextView textView = this.c;
        pq9 pq9 = qp4.u0;
        pq9.j(this).getText();
        textView.setTextColor(-1);
        setBackground(new RippleDrawable(ColorStateList.valueOf(pq9.j(this).d().a.a.h), (Drawable) null, (Drawable) null));
    }

    public final void setIcon(int i) {
        Integer valueOf = Integer.valueOf(i);
        bc7[] bc7Arr = OneMeButton.B0;
        this.b.d(valueOf, true);
    }

    public final void setLabel(int i) {
        this.c.setText(i);
    }
}
