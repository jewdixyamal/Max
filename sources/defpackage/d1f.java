package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: d1f  reason: default package */
public abstract class d1f extends AppCompatImageView {
    public String A0;
    public float B0;
    public final float[] o = new float[8];
    public final float[] s0 = new float[2];
    public final float[] t0 = new float[9];
    public final Matrix u0 = new Matrix();
    public float[] v0;
    public float[] w0;
    public boolean x0 = false;
    public boolean y0 = false;
    public int z0 = 0;

    /* JADX WARNING: type inference failed for: r5v11, types: [zmc, java.lang.Object] */
    public d1f(Context context) {
        super(context, (AttributeSet) null, 0);
        wa6 wa6 = (wa6) this;
        wa6.setScaleType(ImageView.ScaleType.MATRIX);
        wa6.P0 = new GestureDetector(wa6.getContext(), new q00(11, wa6), (Handler) null, true);
        wa6.N0 = new ScaleGestureDetector(wa6.getContext(), new va6(wa6));
        gaa gaa = new gaa((Object) wa6);
        ? obj = new Object();
        obj.i = gaa;
        obj.e = -1;
        obj.f = -1;
        wa6.O0 = obj;
    }

    public abstract void f();

    public final void g(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            Matrix matrix = this.u0;
            matrix.postTranslate(f, f2);
            setImageMatrix(matrix);
        }
    }

    public float getCurrentAngle() {
        Matrix matrix = this.u0;
        float[] fArr = f46.c;
        matrix.getValues(fArr);
        return (float) (-(Math.atan2((double) f46.L(matrix, 1), (double) fArr[0]) * 57.29577951308232d));
    }

    public float[] getCurrentImageCorners() {
        return this.o;
    }

    public Matrix getCurrentImageMatrix() {
        return this.u0;
    }

    public float[] getCurrentMatrixValues() {
        Matrix matrix = this.u0;
        float[] fArr = this.t0;
        matrix.getValues(fArr);
        return fArr;
    }

    public float getCurrentScale() {
        return f46.K(this.u0);
    }

    public String getImageOutputPath() {
        return this.A0;
    }

    public float[] getInitialImageCorners() {
        return this.v0;
    }

    public int getMaxBitmapSize() {
        if (this.z0 <= 0) {
            this.z0 = a14.f(getContext());
        }
        return this.z0;
    }

    public float getMinOverlaySize() {
        if (this.B0 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return getCurrentScale() * this.B0;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof ub5)) {
            return null;
        }
        return ((ub5) getDrawable()).b;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.x0 && !this.y0)) {
            getPaddingLeft();
            getPaddingTop();
            getWidth();
            getPaddingRight();
            getHeight();
            getPaddingBottom();
            f();
        }
    }

    public void setCurrentMatrixValues(float[] fArr) {
        Matrix matrix = this.u0;
        matrix.setValues(fArr);
        setImageMatrix(matrix);
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new ub5(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Matrix matrix2 = this.u0;
        matrix2.set(matrix);
        try {
            matrix2.mapPoints(this.o, this.v0);
            matrix2.mapPoints(this.s0, this.w0);
        } catch (Exception unused) {
        }
    }

    public void setMaxBitmapSize(int i) {
        this.z0 = i;
    }

    public void setMinImageSize(float f) {
        this.B0 = f;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setTransformImageListener(c1f c1f) {
    }
}
