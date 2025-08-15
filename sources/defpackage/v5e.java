package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: v5e  reason: default package */
public final class v5e extends ViewGroup implements kre {
    public final TextView a;
    public final TextView b;
    public final OneMeButton c;
    public final int o = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);

    public v5e(Context context) {
        super(context, (AttributeSet) null);
        TextView textView = new TextView(context);
        textView.setId(tga.e);
        i4f.k.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.j(textView).getText().e);
        this.a = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(tga.d);
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9.j(textView2).getText().i);
        this.b = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(tga.c);
        oneMeButton.setSize(c7a.a);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setVisibility(4);
        this.c = oneMeButton;
        addView(textView);
        addView(textView2);
        addView(oneMeButton);
    }

    public final OneMeButton getHeaderButton() {
        return this.c;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        TextView textView = this.a;
        int i5 = paddingStart;
        c54.L(i5, getPaddingTop(), textView.getMeasuredWidth() + paddingStart, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        TextView textView2 = this.b;
        c54.L(i5, textView.getBottom(), textView2.getMeasuredWidth() + paddingStart, textView2.getMeasuredHeight() + textView.getBottom(), textView2, this);
        OneMeButton oneMeButton = this.c;
        int bottom = (textView2.getBottom() / 2) - (oneMeButton.getMeasuredHeight() / 2);
        c54.L(getMeasuredWidth() - (oneMeButton.getMeasuredWidth() + getPaddingEnd()), bottom, getMeasuredWidth() - getPaddingEnd(), oneMeButton.getMeasuredHeight() + bottom, this.c, this);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        OneMeButton oneMeButton = this.c;
        oneMeButton.measure(makeMeasureSpec, i2);
        int measuredWidth = size - (oneMeButton.getMeasuredWidth() + this.o);
        TextView textView = this.a;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), i2);
        TextView textView2 = this.b;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), i2);
        setMeasuredDimension(size, textView2.getMeasuredHeight() + textView.getMeasuredHeight());
    }

    public final void onThemeChanged(fka fka) {
        TextView textView = this.a;
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.j(this).getText().e);
        this.b.setTextColor(pq9.j(this).getText().i);
        this.c.onThemeChanged(fka);
    }
}
