package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.BitSet;

/* renamed from: pea  reason: default package */
public final class pea extends ViewGroup implements kre {
    public final BitSet a;
    public final BitSet b;
    public final int c = 1;
    public final int o = 2;
    public final TextView s0;
    public final TextView t0;
    public final ImageView u0;

    public pea(Context context) {
        super(context, (AttributeSet) null);
        BitSet bitSet = new BitSet(4);
        this.a = bitSet;
        BitSet bitSet2 = new BitSet(3);
        this.b = bitSet2;
        TextView textView = new TextView(context);
        textView.setText(z7.B(textView.getContext(), yoc.v0));
        i4f.o.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.j(textView).getText().j);
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.s0 = textView;
        TextView textView2 = new TextView(context);
        i4f.m.b(textView2, du4.b);
        textView2.setTextColor(pq9.j(textView2).getText().e);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        np8.n(textView2);
        this.t0 = textView2;
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(kt3.b(imageView.getContext(), woc.v));
        imageView.setImageTintList(ColorStateList.valueOf(pq9.j(imageView).getIcon().j));
        int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        float f = (float) 12;
        int G2 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        int G3 = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        int G4 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(G, G4, G2, G4);
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(G2 + G3 + G, (G4 * 2) + G3));
        this.u0 = imageView;
        addView(textView);
        addView(textView2);
        addView(imageView);
        float f2 = (float) 5;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        bitSet.set(0, bitSet.size(), true);
        bitSet2.set(0, true);
        bitSet2.set(2, false);
        bitSet2.set(1, false);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        TextView textView = this.s0;
        c54.L(paddingStart, getPaddingTop(), textView.getMeasuredWidth() + paddingStart, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        if (this.b.get(this.c)) {
            int c2 = rh4.c((float) 2, fk4.d().getDisplayMetrics().density, textView.getBottom());
            TextView textView2 = this.t0;
            int measuredHeight = textView2.getMeasuredHeight() + c2;
            c54.L(paddingStart, c2, textView2.getMeasuredWidth() + paddingStart, measuredHeight, textView2, this);
        }
        int measuredWidth = getMeasuredWidth();
        ImageView imageView = this.u0;
        int measuredHeight2 = (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2);
        c54.L(measuredWidth - imageView.getMeasuredWidth(), measuredHeight2, measuredWidth, imageView.getMeasuredHeight() + measuredHeight2, imageView, this);
    }

    public final void onMeasure(int i, int i2) {
        TextView textView = this.s0;
        BitSet bitSet = this.b;
        int i3 = 8;
        textView.setVisibility(bitSet.get(0) ? 0 : 8);
        TextView textView2 = this.t0;
        int i4 = this.c;
        textView2.setVisibility(bitSet.get(i4) ? 0 : 8);
        ImageView imageView = this.u0;
        int i5 = this.o;
        if (bitSet.get(i5)) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        int size = View.MeasureSpec.getSize(i);
        int G = tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density);
        int q = rh4.q((float) 12, fk4.d().getDisplayMetrics().density, rh4.q((float) 16, fk4.d().getDisplayMetrics().density, (size - getPaddingStart()) - getPaddingEnd()));
        if (bitSet.get(i5)) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().height, 1073741824));
        }
        if (bitSet.get(0)) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(q, Integer.MIN_VALUE), 0);
        }
        if (bitSet.get(i4)) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(q, Integer.MIN_VALUE), 0);
        }
        BitSet bitSet2 = this.a;
        bitSet2.set(0, bitSet2.size(), false);
        setMeasuredDimension(size, G);
    }

    public final void onThemeChanged(fka fka) {
        this.s0.setTextColor(fka.getText().j);
        this.t0.setTextColor(fka.getText().e);
        this.u0.setImageTintList(ColorStateList.valueOf(fka.getIcon().j));
        BitSet bitSet = this.a;
        bitSet.set(0, bitSet.size(), true);
        invalidate();
    }

    public final void setCloseBtnClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.u0, 300, onClickListener);
    }

    public final void setCloseButtonVisibility(boolean z) {
        BitSet bitSet = this.a;
        int i = this.o;
        bitSet.set(i, true);
        this.b.set(i, z);
        requestLayout();
    }

    public final void setOnPinnedMsgClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.t0.setText(charSequence);
        BitSet bitSet = this.a;
        int i = this.c;
        boolean z = true;
        bitSet.set(i, true);
        BitSet bitSet2 = this.b;
        if (charSequence.length() <= 0) {
            z = false;
        }
        bitSet2.set(i, z);
        requestLayout();
    }
}
