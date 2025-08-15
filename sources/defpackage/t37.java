package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import one.me.image.crop.view.ImageCropView;

/* renamed from: t37  reason: default package */
public abstract class t37 extends d1f {
    public final RectF C0 = new RectF();
    public final Matrix D0 = new Matrix();
    public final RectF E0 = new RectF();
    public float F0;
    public float G0 = 10.0f;
    public nz3 H0 = null;
    public mz3 I0;
    public r37 J0;
    public s37 K0 = null;
    public float L0;
    public float M0;

    public t37(Context context) {
        super(context);
    }

    private void setupInitialCropState(nz3 nz3) {
        Matrix matrix = this.u0;
        matrix.setValues(nz3.c);
        Matrix matrix2 = this.D0;
        matrix.invert(matrix2);
        RectF rectF = this.E0;
        RectF rectF2 = this.C0;
        rectF.set(rectF2);
        matrix2.mapRect(rectF);
        float width = rectF.width();
        RectF rectF3 = nz3.a;
        float max = Math.max(width / rectF3.width(), rectF.height() / rectF3.height());
        matrix.postScale(max, max, 0.0f, 0.0f);
        matrix.postTranslate(-f46.L(matrix, 2), -f46.L(matrix, 5));
        matrix.mapRect(rectF3);
        matrix.postTranslate(rectF2.left - rectF3.left, rectF2.top - rectF3.top);
        setImageMatrix(matrix);
    }

    public final void f() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)});
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.v0 = ngg.t(rectF);
            this.w0 = new float[]{rectF.centerX(), rectF.centerY()};
            this.y0 = true;
        }
        Drawable drawable2 = getDrawable();
        if (drawable2 != null) {
            float intrinsicWidth2 = (float) drawable2.getIntrinsicWidth();
            float intrinsicHeight2 = (float) drawable2.getIntrinsicHeight();
            if (this.F0 == 0.0f) {
                this.F0 = intrinsicWidth2 / intrinsicHeight2;
            }
            nz3 nz3 = this.H0;
            if (nz3 != null) {
                this.F0 = nz3.b;
            }
            mz3 mz3 = this.I0;
            if (mz3 != null) {
                ((ImageCropView) mz3).b.setTargetAspectRatio(this.F0);
            }
            h(intrinsicWidth2, intrinsicHeight2);
            Matrix matrix = this.u0;
            matrix.set(getInitialMatrix());
            setImageMatrix(matrix);
            nz3 nz32 = this.H0;
            if (nz32 != null) {
                setupInitialCropState(nz32);
                this.H0 = null;
            }
        }
    }

    public nz3 getCropState() {
        Matrix matrix = this.u0;
        Matrix matrix2 = this.D0;
        matrix.invert(matrix2);
        RectF rectF = this.E0;
        RectF rectF2 = this.C0;
        rectF.set(rectF2);
        matrix2.mapRect(rectF);
        matrix2.mapPoints(new float[]{rectF2.centerX(), rectF2.centerY()});
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new nz3(rectF, rectF2.width() / rectF2.height(), fArr);
    }

    public Matrix getInitialMatrix() {
        if (getDrawable() == null) {
            return new Matrix();
        }
        RectF rectF = this.C0;
        Matrix matrix = new Matrix();
        float f = this.M0;
        matrix.postScale(f, f);
        RectF rectF2 = this.E0;
        rectF2.set(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
        matrix.mapRect(rectF2);
        matrix.postTranslate((((float) getMeasuredWidth()) - rectF.width()) / 2.0f, (((float) getMeasuredHeight()) - rectF.height()) / 2.0f);
        return matrix;
    }

    public float getMaxScale() {
        return this.L0;
    }

    public float getMinScale() {
        return this.M0;
    }

    public float getTargetAspectRatio() {
        return this.F0;
    }

    public final void h(float f, float f2) {
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        Matrix matrix = this.D0;
        matrix.reset();
        matrix.setRotate(getCurrentAngle());
        float[] t = ngg.t(rectF);
        matrix.mapPoints(t);
        RectF J = ngg.J(t);
        RectF rectF2 = this.C0;
        float max = Math.max(Math.abs(rectF2.width() / J.width()), Math.abs(rectF2.height() / J.height()));
        this.M0 = max;
        this.L0 = max * this.G0;
    }

    public final boolean i(float[] fArr) {
        Matrix matrix = this.D0;
        matrix.reset();
        matrix.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        matrix.mapPoints(copyOf);
        float[] t = ngg.t(this.C0);
        matrix.mapPoints(t);
        return ngg.J(copyOf).contains(ngg.J(t));
    }

    public final void j(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            float currentScale = f / getCurrentScale();
            if (currentScale != 0.0f) {
                Matrix matrix = this.u0;
                matrix.postScale(currentScale, currentScale, f2, f3);
                setImageMatrix(matrix);
            }
        }
    }

    public void setCropBoundsChangeListener(mz3 mz3) {
        this.I0 = mz3;
    }

    public void setCropRect(RectF rectF) {
        this.F0 = rectF.width() / rectF.height();
        this.C0.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            h((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float f2;
        float f3;
        if (this.y0) {
            float[] fArr = this.o;
            if (!i(fArr)) {
                float[] fArr2 = this.s0;
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                float currentScale = getCurrentScale();
                RectF rectF = this.C0;
                float centerX = rectF.centerX() - f4;
                float centerY = rectF.centerY() - f5;
                Matrix matrix = this.D0;
                matrix.reset();
                matrix.setTranslate(centerX, centerY);
                float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                matrix.mapPoints(copyOf);
                boolean i = i(copyOf);
                if (i) {
                    matrix.reset();
                    matrix.setRotate(-getCurrentAngle());
                    float[] copyOf2 = Arrays.copyOf(fArr, fArr.length);
                    float[] t = ngg.t(rectF);
                    matrix.mapPoints(copyOf2);
                    matrix.mapPoints(t);
                    RectF J = ngg.J(copyOf2);
                    RectF J2 = ngg.J(t);
                    float f6 = J.left - J2.left;
                    float f7 = J.top - J2.top;
                    float f8 = J.right - J2.right;
                    float f9 = J.bottom - J2.bottom;
                    if (f6 <= 0.0f) {
                        f6 = 0.0f;
                    }
                    if (f7 <= 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f8 >= 0.0f) {
                        f8 = 0.0f;
                    }
                    if (f9 >= 0.0f) {
                        f9 = 0.0f;
                    }
                    float[] fArr3 = {f6, f7, f8, f9};
                    matrix.reset();
                    matrix.setRotate(getCurrentAngle());
                    matrix.mapPoints(fArr3);
                    float f10 = -(fArr3[0] + fArr3[2]);
                    f2 = -(fArr3[1] + fArr3[3]);
                    f3 = f10;
                    f = 0.0f;
                } else {
                    RectF rectF2 = new RectF(rectF);
                    matrix.reset();
                    matrix.setRotate(getCurrentAngle());
                    matrix.mapRect(rectF2);
                    RectF rectF3 = rectF2;
                    float[] fArr4 = fArr;
                    float f11 = centerX;
                    float[] fArr5 = {(float) Math.sqrt(Math.pow((double) (fArr[1] - fArr[3]), 2.0d) + Math.pow((double) (fArr[0] - fArr[2]), 2.0d)), (float) Math.sqrt(Math.pow((double) (fArr4[3] - fArr4[5]), 2.0d) + Math.pow((double) (fArr4[2] - fArr4[4]), 2.0d))};
                    f = (Math.max(rectF3.width() / fArr5[0], rectF3.height() / fArr5[1]) * currentScale) - currentScale;
                    f3 = f11;
                    f2 = centerY;
                }
                if (f != 0.0f) {
                    this.M0 = currentScale + f;
                }
                if (z) {
                    r37 r37 = new r37(this, f4, f5, f3, f2, currentScale, f, i);
                    this.J0 = r37;
                    post(r37);
                    return;
                }
                g(f3, f2);
                if (!i) {
                    j(currentScale + f, rectF.centerX(), rectF.centerY());
                }
            }
        }
    }

    public void setMaxScaleMultiplier(float f) {
        this.G0 = f;
    }
}
