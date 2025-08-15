package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: t44  reason: default package */
public final class t44 extends Drawable implements cv6 {
    public int A0;
    public int B0;
    public int C0;
    public long D0;
    public rsc X;
    public HashMap Y = new HashMap();
    public int Z;
    public String a;
    public int b;
    public int c;
    public int o;
    public int s0;
    public final int t0 = 80;
    public final Paint u0 = new Paint(1);
    public final Matrix v0 = new Matrix();
    public final Rect w0 = new Rect();
    public final RectF x0 = new RectF();
    public int y0;
    public int z0;

    public t44() {
        b();
    }

    public final void a(Canvas canvas, String str, String str2, int i) {
        String g = au1.g(str, ": ");
        Paint paint = this.u0;
        float measureText = paint.measureText(g);
        float measureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i2 = this.B0;
        int i3 = this.C0;
        canvas.drawRect((float) (i2 - 4), (float) (i3 + 8), ((float) i2) + measureText + measureText2 + 4.0f, (float) (i3 + this.A0 + 8), paint);
        paint.setColor(-1);
        canvas.drawText(g, (float) this.B0, (float) this.C0, paint);
        paint.setColor(i);
        canvas.drawText(str2, ((float) this.B0) + measureText, (float) this.C0, paint);
        this.C0 += this.A0;
    }

    public final void b() {
        this.b = -1;
        this.c = -1;
        this.o = -1;
        this.Y = new HashMap();
        this.Z = -1;
        this.s0 = -1;
        this.a = "none";
        invalidateSelf();
        this.D0 = -1;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        Paint paint = this.u0;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        Paint paint2 = paint;
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, paint2);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, paint2);
        paint.setStyle(style);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.B0 = this.y0;
        this.C0 = this.z0;
        a(canvas2, "ID", this.a, -1);
        int width = bounds.width();
        int height = bounds.height();
        Locale locale = Locale.US;
        a(canvas2, "D", width + "x" + height, -1);
        if (bounds.height() > 0) {
            a(canvas2, "DAR", String.valueOf(Float.valueOf(((float) bounds.width()) / ((float) bounds.height()))), -1);
        }
        int i = this.b;
        int i2 = this.c;
        rsc rsc = this.X;
        int width2 = getBounds().width();
        int height2 = getBounds().height();
        int i3 = -65536;
        if (width2 > 0 && height2 > 0 && i > 0 && i2 > 0) {
            if (rsc != null) {
                Rect rect = this.w0;
                rect.top = 0;
                rect.left = 0;
                rect.right = width2;
                rect.bottom = height2;
                Matrix matrix = this.v0;
                matrix.reset();
                rsc.a(matrix, this.w0, i, i2, 0.0f, 0.0f);
                RectF rectF = this.x0;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = (float) i;
                rectF.bottom = (float) i2;
                matrix.mapRect(rectF);
                width2 = Math.min(width2, (int) rectF.width());
                height2 = Math.min(height2, (int) rectF.height());
            }
            float f = (float) width2;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = (float) height2;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width2);
            int abs2 = Math.abs(i2 - height2);
            float f7 = (float) abs;
            if (f7 < f2 && ((float) abs2) < f5) {
                i3 = -16711936;
            } else if (f7 < f3 && ((float) abs2) < f6) {
                i3 = -256;
            }
        }
        int i4 = this.b;
        int i5 = this.c;
        a(canvas2, "I", i4 + "x" + i5, i3);
        int i6 = this.c;
        if (i6 > 0) {
            a(canvas2, "IAR", String.valueOf(Float.valueOf(((float) this.b) / ((float) i6))), -1);
        }
        int i7 = this.o / LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        a(canvas2, "I", i7 + " KiB", -1);
        int i8 = this.Z;
        if (i8 > 0) {
            a(canvas2, "anim", rh4.h("f ", i8, this.s0, ", l "), -1);
        }
        rsc rsc2 = this.X;
        if (rsc2 != null) {
            a(canvas2, "scale", String.valueOf(rsc2), -1);
        }
        long j = this.D0;
        if (j >= 0) {
            a(canvas2, "t", j + " ms", -1);
        }
        for (Map.Entry entry : this.Y.entrySet()) {
            a(canvas2, (String) entry.getKey(), (String) entry.getValue(), -1);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.u0.setTextSize((float) min);
        int i = min + 8;
        this.A0 = i;
        int i2 = this.t0;
        if (i2 == 80) {
            this.A0 = i * -1;
        }
        this.y0 = rect.left + 10;
        this.z0 = i2 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
