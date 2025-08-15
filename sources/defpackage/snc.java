package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: snc  reason: default package */
public final class snc extends g06 implements nnc {
    public float A0 = 0.0f;
    public boolean B0 = false;
    public boolean C0 = false;
    public final Path D0 = new Path();
    public final Path E0 = new Path();
    public final RectF F0 = new RectF();
    public final int X = 1;
    public final RectF Y = new RectF();
    public RectF Z;
    public Matrix s0;
    public final float[] t0 = new float[8];
    public final float[] u0 = new float[8];
    public final Paint v0 = new Paint(1);
    public boolean w0 = false;
    public float x0 = 0.0f;
    public int y0 = 0;
    public int z0 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public snc(Drawable drawable) {
        super(drawable);
        drawable.getClass();
    }

    public final void a(int i, float f) {
        this.y0 = i;
        this.x0 = f;
        p();
        invalidateSelf();
    }

    public final void b(boolean z) {
        this.w0 = z;
        p();
        invalidateSelf();
    }

    public final void c() {
        Arrays.fill(this.t0, 0.0f);
        p();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        RectF rectF = this.Y;
        rectF.set(getBounds());
        int s = au1.s(this.X);
        Path path = this.D0;
        Paint paint = this.v0;
        if (s == 0) {
            if (this.B0) {
                RectF rectF2 = this.Z;
                if (rectF2 == null) {
                    this.Z = new RectF(rectF);
                    this.s0 = new Matrix();
                } else {
                    rectF2.set(rectF);
                }
                RectF rectF3 = this.Z;
                float f = this.x0;
                rectF3.inset(f, f);
                Matrix matrix = this.s0;
                if (matrix != null) {
                    matrix.setRectToRect(rectF, this.Z, Matrix.ScaleToFit.FILL);
                }
                int save = canvas.save();
                canvas.clipRect(rectF);
                canvas.concat(this.s0);
                super.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                super.draw(canvas);
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.z0);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(this.C0);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
            if (this.w0) {
                float width = ((rectF.width() - rectF.height()) + this.x0) / 2.0f;
                float height = ((rectF.height() - rectF.width()) + this.x0) / 2.0f;
                if (width > 0.0f) {
                    float f2 = rectF.left;
                    Canvas canvas2 = canvas;
                    Paint paint2 = paint;
                    canvas2.drawRect(f2, rectF.top, f2 + width, rectF.bottom, paint2);
                    float f3 = rectF.right;
                    canvas2.drawRect(f3 - width, rectF.top, f3, rectF.bottom, paint2);
                }
                if (height > 0.0f) {
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    Canvas canvas3 = canvas;
                    Paint paint3 = paint;
                    canvas3.drawRect(f4, f5, rectF.right, f5 + height, paint3);
                    float f6 = rectF.left;
                    float f7 = rectF.bottom;
                    canvas3.drawRect(f6, f7 - height, rectF.right, f7, paint3);
                }
            }
        } else if (s == 1) {
            int save2 = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.y0 != 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.y0);
            paint.setStrokeWidth(this.x0);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.E0, paint);
        }
    }

    public final void e(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            invalidateSelf();
        }
    }

    public final void g() {
    }

    public final void i(float f) {
        this.A0 = f;
        p();
        invalidateSelf();
    }

    public final void k() {
        this.B0 = false;
        p();
        invalidateSelf();
    }

    public final void m(float[] fArr) {
        float[] fArr2 = this.t0;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            od2.k("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        p();
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        p();
    }

    public final void p() {
        float[] fArr;
        Path path = this.D0;
        path.reset();
        Path path2 = this.E0;
        path2.reset();
        RectF rectF = this.F0;
        rectF.set(getBounds());
        float f = this.A0;
        rectF.inset(f, f);
        if (this.X == 1) {
            path.addRect(rectF, Path.Direction.CW);
        }
        boolean z = this.w0;
        float[] fArr2 = this.t0;
        if (z) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f2 = -this.A0;
        rectF.inset(f2, f2);
        float f3 = this.x0 / 2.0f;
        rectF.inset(f3, f3);
        if (this.w0) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.u0;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (fArr2[i] + this.A0) - (this.x0 / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f4 = (-this.x0) / 2.0f;
        rectF.inset(f4, f4);
    }
}
