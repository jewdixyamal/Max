package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: od0  reason: default package */
public final class od0 extends Drawable {
    public final Drawable a;
    public final m5a b;
    public final Paint c;
    public final je7 d;

    public od0(Drawable drawable, m5a m5a, Context context, m56 m56, m56 m562) {
        this.a = drawable;
        this.b = m5a;
        pq9 pq9 = qp4.u0;
        aq4.g(drawable, ((Number) m56.invoke(pq9.b(context).i())).intValue());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) m562.invoke(pq9.b(context).i())).intValue());
        this.c = paint;
        je7 r = tu0.r(3, new m(18));
        this.d = r;
        if (m5a instanceof l5a) {
            qjd.a((Path) r.getValue(), getBounds());
        }
    }

    public final void draw(Canvas canvas) {
        int min = Math.min(getBounds().width(), getBounds().height());
        m5a m5a = this.b;
        boolean z = m5a instanceof j5a;
        Paint paint = this.c;
        if (z) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), ((float) getBounds().width()) / 2.0f, paint);
        } else if (m5a instanceof l5a) {
            canvas.drawPath((Path) this.d.getValue(), paint);
        } else if (!tpa.f(m5a, k5a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = s5a.K0;
        int o = lz7.o(min);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, o, o);
        canvas.save();
        float f = ((float) o) / 2.0f;
        canvas.translate(getBounds().exactCenterX() - f, getBounds().exactCenterY() - f);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        if (this.b instanceof l5a) {
            qjd.a((Path) this.d.getValue(), rect);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
