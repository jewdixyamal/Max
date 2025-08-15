package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

/* renamed from: w3b  reason: default package */
public final class w3b extends ViewGroup {
    public final int a;
    public final int b;
    public final TextView c;
    public final TextView o;
    public final t4b s0;
    public final uff t0;
    public n26 u0;
    public boolean v0;
    public v3b w0;

    /* JADX WARNING: type inference failed for: r4v5, types: [android.widget.SeekBar, t4b, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r6v26, types: [uff, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    public w3b(Context context) {
        super(context);
        float f = (float) 12;
        this.a = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = (float) 4;
        this.b = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        TextView textView = new TextView(context);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.p(textView).c.getText().e);
        kqe kqe = i4f.G;
        kqe.b(textView, du4.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(pq9.p(textView2).c.getText().e);
        kqe.b(textView2, du4.b);
        this.o = textView2;
        ? seekBar = new SeekBar(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ote.b0(pq9.p(seekBar).c.getIcon().f, 0.8f));
        gradientDrawable.setSize(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density));
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 100.0f);
        seekBar.setThumb(gradientDrawable);
        float f3 = (float) 2;
        seekBar.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), seekBar.getPaddingTop(), tu0.G(fk4.d().getDisplayMetrics().density * f3), seekBar.getPaddingBottom());
        seekBar.setProgressBackgroundTintList(ColorStateList.valueOf(pq9.p(seekBar).c.getIcon().j));
        seekBar.setProgressTintList(ColorStateList.valueOf(pq9.p(seekBar).c.b().a.f));
        seekBar.setSecondaryProgressTintList(ColorStateList.valueOf(pq9.p(seekBar).c.getIcon().i));
        this.s0 = seekBar;
        ? frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.a = imageView;
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        float f4 = (float) 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        frameLayout.c = progressBar;
        TextView textView3 = new TextView(context);
        textView3.setTextColor(pq9.p(textView3).c.getText().e);
        i4f.w.b(textView3, du4.b);
        textView3.setGravity(17);
        float f5 = (float) 6;
        textView3.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f5 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        frameLayout.addView(textView3, layoutParams2);
        frameLayout.b = textView3;
        frameLayout.setElevation(fk4.d().getDisplayMetrics().density * 4.0f);
        float f6 = fk4.d().getDisplayMetrics().density * 14.0f;
        View view = new View(frameLayout.getContext());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density), pq9.p(view).c.i().c);
        gradientDrawable2.setCornerRadius(f6);
        view.setBackground(gradientDrawable2);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setOutlineProvider(new ix3(f6));
        this.t0 = frameLayout;
        setClipChildren(false);
        setClipToPadding(false);
        addView(textView);
        addView(textView2);
        addView(seekBar);
        addView(frameLayout);
        seekBar.setOnSeekBarChangeListener(new og8(this, 1));
    }

    public final void a(zi2 zi2) {
        Bitmap bitmap;
        int i = 8;
        uff uff = this.t0;
        boolean z = zi2.c;
        boolean z2 = zi2.b;
        n26 n26 = zi2.a;
        if ((n26 != null || z2) && z) {
            this.u0 = n26;
            this.v0 = true;
            ProgressBar progressBar = uff.c;
            if (z2) {
                i = 0;
            }
            progressBar.setVisibility(i);
            n26 n262 = this.u0;
            if (!(n262 == null || (bitmap = n262.a) == null || bitmap.isRecycled())) {
                n26 n263 = this.u0;
                uff.a.setImageBitmap(n263 != null ? n263.a : null);
            }
            uff.setVisibility(0);
            return;
        }
        uff.setVisibility(8);
        this.v0 = z;
    }

    public final v3b getListener() {
        return this.w0;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        uff uff = this.t0;
        int visibility = uff.getVisibility();
        int i5 = this.b;
        int i6 = this.a;
        if (visibility == 0) {
            ote.E(uff, i6, i5 - uff.getMeasuredHeight(), i5, 4);
        }
        TextView textView = this.c;
        ote.E(textView, i6, i5, 0, 12);
        TextView textView2 = this.o;
        ote.E(textView2, (getMeasuredWidth() - i6) - textView2.getMeasuredWidth(), i5, 0, 12);
        int measuredHeight = textView.getMeasuredHeight();
        ote.E(this.s0, i6, measuredHeight + i5 + i5, 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        TextView textView = this.c;
        textView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (this.a * 2), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        t4b t4b = this.s0;
        t4b.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = t4b.getMeasuredHeight() + textView.getMeasuredHeight() + (this.b * 2);
        n26 n26 = this.u0;
        int i3 = 0;
        int i4 = n26 != null ? n26.b : 0;
        if (n26 != null) {
            i3 = n26.c;
        }
        if (!(i4 == 0 || i3 == 0)) {
            uff uff = this.t0;
            if (uff.getVisibility() == 0) {
                uff.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setListener(v3b v3b) {
        this.w0 = v3b;
    }
}
