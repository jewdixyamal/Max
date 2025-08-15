package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: twe  reason: default package */
public final class twe extends Drawable implements kre {
    public final Path X;
    public final Paint Y;
    public final k56 a;
    public final int b;
    public final int c;
    public final ShapeDrawable o;

    public twe(int i, int i2, k56 k56) {
        this.a = k56;
        this.b = i;
        this.c = i2;
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = fk4.d().getDisplayMetrics().density * 12.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(((Number) this.a.invoke()).intValue());
        this.o = shapeDrawable;
        this.X = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) this.a.invoke()).intValue());
        this.Y = paint;
    }

    public final void draw(Canvas canvas) {
        this.o.draw(canvas);
        canvas.drawPath(this.X, this.Y);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        float G;
        float G2;
        super.onBoundsChange(rect);
        Rect rect2 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        int i = this.b;
        int s = au1.s(i);
        if (s == 0) {
            rect2.top = rh4.c((float) 8, fk4.d().getDisplayMetrics().density, rect.top);
        } else if (s == 1) {
            rect2.bottom = rh4.q((float) 8, fk4.d().getDisplayMetrics().density, rect.bottom);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.o.setBounds(rect2);
        Path path = this.X;
        path.reset();
        int s2 = au1.s(i);
        int i2 = this.c;
        if (s2 == 0) {
            int G3 = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
            int G4 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
            int s3 = au1.s(i2);
            if (s3 == 0) {
                G = (((float) G3) / 2.0f) + ((float) tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density));
            } else if (s3 == 1) {
                G = ((float) rect.width()) / 2.0f;
            } else if (s3 == 2) {
                G = (((float) rect.width()) - (((float) G3) / 2.0f)) - ((float) tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            float f = G;
            float f2 = ((float) G3) / 2.0f;
            float f3 = ((float) rect.top) + ((float) G4);
            path.moveTo(f + f2, f3);
            float f4 = (float) rect.top;
            path.cubicTo(f, f4, f, f4, f - f2, f3);
        } else if (s2 == 1) {
            int G5 = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
            int G6 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
            int s4 = au1.s(i2);
            if (s4 == 0) {
                G2 = (((float) G5) / 2.0f) + ((float) tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density));
            } else if (s4 == 1) {
                G2 = ((float) rect.width()) / 2.0f;
            } else if (s4 == 2) {
                G2 = (((float) rect.width()) - (((float) G5) / 2.0f)) - ((float) tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            float f5 = G2;
            float f6 = ((float) G5) / 2.0f;
            float f7 = ((float) rect.bottom) - ((float) G6);
            path.moveTo(f5 - f6, f7);
            float f8 = (float) rect.bottom;
            path.cubicTo(f5, f8, f5, f8, f5 + f6, f7);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onThemeChanged(fka fka) {
        Paint paint = this.o.getPaint();
        k56 k56 = this.a;
        paint.setColor(((Number) k56.invoke()).intValue());
        this.Y.setColor(((Number) k56.invoke()).intValue());
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
