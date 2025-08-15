package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RenderScript;

/* renamed from: bme  reason: default package */
public final class bme implements op0 {
    public final Paint a;
    public final je7 b;

    public bme(Context context) {
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.a = paint;
        this.b = tu0.r(2, new yqd(context, 7));
    }

    public final void b() {
        khe khe = ((cu6) this.b.getValue()).a;
        if (khe.a()) {
            ((RenderScript) khe.getValue()).destroy();
        }
    }

    public final void c(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
    }

    public final void d(Bitmap bitmap, float f) {
        ((cu6) this.b.getValue()).a(bitmap, tu0.G(f));
    }

    public final void p(int i) {
        this.a.setAlpha(i);
    }
}
