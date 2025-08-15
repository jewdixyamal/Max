package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: y13  reason: default package */
public final class y13 extends wq4 {
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f;

    public final void a(Canvas canvas, Rect rect, float f2, boolean z, boolean z2) {
        float width = ((float) rect.width()) / ((float) i());
        float height = ((float) rect.height()) / ((float) i());
        tj0 tj0 = this.a;
        float f3 = (((float) ((e23) tj0).h) / 2.0f) + ((float) ((e23) tj0).i);
        canvas.translate((f3 * width) + ((float) rect.left), (f3 * height) + ((float) rect.top));
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (((e23) tj0).j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f4 = -f3;
        canvas.clipRect(f4, f4, f3, f3);
        this.e = ((e23) tj0).a / 2 <= ((e23) tj0).b;
        this.b = ((float) ((e23) tj0).a) * f2;
        this.c = ((float) Math.min(((e23) tj0).a / 2, ((e23) tj0).b)) * f2;
        float f5 = ((float) (((e23) tj0).h - ((e23) tj0).a)) / 2.0f;
        this.d = f5;
        if (z || z2) {
            if ((z && ((e23) tj0).e == 2) || (z2 && ((e23) tj0).f == 1)) {
                this.d = (((1.0f - f2) * ((float) ((e23) tj0).a)) / 2.0f) + f5;
            } else if ((z && ((e23) tj0).e == 1) || (z2 && ((e23) tj0).f == 2)) {
                this.d = f5 - (((1.0f - f2) * ((float) ((e23) tj0).a)) / 2.0f);
            }
        }
        if (!z2 || ((e23) tj0).f != 3) {
            this.f = 1.0f;
        } else {
            this.f = f2;
        }
    }

    public final void b(Canvas canvas, Paint paint, int i, int i2) {
    }

    public final void c(Canvas canvas, Paint paint, vq4 vq4, int i) {
        int j = mr0.j(vq4.c, i);
        float f2 = vq4.a;
        float f3 = vq4.b;
        int i2 = vq4.d;
        g(canvas, paint, f2, f3, j, i2, i2);
    }

    public final void d(Canvas canvas, Paint paint, float f2, float f3, int i, int i2, int i3) {
        g(canvas, paint, f2, f3, mr0.j(i, i2), i3, i3);
    }

    public final int e() {
        return i();
    }

    public final int f() {
        return i();
    }

    public final void g(Canvas canvas, Paint paint, float f2, float f3, int i, int i2, int i3) {
        Paint paint2 = paint;
        float f4 = f3 >= f2 ? f3 - f2 : (f3 + 1.0f) - f2;
        float f5 = f2 % 1.0f;
        if (this.f < 1.0f) {
            float f6 = f5 + f4;
            if (f6 > 1.0f) {
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                int i4 = i;
                g(canvas2, paint3, f5, 1.0f, i4, i2, 0);
                g(canvas2, paint3, 1.0f, f6, i4, 0, i3);
                return;
            }
        }
        float degrees = (float) Math.toDegrees((double) (this.c / this.d));
        if (f5 == 0.0f && f4 >= 0.99f) {
            f4 += (((degrees * 2.0f) / 360.0f) * (f4 - 0.99f)) / 0.01f;
        }
        float x = fp3.x(1.0f - this.f, 1.0f, f5);
        float x2 = fp3.x(0.0f, this.f, f4);
        float degrees2 = (float) Math.toDegrees((double) (((float) i2) / this.d));
        float degrees3 = ((x2 * 360.0f) - degrees2) - ((float) Math.toDegrees((double) (((float) i3) / this.d)));
        float f7 = (x * 360.0f) + degrees2;
        if (degrees3 > 0.0f) {
            paint2.setAntiAlias(true);
            paint2.setColor(i);
            paint2.setStrokeWidth(this.b);
            float f8 = degrees * 2.0f;
            if (degrees3 < f8) {
                float f9 = degrees3 / f8;
                paint2.setStyle(Paint.Style.FILL);
                h(canvas, paint, (degrees * f9) + f7, this.c * 2.0f, this.b, f9);
                return;
            }
            float f10 = this.d;
            float f11 = -f10;
            RectF rectF = new RectF(f11, f11, f10, f10);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeCap(this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f12 = f7 + degrees;
            canvas.drawArc(rectF, f12, degrees3 - f8, false, paint);
            if (!this.e && this.c > 0.0f) {
                paint2.setStyle(Paint.Style.FILL);
                h(canvas, paint, f12, this.c * 2.0f, this.b, 1.0f);
                h(canvas, paint, (f7 + degrees3) - degrees, this.c * 2.0f, this.b, 1.0f);
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, float f2, float f3, float f4, float f5) {
        float min = (float) ((int) Math.min(f4, this.b));
        float f6 = f3 / 2.0f;
        float min2 = Math.min(f6, (this.c * min) / this.b);
        RectF rectF = new RectF((-min) / 2.0f, (-f3) / 2.0f, min / 2.0f, f6);
        canvas.save();
        double d2 = (double) f2;
        canvas.translate((float) (Math.cos(Math.toRadians(d2)) * ((double) this.d)), (float) (Math.sin(Math.toRadians(d2)) * ((double) this.d)));
        canvas.rotate(f2);
        canvas.scale(f5, f5);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int i() {
        tj0 tj0 = this.a;
        return (((e23) tj0).i * 2) + ((e23) tj0).h;
    }
}
