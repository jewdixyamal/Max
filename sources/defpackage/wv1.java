package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: wv1  reason: default package */
public final class wv1 extends View {
    public static final float A0 = (fk4.d().getDisplayMetrics().density * 8.0f);
    public static final float B0 = (fk4.d().getDisplayMetrics().density * 4.0f);
    public static final float C0 = (fk4.d().getDisplayMetrics().density * 14.0f);
    public static final /* synthetic */ bc7[] w0;
    public static final float x0;
    public static final float y0;
    public static final float z0 = (fk4.d().getDisplayMetrics().density * 4.0f);
    public final yj a = new yj(this);
    public final ArgbEvaluator b = new ArgbEvaluator();
    public final FloatEvaluator c = new FloatEvaluator();
    public ValueAnimator o;
    public final Paint s0;
    public final Paint t0;
    public float u0;
    public float v0;

    static {
        oi9 oi9 = new oi9(wv1.class, "type", "getType()Lone/me/sdk/gallery/view/quickcamera/CameraCentralButton$Type;");
        nec.a.getClass();
        w0 = new bc7[]{oi9};
        float f = fk4.d().getDisplayMetrics().density * 4.0f;
        x0 = f;
        y0 = f / ((float) 2);
    }

    public wv1(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(x0);
        this.s0 = paint;
        Paint paint2 = new Paint();
        qp4.u0.j(this).i();
        paint2.setColor(1308622847);
        this.t0 = paint2;
        this.u0 = z0;
    }

    public final vv1 getType() {
        bc7 bc7 = w0[0];
        return (vv1) this.a.b;
    }

    public final void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        canvas.drawCircle(width, width, width - y0, this.s0);
        float f = x0 + this.u0;
        float floatValue = this.c.evaluate(this.v0, Float.valueOf(1.0f), Float.valueOf(0.5f)).floatValue() * ((((float) getWidth()) - f) / ((float) 2));
        canvas.drawRoundRect(f, f, ((float) getWidth()) - f, ((float) getHeight()) - f, floatValue, floatValue, this.t0);
        super.onDraw(canvas);
    }

    public final void setType(vv1 vv1) {
        this.a.o1(this, w0[0], vv1);
    }
}
