package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: nh7  reason: default package */
public final class nh7 extends wq4 {
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f;

    public final void a(Canvas canvas, Rect rect, float f2, boolean z, boolean z2) {
        this.b = (float) rect.width();
        tj0 tj0 = this.a;
        float f3 = (float) ((xh7) tj0).a;
        canvas.translate((((float) rect.width()) / 2.0f) + ((float) rect.left), Math.max(0.0f, (((float) rect.height()) - f3) / 2.0f) + (((float) rect.height()) / 2.0f) + ((float) rect.top));
        if (((xh7) tj0).j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f4 = this.b / 2.0f;
        float f5 = f3 / 2.0f;
        canvas.clipRect(-f4, -f5, f4, f5);
        this.e = ((xh7) tj0).a / 2 == ((xh7) tj0).b;
        this.c = ((float) ((xh7) tj0).a) * f2;
        this.d = ((float) Math.min(((xh7) tj0).a / 2, ((xh7) tj0).b)) * f2;
        if (z || z2) {
            if ((z && ((xh7) tj0).e == 2) || (z2 && ((xh7) tj0).f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ((xh7) tj0).f != 3)) {
                canvas.translate(0.0f, ((1.0f - f2) * ((float) ((xh7) tj0).a)) / 2.0f);
            }
        }
        if (!z2 || ((xh7) tj0).f != 3) {
            this.f = 1.0f;
        } else {
            this.f = f2;
        }
    }

    public final void b(Canvas canvas, Paint paint, int i, int i2) {
        int j = mr0.j(i, i2);
        xh7 xh7 = (xh7) this.a;
        if (xh7.k > 0 && j != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(j);
            PointF pointF = new PointF((this.b / 2.0f) - (this.c / 2.0f), 0.0f);
            int i3 = xh7.k;
            h(canvas, paint, pointF, (PointF) null, (float) i3, (float) i3);
        }
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
        return ((xh7) this.a).a;
    }

    public final int f() {
        return -1;
    }

    public final void g(Canvas canvas, Paint paint, float f2, float f3, int i, int i2, int i3) {
        Paint paint2 = paint;
        float o = z04.o(f2, 0.0f, 1.0f);
        float o2 = z04.o(f3, 0.0f, 1.0f);
        float x = fp3.x(1.0f - this.f, 1.0f, o);
        float x2 = fp3.x(1.0f - this.f, 1.0f, o2);
        float o3 = 1.0f - z04.o(x2, 0.99f, 1.0f);
        float f4 = this.b;
        int o4 = (int) ((x * f4) + ((float) ((int) ((z04.o(x, 0.0f, 0.01f) * ((float) i2)) / 0.01f))));
        int i4 = (int) ((x2 * f4) - ((float) ((int) ((o3 * ((float) i3)) / 0.01f))));
        float f5 = (-f4) / 2.0f;
        if (o4 <= i4) {
            float f6 = this.d;
            float f7 = ((float) o4) + f6;
            float f8 = ((float) i4) - f6;
            float f9 = f6 * 2.0f;
            paint2.setColor(i);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(this.c);
            if (f7 >= f8) {
                h(canvas, paint, new PointF(f7 + f5, 0.0f), new PointF(f8 + f5, 0.0f), f9, this.c);
                return;
            }
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeCap(this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f10 = f7 + f5;
            float f11 = f8 + f5;
            canvas.drawLine(f10, 0.0f, f11, 0.0f, paint);
            if (!this.e && this.d > 0.0f) {
                paint2.setStyle(Paint.Style.FILL);
                if (f7 > 0.0f) {
                    h(canvas, paint, new PointF(f10, 0.0f), (PointF) null, f9, this.c);
                }
                if (f8 < this.b) {
                    h(canvas, paint, new PointF(f11, 0.0f), (PointF) null, f9, this.c);
                }
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f2, float f3) {
        float min = Math.min(f3, this.c);
        float f4 = f2 / 2.0f;
        float min2 = Math.min(f4, (this.d * min) / this.c);
        RectF rectF = new RectF((-f2) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
