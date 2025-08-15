package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: umc  reason: default package */
public final class umc extends g06 implements hqf {
    public Drawable X;
    public iqf Y;

    public final void draw(Canvas canvas) {
        if (isVisible()) {
            iqf iqf = this.Y;
            if (iqf != null) {
                iqf.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.X;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.X.draw(canvas);
            }
        }
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        iqf iqf = this.Y;
        if (iqf != null) {
            iqf.a(z);
        }
        return super.setVisible(z, z2);
    }
}
