package com.google.android.material.appbar;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;

public class MaterialToolbar extends Toolbar {
    public static final int n1 = m2c.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] o1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer i1;
    public boolean j1;
    public boolean k1;
    public ImageView.ScaleType l1;
    public Boolean m1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = defpackage.tsb.toolbarStyle
            int r4 = n1
            android.content.Context r8 = defpackage.y18.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.z2c.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = defpackage.sre.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.z2c.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r0)
            r1 = -1
            if (r0 == 0) goto L_0x002c
            int r0 = defpackage.z2c.MaterialToolbar_navigationIconTint
            int r0 = r9.getColor(r0, r1)
            r7.setNavigationIconTint(r0)
        L_0x002c:
            int r0 = defpackage.z2c.MaterialToolbar_titleCentered
            boolean r0 = r9.getBoolean(r0, r6)
            r7.j1 = r0
            int r0 = defpackage.z2c.MaterialToolbar_subtitleCentered
            boolean r0 = r9.getBoolean(r0, r6)
            r7.k1 = r0
            int r0 = defpackage.z2c.MaterialToolbar_logoScaleType
            int r0 = r9.getInt(r0, r1)
            if (r0 < 0) goto L_0x004d
            android.widget.ImageView$ScaleType[] r1 = o1
            int r2 = r1.length
            if (r0 >= r2) goto L_0x004d
            r0 = r1[r0]
            r7.l1 = r0
        L_0x004d:
            int r0 = defpackage.z2c.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r9.hasValue(r0)
            if (r0 == 0) goto L_0x0061
            int r0 = defpackage.z2c.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r9.getBoolean(r0, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.m1 = r0
        L_0x0061:
            r9.recycle()
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            if (r9 != 0) goto L_0x006f
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r6)
            goto L_0x0073
        L_0x006f:
            android.content.res.ColorStateList r9 = defpackage.oag.r(r9)
        L_0x0073:
            if (r9 == 0) goto L_0x008c
            q18 r0 = new q18
            r0.<init>()
            r0.l(r9)
            r0.j(r8)
            java.util.WeakHashMap r8 = defpackage.zmf.a
            float r8 = defpackage.omf.i(r7)
            r0.k(r8)
            r7.setBackground(r0)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.l1;
    }

    public Integer getNavigationIconTint() {
        return this.i1;
    }

    public final void m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof wq8;
        if (z) {
            ((wq8) menu).w();
        }
        super.m(i);
        if (z) {
            ((wq8) menu).v();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof q18) {
            nu0.N(this, (q18) background);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.j1 || this.k1) {
            ArrayList q = i24.q(this, getTitle());
            boolean isEmpty = q.isEmpty();
            ky6 ky6 = i24.f;
            TextView textView = isEmpty ? null : (TextView) Collections.min(q, ky6);
            ArrayList q2 = i24.q(this, getSubtitle());
            TextView textView2 = q2.isEmpty() ? null : (TextView) Collections.max(q2, ky6);
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.j1 && textView != null) {
                    y(textView, pair);
                }
                if (this.k1 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.m1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.l1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof q18) {
            ((q18) background).k(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.m1;
        if (bool == null || bool.booleanValue() != z) {
            this.m1 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.l1 != scaleType) {
            this.l1 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.i1 == null)) {
            drawable = drawable.mutate();
            aq4.g(drawable, this.i1.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.i1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.j1 != z) {
            this.j1 = z;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
