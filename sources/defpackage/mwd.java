package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: mwd  reason: default package */
public final class mwd extends Drawable {
    public static final Paint d;
    public final nwd a;
    public final Rect b;
    public final Paint c;

    static {
        Paint paint = new Paint();
        paint.setColor(0);
        d = paint;
    }

    public mwd(nwd nwd) {
        this.a = nwd;
        this.b = new Rect();
        this.c = new Paint(2);
        int i = nwd.b;
        setBounds(0, 0, i, i);
        a();
    }

    public final void a() {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int i = this.a.b / 2;
        this.b.set(centerX - i, centerY - i, centerX + i, centerY + i);
    }

    public final void draw(Canvas canvas) {
        nwd nwd = this.a;
        Bitmap o = nwd.e.o(nwd.a);
        Rect rect = this.b;
        if (o == null) {
            canvas.drawRect(rect, d);
            return;
        }
        Rect rect2 = iy4.c;
        canvas.drawBitmap(o, iy4.c, rect, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwd) && tpa.f(this.a, ((mwd) obj).a);
    }

    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    public final int getMinimumHeight() {
        return getBounds().height();
    }

    public final int getMinimumWidth() {
        return getBounds().width();
    }

    public final int getOpacity() {
        return -2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void setAlpha(int i) {
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.b = i4;
        a();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final String toString() {
        return "SpriteEmojiDrawable(state=" + this.a + ")";
    }

    public mwd(ty4 ty4, int i, nw4 nw4) {
        this(new nwd(new nx4(ty4.b, ty4.c, ty4.d), i, nw4));
    }
}
