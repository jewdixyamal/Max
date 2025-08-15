package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* renamed from: tz6  reason: default package */
public final class tz6 extends jq4 {
    public final wq4 w0;
    public dle x0;
    public Drawable y0;

    public tz6(Context context, tj0 tj0, wq4 wq4, dle dle) {
        super(context, tj0);
        this.w0 = wq4;
        this.x0 = dle;
        dle.b = this;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        Canvas canvas2 = canvas;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas2.getClipBounds(rect)) {
            boolean z = this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
            tj0 tj0 = this.b;
            if (!z || (drawable = this.y0) == null) {
                canvas.save();
                wq4 wq4 = this.w0;
                Rect bounds = getBounds();
                float b = b();
                ValueAnimator valueAnimator = this.o;
                boolean z2 = valueAnimator != null && valueAnimator.isRunning();
                ValueAnimator valueAnimator2 = this.X;
                boolean z3 = valueAnimator2 != null && valueAnimator2.isRunning();
                wq4.a.a();
                wq4.a(canvas, bounds, b, z2, z3);
                int i = tj0.g;
                int i2 = this.u0;
                Paint paint = this.t0;
                if (i == 0) {
                    this.w0.d(canvas, paint, 0.0f, 1.0f, tj0.d, i2, 0);
                } else {
                    vq4 vq4 = (vq4) ((ArrayList) this.x0.c).get(0);
                    vq4 vq42 = (vq4) wg0.f((ArrayList) this.x0.c, 1);
                    wq4 wq42 = this.w0;
                    if (wq42 instanceof nh7) {
                        wq4 wq43 = wq42;
                        Canvas canvas3 = canvas;
                        Paint paint2 = paint;
                        int i3 = i2;
                        int i4 = i;
                        wq43.d(canvas3, paint2, 0.0f, vq4.a, tj0.d, i3, i4);
                        this.w0.d(canvas3, paint2, vq42.b, 1.0f, tj0.d, i3, i4);
                    } else {
                        i2 = 0;
                        wq42.d(canvas, paint, vq42.b, vq4.a + 1.0f, tj0.d, 0, i);
                    }
                }
                for (int i5 = 0; i5 < ((ArrayList) this.x0.c).size(); i5++) {
                    vq4 vq43 = (vq4) ((ArrayList) this.x0.c).get(i5);
                    this.w0.c(canvas2, paint, vq43, this.u0);
                    if (i5 > 0 && i > 0) {
                        this.w0.d(canvas, paint, ((vq4) ((ArrayList) this.x0.c).get(i5 - 1)).b, vq43.a, tj0.d, i2, i);
                    }
                }
                canvas.restore();
                return;
            }
            drawable.setBounds(getBounds());
            aq4.g(this.y0, tj0.c[0]);
            this.y0.draw(canvas2);
        }
    }

    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean e = super.e(z, z2, z3);
        if (this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (drawable = this.y0) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.x0.x();
        }
        if (z && z3) {
            this.x0.e0();
        }
        return e;
    }

    public final int getIntrinsicHeight() {
        return this.w0.e();
    }

    public final int getIntrinsicWidth() {
        return this.w0.f();
    }
}
