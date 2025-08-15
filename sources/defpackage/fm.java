package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: fm  reason: default package */
public final class fm extends LinearLayout implements nw3 {
    public static final int N0 = m2c.Widget_Design_AppBarLayout;
    public int A0;
    public WeakReference B0;
    public final boolean C0;
    public ValueAnimator D0;
    public final ValueAnimator.AnimatorUpdateListener E0;
    public final ArrayList F0 = new ArrayList();
    public final long G0;
    public final TimeInterpolator H0;
    public int[] I0;
    public Drawable J0;
    public Integer K0;
    public final float L0;
    public AppBarLayout$Behavior M0;
    public int a;
    public int b = -1;
    public int c = -1;
    public int o = -1;
    public boolean s0;
    public int t0 = 0;
    public x6g u0;
    public ArrayList v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fm(android.content.Context r14) {
        /*
            r13 = this;
            r0 = 0
            int r7 = defpackage.tsb.appBarLayoutStyle
            r8 = 0
            int r9 = N0
            android.content.Context r14 = defpackage.y18.a(r14, r8, r7, r9)
            r13.<init>(r14, r8, r7)
            r14 = -1
            r13.b = r14
            r13.c = r14
            r13.o = r14
            r13.t0 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13.F0 = r1
            android.content.Context r10 = r13.getContext()
            r11 = 1
            r13.setOrientation(r11)
            android.view.ViewOutlineProvider r1 = r13.getOutlineProvider()
            android.view.ViewOutlineProvider r2 = android.view.ViewOutlineProvider.BACKGROUND
            if (r1 != r2) goto L_0x0032
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BOUNDS
            r13.setOutlineProvider(r1)
        L_0x0032:
            android.content.Context r12 = r13.getContext()
            int[] r3 = defpackage.c37.e
            int[] r6 = new int[r0]
            r1 = r12
            r2 = r8
            r4 = r7
            r5 = r9
            android.content.res.TypedArray r1 = defpackage.sre.d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.hasValue(r0)     // Catch:{ all -> 0x0054 }
            if (r2 == 0) goto L_0x0057
            int r2 = r1.getResourceId(r0, r0)     // Catch:{ all -> 0x0054 }
            android.animation.StateListAnimator r2 = android.animation.AnimatorInflater.loadStateListAnimator(r12, r2)     // Catch:{ all -> 0x0054 }
            r13.setStateListAnimator(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x0054:
            r13 = move-exception
            goto L_0x015f
        L_0x0057:
            r1.recycle()
            int[] r3 = defpackage.z2c.AppBarLayout
            int[] r6 = new int[r0]
            r1 = r10
            r2 = r8
            r4 = r7
            r5 = r9
            android.content.res.TypedArray r1 = defpackage.sre.d(r1, r2, r3, r4, r5, r6)
            int r2 = defpackage.z2c.AppBarLayout_android_background
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            java.util.WeakHashMap r3 = defpackage.zmf.a
            r13.setBackground(r2)
            int r2 = defpackage.z2c.AppBarLayout_liftOnScrollColor
            android.content.res.ColorStateList r6 = defpackage.ju0.q(r10, r1, r2)
            if (r6 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r11 = r0
        L_0x007b:
            r13.C0 = r11
            android.graphics.drawable.Drawable r2 = r13.getBackground()
            android.content.res.ColorStateList r5 = defpackage.oag.r(r2)
            if (r5 == 0) goto L_0x00cb
            q18 r2 = new q18
            r2.<init>()
            r2.l(r5)
            if (r6 == 0) goto L_0x00be
            android.content.Context r3 = r13.getContext()
            int r4 = defpackage.tsb.colorSurface
            android.util.TypedValue r4 = defpackage.kq0.C(r3, r4)
            if (r4 == 0) goto L_0x00ae
            int r7 = r4.resourceId
            if (r7 == 0) goto L_0x00a6
            int r3 = defpackage.lt3.a(r3, r7)
            goto L_0x00a8
        L_0x00a6:
            int r3 = r4.data
        L_0x00a8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x00ac:
            r8 = r3
            goto L_0x00b0
        L_0x00ae:
            r3 = 0
            goto L_0x00ac
        L_0x00b0:
            xl r9 = new xl
            r3 = r9
            r4 = r13
            r7 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r13.E0 = r9
            r13.setBackground(r2)
            goto L_0x00cb
        L_0x00be:
            r2.j(r10)
            yl r3 = new yl
            r3.<init>(r13, r0, r2)
            r13.E0 = r3
            r13.setBackground(r2)
        L_0x00cb:
            int r2 = defpackage.tsb.motionDurationMedium2
            android.content.res.Resources r3 = r13.getResources()
            int r4 = defpackage.jyb.app_bar_elevation_anim_duration
            int r3 = r3.getInteger(r4)
            int r2 = defpackage.z7.P(r2, r3, r10)
            long r2 = (long) r2
            r13.G0 = r2
            int r2 = defpackage.tsb.motionEasingStandardInterpolator
            android.view.animation.LinearInterpolator r3 = defpackage.og.a
            android.animation.TimeInterpolator r2 = defpackage.z7.Q(r10, r2, r3)
            r13.H0 = r2
            int r2 = defpackage.z2c.AppBarLayout_expanded
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x00f9
            int r2 = defpackage.z2c.AppBarLayout_expanded
            boolean r2 = r1.getBoolean(r2, r0)
            r13.f(r2, r0, r0)
        L_0x00f9:
            int r2 = defpackage.z2c.AppBarLayout_elevation
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x010b
            int r2 = defpackage.z2c.AppBarLayout_elevation
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            defpackage.c37.z(r13, r2)
        L_0x010b:
            int r2 = defpackage.z2c.AppBarLayout_android_keyboardNavigationCluster
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x011c
            int r2 = defpackage.z2c.AppBarLayout_android_keyboardNavigationCluster
            boolean r2 = r1.getBoolean(r2, r0)
            r13.setKeyboardNavigationCluster(r2)
        L_0x011c:
            int r2 = defpackage.z2c.AppBarLayout_android_touchscreenBlocksFocus
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x012d
            int r2 = defpackage.z2c.AppBarLayout_android_touchscreenBlocksFocus
            boolean r2 = r1.getBoolean(r2, r0)
            r13.setTouchscreenBlocksFocus(r2)
        L_0x012d:
            android.content.res.Resources r2 = r13.getResources()
            int r3 = defpackage.stb.design_appbar_elevation
            float r2 = r2.getDimension(r3)
            r13.L0 = r2
            int r2 = defpackage.z2c.AppBarLayout_liftOnScroll
            boolean r0 = r1.getBoolean(r2, r0)
            r13.z0 = r0
            int r0 = defpackage.z2c.AppBarLayout_liftOnScrollTargetViewId
            int r14 = r1.getResourceId(r0, r14)
            r13.A0 = r14
            int r14 = defpackage.z2c.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r14 = r1.getDrawable(r14)
            r13.setStatusBarForeground(r14)
            r1.recycle()
            rxd r14 = new rxd
            r0 = 2
            r14.<init>(r0, r13)
            defpackage.omf.u(r13, r14)
            return
        L_0x015f:
            r1.recycle()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm.<init>(android.content.Context):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [dm, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [dm, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v4, types: [dm, android.widget.LinearLayout$LayoutParams] */
    public static dm c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ? layoutParams2 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.a = 1;
            return layoutParams2;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? layoutParams3 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.a = 1;
            return layoutParams3;
        } else {
            ? layoutParams4 = new LinearLayout.LayoutParams(layoutParams);
            layoutParams4.a = 1;
            return layoutParams4;
        }
    }

    public final void a(cm cmVar) {
        if (this.v0 == null) {
            this.v0 = new ArrayList();
        }
        if (cmVar != null && !this.v0.contains(cmVar)) {
            this.v0.add(cmVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dm, android.widget.LinearLayout$LayoutParams] */
    /* renamed from: b */
    public final dm generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.AppBarLayout_Layout);
        layoutParams.a = obtainStyledAttributes.getInt(z2c.AppBarLayout_Layout_layout_scrollFlags, 0);
        layoutParams.b = obtainStyledAttributes.getInt(z2c.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new h7b(3);
        if (obtainStyledAttributes.hasValue(z2c.AppBarLayout_Layout_layout_scrollInterpolator)) {
            layoutParams.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(z2c.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dm;
    }

    public final void d() {
        AppBarLayout$Behavior appBarLayout$Behavior = this.M0;
        bm I = (appBarLayout$Behavior == null || this.b == -1 || this.t0 != 0) ? null : appBarLayout$Behavior.I(z.b, this);
        this.b = -1;
        this.c = -1;
        this.o = -1;
        if (I != null) {
            AppBarLayout$Behavior appBarLayout$Behavior2 = this.M0;
            if (appBarLayout$Behavior2.m == null) {
                appBarLayout$Behavior2.m = I;
            }
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.J0 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.a));
            this.J0.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.J0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cm cmVar = (cm) this.v0.get(i2);
                if (cmVar != null) {
                    cmVar.V(this, i);
                }
            }
        }
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.t0 = i2 | i;
        requestLayout();
    }

    public final boolean g(boolean z) {
        if (!(!this.w0) || this.y0 == z) {
            return false;
        }
        this.y0 = z;
        refreshDrawableState();
        if (!(getBackground() instanceof q18)) {
            return true;
        }
        float f = 0.0f;
        if (this.C0) {
            float f2 = z ? 0.0f : 1.0f;
            if (z) {
                f = 1.0f;
            }
            j(f2, f);
            return true;
        } else if (!this.z0) {
            return true;
        } else {
            float f3 = this.L0;
            float f4 = z ? 0.0f : f3;
            if (z) {
                f = f3;
            }
            j(f4, f);
            return true;
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dm(-1, -2);
    }

    public ow3 getBehavior() {
        AppBarLayout$Behavior appBarLayout$Behavior = new AppBarLayout$Behavior();
        this.M0 = appBarLayout$Behavior;
        return appBarLayout$Behavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r11 = this;
            r0 = 5
            r1 = 8
            int r2 = r11.c
            r3 = -1
            if (r2 == r3) goto L_0x0009
            return r2
        L_0x0009:
            int r2 = r11.getChildCount()
            int r2 = r2 + -1
            r4 = 0
            r5 = r4
        L_0x0011:
            if (r2 < 0) goto L_0x0068
            android.view.View r6 = r11.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != r1) goto L_0x001e
            goto L_0x0066
        L_0x001e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            dm r7 = (defpackage.dm) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.a
            r10 = r9 & 5
            if (r10 != r0) goto L_0x0063
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L_0x003f
            java.util.WeakHashMap r7 = defpackage.zmf.a
            int r7 = r6.getMinimumHeight()
        L_0x003d:
            int r7 = r7 + r10
            goto L_0x004e
        L_0x003f:
            r7 = r9 & 2
            if (r7 == 0) goto L_0x004c
            java.util.WeakHashMap r7 = defpackage.zmf.a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L_0x003d
        L_0x004c:
            int r7 = r10 + r8
        L_0x004e:
            if (r2 != 0) goto L_0x0061
            java.util.WeakHashMap r9 = defpackage.zmf.a
            boolean r6 = r6.getFitsSystemWindows()
            if (r6 == 0) goto L_0x0061
            int r6 = r11.getTopInset()
            int r8 = r8 - r6
            int r7 = java.lang.Math.min(r7, r8)
        L_0x0061:
            int r5 = r5 + r7
            goto L_0x0066
        L_0x0063:
            if (r5 <= 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            int r2 = r2 + r3
            goto L_0x0011
        L_0x0068:
            int r0 = java.lang.Math.max(r4, r5)
            r11.c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dm dmVar = (dm) childAt.getLayoutParams();
                int measuredHeight = dmVar.topMargin + dmVar.bottomMargin + childAt.getMeasuredHeight();
                int i4 = dmVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap = zmf.a;
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.o = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.A0;
    }

    public q18 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof q18) {
            return (q18) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = zmf.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.t0;
    }

    public Drawable getStatusBarForeground() {
        return this.J0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        x6g x6g = this.u0;
        if (x6g != null) {
            return x6g.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dm dmVar = (dm) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = dmVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + dmVar.topMargin + dmVar.bottomMargin + i3;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = zmf.a;
                    if (childAt.getFitsSystemWindows()) {
                        i5 -= getTopInset();
                    }
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap2 = zmf.a;
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.B0
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L_0x0031
            int r0 = r4.A0
            if (r0 == r1) goto L_0x0031
            if (r5 == 0) goto L_0x0011
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0028
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.A0
            android.view.View r0 = r0.findViewById(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.B0 = r3
        L_0x0031:
            java.lang.ref.WeakReference r4 = r4.B0
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r4.get()
            r2 = r4
            android.view.View r2 = (android.view.View) r2
        L_0x003c:
            if (r2 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r2
        L_0x0040:
            if (r5 == 0) goto L_0x0050
            boolean r4 = r5.canScrollVertically(r1)
            if (r4 != 0) goto L_0x004e
            int r4 = r5.getScrollY()
            if (r4 <= 0) goto L_0x0050
        L_0x004e:
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm.h(android.view.View):boolean");
    }

    public final boolean i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = zmf.a;
        return !childAt.getFitsSystemWindows();
    }

    public final void j(float f, float f2) {
        ValueAnimator valueAnimator = this.D0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        this.D0 = ofFloat;
        ofFloat.setDuration(this.G0);
        this.D0.setInterpolator(this.H0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.E0;
        if (animatorUpdateListener != null) {
            this.D0.addUpdateListener(animatorUpdateListener);
        }
        this.D0.start();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof q18) {
            nu0.N(this, (q18) background);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        if (this.I0 == null) {
            this.I0 = new int[4];
        }
        int[] iArr = this.I0;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.x0;
        int i2 = tsb.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z || !this.y0) ? -tsb.state_lifted : tsb.state_lifted;
        int i3 = tsb.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z || !this.y0) ? -tsb.state_collapsed : tsb.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.B0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.B0 = null;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = zmf.a;
        if (getFitsSystemWindows() && i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        d();
        this.s0 = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((dm) getChildAt(i5).getLayoutParams()).c != null) {
                this.s0 = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.J0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.w0) {
            if (!this.z0) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        z2 = false;
                        break;
                    }
                    int i7 = ((dm) getChildAt(i6).getLayoutParams()).a;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        break;
                    }
                    i6++;
                }
            }
            if (this.x0 != z2) {
                this.x0 = z2;
                refreshDrawableState();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = zmf.a;
            if (getFitsSystemWindows() && i()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = z04.p(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        d();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof q18) {
            ((q18) background).k(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = zmf.a;
        f(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.z0 = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.A0 = -1;
        if (view == null) {
            WeakReference weakReference = this.B0;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.B0 = null;
            return;
        }
        this.B0 = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.A0 = i;
        WeakReference weakReference = this.B0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.B0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.w0 = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.J0;
        if (drawable2 != drawable) {
            Integer num = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.J0 = mutate;
            if (mutate instanceof q18) {
                num = Integer.valueOf(((q18) mutate).F0);
            } else {
                ColorStateList r = oag.r(mutate);
                if (r != null) {
                    num = Integer.valueOf(r.getDefaultColor());
                }
            }
            this.K0 = num;
            Drawable drawable3 = this.J0;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.J0.setState(getDrawableState());
                }
                Drawable drawable4 = this.J0;
                WeakHashMap weakHashMap = zmf.a;
                bq4.b(drawable4, getLayoutDirection());
                this.J0.setVisible(getVisibility() == 0, false);
                this.J0.setCallback(this);
            }
            if (this.J0 != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(s36.n(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        c37.z(this, f);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.J0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.J0;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m8generateDefaultLayoutParams() {
        return new dm(-1, -2);
    }
}
