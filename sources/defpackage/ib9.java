package defpackage;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: ib9  reason: default package */
public final class ib9 extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, kre {
    public static final int[] t0 = {-16724737, -16767233, -5963578};
    public static final int[] u0 = {-2500135, 14277081};
    public final int[] X;
    public final Path Y;
    public final Paint Z;
    public final Paint a = new Paint();
    public final Paint b;
    public final Matrix c;
    public LinearGradient o;
    public final je7 s0;

    public ib9() {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.b = paint;
        this.c = new Matrix();
        this.X = t0;
        this.Y = new Path();
        Paint paint2 = new Paint();
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setMaskFilter(new BlurMaskFilter(128.0f, BlurMaskFilter.Blur.NORMAL));
        this.Z = paint2;
        this.s0 = tu0.r(3, new zj7(11, this));
    }

    public final void a(int[] iArr) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) getBounds().width(), 0.0f, iArr, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.MIRROR);
        this.o = linearGradient;
        this.a.setShader(linearGradient);
    }

    public final void draw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(new RectF(getBounds()), (Paint) null);
        canvas.drawRect(getBounds(), this.a);
        canvas.drawRect(getBounds(), this.b);
        canvas.drawPath(this.Y, this.Z);
        canvas.restoreToCount(saveLayer);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return ((ValueAnimator) this.s0.getValue()).isRunning();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = this.c;
        matrix.setTranslate(floatValue, 0.0f);
        LinearGradient linearGradient = this.o;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(this.X);
        this.b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) getBounds().height(), u0, (float[]) null, Shader.TileMode.CLAMP));
        ((ValueAnimator) this.s0.getValue()).setFloatValues(new float[]{((float) getBounds().width()) * 2.0f, 0.0f});
        int height = getBounds().height();
        Path path = this.Y;
        path.reset();
        float width = ((float) getBounds().width()) / 2.0f;
        float f = fk4.d().getDisplayMetrics().density * 24.0f;
        float f2 = (float) height;
        path.addOval(0.0f - width, (f2 - (fk4.d().getDisplayMetrics().density * 187.0f)) + f, ((float) getBounds().width()) + width, f2 + f, Path.Direction.CW);
    }

    public final void onThemeChanged(fka fka) {
        a(t0);
        this.Z.setColor(fka.b().k);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.Z.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.Z.setColorFilter(colorFilter);
    }

    public final void start() {
        je7 je7 = this.s0;
        if (!((ValueAnimator) je7.getValue()).isRunning()) {
            ((ValueAnimator) je7.getValue()).start();
        }
    }

    public final void stop() {
        ((ValueAnimator) this.s0.getValue()).cancel();
    }
}
