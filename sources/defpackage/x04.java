package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: x04  reason: default package */
public final class x04 extends p18 {
    public final RectF v;

    public x04(gjd gjd, RectF rectF) {
        super(gjd);
        this.v = rectF;
    }

    public final Drawable newDrawable() {
        y04 y04 = new y04(this);
        y04.invalidateSelf();
        return y04;
    }

    public x04(x04 x04) {
        super((p18) x04);
        this.v = x04.v;
    }
}
