package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: psc  reason: default package */
public final class psc extends g06 {
    public rsc X;
    public Float Y;
    public PointF Z;
    public int s0;
    public int t0;
    public Matrix u0;
    public final Matrix v0 = new Matrix();

    public psc(Drawable drawable, rsc rsc) {
        super(drawable);
        this.X = rsc;
    }

    public final void d(Matrix matrix) {
        n(matrix);
        q();
        Matrix matrix2 = this.u0;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    public final void draw(Canvas canvas) {
        q();
        if (this.u0 != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.u0);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public final Drawable o(Drawable drawable) {
        Drawable o = super.o(drawable);
        p();
        return o;
    }

    public final void onBoundsChange(Rect rect) {
        p();
    }

    public final void p() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.t0 = 0;
            this.s0 = 0;
            this.u0 = null;
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.s0 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.t0 = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.u0 = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            drawable.setBounds(bounds);
            this.u0 = null;
        } else if (this.X == ssc.r) {
            drawable.setBounds(bounds);
            this.u0 = null;
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            Matrix matrix = this.v0;
            matrix.reset();
            rsc rsc = this.X;
            PointF pointF = this.Z;
            rsc.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.u0 = matrix;
        }
    }

    public final void q() {
        boolean z;
        rsc rsc = this.X;
        if (rsc instanceof qsc) {
            Float valueOf = Float.valueOf(((qsc) rsc).j);
            z = !valueOf.equals(this.Y);
            this.Y = valueOf;
        } else {
            z = false;
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.s0 != drawable.getIntrinsicWidth() || this.t0 != drawable.getIntrinsicHeight() || z) {
                p();
            }
        }
    }

    public final void r(PointF pointF) {
        if (!j47.B(this.Z, pointF)) {
            if (pointF == null) {
                this.Z = null;
            } else {
                if (this.Z == null) {
                    this.Z = new PointF();
                }
                this.Z.set(pointF);
            }
            p();
            invalidateSelf();
        }
    }
}
