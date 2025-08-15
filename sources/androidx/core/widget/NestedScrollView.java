package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class NestedScrollView extends FrameLayout implements ln9, hn9, ixc {
    public static final float P0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final h18 Q0 = new h18(3);
    public static final int[] R0 = {16843130};
    public boolean A0;
    public boolean B0 = true;
    public final int C0;
    public final int D0;
    public final int E0;
    public int F0 = -1;
    public final int[] G0 = new int[2];
    public final int[] H0 = new int[2];
    public int I0;
    public int J0;
    public gn9 K0;
    public final jt L0;
    public final jn9 M0;
    public float N0;
    public final ak4 O0 = new ak4(getContext(), new wmc(this, false));
    public final float a;
    public long b;
    public final Rect c = new Rect();
    public final OverScroller o;
    public final EdgeEffect s0;
    public final EdgeEffect t0;
    public int u0;
    public boolean v0 = true;
    public boolean w0 = false;
    public View x0 = null;
    public boolean y0 = false;
    public VelocityTracker z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NestedScrollView(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r0 = defpackage.psb.nestedScrollViewStyle
            r6.<init>(r7, r8, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.c = r1
            r1 = 1
            r6.v0 = r1
            r2 = 0
            r6.w0 = r2
            r3 = 0
            r6.x0 = r3
            r6.y0 = r2
            r6.B0 = r1
            r3 = -1
            r6.F0 = r3
            r3 = 2
            int[] r4 = new int[r3]
            r6.G0 = r4
            int[] r3 = new int[r3]
            r6.H0 = r3
            wmc r3 = new wmc
            r4 = 0
            r3.<init>(r6, r4)
            ak4 r4 = new ak4
            android.content.Context r5 = r6.getContext()
            r4.<init>(r5, r3)
            r6.O0 = r4
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L_0x0041
            android.widget.EdgeEffect r5 = defpackage.pu4.a(r7, r8)
            goto L_0x0046
        L_0x0041:
            android.widget.EdgeEffect r5 = new android.widget.EdgeEffect
            r5.<init>(r7)
        L_0x0046:
            r6.s0 = r5
            if (r3 < r4) goto L_0x004f
            android.widget.EdgeEffect r3 = defpackage.pu4.a(r7, r8)
            goto L_0x0054
        L_0x004f:
            android.widget.EdgeEffect r3 = new android.widget.EdgeEffect
            r3.<init>(r7)
        L_0x0054:
            r6.t0 = r3
            android.content.res.Resources r3 = r7.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r4
            r4 = 1136724797(0x43c10b3d, float:386.0878)
            float r3 = r3 * r4
            r4 = 1062668861(0x3f570a3d, float:0.84)
            float r3 = r3 * r4
            r6.a = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r6.getContext()
            r3.<init>(r4)
            r6.o = r3
            r6.setFocusable(r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r6.setDescendantFocusability(r3)
            r6.setWillNotDraw(r2)
            android.content.Context r3 = r6.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r4 = r3.getScaledTouchSlop()
            r6.C0 = r4
            int r4 = r3.getScaledMinimumFlingVelocity()
            r6.D0 = r4
            int r3 = r3.getScaledMaximumFlingVelocity()
            r6.E0 = r3
            int[] r3 = R0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r3, r0, r2)
            boolean r8 = r7.getBoolean(r2, r2)
            r6.setFillViewport(r8)
            r7.recycle()
            jt r7 = new jt
            r8 = 6
            r7.<init>(r8)
            r6.L0 = r7
            jn9 r7 = new jn9
            r7.<init>(r6)
            r6.M0 = r7
            r6.setNestedScrollingEnabled(r1)
            h18 r7 = Q0
            defpackage.zmf.j(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static boolean g(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && g((View) parent, view2);
    }

    public final void a(int i) {
        this.M0.i(i);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final boolean b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !h(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(c(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!h(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int c(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r14 = this;
            android.widget.OverScroller r0 = r14.o
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r14.o
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r14.o
            int r0 = r0.getCurrY()
            int r1 = r14.J0
            int r1 = r0 - r1
            int r2 = r14.getHeight()
            android.widget.EdgeEffect r3 = r14.t0
            android.widget.EdgeEffect r4 = r14.s0
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x0047
            float r8 = defpackage.kp.k(r4)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0047
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r8 = (float) r2
            float r6 = r6 / r8
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r7
            float r5 = defpackage.kp.q(r4, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0045
            r4.finish()
        L_0x0045:
            int r1 = r1 - r2
            goto L_0x0065
        L_0x0047:
            if (r1 >= 0) goto L_0x0065
            float r8 = defpackage.kp.k(r3)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0065
            float r6 = (float) r1
            float r6 = r6 * r7
            float r2 = (float) r2
            float r6 = r6 / r2
            float r2 = r2 / r7
            float r5 = defpackage.kp.q(r3, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0045
            r3.finish()
            goto L_0x0045
        L_0x0065:
            r14.J0 = r0
            int[] r0 = r14.H0
            r2 = 1
            r11 = 0
            r0[r2] = r11
            r10 = 0
            jn9 r5 = r14.M0
            r6 = 0
            r8 = 1
            r7 = r1
            r9 = r0
            r5.c(r6, r7, r8, r9, r10)
            r5 = r0[r2]
            int r1 = r1 - r5
            int r13 = r14.getScrollRange()
            if (r1 == 0) goto L_0x00a3
            int r5 = r14.getScrollY()
            int r6 = r14.getScrollX()
            r14.q(r1, r6, r5, r13)
            int r6 = r14.getScrollY()
            int r7 = r6 - r5
            int r1 = r1 - r7
            r0[r2] = r11
            r6 = 0
            r8 = 0
            jn9 r5 = r14.M0
            int[] r10 = r14.G0
            r11 = 1
            r9 = r1
            r12 = r0
            r5.e(r6, r7, r8, r9, r10, r11, r12)
            r0 = r0[r2]
            int r1 = r1 - r0
        L_0x00a3:
            if (r1 == 0) goto L_0x00da
            int r0 = r14.getOverScrollMode()
            if (r0 == 0) goto L_0x00af
            if (r0 != r2) goto L_0x00d2
            if (r13 <= 0) goto L_0x00d2
        L_0x00af:
            if (r1 >= 0) goto L_0x00c2
            boolean r0 = r4.isFinished()
            if (r0 == 0) goto L_0x00d2
            android.widget.OverScroller r0 = r14.o
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r4.onAbsorb(r0)
            goto L_0x00d2
        L_0x00c2:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L_0x00d2
            android.widget.OverScroller r0 = r14.o
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L_0x00d2:
            android.widget.OverScroller r0 = r14.o
            r0.abortAnimation()
            r14.a(r2)
        L_0x00da:
            android.widget.OverScroller r0 = r14.o
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00e6
            r14.postInvalidateOnAnimation()
            goto L_0x00e9
        L_0x00e6:
            r14.a(r2)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d(KeyEvent keyEvent) {
        this.c.setEmpty();
        int i = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? f(33) : b(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? f(130) : b(130);
                }
                if (keyCode == 62) {
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    r(i);
                    return false;
                } else if (keyCode == 92) {
                    return f(33);
                } else {
                    if (keyCode == 93) {
                        return f(130);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    } else if (keyCode != 123) {
                        return false;
                    } else {
                        r(130);
                        return false;
                    }
                }
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || d(keyEvent);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.M0.a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.M0.b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.M0.c(i, i2, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.M0.e(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.s0;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (dn9.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (dn9.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.t0;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (dn9.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            }
            if (dn9.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(int i) {
        if (getChildCount() > 0) {
            this.o.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.J0 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean f(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i, rect.top, rect.bottom);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        jt jtVar = this.L0;
        return jtVar.c | jtVar.b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.N0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.N0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.N0;
    }

    public final boolean h(View view, int i, int i2) {
        Rect rect = this.c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final boolean hasNestedScrollingParent() {
        return this.M0.g(0);
    }

    public final void i(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        o(i4, i5, iArr);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.M0.d;
    }

    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        o(i4, i5, (int[]) null);
    }

    public final boolean k(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final void l(View view, View view2, int i, int i2) {
        jt jtVar = this.L0;
        if (i2 == 1) {
            jtVar.c = i;
        } else {
            jtVar.b = i;
        }
        w(2, i2);
    }

    public final void m(View view, int i) {
        jt jtVar = this.L0;
        if (i == 1) {
            jtVar.c = 0;
        } else {
            jtVar.b = 0;
        }
        a(i);
    }

    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(View view, int i, int i2, int[] iArr, int i3) {
        this.M0.c(i, i2, i3, iArr, (int[]) null);
    }

    public final void o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.M0.d(scrollY2, i - scrollY2, i2, iArr);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w0 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
        if (r2 >= 0) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r3 = 1
            int r4 = r26.getAction()
            r5 = 8
            if (r4 != r5) goto L_0x0344
            boolean r4 = r0.y0
            if (r4 != 0) goto L_0x0344
            int r4 = r26.getSource()
            r5 = 2
            r4 = r4 & r5
            if (r4 != r5) goto L_0x001b
            r4 = r3
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r7 = 0
            r8 = 4194304(0x400000, float:5.877472E-39)
            r9 = 26
            if (r4 == 0) goto L_0x002f
            r4 = 9
            float r10 = r1.getAxisValue(r4)
            float r11 = r26.getX()
            int r11 = (int) r11
            goto L_0x0045
        L_0x002f:
            int r4 = r26.getSource()
            r4 = r4 & r8
            if (r4 != r8) goto L_0x0042
            float r10 = r1.getAxisValue(r9)
            int r4 = r25.getWidth()
            int r11 = r4 / 2
            r4 = r9
            goto L_0x0045
        L_0x0042:
            r10 = r7
            r4 = 0
            r11 = 0
        L_0x0045:
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0344
            float r12 = r25.getVerticalScrollFactorCompat()
            float r12 = r12 * r10
            int r10 = (int) r12
            int r12 = r26.getSource()
            r13 = 8194(0x2002, float:1.1482E-41)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x005a
            r12 = r3
            goto L_0x005b
        L_0x005a:
            r12 = 0
        L_0x005b:
            int r10 = -r10
            r0.t(r10, r11, r3, r12)
            if (r4 == 0) goto L_0x0342
            ak4 r0 = r0.O0
            r0.getClass()
            int r10 = r26.getSource()
            int r11 = r26.getDeviceId()
            int r12 = r0.h
            r14 = 34
            int[] r15 = r0.j
            if (r12 != r10) goto L_0x0083
            int r12 = r0.i
            if (r12 != r11) goto L_0x0083
            int r12 = r0.g
            if (r12 == r4) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            r2 = 0
            r6 = 0
            goto L_0x0132
        L_0x0083:
            av1 r12 = r0.c
            r12.getClass()
            android.content.Context r12 = r0.a
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r12)
            int r2 = r26.getDeviceId()
            int r7 = r26.getSource()
            int r13 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "android"
            java.lang.String r6 = "dimen"
            r9 = -1
            if (r13 < r14) goto L_0x00a5
            int r2 = defpackage.cnf.b(r5, r2, r4, r7)
        L_0x00a3:
            r7 = 0
            goto L_0x00da
        L_0x00a5:
            android.view.InputDevice r2 = android.view.InputDevice.getDevice(r2)
            if (r2 == 0) goto L_0x00d6
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r7)
            if (r2 == 0) goto L_0x00d6
            android.content.res.Resources r2 = r12.getResources()
            if (r7 != r8) goto L_0x00c2
            r7 = 26
            if (r4 != r7) goto L_0x00c2
            java.lang.String r7 = "config_viewMinRotaryEncoderFlingVelocity"
            int r7 = r2.getIdentifier(r7, r6, r3)
            goto L_0x00c3
        L_0x00c2:
            r7 = r9
        L_0x00c3:
            java.util.Objects.requireNonNull(r5)
            if (r7 == r9) goto L_0x00d1
            if (r7 == 0) goto L_0x00d6
            int r2 = r2.getDimensionPixelSize(r7)
            if (r2 >= 0) goto L_0x00a3
            goto L_0x00d6
        L_0x00d1:
            int r2 = r5.getScaledMinimumFlingVelocity()
            goto L_0x00a3
        L_0x00d6:
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00a3
        L_0x00da:
            r15[r7] = r2
            int r2 = r26.getDeviceId()
            int r7 = r26.getSource()
            if (r13 < r14) goto L_0x00ec
            int r2 = defpackage.cnf.a(r5, r2, r4, r7)
        L_0x00ea:
            r3 = 1
            goto L_0x0128
        L_0x00ec:
            android.view.InputDevice r2 = android.view.InputDevice.getDevice(r2)
            if (r2 == 0) goto L_0x00fa
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r7)
            if (r2 == 0) goto L_0x00fa
            r2 = 1
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != 0) goto L_0x0101
        L_0x00ff:
            r2 = r13
            goto L_0x00ea
        L_0x0101:
            android.content.res.Resources r2 = r12.getResources()
            if (r7 != r8) goto L_0x0112
            r7 = 26
            if (r4 != r7) goto L_0x0112
            java.lang.String r7 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r3 = r2.getIdentifier(r7, r6, r3)
            goto L_0x0113
        L_0x0112:
            r3 = r9
        L_0x0113:
            java.util.Objects.requireNonNull(r5)
            if (r3 == r9) goto L_0x0123
            if (r3 == 0) goto L_0x00ff
            int r2 = r2.getDimensionPixelSize(r3)
            if (r2 >= 0) goto L_0x0121
            goto L_0x00ff
        L_0x0121:
            r13 = r2
            goto L_0x00ff
        L_0x0123:
            int r2 = r5.getScaledMaximumFlingVelocity()
            goto L_0x00ea
        L_0x0128:
            r15[r3] = r2
            r0.h = r10
            r0.i = r11
            r0.g = r4
            r2 = 0
            r6 = 1
        L_0x0132:
            r3 = r15[r2]
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x0145
            android.view.VelocityTracker r1 = r0.e
            if (r1 == 0) goto L_0x0340
            r1.recycle()
            r1 = 0
            r0.e = r1
            goto L_0x0340
        L_0x0145:
            android.view.VelocityTracker r2 = r0.e
            if (r2 != 0) goto L_0x014f
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.e = r2
        L_0x014f:
            android.view.VelocityTracker r2 = r0.e
            av1 r3 = r0.d
            r3.getClass()
            java.util.Map r3 = defpackage.wbf.a
            r2.addMovement(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r14) goto L_0x0160
            goto L_0x01b9
        L_0x0160:
            int r3 = r26.getSource()
            if (r3 != r8) goto L_0x01b9
            java.util.Map r3 = defpackage.wbf.a
            boolean r5 = r3.containsKey(r2)
            if (r5 != 0) goto L_0x0176
            xbf r5 = new xbf
            r5.<init>()
            r3.put(r2, r5)
        L_0x0176:
            java.lang.Object r3 = r3.get(r2)
            xbf r3 = (defpackage.xbf) r3
            r3.getClass()
            long r7 = r26.getEventTime()
            int r5 = r3.d
            long[] r9 = r3.b
            if (r5 == 0) goto L_0x019b
            int r5 = r3.e
            r10 = r9[r5]
            long r10 = r7 - r10
            r12 = 40
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x019b
            r5 = 0
            r3.d = r5
            r5 = 0
            r3.c = r5
        L_0x019b:
            int r5 = r3.e
            r10 = 1
            int r5 = r5 + r10
            r11 = 20
            int r5 = r5 % r11
            r3.e = r5
            int r12 = r3.d
            if (r12 == r11) goto L_0x01ab
            int r12 = r12 + r10
            r3.d = r12
        L_0x01ab:
            r10 = 26
            float r1 = r1.getAxisValue(r10)
            float[] r10 = r3.a
            r10[r5] = r1
            int r1 = r3.e
            r9[r1] = r7
        L_0x01b9:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.computeCurrentVelocity(r1, r3)
            java.util.Map r5 = defpackage.wbf.a
            java.lang.Object r5 = r5.get(r2)
            xbf r5 = (defpackage.xbf) r5
            if (r5 == 0) goto L_0x02b5
            int r7 = r5.d
            r8 = 2
            if (r7 >= r8) goto L_0x01d5
        L_0x01d0:
            r23 = r4
            r3 = 0
            goto L_0x028c
        L_0x01d5:
            int r8 = r5.e
            r9 = 20
            int r10 = r8 + 20
            r11 = 1
            int r7 = r7 - r11
            int r10 = r10 - r7
            int r10 = r10 % r9
            long[] r7 = r5.b
            r8 = r7[r8]
        L_0x01e3:
            r11 = r7[r10]
            long r19 = r8 - r11
            r21 = 100
            int r13 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r13 <= 0) goto L_0x01f9
            int r11 = r5.d
            r13 = 1
            int r11 = r11 - r13
            r5.d = r11
            int r10 = r10 + r13
            r17 = 20
            int r10 = r10 % 20
            goto L_0x01e3
        L_0x01f9:
            r13 = 1
            r17 = 20
            int r8 = r5.d
            r9 = 2
            if (r8 >= r9) goto L_0x0202
            goto L_0x01d0
        L_0x0202:
            float[] r14 = r5.a
            if (r8 != r9) goto L_0x021b
            int r10 = r10 + r13
            int r10 = r10 % 20
            r7 = r7[r10]
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0210
            goto L_0x01d0
        L_0x0210:
            r9 = r14[r10]
            long r7 = r7 - r11
            float r7 = (float) r7
            float r7 = r9 / r7
            r23 = r4
            r3 = r7
            goto L_0x028c
        L_0x021b:
            r8 = 0
            r9 = 0
            r11 = 0
        L_0x021e:
            int r12 = r5.d
            r13 = 1
            int r12 = r12 - r13
            r16 = 1073741824(0x40000000, float:2.0)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 >= r12) goto L_0x0275
            int r12 = r9 + r10
            r17 = 20
            int r18 = r12 % 20
            r21 = r7[r18]
            int r12 = r12 + r13
            int r12 = r12 % 20
            r23 = r7[r12]
            int r18 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r18 != 0) goto L_0x023f
            r23 = r4
            r4 = r13
            goto L_0x026e
        L_0x023f:
            int r11 = r11 + r13
            r13 = 0
            int r23 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r23 >= 0) goto L_0x0247
            r19 = r20
        L_0x0247:
            float r13 = java.lang.Math.abs(r8)
            float r13 = r13 * r16
            r23 = r4
            double r3 = (double) r13
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r19 = r19 * r3
            r3 = r14[r12]
            r12 = r7[r12]
            long r12 = r12 - r21
            float r4 = (float) r12
            float r3 = r3 / r4
            float r4 = r3 - r19
            float r3 = java.lang.Math.abs(r3)
            float r3 = r3 * r4
            float r3 = r3 + r8
            r4 = 1
            if (r11 != r4) goto L_0x026d
            r8 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r8
        L_0x026d:
            r8 = r3
        L_0x026e:
            int r9 = r9 + r4
            r4 = r23
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x021e
        L_0x0275:
            r23 = r4
            r3 = 0
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x027e
            r19 = r20
        L_0x027e:
            float r3 = java.lang.Math.abs(r8)
            float r3 = r3 * r16
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r3 = r3 * r19
        L_0x028c:
            float r1 = (float) r1
            float r3 = r3 * r1
            r5.c = r3
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r4 = java.lang.Math.abs(r1)
            float r4 = -r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x02a4
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
            r5.c = r1
            goto L_0x02b7
        L_0x02a4:
            float r3 = r5.c
            float r4 = java.lang.Math.abs(r1)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x02b7
            float r1 = java.lang.Math.abs(r1)
            r5.c = r1
            goto L_0x02b7
        L_0x02b5:
            r23 = r4
        L_0x02b7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 < r3) goto L_0x02c4
            r4 = r23
            float r1 = defpackage.vbf.a(r2, r4)
            goto L_0x02e8
        L_0x02c4:
            r4 = r23
            if (r4 != 0) goto L_0x02cd
            float r1 = r2.getXVelocity()
            goto L_0x02e8
        L_0x02cd:
            r1 = 1
            if (r4 != r1) goto L_0x02d5
            float r1 = r2.getYVelocity()
            goto L_0x02e8
        L_0x02d5:
            java.util.Map r1 = defpackage.wbf.a
            java.lang.Object r1 = r1.get(r2)
            xbf r1 = (defpackage.xbf) r1
            if (r1 == 0) goto L_0x02e7
            r2 = 26
            if (r4 == r2) goto L_0x02e4
            goto L_0x02e7
        L_0x02e4:
            float r1 = r1.c
            goto L_0x02e8
        L_0x02e7:
            r1 = 0
        L_0x02e8:
            wmc r2 = r0.b
            java.lang.Object r3 = r2.a
            androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
            float r3 = r3.getVerticalScrollFactorCompat()
            float r3 = -r3
            float r1 = r1 * r3
            float r3 = java.lang.Math.signum(r1)
            java.lang.Object r2 = r2.a
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            if (r6 != 0) goto L_0x030d
            float r4 = r0.f
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0312
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0312
        L_0x030d:
            android.widget.OverScroller r3 = r2.o
            r3.abortAnimation()
        L_0x0312:
            float r3 = java.lang.Math.abs(r1)
            r4 = 0
            r4 = r15[r4]
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x031f
            goto L_0x0340
        L_0x031f:
            r3 = 1
            r4 = r15[r3]
            int r3 = -r4
            float r3 = (float) r3
            float r4 = (float) r4
            float r1 = java.lang.Math.min(r1, r4)
            float r1 = java.lang.Math.max(r3, r1)
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0334
            r7 = r3
            goto L_0x033e
        L_0x0334:
            android.widget.OverScroller r3 = r2.o
            r3.abortAnimation()
            int r3 = (int) r1
            r2.e(r3)
            r7 = r1
        L_0x033e:
            r0.f = r7
        L_0x0340:
            r0 = 1
            goto L_0x0343
        L_0x0342:
            r0 = r3
        L_0x0343:
            return r0
        L_0x0344:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.y0) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.F0;
                    if (!(i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1)) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.u0) > this.C0 && (2 & getNestedScrollAxes()) == 0) {
                            this.y0 = true;
                            this.u0 = y;
                            if (this.z0 == null) {
                                this.z0 = VelocityTracker.obtain();
                            }
                            this.z0.addMovement(motionEvent);
                            this.I0 = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        p(motionEvent);
                    }
                }
            }
            this.y0 = false;
            this.F0 = -1;
            VelocityTracker velocityTracker = this.z0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.z0 = null;
            }
            if (this.o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            a(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.u0 = y2;
                    this.F0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.z0;
                    if (velocityTracker2 == null) {
                        this.z0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.z0.addMovement(motionEvent);
                    this.o.computeScrollOffset();
                    if (!x(motionEvent) && this.o.isFinished()) {
                        z = false;
                    }
                    this.y0 = z;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && this.o.isFinished()) {
                z = false;
            }
            this.y0 = z;
            VelocityTracker velocityTracker3 = this.z0;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.z0 = null;
            }
        }
        return this.y0;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.v0 = false;
        View view = this.x0;
        if (view != null && g(view, this)) {
            View view2 = this.x0;
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c2 = c(rect);
            if (c2 != 0) {
                scrollBy(0, c2);
            }
        }
        this.x0 = null;
        if (!this.w0) {
            if (this.K0 != null) {
                scrollTo(getScrollX(), this.K0.a);
                this.K0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.w0 = true;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        e((int) f2);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.M0.b(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.M0.c(i, i2, 0, iArr, (int[]) null);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        o(i4, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        l(view, view2, i, 0);
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !(!h(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof gn9)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gn9 gn9 = (gn9) parcelable;
        super.onRestoreInstanceState(gn9.getSuperState());
        this.K0 = gn9;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, gn9, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = getScrollY();
        return baseSavedState;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && h(findFocus, 0, i4)) {
            Rect rect = this.c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int c2 = c(rect);
            if (c2 == 0) {
                return;
            }
            if (this.B0) {
                v(0, c2, false);
            } else {
                scrollBy(0, c2);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return k(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        m(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.z0 == null) {
            this.z0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, (float) this.I0);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.t0;
            EdgeEffect edgeEffect2 = this.s0;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.z0;
                velocityTracker.computeCurrentVelocity(1000, (float) this.E0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.F0);
                if (Math.abs(yVelocity) >= this.D0) {
                    if (kp.k(edgeEffect2) != 0.0f) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            e(-yVelocity);
                        }
                    } else if (kp.k(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (u(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            e(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = (float) i2;
                        if (!this.M0.b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            e(i2);
                        }
                    }
                } else if (this.o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.F0 = -1;
                this.y0 = false;
                VelocityTracker velocityTracker2 = this.z0;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.z0 = null;
                }
                a(0);
                this.s0.onRelease();
                this.t0.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.F0);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.u0 - y;
                    float x = motionEvent2.getX(findPointerIndex) / ((float) getWidth());
                    float height = ((float) i3) / ((float) getHeight());
                    if (kp.k(edgeEffect2) != 0.0f) {
                        float f3 = -kp.q(edgeEffect2, -height, x);
                        if (kp.k(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (kp.k(edgeEffect) != 0.0f) {
                        float q = kp.q(edgeEffect, height, 1.0f - x);
                        if (kp.k(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = q;
                    }
                    int round = Math.round(f * ((float) getHeight()));
                    if (round != 0) {
                        invalidate();
                    }
                    int i4 = i3 - round;
                    if (!this.y0 && Math.abs(i4) > this.C0) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.y0 = true;
                        i4 = i4 > 0 ? i4 - this.C0 : i4 + this.C0;
                    }
                    if (this.y0) {
                        int t = t(i4, (int) motionEvent2.getX(findPointerIndex), 0, false);
                        this.u0 = y - t;
                        this.I0 += t;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.y0 && getChildCount() > 0 && this.o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.F0 = -1;
                this.y0 = false;
                VelocityTracker velocityTracker3 = this.z0;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.z0 = null;
                }
                a(0);
                this.s0.onRelease();
                this.t0.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.u0 = (int) motionEvent2.getY(actionIndex);
                this.F0 = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.u0 = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.F0));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.y0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.o.isFinished()) {
                this.o.abortAnimation();
                a(1);
            }
            int pointerId = motionEvent2.getPointerId(0);
            this.u0 = (int) motionEvent.getY();
            this.F0 = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.z0;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.u0 = (int) motionEvent.getY(i);
            this.F0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.z0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i2 = 0;
            z = true;
        }
        if (i5 <= i4) {
            if (i5 < 0) {
                i4 = 0;
            } else {
                i4 = i5;
                z2 = false;
                if (z2 && !this.M0.g(1)) {
                    this.o.springBack(i2, i4, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i2, i4);
                return z || z2;
            }
        }
        z2 = true;
        this.o.springBack(i2, i4, 0, 0, 0, getScrollRange());
        super.scrollTo(i2, i4);
        if (z) {
            return true;
        }
    }

    public final void r(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.c;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        s(i, i2, i3);
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.v0) {
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c2 = c(rect);
            if (c2 != 0) {
                scrollBy(0, c2);
            }
        } else {
            this.x0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int c2 = c(rect);
        boolean z2 = c2 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, c2);
            } else {
                v(0, c2, false);
            }
        }
        return z2;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.z0) != null) {
            velocityTracker.recycle();
            this.z0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.v0 = true;
        super.requestLayout();
    }

    public final boolean s(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z2 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z4 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            t(z2 ? i5 - scrollY : i6 - i7, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.A0) {
            this.A0 = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        jn9 jn9 = this.M0;
        if (jn9.d) {
            WeakHashMap weakHashMap = zmf.a;
            omf.z(jn9.c);
        }
        jn9.d = z;
    }

    public void setOnScrollChangeListener(en9 en9) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.B0 = z;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return this.M0.h(i, 0);
    }

    public final void stopNestedScroll() {
        a(0);
    }

    public final int t(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        VelocityTracker velocityTracker;
        int i6 = i2;
        int i7 = i3;
        if (i7 == 1) {
            w(2, i7);
        }
        boolean c2 = this.M0.c(0, i, i3, this.H0, this.G0);
        int[] iArr = this.H0;
        int[] iArr2 = this.G0;
        if (c2) {
            i5 = i - iArr[1];
            i4 = iArr2[1];
        } else {
            i5 = i;
            i4 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = q(i5, 0, scrollY, scrollRange) && !this.M0.g(i7);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        int i8 = scrollRange;
        this.M0.e(0, scrollY2, 0, i5 - scrollY2, this.G0, i3, iArr);
        int i9 = i4 + iArr2[1];
        int i10 = i5 - iArr[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.t0;
        EdgeEffect edgeEffect2 = this.s0;
        if (i11 < 0) {
            if (z3) {
                kp.q(edgeEffect2, ((float) (-i10)) / ((float) getHeight()), ((float) i6) / ((float) getWidth()));
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > i8 && z3) {
            kp.q(edgeEffect, ((float) i10) / ((float) getHeight()), 1.0f - (((float) i6) / ((float) getWidth())));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z2 = false;
        } else {
            z2 = z4;
        }
        if (z2 && i7 == 0 && (velocityTracker = this.z0) != null) {
            velocityTracker.clear();
        }
        if (i7 == 1) {
            a(i7);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i9;
    }

    public final boolean u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float k = kp.k(edgeEffect) * ((float) getHeight());
        float f = this.a * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) P0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < k;
    }

    public final void v(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.o;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z) {
                    w(2, 1);
                } else {
                    a(1);
                }
                this.J0 = getScrollY();
                postInvalidateOnAnimation();
            } else {
                if (!this.o.isFinished()) {
                    this.o.abortAnimation();
                    a(1);
                }
                scrollBy(i, i2);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void w(int i, int i2) {
        this.M0.h(2, i2);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.s0;
        if (kp.k(edgeEffect) != 0.0f) {
            kp.q(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.t0;
        if (kp.k(edgeEffect2) == 0.0f) {
            return z;
        }
        kp.q(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
