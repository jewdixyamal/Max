package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: e4f  reason: default package */
public final class e4f extends Drawable implements Animatable, kre {
    public final Rect X = new Rect();
    public int Y;
    public int Z;
    public final m56 a;
    public final int b = 3;
    public final Paint c = new Paint(1);
    public int o = 255;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public final gwe w0 = new gwe(3, (Object) this);
    public boolean x0;
    public float y0;

    public e4f(fka fka, m56 m56) {
        this.a = m56;
        onThemeChanged(fka);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                break;
            }
            int i3 = bounds.left;
            int i4 = this.Y;
            int i5 = (i4 * i) + i3;
            Rect rect = this.X;
            rect.left = i5;
            int i6 = bounds.top;
            rect.top = i6;
            rect.right = i5 + i4;
            rect.bottom = i6 + this.Z;
            float f = (float) 2;
            float sin = (((float) Math.sin((double) (this.y0 + ((float) ((i2 - i) + 1))))) + ((float) 1)) / f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            float f2 = this.s0;
            float f3 = (((this.t0 - f2) * sin) + f2) / f;
            float f4 = this.u0;
            float f5 = ((this.v0 - f4) * sin) + f4;
            Paint paint = this.c;
            paint.setAlpha((int) (f5 * (((float) this.o) / 255.0f) * ((float) 255)));
            canvas.drawCircle(exactCenterX, exactCenterY, f3, paint);
            i++;
        }
        if (this.x0) {
            this.y0 += 0.1f;
        }
    }

    public final int getAlpha() {
        return this.o;
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.x0;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        this.Y = bounds.width() / this.b;
        int height = bounds.height();
        this.Z = height;
        float min = (float) Math.min(this.Y, height);
        this.s0 = 0.44f * min;
        this.t0 = min * 0.66f;
        this.u0 = 0.4f;
        this.v0 = 1.0f;
        invalidateSelf();
    }

    public final void onThemeChanged(fka fka) {
        int intValue = ((Number) this.a.invoke(fka)).intValue();
        int alpha = Color.alpha(intValue);
        Paint paint = this.c;
        if (intValue != paint.getColor() || this.o != alpha) {
            paint.setColor(intValue);
            setAlpha(alpha);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (this.o != i) {
            this.o = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.c;
        if (!tpa.f(colorFilter, paint.getColorFilter())) {
            paint.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        if (!this.x0) {
            this.x0 = true;
            scheduleSelf(this.w0, SystemClock.uptimeMillis() + 8);
        }
    }

    public final void stop() {
        if (this.x0) {
            this.x0 = false;
            unscheduleSelf(this.w0);
            this.y0 = 0.0f;
        }
    }
}
