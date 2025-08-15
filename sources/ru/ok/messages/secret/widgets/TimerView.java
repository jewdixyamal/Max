package ru.ok.messages.secret.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public class TimerView extends FrameLayout {
    public static final /* synthetic */ int y0 = 0;
    public RectF a;
    public final Paint b;
    public final Paint c;
    public final AppCompatImageView o;
    public float s0 = 360.0f;
    public ValueAnimator t0;
    public long u0 = -1;
    public long v0 = -1;
    public long w0 = -1;
    public boolean x0 = true;

    public TimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        Drawable drawable;
        int i2;
        TypedArray obtainStyledAttributes;
        int i3 = bk4.b().b;
        if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3c.TimerView)) == null) {
            i = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
            drawable = null;
        } else {
            int i4 = b3c.TimerView_circleColor;
            Context context2 = getContext();
            khe khe = sme.a0;
            i = obtainStyledAttributes.getColor(i4, fm9.R(context2).k);
            i2 = obtainStyledAttributes.getColor(b3c.TimerView_circleSecondaryColor, s63.i(i, 76));
            drawable = obtainStyledAttributes.getDrawable(b3c.TimerView_arrowResource);
            obtainStyledAttributes.recycle();
        }
        if (i == Integer.MIN_VALUE) {
            Context context3 = getContext();
            khe khe2 = sme.a0;
            i = fm9.R(context3).k;
        }
        i2 = i2 == Integer.MIN_VALUE ? s63.i(i, 76) : i2;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        setColor(i);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        setSecondaryColor(i2);
        setStrokeWidth(i3);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.o = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        if (drawable != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(appCompatImageView, layoutParams);
        setWillNotDraw(false);
    }

    public final void a(long j, long j2, long j3) {
        this.u0 = j;
        this.v0 = j2;
        this.w0 = j3;
        if (j3 >= j2) {
            b(0.0f);
            return;
        }
        b(-1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f - (((float) (j3 - j)) / ((float) (j2 - j))), 0.0f});
        this.t0 = ofFloat;
        ofFloat.setDuration(j2 - j3);
        this.t0.addUpdateListener(new z00(20, (Object) this));
        this.t0.start();
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.t0.cancel();
        }
        if (f != -1.0f) {
            this.s0 = f * 360.0f;
            invalidate();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.x0) {
            long j = this.u0;
            if (j != -1) {
                long j2 = this.v0;
                if (j2 != -1) {
                    long j3 = this.w0;
                    if (j3 != -1) {
                        a(j, j2, j3);
                    }
                }
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x0 = true;
        b(-1.0f);
    }

    public final void onDraw(Canvas canvas) {
        AppCompatImageView appCompatImageView = this.o;
        float rotation = appCompatImageView.getRotation();
        float f = this.s0;
        if (rotation != f) {
            appCompatImageView.setRotation(f);
        }
        super.onDraw(canvas);
        float centerX = this.a.centerX();
        canvas.drawCircle(centerX, this.a.centerY(), this.a.right - centerX, this.c);
        float f2 = this.s0;
        if (f2 > 0.0f) {
            canvas.drawArc(this.a, 270.0f, f2, false, this.b);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.b;
        this.a = new RectF((paint.getStrokeWidth() / 2.0f) + ((float) getPaddingLeft()), (paint.getStrokeWidth() / 2.0f) + ((float) getPaddingTop()), (((float) getWidth()) - (paint.getStrokeWidth() / 2.0f)) - ((float) getPaddingRight()), (((float) getHeight()) - (paint.getStrokeWidth() / 2.0f)) - ((float) getPaddingBottom()));
        invalidate();
    }

    public void setArrorColor(int i) {
        this.o.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setColor(int i) {
        this.b.setColor(i);
    }

    public void setImageResource(int i) {
        this.o.setImageResource(i);
    }

    public void setSecondaryColor(int i) {
        this.c.setColor(i);
    }

    public void setStrokeWidth(int i) {
        float f = (float) i;
        this.b.setStrokeWidth(f);
        this.c.setStrokeWidth(f);
    }

    public void setupColorsFrom(int i) {
        setColor(i);
        setSecondaryColor(s63.i(i, 76));
    }
}
