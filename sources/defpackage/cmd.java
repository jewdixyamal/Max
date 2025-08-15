package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: cmd  reason: default package */
public final class cmd extends FrameLayout {
    public final Paint a = new Paint();
    public final bmd b;
    public boolean c;

    public cmd(Context context) {
        super(context, (AttributeSet) null, 0);
        bmd bmd = new bmd();
        this.b = bmd;
        this.c = true;
        setWillNotDraw(false);
        bmd.setCallback(this);
        bkg bkg = new bkg(25);
        yld yld = (yld) bkg.b;
        yld.k = false;
        yld.i = 0.0f;
        pq9 pq9 = qp4.u0;
        bkg.v(pq9.j(this).getText().e);
        yld.d = pq9.j(this).f().a;
        bkg.u();
        bkg.x(tu0.G(((float) 360) * fk4.d().getDisplayMetrics().density));
        a(bkg.m());
    }

    public final void a(yld yld) {
        this.b.b(yld);
        if (yld.j) {
            setLayerType(2, this.a);
        } else {
            setLayerType(0, (Paint) null);
        }
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
