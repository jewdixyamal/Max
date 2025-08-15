package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: pm8  reason: default package */
public final class pm8 extends View implements kre {
    public final int a = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
    public final int b = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
    public final float c = (fk4.d().getDisplayMetrics().density * 16.0f);
    public final Drawable o;
    public final je7 s0;

    public pm8(Context context) {
        super(context);
        int G = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        Drawable b2 = kt3.b(getContext(), woc.Q);
        b2.setBounds(0, 0, G, G);
        b2.setTint(getDrawableColor());
        this.o = b2;
        this.s0 = tu0.r(3, new j78(5));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
    }

    private final int getBackgroundColor() {
        qp4.u0.j(this).a().s().b.getClass();
        return 1543503872;
    }

    private final Paint getBackgroundPaint() {
        return (Paint) this.s0.getValue();
    }

    private final int getDrawableColor() {
        qp4.u0.j(this).a().s().c.getClass();
        return -1;
    }

    public final void onDraw(Canvas canvas) {
        getBackgroundPaint().setColor(getBackgroundColor());
        float f = this.c;
        canvas.drawRoundRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), f, f, getBackgroundPaint());
        int save = canvas.save();
        canvas.translate((float) this.b, (float) this.a);
        try {
            this.o.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.o;
        setMeasuredDimension((this.b * 2) + drawable.getBounds().width(), (this.a * 2) + drawable.getBounds().height());
    }

    public final void onThemeChanged(fka fka) {
        this.o.setTint(getDrawableColor());
    }
}
