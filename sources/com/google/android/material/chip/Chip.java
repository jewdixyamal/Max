package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

public class Chip extends AppCompatCheckBox implements m03, rjd, n18 {
    public static final int L0 = m2c.Widget_MaterialComponents_Chip_Action;
    public static final Rect M0 = new Rect();
    public static final int[] N0 = {16842913};
    public static final int[] O0 = {16842911};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public CharSequence F0;
    public final l03 G0;
    public boolean H0;
    public final Rect I0 = new Rect();
    public final RectF J0 = new RectF();
    public final k03 K0 = new k03(0, this);
    public n03 s0;
    public InsetDrawable t0;
    public RippleDrawable u0;
    public View.OnClickListener v0;
    public CompoundButton.OnCheckedChangeListener w0;
    public m18 x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = 0
            r9 = 1
            int r10 = defpackage.tsb.chipStyle
            int r11 = L0
            r1 = r17
            android.content.Context r1 = defpackage.y18.a(r1, r7, r10, r11)
            r0.<init>(r1, r7, r10)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.I0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.J0 = r1
            k03 r1 = new k03
            r1.<init>(r8, r0)
            r0.K0 = r1
            android.content.Context r12 = r16.getContext()
            r13 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0032
            goto L_0x0080
        L_0x0032:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            r7.getAttributeValue(r1, r2)
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03b2
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03aa
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x03a4
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x039e
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r9)
            if (r2 == 0) goto L_0x0396
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r9)
            if (r2 != r9) goto L_0x0396
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r9)
            if (r2 != r9) goto L_0x0396
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r9)
            if (r2 != r9) goto L_0x0396
            java.lang.String r2 = "gravity"
            r7.getAttributeIntValue(r1, r2, r13)
        L_0x0080:
            n03 r14 = new n03
            r14.<init>(r12, r7, r10, r11)
            int[] r3 = defpackage.z2c.Chip
            int[] r6 = new int[r8]
            android.content.Context r1 = r14.q1
            r2 = r18
            r4 = r10
            r5 = r11
            android.content.res.TypedArray r1 = defpackage.sre.d(r1, r2, r3, r4, r5, r6)
            int r2 = defpackage.z2c.Chip_shapeAppearance
            boolean r2 = r1.hasValue(r2)
            r14.R1 = r2
            int r2 = defpackage.z2c.Chip_chipSurfaceColor
            android.content.Context r3 = r14.q1
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r3, r1, r2)
            android.content.res.ColorStateList r4 = r14.J0
            if (r4 == r2) goto L_0x00b0
            r14.J0 = r2
            int[] r2 = r14.getState()
            r14.onStateChange(r2)
        L_0x00b0:
            int r2 = defpackage.z2c.Chip_chipBackgroundColor
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r3, r1, r2)
            android.content.res.ColorStateList r4 = r14.K0
            if (r4 == r2) goto L_0x00c3
            r14.K0 = r2
            int[] r2 = r14.getState()
            r14.onStateChange(r2)
        L_0x00c3:
            int r2 = defpackage.z2c.Chip_chipMinHeight
            r4 = 0
            float r2 = r1.getDimension(r2, r4)
            float r5 = r14.L0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00d8
            r14.L0 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x00d8:
            int r2 = defpackage.z2c.Chip_chipCornerRadius
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x00e9
            int r2 = defpackage.z2c.Chip_chipCornerRadius
            float r2 = r1.getDimension(r2, r4)
            r14.E(r2)
        L_0x00e9:
            int r2 = defpackage.z2c.Chip_chipStrokeColor
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r3, r1, r2)
            r14.J(r2)
            int r2 = defpackage.z2c.Chip_chipStrokeWidth
            float r2 = r1.getDimension(r2, r4)
            r14.K(r2)
            int r2 = defpackage.z2c.Chip_rippleColor
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r3, r1, r2)
            r14.T(r2)
            int r2 = defpackage.z2c.Chip_android_text
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x010e
            java.lang.String r2 = ""
        L_0x010e:
            java.lang.CharSequence r5 = r14.Q0
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            dpe r6 = r14.w1
            if (r5 != 0) goto L_0x0122
            r14.Q0 = r2
            r6.e = r9
            r14.invalidateSelf()
            r14.y()
        L_0x0122:
            int r2 = defpackage.z2c.Chip_android_textAppearance
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0136
            int r2 = r1.getResourceId(r2, r8)
            if (r2 == 0) goto L_0x0136
            voe r5 = new voe
            r5.<init>(r3, r2)
            goto L_0x0137
        L_0x0136:
            r5 = 0
        L_0x0137:
            int r2 = defpackage.z2c.Chip_android_textSize
            float r15 = r5.k
            float r2 = r1.getDimension(r2, r15)
            r5.k = r2
            r6.c(r5, r3)
            int r2 = defpackage.z2c.Chip_android_ellipsize
            int r2 = r1.getInt(r2, r8)
            if (r2 == r9) goto L_0x015d
            r5 = 2
            if (r2 == r5) goto L_0x0158
            r5 = 3
            if (r2 == r5) goto L_0x0153
            goto L_0x0161
        L_0x0153:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r14.O1 = r2
            goto L_0x0161
        L_0x0158:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            r14.O1 = r2
            goto L_0x0161
        L_0x015d:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            r14.O1 = r2
        L_0x0161:
            int r2 = defpackage.z2c.Chip_chipIconVisible
            boolean r2 = r1.getBoolean(r2, r8)
            r14.I(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0187
            java.lang.String r5 = "chipIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x0187
            java.lang.String r5 = "chipIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x0187
            int r5 = defpackage.z2c.Chip_chipIconEnabled
            boolean r5 = r1.getBoolean(r5, r8)
            r14.I(r5)
        L_0x0187:
            int r5 = defpackage.z2c.Chip_chipIcon
            android.graphics.drawable.Drawable r5 = defpackage.ju0.s(r3, r1, r5)
            r14.F(r5)
            int r5 = defpackage.z2c.Chip_chipIconTint
            boolean r5 = r1.hasValue(r5)
            if (r5 == 0) goto L_0x01a1
            int r5 = defpackage.z2c.Chip_chipIconTint
            android.content.res.ColorStateList r5 = defpackage.ju0.q(r3, r1, r5)
            r14.H(r5)
        L_0x01a1:
            int r5 = defpackage.z2c.Chip_chipIconSize
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r1.getDimension(r5, r6)
            r14.G(r5)
            int r5 = defpackage.z2c.Chip_closeIconVisible
            boolean r5 = r1.getBoolean(r5, r8)
            r14.Q(r5)
            if (r7 == 0) goto L_0x01d0
            java.lang.String r5 = "closeIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x01d0
            java.lang.String r5 = "closeIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x01d0
            int r5 = defpackage.z2c.Chip_closeIconEnabled
            boolean r5 = r1.getBoolean(r5, r8)
            r14.Q(r5)
        L_0x01d0:
            int r5 = defpackage.z2c.Chip_closeIcon
            android.graphics.drawable.Drawable r5 = defpackage.ju0.s(r3, r1, r5)
            r14.L(r5)
            int r5 = defpackage.z2c.Chip_closeIconTint
            android.content.res.ColorStateList r5 = defpackage.ju0.q(r3, r1, r5)
            r14.P(r5)
            int r5 = defpackage.z2c.Chip_closeIconSize
            float r5 = r1.getDimension(r5, r4)
            r14.N(r5)
            int r5 = defpackage.z2c.Chip_android_checkable
            boolean r5 = r1.getBoolean(r5, r8)
            r14.A(r5)
            int r5 = defpackage.z2c.Chip_checkedIconVisible
            boolean r5 = r1.getBoolean(r5, r8)
            r14.D(r5)
            if (r7 == 0) goto L_0x0218
            java.lang.String r5 = "checkedIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x0218
            java.lang.String r5 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r5)
            if (r2 != 0) goto L_0x0218
            int r2 = defpackage.z2c.Chip_checkedIconEnabled
            boolean r2 = r1.getBoolean(r2, r8)
            r14.D(r2)
        L_0x0218:
            int r2 = defpackage.z2c.Chip_checkedIcon
            android.graphics.drawable.Drawable r2 = defpackage.ju0.s(r3, r1, r2)
            r14.B(r2)
            int r2 = defpackage.z2c.Chip_checkedIconTint
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0232
            int r2 = defpackage.z2c.Chip_checkedIconTint
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r3, r1, r2)
            r14.C(r2)
        L_0x0232:
            int r2 = defpackage.z2c.Chip_showMotionSpec
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0245
            int r2 = r1.getResourceId(r2, r8)
            if (r2 == 0) goto L_0x0245
            wc9 r2 = defpackage.wc9.a(r3, r2)
            goto L_0x0246
        L_0x0245:
            r2 = 0
        L_0x0246:
            r14.g1 = r2
            int r2 = defpackage.z2c.Chip_hideMotionSpec
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x025b
            int r2 = r1.getResourceId(r2, r8)
            if (r2 == 0) goto L_0x025b
            wc9 r15 = defpackage.wc9.a(r3, r2)
            goto L_0x025c
        L_0x025b:
            r15 = 0
        L_0x025c:
            r14.h1 = r15
            int r2 = defpackage.z2c.Chip_chipStartPadding
            float r2 = r1.getDimension(r2, r4)
            float r3 = r14.i1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0272
            r14.i1 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x0272:
            int r2 = defpackage.z2c.Chip_iconStartPadding
            float r2 = r1.getDimension(r2, r4)
            r14.S(r2)
            int r2 = defpackage.z2c.Chip_iconEndPadding
            float r2 = r1.getDimension(r2, r4)
            r14.R(r2)
            int r2 = defpackage.z2c.Chip_textStartPadding
            float r2 = r1.getDimension(r2, r4)
            float r3 = r14.l1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0298
            r14.l1 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x0298:
            int r2 = defpackage.z2c.Chip_textEndPadding
            float r2 = r1.getDimension(r2, r4)
            float r3 = r14.m1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02ac
            r14.m1 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x02ac:
            int r2 = defpackage.z2c.Chip_closeIconStartPadding
            float r2 = r1.getDimension(r2, r4)
            r14.O(r2)
            int r2 = defpackage.z2c.Chip_closeIconEndPadding
            float r2 = r1.getDimension(r2, r4)
            r14.M(r2)
            int r2 = defpackage.z2c.Chip_chipEndPadding
            float r2 = r1.getDimension(r2, r4)
            float r3 = r14.p1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r14.p1 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x02d2:
            int r2 = defpackage.z2c.Chip_android_maxWidth
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r14.Q1 = r2
            r1.recycle()
            int[] r15 = defpackage.z2c.Chip
            int[] r6 = new int[r8]
            defpackage.sre.a(r12, r7, r10, r11)
            r1 = r12
            r2 = r18
            r3 = r15
            r4 = r10
            r5 = r11
            defpackage.sre.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r7, r15, r10, r11)
            int r2 = defpackage.z2c.Chip_ensureMinTouchTargetSize
            boolean r2 = r1.getBoolean(r2, r8)
            r0.C0 = r2
            android.content.Context r2 = r16.getContext()
            r3 = 48
            float r2 = defpackage.mqd.h(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r3 = defpackage.z2c.Chip_chipMinTouchTargetSize
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.E0 = r2
            r1.recycle()
            r0.setChipDrawable(r14)
            java.util.WeakHashMap r1 = defpackage.zmf.a
            float r1 = defpackage.omf.i(r16)
            r14.k(r1)
            int[] r15 = defpackage.z2c.Chip
            int[] r6 = new int[r8]
            defpackage.sre.a(r12, r7, r10, r11)
            r1 = r12
            r2 = r18
            r3 = r15
            r4 = r10
            r5 = r11
            defpackage.sre.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r7, r15, r10, r11)
            int r2 = defpackage.z2c.Chip_shapeAppearance
            boolean r2 = r1.hasValue(r2)
            r1.recycle()
            l03 r1 = new l03
            r1.<init>(r0, r0)
            r0.G0 = r1
            r16.g()
            if (r2 != 0) goto L_0x035a
            e62 r1 = new e62
            r1.<init>(r0, r9)
            r0.setOutlineProvider(r1)
        L_0x035a:
            boolean r1 = r0.y0
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r14.Q0
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r14.O1
            r0.setEllipsize(r1)
            r16.j()
            n03 r1 = r0.s0
            boolean r1 = r1.P1
            if (r1 != 0) goto L_0x0378
            r0.setLines(r9)
            r0.setHorizontallyScrolling(r9)
        L_0x0378:
            r0.setGravity(r13)
            r16.i()
            boolean r1 = r0.C0
            if (r1 == 0) goto L_0x0387
            int r1 = r0.E0
            r0.setMinHeight(r1)
        L_0x0387:
            int r1 = r16.getLayoutDirection()
            r0.D0 = r1
            wz2 r1 = new wz2
            r1.<init>(r9, r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x0396:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Chip does not support multi-line text"
            r0.<init>(r1)
            throw r0
        L_0x039e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r3)
            throw r0
        L_0x03a4:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r3)
            throw r0
        L_0x03aa:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Please set start drawable using R.attr#chipIcon."
            r0.<init>(r1)
            throw r0
        L_0x03b2:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Please set left drawable using R.attr#chipIcon."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.J0;
        rectF.setEmpty();
        if (e() && this.v0 != null) {
            n03 n03 = this.s0;
            Rect bounds = n03.getBounds();
            rectF.setEmpty();
            if (n03.W()) {
                float f = n03.p1 + n03.o1 + n03.a1 + n03.n1 + n03.m1;
                if (bq4.a(n03) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.I0;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private voe getTextAppearance() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.w1.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            refreshDrawableState();
        }
    }

    public final void d(int i) {
        this.E0 = i;
        int i2 = 0;
        if (!this.C0) {
            InsetDrawable insetDrawable = this.t0;
            if (insetDrawable == null) {
                h();
            } else if (insetDrawable != null) {
                this.t0 = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
            }
        } else {
            int max = Math.max(0, i - ((int) this.s0.L0));
            int max2 = Math.max(0, i - this.s0.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                int i3 = max2 > 0 ? max2 / 2 : 0;
                if (max > 0) {
                    i2 = max / 2;
                }
                int i4 = i2;
                if (this.t0 != null) {
                    Rect rect = new Rect();
                    this.t0.getPadding(rect);
                    if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                        h();
                        return;
                    }
                }
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.t0 = new InsetDrawable(this.s0, i3, i4, i3, i4);
                h();
                return;
            }
            InsetDrawable insetDrawable2 = this.t0;
            if (insetDrawable2 == null) {
                h();
            } else if (insetDrawable2 != null) {
                this.t0 = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
            }
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.H0 ? super.dispatchHoverEvent(motionEvent) : this.G0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.H0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        l03 l03 = this.G0;
        l03.getClass();
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i3 = 0;
                                while (i < repeatCount && l03.q(i2, (Rect) null)) {
                                    i++;
                                    i3 = 1;
                                }
                                i = i3;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = l03.l;
                    if (i4 != Integer.MIN_VALUE) {
                        boolean s = l03.s(i4, 16, (Bundle) null);
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = l03.q(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = l03.q(1, (Rect) null);
            }
        }
        if (i == 0 || l03.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        n03 n03 = this.s0;
        boolean z = false;
        if (n03 != null && n03.x(n03.X0)) {
            n03 n032 = this.s0;
            int isEnabled = isEnabled();
            if (this.B0) {
                isEnabled++;
            }
            if (this.A0) {
                isEnabled++;
            }
            if (this.z0) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.B0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.A0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.z0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(n032.K1, iArr)) {
                n032.K1 = iArr;
                if (n032.W()) {
                    z = n032.z(n032.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    public final boolean e() {
        n03 n03 = this.s0;
        if (n03 != null) {
            Drawable drawable = n03.X0;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof y8g) {
                ((z8g) ((y8g) drawable)).getClass();
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        n03 n03 = this.s0;
        return n03 != null && n03.c1;
    }

    public final void g() {
        n03 n03;
        if (!e() || (n03 = this.s0) == null || !n03.W0 || this.v0 == null) {
            zmf.j(this, (a4) null);
            this.H0 = false;
            return;
        }
        zmf.j(this, this.G0);
        this.H0 = true;
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.F0)) {
            return this.F0;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).v0.a) ? "android.widget.Button" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.t0;
        return insetDrawable == null ? this.s0 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.e1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.f1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.K0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return Math.max(0.0f, n03.v());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.s0;
    }

    public float getChipEndPadding() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.p1;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        n03 n03 = this.s0;
        if (n03 == null || (drawable = n03.S0) == null) {
            return null;
        }
        if (!(drawable instanceof y8g)) {
            return drawable;
        }
        ((z8g) ((y8g) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.U0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.T0;
        }
        return null;
    }

    public float getChipMinHeight() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.L0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.i1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.N0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.O0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        n03 n03 = this.s0;
        if (n03 == null || (drawable = n03.X0) == null) {
            return null;
        }
        if (!(drawable instanceof y8g)) {
            return drawable;
        }
        ((z8g) ((y8g) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.b1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.o1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.a1;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.n1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.Z0;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.O1;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.H0) {
            l03 l03 = this.G0;
            if (l03.l == 1 || l03.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public wc9 getHideMotionSpec() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.h1;
        }
        return null;
    }

    public float getIconEndPadding() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.k1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.j1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.P0;
        }
        return null;
    }

    public gjd getShapeAppearanceModel() {
        return this.s0.a.a;
    }

    public wc9 getShowMotionSpec() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.g1;
        }
        return null;
    }

    public float getTextEndPadding() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.m1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        n03 n03 = this.s0;
        if (n03 != null) {
            return n03.l1;
        }
        return 0.0f;
    }

    public final void h() {
        ColorStateList colorStateList = this.s0.P0;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.u0 = new RippleDrawable(colorStateList, getBackgroundDrawable(), (Drawable) null);
        n03 n03 = this.s0;
        if (n03.L1) {
            n03.L1 = false;
            n03.M1 = null;
            n03.onStateChange(n03.getState());
        }
        RippleDrawable rippleDrawable = this.u0;
        WeakHashMap weakHashMap = zmf.a;
        setBackground(rippleDrawable);
        i();
    }

    public final void i() {
        n03 n03;
        if (!TextUtils.isEmpty(getText()) && (n03 = this.s0) != null) {
            int u = (int) (n03.u() + n03.p1 + n03.m1);
            n03 n032 = this.s0;
            int t = (int) (n032.t() + n032.i1 + n032.l1);
            if (this.t0 != null) {
                Rect rect = new Rect();
                this.t0.getPadding(rect);
                t += rect.left;
                u += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = zmf.a;
            setPaddingRelative(t, paddingTop, u, paddingBottom);
        }
    }

    public final void j() {
        TextPaint paint = getPaint();
        n03 n03 = this.s0;
        if (n03 != null) {
            paint.drawableState = n03.getState();
        }
        voe textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.K0);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nu0.N(this, this.s0);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, N0);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, O0);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.H0) {
            l03 l03 = this.G0;
            int i2 = l03.l;
            if (i2 != Integer.MIN_VALUE) {
                l03.j(i2);
            }
            if (z) {
                l03.q(i, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i2 = -1;
            if (chipGroup.c) {
                int i3 = 0;
                i = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i3);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i3).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        }
                        i++;
                    }
                    i3++;
                }
            }
            i = -1;
            Object tag = getTag(ivb.row_index_key);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) k4.a(isChecked(), i2, 1, i, 1).a);
        }
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) ? super.onResolvePointerIcon(motionEvent, i) : PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.D0 != i) {
            this.D0 = i;
            i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0045
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.z0
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r2)
        L_0x002a:
            r0 = r3
            goto L_0x0051
        L_0x002c:
            boolean r0 = r5.z0
            if (r0 == 0) goto L_0x0045
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.v0
            if (r0 == 0) goto L_0x003a
            r0.onClick(r5)
        L_0x003a:
            boolean r0 = r5.H0
            if (r0 == 0) goto L_0x0043
            l03 r0 = r5.G0
            r0.x(r3, r3)
        L_0x0043:
            r0 = r3
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            r5.setCloseIconPressed(r2)
            goto L_0x0051
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r3)
            goto L_0x002a
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 != 0) goto L_0x0059
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L_0x005a
        L_0x0059:
            r2 = r3
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.F0 = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.u0) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.u0) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.A(z);
        }
    }

    public void setCheckableResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.A(n03.q1.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        n03 n03 = this.s0;
        if (n03 == null) {
            this.y0 = z;
        } else if (n03.c1) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.B(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.B(s36.n(n03.q1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.C(z7.n(n03.q1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.D(n03.q1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        n03 n03 = this.s0;
        if (n03 != null && n03.K0 != colorStateList) {
            n03.K0 = colorStateList;
            n03.onStateChange(n03.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList n;
        n03 n03 = this.s0;
        if (n03 != null && n03.K0 != (n = z7.n(n03.q1, i))) {
            n03.K0 = n;
            n03.onStateChange(n03.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.E(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.E(n03.q1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(n03 n03) {
        n03 n032 = this.s0;
        if (n032 != n03) {
            if (n032 != null) {
                n032.N1 = new WeakReference((Object) null);
            }
            this.s0 = n03;
            n03.P1 = false;
            n03.N1 = new WeakReference(this);
            d(this.E0);
        }
    }

    public void setChipEndPadding(float f) {
        n03 n03 = this.s0;
        if (n03 != null && n03.p1 != f) {
            n03.p1 = f;
            n03.invalidateSelf();
            n03.y();
        }
    }

    public void setChipEndPaddingResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            float dimension = n03.q1.getResources().getDimension(i);
            if (n03.p1 != dimension) {
                n03.p1 = dimension;
                n03.invalidateSelf();
                n03.y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.F(s36.n(n03.q1, i));
        }
    }

    public void setChipIconSize(float f) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.G(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.G(n03.q1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.H(z7.n(n03.q1, i));
        }
    }

    public void setChipIconVisible(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.I(n03.q1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        n03 n03 = this.s0;
        if (n03 != null && n03.L0 != f) {
            n03.L0 = f;
            n03.invalidateSelf();
            n03.y();
        }
    }

    public void setChipMinHeightResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            float dimension = n03.q1.getResources().getDimension(i);
            if (n03.L0 != dimension) {
                n03.L0 = dimension;
                n03.invalidateSelf();
                n03.y();
            }
        }
    }

    public void setChipStartPadding(float f) {
        n03 n03 = this.s0;
        if (n03 != null && n03.i1 != f) {
            n03.i1 = f;
            n03.invalidateSelf();
            n03.y();
        }
    }

    public void setChipStartPaddingResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            float dimension = n03.q1.getResources().getDimension(i);
            if (n03.i1 != dimension) {
                n03.i1 = dimension;
                n03.invalidateSelf();
                n03.y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.J(z7.n(n03.q1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.K(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.K(n03.q1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.L(drawable);
        }
        g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        n03 n03 = this.s0;
        if (n03 != null && n03.b1 != charSequence) {
            rl0 c = rl0.c();
            n03.b1 = c.d(charSequence, c.c);
            n03.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.M(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.M(n03.q1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.L(s36.n(n03.q1, i));
        }
        g();
    }

    public void setCloseIconSize(float f) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.N(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.N(n03.q1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.O(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.O(n03.q1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.P(z7.n(n03.q1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.k(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.s0 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                n03 n03 = this.s0;
                if (n03 != null) {
                    n03.O1 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.C0 = z;
        d(this.E0);
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(wc9 wc9) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.h1 = wc9;
        }
    }

    public void setHideMotionSpecResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.h1 = wc9.a(n03.q1, i);
        }
    }

    public void setIconEndPadding(float f) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.R(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.R(n03.q1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.S(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.S(n03.q1.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(m18 m18) {
        this.x0 = m18;
    }

    public void setLayoutDirection(int i) {
        if (this.s0 != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.Q1 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.v0 = onClickListener;
        g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.T(colorStateList);
        }
        if (!this.s0.L1) {
            h();
        }
    }

    public void setRippleColorResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.T(z7.n(n03.q1, i));
            if (!this.s0.L1) {
                h();
            }
        }
    }

    public void setShapeAppearanceModel(gjd gjd) {
        this.s0.setShapeAppearanceModel(gjd);
    }

    public void setShowMotionSpec(wc9 wc9) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.g1 = wc9;
        }
    }

    public void setShowMotionSpecResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.g1 = wc9.a(n03.q1, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        n03 n03 = this.s0;
        if (n03 != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(n03.P1 ? null : charSequence, bufferType);
            n03 n032 = this.s0;
            if (n032 != null && !TextUtils.equals(n032.Q0, charSequence)) {
                n032.Q0 = charSequence;
                n032.w1.e = true;
                n032.invalidateSelf();
                n032.y();
            }
        }
    }

    public void setTextAppearance(voe voe) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.w1.c(voe, n03.q1);
        }
        j();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        n03 n03 = this.s0;
        if (n03 != null && n03.m1 != f) {
            n03.m1 = f;
            n03.invalidateSelf();
            n03.y();
        }
    }

    public void setTextEndPaddingResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            float dimension = n03.q1.getResources().getDimension(i);
            if (n03.m1 != dimension) {
                n03.m1 = dimension;
                n03.invalidateSelf();
                n03.y();
            }
        }
    }

    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        n03 n03 = this.s0;
        if (n03 != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            dpe dpe = n03.w1;
            voe voe = dpe.g;
            if (voe != null) {
                voe.k = applyDimension;
                dpe.a.setTextSize(applyDimension);
                n03.a();
            }
        }
        j();
    }

    public void setTextStartPadding(float f) {
        n03 n03 = this.s0;
        if (n03 != null && n03.l1 != f) {
            n03.l1 = f;
            n03.invalidateSelf();
            n03.y();
        }
    }

    public void setTextStartPaddingResource(int i) {
        n03 n03 = this.s0;
        if (n03 != null) {
            float dimension = n03.q1.getResources().getDimension(i);
            if (n03.l1 != dimension) {
                n03.l1 = dimension;
                n03.invalidateSelf();
                n03.y();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.Q(z);
        }
        g();
    }

    public void setCheckedIconVisible(boolean z) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.D(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        n03 n03 = this.s0;
        if (n03 != null) {
            n03.I(z);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        n03 n03 = this.s0;
        if (n03 != null) {
            Context context2 = n03.q1;
            n03.w1.c(new voe(context2, i), context2);
        }
        j();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        n03 n03 = this.s0;
        if (n03 != null) {
            Context context = n03.q1;
            n03.w1.c(new voe(context, i), context);
        }
        j();
    }
}
