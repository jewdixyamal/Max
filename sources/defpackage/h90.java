package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* renamed from: h90  reason: default package */
public final class h90 extends g06 implements Runnable {
    public int X;
    public boolean Y;
    public float Z;
    public boolean s0;

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.Z;
        if (!this.Y) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (float) ((i3 / 2) + i2), (float) ((i6 / 2) + i5));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.s0) {
            this.s0 = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public final void run() {
        this.s0 = false;
        this.Z += (float) ((int) ((20.0f / ((float) this.X)) * 360.0f));
        invalidateSelf();
    }
}
