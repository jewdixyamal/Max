package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: yp4  reason: default package */
public final class yp4 extends View implements kre {
    public final Paint a = new Paint();
    public final RectF b = new RectF();
    public float c;

    public yp4(Context context) {
        super(context);
        onThemeChanged(qp4.u0.j(this));
        setClickable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 49));
    }

    public final void onDraw(Canvas canvas) {
        RectF rectF = this.b;
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, this.a);
    }

    public final void onMeasure(int i, int i2) {
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, fk4.d().getDisplayMetrics().density * 40.0f, fk4.d().getDisplayMetrics().density * 4.0f);
        this.c = rectF.centerY();
        setMeasuredDimension((int) rectF.width(), (int) rectF.height());
    }

    public final void onThemeChanged(fka fka) {
        this.a.setColor(fka.getIcon().h);
    }
}
