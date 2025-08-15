package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

public class VideoFramePreview extends RoundedRectFrameLayout implements nse {
    public final AppCompatImageView s0;
    public final AppCompatTextView t0;
    public final ProgressBar u0;
    public final View v0 = new View(getContext());

    public VideoFramePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bk4 b = bk4.b();
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        this.s0 = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.s0, new FrameLayout.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        this.u0 = progressBar;
        progressBar.setIndeterminate(true);
        int i = b.n;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.u0, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        this.t0 = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.t0.setTextSize(b.F);
        this.t0.setGravity(17);
        AppCompatTextView appCompatTextView2 = this.t0;
        int i2 = b.f;
        int i3 = b.b;
        appCompatTextView2.setPadding(i2, i3, i2, i3);
        float f = (float) b.s;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#333344"));
        shapeDrawable.setAlpha(96);
        this.t0.setBackground(shapeDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = b.d;
        addView(this.t0, layoutParams2);
        this.v0.setBackground(hm9.b0((Integer) null, Integer.valueOf(lt3.a(getContext(), epc.g)), Integer.valueOf(b.a), b.g));
        addView(this.v0, new FrameLayout.LayoutParams(-1, -1));
        setCornerRadius((float) b.h);
        c();
    }

    public final void a(boolean z) {
        if (z) {
            this.u0.setVisibility(0);
        } else {
            this.u0.setVisibility(8);
        }
    }

    public final void c() {
        Context context = getContext();
        khe khe = sme.a0;
        ngg.H(this.u0, fm9.R(context).k);
    }

    public void setPreviewEnabled(boolean z) {
        View view = this.v0;
        AppCompatImageView appCompatImageView = this.s0;
        if (z) {
            appCompatImageView.setVisibility(0);
            Context context = getContext();
            khe khe = sme.a0;
            setBackgroundColor(fm9.R(context).w);
            view.setVisibility(0);
            return;
        }
        appCompatImageView.setVisibility(8);
        setBackground((Drawable) null);
        view.setVisibility(8);
    }
}
