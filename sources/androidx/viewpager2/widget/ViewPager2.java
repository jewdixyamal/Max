package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class ViewPager2 extends ViewGroup {
    public lh0 A0;
    public jb5 B0;
    public gpa C0;
    public mdc D0 = null;
    public boolean E0 = false;
    public boolean F0 = true;
    public int G0 = -1;
    public m5d H0;
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final lh0 c = new lh0();
    public int o;
    public boolean s0 = false;
    public final iof t0 = new iof(0, this);
    public lof u0;
    public int v0 = -1;
    public Parcelable w0;
    public rof x0;
    public qof y0;
    public vwc z0;

    public ViewPager2(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r12v2, types: [qdc, java.lang.Object] */
    public final void a(Context context, AttributeSet attributeSet) {
        this.H0 = new m5d(this);
        rof rof = new rof(this, context);
        this.x0 = rof;
        rof.setId(View.generateViewId());
        this.x0.setDescendantFocusability(131072);
        lof lof = new lof(this);
        this.u0 = lof;
        this.x0.setLayoutManager(lof);
        this.x0.setScrollingTouchSlop(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v2c.ViewPager2);
        int[] iArr = v2c.ViewPager2;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(v2c.ViewPager2_android_orientation, 0));
            obtainStyledAttributes.recycle();
            this.x0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.x0.k(new Object());
            vwc vwc = new vwc(this);
            this.z0 = vwc;
            this.B0 = new jb5(this, vwc, this.x0);
            qof qof = new qof(this);
            this.y0 = qof;
            qof.a(this.x0);
            this.x0.m(this.z0);
            lh0 lh0 = new lh0();
            this.A0 = lh0;
            this.z0.a = lh0;
            jof jof = new jof(this, 0);
            jof jof2 = new jof(this, 1);
            ((ArrayList) lh0.b).add(jof);
            ((ArrayList) this.A0.b).add(jof2);
            this.H0.J(this.x0);
            lh0 lh02 = this.A0;
            ((ArrayList) lh02.b).add(this.c);
            gpa gpa = new gpa(this.u0);
            this.C0 = gpa;
            ((ArrayList) this.A0.b).add(gpa);
            rof rof2 = this.x0;
            attachViewToParent(rof2, 0, rof2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(mof mof) {
        ((ArrayList) this.c.b).add(mof);
    }

    public final void c() {
        if (this.C0.b != null) {
            vwc vwc = this.z0;
            vwc.g();
            uwc uwc = vwc.g;
            double d = ((double) uwc.b) + ((double) uwc.a);
            int i = (int) d;
            float f = (float) (d - ((double) i));
            this.C0.b(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return this.x0.canScrollHorizontally(i);
    }

    public final boolean canScrollVertically(int i) {
        return this.x0.canScrollVertically(i);
    }

    public final void d() {
        hdc adapter;
        if (this.v0 != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.w0;
            if (parcelable != null) {
                if (adapter instanceof v0e) {
                    ((v0e) adapter).c(parcelable);
                }
                this.w0 = null;
            }
            int max = Math.max(0, Math.min(this.v0, adapter.j() - 1));
            this.o = max;
            this.v0 = -1;
            this.x0.x0(max);
            this.H0.M();
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof sof) {
            int i = ((sof) parcelable).a;
            sparseArray.put(this.x0.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i, boolean z) {
        if (!this.B0.b.m) {
            f(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void f(int i, boolean z) {
        hdc adapter = getAdapter();
        boolean z2 = false;
        if (adapter == null) {
            if (this.v0 != -1) {
                this.v0 = Math.max(i, 0);
            }
        } else if (adapter.j() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.j() - 1);
            int i2 = this.o;
            if (min != i2 || this.z0.f != 0) {
                if (min != i2 || !z) {
                    double d = (double) i2;
                    this.o = min;
                    this.H0.M();
                    vwc vwc = this.z0;
                    if (vwc.f != 0) {
                        vwc.g();
                        uwc uwc = vwc.g;
                        d = ((double) uwc.b) + ((double) uwc.a);
                    }
                    vwc vwc2 = this.z0;
                    vwc2.getClass();
                    vwc2.e = z ? 2 : 3;
                    vwc2.m = false;
                    if (vwc2.i != min) {
                        z2 = true;
                    }
                    vwc2.i = min;
                    vwc2.d(2);
                    if (z2) {
                        vwc2.c(min);
                    }
                    if (!z) {
                        this.x0.x0(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        this.x0.x0(d2 > d ? min - 3 : min + 3);
                        rof rof = this.x0;
                        rof.post(new zj0(rof, min));
                        return;
                    }
                    this.x0.B0(min);
                }
            }
        }
    }

    public final void g(mof mof) {
        ((ArrayList) this.c.b).remove(mof);
    }

    public CharSequence getAccessibilityClassName() {
        this.H0.getClass();
        this.H0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public hdc getAdapter() {
        return this.x0.getAdapter();
    }

    public int getCurrentItem() {
        return this.o;
    }

    public int getItemDecorationCount() {
        return this.x0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.G0;
    }

    public int getOrientation() {
        return this.u0.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        rof rof = this.x0;
        if (getOrientation() == 0) {
            height = rof.getWidth() - rof.getPaddingLeft();
            paddingBottom = rof.getPaddingRight();
        } else {
            height = rof.getHeight() - rof.getPaddingTop();
            paddingBottom = rof.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.z0.f;
    }

    public final void h() {
        qof qof = this.y0;
        if (qof != null) {
            View i = qof.i(this.u0);
            if (i != null) {
                this.u0.getClass();
                int M = a.M(i);
                if (M != this.o && getScrollState() == 0) {
                    this.A0.c(M);
                }
                this.s0 = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int j;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.H0.X;
        if (viewPager2.getAdapter() == null) {
            i2 = 0;
            i = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i2 = viewPager2.getAdapter().j();
            i = 1;
        } else {
            i = viewPager2.getAdapter().j();
            i2 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.a(i2, i, 0).a);
        hdc adapter = viewPager2.getAdapter();
        if (adapter != null && (j = adapter.j()) != 0 && viewPager2.F0) {
            if (viewPager2.o > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.o < j - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.x0.getMeasuredWidth();
        int measuredHeight = this.x0.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.x0.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.s0) {
            h();
        }
    }

    public final void onMeasure(int i, int i2) {
        measureChild(this.x0, i, i2);
        int measuredWidth = this.x0.getMeasuredWidth();
        int measuredHeight = this.x0.getMeasuredHeight();
        int measuredState = this.x0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sof)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sof sof = (sof) parcelable;
        super.onRestoreInstanceState(sof.getSuperState());
        this.v0 = sof.b;
        this.w0 = sof.c;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, sof] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = this.x0.getId();
        int i = this.v0;
        if (i == -1) {
            i = this.o;
        }
        baseSavedState.b = i;
        Parcelable parcelable = this.w0;
        if (parcelable != null) {
            baseSavedState.c = parcelable;
        } else {
            hdc adapter = this.x0.getAdapter();
            if (adapter instanceof v0e) {
                baseSavedState.c = ((v0e) adapter).a();
            }
        }
        return baseSavedState;
    }

    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.H0.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        m5d m5d = this.H0;
        m5d.getClass();
        if (i == 8192 || i == 4096) {
            ViewPager2 viewPager2 = (ViewPager2) m5d.X;
            int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
            if (viewPager2.F0) {
                viewPager2.f(currentItem, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    public void setAdapter(hdc hdc) {
        hdc adapter = this.x0.getAdapter();
        m5d m5d = this.H0;
        if (adapter != null) {
            adapter.B((iof) m5d.o);
        } else {
            m5d.getClass();
        }
        iof iof = this.t0;
        if (adapter != null) {
            adapter.B(iof);
        }
        this.x0.setAdapter(hdc);
        this.o = 0;
        d();
        m5d m5d2 = this.H0;
        m5d2.M();
        if (hdc != null) {
            hdc.z((iof) m5d2.o);
        }
        if (hdc != null) {
            hdc.z(iof);
        }
    }

    public void setCurrentItem(int i) {
        e(i, true);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.H0.M();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.G0 = i;
            this.x0.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.u0.o1(i);
        this.H0.M();
    }

    public void setPageTransformer(pof pof) {
        if (pof != null) {
            if (!this.E0) {
                this.D0 = this.x0.getItemAnimator();
                this.E0 = true;
            }
            this.x0.setItemAnimator((mdc) null);
        } else if (this.E0) {
            this.x0.setItemAnimator(this.D0);
            this.D0 = null;
            this.E0 = false;
        }
        gpa gpa = this.C0;
        if (pof != gpa.b) {
            gpa.b = pof;
            c();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.F0 = z;
        this.H0.M();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }
}
