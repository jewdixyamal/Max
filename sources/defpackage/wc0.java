package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: wc0  reason: default package */
public final class wc0 extends nj0 {
    public final o43 a(Bitmap bitmap, s2b s2b) {
        o43 c = s2b.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        bo0 bo0 = qjd.a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas((Bitmap) c.e0());
        canvas.drawBitmap(bitmap, qjd.b, (Paint) null);
        int min = Math.min(width, height) / 2;
        Path b = qjd.b(min, 4.0d);
        Matrix matrix = new Matrix();
        float f = (float) min;
        matrix.postTranslate((((float) width) / 2.0f) - f, (((float) height) / 2.0f) - f);
        b.transform(matrix);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        b.setFillType(Path.FillType.INVERSE_WINDING);
        canvas.drawPath(b, paint);
        return c;
    }

    public final ww0 b() {
        return new tpd("AvatarAsSquirclePostProcessor");
    }
}
