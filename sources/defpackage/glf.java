package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;

/* renamed from: glf  reason: default package */
public final class glf extends g06 {
    public static final Typeface v0 = Typeface.create("sans-serif-medium", 0);
    public bk4 X;
    public String Y;
    public Paint Z;
    public Paint s0;
    public RectF t0;
    public Path u0;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r2 < 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.a
            int r1 = r5.getIntrinsicWidth()
            java.lang.String r2 = r5.Y
            boolean r2 = defpackage.oag.t(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0011
        L_0x000f:
            r2 = r3
            goto L_0x002e
        L_0x0011:
            java.lang.String r2 = r5.Y
            boolean r2 = defpackage.oag.t(r2)
            if (r2 == 0) goto L_0x001b
            r2 = r3
            goto L_0x0024
        L_0x001b:
            android.graphics.Paint r2 = r5.Z
            java.lang.String r4 = r5.Y
            float r2 = r2.measureText(r4)
            int r2 = (int) r2
        L_0x0024:
            int r4 = super.getIntrinsicWidth()
            int r4 = r4 / 2
            int r2 = r2 - r4
            if (r2 >= 0) goto L_0x002e
            goto L_0x000f
        L_0x002e:
            int r1 = r1 - r2
            int r2 = r5.getIntrinsicHeight()
            r0.setBounds(r3, r3, r1, r2)
            java.lang.String r0 = r5.Y
            boolean r0 = defpackage.oag.t(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004a
            r6.save()
            android.graphics.Path r1 = r5.u0
            android.graphics.Region$Op r2 = android.graphics.Region.Op.DIFFERENCE
            r6.clipPath(r1, r2)
        L_0x004a:
            android.graphics.drawable.Drawable r1 = r5.a
            r1.draw(r6)
            if (r0 == 0) goto L_0x0073
            r6.restore()
            android.graphics.RectF r0 = r5.t0
            bk4 r1 = r5.X
            int r2 = r1.b
            float r2 = (float) r2
            android.graphics.Paint r3 = r5.s0
            r6.drawRoundRect(r0, r2, r2, r3)
            java.lang.String r2 = r5.Y
            float r3 = r0.left
            int r4 = r1.a
            float r4 = (float) r4
            float r3 = r3 + r4
            float r0 = r0.bottom
            int r1 = r1.c
            float r1 = (float) r1
            float r0 = r0 - r1
            android.graphics.Paint r5 = r5.Z
            r6.drawText(r2, r3, r0, r5)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glf.draw(android.graphics.Canvas):void");
    }

    public final int getIntrinsicWidth() {
        int intrinsicWidth = super.getIntrinsicWidth();
        int i = 0;
        if (!oag.t(this.Y)) {
            int measureText = (oag.t(this.Y) ? 0 : (int) this.Z.measureText(this.Y)) - (super.getIntrinsicWidth() / 2);
            if (measureText >= 0) {
                i = measureText;
            }
        }
        return i + intrinsicWidth;
    }
}
