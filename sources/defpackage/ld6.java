package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.ImageView;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: ld6  reason: default package */
public final class ld6 extends ImageView {
    public final Paint a;
    public LinearGradient b;
    public final Matrix c = new Matrix();
    public kd6 o = new kd6(-1, 7000, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, 15.0f, 48);
    public float s0;
    public ValueAnimator t0;

    public ld6(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.a = paint;
    }

    public final void a() {
        this.s0 = -((float) getWidth());
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kd6 kd6 = this.o;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-((float) getWidth()), (((float) getWidth()) * kd6.e) + ((float) getWidth())});
        ofFloat.setDuration(kd6.c);
        ofFloat.setStartDelay(kd6.b);
        ofFloat.setRepeatCount(kd6.a);
        ofFloat.setRepeatMode(1);
        ofFloat.addUpdateListener(new z00(9, (Object) this));
        ofFloat.start();
        this.t0 = ofFloat;
    }

    public final kd6 getAnimConfig() {
        return this.o;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void onDraw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null);
        super.onDraw(canvas);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setRotate(this.o.d, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        matrix.postTranslate(this.s0, 0.0f);
        LinearGradient linearGradient = this.b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.a);
        canvas.restoreToCount(saveLayer);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, ((float) i) * this.o.e, 0.0f, new int[]{0, ote.b0(-1, 0.3f), 0}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = linearGradient;
        this.a.setShader(linearGradient);
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.setFloatValues(new float[]{-((float) getWidth()), (((float) getWidth()) * this.o.e) + ((float) getWidth())});
        }
        this.s0 = -((float) getWidth());
    }

    public final void setAnimConfig(kd6 kd6) {
        this.o = kd6;
    }
}
