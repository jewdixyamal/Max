package defpackage;

import android.graphics.Canvas;

/* renamed from: unc  reason: default package */
public final class unc extends tnc {
    public final void draw(Canvas canvas) {
        f46.I();
        if (this.b || this.c || this.o > 0.0f) {
            f();
            d();
            canvas.clipPath(this.X);
            super.draw(canvas);
            f46.I();
            return;
        }
        super.draw(canvas);
        f46.I();
    }
}
