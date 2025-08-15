package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: fmd  reason: default package */
public final class fmd extends TextView {
    public final Paint a;
    public final bmd b;
    public boolean c = true;

    public fmd(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        this.a = paint;
        bmd bmd = new bmd();
        this.b = bmd;
        setWillNotDraw(false);
        bmd.setCallback(this);
        bkg bkg = new bkg(25);
        yld yld = (yld) bkg.b;
        yld.k = false;
        yld.i = 0.0f;
        pq9 pq9 = qp4.u0;
        bkg.v(pq9.j(this).getText().h);
        pq9.j(this).getText();
        yld.d = -1;
        bkg.u();
        bkg.x(tu0.G(((float) 360) * fk4.d().getDisplayMetrics().density));
        yld m = bkg.m();
        bmd.b(m);
        if (m.j) {
            setLayerType(2, paint);
        } else {
            setLayerType(0, (Paint) null);
        }
    }

    public final void a(boolean z) {
        bmd bmd = this.b;
        if (z) {
            this.c = true;
            if (z) {
                bmd.c();
                return;
            }
            return;
        }
        bmd.d();
        this.c = false;
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.d();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
