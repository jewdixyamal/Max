package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* renamed from: pha  reason: default package */
public final class pha extends AppCompatImageView {
    public float o;
    public Path s0;
    public int t0 = 687865856;
    public final Paint u0;

    public pha(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        qp4.u0.j(this).g().a.b.getClass();
        Paint paint = new Paint();
        paint.setColor(0);
        this.u0 = paint;
        v3c.y(new xh0(3, (Continuation) null, 25), this);
    }

    public final void onDraw(Canvas canvas) {
        Path path = this.s0;
        if (path != null) {
            canvas.save();
            float width = (((float) getWidth()) / this.o) * fk4.d().getDisplayMetrics().density;
            canvas.scale(width, width);
            Paint paint = this.u0;
            paint.setShadowLayer(fk4.d().getDisplayMetrics().density * 1.0f, fk4.d().getDisplayMetrics().density * 0.0f, fk4.d().getDisplayMetrics().density * 0.0f, this.t0);
            canvas.drawPath(path, paint);
            paint.clearShadowLayer();
            canvas.restore();
        }
        super.onDraw(canvas);
    }
}
