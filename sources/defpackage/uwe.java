package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: uwe  reason: default package */
public final class uwe extends q18 implements cpe {
    public CharSequence J0;
    public final Context K0;
    public final Paint.FontMetrics L0 = new Paint.FontMetrics();
    public final dpe M0;
    public final qq0 N0;
    public final Rect O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public boolean T0;
    public int U0;
    public int V0;
    public float W0;
    public float X0;
    public float Y0;
    public float Z0;

    public uwe(Context context, int i) {
        super(context, (AttributeSet) null, 0, i);
        dpe dpe = new dpe(this);
        this.M0 = dpe;
        this.N0 = new qq0(13, this);
        this.O0 = new Rect();
        this.W0 = 1.0f;
        this.X0 = 1.0f;
        this.Y0 = 0.5f;
        this.Z0 = 1.0f;
        this.K0 = context;
        TextPaint textPaint = dpe.a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        float r = r();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.W0, this.X0, (((float) getBounds().width()) * 0.5f) + ((float) getBounds().left), (((float) getBounds().height()) * this.Y0) + ((float) getBounds().top));
        canvas.translate(r, (float) (-((sqrt * ((double) this.U0)) - ((double) this.U0))));
        super.draw(canvas);
        if (this.J0 != null) {
            Rect bounds = getBounds();
            dpe dpe = this.M0;
            TextPaint textPaint = dpe.a;
            Paint.FontMetrics fontMetrics = this.L0;
            textPaint.getFontMetrics(fontMetrics);
            int centerY = (int) (((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            voe voe = dpe.g;
            TextPaint textPaint2 = dpe.a;
            if (voe != null) {
                textPaint2.drawableState = getState();
                dpe.g.e(this.K0, textPaint2, dpe.b);
                textPaint2.setAlpha((int) (this.Z0 * 255.0f));
            }
            CharSequence charSequence = this.J0;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) centerY, textPaint2);
        }
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return (int) Math.max(this.M0.a.getTextSize(), (float) this.R0);
    }

    public final int getIntrinsicWidth() {
        float f = (float) (this.P0 * 2);
        CharSequence charSequence = this.J0;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.M0.a(charSequence.toString())), (float) this.Q0);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.T0) {
            i8g e = this.a.a.e();
            e.k = s();
            setShapeAppearanceModel(e.c());
        }
    }

    public final float r() {
        int i;
        Rect rect = this.O0;
        if (((rect.right - getBounds().right) - this.V0) - this.S0 < 0) {
            i = ((rect.right - getBounds().right) - this.V0) - this.S0;
        } else if (((rect.left - getBounds().left) - this.V0) + this.S0 <= 0) {
            return 0.0f;
        } else {
            i = ((rect.left - getBounds().left) - this.V0) + this.S0;
        }
        return (float) i;
    }

    public final i2a s() {
        float width = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.U0)))) / 2.0f;
        return new i2a(new f08((float) this.U0), Math.min(Math.max(-r(), -width), width));
    }
}
