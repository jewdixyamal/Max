package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: tnc  reason: default package */
public abstract class tnc extends Drawable implements nnc, a1f {
    public RectF A0;
    public final Matrix B0 = new Matrix();
    public final Matrix C0 = new Matrix();
    public final Matrix D0 = new Matrix();
    public final Matrix E0 = new Matrix();
    public final Matrix F0 = new Matrix();
    public Matrix G0;
    public Matrix H0;
    public final Matrix I0 = new Matrix();
    public float J0 = 0.0f;
    public boolean K0 = false;
    public boolean L0 = false;
    public boolean M0 = true;
    public b1f N0;
    public final Path X = new Path();
    public boolean Y = true;
    public int Z = 0;
    public final Drawable a;
    public boolean b = false;
    public boolean c = false;
    public float o = 0.0f;
    public final Path s0 = new Path();
    public final float[] t0 = new float[8];
    public final float[] u0 = new float[8];
    public float[] v0;
    public final RectF w0 = new RectF();
    public final RectF x0 = new RectF();
    public final RectF y0 = new RectF();
    public final RectF z0 = new RectF();

    public tnc(Drawable drawable) {
        this.a = drawable;
    }

    public final void a(int i, float f) {
        if (this.Z != i || this.o != f) {
            this.Z = i;
            this.o = f;
            this.M0 = true;
            invalidateSelf();
        }
    }

    public final void b(boolean z) {
        this.b = z;
        this.M0 = true;
        invalidateSelf();
    }

    public final void c() {
        Arrays.fill(this.t0, 0.0f);
        this.c = false;
        this.M0 = true;
        invalidateSelf();
    }

    public final void clearColorFilter() {
        this.a.clearColorFilter();
    }

    public final void d() {
        if (this.M0) {
            Path path = this.s0;
            path.reset();
            RectF rectF = this.w0;
            float f = this.o;
            rectF.inset(f / 2.0f, f / 2.0f);
            boolean z = this.b;
            float[] fArr = this.u0;
            float[] fArr2 = this.t0;
            if (z) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                for (int i = 0; i < fArr.length; i++) {
                    fArr[i] = (fArr2[i] + this.J0) - (this.o / 2.0f);
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = this.o;
            rectF.inset((-f2) / 2.0f, (-f2) / 2.0f);
            Path path2 = this.X;
            path2.reset();
            float f3 = this.J0 + (this.K0 ? this.o : 0.0f);
            rectF.inset(f3, f3);
            if (this.b) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else if (this.K0) {
                if (this.v0 == null) {
                    this.v0 = new float[8];
                }
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    this.v0[i2] = fArr2[i2] - this.o;
                }
                path2.addRoundRect(rectF, this.v0, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.M0 = false;
        }
    }

    public void draw(Canvas canvas) {
        if (f46.W()) {
            f46.e("RoundedDrawable#draw");
        }
        this.a.draw(canvas);
        if (f46.W()) {
            f46.A();
        }
    }

    public final void e(boolean z) {
        if (this.L0 != z) {
            this.L0 = z;
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (((r4 == null && r7 == null) ? true : (r4 == null || r7 == null) ? false : r4.equals(r7)) == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
            r8 = this;
            b1f r0 = r8.N0
            android.graphics.Matrix r1 = r8.D0
            android.graphics.RectF r2 = r8.w0
            if (r0 == 0) goto L_0x0011
            r0.d(r1)
            b1f r0 = r8.N0
            r0.h(r2)
            goto L_0x001b
        L_0x0011:
            r1.reset()
            android.graphics.Rect r0 = r8.getBounds()
            r2.set(r0)
        L_0x001b:
            android.graphics.RectF r0 = r8.y0
            android.graphics.drawable.Drawable r3 = r8.a
            int r4 = r3.getIntrinsicWidth()
            float r4 = (float) r4
            int r5 = r3.getIntrinsicHeight()
            float r5 = (float) r5
            r6 = 0
            r0.set(r6, r6, r4, r5)
            android.graphics.RectF r4 = r8.z0
            android.graphics.Rect r3 = r3.getBounds()
            r4.set(r3)
            android.graphics.Matrix r3 = r8.B0
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.FILL
            r3.setRectToRect(r0, r4, r5)
            boolean r0 = r8.K0
            if (r0 == 0) goto L_0x006a
            android.graphics.RectF r0 = r8.A0
            if (r0 != 0) goto L_0x004d
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r2)
            r8.A0 = r0
            goto L_0x0050
        L_0x004d:
            r0.set(r2)
        L_0x0050:
            android.graphics.RectF r0 = r8.A0
            float r4 = r8.o
            r0.inset(r4, r4)
            android.graphics.Matrix r0 = r8.G0
            if (r0 != 0) goto L_0x0062
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r8.G0 = r0
        L_0x0062:
            android.graphics.Matrix r0 = r8.G0
            android.graphics.RectF r4 = r8.A0
            r0.setRectToRect(r2, r4, r5)
            goto L_0x0071
        L_0x006a:
            android.graphics.Matrix r0 = r8.G0
            if (r0 == 0) goto L_0x0071
            r0.reset()
        L_0x0071:
            android.graphics.Matrix r0 = r8.E0
            boolean r4 = r1.equals(r0)
            android.graphics.Matrix r5 = r8.C0
            r6 = 1
            if (r4 == 0) goto L_0x009b
            boolean r4 = r3.equals(r5)
            if (r4 == 0) goto L_0x009b
            android.graphics.Matrix r4 = r8.G0
            if (r4 == 0) goto L_0x00df
            android.graphics.Matrix r7 = r8.H0
            if (r4 != 0) goto L_0x008e
            if (r7 != 0) goto L_0x008e
            r4 = r6
            goto L_0x0099
        L_0x008e:
            if (r4 == 0) goto L_0x0098
            if (r7 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            boolean r4 = r4.equals(r7)
            goto L_0x0099
        L_0x0098:
            r4 = 0
        L_0x0099:
            if (r4 != 0) goto L_0x00df
        L_0x009b:
            r8.Y = r6
            android.graphics.Matrix r4 = r8.F0
            r1.invert(r4)
            android.graphics.Matrix r4 = r8.I0
            r4.set(r1)
            boolean r7 = r8.K0
            if (r7 == 0) goto L_0x00b2
            android.graphics.Matrix r7 = r8.G0
            if (r7 == 0) goto L_0x00b2
            r4.postConcat(r7)
        L_0x00b2:
            r4.preConcat(r3)
            r0.set(r1)
            r5.set(r3)
            boolean r0 = r8.K0
            if (r0 == 0) goto L_0x00d8
            android.graphics.Matrix r0 = r8.H0
            if (r0 != 0) goto L_0x00d2
            android.graphics.Matrix r0 = r8.G0
            if (r0 != 0) goto L_0x00c9
            r0 = 0
            goto L_0x00cf
        L_0x00c9:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>(r0)
            r0 = r1
        L_0x00cf:
            r8.H0 = r0
            goto L_0x00df
        L_0x00d2:
            android.graphics.Matrix r1 = r8.G0
            r0.set(r1)
            goto L_0x00df
        L_0x00d8:
            android.graphics.Matrix r0 = r8.H0
            if (r0 == 0) goto L_0x00df
            r0.reset()
        L_0x00df:
            android.graphics.RectF r0 = r8.x0
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L_0x00ec
            r8.M0 = r6
            r0.set(r2)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnc.f():void");
    }

    public void g() {
    }

    public final int getAlpha() {
        return this.a.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final void i(float f) {
        if (this.J0 != f) {
            this.J0 = f;
            this.M0 = true;
            invalidateSelf();
        }
    }

    public final void k() {
        if (this.K0) {
            this.K0 = false;
            this.M0 = true;
            invalidateSelf();
        }
    }

    public final void l(b1f b1f) {
        this.N0 = b1f;
    }

    public final void m(float[] fArr) {
        float[] fArr2 = this.t0;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.c = false;
        } else {
            od2.k("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.c = false;
            for (int i = 0; i < 8; i++) {
                this.c |= fArr[i] > 0.0f;
            }
        }
        this.M0 = true;
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.a.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
