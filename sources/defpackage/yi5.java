package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: yi5  reason: default package */
public final class yi5 extends Drawable {
    public final Paint a;
    public ui5 b;
    public ui5 c;
    public float d = 1.0f;
    public float e;
    public float f;
    public final float g = 1.0f;
    public final wi5 h = new wi5(this);
    public final xi5 i = new xi5(this);
    public long j;

    public yi5() {
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.a = paint;
        ui5 ui5 = ui5.a;
        this.b = ui5;
        this.c = ui5;
    }

    public final vi5 a() {
        ui5 ui5 = this.b;
        ui5 ui52 = this.c;
        int ordinal = ui5.ordinal();
        if (ordinal == 0) {
            int ordinal2 = ui52.ordinal();
            if (ordinal2 == 0) {
                return vi5.a;
            }
            if (ordinal2 == 1) {
                return vi5.b;
            }
            throw new NoWhenBranchMatchedException();
        } else if (ordinal == 1) {
            int ordinal3 = ui52.ordinal();
            if (ordinal3 == 0) {
                return vi5.c;
            }
            if (ordinal3 == 1) {
                return vi5.o;
            }
            throw new NoWhenBranchMatchedException();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean b() {
        return this.f > 0.01f || this.e > 0.01f;
    }

    public final void c(int i2, int i3) {
        wi5 wi5 = this.h;
        long j2 = wi5.f;
        int i4 = (int) (j2 >> 32);
        xi5 xi5 = this.i;
        if (!(i4 == i2 && ((int) (j2 >> 32)) == i3 && xi5.j == i3)) {
            invalidateSelf();
        }
        wi5.f = dy7.l(i2, i3);
        xi5.j = i3;
    }

    public final void draw(Canvas canvas) {
        if (b()) {
            wi5 wi5 = this.h;
            if (wi5.h >= 0.01f) {
                float f2 = wi5.i;
                if (f2 < 0.99f) {
                    float interpolation = wi5.g.getInterpolation(f2);
                    float b2 = wmd.b(interpolation, wi5.d);
                    float b3 = wmd.b(interpolation, wi5.c) / ((float) 2);
                    float b4 = wmd.b(interpolation, wi5.a);
                    float b5 = wmd.b(interpolation, wi5.b);
                    yi5 yi5 = wi5.k;
                    Paint paint = yi5.a;
                    long j2 = wi5.f;
                    paint.setColor(f8.G(s63.c((int) (j2 >> 32), interpolation, (int) (j2 & 4294967295L)), wi5.h * yi5.e * yi5.d));
                    Paint paint2 = yi5.a;
                    paint2.setStrokeWidth(wi5.e);
                    canvas.drawLine(b4, b5, b4, b5 - b2, paint2);
                    float f3 = b5 - b3;
                    canvas.drawLine(b4, b5, b4 - b3, f3, paint2);
                    canvas.drawLine(b4, b5, b4 + b3, f3, paint2);
                }
            }
            xi5 xi5 = this.i;
            if (xi5.i >= 0.01f) {
                float f4 = xi5.c;
                float f5 = xi5.d;
                float f6 = ((xi5.f * 360.0f) + 90.0f) % 360.0f;
                float d2 = ote.d(xi5.g * 360.0f, 3.0f, 360.0f);
                yi5 yi52 = xi5.m;
                yi52.a.setColor(f8.G(xi5.j, xi5.i * yi52.e * yi52.d));
                Paint paint3 = yi52.a;
                paint3.setStrokeWidth(xi5.e);
                canvas.drawArc(0.0f, 0.0f, f4, f5, f6, d2, false, paint3);
                float f7 = xi5.k;
                if (f7 > 0.01f) {
                    float interpolation2 = xi5.l.getInterpolation(f7);
                    float f8 = (interpolation2 * 1.5707964f) - 5.7168145f;
                    float f9 = (float) 2;
                    float f10 = f4 / f9;
                    float f11 = f5 / f9;
                    float f12 = xi5.a;
                    float f13 = (float) xi5.b;
                    float f14 = (f10 * f12) - f13;
                    float f15 = (f12 * f11) - f13;
                    double d3 = (double) f8;
                    double d4 = (double) (f8 + 1.5707964f);
                    paint3.setColor(f8.G(paint3.getColor(), xi5.i * interpolation2 * yi52.e * yi52.d));
                    float cos = ((float) Math.cos(d3)) * f14;
                    float sin = ((float) Math.sin(d3)) * f15;
                    Paint paint4 = paint3;
                    canvas.drawLine(f10 - cos, f11 - sin, f10 + cos, f11 + sin, paint4);
                    float cos2 = f14 * ((float) Math.cos(d4));
                    float sin2 = f15 * ((float) Math.sin(d4));
                    canvas.drawLine(f10 - cos2, f11 - sin2, f10 + cos2, f11 + sin2, paint4);
                }
            }
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i2) {
        this.d = ((float) i2) / 255.0f;
    }

    public final void setBounds(int i2, int i3, int i4, int i5) {
        int abs = Math.abs(i4 - i2);
        int abs2 = Math.abs(i5 - i3);
        float f2 = (float) abs;
        float f3 = f2 / 2.0f;
        long k = mr0.k(f3, f3);
        wi5 wi5 = this.h;
        wi5.a = k;
        float f4 = (float) abs2;
        wi5.b = wmd.m(wi5.b, 0.0f, f4, 1);
        xi5 xi5 = this.i;
        xi5.c = f2;
        xi5.d = f4;
        super.setBounds(i2, i3, i4, i5);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final String toString() {
        return naf.h("(%s(%s), %.1f -> %.1f, %s, %s)", this.b, a(), Float.valueOf(this.e), Float.valueOf(this.f), this.h.toString(), this.i.toString());
    }
}
