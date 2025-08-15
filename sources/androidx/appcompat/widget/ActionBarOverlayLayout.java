package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements u54, kn9, ln9 {
    public static final int[] Q0 = {vsb.actionBarSize, 16842841};
    public static final x6g R0;
    public static final Rect S0 = new Rect();
    public final Rect A0 = new Rect();
    public final Rect B0 = new Rect();
    public final Rect C0 = new Rect();
    public final Rect D0 = new Rect();
    public x6g E0;
    public x6g F0;
    public x6g G0;
    public x6g H0;
    public j6 I0;
    public OverScroller J0;
    public ViewPropertyAnimator K0;
    public final h6 L0;
    public final i6 M0;
    public final i6 N0;
    public final jt O0;
    public final l6 P0;
    public int a;
    public int b = 0;
    public ContentFrameLayout c;
    public ActionBarContainer o;
    public v54 s0;
    public Drawable t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public int z0;

    static {
        o6g n6g = Build.VERSION.SDK_INT >= 30 ? new n6g() : new m6g();
        n6g.f(v27.b(0, 1, 0, 1));
        R0 = n6g.b();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        x6g x6g = x6g.b;
        this.E0 = x6g;
        this.F0 = x6g;
        this.G0 = x6g;
        this.H0 = x6g;
        this.L0 = new h6(0, (Object) this);
        this.M0 = new i6(this, 0);
        this.N0 = new i6(this, 1);
        c(context);
        this.O0 = new jt(6);
        l6 l6Var = new l6(context, 0);
        l6Var.setWillNotDraw(true);
        this.P0 = l6Var;
        addView(l6Var);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        int i;
        k6 k6Var = (k6) view.getLayoutParams();
        int i2 = k6Var.leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            k6Var.leftMargin = i3;
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = k6Var.topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            k6Var.topMargin = i5;
            z2 = true;
        }
        int i6 = k6Var.rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            k6Var.rightMargin = i7;
            z2 = true;
        }
        if (!z || k6Var.bottomMargin == (i = rect.bottom)) {
            return z2;
        }
        k6Var.bottomMargin = i;
        return true;
    }

    public final void b() {
        removeCallbacks(this.M0);
        removeCallbacks(this.N0);
        ViewPropertyAnimator viewPropertyAnimator = this.K0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(Q0);
        boolean z = false;
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.t0 = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.J0 = new OverScroller(context);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k6;
    }

    public final void d(int i) {
        e();
        if (i == 2) {
            this.s0.getClass();
        } else if (i == 5) {
            this.s0.getClass();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.t0 != null) {
            if (this.o.getVisibility() == 0) {
                i = (int) (this.o.getTranslationY() + ((float) this.o.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.t0.setBounds(0, i, getWidth(), this.t0.getIntrinsicHeight() + i);
            this.t0.draw(canvas);
        }
    }

    public final void e() {
        v54 v54;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(mvb.action_bar_activity_content);
            this.o = (ActionBarContainer) findViewById(mvb.action_bar_container);
            View findViewById = findViewById(mvb.action_bar);
            if (findViewById instanceof v54) {
                v54 = (v54) findViewById;
            } else if (findViewById instanceof Toolbar) {
                v54 = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.s0 = v54;
        }
    }

    public final void f(Menu menu, nr8 nr8) {
        e();
        rwe rwe = (rwe) this.s0;
        e7 e7Var = rwe.m;
        Toolbar toolbar = rwe.a;
        if (e7Var == null) {
            rwe.m = new e7(toolbar.getContext());
        }
        e7 e7Var2 = rwe.m;
        e7Var2.X = nr8;
        wq8 wq8 = (wq8) menu;
        if (wq8 != null || toolbar.a != null) {
            toolbar.f();
            wq8 wq82 = toolbar.a.a;
            if (wq82 != wq8) {
                if (wq82 != null) {
                    wq82.r(toolbar.Z0);
                    wq82.r(toolbar.a1);
                }
                if (toolbar.a1 == null) {
                    toolbar.a1 = new iwe(toolbar);
                }
                e7Var2.B0 = true;
                if (wq8 != null) {
                    wq8.b(e7Var2, toolbar.x0);
                    wq8.b(toolbar.a1, toolbar.x0);
                } else {
                    e7Var2.k(toolbar.x0, (wq8) null);
                    toolbar.a1.k(toolbar.x0, (wq8) null);
                    e7Var2.i();
                    toolbar.a1.i();
                }
                toolbar.a.setPopupTheme(toolbar.y0);
                toolbar.a.setPresenter(e7Var2);
                toolbar.Z0 = e7Var2;
                toolbar.x();
            }
        }
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.o;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        jt jtVar = this.O0;
        return jtVar.c | jtVar.b;
    }

    public CharSequence getTitle() {
        e();
        return ((rwe) this.s0).a.getTitle();
    }

    public final void i(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        j(view, i, i2, i3, i4, i5);
    }

    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final boolean k(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void l(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void m(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void n(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        x6g f = x6g.f(this, windowInsets);
        boolean a2 = a(this.o, new Rect(f.b(), f.d(), f.c(), f.a()), false);
        WeakHashMap weakHashMap = zmf.a;
        Rect rect = this.A0;
        omf.b(this, f, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        v6g v6g = f.a;
        x6g l = v6g.l(i, i2, i3, i4);
        this.E0 = l;
        boolean z = true;
        if (!this.F0.equals(l)) {
            this.F0 = this.E0;
            a2 = true;
        }
        Rect rect2 = this.B0;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = a2;
        }
        if (z) {
            requestLayout();
        }
        return v6g.a().a.c().a.b().e();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                k6 k6Var = (k6) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = k6Var.leftMargin + paddingLeft;
                int i7 = k6Var.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            r11.e()
            androidx.appcompat.widget.ActionBarContainer r1 = r11.o
            r3 = 0
            r5 = 0
            r0 = r11
            r2 = r12
            r4 = r13
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.o
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            k6 r0 = (defpackage.k6) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r11.o
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.o
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.o
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            java.util.WeakHashMap r4 = defpackage.zmf.a
            int r4 = r11.getWindowSystemUiVisibility()
            r4 = r4 & 256(0x100, float:3.59E-43)
            r5 = 1
            if (r4 == 0) goto L_0x004d
            r4 = r5
            goto L_0x004e
        L_0x004d:
            r4 = r2
        L_0x004e:
            if (r4 == 0) goto L_0x0062
            int r6 = r11.a
            boolean r7 = r11.v0
            if (r7 == 0) goto L_0x0074
            androidx.appcompat.widget.ActionBarContainer r7 = r11.o
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L_0x0074
            int r7 = r11.a
            int r6 = r6 + r7
            goto L_0x0074
        L_0x0062:
            androidx.appcompat.widget.ActionBarContainer r6 = r11.o
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x0073
            androidx.appcompat.widget.ActionBarContainer r6 = r11.o
            int r6 = r6.getMeasuredHeight()
            goto L_0x0074
        L_0x0073:
            r6 = r2
        L_0x0074:
            android.graphics.Rect r7 = r11.A0
            android.graphics.Rect r8 = r11.C0
            r8.set(r7)
            x6g r7 = r11.E0
            r11.G0 = r7
            boolean r7 = r11.u0
            if (r7 != 0) goto L_0x00ab
            if (r4 != 0) goto L_0x00ab
            l6 r4 = r11.P0
            x6g r7 = R0
            android.graphics.Rect r9 = r11.D0
            defpackage.omf.b(r4, r7, r9)
            android.graphics.Rect r4 = S0
            boolean r4 = r9.equals(r4)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x00ab
            int r4 = r8.top
            int r4 = r4 + r6
            r8.top = r4
            int r4 = r8.bottom
            r8.bottom = r4
            x6g r4 = r11.G0
            v6g r4 = r4.a
            x6g r2 = r4.l(r2, r6, r2, r2)
            r11.G0 = r2
            goto L_0x00e4
        L_0x00ab:
            x6g r2 = r11.G0
            int r2 = r2.b()
            x6g r4 = r11.G0
            int r4 = r4.d()
            int r4 = r4 + r6
            x6g r6 = r11.G0
            int r6 = r6.c()
            x6g r7 = r11.G0
            int r7 = r7.a()
            v27 r2 = defpackage.v27.b(r2, r4, r6, r7)
            x6g r4 = r11.G0
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r6 < r7) goto L_0x00d6
            n6g r6 = new n6g
            r6.<init>(r4)
            goto L_0x00db
        L_0x00d6:
            m6g r6 = new m6g
            r6.<init>(r4)
        L_0x00db:
            r6.f(r2)
            x6g r2 = r6.b()
            r11.G0 = r2
        L_0x00e4:
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.c
            a(r2, r8, r5)
            x6g r2 = r11.H0
            x6g r4 = r11.G0
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00fc
            x6g r2 = r11.G0
            r11.H0 = r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.c
            defpackage.zmf.b(r4, r2)
        L_0x00fc:
            androidx.appcompat.widget.ContentFrameLayout r6 = r11.c
            r8 = 0
            r10 = 0
            r5 = r11
            r7 = r12
            r9 = r13
            r5.measureChildWithMargins(r6, r7, r8, r9, r10)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            k6 r2 = (defpackage.k6) r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.c
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.c
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.c
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r11.getPaddingLeft()
            int r4 = r11.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r1 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r11.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r11.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r12 = android.view.View.resolveSizeAndState(r1, r12, r2)
            int r1 = r2 << 16
            int r13 = android.view.View.resolveSizeAndState(r0, r13, r1)
            r11.setMeasuredDimension(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.w0 || !z) {
            return false;
        }
        this.J0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.J0.getFinalY() > this.o.getHeight()) {
            b();
            this.N0.run();
        } else {
            b();
            this.M0.run();
        }
        this.x0 = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.y0 + i2;
        this.y0 = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r0 = (defpackage.d6g) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            jt r1 = r0.O0
            r1.b = r3
            int r1 = r0.getActionBarHideOffset()
            r0.y0 = r1
            r0.b()
            j6 r0 = r0.I0
            if (r0 == 0) goto L_0x001d
            d6g r0 = (defpackage.d6g) r0
            wof r1 = r0.G0
            if (r1 == 0) goto L_0x001d
            r1.a()
            r1 = 0
            r0.G0 = r1
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.o.getVisibility() != 0) {
            return false;
        }
        return this.w0;
    }

    public final void onStopNestedScroll(View view) {
        if (this.w0 && !this.x0) {
            if (this.y0 <= this.o.getHeight()) {
                b();
                postDelayed(this.M0, 600);
                return;
            }
            b();
            postDelayed(this.N0, 600);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        e();
        int i2 = this.z0 ^ i;
        this.z0 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        j6 j6Var = this.I0;
        if (j6Var != null) {
            ((d6g) j6Var).C0 = !z2;
            if (z || !z2) {
                d6g d6g = (d6g) j6Var;
                if (d6g.D0) {
                    d6g.D0 = false;
                    d6g.f0(true);
                }
            } else {
                d6g d6g2 = (d6g) j6Var;
                if (!d6g2.D0) {
                    d6g2.D0 = true;
                    d6g2.f0(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.I0 != null) {
            WeakHashMap weakHashMap = zmf.a;
            mmf.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        j6 j6Var = this.I0;
        if (j6Var != null) {
            ((d6g) j6Var).B0 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.o.setTranslationY((float) (-Math.max(0, Math.min(i, this.o.getHeight()))));
    }

    public void setActionBarVisibilityCallback(j6 j6Var) {
        this.I0 = j6Var;
        if (getWindowToken() != null) {
            ((d6g) this.I0).B0 = this.b;
            int i = this.z0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = zmf.a;
                mmf.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.v0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.w0) {
            this.w0 = z;
            if (!z) {
                b();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        e();
        rwe rwe = (rwe) this.s0;
        rwe.d = i != 0 ? s36.n(rwe.a.getContext(), i) : null;
        rwe.c();
    }

    public void setLogo(int i) {
        e();
        rwe rwe = (rwe) this.s0;
        rwe.e = i != 0 ? s36.n(rwe.a.getContext(), i) : null;
        rwe.c();
    }

    public void setOverlayMode(boolean z) {
        this.u0 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        e();
        ((rwe) this.s0).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        e();
        rwe rwe = (rwe) this.s0;
        if (!rwe.g) {
            rwe.h = charSequence;
            if ((rwe.b & 8) != 0) {
                Toolbar toolbar = rwe.a;
                toolbar.setTitle(charSequence);
                if (rwe.g) {
                    zmf.k(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        e();
        rwe rwe = (rwe) this.s0;
        rwe.d = drawable;
        rwe.c();
    }
}
