package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: e17  reason: default package */
public final class e17 extends Drawable {
    public static final /* synthetic */ bc7[] j;
    public final float a;
    public final float b;
    public final float[] c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final Path g;
    public final d17 h;
    public final d17 i;

    static {
        Class<e17> cls = e17.class;
        j = new bc7[]{new oi9(cls, "innerDrawable", "getInnerDrawable$message_list_release()Landroid/graphics/drawable/Drawable;"), rh4.g(nec.a, cls, "strokeColor", "getStrokeColor$message_list_release()I")};
    }

    public e17(float f2, float f3, int i2) {
        this.a = f2;
        this.b = f3;
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = this.b;
        }
        this.c = fArr;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i2);
        paint.setStrokeWidth(this.a);
        this.d = paint;
        this.e = new RectF();
        this.f = new Path();
        this.g = new Path();
        this.h = new d17(this);
        this.i = new d17(Integer.valueOf(i2), this);
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.drawPath(this.f, this.d);
            bc7 bc7 = j[0];
            Drawable drawable = (Drawable) this.h.b;
            if (drawable != null) {
                Path path = this.g;
                save = canvas.save();
                canvas.clipPath(path);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.g);
            outline.setAlpha(0.0f);
            return;
        }
        super.getOutline(outline);
    }

    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        Path path = this.f;
        path.reset();
        RectF rectF = this.e;
        float f2 = this.a / 2.0f;
        rectF.set(((float) rect.left) + f2, ((float) rect.top) + f2, ((float) rect.right) - f2, ((float) rect.bottom) - f2);
        float[] fArr2 = new float[8];
        int i2 = 0;
        while (true) {
            fArr = this.c;
            if (i2 >= 8) {
                break;
            }
            fArr2[i2] = ote.b(fArr[i2] - f2, 0.0f);
            i2++;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr2, direction);
        Path path2 = this.g;
        path2.reset();
        rectF.set(rect);
        path2.addRoundRect(rectF, fArr, direction);
        bc7 bc7 = j[0];
        Drawable drawable = (Drawable) this.h.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final void setAlpha(int i2) {
        this.d.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
