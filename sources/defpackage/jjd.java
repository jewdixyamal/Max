package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: jjd  reason: default package */
public final class jjd extends ojd {
    public final ljd c;

    public jjd(ljd ljd) {
        this.c = ljd;
    }

    public final void a(Matrix matrix, ejd ejd, int i, Canvas canvas) {
        ejd ejd2 = ejd;
        int i2 = i;
        Canvas canvas2 = canvas;
        ljd ljd = this.c;
        float f = ljd.f;
        float f2 = ljd.g;
        RectF rectF = new RectF(ljd.b, ljd.c, ljd.d, ljd.e);
        ejd.getClass();
        boolean z = f2 < 0.0f;
        Path path = ejd2.g;
        int[] iArr = ejd.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = ejd2.f;
            iArr[2] = ejd2.e;
            iArr[3] = ejd2.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i2);
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = ejd2.d;
            iArr[2] = ejd2.e;
            iArr[3] = ejd2.f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (((float) i2) / width);
            float[] fArr = ejd.l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = ejd2.b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, ejd2.h);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}
