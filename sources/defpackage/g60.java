package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: g60  reason: default package */
public final class g60 extends AppCompatTextView implements nse {
    public boolean A0;
    public final Paint u0;
    public final float v0;
    public final Path w0 = new Path();
    public final float x0;
    public Animator y0;
    public boolean z0;

    public g60(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.u0 = paint;
        float f = (float) 4;
        this.v0 = getContext().getResources().getDisplayMetrics().density * f;
        float f2 = ((float) 6.8d) * getContext().getResources().getDisplayMetrics().density;
        this.x0 = f2;
        setClickable(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        setMinWidth(tu0.G(((float) 64) * getContext().getResources().getDisplayMetrics().density));
        float f3 = (float) 12;
        setElevation(getContext().getResources().getDisplayMetrics().density * f3);
        setPadding(tu0.G(f3 * getContext().getResources().getDisplayMetrics().density), tu0.G(getContext().getResources().getDisplayMetrics().density * f), tu0.G(getContext().getResources().getDisplayMetrics().density * f3), tu0.G(f * getContext().getResources().getDisplayMetrics().density) + ((int) f2));
        setTextSize(16.0f);
        setGravity(17);
        setTextAlignment(4);
        setLineHeight(19);
        c();
    }

    public final void c() {
        sme sme;
        if (isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context = getContext();
            khe khe = sme.a0;
            sme = fm9.R(context);
        }
        this.u0.setColor(sme.D);
        setTextColor(sme.F);
    }

    public final boolean isClickable() {
        return false;
    }

    public final ObjectAnimator j(float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{f, f2}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f, f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f, f2})});
    }

    public final void onDetachedFromWindow() {
        Animator animator = this.y0;
        if (animator != null) {
            animator.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.w0, this.u0);
        super.onDraw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(tu0.G(getContext().getResources().getDisplayMetrics().density * 33.8f), 1073741824));
        setPivotX(((float) getMeasuredWidth()) * 0.5f);
        setPivotY((float) getMeasuredHeight());
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Path path = this.w0;
        path.reset();
        float f = (float) i;
        float f2 = this.v0;
        float f3 = ((float) 2) * f2;
        float f4 = (float) i2;
        float f5 = f4 - f3;
        path.moveTo(f, f2 + 0.0f);
        float f6 = f - f3;
        float f7 = f3 + 0.0f;
        float f8 = f7;
        path.arcTo(f6, 0.0f, f, f8, 0.0f, -90.0f, false);
        path.rLineTo(-f6, 0.0f);
        Path path2 = path;
        float f9 = f7;
        path2.arcTo(0.0f, 0.0f, f9, f8, 270.0f, -90.0f, false);
        path.rLineTo(0.0f, f5);
        path2.arcTo(0.0f, f5, f9, f4, 180.0f, -90.0f, false);
        float f10 = this.x0;
        path.lineTo((0.5f * f) - f10, f4);
        path.rLineTo(f10, f10);
        path.rLineTo(f10, -f10);
        path.lineTo(f - f2, f4);
        path.arcTo(f6, f5, f, f4, 90.0f, -90.0f, false);
        path.rLineTo(0.0f, -f5);
    }

    public void setBackground(Drawable drawable) {
    }

    public void setBackgroundColor(int i) {
    }

    public final void setCurrentAudioPosition(long j) {
        setText(tfg.c(j));
    }

    public final void setLayoutPosition(float f) {
        setX(f - (((float) getMeasuredWidth()) * 0.5f));
    }
}
