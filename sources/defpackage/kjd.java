package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: kjd  reason: default package */
public final class kjd extends ojd {
    public final mjd c;
    public final float d;
    public final float e;

    public kjd(mjd mjd, float f, float f2) {
        this.c = mjd;
        this.d = f;
        this.e = f2;
    }

    public final void a(Matrix matrix, ejd ejd, int i, Canvas canvas) {
        ejd ejd2 = ejd;
        int i2 = i;
        Canvas canvas2 = canvas;
        mjd mjd = this.c;
        float f = mjd.c;
        float f2 = this.e;
        float f3 = mjd.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f - f2), (double) (f3 - f4)), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        ejd.getClass();
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = ejd.i;
        iArr[0] = ejd2.f;
        iArr[1] = ejd2.e;
        iArr[2] = ejd2.d;
        Paint paint = ejd2.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, ejd.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        mjd mjd = this.c;
        return (float) Math.toDegrees(Math.atan((double) ((mjd.c - this.e) / (mjd.b - this.d))));
    }
}
