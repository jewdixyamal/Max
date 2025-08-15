package com.google.android.material.chip;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.List;

public class ChipGroup extends qq5 {
    public static final int y0 = m2c.Widget_MaterialComponents_ChipGroup;
    public int s0;
    public int t0;
    public q03 u0;
    public final ana v0;
    public final int w0;
    public final r03 x0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            int r3 = defpackage.tsb.chipGroupStyle
            int r4 = y0
            android.content.Context r9 = defpackage.y18.a(r9, r10, r3, r4)
            r8.<init>(r9, r10, r3)
            r6 = 0
            r8.c = r6
            android.content.res.Resources$Theme r9 = r9.getTheme()
            int[] r0 = defpackage.z2c.FlowLayout
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0, r6, r6)
            int r0 = defpackage.z2c.FlowLayout_lineSpacing
            int r0 = r9.getDimensionPixelSize(r0, r6)
            r8.a = r0
            int r0 = defpackage.z2c.FlowLayout_itemSpacing
            int r0 = r9.getDimensionPixelSize(r0, r6)
            r8.b = r0
            r9.recycle()
            ana r9 = new ana
            r9.<init>()
            r8.v0 = r9
            r03 r7 = new r03
            r7.<init>(r8)
            r8.x0 = r7
            android.content.Context r0 = r8.getContext()
            int[] r2 = defpackage.z2c.ChipGroup
            int[] r5 = new int[r6]
            r1 = r10
            android.content.res.TypedArray r10 = defpackage.sre.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.z2c.ChipGroup_chipSpacing
            int r0 = r10.getDimensionPixelOffset(r0, r6)
            int r1 = defpackage.z2c.ChipGroup_chipSpacingHorizontal
            int r1 = r10.getDimensionPixelOffset(r1, r0)
            r8.setChipSpacingHorizontal(r1)
            int r1 = defpackage.z2c.ChipGroup_chipSpacingVertical
            int r0 = r10.getDimensionPixelOffset(r1, r0)
            r8.setChipSpacingVertical(r0)
            int r0 = defpackage.z2c.ChipGroup_singleLine
            boolean r0 = r10.getBoolean(r0, r6)
            r8.setSingleLine((boolean) r0)
            int r0 = defpackage.z2c.ChipGroup_singleSelection
            boolean r0 = r10.getBoolean(r0, r6)
            r8.setSingleSelection((boolean) r0)
            int r0 = defpackage.z2c.ChipGroup_selectionRequired
            boolean r0 = r10.getBoolean(r0, r6)
            r8.setSelectionRequired(r0)
            int r0 = defpackage.z2c.ChipGroup_checkedChip
            r1 = -1
            int r0 = r10.getResourceId(r0, r1)
            r8.w0 = r0
            r10.recycle()
            y8 r10 = new y8
            r10.<init>((java.lang.Object) r8)
            r9.X = r10
            super.setOnHierarchyChangeListener(r7)
            java.util.WeakHashMap r9 = defpackage.zmf.a
            r9 = 1
            r8.setImportantForAccessibility(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof o03);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.v0.l();
    }

    public List<Integer> getCheckedChipIds() {
        return this.v0.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.s0;
    }

    public int getChipSpacingVertical() {
        return this.t0;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.w0;
        if (i != -1) {
            ana ana = this.v0;
            n18 n18 = (n18) ((HashMap) ana.c).get(Integer.valueOf(i));
            if (n18 != null && ana.f(n18)) {
                ana.m();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.a(getRowCount(), this.c ? getVisibleChipCount() : -1, this.v0.a ? 1 : 2).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.t0 != i) {
            this.t0 = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(p03 p03) {
        if (p03 == null) {
            setOnCheckedStateChangeListener((q03) null);
        } else {
            setOnCheckedStateChangeListener(new ph4((Object) this, (Object) p03, false));
        }
    }

    public void setOnCheckedStateChangeListener(q03 q03) {
        this.u0 = q03;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.x0.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.v0.b = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        ana ana = this.v0;
        if (ana.a != z) {
            ana.a = z;
            ana.g();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
