package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: mtd  reason: default package */
public final class mtd extends Drawable implements Animatable, kre {
    public final RectF X = new RectF();
    public int Y;
    public int Z;
    public final Context a;
    public final m56 b;
    public final Integer[] c = {3, 1, 2};
    public final Paint o = new Paint(1);
    public final q57 s0 = new q57(24, this);
    public boolean t0;
    public float u0;

    public mtd(Context context, fka fka, we1 we1) {
        this.a = context;
        this.b = we1;
        onThemeChanged(fka);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float height = ((float) bounds.height()) / 2.0f;
        int i = this.Y;
        Integer[] numArr = this.c;
        float f = (float) 2;
        float width = (((float) bounds.width()) / 2.0f) - ((float) ((((numArr.length - 1) * tu0.G(fk4.d().getDisplayMetrics().density * f)) + (i * numArr.length)) / 2));
        int length = numArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            int intValue = numArr[i2].intValue();
            RectF rectF = this.X;
            float G = ((float) ((tu0.G(fk4.d().getDisplayMetrics().density * f) + this.Y) * i3)) + width;
            rectF.left = G;
            int i5 = this.Z;
            rectF.top = height - ((float) (i5 / 2));
            rectF.right = G + ((float) this.Y);
            rectF.bottom = ((float) (i5 / 2)) + height;
            float height2 = rectF.height() * Math.max(0.3f, (((float) Math.sin((double) (this.u0 + ((float) ((numArr.length - intValue) + 1))))) + ((float) 1)) / f);
            canvas.drawRoundRect(rectF.left, height - height2, rectF.right, height + height2, fk4.d().getDisplayMetrics().density * 4.0f, fk4.d().getDisplayMetrics().density * 4.0f, this.o);
            i2++;
            i3 = i4;
        }
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
        return this.t0;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int G = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        Integer[] numArr = this.c;
        this.Y = (int) (((float) ((width - ((numArr.length - 1) * G)) / numArr.length)) * 0.5f);
        this.Z = (int) (((float) bounds.height()) * 0.3f);
        invalidateSelf();
    }

    public final void onThemeChanged(fka fka) {
        this.o.setColor(((Number) this.b.invoke(qp4.u0.o(this.a).c)).intValue());
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.o.setColorFilter(colorFilter);
        invalidateSelf();
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
        if (!this.t0) {
            this.t0 = true;
            scheduleSelf(this.s0, SystemClock.uptimeMillis() + 3);
        }
    }

    public final void stop() {
        if (this.t0) {
            this.t0 = false;
            unscheduleSelf(this.s0);
        }
    }
}
