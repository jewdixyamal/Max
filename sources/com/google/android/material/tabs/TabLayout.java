package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@dof
public class TabLayout extends HorizontalScrollView {
    public static final int k1 = m2c.Widget_Design_TabLayout;
    public static final v5b l1 = new v5b(16);
    public ColorStateList A0;
    public ColorStateList B0;
    public Drawable C0;
    public int D0 = 0;
    public final PorterDuff.Mode E0;
    public final float F0;
    public final float G0;
    public final int H0;
    public int I0 = Integer.MAX_VALUE;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public int N0;
    public final int O0;
    public int P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public int T0 = -1;
    public int U0;
    public boolean V0;
    public qq9 W0;
    public final TimeInterpolator X0;
    public bje Y0;
    public final ArrayList Z0 = new ArrayList();
    public int a = -1;
    public cx5 a1;
    public final ArrayList b = new ArrayList();
    public ValueAnimator b1;
    public eje c;
    public ViewPager c1;
    public hpa d1;
    public g04 e1;
    public fje f1;
    public aje g1;
    public boolean h1;
    public int i1;
    public final u5b j1 = new u5b(12);
    public final dje o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final int y0 = -1;
    public ColorStateList z0;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r3 = defpackage.tsb.tabStyle
            int r4 = k1
            android.content.Context r10 = defpackage.y18.a(r10, r11, r3, r4)
            r9.<init>(r10, r11, r3)
            r10 = -1
            r9.a = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.b = r0
            r9.y0 = r10
            r6 = 0
            r9.D0 = r6
            r0 = 2147483647(0x7fffffff, float:NaN)
            r9.I0 = r0
            r9.T0 = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.Z0 = r0
            u5b r0 = new u5b
            r1 = 12
            r0.<init>(r1)
            r9.j1 = r0
            android.content.Context r7 = r9.getContext()
            r9.setHorizontalScrollBarEnabled(r6)
            dje r8 = new dje
            r8.<init>(r9, r7)
            r9.o = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r10)
            super.addView(r8, r6, r0)
            int[] r2 = defpackage.z2c.TabLayout
            int r0 = defpackage.z2c.TabLayout_tabTextAppearance
            int[] r5 = new int[]{r0}
            r0 = r7
            r1 = r11
            android.content.res.TypedArray r11 = defpackage.sre.d(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            android.content.res.ColorStateList r0 = defpackage.oag.r(r0)
            if (r0 == 0) goto L_0x0077
            q18 r1 = new q18
            r1.<init>()
            r1.l(r0)
            r1.j(r7)
            java.util.WeakHashMap r0 = defpackage.zmf.a
            float r0 = defpackage.omf.i(r9)
            r1.k(r0)
            r9.setBackground(r1)
        L_0x0077:
            int r0 = defpackage.z2c.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r0 = defpackage.ju0.s(r7, r11, r0)
            r9.setSelectedTabIndicator((android.graphics.drawable.Drawable) r0)
            int r0 = defpackage.z2c.TabLayout_tabIndicatorColor
            int r0 = r11.getColor(r0, r6)
            r9.setSelectedTabIndicatorColor(r0)
            int r0 = defpackage.z2c.TabLayout_tabIndicatorHeight
            int r0 = r11.getDimensionPixelSize(r0, r10)
            r8.b(r0)
            int r0 = defpackage.z2c.TabLayout_tabIndicatorGravity
            int r0 = r11.getInt(r0, r6)
            r9.setSelectedTabIndicatorGravity(r0)
            int r0 = defpackage.z2c.TabLayout_tabIndicatorAnimationMode
            int r0 = r11.getInt(r0, r6)
            r9.setTabIndicatorAnimationMode(r0)
            int r0 = defpackage.z2c.TabLayout_tabIndicatorFullWidth
            r1 = 1
            boolean r0 = r11.getBoolean(r0, r1)
            r9.setTabIndicatorFullWidth(r0)
            int r0 = defpackage.z2c.TabLayout_tabPadding
            int r0 = r11.getDimensionPixelSize(r0, r6)
            r9.v0 = r0
            r9.u0 = r0
            r9.t0 = r0
            r9.s0 = r0
            int r2 = defpackage.z2c.TabLayout_tabPaddingStart
            int r2 = r11.getDimensionPixelSize(r2, r0)
            r9.s0 = r2
            int r2 = defpackage.z2c.TabLayout_tabPaddingTop
            int r2 = r11.getDimensionPixelSize(r2, r0)
            r9.t0 = r2
            int r2 = defpackage.z2c.TabLayout_tabPaddingEnd
            int r2 = r11.getDimensionPixelSize(r2, r0)
            r9.u0 = r2
            int r2 = defpackage.z2c.TabLayout_tabPaddingBottom
            int r0 = r11.getDimensionPixelSize(r2, r0)
            r9.v0 = r0
            int r0 = defpackage.tsb.isMaterial3Theme
            boolean r0 = defpackage.kq0.E(r0, r7, r6)
            if (r0 == 0) goto L_0x00e9
            int r0 = defpackage.tsb.textAppearanceTitleSmall
            r9.w0 = r0
            goto L_0x00ed
        L_0x00e9:
            int r0 = defpackage.tsb.textAppearanceButton
            r9.w0 = r0
        L_0x00ed:
            int r0 = defpackage.z2c.TabLayout_tabTextAppearance
            int r2 = defpackage.m2c.TextAppearance_Design_Tab
            int r0 = r11.getResourceId(r0, r2)
            r9.x0 = r0
            int[] r2 = defpackage.p3c.TextAppearance
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r0, r2)
            int r3 = defpackage.p3c.TextAppearance_android_textSize     // Catch:{ all -> 0x0216 }
            int r3 = r2.getDimensionPixelSize(r3, r6)     // Catch:{ all -> 0x0216 }
            float r3 = (float) r3     // Catch:{ all -> 0x0216 }
            r9.F0 = r3     // Catch:{ all -> 0x0216 }
            int r4 = defpackage.p3c.TextAppearance_android_textColor     // Catch:{ all -> 0x0216 }
            android.content.res.ColorStateList r4 = defpackage.ju0.q(r7, r2, r4)     // Catch:{ all -> 0x0216 }
            r9.z0 = r4     // Catch:{ all -> 0x0216 }
            r2.recycle()
            int r2 = defpackage.z2c.TabLayout_tabSelectedTextAppearance
            boolean r2 = r11.hasValue(r2)
            if (r2 == 0) goto L_0x0121
            int r2 = defpackage.z2c.TabLayout_tabSelectedTextAppearance
            int r0 = r11.getResourceId(r2, r0)
            r9.y0 = r0
        L_0x0121:
            int r0 = r9.y0
            if (r0 == r10) goto L_0x015f
            int[] r2 = defpackage.p3c.TextAppearance
            android.content.res.TypedArray r0 = r7.obtainStyledAttributes(r0, r2)
            int r2 = defpackage.p3c.TextAppearance_android_textSize     // Catch:{ all -> 0x0155 }
            int r3 = (int) r3     // Catch:{ all -> 0x0155 }
            r0.getDimensionPixelSize(r2, r3)     // Catch:{ all -> 0x0155 }
            int r2 = defpackage.p3c.TextAppearance_android_textColor     // Catch:{ all -> 0x0155 }
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r7, r0, r2)     // Catch:{ all -> 0x0155 }
            if (r2 == 0) goto L_0x0157
            android.content.res.ColorStateList r3 = r9.z0     // Catch:{ all -> 0x0155 }
            int r3 = r3.getDefaultColor()     // Catch:{ all -> 0x0155 }
            r4 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r4 = new int[]{r4}     // Catch:{ all -> 0x0155 }
            int r5 = r2.getDefaultColor()     // Catch:{ all -> 0x0155 }
            int r2 = r2.getColorForState(r4, r5)     // Catch:{ all -> 0x0155 }
            android.content.res.ColorStateList r2 = f(r3, r2)     // Catch:{ all -> 0x0155 }
            r9.z0 = r2     // Catch:{ all -> 0x0155 }
            goto L_0x0157
        L_0x0155:
            r9 = move-exception
            goto L_0x015b
        L_0x0157:
            r0.recycle()
            goto L_0x015f
        L_0x015b:
            r0.recycle()
            throw r9
        L_0x015f:
            int r0 = defpackage.z2c.TabLayout_tabTextColor
            boolean r0 = r11.hasValue(r0)
            if (r0 == 0) goto L_0x016f
            int r0 = defpackage.z2c.TabLayout_tabTextColor
            android.content.res.ColorStateList r0 = defpackage.ju0.q(r7, r11, r0)
            r9.z0 = r0
        L_0x016f:
            int r0 = defpackage.z2c.TabLayout_tabSelectedTextColor
            boolean r0 = r11.hasValue(r0)
            if (r0 == 0) goto L_0x0189
            int r0 = defpackage.z2c.TabLayout_tabSelectedTextColor
            int r0 = r11.getColor(r0, r6)
            android.content.res.ColorStateList r2 = r9.z0
            int r2 = r2.getDefaultColor()
            android.content.res.ColorStateList r0 = f(r2, r0)
            r9.z0 = r0
        L_0x0189:
            int r0 = defpackage.z2c.TabLayout_tabIconTint
            android.content.res.ColorStateList r0 = defpackage.ju0.q(r7, r11, r0)
            r9.A0 = r0
            int r0 = defpackage.z2c.TabLayout_tabIconTintMode
            int r0 = r11.getInt(r0, r10)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = defpackage.mqd.A(r0, r2)
            r9.E0 = r0
            int r0 = defpackage.z2c.TabLayout_tabRippleColor
            android.content.res.ColorStateList r0 = defpackage.ju0.q(r7, r11, r0)
            r9.B0 = r0
            int r0 = defpackage.z2c.TabLayout_tabIndicatorAnimationDuration
            r2 = 300(0x12c, float:4.2E-43)
            int r0 = r11.getInt(r0, r2)
            r9.O0 = r0
            int r0 = defpackage.tsb.motionEasingEmphasizedInterpolator
            wb5 r2 = defpackage.og.b
            android.animation.TimeInterpolator r0 = defpackage.z7.Q(r7, r0, r2)
            r9.X0 = r0
            int r0 = defpackage.z2c.TabLayout_tabMinWidth
            int r0 = r11.getDimensionPixelSize(r0, r10)
            r9.J0 = r0
            int r0 = defpackage.z2c.TabLayout_tabMaxWidth
            int r10 = r11.getDimensionPixelSize(r0, r10)
            r9.K0 = r10
            int r10 = defpackage.z2c.TabLayout_tabBackground
            int r10 = r11.getResourceId(r10, r6)
            r9.H0 = r10
            int r10 = defpackage.z2c.TabLayout_tabContentStart
            int r10 = r11.getDimensionPixelSize(r10, r6)
            r9.M0 = r10
            int r10 = defpackage.z2c.TabLayout_tabMode
            int r10 = r11.getInt(r10, r1)
            r9.Q0 = r10
            int r10 = defpackage.z2c.TabLayout_tabGravity
            int r10 = r11.getInt(r10, r6)
            r9.N0 = r10
            int r10 = defpackage.z2c.TabLayout_tabInlineLabel
            boolean r10 = r11.getBoolean(r10, r6)
            r9.R0 = r10
            int r10 = defpackage.z2c.TabLayout_tabUnboundedRipple
            boolean r10 = r11.getBoolean(r10, r6)
            r9.V0 = r10
            r11.recycle()
            android.content.res.Resources r10 = r9.getResources()
            int r11 = defpackage.stb.design_tab_text_size_2line
            int r11 = r10.getDimensionPixelSize(r11)
            float r11 = (float) r11
            r9.G0 = r11
            int r11 = defpackage.stb.design_tab_scrollable_min_width
            int r10 = r10.getDimensionPixelSize(r11)
            r9.L0 = r10
            r9.d()
            return
        L_0x0216:
            r9 = move-exception
            r2.recycle()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static ColorStateList f(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            eje eje = (eje) arrayList.get(i);
            if (eje == null || eje.a == null || TextUtils.isEmpty(eje.b)) {
                i++;
            } else if (!this.R0) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.J0;
        if (i != -1) {
            return i;
        }
        int i2 = this.Q0;
        if (i2 == 0 || i2 == 2) {
            return this.L0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.o.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        dje dje = this.o;
        int childCount = dje.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = dje.getChildAt(i2);
                boolean z = true;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(i2 == i);
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                    if (childAt instanceof gje) {
                        ((gje) childAt).g();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(bje bje) {
        ArrayList arrayList = this.Z0;
        if (!arrayList.contains(bje)) {
            arrayList.add(bje);
        }
    }

    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(eje eje, int i, boolean z) {
        if (eje.f == this) {
            eje.d = i;
            ArrayList arrayList = this.b;
            arrayList.add(i, eje);
            int size = arrayList.size();
            int i2 = -1;
            for (int i3 = i + 1; i3 < size; i3++) {
                if (((eje) arrayList.get(i3)).d == this.a) {
                    i2 = i3;
                }
                ((eje) arrayList.get(i3)).d = i3;
            }
            this.a = i2;
            gje gje = eje.g;
            gje.setSelected(false);
            gje.setActivated(false);
            int i4 = eje.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.Q0 == 1 && this.N0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.o.addView(gje, i4, layoutParams);
            if (z) {
                TabLayout tabLayout = eje.f;
                if (tabLayout != null) {
                    tabLayout.o(eje, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void c(int i) {
        if (i != -1) {
            if (getWindowToken() != null) {
                WeakHashMap weakHashMap = zmf.a;
                if (isLaidOut()) {
                    dje dje = this.o;
                    int childCount = dje.getChildCount();
                    int i2 = 0;
                    while (i2 < childCount) {
                        if (dje.getChildAt(i2).getWidth() > 0) {
                            i2++;
                        }
                    }
                    int scrollX = getScrollX();
                    int e = e(i, 0.0f);
                    if (scrollX != e) {
                        g();
                        this.b1.setIntValues(new int[]{scrollX, e});
                        this.b1.start();
                    }
                    ValueAnimator valueAnimator = dje.a;
                    if (!(valueAnimator == null || !valueAnimator.isRunning() || dje.b.a == i)) {
                        dje.a.cancel();
                    }
                    dje.d(i, this.O0, true);
                    return;
                }
            }
            q(i, 0.0f, true, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r0 != 2) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r4 = this;
            int r0 = r4.Q0
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = r2
            goto L_0x0014
        L_0x000b:
            int r0 = r4.M0
            int r3 = r4.s0
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            java.util.WeakHashMap r3 = defpackage.zmf.a
            dje r3 = r4.o
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r4.Q0
            r2 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r2) goto L_0x0025
            if (r0 == r1) goto L_0x0025
            goto L_0x003c
        L_0x0025:
            r3.setGravity(r2)
            goto L_0x003c
        L_0x0029:
            int r0 = r4.N0
            if (r0 == 0) goto L_0x0036
            if (r0 == r2) goto L_0x0032
            if (r0 == r1) goto L_0x0036
            goto L_0x003c
        L_0x0032:
            r3.setGravity(r2)
            goto L_0x003c
        L_0x0036:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L_0x003c:
            r4.s(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i, float f) {
        dje dje;
        View childAt;
        int i2 = this.Q0;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = dje.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        View childAt2 = i4 < dje.getChildCount() ? (dje = this.o).getChildAt(i4) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        WeakHashMap weakHashMap = zmf.a;
        return getLayoutDirection() == 0 ? left + i5 : left - i5;
    }

    public final void g() {
        if (this.b1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.b1 = valueAnimator;
            valueAnimator.setInterpolator(this.X0);
            this.b1.setDuration((long) this.O0);
            this.b1.addUpdateListener(new yj0(7, this));
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        eje eje = this.c;
        if (eje != null) {
            return eje.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.N0;
    }

    public ColorStateList getTabIconTint() {
        return this.A0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.U0;
    }

    public int getTabIndicatorGravity() {
        return this.P0;
    }

    public int getTabMaxWidth() {
        return this.I0;
    }

    public int getTabMode() {
        return this.Q0;
    }

    public ColorStateList getTabRippleColor() {
        return this.B0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.C0;
    }

    public ColorStateList getTabTextColors() {
        return this.z0;
    }

    public final eje h(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (eje) this.b.get(i);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [eje, java.lang.Object] */
    public final eje i() {
        eje eje = (eje) l1.f();
        eje eje2 = eje;
        if (eje == null) {
            ? obj = new Object();
            obj.d = -1;
            obj.h = -1;
            eje2 = obj;
        }
        eje2.f = this;
        u5b u5b = this.j1;
        gje gje = u5b != null ? (gje) u5b.f() : null;
        if (gje == null) {
            gje = new gje(this, getContext());
        }
        gje.setTab(eje2);
        gje.setFocusable(true);
        gje.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(eje2.c)) {
            gje.setContentDescription(eje2.b);
        } else {
            gje.setContentDescription(eje2.c);
        }
        eje2.g = gje;
        int i = eje2.h;
        if (i != -1) {
            gje.setId(i);
        }
        return eje2;
    }

    public final void j() {
        int currentItem;
        k();
        hpa hpa = this.d1;
        if (hpa != null) {
            int b2 = hpa.b();
            for (int i = 0; i < b2; i++) {
                eje i2 = i();
                this.d1.getClass();
                if (TextUtils.isEmpty(i2.c) && !TextUtils.isEmpty((CharSequence) null)) {
                    i2.g.setContentDescription((CharSequence) null);
                }
                i2.b = null;
                gje gje = i2.g;
                if (gje != null) {
                    gje.e();
                }
                b(i2, this.b.size(), false);
            }
            ViewPager viewPager = this.c1;
            if (viewPager != null && b2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                o(h(currentItem), true);
            }
        }
    }

    public final void k() {
        for (int childCount = this.o.getChildCount() - 1; childCount >= 0; childCount--) {
            n(childCount);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            eje eje = (eje) it.next();
            it.remove();
            eje.f = null;
            eje.g = null;
            eje.a = null;
            eje.h = -1;
            eje.b = null;
            eje.c = null;
            eje.d = -1;
            eje.e = null;
            l1.e(eje);
        }
        this.c = null;
    }

    public final void l(bje bje) {
        this.Z0.remove(bje);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: eje} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(int r10) {
        /*
            r9 = this;
            eje r0 = r9.c
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r0 = r0.d
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            r9.n(r10)
            java.util.ArrayList r2 = r9.b
            java.lang.Object r3 = r2.remove(r10)
            eje r3 = (defpackage.eje) r3
            r4 = -1
            r5 = 0
            if (r3 == 0) goto L_0x002d
            r3.f = r5
            r3.g = r5
            r3.a = r5
            r3.h = r4
            r3.b = r5
            r3.c = r5
            r3.d = r4
            r3.e = r5
            v5b r6 = l1
            r6.e(r3)
        L_0x002d:
            int r3 = r2.size()
            r6 = r10
        L_0x0032:
            if (r6 >= r3) goto L_0x004c
            java.lang.Object r7 = r2.get(r6)
            eje r7 = (defpackage.eje) r7
            int r7 = r7.d
            int r8 = r9.a
            if (r7 != r8) goto L_0x0041
            r4 = r6
        L_0x0041:
            java.lang.Object r7 = r2.get(r6)
            eje r7 = (defpackage.eje) r7
            r7.d = r6
            int r6 = r6 + 1
            goto L_0x0032
        L_0x004c:
            r9.a = r4
            if (r0 != r10) goto L_0x0067
            boolean r0 = r2.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x0058
            goto L_0x0064
        L_0x0058:
            int r10 = r10 - r3
            int r10 = java.lang.Math.max(r1, r10)
            java.lang.Object r10 = r2.get(r10)
            r5 = r10
            eje r5 = (defpackage.eje) r5
        L_0x0064:
            r9.o(r5, r3)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.m(int):void");
    }

    public final void n(int i) {
        dje dje = this.o;
        gje gje = (gje) dje.getChildAt(i);
        dje.removeViewAt(i);
        if (gje != null) {
            gje.setTab((eje) null);
            gje.setSelected(false);
            this.j1.e(gje);
        }
        requestLayout();
    }

    public final void o(eje eje, boolean z) {
        eje eje2 = this.c;
        ArrayList arrayList = this.Z0;
        if (eje2 != eje) {
            int i = eje != null ? eje.d : -1;
            if (z) {
                if ((eje2 == null || eje2.d == -1) && i != -1) {
                    q(i, 0.0f, true, true, true);
                } else {
                    c(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.c = eje;
            if (!(eje2 == null || eje2.f == null)) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((bje) arrayList.get(size)).getClass();
                }
            }
            if (eje != null) {
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((bje) arrayList.get(size2)).a(eje);
                }
            }
        } else if (eje2 != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((bje) arrayList.get(size3)).getClass();
            }
            c(eje.d);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof q18) {
            nu0.N(this, (q18) background);
        }
        if (this.c1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                r((ViewPager) parent, true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.h1) {
            setupWithViewPager((ViewPager) null);
            this.h1 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r1 = (defpackage.gje) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            dje r1 = r7.o
            int r2 = r1.getChildCount()
            if (r0 >= r2) goto L_0x0032
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof defpackage.gje
            if (r2 == 0) goto L_0x002f
            gje r1 = (defpackage.gje) r1
            android.graphics.drawable.Drawable r2 = r1.w0
            if (r2 == 0) goto L_0x002f
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.w0
            r1.draw(r8)
        L_0x002f:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.a(1, getTabCount(), 1).a);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    public final void onMeasure(int i, int i2) {
        int round = Math.round(mqd.h(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.K0;
            if (i3 <= 0) {
                i3 = (int) (((float) size) - mqd.h(getContext(), 56));
            }
            this.I0 = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.Q0;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                } else if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(hpa hpa, boolean z) {
        g04 g04;
        hpa hpa2 = this.d1;
        if (!(hpa2 == null || (g04 = this.e1) == null)) {
            hpa2.a.unregisterObserver(g04);
        }
        this.d1 = hpa;
        if (z && hpa != null) {
            if (this.e1 == null) {
                this.e1 = new g04(2, this);
            }
            hpa.a.registerObserver(this.e1);
        }
        j();
    }

    public final void q(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = ((float) i) + f;
        int round = Math.round(f2);
        if (round >= 0) {
            dje dje = this.o;
            if (round < dje.getChildCount()) {
                if (z2) {
                    dje.b.a = Math.round(f2);
                    ValueAnimator valueAnimator = dje.a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        dje.a.cancel();
                    }
                    dje.c(dje.getChildAt(i), dje.getChildAt(i + 1), f);
                }
                ValueAnimator valueAnimator2 = this.b1;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.b1.cancel();
                }
                int e = e(i, f);
                int scrollX = getScrollX();
                boolean z4 = (i < getSelectedTabPosition() && e >= scrollX) || (i > getSelectedTabPosition() && e <= scrollX) || i == getSelectedTabPosition();
                WeakHashMap weakHashMap = zmf.a;
                if (getLayoutDirection() == 1) {
                    z4 = (i < getSelectedTabPosition() && e <= scrollX) || (i > getSelectedTabPosition() && e >= scrollX) || i == getSelectedTabPosition();
                }
                if (z4 || this.i1 == 1 || z3) {
                    if (i < 0) {
                        e = 0;
                    }
                    scrollTo(e, 0);
                }
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void r(ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.c1;
        if (viewPager2 != null) {
            fje fje = this.f1;
            if (!(fje == null || (arrayList2 = viewPager2.f1) == null)) {
                arrayList2.remove(fje);
            }
            aje aje = this.g1;
            if (!(aje == null || (arrayList = this.c1.h1) == null)) {
                arrayList.remove(aje);
            }
        }
        cx5 cx5 = this.a1;
        if (cx5 != null) {
            l(cx5);
            this.a1 = null;
        }
        if (viewPager != null) {
            this.c1 = viewPager;
            if (this.f1 == null) {
                this.f1 = new fje(this);
            }
            fje fje2 = this.f1;
            fje2.c = 0;
            fje2.b = 0;
            viewPager.b(fje2);
            cx5 cx52 = new cx5(2, viewPager);
            this.a1 = cx52;
            a(cx52);
            hpa adapter = viewPager.getAdapter();
            if (adapter != null) {
                p(adapter, true);
            }
            if (this.g1 == null) {
                this.g1 = new aje(this);
            }
            aje aje2 = this.g1;
            aje2.a = true;
            if (viewPager.h1 == null) {
                viewPager.h1 = new ArrayList();
            }
            viewPager.h1.add(aje2);
            q(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.c1 = null;
            p((hpa) null, false);
        }
        this.h1 = z;
    }

    public final void s(boolean z) {
        int i = 0;
        while (true) {
            dje dje = this.o;
            if (i < dje.getChildCount()) {
                View childAt = dje.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.Q0 == 1 && this.N0 == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                if (z) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
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

    public void setInlineLabel(boolean z) {
        if (this.R0 != z) {
            this.R0 = z;
            int i = 0;
            while (true) {
                dje dje = this.o;
                if (i < dje.getChildCount()) {
                    View childAt = dje.getChildAt(i);
                    if (childAt instanceof gje) {
                        gje gje = (gje) childAt;
                        gje.setOrientation(gje.y0.R0 ^ true ? 1 : 0);
                        TextView textView = gje.u0;
                        if (textView == null && gje.v0 == null) {
                            gje.h(gje.b, gje.c, true);
                        } else {
                            gje.h(textView, gje.v0, false);
                        }
                    }
                    i++;
                } else {
                    d();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(cje cje) {
        setOnTabSelectedListener((bje) cje);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.b1.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.C0 = mutate;
        int i = this.D0;
        if (i != 0) {
            aq4.g(mutate, i);
        } else {
            aq4.h(mutate, (ColorStateList) null);
        }
        int i2 = this.T0;
        if (i2 == -1) {
            i2 = this.C0.getIntrinsicHeight();
        }
        this.o.b(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.D0 = i;
        Drawable drawable = this.C0;
        if (i != 0) {
            aq4.g(drawable, i);
        } else {
            aq4.h(drawable, (ColorStateList) null);
        }
        s(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.P0 != i) {
            this.P0 = i;
            WeakHashMap weakHashMap = zmf.a;
            this.o.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.T0 = i;
        this.o.b(i);
    }

    public void setTabGravity(int i) {
        if (this.N0 != i) {
            this.N0 = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gje gje = ((eje) arrayList.get(i)).g;
                if (gje != null) {
                    gje.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(z7.n(getContext(), i));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [qq9, java.lang.Object] */
    public void setTabIndicatorAnimationMode(int i) {
        this.U0 = i;
        if (i == 0) {
            this.W0 = new Object();
        } else if (i == 1) {
            this.W0 = new aw4(0);
        } else if (i == 2) {
            this.W0 = new aw4(1);
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.S0 = z;
        int i = dje.c;
        dje dje = this.o;
        dje.a(dje.b.getSelectedTabPosition());
        WeakHashMap weakHashMap = zmf.a;
        dje.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.Q0) {
            this.Q0 = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            int i = 0;
            while (true) {
                dje dje = this.o;
                if (i < dje.getChildCount()) {
                    View childAt = dje.getChildAt(i);
                    if (childAt instanceof gje) {
                        Context context = getContext();
                        int i2 = gje.z0;
                        ((gje) childAt).f(context);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(z7.n(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gje gje = ((eje) arrayList.get(i)).g;
                if (gje != null) {
                    gje.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(hpa hpa) {
        p(hpa, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.V0 != z) {
            this.V0 = z;
            int i = 0;
            while (true) {
                dje dje = this.o;
                if (i < dje.getChildCount()) {
                    View childAt = dje.getChildAt(i);
                    if (childAt instanceof gje) {
                        Context context = getContext();
                        int i2 = gje.z0;
                        ((gje) childAt).f(context);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        r(viewPager, false);
    }

    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams m2generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(bje bje) {
        bje bje2 = this.Y0;
        if (bje2 != null) {
            l(bje2);
        }
        this.Y0 = bje;
        if (bje != null) {
            a(bje);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(s36.n(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
