package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

public class ViewPager extends ViewGroup {
    public static final int[] k1 = {16842931};
    public static final ky6 l1 = new ky6(16);
    public static final c77 m1 = new c77(4);
    public int A0;
    public Drawable B0;
    public int C0;
    public int D0;
    public float E0 = -3.4028235E38f;
    public float F0 = Float.MAX_VALUE;
    public int G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public int K0 = 1;
    public boolean L0;
    public boolean M0;
    public final int N0;
    public int O0;
    public final int P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public int U0 = -1;
    public VelocityTracker V0;
    public final int W0;
    public final int X0;
    public final int Y0;
    public final int Z0;
    public int a;
    public final EdgeEffect a1;
    public final ArrayList b = new ArrayList();
    public final EdgeEffect b1;
    public final eof c = new Object();
    public boolean c1 = true;
    public boolean d1;
    public int e1;
    public ArrayList f1;
    public gof g1;
    public ArrayList h1;
    public final gwe i1 = new gwe(5, (Object) this);
    public int j1 = 0;
    public final Rect o = new Rect();
    public hpa s0;
    public int t0;
    public int u0 = -1;
    public Parcelable v0 = null;
    public ClassLoader w0 = null;
    public final Scroller x0;
    public boolean y0;
    public g04 z0;

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, eof] */
    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.x0 = new Scroller(context2, m1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.P0 = viewConfiguration.getScaledPagingTouchSlop();
        this.W0 = (int) (400.0f * f);
        this.X0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a1 = new EdgeEffect(context2);
        this.b1 = new EdgeEffect(context2);
        this.Y0 = (int) (25.0f * f);
        this.Z0 = (int) (2.0f * f);
        this.N0 = (int) (f * 16.0f);
        zmf.j(this, new fr0(5, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        omf.u(this, new b9b(this));
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.I0 != z) {
            this.I0 = z;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, eof] */
    public final eof a(int i, int i2) {
        Bundle bundle;
        ? obj = new Object();
        obj.b = i;
        cm5 cm5 = (cm5) this.s0;
        String h = cm5.h(i);
        HashMap hashMap = cm5.g;
        a aVar = (a) hashMap.get(h);
        if (aVar != null) {
            hm9.m("cm5", "CHECK instantiateItem use from cache f %s", aVar);
        } else {
            if (cm5.d == null) {
                c cVar = cm5.c;
                cVar.getClass();
                cm5.d = new he0(cVar);
            }
            String h2 = cm5.h(i);
            a g = cm5.g(i);
            bm5 bm5 = (bm5) cm5.e.c(h2);
            if (bm5 != null) {
                hm9.m("cm5", "CHECK instantiateItem use ImplSavedState for %d fe %s", Integer.valueOf(i), g);
                if (g.F0 == null) {
                    x06 x06 = bm5.b;
                    if (x06 == null || (bundle = x06.a) == null) {
                        bundle = null;
                    }
                    g.b = bundle;
                } else {
                    throw new IllegalStateException("Fragment already added");
                }
            } else {
                hm9.m("cm5", "CHECK instantiateItem fr %s", g);
            }
            g.Z0(false);
            g.c1(false);
            hashMap.put(h2, g);
            cm5.d.f(getId(), g, (String) null, 1);
            aVar = g;
        }
        obj.a = aVar;
        this.s0.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(obj);
        } else {
            arrayList.add(i2, obj);
        }
        return obj;
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        eof i3;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (i3 = i(childAt)) != null && i3.b == this.t0) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        eof i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.t0) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        fof fof = (fof) layoutParams;
        boolean z = fof.a | (view.getClass().getAnnotation(dof.class) != null);
        fof.a = z;
        if (!this.H0) {
            super.addView(view, i, layoutParams);
        } else if (!z) {
            fof.d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final void b(gof gof) {
        if (this.f1 == null) {
            this.f1 = new ArrayList();
        }
        this.f1.add(gof);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x002b
        L_0x0009:
            if (r0 == 0) goto L_0x002b
            android.view.ViewParent r2 = r0.getParent()
        L_0x000f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r7) goto L_0x0016
            goto L_0x002b
        L_0x0016:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x000f
        L_0x001b:
            android.view.ViewParent r0 = r0.getParent()
        L_0x001f:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0007
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x001f
        L_0x002b:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto L_0x007e
            if (r1 == r0) goto L_0x007e
            android.graphics.Rect r6 = r7.o
            if (r8 != r5) goto L_0x0062
            android.graphics.Rect r4 = r7.h(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L_0x005c
            if (r4 < r5) goto L_0x005c
            int r0 = r7.t0
            if (r0 <= 0) goto L_0x0098
            int r0 = r0 - r2
            r7.J0 = r3
            r7.v(r0, r3, r2, r3)
            goto L_0x0099
        L_0x005c:
            boolean r0 = r1.requestFocus()
        L_0x0060:
            r3 = r0
            goto L_0x009a
        L_0x0062:
            if (r8 != r4) goto L_0x009a
            android.graphics.Rect r2 = r7.h(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.h(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x0079
            if (r2 > r3) goto L_0x0079
            boolean r0 = r7.n()
            goto L_0x0060
        L_0x0079:
            boolean r0 = r1.requestFocus()
            goto L_0x0060
        L_0x007e:
            if (r8 == r5) goto L_0x008d
            if (r8 != r2) goto L_0x0083
            goto L_0x008d
        L_0x0083:
            if (r8 == r4) goto L_0x0088
            r0 = 2
            if (r8 != r0) goto L_0x009a
        L_0x0088:
            boolean r3 = r7.n()
            goto L_0x009a
        L_0x008d:
            int r0 = r7.t0
            if (r0 <= 0) goto L_0x0098
            int r0 = r0 - r2
            r7.J0 = r3
            r7.v(r0, r3, r2, r3)
            goto L_0x0099
        L_0x0098:
            r2 = r3
        L_0x0099:
            r3 = r2
        L_0x009a:
            if (r3 == 0) goto L_0x00a3
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        L_0x00a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.s0 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.E0)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.F0));
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof fof) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        this.y0 = true;
        Scroller scroller = this.x0;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = zmf.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L_0x0066
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0061
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x0061
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r5 = r5.c(r4)
            goto L_0x0062
        L_0x002b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x0061
            boolean r5 = r5.c(r1)
            goto L_0x0062
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r5 = r5.n()
            goto L_0x0062
        L_0x0041:
            r6 = 66
            boolean r5 = r5.c(r6)
            goto L_0x0062
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x005a
            int r6 = r5.t0
            if (r6 <= 0) goto L_0x0061
            int r6 = r6 - r1
            r5.J0 = r2
            r5.v(r6, r2, r1, r2)
            r5 = r1
            goto L_0x0062
        L_0x005a:
            r6 = 17
            boolean r5 = r5.c(r6)
            goto L_0x0062
        L_0x0061:
            r5 = r2
        L_0x0062:
            if (r5 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        eof i;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.t0 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        hpa hpa;
        EdgeEffect edgeEffect = this.b1;
        EdgeEffect edgeEffect2 = this.a1;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (hpa = this.s0) != null && hpa.b() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.E0 * ((float) width));
                edgeEffect2.setSize(height, width);
                z = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.F0 + 1.0f)) * ((float) width2));
                edgeEffect.setSize(height2, width2);
                z |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (z) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.B0;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z) {
        Scroller scroller = this.x0;
        boolean z2 = this.j1 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.J0 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            eof eof = (eof) arrayList.get(i);
            if (eof.c) {
                eof.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            gwe gwe = this.i1;
            if (z) {
                WeakHashMap weakHashMap = zmf.a;
                postOnAnimation(gwe);
                return;
            }
            gwe.run();
        }
    }

    public final void f() {
        cm5 cm5;
        he0 he0;
        int b2 = this.s0.b();
        this.a = b2;
        ArrayList arrayList = this.b;
        boolean z = arrayList.size() < (this.K0 * 2) + 1 && arrayList.size() < b2;
        int i = this.t0;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < arrayList.size()) {
            eof eof = (eof) arrayList.get(i2);
            int c2 = this.s0.c(eof.a);
            if (c2 != -1) {
                if (c2 == -2) {
                    arrayList.remove(i2);
                    i2--;
                    if (!z2) {
                        this.s0.f(this);
                        z2 = true;
                    }
                    this.s0.a(this, eof.b, eof.a);
                    int i3 = this.t0;
                    if (i3 == eof.b) {
                        i = Math.max(0, Math.min(i3, b2 - 1));
                    }
                } else {
                    int i4 = eof.b;
                    if (i4 != c2) {
                        if (i4 == this.t0) {
                            i = c2;
                        }
                        eof.b = c2;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2 && (he0 = cm5.d) != null) {
            if (!he0.g) {
                he0.q.B(he0, true);
                (cm5 = (cm5) this.s0).d = null;
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Collections.sort(arrayList, l1);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                fof fof = (fof) getChildAt(i5).getLayoutParams();
                if (!fof.a) {
                    fof.c = 0.0f;
                }
            }
            v(i, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i) {
        gof gof = this.g1;
        if (gof != null) {
            gof.m(i);
        }
        ArrayList arrayList = this.f1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gof gof2 = (gof) this.f1.get(i2);
                if (gof2 != null) {
                    gof2.m(i);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.ViewGroup$LayoutParams, fof] */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.c = 0.0f;
        return layoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public hpa getAdapter() {
        return this.s0;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.t0;
    }

    public int getOffscreenPageLimit() {
        return this.K0;
    }

    public int getPageMargin() {
        return this.A0;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final eof i(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            eof eof = (eof) arrayList.get(i);
            hpa hpa = this.s0;
            a aVar = eof.a;
            ((cm5) hpa).getClass();
            if (aVar.k0() == view) {
                return eof;
            }
            i++;
        }
    }

    public final eof j() {
        eof eof;
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.A0) / ((float) clientWidth) : 0.0f;
        int i2 = 0;
        boolean z = true;
        eof eof2 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return eof2;
            }
            eof eof3 = (eof) arrayList.get(i2);
            if (z || eof3.b == (i = i3 + 1)) {
                eof = eof3;
            } else {
                eof eof4 = this.c;
                eof4.e = f + f3 + f2;
                eof4.b = i;
                this.s0.getClass();
                eof4.d = 1.0f;
                i2--;
                eof = eof4;
            }
            f = eof.e;
            float f4 = eof.d + f + f2;
            if (!z && scrollX < f) {
                return eof2;
            }
            if (scrollX < f4 || i2 == arrayList.size() - 1) {
                return eof;
            }
            int i4 = eof.b;
            float f5 = eof.d;
            i2++;
            z = false;
            eof eof5 = eof;
            i3 = i4;
            f3 = f5;
            eof2 = eof5;
        }
        return eof;
    }

    public final eof k(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            eof eof = (eof) arrayList.get(i2);
            if (eof.b == i) {
                return eof;
            }
            i2++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.e1
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L_0x006c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L_0x001b:
            if (r6 >= r5) goto L_0x006c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            fof r8 = (defpackage.fof) r8
            boolean r9 = r8.a
            if (r9 != 0) goto L_0x002c
            goto L_0x0069
        L_0x002c:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L_0x0050
            r9 = 3
            if (r8 == r9) goto L_0x004a
            r9 = 5
            if (r8 == r9) goto L_0x003a
            r8 = r2
            goto L_0x005d
        L_0x003a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L_0x0046:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L_0x005d
        L_0x004a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L_0x005d
        L_0x0050:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L_0x0046
        L_0x005d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x0068
            r7.offsetLeftAndRight(r2)
        L_0x0068:
            r2 = r8
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x006c:
            gof r14 = r11.g1
            if (r14 == 0) goto L_0x0073
            r14.n(r12, r13)
        L_0x0073:
            java.util.ArrayList r14 = r11.f1
            if (r14 == 0) goto L_0x008d
            int r14 = r14.size()
        L_0x007b:
            if (r0 >= r14) goto L_0x008d
            java.util.ArrayList r2 = r11.f1
            java.lang.Object r2 = r2.get(r0)
            gof r2 = (defpackage.gof) r2
            if (r2 == 0) goto L_0x008a
            r2.n(r12, r13)
        L_0x008a:
            int r0 = r0 + 1
            goto L_0x007b
        L_0x008d:
            r11.d1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.l(int, float, int):void");
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.Q0 = motionEvent.getX(i);
            this.U0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.V0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        hpa hpa = this.s0;
        if (hpa == null || this.t0 >= hpa.b() - 1) {
            return false;
        }
        this.J0 = false;
        v(this.t0 + 1, 0, true, false);
        return true;
    }

    public final boolean o(int i) {
        if (this.b.size() != 0) {
            eof j = j();
            int clientWidth = getClientWidth();
            int i2 = this.A0;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = j.b;
            float f2 = ((((float) i) / f) - j.e) / (j.d + (((float) i2) / f));
            this.d1 = false;
            l(i4, f2, (int) (((float) i3) * f2));
            if (this.d1) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.c1) {
            return false;
        } else {
            this.d1 = false;
            l(0, 0.0f, 0);
            if (this.d1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c1 = true;
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.i1);
        Scroller scroller = this.x0;
        if (scroller != null && !scroller.isFinished()) {
            this.x0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            super.onDraw(r19)
            int r1 = r0.A0
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.B0
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList r1 = r0.b
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x00a8
            hpa r2 = r0.s0
            if (r2 == 0) goto L_0x00a8
            int r2 = r18.getScrollX()
            int r3 = r18.getWidth()
            int r4 = r0.A0
            float r4 = (float) r4
            float r5 = (float) r3
            float r4 = r4 / r5
            r6 = 0
            java.lang.Object r7 = r1.get(r6)
            eof r7 = (defpackage.eof) r7
            float r8 = r7.e
            int r9 = r1.size()
            int r10 = r7.b
            int r11 = r9 + -1
            java.lang.Object r11 = r1.get(r11)
            eof r11 = (defpackage.eof) r11
            int r11 = r11.b
        L_0x003f:
            if (r10 >= r11) goto L_0x00a8
        L_0x0041:
            int r12 = r7.b
            if (r10 <= r12) goto L_0x0050
            if (r6 >= r9) goto L_0x0050
            int r6 = r6 + 1
            java.lang.Object r7 = r1.get(r6)
            eof r7 = (defpackage.eof) r7
            goto L_0x0041
        L_0x0050:
            if (r10 != r12) goto L_0x005c
            float r8 = r7.e
            float r12 = r7.d
            float r13 = r8 + r12
            float r13 = r13 * r5
            float r8 = r8 + r12
            float r8 = r8 + r4
            goto L_0x0069
        L_0x005c:
            hpa r12 = r0.s0
            r12.getClass()
            r12 = 1065353216(0x3f800000, float:1.0)
            float r13 = r8 + r12
            float r13 = r13 * r5
            float r12 = r12 + r4
            float r12 = r12 + r8
            r8 = r12
        L_0x0069:
            int r12 = r0.A0
            float r12 = (float) r12
            float r12 = r12 + r13
            float r14 = (float) r2
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x0093
            android.graphics.drawable.Drawable r12 = r0.B0
            int r14 = java.lang.Math.round(r13)
            int r15 = r0.C0
            r16 = r1
            int r1 = r0.A0
            float r1 = (float) r1
            float r1 = r1 + r13
            int r1 = java.lang.Math.round(r1)
            r17 = r4
            int r4 = r0.D0
            r12.setBounds(r14, r15, r1, r4)
            android.graphics.drawable.Drawable r1 = r0.B0
            r4 = r19
            r1.draw(r4)
            goto L_0x0099
        L_0x0093:
            r16 = r1
            r17 = r4
            r4 = r19
        L_0x0099:
            int r1 = r2 + r3
            float r1 = (float) r1
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a1
            goto L_0x00a8
        L_0x00a1:
            int r10 = r10 + 1
            r1 = r16
            r4 = r17
            goto L_0x003f
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.P0;
        Scroller scroller = this.x0;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.L0) {
                return true;
            }
            if (this.M0) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.S0 = x;
            this.Q0 = x;
            float y = motionEvent.getY();
            this.T0 = y;
            this.R0 = y;
            this.U0 = motionEvent.getPointerId(0);
            this.M0 = false;
            this.y0 = true;
            scroller.computeScrollOffset();
            if (this.j1 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.Z0) {
                e(false);
                this.L0 = false;
            } else {
                scroller.abortAnimation();
                this.J0 = false;
                q();
                this.L0 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.U0;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.Q0;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.T0);
                int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i3 != 0) {
                    float f2 = this.Q0;
                    if ((f2 >= ((float) this.O0) || i3 <= 0) && ((f2 <= ((float) (getWidth() - this.O0)) || f >= 0.0f) && d((int) f, (int) x2, (int) y2, this, false))) {
                        this.Q0 = x2;
                        this.R0 = y2;
                        this.M0 = true;
                        return false;
                    }
                }
                float f3 = (float) i;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.L0 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.S0;
                    float f5 = (float) i;
                    this.Q0 = i3 > 0 ? f4 + f5 : f4 - f5;
                    this.R0 = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f3) {
                    this.M0 = true;
                }
                if (this.L0 && p(x2)) {
                    WeakHashMap weakHashMap = zmf.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.V0 == null) {
            this.V0 = VelocityTracker.obtain();
        }
        this.V0.addMovement(motionEvent);
        return this.L0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            fof r12 = (defpackage.fof) r12
            boolean r14 = r12.a
            if (r14 == 0) goto L_0x00b4
            int r12 = r12.b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x0061
            r15 = 3
            if (r14 == r15) goto L_0x005b
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006e
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
        L_0x0055:
            r17 = r14
            r14 = r4
            r4 = r17
            goto L_0x006e
        L_0x005b:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006e
        L_0x0061:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
            goto L_0x0055
        L_0x006e:
            r15 = 16
            if (r12 == r15) goto L_0x0094
            r15 = 48
            if (r12 == r15) goto L_0x008e
            r15 = 80
            if (r12 == r15) goto L_0x007c
            r12 = r5
            goto L_0x00a1
        L_0x007c:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
        L_0x0088:
            r17 = r12
            r12 = r5
            r5 = r17
            goto L_0x00a1
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x00a1
        L_0x0094:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
            goto L_0x0088
        L_0x00a1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b8:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00bb:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            fof r9 = (defpackage.fof) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x0105
            eof r10 = r0.i(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.d = r14
            float r9 = r9.c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00bb
        L_0x0108:
            r0.C0 = r5
            int r3 = r3 - r7
            r0.D0 = r3
            r0.e1 = r11
            boolean r1 = r0.c1
            if (r1 == 0) goto L_0x011a
            int r1 = r0.t0
            r2 = 0
            r0.u(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.c1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i2) {
        fof fof;
        fof fof2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.O0 = Math.min(measuredWidth / 10, this.N0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!(childAt.getVisibility() == 8 || (fof2 = (fof) childAt.getLayoutParams()) == null || !fof2.a)) {
                int i6 = fof2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (!(i7 == 3 || i7 == 5)) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = fof2.width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = fof2.height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.G0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.H0 = true;
        q();
        this.H0 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((fof = (fof) childAt2.getLayoutParams()) == null || !fof.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * fof.c), 1073741824), this.G0);
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        eof i5;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i4 = 0;
            i2 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
            i2 = -1;
        }
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (i5 = i(childAt)) != null && i5.b == this.t0 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i4 += i2;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof hof)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hof hof = (hof) parcelable;
        super.onRestoreInstanceState(hof.a);
        hpa hpa = this.s0;
        ClassLoader classLoader = hof.X;
        if (hpa != null) {
            hpa.e(hof.o, classLoader);
            v(hof.c, 0, false, true);
            return;
        }
        this.u0 = hof.c;
        this.v0 = hof.o;
        this.w0 = classLoader;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, z, hof] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r7 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            hof r1 = new hof
            r1.<init>(r0)
            int r0 = r7.t0
            r1.c = r0
            hpa r7 = r7.s0
            if (r7 == 0) goto L_0x008d
            cm5 r7 = (defpackage.cm5) r7
            java.util.HashMap r0 = r7.g
            boolean r2 = r7.f
            if (r2 != 0) goto L_0x0055
            mw7 r2 = r7.e
            int r3 = r2.g()
            if (r3 <= 0) goto L_0x0055
            java.util.LinkedHashMap r2 = r2.i()
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x002d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.remove(r4)
            goto L_0x002d
        L_0x003d:
            int r3 = r2.size()
            bm5[] r3 = new defpackage.bm5[r3]
            java.util.Collection r2 = r2.values()
            r2.toArray(r3)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "states"
            r2.putParcelableArray(r4, r3)
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x005e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008b
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.get(r4)
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            if (r5 == 0) goto L_0x005e
            boolean r6 = r5.o0()
            if (r6 == 0) goto L_0x005e
            if (r2 != 0) goto L_0x007f
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x007f:
            java.lang.String r6 = "f"
            java.lang.String r4 = defpackage.wg0.i(r6, r4)
            androidx.fragment.app.c r6 = r7.c
            r6.W(r2, r4, r5)
            goto L_0x005e
        L_0x008b:
            r1.o = r2
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onSaveInstanceState():android.os.Parcelable");
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0;
            s(i, i3, i5, i5);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hpa hpa;
        int i = this.P0;
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (hpa = this.s0) == null || hpa.b() == 0) {
            return false;
        }
        if (this.V0 == null) {
            this.V0 = VelocityTracker.obtain();
        }
        this.V0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.x0.abortAnimation();
            this.J0 = false;
            q();
            float x = motionEvent.getX();
            this.S0 = x;
            this.Q0 = x;
            float y = motionEvent.getY();
            this.T0 = y;
            this.R0 = y;
            this.U0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.L0) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.U0);
                    if (findPointerIndex == -1) {
                        z = t();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.Q0);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.R0);
                        if (abs > ((float) i) && abs > abs2) {
                            this.L0 = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.S0;
                            float f2 = (float) i;
                            this.Q0 = x2 - f > 0.0f ? f + f2 : f - f2;
                            this.R0 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.L0) {
                    z = p(motionEvent.getX(motionEvent.findPointerIndex(this.U0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.Q0 = motionEvent.getX(actionIndex);
                    this.U0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m(motionEvent);
                    this.Q0 = motionEvent.getX(motionEvent.findPointerIndex(this.U0));
                }
            } else if (this.L0) {
                u(this.t0, 0, true, false);
                z = t();
            }
        } else if (this.L0) {
            VelocityTracker velocityTracker = this.V0;
            velocityTracker.computeCurrentVelocity(1000, (float) this.X0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.U0);
            this.J0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            eof j = j();
            float f3 = (float) clientWidth;
            float f4 = ((float) this.A0) / f3;
            int i2 = j.b;
            float f5 = ((((float) scrollX) / f3) - j.e) / (j.d + f4);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.U0)) - this.S0)) <= this.Y0 || Math.abs(xVelocity) <= this.W0) {
                i2 += (int) (f5 + (i2 >= this.t0 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i2++;
            }
            ArrayList arrayList = this.b;
            if (arrayList.size() > 0) {
                i2 = Math.max(((eof) arrayList.get(0)).b, Math.min(i2, ((eof) wg0.f(arrayList, 1)).b));
            }
            v(i2, xVelocity, true, true);
            z = t();
        }
        if (z) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(float f) {
        boolean z;
        boolean z2;
        float f2 = this.Q0 - f;
        this.Q0 = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.E0 * clientWidth;
        float f4 = this.F0 * clientWidth;
        ArrayList arrayList = this.b;
        boolean z3 = false;
        eof eof = (eof) arrayList.get(0);
        eof eof2 = (eof) wg0.f(arrayList, 1);
        if (eof.b != 0) {
            f3 = eof.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (eof2.b != this.s0.b() - 1) {
            f4 = eof2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.a1.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.b1.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.Q0 = (scrollX - ((float) i)) + this.Q0;
        scrollTo(i, getScrollY());
        o(i);
        return z3;
    }

    public final void q() {
        r(this.t0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r10 == r11) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.t0
            if (r2 == r1) goto L_0x000f
            eof r2 = r0.k(r2)
            r0.t0 = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            hpa r1 = r0.s0
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            boolean r1 = r0.J0
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0021
            return
        L_0x0021:
            hpa r1 = r0.s0
            r1.f(r0)
            int r1 = r0.K0
            int r4 = r0.t0
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            hpa r6 = r0.s0
            int r6 = r6.b()
            int r7 = r6 + -1
            int r8 = r0.t0
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.a
            if (r6 != r7) goto L_0x0350
            r7 = r5
        L_0x0044:
            java.util.ArrayList r8 = r0.b
            int r9 = r8.size()
            if (r7 >= r9) goto L_0x005e
            java.lang.Object r9 = r8.get(r7)
            eof r9 = (defpackage.eof) r9
            int r10 = r9.b
            int r11 = r0.t0
            if (r10 < r11) goto L_0x005b
            if (r10 != r11) goto L_0x005e
            goto L_0x005f
        L_0x005b:
            int r7 = r7 + 1
            goto L_0x0044
        L_0x005e:
            r9 = 0
        L_0x005f:
            if (r9 != 0) goto L_0x0069
            if (r6 <= 0) goto L_0x0069
            int r9 = r0.t0
            eof r9 = r0.a(r9, r7)
        L_0x0069:
            r10 = 1
            if (r9 == 0) goto L_0x02af
            int r12 = r7 + -1
            if (r12 < 0) goto L_0x0077
            java.lang.Object r13 = r8.get(r12)
            eof r13 = (defpackage.eof) r13
            goto L_0x0078
        L_0x0077:
            r13 = 0
        L_0x0078:
            int r14 = r17.getClientWidth()
            r15 = 1073741824(0x40000000, float:2.0)
            if (r14 > 0) goto L_0x0082
            r3 = 0
            goto L_0x008e
        L_0x0082:
            float r11 = r9.d
            float r11 = r15 - r11
            int r3 = r17.getPaddingLeft()
            float r3 = (float) r3
            float r5 = (float) r14
            float r3 = r3 / r5
            float r3 = r3 + r11
        L_0x008e:
            int r5 = r0.t0
            int r5 = r5 - r10
            r11 = 0
        L_0x0092:
            if (r5 < 0) goto L_0x00eb
            int r16 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00bf
            if (r5 >= r4) goto L_0x00bf
            if (r13 != 0) goto L_0x009d
            goto L_0x00eb
        L_0x009d:
            int r10 = r13.b
            if (r5 != r10) goto L_0x00e7
            boolean r10 = r13.c
            if (r10 != 0) goto L_0x00e7
            r8.remove(r12)
            hpa r10 = r0.s0
            androidx.fragment.app.a r13 = r13.a
            r10.a(r0, r5, r13)
            int r12 = r12 + -1
            int r7 = r7 + -1
            if (r12 < 0) goto L_0x00bc
            java.lang.Object r10 = r8.get(r12)
            eof r10 = (defpackage.eof) r10
            goto L_0x00bd
        L_0x00bc:
            r10 = 0
        L_0x00bd:
            r13 = r10
            goto L_0x00e7
        L_0x00bf:
            if (r13 == 0) goto L_0x00d3
            int r10 = r13.b
            if (r5 != r10) goto L_0x00d3
            float r10 = r13.d
            float r11 = r11 + r10
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x00bc
            java.lang.Object r10 = r8.get(r12)
            eof r10 = (defpackage.eof) r10
            goto L_0x00bd
        L_0x00d3:
            int r10 = r12 + 1
            eof r10 = r0.a(r5, r10)
            float r10 = r10.d
            float r11 = r11 + r10
            int r7 = r7 + 1
            if (r12 < 0) goto L_0x00bc
            java.lang.Object r10 = r8.get(r12)
            eof r10 = (defpackage.eof) r10
            goto L_0x00bd
        L_0x00e7:
            int r5 = r5 + -1
            r10 = 1
            goto L_0x0092
        L_0x00eb:
            float r3 = r9.d
            int r4 = r7 + 1
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 >= 0) goto L_0x016e
            int r5 = r8.size()
            if (r4 >= r5) goto L_0x0100
            java.lang.Object r5 = r8.get(r4)
            eof r5 = (defpackage.eof) r5
            goto L_0x0101
        L_0x0100:
            r5 = 0
        L_0x0101:
            if (r14 > 0) goto L_0x0105
            r10 = 0
            goto L_0x010d
        L_0x0105:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r14
            float r10 = r10 / r11
            float r10 = r10 + r15
        L_0x010d:
            int r11 = r0.t0
            r12 = 1
            int r11 = r11 + r12
            r12 = r4
        L_0x0112:
            if (r11 >= r6) goto L_0x016e
            int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x013e
            if (r11 <= r1) goto L_0x013e
            if (r5 != 0) goto L_0x011d
            goto L_0x016e
        L_0x011d:
            int r13 = r5.b
            if (r11 != r13) goto L_0x016b
            boolean r13 = r5.c
            if (r13 != 0) goto L_0x016b
            r8.remove(r12)
            hpa r13 = r0.s0
            androidx.fragment.app.a r5 = r5.a
            r13.a(r0, r11, r5)
            int r5 = r8.size()
            if (r12 >= r5) goto L_0x013c
            java.lang.Object r5 = r8.get(r12)
            eof r5 = (defpackage.eof) r5
            goto L_0x016b
        L_0x013c:
            r5 = 0
            goto L_0x016b
        L_0x013e:
            if (r5 == 0) goto L_0x0156
            int r13 = r5.b
            if (r11 != r13) goto L_0x0156
            float r5 = r5.d
            float r3 = r3 + r5
            int r12 = r12 + 1
            int r5 = r8.size()
            if (r12 >= r5) goto L_0x013c
            java.lang.Object r5 = r8.get(r12)
            eof r5 = (defpackage.eof) r5
            goto L_0x016b
        L_0x0156:
            eof r5 = r0.a(r11, r12)
            int r12 = r12 + 1
            float r5 = r5.d
            float r3 = r3 + r5
            int r5 = r8.size()
            if (r12 >= r5) goto L_0x013c
            java.lang.Object r5 = r8.get(r12)
            eof r5 = (defpackage.eof) r5
        L_0x016b:
            int r11 = r11 + 1
            goto L_0x0112
        L_0x016e:
            hpa r1 = r0.s0
            int r1 = r1.b()
            int r3 = r17.getClientWidth()
            if (r3 <= 0) goto L_0x0180
            int r5 = r0.A0
            float r5 = (float) r5
            float r3 = (float) r3
            float r5 = r5 / r3
            goto L_0x0181
        L_0x0180:
            r5 = 0
        L_0x0181:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x020f
            int r6 = r2.b
            int r10 = r9.b
            if (r6 >= r10) goto L_0x01d1
            float r10 = r2.e
            float r2 = r2.d
            float r10 = r10 + r2
            float r10 = r10 + r5
            r2 = 1
            int r6 = r6 + r2
            r2 = 0
        L_0x0194:
            int r11 = r9.b
            if (r6 > r11) goto L_0x020f
            int r11 = r8.size()
            if (r2 >= r11) goto L_0x020f
            java.lang.Object r11 = r8.get(r2)
            eof r11 = (defpackage.eof) r11
        L_0x01a4:
            int r12 = r11.b
            if (r6 <= r12) goto L_0x01b9
            int r12 = r8.size()
            r13 = 1
            int r12 = r12 - r13
            if (r2 >= r12) goto L_0x01b9
            int r2 = r2 + 1
            java.lang.Object r11 = r8.get(r2)
            eof r11 = (defpackage.eof) r11
            goto L_0x01a4
        L_0x01b9:
            int r12 = r11.b
            if (r6 >= r12) goto L_0x01c8
            hpa r12 = r0.s0
            r12.getClass()
            float r12 = r3 + r5
            float r10 = r10 + r12
            int r6 = r6 + 1
            goto L_0x01b9
        L_0x01c8:
            r11.e = r10
            float r11 = r11.d
            float r11 = r11 + r5
            float r10 = r10 + r11
            int r6 = r6 + 1
            goto L_0x0194
        L_0x01d1:
            if (r6 <= r10) goto L_0x020f
            int r10 = r8.size()
            r11 = 1
            int r10 = r10 - r11
            float r2 = r2.e
            int r6 = r6 - r11
        L_0x01dc:
            int r11 = r9.b
            if (r6 < r11) goto L_0x020f
            if (r10 < 0) goto L_0x020f
            java.lang.Object r11 = r8.get(r10)
            eof r11 = (defpackage.eof) r11
        L_0x01e8:
            int r12 = r11.b
            if (r6 >= r12) goto L_0x01f7
            if (r10 <= 0) goto L_0x01f7
            int r10 = r10 + -1
            java.lang.Object r11 = r8.get(r10)
            eof r11 = (defpackage.eof) r11
            goto L_0x01e8
        L_0x01f7:
            int r12 = r11.b
            if (r6 <= r12) goto L_0x0206
            hpa r12 = r0.s0
            r12.getClass()
            float r12 = r3 + r5
            float r2 = r2 - r12
            int r6 = r6 + -1
            goto L_0x01f7
        L_0x0206:
            float r12 = r11.d
            float r12 = r12 + r5
            float r2 = r2 - r12
            r11.e = r2
            int r6 = r6 + -1
            goto L_0x01dc
        L_0x020f:
            int r2 = r8.size()
            float r6 = r9.e
            int r10 = r9.b
            int r11 = r10 + -1
            if (r10 != 0) goto L_0x021d
            r12 = r6
            goto L_0x0220
        L_0x021d:
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0220:
            r0.E0 = r12
            r12 = 1
            int r1 = r1 - r12
            if (r10 != r1) goto L_0x022b
            float r10 = r9.d
            float r10 = r10 + r6
            float r10 = r10 - r3
            goto L_0x022e
        L_0x022b:
            r10 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x022e:
            r0.F0 = r10
            int r7 = r7 - r12
        L_0x0231:
            if (r7 < 0) goto L_0x0257
            java.lang.Object r10 = r8.get(r7)
            eof r10 = (defpackage.eof) r10
        L_0x0239:
            int r12 = r10.b
            if (r11 <= r12) goto L_0x0248
            hpa r12 = r0.s0
            int r11 = r11 + -1
            r12.getClass()
            float r12 = r3 + r5
            float r6 = r6 - r12
            goto L_0x0239
        L_0x0248:
            float r13 = r10.d
            float r13 = r13 + r5
            float r6 = r6 - r13
            r10.e = r6
            if (r12 != 0) goto L_0x0252
            r0.E0 = r6
        L_0x0252:
            int r7 = r7 + -1
            int r11 = r11 + -1
            goto L_0x0231
        L_0x0257:
            float r6 = r9.e
            float r7 = r9.d
            float r6 = r6 + r7
            float r6 = r6 + r5
            int r7 = r9.b
            r10 = 1
            int r7 = r7 + r10
        L_0x0261:
            if (r4 >= r2) goto L_0x028b
            java.lang.Object r10 = r8.get(r4)
            eof r10 = (defpackage.eof) r10
        L_0x0269:
            int r11 = r10.b
            if (r7 >= r11) goto L_0x0278
            hpa r11 = r0.s0
            int r7 = r7 + 1
            r11.getClass()
            float r11 = r3 + r5
            float r6 = r6 + r11
            goto L_0x0269
        L_0x0278:
            if (r11 != r1) goto L_0x0280
            float r11 = r10.d
            float r11 = r11 + r6
            float r11 = r11 - r3
            r0.F0 = r11
        L_0x0280:
            r10.e = r6
            float r10 = r10.d
            float r10 = r10 + r5
            float r6 = r6 + r10
            int r4 = r4 + 1
            int r7 = r7 + 1
            goto L_0x0261
        L_0x028b:
            hpa r1 = r0.s0
            androidx.fragment.app.a r2 = r9.a
            cm5 r1 = (defpackage.cm5) r1
            r1.getClass()
            androidx.fragment.app.a r3 = r1.h
            r4 = 0
            if (r2 == r3) goto L_0x02b0
            if (r3 == 0) goto L_0x02a3
            r3.Z0(r4)
            androidx.fragment.app.a r3 = r1.h
            r3.c1(r4)
        L_0x02a3:
            if (r2 == 0) goto L_0x02ac
            r3 = 1
            r2.Z0(r3)
            r2.c1(r3)
        L_0x02ac:
            r1.h = r2
            goto L_0x02b0
        L_0x02af:
            r4 = r5
        L_0x02b0:
            hpa r1 = r0.s0
            cm5 r1 = (defpackage.cm5) r1
            he0 r2 = r1.d
            if (r2 == 0) goto L_0x02ce
            boolean r3 = r2.g
            if (r3 != 0) goto L_0x02c6
            androidx.fragment.app.c r3 = r2.q
            r5 = 1
            r3.B(r2, r5)
            r2 = 0
            r1.d = r2
            goto L_0x02cf
        L_0x02c6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
        L_0x02ce:
            r2 = 0
        L_0x02cf:
            int r1 = r17.getChildCount()
            r3 = r4
        L_0x02d4:
            if (r3 >= r1) goto L_0x0302
            android.view.View r5 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            fof r6 = (defpackage.fof) r6
            r6.getClass()
            boolean r7 = r6.a
            if (r7 != 0) goto L_0x02fe
            float r7 = r6.c
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x02ff
            eof r5 = r0.i(r5)
            if (r5 == 0) goto L_0x02ff
            float r7 = r5.d
            r6.c = r7
            int r5 = r5.b
            r6.getClass()
            goto L_0x02ff
        L_0x02fe:
            r8 = 0
        L_0x02ff:
            int r3 = r3 + 1
            goto L_0x02d4
        L_0x0302:
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x034f
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x0324
        L_0x030e:
            android.view.ViewParent r3 = r1.getParent()
            if (r3 == r0) goto L_0x031f
            if (r3 == 0) goto L_0x0324
            boolean r1 = r3 instanceof android.view.View
            if (r1 != 0) goto L_0x031b
            goto L_0x0324
        L_0x031b:
            r1 = r3
            android.view.View r1 = (android.view.View) r1
            goto L_0x030e
        L_0x031f:
            eof r3 = r0.i(r1)
            goto L_0x0325
        L_0x0324:
            r3 = r2
        L_0x0325:
            if (r3 == 0) goto L_0x032d
            int r1 = r3.b
            int r2 = r0.t0
            if (r1 == r2) goto L_0x034f
        L_0x032d:
            r5 = r4
        L_0x032e:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x034f
            android.view.View r1 = r0.getChildAt(r5)
            eof r2 = r0.i(r1)
            if (r2 == 0) goto L_0x034c
            int r2 = r2.b
            int r3 = r0.t0
            if (r2 != r3) goto L_0x034c
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x034c
            goto L_0x034f
        L_0x034c:
            int r5 = r5 + 1
            goto L_0x032e
        L_0x034f:
            return
        L_0x0350:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x035d }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x035d }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x035d }
            goto L_0x0365
        L_0x035d:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0365:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.a
            java.lang.String r5 = ", found: "
            java.lang.String r7 = " Pager id: "
            defpackage.ms2.k(r3, r4, r5, r6, r7)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            hpa r0 = r0.s0
            java.lang.Class r0 = r0.getClass()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int):void");
    }

    public final void removeView(View view) {
        if (this.H0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.b.isEmpty()) {
            eof k = k(this.t0);
            int min = (int) ((k != null ? Math.min(k.e, this.F0) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                e(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.x0.isFinished()) {
            this.x0.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    public void setAdapter(hpa hpa) {
        ArrayList arrayList;
        hpa hpa2 = this.s0;
        if (hpa2 != null) {
            synchronized (hpa2) {
                hpa2.b = null;
            }
            this.s0.f(this);
            int i = 0;
            while (true) {
                arrayList = this.b;
                if (i >= arrayList.size()) {
                    break;
                }
                eof eof = (eof) arrayList.get(i);
                this.s0.a(this, eof.b, eof.a);
                i++;
            }
            cm5 cm5 = (cm5) this.s0;
            he0 he0 = cm5.d;
            if (he0 != null) {
                if (!he0.g) {
                    he0.q.B(he0, true);
                    cm5.d = null;
                } else {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            }
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((fof) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.t0 = 0;
            scrollTo(0, 0);
        }
        this.s0 = hpa;
        this.a = 0;
        if (hpa != null) {
            if (this.z0 == null) {
                this.z0 = new g04(3, this);
            }
            hpa hpa3 = this.s0;
            g04 g04 = this.z0;
            synchronized (hpa3) {
                hpa3.b = g04;
            }
            this.J0 = false;
            boolean z = this.c1;
            this.c1 = true;
            this.a = this.s0.b();
            if (this.u0 >= 0) {
                this.s0.e(this.v0, this.w0);
                v(this.u0, 0, false, true);
                this.u0 = -1;
                this.v0 = null;
                this.w0 = null;
            } else if (!z) {
                q();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.h1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = this.h1.size();
            for (int i3 = 0; i3 < size; i3++) {
                aje aje = (aje) this.h1.get(i3);
                TabLayout tabLayout = aje.b;
                if (tabLayout.c1 == this) {
                    tabLayout.p(hpa, aje.a);
                }
            }
        }
    }

    public void setCurrentItem(int i) {
        this.J0 = false;
        v(i, 0, !this.c1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.K0) {
            this.K0 = i;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(gof gof) {
        this.g1 = gof;
    }

    public void setPageMargin(int i) {
        int i2 = this.A0;
        this.A0 = i;
        int width = getWidth();
        s(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.B0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.j1 != i) {
            this.j1 = i;
            gof gof = this.g1;
            if (gof != null) {
                gof.k(i);
            }
            ArrayList arrayList = this.f1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    gof gof2 = (gof) this.f1.get(i2);
                    if (gof2 != null) {
                        gof2.k(i);
                    }
                }
            }
        }
    }

    public final boolean t() {
        this.U0 = -1;
        this.L0 = false;
        this.M0 = false;
        VelocityTracker velocityTracker = this.V0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.V0 = null;
        }
        this.a1.onRelease();
        this.b1.onRelease();
        return this.a1.isFinished() || this.b1.isFinished();
    }

    public final void u(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        int i3;
        Scroller scroller = this.x0;
        eof k = k(i);
        int max = k != null ? (int) (Math.max(this.E0, Math.min(k.e, this.F0)) * ((float) getClientWidth())) : 0;
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    scrollX = this.y0 ? scroller.getCurrX() : scroller.getStartX();
                    scroller.abortAnimation();
                    setScrollingCacheEnabled(false);
                }
                int i4 = scrollX;
                int scrollY = getScrollY();
                int i5 = max - i4;
                int i6 = 0 - scrollY;
                if (i5 == 0 && i6 == 0) {
                    e(false);
                    q();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i7 = clientWidth / 2;
                    float f = (float) clientWidth;
                    float f2 = (float) i7;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        i3 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        this.s0.getClass();
                        i3 = (int) (((((float) Math.abs(i5)) / ((f * 1.0f) + ((float) this.A0))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i3, 600);
                    this.y0 = false;
                    this.x0.startScroll(i4, scrollY, i5, i6, min);
                    WeakHashMap weakHashMap = zmf.a;
                    postInvalidateOnAnimation();
                }
            }
            if (z2) {
                g(i);
                return;
            }
            return;
        }
        if (z2) {
            g(i);
        }
        e(false);
        scrollTo(max, 0);
        o(max);
    }

    public final void v(int i, int i2, boolean z, boolean z2) {
        hpa hpa = this.s0;
        boolean z3 = false;
        if (hpa == null || hpa.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (z2 || this.t0 != i || arrayList.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.s0.b()) {
                i = this.s0.b() - 1;
            }
            int i3 = this.K0;
            int i4 = this.t0;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((eof) arrayList.get(i5)).c = true;
                }
            }
            if (this.t0 != i) {
                z3 = true;
            }
            if (this.c1) {
                this.t0 = i;
                if (z3) {
                    g(i);
                }
                requestLayout();
                return;
            }
            r(i);
            u(i, i2, z, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, fof] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k1);
        layoutParams.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(kt3.b(getContext(), i));
    }
}
