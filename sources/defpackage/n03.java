package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: n03  reason: default package */
public final class n03 extends q18 implements Drawable.Callback, cpe {
    public static final int[] S1 = {16842910};
    public static final ShapeDrawable T1 = new ShapeDrawable(new OvalShape());
    public int A1;
    public int B1;
    public int C1;
    public boolean D1;
    public int E1;
    public int F1 = 255;
    public ColorFilter G1;
    public PorterDuffColorFilter H1;
    public ColorStateList I1;
    public ColorStateList J0;
    public PorterDuff.Mode J1 = PorterDuff.Mode.SRC_IN;
    public ColorStateList K0;
    public int[] K1;
    public float L0;
    public boolean L1;
    public float M0 = -1.0f;
    public ColorStateList M1;
    public ColorStateList N0;
    public WeakReference N1 = new WeakReference((Object) null);
    public float O0;
    public TextUtils.TruncateAt O1;
    public ColorStateList P0;
    public boolean P1;
    public CharSequence Q0;
    public int Q1;
    public boolean R0;
    public boolean R1;
    public Drawable S0;
    public ColorStateList T0;
    public float U0;
    public boolean V0;
    public boolean W0;
    public Drawable X0;
    public RippleDrawable Y0;
    public ColorStateList Z0;
    public float a1;
    public SpannableStringBuilder b1;
    public boolean c1;
    public boolean d1;
    public Drawable e1;
    public ColorStateList f1;
    public wc9 g1;
    public wc9 h1;
    public float i1;
    public float j1;
    public float k1;
    public float l1;
    public float m1;
    public float n1;
    public float o1;
    public float p1;
    public final Context q1;
    public final Paint r1 = new Paint(1);
    public final Paint.FontMetrics s1 = new Paint.FontMetrics();
    public final RectF t1 = new RectF();
    public final PointF u1 = new PointF();
    public final Path v1 = new Path();
    public final dpe w1;
    public int x1;
    public int y1;
    public int z1;

    public n03(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        j(context);
        this.q1 = context;
        dpe dpe = new dpe(this);
        this.w1 = dpe;
        this.Q0 = "";
        dpe.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = S1;
        setState(iArr);
        if (!Arrays.equals(this.K1, iArr)) {
            this.K1 = iArr;
            if (W()) {
                z(getState(), iArr);
            }
        }
        this.P1 = true;
        T1.setTint(-1);
    }

    public static void X(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z) {
        if (this.c1 != z) {
            this.c1 = z;
            float t = t();
            if (!z && this.D1) {
                this.D1 = false;
            }
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void B(Drawable drawable) {
        if (this.e1 != drawable) {
            float t = t();
            this.e1 = drawable;
            float t2 = t();
            X(this.e1);
            r(this.e1);
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f1 != colorStateList) {
            this.f1 = colorStateList;
            if (this.d1 && (drawable = this.e1) != null && this.c1) {
                aq4.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z) {
        if (this.d1 != z) {
            boolean U = U();
            this.d1 = z;
            boolean U2 = U();
            if (U != U2) {
                if (U2) {
                    r(this.e1);
                } else {
                    X(this.e1);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void E(float f) {
        if (this.M0 != f) {
            this.M0 = f;
            i8g e = this.a.a.e();
            e.e = new a0(f);
            e.f = new a0(f);
            e.g = new a0(f);
            e.h = new a0(f);
            setShapeAppearanceModel(e.c());
        }
    }

    public final void F(Drawable drawable) {
        Drawable drawable2 = this.S0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof y8g) {
            ((z8g) ((y8g) drawable2)).getClass();
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float t = t();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.S0 = drawable3;
            float t2 = t();
            X(drawable2);
            if (V()) {
                r(this.S0);
            }
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void G(float f) {
        if (this.U0 != f) {
            float t = t();
            this.U0 = f;
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        this.V0 = true;
        if (this.T0 != colorStateList) {
            this.T0 = colorStateList;
            if (V()) {
                aq4.h(this.S0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z) {
        if (this.R0 != z) {
            boolean V = V();
            this.R0 = z;
            boolean V2 = V();
            if (V != V2) {
                if (V2) {
                    r(this.S0);
                } else {
                    X(this.S0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            if (this.R1) {
                n(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(float f) {
        if (this.O0 != f) {
            this.O0 = f;
            this.r1.setStrokeWidth(f);
            if (this.R1) {
                this.a.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2 = this.X0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof y8g) {
            ((z8g) ((y8g) drawable2)).getClass();
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float u = u();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.X0 = drawable3;
            ColorStateList colorStateList = this.P0;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.Y0 = new RippleDrawable(colorStateList, this.X0, T1);
            float u2 = u();
            X(drawable2);
            if (W()) {
                r(this.X0);
            }
            invalidateSelf();
            if (u != u2) {
                y();
            }
        }
    }

    public final void M(float f) {
        if (this.o1 != f) {
            this.o1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void N(float f) {
        if (this.a1 != f) {
            this.a1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void O(float f) {
        if (this.n1 != f) {
            this.n1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.Z0 != colorStateList) {
            this.Z0 = colorStateList;
            if (W()) {
                aq4.h(this.X0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z) {
        if (this.W0 != z) {
            boolean W = W();
            this.W0 = z;
            boolean W2 = W();
            if (W != W2) {
                if (W2) {
                    r(this.X0);
                } else {
                    X(this.X0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void R(float f) {
        if (this.k1 != f) {
            float t = t();
            this.k1 = f;
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void S(float f) {
        if (this.j1 != f) {
            float t = t();
            this.j1 = f;
            float t2 = t();
            invalidateSelf();
            if (t != t2) {
                y();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        if (this.P0 != colorStateList) {
            this.P0 = colorStateList;
            if (!this.L1) {
                colorStateList = null;
            } else if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.M1 = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean U() {
        return this.d1 && this.e1 != null && this.D1;
    }

    public final boolean V() {
        return this.R0 && this.S0 != null;
    }

    public final boolean W() {
        return this.W0 && this.X0 != null;
    }

    public final void a() {
        y();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.F1) != 0) {
            int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i) : 0;
            boolean z = this.R1;
            Paint paint = this.r1;
            RectF rectF3 = this.t1;
            if (!z) {
                paint.setColor(this.x1);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, v(), v(), paint);
            }
            if (!this.R1) {
                paint.setColor(this.y1);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.G1;
                if (colorFilter == null) {
                    colorFilter = this.H1;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, v(), v(), paint);
            }
            if (this.R1) {
                super.draw(canvas);
            }
            if (this.O0 > 0.0f && !this.R1) {
                paint.setColor(this.A1);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.R1) {
                    ColorFilter colorFilter2 = this.G1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.H1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f = this.O0 / 2.0f;
                rectF3.set(((float) bounds.left) + f, ((float) bounds.top) + f, ((float) bounds.right) - f, ((float) bounds.bottom) - f);
                float f2 = this.M0 - (this.O0 / 2.0f);
                canvas2.drawRoundRect(rectF3, f2, f2, paint);
            }
            paint.setColor(this.B1);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.R1) {
                canvas2.drawRoundRect(rectF3, v(), v(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.v1;
                p18 p18 = this.a;
                this.C0.d(p18.a, p18.j, rectF4, this.B0, path);
                f(canvas, paint, path, this.a.a, h());
            }
            if (V()) {
                s(bounds, rectF3);
                float f3 = rectF3.left;
                float f4 = rectF3.top;
                canvas2.translate(f3, f4);
                this.S0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.S0.draw(canvas2);
                canvas2.translate(-f3, -f4);
            }
            if (U()) {
                s(bounds, rectF3);
                float f5 = rectF3.left;
                float f6 = rectF3.top;
                canvas2.translate(f5, f6);
                this.e1.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.e1.draw(canvas2);
                canvas2.translate(-f5, -f6);
            }
            if (!this.P1 || this.Q0 == null) {
                rectF = rectF3;
                i3 = saveLayerAlpha;
                i2 = 0;
                i4 = 255;
            } else {
                PointF pointF = this.u1;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.Q0;
                dpe dpe = this.w1;
                if (charSequence != null) {
                    float t = t() + this.i1 + this.l1;
                    if (bq4.a(this) == 0) {
                        pointF.x = ((float) bounds.left) + t;
                    } else {
                        pointF.x = ((float) bounds.right) - t;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = dpe.a;
                    Paint.FontMetrics fontMetrics = this.s1;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.Q0 != null) {
                    float t2 = t() + this.i1 + this.l1;
                    float u = u() + this.p1 + this.m1;
                    if (bq4.a(this) == 0) {
                        rectF3.left = ((float) bounds.left) + t2;
                        rectF3.right = ((float) bounds.right) - u;
                    } else {
                        rectF3.left = ((float) bounds.left) + u;
                        rectF3.right = ((float) bounds.right) - t2;
                    }
                    rectF3.top = (float) bounds.top;
                    rectF3.bottom = (float) bounds.bottom;
                }
                voe voe = dpe.g;
                TextPaint textPaint2 = dpe.a;
                if (voe != null) {
                    textPaint2.drawableState = getState();
                    dpe.g.e(this.q1, textPaint2, dpe.b);
                }
                textPaint2.setTextAlign(align);
                boolean z2 = Math.round(dpe.a(this.Q0.toString())) > Math.round(rectF3.width());
                if (z2) {
                    i5 = canvas.save();
                    canvas2.clipRect(rectF3);
                } else {
                    i5 = 0;
                }
                CharSequence charSequence2 = this.Q0;
                if (z2 && this.O1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.O1);
                }
                CharSequence charSequence3 = charSequence2;
                rectF = rectF3;
                int length = charSequence3.length();
                i3 = saveLayerAlpha;
                float f7 = pointF.x;
                i2 = 0;
                float f8 = pointF.y;
                i4 = 255;
                canvas.drawText(charSequence3, 0, length, f7, f8, textPaint2);
                if (z2) {
                    canvas2.restoreToCount(i5);
                }
            }
            if (W()) {
                rectF.setEmpty();
                if (W()) {
                    float f9 = this.p1 + this.o1;
                    if (bq4.a(this) == 0) {
                        float f10 = ((float) bounds.right) - f9;
                        rectF2 = rectF;
                        rectF2.right = f10;
                        rectF2.left = f10 - this.a1;
                    } else {
                        rectF2 = rectF;
                        float f11 = ((float) bounds.left) + f9;
                        rectF2.left = f11;
                        rectF2.right = f11 + this.a1;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f12 = this.a1;
                    float f13 = exactCenterY - (f12 / 2.0f);
                    rectF2.top = f13;
                    rectF2.bottom = f13 + f12;
                } else {
                    rectF2 = rectF;
                }
                float f14 = rectF2.left;
                float f15 = rectF2.top;
                canvas2.translate(f14, f15);
                this.X0.setBounds(i2, i2, (int) rectF2.width(), (int) rectF2.height());
                this.Y0.setBounds(this.X0.getBounds());
                this.Y0.jumpToCurrentState();
                this.Y0.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.F1 < i4) {
                canvas2.restoreToCount(i3);
            }
        }
    }

    public final int getAlpha() {
        return this.F1;
    }

    public final ColorFilter getColorFilter() {
        return this.G1;
    }

    public final int getIntrinsicHeight() {
        return (int) this.L0;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(u() + this.w1.a(this.Q0.toString()) + t() + this.i1 + this.l1 + this.m1 + this.p1), this.Q1);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (this.R1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.M0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.L0, this.M0);
        }
        outline.setAlpha(((float) this.F1) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r0 = (r0 = r1.w1.g).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.J0
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r0 = r1.K0
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r0 = r1.N0
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
            boolean r0 = r1.L1
            if (r0 == 0) goto L_0x0024
            android.content.res.ColorStateList r0 = r1.M1
            boolean r0 = w(r0)
            if (r0 != 0) goto L_0x005d
        L_0x0024:
            dpe r0 = r1.w1
            voe r0 = r0.g
            if (r0 == 0) goto L_0x0035
            android.content.res.ColorStateList r0 = r0.j
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0035
            goto L_0x005d
        L_0x0035:
            boolean r0 = r1.d1
            if (r0 == 0) goto L_0x0042
            android.graphics.drawable.Drawable r0 = r1.e1
            if (r0 == 0) goto L_0x0042
            boolean r0 = r1.c1
            if (r0 == 0) goto L_0x0042
            goto L_0x005d
        L_0x0042:
            android.graphics.drawable.Drawable r0 = r1.S0
            boolean r0 = x(r0)
            if (r0 != 0) goto L_0x005d
            android.graphics.drawable.Drawable r0 = r1.e1
            boolean r0 = x(r0)
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r1 = r1.I1
            boolean r1 = w(r1)
            if (r1 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r1 = 0
            goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n03.isStateful():boolean");
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (V()) {
            onLayoutDirectionChanged |= bq4.b(this.S0, i);
        }
        if (U()) {
            onLayoutDirectionChanged |= bq4.b(this.e1, i);
        }
        if (W()) {
            onLayoutDirectionChanged |= bq4.b(this.X0, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (V()) {
            onLevelChange |= this.S0.setLevel(i);
        }
        if (U()) {
            onLevelChange |= this.e1.setLevel(i);
        }
        if (W()) {
            onLevelChange |= this.X0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.R1) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.K1);
    }

    public final void r(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            bq4.b(drawable, bq4.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.X0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.K1);
                }
                aq4.h(drawable, this.Z0);
                return;
            }
            Drawable drawable2 = this.S0;
            if (drawable == drawable2 && this.V0) {
                aq4.h(drawable2, this.T0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void s(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (V() || U()) {
            float f = this.i1 + this.j1;
            Drawable drawable = this.D1 ? this.e1 : this.S0;
            float f2 = this.U0;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (bq4.a(this) == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.D1 ? this.e1 : this.S0;
            float f5 = this.U0;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil((double) mqd.h(this.q1, 24));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.F1 != i) {
            this.F1 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.G1 != colorFilter) {
            this.G1 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.I1 != colorStateList) {
            this.I1 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.J1 != mode) {
            this.J1 = mode;
            ColorStateList colorStateList = this.I1;
            this.H1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (V()) {
            visible |= this.S0.setVisible(z, z2);
        }
        if (U()) {
            visible |= this.e1.setVisible(z, z2);
        }
        if (W()) {
            visible |= this.X0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (!V() && !U()) {
            return 0.0f;
        }
        float f = this.j1;
        Drawable drawable = this.D1 ? this.e1 : this.S0;
        float f2 = this.U0;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f2 + f + this.k1;
    }

    public final float u() {
        if (W()) {
            return this.n1 + this.a1 + this.o1;
        }
        return 0.0f;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        return this.R1 ? this.a.a.e.a(h()) : this.M0;
    }

    public final void y() {
        m03 m03 = (m03) this.N1.get();
        if (m03 != null) {
            Chip chip = (Chip) m03;
            chip.d(chip.E0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean z(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.J0;
        int d = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.x1) : 0);
        boolean z3 = true;
        if (this.x1 != d) {
            this.x1 = d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.K0;
        int d2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.y1) : 0);
        if (this.y1 != d2) {
            this.y1 = d2;
            onStateChange = true;
        }
        int g = s63.g(d2, d);
        if ((this.z1 != g) || (this.a.c == null)) {
            this.z1 = g;
            l(ColorStateList.valueOf(g));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.N0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.A1) : 0;
        if (this.A1 != colorForState) {
            this.A1 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.M1 == null || !xfg.y(iArr)) ? 0 : this.M1.getColorForState(iArr, this.B1);
        if (this.B1 != colorForState2) {
            this.B1 = colorForState2;
            if (this.L1) {
                onStateChange = true;
            }
        }
        voe voe = this.w1.g;
        int colorForState3 = (voe == null || (colorStateList = voe.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.C1);
        if (this.C1 != colorForState3) {
            this.C1 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (state[i] != 16842912) {
                    i++;
                } else if (this.c1) {
                    z = true;
                }
            }
        }
        z = false;
        if (this.D1 == z || this.e1 == null) {
            z2 = false;
        } else {
            float t = t();
            this.D1 = z;
            if (t != t()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.I1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.E1) : 0;
        if (this.E1 != colorForState4) {
            this.E1 = colorForState4;
            ColorStateList colorStateList6 = this.I1;
            PorterDuff.Mode mode = this.J1;
            this.H1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z3 = onStateChange;
        }
        if (x(this.S0)) {
            z3 |= this.S0.setState(iArr);
        }
        if (x(this.e1)) {
            z3 |= this.e1.setState(iArr);
        }
        if (x(this.X0)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.X0.setState(iArr3);
        }
        if (x(this.Y0)) {
            z3 |= this.Y0.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            y();
        }
        return z3;
    }
}
