package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: xq4  reason: default package */
public final class xq4 implements nv4 {
    public final ArrayList a = new ArrayList();
    public final Path b = new Path();
    public final Paint c;

    public xq4(int i, float f) {
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void draw(Canvas canvas) {
        canvas.drawPath(this.b, this.c);
    }
}
