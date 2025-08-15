package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: g07  reason: default package */
public final class g07 extends ViewGroup implements v3b {
    public final je7 A0;
    public final kld B0;
    public final v7c C0;
    public final int a = tu0.G(((float) 9) * fk4.d().getDisplayMetrics().density);
    public final int b = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
    public final int c = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
    public final int o = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
    public final int s0;
    public final int t0;
    public final TextView u0;
    public final TextView v0;
    public final je7 w0;
    public final je7 x0;
    public final ImageView y0;
    public final je7 z0;

    public g07(Context context) {
        super(context);
        float f = (float) 8;
        this.s0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.t0 = tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        textView.setId(k8a.a);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams);
        i4f.q.b(textView, du4.b);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.p(textView).c.getText().e);
        this.u0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(k8a.b);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams2);
        i4f.G.b(textView2, du4.b);
        textView2.setTextColor(pq9.p(textView2).c.getText().e);
        this.v0 = textView2;
        this.w0 = tu0.r(3, new e07(context, this, 0));
        this.x0 = tu0.r(3, new e07(context, this, 1));
        ImageView imageView = new ImageView(context);
        int i = yfa.h;
        bs6 icon = pq9.p(imageView).c.getIcon();
        Drawable b2 = kt3.b(imageView.getContext(), i);
        ngg.G(b2, icon.f);
        imageView.setImageDrawable(b2);
        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9.p(imageView).c.d().a.a.h), (Drawable) null, (Drawable) null));
        int G = tu0.G(f * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(G, G, G, G);
        tu0.K(imageView, 300, new f07(this, 0));
        this.y0 = imageView;
        this.z0 = tu0.r(3, new hy4(context, 9));
        this.A0 = tu0.r(3, new hy4(context, 10));
        kld b3 = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.B0 = b3;
        this.C0 = new v7c(b3);
        addView(textView);
        addView(textView2);
        addView(imageView);
    }

    public final void a(aj2 aj2) {
        je7 je7 = this.w0;
        br7.b(this, (View) je7.getValue(), -1);
        ((View) je7.getValue()).setVisibility(0);
        je7 je72 = this.x0;
        br7.b(this, (View) je72.getValue(), -1);
        ((View) je72.getValue()).setVisibility(0);
        ((w3b) je7.getValue()).a(aj2.d);
    }

    public final void b(boolean z) {
        Drawable drawable;
        je7 je7 = this.x0;
        if (je7.a()) {
            ImageView imageView = (ImageView) je7.getValue();
            pq9 pq9 = qp4.u0;
            if (z) {
                int i = woc.a2;
                bs6 icon = pq9.p(imageView).c.getIcon();
                drawable = kt3.b(imageView.getContext(), i);
                ngg.G(drawable, icon.f);
            } else {
                int i2 = woc.b2;
                bs6 icon2 = pq9.p(imageView).c.getIcon();
                drawable = kt3.b(imageView.getContext(), i2);
                ngg.G(drawable, icon2.f);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public final void c(long j, long j2, long j3) {
        w3b w3b = (w3b) this.w0.getValue();
        w3b.o.setText(tfg.c(j3));
        w3b.c.setText(tfg.c(j));
        t4b t4b = w3b.s0;
        t4b.setMax((int) j3);
        t4b.setSecondaryProgress((int) j2);
        t4b.setProgress((int) j);
    }

    public final gld getEvents() {
        return this.C0;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        je7 je7 = this.z0;
        boolean H = br7.H(je7);
        int i5 = this.s0;
        if (H) {
            ote.E((View) je7.getValue(), 0, paddingTop, 0, 12);
            int measuredHeight = ((TextView) je7.getValue()).getMeasuredHeight() + i5 + paddingTop;
            je7 je72 = this.A0;
            ote.E((View) je72.getValue(), 0, ((TextView) je7.getValue()).getBottom() + i5, 0, 12);
            paddingTop = ((View) je72.getValue()).getMeasuredHeight() + measuredHeight;
        }
        je7 je73 = this.w0;
        if (br7.H(je73) && ((w3b) je73.getValue()).getParent() != null) {
            if (!br7.H(je7)) {
                i5 = 0;
            }
            int i6 = paddingTop + i5;
            ote.E((View) je73.getValue(), 0, i6, 0, 12);
            paddingTop = i6 + ((w3b) je73.getValue()).getMeasuredHeight();
        }
        TextView textView = this.u0;
        int measuredWidth = (getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int i7 = paddingTop + this.a;
        ote.E(textView, measuredWidth, i7, 0, 12);
        TextView textView2 = this.v0;
        ote.E(textView2, (getMeasuredWidth() / 2) - (textView2.getMeasuredWidth() / 2), textView.getMeasuredHeight() + this.b + i7, 0, 12);
        je7 je74 = this.x0;
        boolean H2 = br7.H(je74);
        ImageView imageView = this.y0;
        int i8 = this.c;
        if (H2) {
            ote.E((View) je74.getValue(), i8, ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
        if (imageView.getVisibility() == 0) {
            ote.E(imageView, (getMeasuredWidth() - i8) - imageView.getMeasuredWidth(), ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        je7 je7 = this.z0;
        boolean H = br7.H(je7);
        int i5 = this.s0;
        if (H) {
            ((TextView) je7.getValue()).measure(makeMeasureSpec, makeMeasureSpec2);
            je7 je72 = this.A0;
            ((View) je72.getValue()).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.t0, 1073741824));
            i3 = ((View) je72.getValue()).getMeasuredHeight() + ((TextView) je7.getValue()).getMeasuredHeight() + i5;
        } else {
            i3 = 0;
        }
        je7 je73 = this.w0;
        if (br7.H(je73) && ((w3b) je73.getValue()).getParent() != null) {
            ((w3b) je73.getValue()).measure(i, i2);
            int measuredHeight = ((w3b) je73.getValue()).getMeasuredHeight();
            if (!br7.H(je7)) {
                i5 = 0;
            }
            i3 += measuredHeight + i5;
        }
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.o, 1073741824);
        je7 je74 = this.x0;
        boolean H2 = br7.H(je74);
        int i6 = this.c;
        if (H2) {
            ((ImageView) je74.getValue()).measure(makeMeasureSpec3, makeMeasureSpec3);
            i4 = size - (((ImageView) je74.getValue()).getMeasuredWidth() + i6);
        } else {
            i4 = size;
        }
        ImageView imageView = this.y0;
        if (imageView.getVisibility() == 0) {
            imageView.measure(makeMeasureSpec3, makeMeasureSpec3);
            i4 -= imageView.getMeasuredWidth() + i6;
        }
        TextView textView = this.u0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), makeMeasureSpec2);
        TextView textView2 = this.v0;
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + textView2.getMeasuredHeight() + this.b + textView.getMeasuredHeight() + this.a + i3);
    }
}
