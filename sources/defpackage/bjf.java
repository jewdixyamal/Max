package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Size;
import kotlin.coroutines.Continuation;

/* renamed from: bjf  reason: default package */
public final class bjf extends ffe implements a66 {
    public final /* synthetic */ Size X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjf(Size size, Continuation continuation) {
        super(2, continuation);
        this.X = size;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bjf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bjf(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int width = this.X.getWidth();
        Path i = m6d.i("M328 164c0 90.446-73.554 164-164 164S0 254.446 0 164S73.554 0 164 0s164 73.554 164 164Z");
        RectF rectF = new RectF();
        i.computeBounds(rectF, true);
        float f = (float) width;
        float max = f / Math.max(rectF.width(), rectF.height());
        Matrix matrix = new Matrix();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.postScale(max, max);
        float f2 = (float) 2;
        matrix.postTranslate((f - (rectF.width() * max)) / f2, (f - (rectF.height() * max)) / f2);
        i.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setFlags(7);
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        i.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        canvas.drawPath(i, paint);
        return createBitmap;
    }
}
