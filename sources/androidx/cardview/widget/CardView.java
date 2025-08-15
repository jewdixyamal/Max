package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class CardView extends FrameLayout {
    public static final int[] t0 = {16842801};
    public static final ob6 u0 = new Object();
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect o = new Rect();
    public final qz7 s0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CardView(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r0 = defpackage.nsb.cardViewStyle
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.c = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r9.o = r2
            qz7 r2 = new qz7
            r2.<init>((androidx.cardview.widget.CardView) r9)
            r9.s0 = r2
            int[] r3 = defpackage.h3c.CardView
            int r4 = defpackage.j2c.CardView
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r3, r0, r4)
            int r11 = defpackage.h3c.CardView_cardBackgroundColor
            boolean r11 = r10.hasValue(r11)
            r0 = 0
            if (r11 == 0) goto L_0x0032
            int r11 = defpackage.h3c.CardView_cardBackgroundColor
            android.content.res.ColorStateList r11 = r10.getColorStateList(r11)
            goto L_0x006b
        L_0x0032:
            android.content.Context r11 = r9.getContext()
            int[] r3 = t0
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r3)
            int r3 = r11.getColor(r0, r0)
            r11.recycle()
            r11 = 3
            float[] r11 = new float[r11]
            android.graphics.Color.colorToHSV(r3, r11)
            r3 = 2
            r11 = r11[r3]
            r3 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x005d
            android.content.res.Resources r11 = r9.getResources()
            int r3 = defpackage.btb.cardview_light_background
            int r11 = r11.getColor(r3)
            goto L_0x0067
        L_0x005d:
            android.content.res.Resources r11 = r9.getResources()
            int r3 = defpackage.btb.cardview_dark_background
            int r11 = r11.getColor(r3)
        L_0x0067:
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
        L_0x006b:
            int r3 = defpackage.h3c.CardView_cardCornerRadius
            r4 = 0
            float r3 = r10.getDimension(r3, r4)
            int r5 = defpackage.h3c.CardView_cardElevation
            float r5 = r10.getDimension(r5, r4)
            int r6 = defpackage.h3c.CardView_cardMaxElevation
            float r4 = r10.getDimension(r6, r4)
            int r6 = defpackage.h3c.CardView_cardUseCompatPadding
            boolean r6 = r10.getBoolean(r6, r0)
            r9.a = r6
            int r6 = defpackage.h3c.CardView_cardPreventCornerOverlap
            r7 = 1
            boolean r6 = r10.getBoolean(r6, r7)
            r9.b = r6
            int r6 = defpackage.h3c.CardView_contentPadding
            int r6 = r10.getDimensionPixelSize(r6, r0)
            int r8 = defpackage.h3c.CardView_contentPaddingLeft
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.left = r8
            int r8 = defpackage.h3c.CardView_contentPaddingTop
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.top = r8
            int r8 = defpackage.h3c.CardView_contentPaddingRight
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.right = r8
            int r8 = defpackage.h3c.CardView_contentPaddingBottom
            int r6 = r10.getDimensionPixelSize(r8, r6)
            r1.bottom = r6
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ba
            r4 = r5
        L_0x00ba:
            int r1 = defpackage.h3c.CardView_android_minWidth
            r10.getDimensionPixelSize(r1, r0)
            int r1 = defpackage.h3c.CardView_android_minHeight
            r10.getDimensionPixelSize(r1, r0)
            r10.recycle()
            ob6 r10 = u0
            lnc r0 = new lnc
            r0.<init>(r11, r3)
            r2.b = r0
            r9.setBackgroundDrawable(r0)
            r9.setClipToOutline(r7)
            r9.setElevation(r5)
            r10.m(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.CardView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public ColorStateList getCardBackgroundColor() {
        return ((lnc) ((Drawable) this.s0.b)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.s0.c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((lnc) ((Drawable) this.s0.b)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((lnc) ((Drawable) this.s0.b)).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        lnc lnc = (lnc) ((Drawable) this.s0.b);
        if (valueOf == null) {
            lnc.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        lnc.h = valueOf;
        lnc.b.setColor(valueOf.getColorForState(lnc.getState(), lnc.h.getDefaultColor()));
        lnc.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.s0.c).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        u0.m(this.s0, f);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            ob6 ob6 = u0;
            qz7 qz7 = this.s0;
            ob6.m(qz7, ((lnc) ((Drawable) qz7.b)).e);
        }
    }

    public void setRadius(float f) {
        lnc lnc = (lnc) ((Drawable) this.s0.b);
        if (f != lnc.a) {
            lnc.a = f;
            lnc.b((Rect) null);
            lnc.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            ob6 ob6 = u0;
            qz7 qz7 = this.s0;
            ob6.m(qz7, ((lnc) ((Drawable) qz7.b)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        lnc lnc = (lnc) ((Drawable) this.s0.b);
        if (colorStateList == null) {
            lnc.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        lnc.h = colorStateList;
        lnc.b.setColor(colorStateList.getColorForState(lnc.getState(), lnc.h.getDefaultColor()));
        lnc.invalidateSelf();
    }
}
