package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: p5g  reason: default package */
public final class p5g extends ViewGroup implements kre {
    public final bu6 a;
    public final TextView b;
    public final TextView c;
    public final c17 o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final float x0;
    public tc9 y0;

    /* JADX WARNING: type inference failed for: r3v19, types: [android.text.method.LinkMovementMethod, bk7] */
    public p5g(Context context) {
        super(context, (AttributeSet) null);
        bu6 bu6 = new bu6(context);
        bu6.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.a = bu6;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(1);
        textView.setVisibility(0);
        this.b = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView2.setGravity(1);
        if (bk7.a == null) {
            bk7.a = new LinkMovementMethod();
        }
        textView2.setMovementMethod(bk7.a);
        i4f.f.b(textView2, du4.b);
        this.c = textView2;
        c17 c17 = new c17(context);
        c17.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.o = c17;
        this.s0 = tu0.G(((float) 272) * fk4.d().getDisplayMetrics().density);
        int G = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        this.t0 = G;
        float f = (float) 16;
        this.u0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.v0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.w0 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        this.x0 = fk4.d().getDisplayMetrics().density * 14.0f;
        setPadding(getPaddingLeft(), G, getPaddingRight(), G);
        addView(bu6);
        addView(textView);
        addView(textView2);
        onThemeChanged(qp4.u0.j(this));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        tc9 tc9 = this.y0;
        if (tc9 != null) {
            int paddingTop = getPaddingTop();
            int measuredWidth = getMeasuredWidth() / 2;
            List list = tc9.b;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                s5g s5g = (s5g) list.get(i5);
                if (s5g instanceof t5g) {
                    c17 c17 = this.o;
                    paddingTop += this.v0;
                    ote.E(c17, measuredWidth - (c17.getMeasuredWidth() / 2), paddingTop, 0, 12);
                } else {
                    boolean z2 = s5g instanceof u5g;
                    int i6 = this.w0;
                    if (z2) {
                        bu6 bu6 = this.a;
                        int measuredWidth2 = measuredWidth - (bu6.getMeasuredWidth() / 2);
                        if (i5 != 0) {
                            paddingTop += i6;
                        }
                        ote.E(bu6, measuredWidth2, paddingTop, 0, 12);
                        measuredHeight = bu6.getMeasuredHeight() + this.u0;
                    } else if (!(s5g instanceof v5g)) {
                        throw new NoWhenBranchMatchedException();
                    } else if (((v5g) s5g).c) {
                        TextView textView = this.c;
                        paddingTop += i6;
                        ote.E(textView, measuredWidth - (textView.getMeasuredWidth() / 2), paddingTop, 0, 12);
                        measuredHeight = textView.getMeasuredHeight();
                    } else {
                        TextView textView2 = this.b;
                        ote.E(textView2, measuredWidth - (textView2.getMeasuredWidth() / 2), paddingTop, 0, 12);
                        measuredHeight = textView2.getMeasuredHeight();
                    }
                    paddingTop = measuredHeight + paddingTop;
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        tc9 tc9 = this.y0;
        if (tc9 == null) {
            super.onMeasure(i, i2);
            return;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        List list = tc9.b;
        int size = list.size();
        int i3 = 0;
        while (true) {
            int i4 = this.s0;
            if (i3 < size) {
                s5g s5g = (s5g) list.get(i3);
                boolean z = s5g instanceof t5g;
                int i5 = this.w0;
                if (z) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - (this.v0 * 2), 1073741824);
                    c17 c17 = this.o;
                    c17.measure(makeMeasureSpec, i2);
                    measuredHeight2 = c17.getMeasuredHeight();
                } else {
                    boolean z2 = s5g instanceof u5g;
                    int i6 = this.t0;
                    if (z2) {
                        u5g u5g = (u5g) s5g;
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4 - (i6 * 2), tu0.G(((float) u5g.a.getWidth()) * fk4.d().getDisplayMetrics().density)), 1073741824);
                        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(tu0.G(((float) u5g.a.getHeight()) * fk4.d().getDisplayMetrics().density), 1073741824);
                        bu6 bu6 = this.a;
                        bu6.measure(makeMeasureSpec2, makeMeasureSpec3);
                        if (i3 != 0) {
                            paddingBottom += i5;
                        }
                        measuredHeight = bu6.getMeasuredHeight() + this.u0;
                    } else if (!(s5g instanceof v5g)) {
                        throw new NoWhenBranchMatchedException();
                    } else if (((v5g) s5g).c) {
                        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i4 - (i6 * 2), Integer.MIN_VALUE);
                        TextView textView = this.c;
                        textView.measure(makeMeasureSpec4, i2);
                        measuredHeight2 = textView.getMeasuredHeight();
                    } else {
                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i4 - (i6 * 2), Integer.MIN_VALUE);
                        TextView textView2 = this.b;
                        textView2.measure(makeMeasureSpec5, i2);
                        measuredHeight = textView2.getMeasuredHeight();
                    }
                    paddingBottom = measuredHeight + paddingBottom;
                    i3++;
                }
                measuredHeight = measuredHeight2 + i5;
                paddingBottom = measuredHeight + paddingBottom;
                i3++;
            } else {
                setMeasuredDimension(i4, paddingBottom);
                return;
            }
        }
    }

    public final void onThemeChanged(fka fka) {
        bu6 bu6 = this.a;
        if (bu6.getColorFilter() != null) {
            bu6.setColorFilter(fka.a().s().c.b);
        }
        this.b.setTextColor(fka.getText().e);
        this.c.setTextColor(fka.getText().g);
    }

    public final void setKeyboardListener(b17 b17) {
        this.o.setClickListener(b17);
    }
}
