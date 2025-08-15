package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.ok.messages.views.widgets.ContextMenuGridLayout;

/* renamed from: hg6  reason: default package */
public abstract class hg6 extends ViewGroup {
    public static final int A0 = n3c.GridLayout_columnCount;
    public static final int B0 = n3c.GridLayout_useDefaultMargins;
    public static final int C0 = n3c.GridLayout_alignmentMode;
    public static final int D0 = n3c.GridLayout_rowOrderPreserved;
    public static final int E0 = n3c.GridLayout_columnOrderPreserved;
    public static final wf6 F0 = new wf6(0);
    public static final wf6 G0;
    public static final wf6 H0;
    public static final wf6 I0;
    public static final wf6 J0;
    public static final xf6 K0;
    public static final xf6 L0;
    public static final wf6 M0 = new wf6(3);
    public static final wf6 N0 = new wf6(4);
    public static final wf6 O0 = new wf6(5);
    public static final LogPrinter w0 = new LogPrinter(3, hg6.class.getName());
    public static final vf6 x0 = new Object();
    public static final int y0 = n3c.GridLayout_orientation;
    public static final int z0 = n3c.GridLayout_rowCount;
    public final bg6 a;
    public final bg6 b;
    public int c = 0;
    public boolean o = false;
    public int s0 = 1;
    public final int t0;
    public int u0 = 0;
    public Printer v0 = w0;

    /* JADX WARNING: type inference failed for: r0v1, types: [vf6, java.lang.Object] */
    static {
        wf6 wf6 = new wf6(1);
        wf6 wf62 = new wf6(2);
        G0 = wf6;
        H0 = wf62;
        I0 = wf6;
        J0 = wf62;
        K0 = new xf6(wf6, wf62);
        L0 = new xf6(wf62, wf6);
    }

    public hg6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ContextMenuGridLayout contextMenuGridLayout = (ContextMenuGridLayout) this;
        this.a = new bg6(contextMenuGridLayout, true);
        this.b = new bg6(contextMenuGridLayout, false);
        this.t0 = context.getResources().getDimensionPixelOffset(ptb.default_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n3c.GridLayout);
        try {
            setRowCount(obtainStyledAttributes.getInt(z0, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(A0, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(y0, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(B0, false));
            setAlignmentMode(obtainStyledAttributes.getInt(C0, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(D0, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(E0, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ote d(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        return i2 != 1 ? i2 != 3 ? i2 != 5 ? i2 != 7 ? i2 != 8388611 ? i2 != 8388613 ? F0 : J0 : I0 : O0 : z ? L0 : H0 : z ? K0 : G0 : M0;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(au1.g(str, ". "));
    }

    public static void k(eg6 eg6, int i, int i2, int i3, int i4) {
        dg6 dg6 = new dg6(i, i2 + i);
        gg6 gg6 = eg6.a;
        eg6.a = new gg6(gg6.a, dg6, gg6.c, gg6.d);
        dg6 dg62 = new dg6(i3, i4 + i3);
        gg6 gg62 = eg6.b;
        eg6.b = new gg6(gg62.a, dg62, gg62.c, gg62.d);
    }

    public static gg6 l(int i, int i2, ote ote, float f) {
        return new gg6(i != Integer.MIN_VALUE, new dg6(i, i2 + i), ote, f);
    }

    public final void a(eg6 eg6, boolean z) {
        String str = z ? "column" : "row";
        dg6 dg6 = (z ? eg6.b : eg6.a).b;
        int i = dg6.a;
        if (i == Integer.MIN_VALUE || i >= 0) {
            int i2 = (z ? this.a : this.b).b;
            if (i2 == Integer.MIN_VALUE) {
                return;
            }
            if (dg6.b > i2) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            } else if (dg6.a() > i2) {
                g(str + " span mustn't exceed the " + str + " count");
                throw null;
            }
        } else {
            g(str.concat(" indices must be positive"));
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = ((eg6) childAt.getLayoutParams()).hashCode() + (i * 31);
            }
        }
        return i;
    }

    public final void c() {
        int i = this.u0;
        if (i == 0) {
            boolean z = this.c == 0;
            int i2 = (z ? this.a : this.b).b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            int[] iArr = new int[i2];
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                eg6 eg6 = (eg6) getChildAt(i5).getLayoutParams();
                gg6 gg6 = z ? eg6.a : eg6.b;
                dg6 dg6 = gg6.b;
                int a2 = dg6.a();
                boolean z2 = gg6.a;
                if (z2) {
                    i3 = dg6.a;
                }
                gg6 gg62 = z ? eg6.b : eg6.a;
                dg6 dg62 = gg62.b;
                int a3 = dg62.a();
                boolean z3 = gg62.a;
                int i6 = dg62.a;
                if (i2 != 0) {
                    a3 = Math.min(a3, i2 - (z3 ? Math.min(i6, i2) : 0));
                }
                if (z3) {
                    i4 = i6;
                }
                if (i2 != 0) {
                    if (!z2 || !z3) {
                        while (true) {
                            int i7 = i4 + a3;
                            if (i7 <= i2) {
                                int i8 = i4;
                                while (i8 < i7) {
                                    if (iArr[i8] <= i3) {
                                        i8++;
                                    }
                                }
                                break;
                            }
                            if (z3) {
                                i3++;
                            } else if (i7 <= i2) {
                                i4++;
                            } else {
                                i3++;
                                i4 = 0;
                            }
                        }
                    }
                    Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + a3, i2), i3 + a2);
                }
                if (z) {
                    k(eg6, i3, a2, i4, a3);
                } else {
                    k(eg6, i4, a3, i3, a2);
                }
                i4 += a3;
            }
            this.u0 = b();
        } else if (i != b()) {
            this.v0.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            h();
            c();
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof eg6)) {
            return false;
        }
        eg6 eg6 = (eg6) layoutParams;
        a(eg6, true);
        a(eg6, false);
        return true;
    }

    public final int e(View view, boolean z, boolean z2) {
        int[] iArr;
        if (this.s0 == 1) {
            return f(view, z, z2);
        }
        bg6 bg6 = z ? this.a : this.b;
        if (z2) {
            if (bg6.j == null) {
                bg6.j = new int[(bg6.f() + 1)];
            }
            if (!bg6.k) {
                bg6.c(true);
                bg6.k = true;
            }
            iArr = bg6.j;
        } else {
            if (bg6.l == null) {
                bg6.l = new int[(bg6.f() + 1)];
            }
            if (!bg6.m) {
                bg6.c(false);
                bg6.m = true;
            }
            iArr = bg6.l;
        }
        eg6 eg6 = (eg6) view.getLayoutParams();
        dg6 dg6 = (z ? eg6.b : eg6.a).b;
        return iArr[z2 ? dg6.a : dg6.b];
    }

    public final int f(View view, boolean z, boolean z2) {
        eg6 eg6 = (eg6) view.getLayoutParams();
        int i = z ? z2 ? eg6.leftMargin : eg6.rightMargin : z2 ? eg6.topMargin : eg6.bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int i2 = 0;
        if (this.o) {
            gg6 gg6 = z ? eg6.b : eg6.a;
            bg6 bg6 = z ? this.a : this.b;
            dg6 dg6 = gg6.b;
            if (z) {
                WeakHashMap weakHashMap = zmf.a;
                if (getLayoutDirection() == 1) {
                    z2 = !z2;
                }
            }
            if (z2) {
                int i3 = dg6.a;
            } else {
                int i4 = dg6.b;
                bg6.f();
            }
            if (!(view.getClass() == avd.class || view.getClass() == Space.class)) {
                i2 = this.t0 / 2;
            }
        }
        return i2;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new eg6();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v0, types: [eg6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        gg6 gg6 = gg6.e;
        marginLayoutParams.a = gg6;
        marginLayoutParams.b = gg6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n3c.GridLayout_Layout);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(eg6.d, Integer.MIN_VALUE);
            marginLayoutParams.leftMargin = obtainStyledAttributes.getDimensionPixelSize(eg6.e, dimensionPixelSize);
            marginLayoutParams.topMargin = obtainStyledAttributes.getDimensionPixelSize(eg6.f, dimensionPixelSize);
            marginLayoutParams.rightMargin = obtainStyledAttributes.getDimensionPixelSize(eg6.g, dimensionPixelSize);
            marginLayoutParams.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(eg6.h, dimensionPixelSize);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, n3c.GridLayout_Layout);
            try {
                int i = obtainStyledAttributes2.getInt(eg6.o, 0);
                int i2 = obtainStyledAttributes2.getInt(eg6.i, Integer.MIN_VALUE);
                int i3 = eg6.j;
                int i4 = eg6.c;
                marginLayoutParams.b = l(i2, obtainStyledAttributes2.getInt(i3, i4), d(i, true), obtainStyledAttributes2.getFloat(eg6.k, 0.0f));
                marginLayoutParams.a = l(obtainStyledAttributes2.getInt(eg6.l, Integer.MIN_VALUE), obtainStyledAttributes2.getInt(eg6.m, i4), d(i, false), obtainStyledAttributes2.getFloat(eg6.n, 0.0f));
                return marginLayoutParams;
            } finally {
                obtainStyledAttributes2.recycle();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int getAlignmentMode() {
        return this.s0;
    }

    public int getColumnCount() {
        return this.a.f();
    }

    public int getOrientation() {
        return this.c;
    }

    public Printer getPrinter() {
        return this.v0;
    }

    public int getRowCount() {
        return this.b.f();
    }

    public boolean getUseDefaultMargins() {
        return this.o;
    }

    public final void h() {
        this.u0 = 0;
        bg6 bg6 = this.a;
        if (bg6 != null) {
            bg6.l();
        }
        bg6 bg62 = this.b;
        if (bg62 != null) {
            bg62.l();
        }
        if (bg6 != null && bg62 != null) {
            bg6.m();
            bg62.m();
        }
    }

    public final void i(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, e(view, true, false) + e(view, true, true), i3), ViewGroup.getChildMeasureSpec(i2, e(view, false, false) + e(view, false, true), i4));
    }

    public final void j(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                eg6 eg6 = (eg6) childAt.getLayoutParams();
                if (z) {
                    i(childAt, i, i2, eg6.width, eg6.height);
                } else {
                    boolean z2 = this.c == 0;
                    gg6 gg6 = z2 ? eg6.b : eg6.a;
                    if (gg6.a(z2) == O0) {
                        int[] h = (z2 ? this.a : this.b).h();
                        dg6 dg6 = gg6.b;
                        int e = (h[dg6.b] - h[dg6.a]) - (e(childAt, z2, false) + e(childAt, z2, true));
                        if (z2) {
                            i(childAt, i, i2, e, eg6.height);
                        } else {
                            i(childAt, i, i2, eg6.width, e);
                        }
                    }
                }
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bg6 bg6;
        bg6 bg62;
        int i5;
        boolean z2;
        int i6;
        View view;
        hg6 hg6 = this;
        c();
        int i7 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i8 = (i7 - paddingLeft) - paddingRight;
        bg6 bg63 = hg6.a;
        bg63.v.a = i8;
        bg63.w.a = -i8;
        boolean z3 = false;
        bg63.q = false;
        bg63.h();
        int i9 = ((i4 - i2) - paddingTop) - paddingBottom;
        bg6 bg64 = hg6.b;
        bg64.v.a = i9;
        bg64.w.a = -i9;
        bg64.q = false;
        bg64.h();
        int[] h = bg63.h();
        int[] h2 = bg64.h();
        int i10 = 0;
        for (int childCount = getChildCount(); i10 < childCount; childCount = i6) {
            View childAt = hg6.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                i5 = i10;
                i6 = childCount;
                bg6 = bg63;
                z2 = z3;
                bg62 = bg64;
            } else {
                eg6 eg6 = (eg6) childAt.getLayoutParams();
                gg6 gg6 = eg6.b;
                gg6 gg62 = eg6.a;
                dg6 dg6 = gg6.b;
                dg6 dg62 = gg62.b;
                int i11 = h[dg6.a];
                int i12 = childCount;
                int i13 = h2[dg62.a];
                int i14 = h[dg6.b] - i11;
                int i15 = h2[dg62.b] - i13;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ote a2 = gg6.a(true);
                ote a3 = gg62.a(false);
                nw4 g = bg63.g();
                bg6 = bg63;
                cg6 cg6 = (cg6) ((Object[]) g.o)[((int[]) g.b)[i10]];
                nw4 g2 = bg64.g();
                bg62 = bg64;
                cg6 cg62 = (cg6) ((Object[]) g2.o)[((int[]) g2.b)[i10]];
                int r = a2.r(childAt, i14 - cg6.d(true));
                int r2 = a3.r(childAt, i15 - cg62.d(true));
                int e = hg6.e(childAt, true, true);
                int e2 = hg6.e(childAt, false, true);
                int e3 = hg6.e(childAt, true, false);
                int i16 = e + e3;
                int e4 = e2 + hg6.e(childAt, false, false);
                ote ote = a3;
                cg6 cg63 = cg6;
                ote ote2 = a2;
                int i17 = measuredHeight;
                ote ote3 = ote2;
                View view2 = childAt;
                i5 = i10;
                z2 = false;
                i6 = i12;
                int i18 = measuredWidth;
                int a4 = cg63.a(this, childAt, ote3, measuredWidth + i16, true);
                int i19 = i17;
                ote ote4 = ote;
                int a5 = cg62.a(this, view2, ote4, i19 + e4, false);
                int v = ote3.v(i18, i14 - i16);
                int v2 = ote4.v(i19, i15 - e4);
                int i20 = i11 + r + a4;
                WeakHashMap weakHashMap = zmf.a;
                int i21 = getLayoutDirection() == 1 ? (((i7 - v) - paddingRight) - e3) - i20 : paddingLeft + e + i20;
                int i22 = paddingTop + i13 + r2 + a5 + e2;
                if (v == view2.getMeasuredWidth() && v2 == view2.getMeasuredHeight()) {
                    view = view2;
                } else {
                    view = view2;
                    view.measure(View.MeasureSpec.makeMeasureSpec(v, 1073741824), View.MeasureSpec.makeMeasureSpec(v2, 1073741824));
                }
                view.layout(i21, i22, v + i21, v2 + i22);
            }
            i10 = i5 + 1;
            hg6 = this;
            bg63 = bg6;
            bg64 = bg62;
            z3 = z2;
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        c();
        bg6 bg6 = this.b;
        bg6 bg62 = this.a;
        if (!(bg62 == null || bg6 == null)) {
            bg62.m();
            bg6.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i2), View.MeasureSpec.getMode(i2));
        j(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.c == 0) {
            i3 = bg62.j(makeMeasureSpec);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            i4 = bg6.j(makeMeasureSpec2);
        } else {
            i4 = bg6.j(makeMeasureSpec2);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            i3 = bg62.j(makeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i4 + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
    }

    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public void setAlignmentMode(int i) {
        this.s0 = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.a.o(i);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        bg6 bg6 = this.a;
        bg6.u = z;
        bg6.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.c != i) {
            this.c = i;
            h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = x0;
        }
        this.v0 = printer;
    }

    public void setRowCount(int i) {
        this.b.o(i);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        bg6 bg6 = this.b;
        bg6.u = z;
        bg6.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.o = z;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [eg6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r1v4, types: [eg6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r1v5, types: [eg6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof eg6) {
            eg6 eg6 = (eg6) layoutParams;
            ? marginLayoutParams = new ViewGroup.MarginLayoutParams(eg6);
            gg6 gg6 = gg6.e;
            marginLayoutParams.a = gg6;
            marginLayoutParams.b = gg6;
            marginLayoutParams.a = eg6.a;
            marginLayoutParams.b = eg6.b;
            return marginLayoutParams;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            gg6 gg62 = gg6.e;
            marginLayoutParams2.a = gg62;
            marginLayoutParams2.b = gg62;
            return marginLayoutParams2;
        } else {
            ? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);
            gg6 gg63 = gg6.e;
            marginLayoutParams3.a = gg63;
            marginLayoutParams3.b = gg63;
            return marginLayoutParams3;
        }
    }
}
