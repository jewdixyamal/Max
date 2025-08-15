package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: rd0  reason: default package */
public final class rd0 extends Drawable implements kre {
    public final Paint X;
    public final je7 Y;
    public final Drawable a;
    public final m5a b;
    public final m56 c;
    public final m56 o;

    public rd0(Drawable drawable, m5a m5a, fka fka, m56 m56, m56 m562) {
        Paint paint;
        this.a = drawable;
        this.b = m5a;
        this.c = m56;
        this.o = m562;
        if (m562 != null) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(((Number) m562.invoke(fka)).intValue());
        } else {
            paint = null;
        }
        this.X = paint;
        je7 r = tu0.r(3, new m(19));
        this.Y = r;
        if ((m5a instanceof l5a) && paint != null) {
            qjd.a((Path) r.getValue(), getBounds());
        }
        if (m56 != null) {
            aq4.g(drawable, ((Number) m56.invoke(fka)).intValue());
        }
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.X;
        if (paint != null) {
            m5a m5a = this.b;
            if (m5a instanceof j5a) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), ((float) getBounds().width()) / 2.0f, paint);
            } else if (m5a instanceof l5a) {
                canvas.drawPath((Path) this.Y.getValue(), paint);
            } else if (!tpa.f(m5a, k5a.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Drawable drawable = this.a;
        float width = ((float) drawable.getBounds().width()) / 2.0f;
        int save = canvas.save();
        canvas.translate(getBounds().exactCenterX() - width, getBounds().exactCenterY() - width);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        m5a m5a = this.b;
        boolean z = m5a instanceof l5a;
        Drawable drawable = this.a;
        Paint paint = this.X;
        if (z) {
            qjd.a((Path) this.Y.getValue(), rect);
        } else if (m5a instanceof k5a) {
            int min = Math.min(rect.width(), rect.height());
            if (paint != null) {
                int i = s5a.K0;
                min = lz7.o(min);
            }
            drawable.setBounds(0, 0, min, min);
        }
        int min2 = Math.min(rect.width(), rect.height());
        if (paint != null) {
            int i2 = s5a.K0;
            min2 = lz7.o(min2);
        }
        drawable.setBounds(0, 0, min2, min2);
    }

    public final void onThemeChanged(fka fka) {
        m56 m56;
        Paint paint = this.X;
        if (!(paint == null || (m56 = this.o) == null)) {
            paint.setColor(((Number) m56.invoke(fka)).intValue());
        }
        Drawable drawable = this.a;
        m56 m562 = this.c;
        if (m562 != null) {
            aq4.g(drawable, ((Number) m562.invoke(fka)).intValue());
        }
        if (paint == null && m562 == null) {
            kre kre = drawable instanceof kre ? (kre) drawable : null;
            if (kre != null) {
                kre.onThemeChanged(fka);
            }
        }
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
