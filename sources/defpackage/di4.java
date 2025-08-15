package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* renamed from: di4  reason: default package */
public final class di4 extends jq4 {
    public static final ci4 B0 = new Object();
    public boolean A0 = false;
    public final wq4 w0;
    public final lwd x0;
    public final kwd y0;
    public final vq4 z0;

    /* JADX WARNING: type inference failed for: r2v2, types: [vq4, java.lang.Object] */
    public di4(Context context, tj0 tj0, wq4 wq4) {
        super(context, tj0);
        this.w0 = wq4;
        this.z0 = new Object();
        lwd lwd = new lwd();
        this.x0 = lwd;
        lwd.a(1.0f);
        lwd.b(50.0f);
        kwd kwd = new kwd(this, B0);
        this.y0 = kwd;
        kwd.m = lwd;
        if (this.s0 != 1.0f) {
            this.s0 = 1.0f;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            wq4 wq4 = this.w0;
            Rect bounds = getBounds();
            float b = b();
            ValueAnimator valueAnimator = this.o;
            boolean z = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.X;
            boolean z2 = valueAnimator2 != null && valueAnimator2.isRunning();
            wq4.a.a();
            wq4.a(canvas, bounds, b, z, z2);
            Paint paint = this.t0;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            tj0 tj0 = this.b;
            int i = tj0.c[0];
            vq4 vq4 = this.z0;
            vq4.c = i;
            int i2 = tj0.g;
            if (i2 > 0) {
                if (!(this.w0 instanceof nh7)) {
                    i2 = (int) ((z04.o(vq4.b, 0.0f, 0.01f) * ((float) i2)) / 0.01f);
                }
                this.w0.d(canvas, paint, vq4.b, 1.0f, tj0.d, this.u0, i2);
            } else {
                this.w0.d(canvas, paint, 0.0f, 1.0f, tj0.d, this.u0, 0);
            }
            this.w0.c(canvas, paint, vq4, this.u0);
            this.w0.b(canvas, paint, tj0.c[0], this.u0);
            canvas.restore();
        }
    }

    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean e = super.e(z, z2, z3);
        dh dhVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        dhVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.A0 = true;
        } else {
            this.A0 = false;
            this.x0.b(50.0f / f);
        }
        return e;
    }

    public final int getIntrinsicHeight() {
        return this.w0.e();
    }

    public final int getIntrinsicWidth() {
        return this.w0.f();
    }

    public final void jumpToCurrentState() {
        this.y0.f();
        this.z0.b = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    public final boolean onLevelChange(int i) {
        boolean z = this.A0;
        vq4 vq4 = this.z0;
        kwd kwd = this.y0;
        if (z) {
            kwd.f();
            vq4.b = ((float) i) / 10000.0f;
            invalidateSelf();
        } else {
            kwd.b = vq4.b * 10000.0f;
            kwd.c = true;
            kwd.a((float) i);
        }
        return true;
    }
}
